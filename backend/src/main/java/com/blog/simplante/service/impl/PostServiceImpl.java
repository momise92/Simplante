package com.blog.simplante.service.impl;

import com.blog.simplante.dao.PostRepository;
import com.blog.simplante.infra.Message;
import com.blog.simplante.model.Post;
import com.blog.simplante.service.PostService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final Message messages;
    public PostServiceImpl(PostRepository postRepository, Message messages) {
        this.postRepository = postRepository;
        this.messages = messages;
    }

    @Override
    public List<Post> listPost() {
        return postRepository.findAll();
    }

    @Override
    public List<Post> listPostOrderByCreateDateDesc() {
        return postRepository.findAllByOrderByCreateDateDesc();
    }


    @Transactional
    @Override
    public Post savePost(Post post) throws Exception {
            post.setCreateDate(LocalDateTime.now());
            post.setLastModified(LocalDateTime.now());
        return postRepository.save(post);
    }


    @Override
    public Post updatePost(Long id,Post post) throws Exception {
        Optional<Post>result = postRepository.findById(id);
        if(!result.isPresent())
            throw new Exception(messages.get("POST_ID_NOTFOUND") + post.getId());
        return postRepository.save(post);
    }

    @Override
    public Post findById(Long id) throws Exception {
        return postRepository.findById(id)
                .orElseThrow(()->new Exception(messages.get("PROJECT_ID_NOTFOUND") +id));
    }

    @Override
    public Post findByTitle(String title) {
        return postRepository.findByTitle(title);
    }

    @Override
    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

    @Transactional
    @Override
    public void deleteAllPost() {
         postRepository.deleteAll();
    }

    @Override
    public Long countPost() {
        return postRepository.count();
    }
}
