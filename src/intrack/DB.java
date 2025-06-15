
package intrack;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jinvkyen
 */
public class DB {
    private static final String DB_URL = "jdbc:sqlite:intrack.db";
    
    public static Connection connect() {
        Connection conn = null;
         try {
        File dbFile = new File("intrack.db");
        System.out.println("Using DB path: " + dbFile.getAbsolutePath());

        conn = DriverManager.getConnection(DB_URL);
        System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println("SQLite connection failed.");
            e.printStackTrace();
        }
    return conn;
    }
}
