/**
 * 
 */
package ac.cr.cenfotec.clases;

import java.util.ArrayList;

public class Company {
	private int legalNumber;
	private String name;
	private String description;
	private ArrayList<Department> departmentList;
	/**
	 * @param legalNumber
	 * @param name
	 * @param description
	 */
	
	public Company() {		
	}
	
	public Company(int legalNumber, String name, String description) {
		this.legalNumber = legalNumber;
		this.name = name;
		this.description = description;
	}

	/**
	 * @return the legalNumber
	 */
	public int getLegalNumber() {
		return legalNumber;
	}

	/**
	 * @param legalNumber the legalNumber to set
	 */
	public void setLegalNumber(int legalNumber) {
		this.legalNumber = legalNumber;
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
	 * @return the departmentList
	 */
	public ArrayList<Department> getDepartmentList() {
		return departmentList;
	}

	/**
	 * @param departmentList the departmentList to set
	 */
	public void setDepartmentList(ArrayList<Department> departmentList) {
		this.departmentList = departmentList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Company [legalNumber=" + legalNumber + ", name=" + name + ", description=" + description
				+ ", departmentList=" + departmentList + "]";
	}

	
}
