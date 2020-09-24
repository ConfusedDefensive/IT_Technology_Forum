package com.example.ittecnologyforum.entity;

import javax.persistence.*;
import java.util.Collection;

/*
论坛话题信息
 */
@Entity
@Table(name = "tb_topicinfo")
public class Topic {
    @Id
    private String id;//论坛话题id
    @Column(name = "category")
    private String category;//话题名称
    @OneToMany(mappedBy = "topic",fetch=FetchType.EAGER)
    private Collection<Post> postlist;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Collection<Post> getPostlist() {
        return postlist;
    }

    public void setPostlist(Collection<Post> postlist) {
        this.postlist = postlist;
    }
}
