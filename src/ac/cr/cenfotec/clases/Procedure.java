package ac.cr.cenfotec.clases;

import java.util.ArrayList;

public class Procedure {
	private String name;
	private int id;
	private int companyId;
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
	public Procedure(String name, int id, int companyId, String description, ArrayList<Task> tasksList) {
		this.name = name;
		this.id = id;
		this.companyId = companyId;
		this.description = description;
		this.tasksList = tasksList;
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
		return "Procedure [name=" + name + ", id=" + id + ", companyId=" + companyId + ", description=" + description
				+ ", tasksList=" + tasksList + "]";
	}

			
}
