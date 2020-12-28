package kr.or.connect.jdbcRole.dto;

public class Todo {
	
	private int id;
	private String manager;
	private String regDate;
	private int priority;
	private String title;
	private String type;
	
	public Todo() {

	}
	
	public Todo(int id, String manager, String regDate, int priority, String title, String type) {
		super();
		this.id = id;
		this.manager = manager;
		this.regDate = regDate;
		this.priority = priority;
		this.title = title;
		this.type = type;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Todo [id=" + id + ", manager=" + manager + ", regdate=" + regDate +", priority=" + priority + ", title=" + title + ", type=" + type + "]";
	}
	
}