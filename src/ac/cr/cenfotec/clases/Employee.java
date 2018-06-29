package ac.cr.cenfotec.clases;

public class Employee extends User {
	private String firm;
	private int company;
	private int departamentId;

	public Employee() {

	}

	/**
	 * @param name
	 * @param lastName
	 * @param id
	 * @param password
	 * @param userName
	 * @param userType
	 */
	public Employee(
			String name, 
			String lastName, 
			int id, 
			String password,
			String userName,
			int userType,
			String firm,
			int company,
			int departamentId) {
		super(name, lastName, id, password, userName, userType);
		this.firm = firm;
		this.company = company;
		this.departamentId = departamentId;
	}

	/**
	 * @return the firm
	 */
	public String getFirm() {
		return firm;
	}

	/**
	 * @param firm the firm to set
	 */
	public void setFirm(String firm) {
		this.firm = firm;
	}

	/**
	 * @return the company
	 */
	public int getCompany() {
		return company;
	}

	/**
	 * @param company the company to set
	 */
	public void setCompany(int company) {
		this.company = company;
	}

	/**
	 * @return the departamentId
	 */
	public int getDepartamentId() {
		return departamentId;
	}

	/**
	 * @param departamentId the departamentId to set
	 */
	public void setDepartamentId(int departamentId) {
		this.departamentId = departamentId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [firm=" + firm + ", company=" + company + ", departamentId=" + departamentId + "]";
	}
	
	
}

