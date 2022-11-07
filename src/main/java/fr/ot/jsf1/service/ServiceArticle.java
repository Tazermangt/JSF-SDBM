package fr.ot.jsf1.service;


import fr.ot.jsf1.dao.DaoFactory;
import fr.ot.jsf1.metier.*;

import java.util.ArrayList;
import java.util.List;


public class ServiceArticle {
    private ArrayList<Pays> paysFiltre;
    private ArrayList<Continent> continentFiltre;
    private ArrayList<Fabricant> fabricantFiltre;
    private ArrayList<Couleur> couleurFiltre;
    private ArrayList<Marque> marqueFiltre;
    private ArrayList<Type> typeFiltre;
    private ArrayList<Volume> volumesFiltre;

    public ServiceArticle() {
        paysFiltre = DaoFactory.getPaysDAO().getAll();
        paysFiltre.add(0, new Pays(0, "Choisir un Pays", new Continent()));

        continentFiltre = DaoFactory.getContinentDAO().getAll();
        continentFiltre.add(0, new Continent(0, "Choisir un Continent"));

        fabricantFiltre = DaoFactory.getFabricantDAO().getAll();
        fabricantFiltre.add(0, new Fabricant(0, "Choisir un Fabricant"));

        couleurFiltre = DaoFactory.getCouleurDAO().getAll();
        couleurFiltre.add(0, new Couleur(0, "Choisir une Couleur"));

        typeFiltre = DaoFactory.getTypeDAO().getAll();
        typeFiltre.add(0, new Type(0, "Choisir un Type"));

        volumesFiltre = DaoFactory.getArticleDAO().getVolume();
        volumesFiltre.add(0, new Volume(0, "Choisir un Volume"));

        marqueFiltre = DaoFactory.getMarqueDAO().getAll();
        marqueFiltre.add(0, new Marque(0, "Choisir une Marque"));
    }


    public List<Pays> getPaysFiltre() {
        return paysFiltre;
    }

    public List<Continent> getContinentFiltre() {
        return continentFiltre;
    }


    public List<Fabricant> getFabricantFiltre() {
        return fabricantFiltre;
    }

    public List<Article> getFilteredArticles(ArticleSearch articleSearch, int page) {
        return DaoFactory.getArticleDAO().getLike(articleSearch, page);
    }

    public List<Volume> getFilteredVolume() {
        return volumesFiltre;
    }

    public List<Couleur> getFilteredCouleur() {
        return couleurFiltre;
    }

    public ArrayList<Marque> getFilteredMarque() {
        return marqueFiltre;
    }

    public ArrayList<Type> getFilteredType() {
        return typeFiltre;
    }

}
