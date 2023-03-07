package Play2Win;
import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionUtil {

    private static Connection con = null;
    private static String url;
    private static String username;
    private static String password;

    public static Connection dbConnector() {
        if (con == null) {

            try {

                Connection con = DriverManager.getConnection(url, username, password);
                return con;
            } catch (Exception e) {
                return null;
            }

        }
        return con;
    }

}
