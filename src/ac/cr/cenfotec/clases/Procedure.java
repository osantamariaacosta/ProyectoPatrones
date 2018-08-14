package ac.cr.cenfotec.clases;

import java.util.ArrayList;

public class Procedure {
	private String name;
	private String companyId;
	private String description;
	private ArrayList<Task> tasksList;
	
	public Procedure() {
		
	}

	/**
	 * @param name
	 * @param id
	 * @param companyId
	 * @param description
	 * @param tasksList
	 */
	public Procedure(String name, String companyId, String description) {
		this.name = name;
		this.companyId = companyId;
		this.description = description;
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
	 * @return the companyId
	 */
	public String getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
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
	 * @return the tasksList
	 */
	public ArrayList<Task> getTasksList() {
		return tasksList;
	}

	/**
	 * @param tasksList the tasksList to set
	 */
	public void setTasksList(ArrayList<Task> tasksList) {
		this.tasksList = tasksList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Procedure [name=" + name + ", companyId=" + companyId + ", description=" + description + ", tasksList="
				+ tasksList + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */


			
}
