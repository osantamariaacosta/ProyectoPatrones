/**
 * 
 */
package ac.cr.cenfotec.clases;

public class Task {
	private String name;
	private int id;
	private String procedureName;
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
	public Task(String name, int id, String procedureName, String description, int state) {
		super();
		this.name = name;
		this.id = id;
		this.procedureName = procedureName;
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

	
	
	public String getDescription() {
		return description;
	}
	/**
	 * @return the procedureName
	 */
	public String getProcedureName() {
		return procedureName;
	}




	/**
	 * @param procedureName the procedureName to set
	 */
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
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


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Task [name=" + name + ", id=" + id + ", procedureName=" + procedureName + ", description=" + description
				+ ", state=" + state + "]";
	}

	

}
