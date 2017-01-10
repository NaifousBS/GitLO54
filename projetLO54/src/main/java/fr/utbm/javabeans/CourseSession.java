package fr.utbm.javabeans;

import java.util.Date;

/**
 * The Class CourseSession.
 */
public class CourseSession {
    
    /** The id. */
    private int id;
    
    /** The start date. */
    private Date startDate;
    
    /** The end date. */
    private Date endDate;
    
    private Course course;
    private Location location;
    
    /**
     * Instantiates a new course session.
     */
    public CourseSession() {
    }
    
    /**
     * Instantiates a new course session.
     *
     * @param id the id
     * @param startDate the start date
     * @param endDate the end date
     * @param course
     */
    public CourseSession(int id, Date startDate, Date endDate, Course course) {
        super();
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.course=course;
        
    }
    
    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }
    
    /**
     * Sets the id.
     *
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * Gets the start date.
     *
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }
    
    /**
     * Sets the start date.
     *
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    /**
     * Gets the end date.
     *
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }
    
    /**
     * Sets the end date.
     *
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    /**
     *
     * @return
     */
    public Course getCourse()
    {
        return course;
    }
    
    /**
     *
     * @param course
     */
    public void setCourse(Course course)
    {
        this.course= course;
    }
    
    /**
     *
     * @return
     */
    public Location getLocation()
    {
        return location;
    }
    
    /**
     *
     * @param location
     */
    public void setLocation(Location location)
    {
        this.location= location;
    }
}
