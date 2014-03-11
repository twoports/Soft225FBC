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
public class ClubDetails {
    

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
    


    public ClubDetails() {
        this("no address","no address","no country","no county",
"no email", "no phone", "no manager", "no manager","no mobile", "no clubname",  "no postcode", "no town");
    }

    public ClubDetails(String strAddLine1, String strAddLine2,
String strClubCountry,String strClubCounty, String strClubEmail, String strClubLandLine, 
String strClubManagerFirstName, String strClubManagerLastName, String strClubmobile, String strClubname,
String strClubPostCode, String strClubTown) {
      
   
    clubaddressline1 = strAddLine1;
    clubaddressline2 = strAddLine2;
    clubcountry = strClubCountry;
    clubcounty =strClubCounty;
    clubemail = strClubEmail;
    clublandline = strClubLandLine;
    clubmanagerfirstname = strClubManagerFirstName;
    clubmanagerlastname = strClubManagerLastName;
    clubmobile = strClubmobile;
    clubname = strClubname;
    clubpostcode = strClubPostCode;
    clubtown = strClubTown;
    
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

    
    
    
}