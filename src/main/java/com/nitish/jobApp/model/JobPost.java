package com.nitish.jobApp.model;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class JobPost {
    
    private int postId;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    private List<String> postTechStack;

    // 1. VITAL FIXED CONSTRUCTOR: The default no-argument constructor
    // Spring Boot uses this to create an empty object before injecting form data
    public JobPost() {
    }

    // 2. FIXED PARAMETERIZED CONSTRUCTOR: Properly mapping fields instead of 'i' or 'j'
    public JobPost(int postId, String postProfile, String postDesc, Integer reqExperience, List<String> postTechStack) {
        this.postId = postId;
        this.postProfile = postProfile;
        this.postDesc = postDesc;
        this.reqExperience = reqExperience;
        this.postTechStack = postTechStack;
    }

    // 3. Native Getters and Setters (Fully recognized by Eclipse and JSP)
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getPostProfile() {
        return postProfile;
    }

    public void setPostProfile(String postProfile) {
        this.postProfile = postProfile;
    }

    public String getPostDesc() {
        return postDesc;
    }

    public void setPostDesc(String postDesc) {
        this.postDesc = postDesc;
    }

    public Integer getReqExperience() {
        return reqExperience;
    }

    public void setReqExperience(Integer reqExperience) {
        this.reqExperience = reqExperience;
    }

    public List<String> getPostTechStack() {
        return postTechStack;
    }

    public void setPostTechStack(List<String> postTechStack) {
        this.postTechStack = postTechStack;
    }
}