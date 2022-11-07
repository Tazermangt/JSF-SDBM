package fr.ot.jsf1;

import fr.ot.jsf1.metier.Marque;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;
import jakarta.inject.Inject;

@FacesConverter(value = "marqueConverter", managed = true)
public class MarqueConverter implements Converter<Marque> {

    @Inject
    private ArticleBean articleBean;

    @Override
    public Marque getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        if (s != null && s.trim().length() > 0) {
            for (Marque marque : articleBean.getMarques()) {
                if (marque.getId() == Integer.parseInt(s)) {
                    return marque;
                }
            }
        }
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Marque marque) {
        return String.valueOf(marque.getId());
    }
}
