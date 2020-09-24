package com.example.ittecnologyforum.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/*
论坛帖子信息
 */
@Entity
@Table(name = "tb_postinfo")
public class Post{
    @Id
    @Column(name = "id")
    private String id;//帖子id
    @Column(name = "title")
    private String title;//帖子标题
    @Column(name = "content")
    private String content;//帖子内容
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "topicid")
    private Topic topic;
    @ManyToOne
    @JoinColumn(name = "userid")
    private User user;
    @Column(name = "time")
    private Date time;//发布时间
    @Column(name = "replyid")
    private String replyid;//所回帖id，若为空则代表该帖子即为首帖，否则为回帖,该id表示所回帖的id
    @Column(name = "pageviews")
    private int pageviews;
    @Column(name = "likenum")
    private int likenum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReplyid() {
        return replyid;
    }

    public void setReplyid(String replyid) {
        this.replyid = replyid;
    }

    public int getPageviews() {
        return pageviews;
    }

    public void setPageviews(int pageviews) {
        this.pageviews = pageviews;
    }

    public int getLikenum() {
        return likenum;
    }

    public void setLikenum(int likenum) {
        this.likenum = likenum;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
