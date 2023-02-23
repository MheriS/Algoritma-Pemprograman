package Database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author herib
 */
public class koneksi {
    
    private static Connection con;
    
    public static Connection config()throws SQLException{
        try {
            
            String url = "jdbc:mysql://localhost:3306/praktikum11";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url, user, pass);
            
            System.out.println("koneksi berhasil");

        } catch (SQLException e) {
            System.out.println("koneksi gagal" + e.getMessage());
        }
        return con;
    }
}


