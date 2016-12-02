/**
 * 
 */
package fr.utbm.javabeans;

// TODO: Auto-generated Javadoc
/**
 * The Class Course.
 *
 * @author Souf
 */
public class Course {

	/** The code. */
	private int code;
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
	public Course(int code, String title) {
		super();
		this.code = code;
		this.title = title;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
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
