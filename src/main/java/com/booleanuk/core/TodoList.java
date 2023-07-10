package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<Task> tasks = new ArrayList<>();






    public void addTask(Task task){
        tasks.add(task);
    }


    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public String showTasks() {
        StringBuilder tasksInString = new StringBuilder();

        for (Task task :
                tasks) {
            tasksInString.append(task.printTaskName()).append("\n");
        }

        return tasksInString.toString();
    }

    public void changeStatus(Task task, boolean status) {
        if(tasks.contains(task)){
          task.setStatus(status);
        }
    }

    public boolean getTaskStatus(Task task) {
        return task.getStatus();
    }

    public ArrayList<Task> getIncompleteTasks() {
        ArrayList<Task> incompleteTasks =  new ArrayList<>();
        for (Task task :
                tasks) {
            if(!task.getStatus()){
                incompleteTasks.add(task);
            }
        }

        return incompleteTasks;
    }
}
