// package org.kit.springbootrest.repo;

// import org.kit.springbootrest.model.JobPost;
// import org.springframework.stereotype.Repository;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// @Repository
// public class JobRepo {

//     List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//             new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//                     List.of("Java", "Python")),
//             new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3,
//                     List.of("HTML", "CSS", "JavaScript", "React")),
//             new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//                     List.of("Python", "Machine Learning", "Data Analysis"))));

//     public List<JobPost> getAllJobs() {
//         return jobs;
//     }

//     // method to save a job post object into arrayList
//     public void addJobPost(JobPost job) {
//         jobs.add(job);
//         // System.out.println(jobs);
//     }

//     public JobPost getJob(int postId) {
//         for (JobPost job : jobs) {
//             if (job.getPostId() == postId) {
//                 return job;
//             }
//         }
//         return null;
//     }

//     public JobPost updateJobPost(JobPost jobPost) {
//         for (JobPost jobPost1 :jobs){
//             if(jobPost1.getPostId() == jobPost.getPostId()){
//                 jobPost1.setPostId(jobPost.getPostId());
//                 jobPost1.setPostProfile(jobPost.getPostProfile());
//                 jobPost1.setPostDesc(jobPost.getPostDesc());
//                 jobPost1.setReqExperience(jobPost.getReqExperience());
//                 jobPost1.setPostTechStack(jobPost.getPostTechStack());
//                 return jobPost1;
//             }
//         }return null;
//     }

//     public JobPost deleteJob(int postId) {
//         for (JobPost jobPost1 :jobs){
//             if(jobPost1.getPostId() == postId){
            
//                 jobs.remove(jobPost1);
//                 return jobPost1;
//             }
//         }return null;
//     }
   
// }
