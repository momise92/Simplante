package com.blog.simplante.web;

import com.blog.simplante.dao.UserAppRepository;
import com.blog.simplante.models.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserAppController {

    @Autowired
    UserAppRepository userAppRepository;

    /**
     * @param user
     * @return
     */
    @PostMapping
    public UserApp createUser(@RequestBody UserApp user){
        return userAppRepository.save(user);
    }
}
