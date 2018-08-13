/**
 * 
 */
package ac.cr.cenfotec.clases;

public class Task {
	private String name;
	private int id;
	private int procedureId;
	private String description;
	private int state;
	
	public Task() {
		
	}
		

	
	
	/**
	 * @param name
	 * @param id
	 * @param procedureId
	 * @param description
	 * @param state
	 */
	public Task(String name, int id, int procedureId, String description, int state) {
		super();
		this.name = name;
		this.id = id;
		this.procedureId = procedureId;
		this.description = description;
		this.state = state;
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
	 * @return the procedureId
	 */
	public int getProcedureId() {
		return procedureId;
	}
	/**
	 * @param procedureId the procedureId to set
	 */
	public void setProcedureId(int procedureId) {
		this.procedureId = procedureId;
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
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [id=" + id + ", procedureId=" + procedureId + ", description=" + description + ", state=" + state
				+ "]";
	}	
	

}
