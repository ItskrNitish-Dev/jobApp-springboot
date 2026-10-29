package com.nitish.jobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitish.jobApp.model.JobPost;
import com.nitish.jobApp.repo.JobRepo;

@Service
public class JobService {
    @Autowired
    public JobRepo repo;


    // method to add a jobPost
    public void addJob(JobPost jobPost) {
        repo.addJob(jobPost);

    }


    //method to return all JobPosts
    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();


    }


}
