package org.kit.springbootrest.service;


import org.kit.springbootrest.model.User;
import org.kit.springbootrest.model.UserPrinciple;
import org.kit.springbootrest.repo.JobRepo;
import org.kit.springbootrest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class userDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       User user= repo.findByUsername(username);
       if (user == null) {
           System.out.println("user not found (404)");
           throw new UsernameNotFoundException(username);
       }
        return new UserPrinciple(user);
    }
}
