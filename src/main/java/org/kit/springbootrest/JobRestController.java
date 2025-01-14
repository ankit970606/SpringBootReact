package org.kit.springbootrest;

import org.kit.springbootrest.model.JobPost;
import org.kit.springbootrest.model.User;
import org.kit.springbootrest.service.JobService;
import org.kit.springbootrest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@CrossOrigin("http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;



    @GetMapping("jobPosts")
    // @ResponseBody  IF WE ARE USING RESTCONTROLLER THEN NO NEED TO GIVE THIS ONLY WHEN WE ARE GIVING @CONTROLLER THEN ONLY WE NEED THIS 
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }


    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId) {
    return service.getJob(postId);
    }


    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {  
        service.addJob(jobPost);
    return service.getJob(jobPost.getPostId());
    }


    @PutMapping("jobPost")
    public JobPost updatePost(@RequestBody JobPost jobPost) {
        service.updateJobPost(jobPost);
        return service.getJob(jobPost.getPostId());
    }


    @DeleteMapping("jobPost/{postId}")
    public String deletePost(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "Deleted post with id: " + postId;
    }

    @GetMapping("load")
    public String load() {
        service.loadData();
        return "SUCCESS";
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword")String keyword) {
        return service.seacrch(keyword);
    }
    
    
    
}
