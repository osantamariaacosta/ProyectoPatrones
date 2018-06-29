package ac.cr.cenfotec.clases;

public class Admin extends User {
	private int companyId;

	/**
	 * 
	 */
	public Admin() {
	}

	/**
	 * @param name
	 * @param lastName
	 * @param id
	 * @param password
	 * @param userName
	 * @param userType
	 */
	public Admin(
				String name,
				String lastName, 
				int id, 
				String password,
				String userName, 
				int userType,
				int companyId) {
		super(name, lastName, id, password, userName, userType);
		this.companyId = companyId;
	}

	/**
	 * @return the companyId
	 */
	public int getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [companyId=" + companyId + "]";
	}

	
}

