package com.blog.simplante;

import com.blog.simplante.dao.UserAppRepository;
import com.blog.simplante.models.UserApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimplanteApplicationTests {

    @Autowired
    UserAppRepository userAppRepository;
    @Test
    public void contextLoads() {

            UserApp user = new UserApp();
            user.setName("Test");
            user.setEmail("test@gmail.com");
            userAppRepository.save(user);
    }

}
