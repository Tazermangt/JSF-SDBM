package fr.ot.jsf1;

import fr.ot.jsf1.dao.DaoFactory;
import fr.ot.jsf1.metier.*;
import fr.ot.jsf1.service.ArticleSearch;
import fr.ot.jsf1.service.ServiceArticle;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("articleBean")
@SessionScoped
public class ArticleBean implements Serializable {
    private static List<Article> articles;
    private static List<Marque> marques;
    private static List<Pays> paysList;
    private static List<Continent> continentList;
    private Pays pays;
    private Continent continent;
    private Marque marque;
    private Fabricant fabricant;
    private Couleur couleur;
    private Type type;

    ServiceArticle sa;

    @PostConstruct
    private void init() {
        sa = new ServiceArticle();

        marques = sa.getFilteredMarque();

        paysList = sa.getPaysFiltre();

        continentList = sa.getContinentFiltre();

        search();
    }

    public void search() {
        ArticleSearch articleSearch = new ArticleSearch();

        if (marque != null) {
            articleSearch.setMarque(marque);
        }
        if (pays != null) {
            articleSearch.setPays(pays);
        }
        if (continent != null) {
            articleSearch.setContinent(continent);
        }
        articles = DaoFactory.getArticleDAO().getLike(articleSearch, 0);
    }

    public void reset() {
        paysList = sa.getPaysFiltre();

        continentList = sa.getContinentFiltre();

        pays = null;
        continent = null;
        marque = null;
        fabricant = null;
        couleur = null;
        type = null;
        search();
    }

    public void selectContinent() {
        if (continent != null && continent.getId() != 0) {
            paysList = DaoFactory.getPaysDAO().getByContinent(continent.getId());
            paysList.add(0, new Pays(0, "Choisir un Pays"));
        } else {
            paysList = sa.getPaysFiltre();
        }


        if (pays != null && pays.getContinent() != continent) {
            pays = null;
        }
    }

    public List<Article> getArticles() {
        return articles;
    }

    public List<Pays> getPaysList() {
        return paysList;
    }

    public List<Continent> getContinentList() {
        return continentList;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Fabricant getFabricant() {
        return fabricant;
    }

    public void setFabricant(Fabricant fabricant) {
        this.fabricant = fabricant;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Marque> getMarques() {
        return marques;
    }
}
