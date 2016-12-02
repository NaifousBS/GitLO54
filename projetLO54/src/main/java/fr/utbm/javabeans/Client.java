package fr.utbm.javabeans;

/**
 * The Class Client.
 */
public class Client {

	/** The id. */
	private int id;
	
	/** The lastname. */
	private String lastname;
	
	/** The firstname. */
	private String firstname;
	
	/** The address. */
	private String address;
	
	/** The phone. */
	private int phone;
	
	/** The email. */
	private String email;
	
	/** The course session id. */
	private int courseSessionId;
	
	/**
	 * Instantiates a new client.
	 */
	public Client() {
	}

	/**
	 * Instantiates a new client.
	 *
	 * @param id the id
	 * @param lastname the lastname
	 * @param firstname the firstname
	 * @param address the address
	 * @param phone the phone
	 * @param email the email
	 * @param courseSessionId the course session id
	 */
	public Client(int id, String lastname, String firstname, String address, int phone, String email,
			int courseSessionId) {
		super();
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.courseSessionId = courseSessionId;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phone
	 */
	public int getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the courseSessionId
	 */
	public int getCourseSessionId() {
		return courseSessionId;
	}

	/**
	 * @param courseSessionId the courseSessionId to set
	 */
	public void setCourseSessionId(int courseSessionId) {
		this.courseSessionId = courseSessionId;
	}
	
	
	
}
