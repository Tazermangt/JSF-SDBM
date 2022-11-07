package fr.ot.jsf1;

import fr.ot.jsf1.metier.Continent;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;

@FacesConverter(value = "continentConverter", managed = true)
public class ContinentConverter implements Converter<Continent> {

    @Inject
    private ArticleBean articleBean;

    @Override
    public Continent getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s != null && s.trim().length() > 0) {
            for (Continent continent : articleBean.getContinentList()) {
                if (continent.getId() == Integer.parseInt(s)) {
                    return continent;
                }
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Continent continent) {
        return String.valueOf(continent.getId());
    }
}
