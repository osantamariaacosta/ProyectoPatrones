/**
 * 
 */
package ac.cr.cenfotec.clases;

public class Department {
	private String name; 
	private int id; 
	private String description;
	private int companyId;

	
	public Department() {
		
	}

	/**
	 * @param name
	 * @param id
	 * @param description
	 * @param companyId
	 */
	public Department(String name, int id, String description, int companyId) {
		this.name = name;
		this.id = id;
		this.description = description;
		this.companyId = companyId;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	
	
	
	

}
