/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fooddelivery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

/**
 *
 * @author Jeevananthan
 */

/**
 *
 * @author Jeevananthan
 */


public class fooddelivery {
    public static Connection getconnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure this line exists!
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fooddelivery", "root", "Jeeva@1608");
        } catch (Exception e) {
            System.out.println("Connection error: " + e);
        }
        return con;
    }
}


