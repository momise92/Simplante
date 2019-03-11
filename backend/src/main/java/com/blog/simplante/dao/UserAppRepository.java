package com.blog.simplante.dao;

import com.blog.simplante.model.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAppRepository extends JpaRepository<UserApp,Long> {
    UserApp findByUsername(String username);
}
