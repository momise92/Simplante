package com.blog.simplante.dao;

import com.blog.simplante.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findAllByOrderByCreateDateDesc();
    Post findByTitle(String title);
}
