package todo;

public class ToDoItem {
	private String title;
	private String description;
	private boolean completed;

	public ToDoItem(String title, String description) {
		this.title = title;
		this.description = description;
		this.completed = false;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void markAsCompleted() {
		this.completed = true;
	}

	@Override
	public String toString() {
		return "Title: " + title + ", Description: " + description + ", Completed: " + completed;
	}
}