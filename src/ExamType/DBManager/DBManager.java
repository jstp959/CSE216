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
 * Database Manager deals with transactions with the database. Creates new
 * objects and views existing ones.
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
     * @param examType new ExamType object to be checked
     * @return true if unique, false o/w
     */
    public static Boolean checkUnique(ExamType examType) {
        String querySQL = "select * from exam_type where exam_type_name = ?";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(examType.getName(), 0, 40));
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
     * Method to send an arrayList of ExamType objects to the GUIController and
     * GUI.
     *
     * @return an arrayList of ExamTypes
     */
    public static ArrayList<ExamType> getAllExamTypes() {
        String querySQL = "select * from exam_type where status0 = 'Active'";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            ResultSet result = pStmt.executeQuery();
            ArrayList<ExamType> examTypes = new ArrayList<>();
            while (result.next()) {
                String exam_name = result.getString("exam_type_name");
                String desc = result.getString("description");
                examTypes.add(new ExamType(exam_name, desc));
                System.out.println(exam_name + " " + desc);
            }
            return examTypes;
        } catch (SQLException e) {
            System.err.println("**MySQLException: " + e.getMessage());
            return null;
        } catch (Exception e) {
            System.err.println("**MyException: " + e.getMessage());
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

    /**
     * Method to save an ExamType object into the database.
     *
     * @param examType new object to save
     * @return message with result
     */
    public static String saveExamType(ExamType examType) { //, String type) {
        String querySQL = "INSERT INTO exam_type "
                + "(exam_type_name, description, status0) "
                + "VALUES (?,?,?)";
        return saveUpdateExamType(examType, querySQL, 1, 2, 3, "Added");
    }

    /**
     * Method to update an ExamType object into the database.
     *
     * @param examType new object to save
     * @param status   Updated or Deactivated tag
     * @return message with result
     */
    public static String updateExamType(ExamType examType, String status) { //, String type) {
        String querySQL = "update exam_type set description = ?, "
                + "status0 = ? where exam_type_name = ?";
        return saveUpdateExamType(examType, querySQL, 3, 1, 2, status);
    }

    /**
     * Method to save or to update an ExamType object into the database.
     *
     * @param examType new object to save
     * @param querySQL string query
     * @param a SQL index for exam_type_name
     * @param b SQL index for description
     * @param c SQL index for status0
     * @param action the action (either save new or update)
     * @return message with result
     */
    public static String saveUpdateExamType(ExamType examType, String querySQL, int a, int b, int c, String action) {
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(a, testString(examType.getName(), 1, 40));
            pStmt.setString(b, testString(examType.getDescription(), 0, 200));
            String status;
            if (examType.getStatus()) {
                status = "Active";
            } else {
                status = "Not Active";
            }
            pStmt.setString(c, status);
            pStmt.executeUpdate();
            return "Exam Type \"" + examType.getName() + "\" " + action;//true
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
     * @param str string to test
     * @param minLen minimum length
     * @param maxLen maximum length
     * @return true if within bounds, false o/w
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
     * @param name name of ExamType to delete
     * @return true if successful, false o/w
     */
    public static boolean delete(String name) {
        String querySQL = "delete from exam_type where exam_type_name = ?";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(name, 0, 40));
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
