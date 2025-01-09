package org.kit.springbootrest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;


//SINCE WE ARE USING LIBRARY IN POM.XML SO WE ARE NOT CREATING GETTER AND STTER IT WILL AUTOMATICALLY TAKEN CARE BY @Data
@Data
@NoArgsConstructor //THIS TWO WILL TAKE CARE OF THE ALL CONSTRUCTION WORK
@AllArgsConstructor
@Component
@Entity
public class JobPost {
    @Id
    private int postId;
    private String postProfile;
    private String postDesc;
    private int reqExperience;
    private List<String> postTechStack;





}
