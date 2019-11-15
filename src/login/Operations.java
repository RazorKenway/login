/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author kirusiha
 */
public class Operations {
    public static boolean isLogin(String username, String password, String userType, JFrame frame){
        try {
            Connection myConn=MySqlConnection.getConnection();
            String mySqlQuery=
                    "Select UID, Usertype, Nickname FROM login where Username='"+
                    username+
                    "'AND Password='"+
                    password +
                    "'AND Usertype='"+
                    userType +
                    "'";
            PreparedStatement preparedstatement=myConn.prepareStatement(mySqlQuery);
            ResultSet rs=preparedstatement.executeQuery();
            
            while(rs.next()){
                LoginSessionClass.UID=rs.getInt("UID");
                LoginSessionClass.UserType=rs.getString("Usertype");
                LoginSessionClass.NickName=rs.getString("Nickname");
                return true;
            }
            
                
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "Database error"+e.getMessage());
        }
        return false;
        
    }

    private static PreparedStatement PreparedStatement(String mySqlQuery) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
