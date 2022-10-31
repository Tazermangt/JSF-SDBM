package fr.ot.jsf1;

import fr.ot.jsf1.metier.Article;
import fr.ot.jsf1.metier.Couleur;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;

@FacesConverter(value="articleConverter", managed=true)
public class ArticleConverter implements Converter<Article> {
    @Inject
    private ArticleBean articleBean;

    @Override
    public Article getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s != null && s.trim().length() > 0){
            for(Article article : articleBean.getAllArticle()){
                if(article.getId() == Integer.parseInt(s)){
                    return article;
                }
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Article article) {
        return String.valueOf(article.getId());
    }
}
