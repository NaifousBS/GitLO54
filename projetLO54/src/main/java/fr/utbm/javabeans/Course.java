package fr.utbm.javabeans;

/**
 * The Class Course.
 */
public class Course {
    
    /** The code. */
    private String code;
    /** The title. */
    private String title;
    
    /**
     * Instantiates a new course.
     */
    public Course() {
    }
    
    /**
     * Instantiates a new course.
     *
     * @param code the code
     * @param title the title
     */
    public Course(String code, String title) {
        super();
        this.code = code;
        this.title = title;
    }
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }
    
    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    
}
