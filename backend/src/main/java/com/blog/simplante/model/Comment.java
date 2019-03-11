package com.blog.simplante.model;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    @Column(name = "body", columnDefinition = "TEXT", length = 350)
    @NotEmpty(message = "*Please write something")
    private String body;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createDate;


    private Long postId;

    @ManyToOne
    @JoinColumn(name = "postId", referencedColumnName = "post_id", insertable = false,updatable = false)
    private Post post;

    private Long userId;

    @ManyToOne
    @JoinColumn(name = "userId", referencedColumnName = "user_id", insertable = false,updatable = false)
    private UserApp user;



    public Comment() {
    }

    public Comment(@NotEmpty(message = "*Please write something") String body, @NotNull Post post, @NotNull UserApp user) {
        this.body = body;
        this.post = post;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getPostId() { return postId; }

    public void setPostId(Long postId) { this.postId = postId; }

    public Long getUserId() { return userId; }

    public void setUserId(Long userId) { this.userId = userId; }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public UserApp getUser() {
        return user;
    }

    public void setUser(UserApp user) {
        this.user = user;
    }
}
