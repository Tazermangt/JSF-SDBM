package fr.ot.jsf1.Converter;

import fr.ot.jsf1.ArticleBean;
import fr.ot.jsf1.metier.Marque;
import fr.ot.jsf1.metier.Pays;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;

@FacesConverter(value = "paysConverter", managed = true)
public class PaysConverter implements Converter<Pays> {

    @Inject
    private ArticleBean articleBean;

    @Override
    public Pays getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s != null && s.trim().length() > 0) {
            for (Pays pays : articleBean.getPaysList()) {
                if (pays.getId() == Integer.parseInt(s)) {
                    return pays;
                }
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Pays pays) {
        return String.valueOf(pays.getId());
    }
}
