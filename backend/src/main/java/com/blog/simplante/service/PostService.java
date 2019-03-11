package com.blog.simplante.service;

import com.blog.simplante.model.Post;

import java.util.List;

public interface PostService {

    List<Post>listPost();
    List<Post>listPostOrderByCreateDateDesc();
    Post savePost(Post post) throws Exception;
    Post updatePost(Long id,Post post) throws Exception;
    Post findById(Long id) throws Exception;
    Post findByTitle(String title);
    void deletePost(Long id);
    void deleteAllPost();
    Long countPost();

}
