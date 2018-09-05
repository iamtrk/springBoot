package com.iamtrk.projectManager.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    String state;

    Date start;
    Date end;

    public List<UserStory> getTasks() {
        return tasks;
    }

    public void setTasks(List<UserStory> tasks) {
        this.tasks = tasks;
    }

    int duration;

    List<UserStory> tasks;

    public void addTask(UserStory userStory) {
        tasks.add(userStory);
    }

    public void removeTask(UserStory userStory) {
        tasks.remove(userStory);
    }
}
