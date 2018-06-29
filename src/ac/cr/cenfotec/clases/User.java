/**
 * 
 */
package ac.cr.cenfotec.clases;

public class User {
	protected String name;
	protected String lastName;
	protected int id;
	protected String password; 
	protected String userName;
	protected int userType;
	/**
	 * 
	 */
	public User() {

	}
	/**
	 * @param name
	 * @param lastName
	 * @param id
	 * @param password
	 * @param userName
	 * @param userType
	 */
	public User(String name, String lastName, int id, String password, String userName, int userType) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.password = password;
		this.userName = userName;
		this.userType = userType;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name=" + name + ", lastName=" + lastName + ", id=" + id + ", password=" + password + ", userName="
				+ userName + ", userType=" + userType + "]";
	}

	
}
