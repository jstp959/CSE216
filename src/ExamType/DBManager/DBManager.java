/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamType.DBManager;

import ExamType.BusinessObjects.*;
import java.sql.*;

/**
 *
 * @author Rachel Okun
 */
public class DBManager {
    
    static Connection globalCon = null;
    static String url = "jdbc:mysql://cr137.cse.lehigh.edu:3306/db06";
    static String userName = "user06";
    static String psswd = "leak-deer";
    
    public static boolean connector() {
        try {
            globalCon = DriverManager.getConnection(url, userName, psswd);
            return true;
        } catch (SQLException e) {
            System.out.println("Incorrect URL or User ID or Password!");
            System.out.println("Error Type: " + e.getClass().getName());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Error SQLstate: " + e.getSQLState());
            System.out.println("Error ToString: " + e.toString());
            return false;
        }
    }
    
    public static Boolean checkUnique(ExamType examType) {
        String querySQL = "select exam_type_name from exam_type where exam_type_name = ?";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, examType.getName());
            ResultSet result = pStmt.executeQuery();
            return (!result.next());
        } catch (SQLException e) {
            System.out.println("Query Failed: " + querySQL);
            System.out.println("Error Type: " + e.getClass().getName());
            return false;
        } finally {
            if (pStmt != null) {
                try {
                    System.out.println("CLOSED! Query!");
                    pStmt.close();
                } catch (SQLException ex) {
                    System.out.println("pStmt.close() failed");
                    System.out.println("Error Type: " + ex.getClass().getName());
                }
            }
        }
    }
    
    public static ExamType getExamType(String name) {
        return null;
    }
    
    public static String saveExamType(ExamType examType) {
        String querySQL = "INSERT INTO exam_type "
                + "(exam_type_name, description, status0) "
                + "VALUES (?,?,?)";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(examType.getName(), 0, 20));
            pStmt.setString(2, testString(examType.getDescription(), 0, 200));
            String status;
            if (examType.getStatus()) {
                status = "Active";
            } else {
                status = "Not Active";
            }
            pStmt.setString(3, status);
            pStmt.executeUpdate();
            return "Exam Type \"" + examType.getName() + "\" Added";//true
        } catch (SQLException e) {
            return "Error: Update Failed (Contact developers): " + e.getMessage(); //false
        } catch (Exception e) {
            return "Error: " + e.getMessage(); //false
        } finally {
            if (pStmt != null) {
                try {
                    System.out.println("CLOSED! Save!");
                    pStmt.close();
                } catch (SQLException ex) {
                    System.out.println("pStmt.close() failed");
                    System.out.println("Error Type: " + ex.getClass().getName());
                }
            }
        }
    } 
    
    private static String testString(String str, int minLen, int maxLen) throws Exception {
        if (str.length() > maxLen || str.length() < minLen) {
            throw new Exception(str + " has a length not in [" + minLen + ", " + maxLen + "]");
        }
        return str;
    }
    
    public static void closer() {
        try {
            if (globalCon != null) {
                globalCon.close();
            }
        } catch (SQLException e) {
            System.out.println("Error Type: " + e.getClass().getName());
        }
    }

}
