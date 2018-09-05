package com.iamtrk.projectManager.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserStory {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    int priority;
    String title;

    public int getPriority() {
        return priority;
    }

    String description;

    int effortEstimate;

    public int getEffortEstimate() {
        return effortEstimate;
    }

    public void setEffortEstimate(int effortEstimate) {
        this.effortEstimate = effortEstimate;
    }

    List<User> people;

    public UserStory(String title) {
        this.title = title;
        people = new ArrayList<>();
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addPeople(User user) {
        people.add(user);
    }

    public void removeUser(User user) {
        people.remove(user);
    }
}
