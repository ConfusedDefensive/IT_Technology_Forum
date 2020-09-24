package com.example.ittecnologyforum.entity;

import javax.persistence.*;
import java.util.Date;

/*
评论信息
 */
@Entity
@Table(name = "tb_comment")
public class Comment {
    @Id
    private String id;//评论id
    @Column(name = "content")
    private String content;//评论内容
    @Column(name = "userid")
    private String userid;//评论用户id
    @Column(name = "time")
    private Date time;//发布时间
    @Column(name = "objectid")
    private String objectid;//评论对象id
    @Column(name = "category")
    private int catetory;//对象类别，1代表博客文章，2代表题库
}
