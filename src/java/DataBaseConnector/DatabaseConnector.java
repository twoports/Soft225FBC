package DatabaseConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author MacBootCamp
 */
public class DatabaseConnector {
   
    public static void main(String[] args) {

        // User id and password for connection to Tom on Oracle
        String userId = "gavindodd";
        String password = "Duporth.1001";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            Connection conn = DriverManager.getConnection
                    ("jdbc:oracle:thin:@tom.uopnet.plymouth.ac.uk:1521:orcl",
                        userId, password);
            System.out.println("Connection OK");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}