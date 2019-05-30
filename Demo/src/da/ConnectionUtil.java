package da;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConnectionUtil {
    private static Connection con = null;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (con == null) {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/congty";
            String username = "tranvanb";
            String password = "101";
            con = DriverManager.getConnection(url, username, password);
        }
        return con;
    }
}
