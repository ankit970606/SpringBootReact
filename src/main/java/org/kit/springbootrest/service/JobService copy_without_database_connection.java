// package org.kit.springbootrest.service;


// import org.kit.springbootrest.model.JobPost;
// import org.kit.springbootrest.repo.JobRepo;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.GetMapping;

// import java.util.List;

// @Service
// public class JobService {
//     @Autowired
//     private JobRepo repo;
    

//     public void addJob(JobPost jobPost) {
//         repo.addJobPost(jobPost);   //IT IS A DTO DATA TRANFER OBJECTS

//     }
//     public List<JobPost> getAllJobs(){
//         return repo.getAllJobs();

//     }
//     public JobPost getJob(int postId) {
//         return repo.getJob(postId);
//     }
//     public JobPost updateJobPost(JobPost jobPost) {
//         return repo.updateJobPost(jobPost);
//     }
//     public JobPost deleteJob(int postId) {
//        return repo.deleteJob(postId);
//     }

// }

// // List<JobPost> jobs = new ArrayList<>(Arrays.asList(
// //     new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
// //             List.of("Java", "Python")),
// //     new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
// //             List.of("HTML", "CSS", "JavaScript", "React")),
// //     new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
// //             List.of("Python", "Machine Learning", "Data Analysis"))));

