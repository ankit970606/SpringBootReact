package org.kit.springbootrest.repo;

import org.kit.springbootrest.model.JobPost;
import org.kit.springbootrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost,Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc); //CONTAINING IS USED TO FIND SIMILAR WORDS ON THE TARGETED COLOUMN
  
} 