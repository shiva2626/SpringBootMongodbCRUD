package com.telusko.joblisting.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class Post {

    private String description;
    private int experience;
    private String profile;
    private String techs[];

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                ", description='" + description + '\'' +
                ", experience=" + experience + '\'' +
                "profile='" + profile + '\'' +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }
    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }
}
