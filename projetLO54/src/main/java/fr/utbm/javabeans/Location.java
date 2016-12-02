package fr.utbm.javabeans;

// TODO: Auto-generated Javadoc
/**
 * The Class Location.
 */
public class Location {
	
	/** The id. */
	private int id;
	
	/** The city. */
	private String city;
	
	/**
	 * Instantiates a new location.
	 */
	public Location() {
	}

	/**
	 * Instantiates a new location.
	 *
	 * @param id the id
	 * @param city the city
	 */
	public Location(int id, String city) {
		super();
		this.id = id;
		this.city = city;
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
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city.
	 *
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
