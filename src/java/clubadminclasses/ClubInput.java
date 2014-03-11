/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clubadminclasses;


/**
 *
 * @author MacBootCamp
 */
public class ClubInput {
   
  
    private String clubaddressline1;
    private String clubaddressline2;
    private String clubcountry;
    private String clubcounty;
    private String clubemail;
    private String clublandline;
    private String clubmanagerfirstname;
    private String clubmanagerlastname;
    private String clubmobile;
    private String clubname;
    private String clubpostcode;
    private String clubtown;
    
      public static void main(String[] args) {
     
    }
    
   
    
    public ClubInput() {
        this("", "", "", "", "", "", "", "", "", "", "", "");
    }

    
    public ClubInput(String clubaddressline1, String clubaddressline2, String clubcountry, String clubcounty, String clubemail, String clublandline, String clubmanagerfirstname, String clubmanagerlastname, String clubmobile, String clubname, String clubpostcode, String clubtown) {
        this.clubaddressline1 = clubaddressline1;
        this.clubaddressline2 = clubaddressline2;
        this.clubcountry = clubcountry;
        this.clubcounty = clubcounty;
        this.clubemail = clubemail;
        this.clublandline = clublandline;
        this.clubmanagerfirstname = clubmanagerfirstname;
        this.clubmanagerlastname = clubmanagerlastname;
        this.clubmobile = clubmobile;
        this.clubname = clubname;
        this.clubpostcode = clubpostcode;
        this.clubtown = clubtown;
    }

          
    public ClubDetails makeObject() {
        ClubDetails club;
        club = new ClubDetails(clubaddressline1, clubaddressline2, clubcountry, clubcounty,
                clubemail, clublandline, clubmanagerfirstname, clubmanagerlastname,
                clubmobile, clubname, clubpostcode, clubtown);
   return club;
    }
    
    
    public String getClubaddressline1() {
        return clubaddressline1;
    }

    public void setClubaddressline1(String clubaddressline1) {
        this.clubaddressline1 = clubaddressline1;
    }

    public String getClubaddressline2() {
        return clubaddressline2;
    }

    public void setClubaddressline2(String clubaddressline2) {
        this.clubaddressline2 = clubaddressline2;
    }

    public String getClubcountry() {
        return clubcountry;
    }

    public void setClubcountry(String clubcountry) {
        this.clubcountry = clubcountry;
    }

    public String getClubcounty() {
        return clubcounty;
    }

    public void setClubcounty(String clubcounty) {
        this.clubcounty = clubcounty;
    }

    public String getClubemail() {
        return clubemail;
    }

    public void setClubemail(String clubemail) {
        this.clubemail = clubemail;
    }

    public String getClublandline() {
        return clublandline;
    }

    public void setClublandline(String clublandline) {
        this.clublandline = clublandline;
    }

    public String getClubmanagerfirstname() {
        return clubmanagerfirstname;
    }

    public void setClubmanagerfirstname(String clubmanagerfirstname) {
        this.clubmanagerfirstname = clubmanagerfirstname;
    }

    public String getClubmanagerlastname() {
        return clubmanagerlastname;
    }

    public void setClubmanagerlastname(String clubmanagerlastname) {
        this.clubmanagerlastname = clubmanagerlastname;
    }

    public String getClubmobile() {
        return clubmobile;
    }

    public void setClubmobile(String clubmobile) {
        this.clubmobile = clubmobile;
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public String getClubpostcode() {
        return clubpostcode;
    }

    public void setClubpostcode(String clubpostcode) {
        this.clubpostcode = clubpostcode;
    }

    public String getClubtown() {
        return clubtown;
    }

    public void setClubtown(String clubtown) {
        this.clubtown = clubtown;
    }

     
      public boolean clubExists() {
        DBConnector db = new DBConnector();
        db.createConnection();
        boolean exists = db.clubExists(clubname);
        db.closeConnection();
        return exists;
    }
      
   




    
    
}
