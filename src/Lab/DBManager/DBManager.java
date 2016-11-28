/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab.DBManager;

import Lab.BusinessObjects.Lab;
import java.sql.*;

/**
 *  DBManager deals with the database of labs.
 * Allows access to current entries, creation of new ones, and deletion.
 * 
 * @author Rachel Okun
 */
public class DBManager {

    static Connection globalCon = null;
    static String url = "jdbc:mysql://cr137.cse.lehigh.edu:3306/db06";
    static String userName = "user06";
    static String psswd = "leak-deer";

    /**
     * Connects to database.
     * 
     * @return  true if successful, false o/w
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
     * Checks if a lab object has a duplicate in the database already.
     * Labs are unique if their name and address combination is unique.
     * 
     * @param lab   lab object to check
     * @return      true if it is unique, false o/w
     */
    public static boolean checkUnique(Lab lab) {
        String querySQL = "select lab_name,street from lab where lab_name = ? AND street = ?";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(lab.getName(), 0, 20));
            pStmt.setString(2, testString(lab.getAddress().getStreet(), 0, 20));
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
     * Save a lab object to the database.
     * 
     * @param lab   Lab object to save
     * @return      message with result
     */
    public static String saveLab(Lab lab) {
        String querySQL = "INSERT INTO lab "
                + "(lab_name, street, city, us_state_abbr, "
                + "zip, email, fnum, pnum, onsite) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(lab.getName(), 0, 20));
            pStmt.setString(2, testString(lab.getAddress().getStreet(), 0, 20));
            pStmt.setString(3, testString(lab.getAddress().getCity(), 0, 20));
            pStmt.setString(4, testString(lab.getAddress().getState(), 2, 2));
            pStmt.setLong(5, testInt(lab.getAddress().getZip(), 10000, 99999));
            pStmt.setString(6, testString(lab.getEmail(), 50, "@"));
            pStmt.setLong(7, testInt(lab.getFaxNo(), 1000000000, 9999999999L));
            pStmt.setLong(8, testInt(lab.getPhoneNo(), 1000000000, 9999999999L));
            String status;
            if (lab.getOnSite()) {
                status = "On Site";
            } else {
                status = "Off Site";
            }
            pStmt.setString(9, status);
            pStmt.executeUpdate();
            return "Lab \"" + lab.getName() + "\" Added";//true
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
     * Test if an int is within a range.
     * 
     * @param num   number to test 
     * @param min   min value
     * @param max   max value
     * @return      the number
     * @throws Exception 
     */
    private static long testInt(String num, long min, long max) throws Exception {
        long ans;
        try {
            ans = Long.parseLong(num);
        } catch (Exception ex) {
            throw new Exception(num + " cannot be parsed to a number");
        }
        if (ans > max || ans < min) {
            throw new Exception(ans + " not in valid range: [" + min + ", " + max + "]");
        }
        return ans;

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
        if (maxLen == 2 && minLen == 2) {
            str = str.toUpperCase();
        }
        return str;
    }

    /**
     * Test if a string is less than a max length and does contain another 
     * specified string.
     * 
     * @param str       string to test
     * @param maxLen    max length
     * @param x         string that str must contain
     * @return          string if the criteria are met
     * @throws Exception 
     */
    private static String testString(String str, int maxLen, String x) throws Exception {
        if (str.length() > maxLen) {
            throw new Exception(str + " has a length greater than " + maxLen);
        }
        if (!str.contains(x)) {
            throw new Exception(str + " does not have " + x + " in it");
        }
        return str;
    }

    /**
     * Delete lab from database.
     * 
     * @param name      name of lab
     * @param street    street address of lab
     * @return          true if successful, false o/w
     */
    public static boolean delete(String name, String street) {
        String querySQL = "delete from lab where lab_name = ? AND street = ?";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(name, 0, 20));
            pStmt.setString(2, testString(street, 0, 20));
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
     * Close DB connection.
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
