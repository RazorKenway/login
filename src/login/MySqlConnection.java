/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kirusiha
 */
public class MySqlConnection {

    public static Connection getConnection() throws Exception {
        String dbRoot = "jdbc:mysql://";
        String hostname = "localhost:3306/";
        String dbName = "tutorials";
        String dbUrl = "jdbc:mysql://localhost:3306/tutorials";
        String hostUserName = "root";
        String hostPassword = "";
        Connection myConn = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            myConn = (Connection) DriverManager.getConnection(dbUrl, hostUserName, hostPassword);
            System.out.println("Registro exitoso");
         

        } catch (Exception e) {

            System.out.println(e.toString());

        }

        //  Class.forName("com.mysql.jdbc.Driver");
        return myConn;

    }
}
