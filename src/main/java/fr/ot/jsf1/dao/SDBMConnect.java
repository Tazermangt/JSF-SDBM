package fr.ot.jsf1.dao;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;

public class SDBMConnect {
    // Declare the JDBC objects.
    private static Connection connexion;

    private SDBMConnect() {

    }

    public static Connection getInstance() {
        if (connexion == null) {
            try {
                SQLServerDataSource ds = new SQLServerDataSource();
                ds.setServerName("mysql");
                ds.setPortNumber(1433);
                ds.setDatabaseName("SDBM");
                ds.setIntegratedSecurity(false);
                ds.setEncrypt(false);
                ds.setUser("sa");
                ds.setPassword("azerty@123456");

                connexion = ds.getConnection();
            }

            // Handle any errors that may have occurred.
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connexion;
    }
}
