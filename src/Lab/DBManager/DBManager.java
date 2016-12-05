/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab.DBManager;

import Lab.BusinessObjects.Lab;
import java.sql.*;
import java.util.ArrayList;

/**
 * DBManager deals with the database of labs. Allows access to current entries,
 * creation of new ones, and deletion.
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
     * @return true if successful, false o/w
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
     * Checks if a lab object has a duplicate in the database already. Labs are
     * unique if their name and address combination is unique.
     *
     * @param lab lab object to check
     * @return true if it is unique, false o/w
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
     * Method to send an arrayList of ExamType objects to the GUIController and
     * GUI.
     *
     * @return an arrayList of ExamTypes
     */
    public static ArrayList<Lab> getAllLabs() {
        String querySQL = "select * from lab";
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            ResultSet result = pStmt.executeQuery();
            ArrayList<Lab> labs = new ArrayList<>();
            while (result.next()) {
                String lab_name = result.getString("lab_name");
                String street = result.getString("street");
                String city = result.getString("city");
                String state = result.getString("us_state_abbr");
                String zip = result.getString("zip");
                String email = result.getString("email");
                String fnum = result.getString("fnum");
                String pnum = result.getString("pnum");
                String onOffSite = result.getString("onsite");
                Boolean onSite = onOffSite.equals("On Site");
                labs.add(new Lab(lab_name, street, city, state, zip, email, fnum, pnum, onSite));
                System.out.println(lab_name + " "
                        + street + " "
                        + city + " "
                        + state + " "
                        + zip + " "
                        + email + " "
                        + fnum + " "
                        + pnum + " "
                        + onOffSite);
            }
            return labs;
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
     * Save a lab object to the database.
     *
     * @param lab Lab object to save
     * @return message with result
     */
    public static String saveLab(Lab lab) {
        String querySQL = "INSERT INTO lab "
                + "(lab_name, street, city, us_state_abbr, "
                + "zip, email, fnum, pnum, onsite) "
                + "VALUES (?,?,?,?,?,?,?,?,?)";
        return saveUpdateLab(lab, querySQL, 1, 2, 3, 4, 5, 6, 7, 8, 9, "Added");
    }

    /**
     * Method to update an ExamType object into the database.
     *
     * @param lab new object to save
     * @return message with result
     */
    public static String updateLab(Lab lab) { //, String type) {
        String querySQL = "update lab set city = ?, us_state_abbr = ?, "
                + "zip = ?, email = ?, fnum = ?, pnum = ?, onsite = ? where lab_name = ? AND street = ?";
        return saveUpdateLab(lab, querySQL, 8, 9, 1, 2, 3, 4, 5, 6, 7, "Updated");
    }

    /**
     * Method to save or to update an ExamType object into the database.
     *
     * @param examType new object to save
     * @param querySQl string query
     * @param a sql index for name
     * @param b sql index for street
     * @param c sql index for city
     * @param d sql index for state
     * @param e sql index for zip
     * @param f sql index for email
     * @param g sql index for fnum
     * @param h sql index for pnum
     * @param i sql index for status
     * @param Action the action (either save new or update)
     * @return message with result
     */
    public static String saveUpdateLab(Lab lab, String querySQL, int a, int b, int c, int d, int e, int f, int g, int h, int i, String action) {
        PreparedStatement pStmt = null;
        try {
            pStmt = globalCon.prepareStatement(querySQL);
            pStmt.setString(1, testString(lab.getName(), 0, 20));
            pStmt.setString(2, testString(lab.getAddress().getStreet(), 0, 20));
            pStmt.setString(3, testString(lab.getAddress().getCity(), 0, 20));
            pStmt.setString(4, testString(lab.getAddress().getState(), 2, 2));
            pStmt.setLong(5, testInt(lab.getAddress().getZip(), 501, 99950));
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
            return "Lab \"" + lab.getName() + "\" " + action;//true
        } catch (SQLException ex) {
            return "Error: Update Failed (Contact developers): " + ex.getMessage(); //false
        } catch (Exception ex) {
            return "Error: " + ex.getMessage(); //false
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
     * @param num number to test
     * @param min min value
     * @param max max value
     * @return the number
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
        if (maxLen == 2 && minLen == 2) {
            str = str.toUpperCase();
        }
        return str;
    }

    /**
     * Test if a string is less than a max length and does contain another
     * specified string.
     *
     * @param str string to test
     * @param maxLen max length
     * @param x string that str must contain
     * @return string if the criteria are met
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
     * @param name name of lab
     * @param street street address of lab
     * @return true if successful, false o/w
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
