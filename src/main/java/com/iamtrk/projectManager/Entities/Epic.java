package com.iamtrk.projectManager.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Epic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    String name;
    List<UserStory> userStories;

    public void addUserStroy(UserStory userStory) {
        userStories.add(userStory);
    }

    public void removeUserStroy(UserStory userStory) {
        userStories.remove(userStory);
    }
}
