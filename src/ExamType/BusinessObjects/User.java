
package ExamType.BusinessObjects;

/**
 * Temporary User class implements only for functionality/testing.
 * The "real" User class may be implemented by another group.
 * 
 * @author elisecross
 */
public class User {
    
    private String userID;
    private String password;
    private String privilege;
    
    /** 
     * User object represents the User logged into the system
     * 
     * @param userID    ID associated with the user
     * @param password  User's password, for verification
     * @param privilege User's status - admin or not
     */
    public User(String userID, String password, String privilege){
        this.userID = userID;
        this.password = password;
        this.privilege = privilege; 
    }
    
    /** 
     * Get privilege of User, used in determining access criteria
     * 
     * @return privilege of the user
     */
    public String getPrivilege() {
        return this.privilege;
    }
}
