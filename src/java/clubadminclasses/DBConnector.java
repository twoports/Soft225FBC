package clubadminclasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MacBootCamp
 */
public class DBConnector {
    
    private String dbName = "SOFT225FBC";
    private Connection conn = null;
    private ResultSet results = null;
    
       public DBConnector() {
        // Note a parameter-less constructor.
        // This is needed if we are to
        // use a bean tag
    }
   
    public static void main(String[] args) {
     
    }
    
    public void createConnection(){
          // User id and password for connection to Tom on Oracle
        String userId = "gavindodd";
        String password = "Duporth.1001";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            Connection conn = DriverManager.getConnection
                    ("jdbc:oracle:thin:@tom.uopnet.plymouth.ac.uk:1521:orcl",
                        userId, password);
            System.out.println("Database Connection Confirmed");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    



     public boolean clubExists(String club) {
        boolean exists = false;
        int count = 0;
        String query = "SELECT * FROM SOFT225FBC WHERE club = ?";
        try {
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, club);
            results = pstmt.executeQuery();
            if (results.next())
            exists = true;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
               
        if (selectClubByCLUB(club) == null)
            exists = true;
        return exists;
    }

    public ClubList selectAllClubs() {
        return selectAllClubs("clubId");
    }
    
    public ClubList selectAllClubs(String order) {
        ClubList list = null;

        try {
            String strQuery = "SELECT , clubaddressline1,clubaddressline2, clubcountry,clubcounty, clubemail, clublandline, clubmanagerfirstname, clubmanagerlastname, clubmobile, clubname,clubpostcode, clubtown" +
                    " FROM SOFT225FBC" +
                    " ORDER BY " + order;
            PreparedStatement stmt = conn.prepareStatement(strQuery);

            results = stmt.executeQuery();
            
            list = new ClubList(results);
        }
         catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public ClubDetails selectClubByCLUB(String strClubname) {
        ClubDetails club = null;
        try {
            String strQuery = "SELECT clubaddressline1,clubaddressline2, clubcountry,clubcounty, clubemail, clublandline, clubmanagerfirstname, clubmanagerlastname, clubmobile, clubname,clubpostcode, clubtown " +
                    "FROM SOFT225FBC" +
                    " WHERE club = ?";
            PreparedStatement stmt = conn.prepareStatement(strQuery);
            stmt.setString(1, strClubname);
            results = stmt.executeQuery();

            while (results.next()) {
                club = new ClubDetails(
                        results.getString(1),  
                        results.getString(2),
                        results.getString(3),
                        results.getString(4),
                        results.getString(5),
                        results.getString(6),
                        results.getString(7),
                        results.getString(8), 
                        results.getString(9),
                        results.getString(10),
                        results.getString(11),
                        results.getString(12));                             
                          
            }
        }
         catch (SQLException e) {
             e.printStackTrace();
        }
        return club;
    }

//    public void insertClub(ClubDetails club) {
//        try {
//             String strQuery = " INSERT INTO SOFT225FBC" +
//                 " (clubaddressline1,clubaddressline2, clubcountry,clubcounty, clubemail, clublandline, clubmanagerfirstname, clubmanagerlastname, clubmobile, clubname,clubpostcode, clubtown) " +
//                 " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//
//            PreparedStatement stmt = conn.prepareStatement(strQuery);
//
//            stmt.setString(1, club.getClubaddressline1());
//            stmt.setString(2, club.getClubaddressline2());
//            stmt.setString(3, club.get());
//            stmt.setString(4, club.get());
//            stmt.setString(5, club.get());
//            stmt.setString(6, club.get());
//            stmt.setString(7, club.get());
//            stmt.setString(8, club.get());
//            stmt.setString(9, club.get());
//            stmt.setString(10, club.get());
//            stmt.setString(11, club.get());
//            stmt.setString(12, club.get());
//     
//            
//
//             //Execute a query
//            stmt.executeUpdate();
//        }
//         catch (SQLException e) {
//             e.printStackTrace();
//        }
//    }
    
//    public void updateClub(ClubDetails club) {
//        try {
//            String strQuery = "UPDATE SOFT225FBC" +
//                " SET clubaddressline1 = ? ,clubaddressline2 = ?, clubcountry = ?,clubcounty = ?, clubemail = ?, clublandline = ?, clubmanagerfirstname = ?, clubmanagerlastname = ?, clubmobile = ?,clubpostcode = ?, clubtown = ? " +
//                " WHERE clubname = ?";
//
//            PreparedStatement stmt = conn.prepareStatement(strQuery);
//            
//            stmt.setString(1, club.getClubaddressline1());
//            stmt.setString(2, club.getClubaddressline2());
//            stmt.setString(3, club.get());
//            stmt.setString(4, club.get());
//            stmt.setString(5, club.get());
//            stmt.setString(6, club.get());
//            stmt.setString(7, club.get());
//            stmt.setString(8, club.get());
//            stmt.setString(9, club.get());
//            stmt.setString(10, club.get());
//            stmt.setString(11, club.get());
//            stmt.setString(12, club.get());
//            
//            
//            
//            stmt.executeUpdate();
//        }
//         catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    
    public String deleteClub(String clubname) {
        int noOfUpdates = 0;
        String message = "";
        try {
            String strQuery = "DELETE FROM SOFT225FBC" +
                " WHERE clubname = ?";
            PreparedStatement stmt = conn.prepareStatement(strQuery);
            stmt.setString(1, clubname);
            noOfUpdates = stmt.executeUpdate();
        }
        catch (SQLException e) {
            message = "SQL Exception: " + e.getMessage();
        }
        if (message.length() ==0 && noOfUpdates == 0)
            message = "Record was not updated";

        return message;    
    }
    
    
    
    
        public void closeConnection() {
        try {
            if ((conn != null) || (conn.isClosed() == false)) {
                conn.close();
            }
        }
         catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
