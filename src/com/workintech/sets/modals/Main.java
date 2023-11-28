package com.workintech.sets.modals;

import com.workintech.sets.enums.Priority;
import com.workintech.sets.enums.Status;

import java.util.Set;

public class Main {


    public static void main(String[] args) {

        TaskData taskData = new TaskData("RPG GAME", "Diablo IV", "bob", Status.IN_PROGRESS, Priority.HIGH);


        Task task1 = new Task("ProjectA", "TaskA", "ann", Status.IN_QUEUE, Priority.HIGH);
        Task task2 = new Task("ProjectB", "TaskB", "bob", Status.ASSIGNED, Priority.NORMAL);
        Task task3 = new Task("ProjectC", "TaskC", "carol", Status.IN_PROGRESS, Priority.LOW);


        taskData.addTasks(task1);
        taskData.addTasks(task2);
        taskData.addTasks(task3);


        Set<Task> allTasks = taskData.getTasks("all");
        System.out.println("All tasks:");
        for (Task task : allTasks) {
            System.out.println("Project: " + task.getProject() +
                    ", Description: " + task.getDescription() +
                    ", Assignee: " + task.getAssignee() +
                    ", Priority: " + task.getPriority() +
                    ", Status: " + task.getStatus());
        }
    }
}
