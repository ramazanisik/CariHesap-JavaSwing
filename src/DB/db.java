
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class db {
      final private String url = "org.sqlite.JDBC";
    final private String db = "jdbc:sqlite:db/";
    private String dbName = "carihesap.db";
    
    private Connection conn = null;
    private Statement st = null;

    public db() {
    }
    
    public db(String dbName) {
        this.dbName = dbName;
    }
    
    // bağlan methodu kuruluyor
    public Statement baglan() {
        try {
            Class.forName(url);
            conn = DriverManager.getConnection(db+dbName);
            st = conn.createStatement();
            System.out.println("Bağlantı başarılı");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Bağlantı Hatası : " + e);
        }
        return st;
    }
    
    
    // bağlantı kapat
    public void kapat() {
        if(st != null && conn != null) {
            try {
                st.close();
                conn.close();
                st = null;
                conn = null;
                System.out.println("Kapatma Yapıldı");
            } catch (SQLException e) {
                System.err.println("Kapatma Hatası : " + e);
            }
        }
    }
}
