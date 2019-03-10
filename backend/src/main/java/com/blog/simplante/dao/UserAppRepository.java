package com.blog.simplante.dao;

import com.blog.simplante.models.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAppRepository extends JpaRepository<UserApp,Long> {
}
