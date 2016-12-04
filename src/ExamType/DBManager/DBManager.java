/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamType.DBManager;

import ExamType.BusinessObjects.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *  Database Manager deals with transactions with the database.
 * Creates new objects and views existing ones.
 * 
 * @author Rachel Okun
 */
public class DBManager {

    static Connection globalCon = null;
    static String url = "jdbc:mysql://cr137.cse.lehigh.edu:3306/db06";
    static String userName = "user06";
    static String psswd = "leak-deer";

    /**
     * Opens database connection.
     * 
     * @return true if connected, false o/w
     */
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

    /**
     * Checks if an ExamType object has a duplicate in the database already.
     * 
     * @param examType  new ExamType object to be checked
     * @return          true if unique, false o/w
     */
    public static Boolean checkUnique(ExamType examType) {
        String querySQL = "select exam_type_name from exam_type where exam_type_name = ?";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(examType.getName(), 0, 20));
            ResultSet result = pStmt.executeQuery();
            return (!result.next());
        } catch (SQLException e) {
            System.out.println("Query Failed: " + querySQL);
            System.out.println("Error Type: " + e.getClass().getName());
            return false;
        } catch (Exception e) {
            System.out.println("Failed: " + e.getMessage());
            System.out.println("Error Type: " + e.getClass().getName());
            return false;
        } finally {
            if (pStmt != null) {
                try {
                    pStmt.close();
                } catch (SQLException ex) {
                    System.out.println("pStmt.close() failed");
                    System.out.println("Error Type: " + ex.getClass().getName());
                }
            }
        }
    }
    /**
     * Method to send an arrayList of ExamType objects to the GUIController and GUI. 
     * 
     * @return          an arrayList of ExamTypes
     */
    public static ArrayList<ExamType> getAllExamTypes() {
        String querySQL = "select exam_type_name, description, status0 from exam_type";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            ResultSet result = pStmt.executeQuery();
            ArrayList<ExamType> examTypes = new ArrayList<>();
            while (result.next())
	    {
                    String exam_name = result.getString(0);
                    String desc = result.getString(1);
                    examTypes.add(new ExamType(exam_name, desc));
                    System.out.println(exam_name +" "+desc);
            }
            return examTypes;
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            return null;
        } finally {
            if (pStmt != null) {
                try {
                    pStmt.close();
                } catch (SQLException ex) {
                    System.out.println("pStmt.close() failed");
                    System.out.println("Error Type: " + ex.getClass().getName());
                }
            }
        }
    }
    
//    public static ExamType getExamType(String name) {
//        return null;
//    }

    /**
     * Method to save an ExamType object into the database.
     * 
     * @param examType  new object to save
     * @param type      new object or updated object
     * @return          message with result
     */
    public static String saveExamType(ExamType examType){ //, String type) {
        String querySQL = "";
        //if (type == "new") {
            querySQL = "INSERT INTO exam_type "
                + "(exam_type_name, description, status0) "
                + "VALUES (?,?,?)";
        //}
        /*else if (type == "update") { 
            querySQL = "INSERT INTO exam_type "
                + "(exam_type_name, description, status0) "
                + "VALUES (?,?,?)";
        }*/
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(examType.getName(), 1, 20));
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
                    pStmt.close();
                } catch (SQLException ex) {
                    System.out.println("pStmt.close() failed");
                    System.out.println("Error Type: " + ex.getClass().getName());
                }
            }
        }
    }

    /**
     * Test length of a string against a min and a max.
     * 
     * @param str       string to test
     * @param minLen    minimum length
     * @param maxLen    maximum length
     * @return          true if within bounds, false o/w
     * @throws Exception 
     */
    private static String testString(String str, int minLen, int maxLen) throws Exception {
        if (str.length() > maxLen || str.length() < minLen) {
            throw new Exception(str + " has a length not in [" + minLen + ", " + maxLen + "]");
        }
        return str;
    }
    /**
     * Delete and ExamType from the database.
     * 
     * @param name  name of ExamType to delete
     * @return      true if successful, false o/w
     */
    public static boolean delete(String name) {
        String querySQL = "delete from exam_type where exam_type_name = ?";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(name, 0, 20));
            pStmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Query Failed: " + querySQL);
            System.out.println("Error Type: " + e.getClass().getName());
            return false;
        } catch (Exception e) {
            System.out.println("Failed: " + e.getMessage());
            System.out.println("Error Type: " + e.getClass().getName());
            return false;
        } finally {
            if (pStmt != null) {
                try {
                    pStmt.close();
                } catch (SQLException ex) {
                    System.out.println("pStmt.close() failed");
                    System.out.println("Error Type: " + ex.getClass().getName());
                }
            }
        }
    }

    /**
     * Close database connection
     */
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
