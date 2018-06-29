/**
 * 
 */
package ac.cr.cenfotec.clases;

public class UserAuthenticated {
	private String name;
	private String lastName;
	private int id;
	private String userName;
	private int userType;
	
	public UserAuthenticated () {
		
	}

	/**
	 * @param name
	 * @param lastName
	 * @param id
	 * @param userName
	 * @param userType
	 */
	public UserAuthenticated(String name, String lastName, int id, String userName, int userType) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.userName = userName;
		this.userType = userType;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userType
	 */
	public int getUserType() {
		return userType;
	}

	/**
	 * @param userType the userType to set
	 */
	public void setUserType(int userType) {
		this.userType = userType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserAuthenticated [name=" + name + ", lastName=" + lastName + ", id=" + id + ", userName=" + userName
				+ ", userType=" + userType + "]";
	}



			
}

