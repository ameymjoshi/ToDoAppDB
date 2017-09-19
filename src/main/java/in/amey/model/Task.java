package in.amey.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Task {

	@Id
	private String taskName;
	private String taskDesc;
	private boolean done;
	
	public Task(String name, String desc, boolean done) {
		super();
		this.taskName = name;
		this.taskDesc = desc;
		this.done = done;
	}
		
	public Task(){
		
	}
	
	public String getName() {
		return taskName;
	}

	public void setName(String name) {
		this.taskName = name;
	}

	public String getDesc() {
		return taskDesc;
	}

	public void setDesc(String desc) {
		this.taskDesc = desc;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	
}
