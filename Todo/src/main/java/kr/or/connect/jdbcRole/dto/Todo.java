package kr.or.connect.jdbcRole.dto;

public class Todo {
	
	private String title;
	private String manager;
	private int priority;

	public Todo() {

	}

	public Todo(String title, String manager, int priority) {
		super();
		this.title = title;
		this.manager = manager;
		this.priority = priority;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}
	

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Todo [title=" + title + ", manager=" + manager + ", priority=" + priority + "]";
	}
	
}