package com.workintech.sets.modals;

import com.workintech.sets.enums.Priority;
import com.workintech.sets.enums.Status;

import java.util.HashSet;
import java.util.Set;

public class TaskData extends Task{
    private Set<Task> annsTasks = new HashSet<>();
    private Set<Task> bobsTasks = new HashSet<>();
    private Set<Task> carolsTasks = new HashSet<>();

    public TaskData(String project, String description, String assignee, Status status, Priority priority) {
        super(project, description, assignee, status, priority);
    }

    public void addTasks(Task task){
        String assignee = task.getAssignee();
        switch (assignee) {
            case "ann":
                annsTasks.add(task);
                break;
            case "bob":
                bobsTasks.add(task);
                break;
            case "carol":
                carolsTasks.add(task);
                break;
            default:
                throw new IllegalArgumentException("Invalid assignee: " + assignee);
        }
    }

    public Set<Task> getTasks(String employee){
        switch (employee){
            case "ann":
                return annsTasks;
            case "bob":
                return bobsTasks;
            case "carol":
                return carolsTasks;
            case "all":
                Set<Task> allTasks = new HashSet<>();
                allTasks.addAll(annsTasks);
                allTasks.addAll(bobsTasks);
                allTasks.addAll(carolsTasks);
                return allTasks;
            default:
                throw new IllegalArgumentException("Invalid employee: " + employee);
        }
    }
}
