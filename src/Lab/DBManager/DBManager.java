/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab.DBManager;

import Lab.BusinessObjects.Lab;
import java.sql.*;

/**
 *
 * @author owner
 */
public class DBManager {

    static Connection globalCon = null;
    static String url = "jdbc:mysql://cr137.cse.lehigh.edu:3306/db06";
    static String userName = "user06";
    static String psswd = "leak-deer";

    public static void connector() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver").newInstance(); // loading driver
//        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
//            System.out.println("Incorrect Driver! ");
//            System.out.println("Error Type: " + e.getClass().getName());
//            System.out.println("Error Message: " + e.getMessage());
//
//        }
        try {
            globalCon = DriverManager.getConnection(url, userName, psswd);
        } catch (SQLException e) {
            System.out.println("Incorrect URL or User ID or Password!");
            System.out.println("Error Type: " + e.getClass().getName());
        }
    }

    public static Boolean checkUnique(Lab e1) {
        String querySQL = "select lab_name,street from lab where lab_name = ? AND street = ?";
        try {
            PreparedStatement pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, e1.getName());
            pStmt.setString(2, e1.getAddress().getStreet());
            ResultSet result = pStmt.executeQuery();
            return (!result.next());
        } catch (SQLException e) {
            System.out.println("Query Failed: " + querySQL);
            System.out.println("Error Type: " + e.getClass().getName());
            return false;
        }
    }

    public static Boolean saveExamType(Lab e) {
        return false;
    }

    public static void closer() {
        try{ 
            if (globalCon != null) {
                globalCon.close();
            }
        }
        catch (SQLException e) {
            System.out.println("Error Type: " + e.getClass().getName());
        }
    }
}
