package com.blog.simplante.models;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Post {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long id;

    @Column(nullable = false, unique=true)
    @Length(min = 5, max = 50, message = "*Your title must have at least 5 characters")
    private String title;

    @Column(nullable = false)
    private String body;


    @Column(name = "create_date")
    private LocalDateTime createDate = LocalDateTime.now();


    @Column(name = "last_modified")
    private LocalDateTime lastModified;

    private int vote;

    @Column(nullable = false)
    private Boolean status = false;

    @ManyToOne
    private UserApp user;

    @ManyToOne
    @JoinColumn(name = "categorie_id", referencedColumnName = "categorie_id")
    private Category category;

    @OneToMany(mappedBy = "post", cascade = CascadeType.REMOVE)
    private Set<Comment> comments = new HashSet<>();

    public Post(){

    }

    public Post(String title, String body, LocalDateTime createDate, LocalDateTime lastModified, int vote, Boolean status,
                UserApp user, Category category, Set<Comment> comments) {
        this.title = title;
        this.body = body;
        this.createDate = createDate;
        this.lastModified = lastModified;
        this.vote = vote;
        this.status = status;
        this.user = user;
        this.category = category;
        this.comments = comments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public UserApp getUser() {
        return user;
    }

    public void setUser(UserApp user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }
}
