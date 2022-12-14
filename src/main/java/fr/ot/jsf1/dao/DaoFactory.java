package fr.ot.jsf1.dao;

import java.sql.Connection;


public class DaoFactory {

    private DaoFactory() {

    }

    private static final Connection connexion = SDBMConnect.getInstance();

    public static ContinentDAO getContinentDAO() {
        return new ContinentDAO(connexion);
    }

    public static PaysDAO getPaysDAO() {
        return new PaysDAO(connexion);
    }

    public static FabricantDAO getFabricantDAO() {
        return new FabricantDAO(connexion);
    }

    public static MarqueDAO getMarqueDAO() {
        return new MarqueDAO(connexion);
    }

    public static ArticleDAO getArticleDAO() {
        return new ArticleDAO(connexion);
    }

    public static CouleurDAO getCouleurDAO() {
        return new CouleurDAO(connexion);
    }

    public static TypeDAO getTypeDAO() {
        return new TypeDAO(connexion);
    }

}
