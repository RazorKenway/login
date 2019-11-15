/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import javax.swing.JFrame;

/**
 *
 * @author kirusiha
 */
public class LogOut {
    public static void logout(JFrame context,LoginFrame loginScreen){
        LoginSessionClass.isLoggedIn=false;
        context.setVisible(false);
        loginScreen.setVisible(true);
    }
            
    
}
