package controle;


import vue.TaskView;
import java.util.ArrayList;
import java.util.List;

import model.Task;
import vue.TaskView;
import java.util.ArrayList;
import java.util.List;

public class TaskController {
    private List<Task> taskList;
    private TaskView taskView;

    public TaskController(TaskView taskView) {
        this.taskList = new ArrayList<>();
        this.taskView = taskView;
    }


	// Ajoute une nouvelle tâche
    public void addTask(String description) {
        if (!description.isEmpty()) {
            taskList.add(new Task(description));
            taskView.updateTaskList(taskList);
        }
    }

    // Supprime une tâche à l'index donné
    public void removeTask(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.remove(index);
            taskView.updateTaskList(taskList);
        }
    }

    // Bascule l'état de complétion d'une tâche
    public void toggleTaskCompletion(int index) {
        if (index >= 0 && index < taskList.size()) {
            taskList.get(index).toggleCompletion();
            taskView.updateTaskList(taskList);
        }
    }

    // Retourne la liste des tâches
    public List<Task> getTaskList() {
        return taskList;
    }
}