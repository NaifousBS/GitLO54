/**
 * 
 */
package fr.utbm.javabeans;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class CourseSession.
 *
 * @author Souf
 */
public class CourseSession {

	/** The id. */
	private int id;
	
	/** The start date. */
	private Date startDate;
	
	/** The end date. */
	private Date endDate;
	
	/** The course code. */
	private int courseCode;
	
	/** The location id. */
	private int locationId;
	
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
	 * @param courseCode the course code
	 * @param locationId the location id
	 */
	public CourseSession(int id, Date startDate, Date endDate, int courseCode, int locationId) {
		super();
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.courseCode = courseCode;
		this.locationId = locationId;
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
	 * Gets the course code.
	 *
	 * @return the courseCode
	 */
	public int getCourseCode() {
		return courseCode;
	}

	/**
	 * Sets the course code.
	 *
	 * @param courseCode the courseCode to set
	 */
	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	/**
	 * Gets the location id.
	 *
	 * @return the locationId
	 */
	public int getLocationId() {
		return locationId;
	}

	/**
	 * Sets the location id.
	 *
	 * @param locationId the locationId to set
	 */
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	
	
	
}
