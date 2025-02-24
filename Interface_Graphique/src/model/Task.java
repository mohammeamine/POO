package model;

public class Task {
	
	private String description;

    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false; // Par défaut, une tâche est non terminée
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void toggleCompletion() {
        this.isCompleted = !this.isCompleted;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[✔] " : "[ ] ") + description;
    }

	public void setCompleted(boolean b) {
		
		
	}
}
