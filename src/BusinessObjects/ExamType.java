/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessObjects;

/**
 * Blah
 *
 * @author Rachel
 * @version Nov 10, 2016
 */
public class ExamType implements Comparable<ExamType> {

    private String name;
    private String description;
    private Boolean status;

    // ----------------------------------------------------------
    /**
     * Create a new Exam object.
     *
     * @param name exam type!!
     * @param description explanation of exam type
     */
    public ExamType(String name, String description) {
        this.name = name;
        this.description = description;
        this.status = true; // active
    }

    // ----------------------------------------------------------
    /**
     * Get the name of an Exam Type
     *
     * @return the name of the Exam Type
     */
    public String getName() {
        return this.name;
    }

    // ----------------------------------------------------------
    /**
     * Get an Exam Type's description
     *
     * @return the description associated with the Exam Type, if applicable
     */
    public String getDescription() {
        return this.description;
    }

    // ----------------------------------------------------------
    /**
     * Get an Exam Type's status (active or inactive)
     *
     * @return the status of the Exam Type (1 = active; 0 = inactive)
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * Compares exams.
     *
     * @param examtype another exam
     * @return a number (negative or zero)
     */
    public int compareTo(ExamType examtype) {
        if (!this.name.equals(examtype.name)) {
            return -1;
        } else {
            return 0;
        }
    }

}
