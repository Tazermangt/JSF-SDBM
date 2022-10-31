package fr.ot.jsf1;

import fr.ot.jsf1.dao.DaoFactory;
import fr.ot.jsf1.metier.Article;
import fr.ot.jsf1.metier.Couleur;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.component.html.HtmlSelectOneMenu;
import jakarta.faces.event.AjaxBehaviorEvent;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("articleBean")
@SessionScoped
public class ArticleBean implements Serializable {
    private static List<Article> allArticle;

    @PostConstruct
    private void init (){
        allArticle = DaoFactory.getArticleDAO().getAll();
    }

    public List<Article> getAllArticle() {
        return allArticle;
    }
}
