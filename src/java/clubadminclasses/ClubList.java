/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clubadminclasses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MacBootCamp
 */

    

public class ClubList {
    
      public static void main(String[] args) {
     
    }
    

    private ArrayList<ClubDetails> list;

    public ClubList() {
        list = new ArrayList<ClubDetails>();
    }

    public ClubList(ResultSet rs) {
        this();
        try {
            while (rs.next()) {
                list.add(new ClubDetails(rs.getString(1),  // clubID
                                         rs.getString(2),  // 
                                         rs.getString(3),  // 
                                         rs.getString(4),  //
                                         rs.getString(5),  //
                                         rs.getString(6),  // 
                                         rs.getString(7),  // 
                                         rs.getString(8),  // 
                                         rs.getString(9),  // 
                                         rs.getString(10), // 
                                         rs.getString(11), // 
                                         rs.getString(12))); //
                                        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ClubDetails retrieveClubAt(int index) {
        if (index < 0 || index >= list.size())
            return null;
        else
            return list.get(index);
    }
    
    public int size() {
        return list.size();
    }
}