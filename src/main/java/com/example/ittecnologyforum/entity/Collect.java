package com.example.ittecnologyforum.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

/*
收藏信息
 */
@Table("tb_collectioninfo")
public class Collect {
    @Id
    private String id;//收藏id
    @Column("userid")
    private String userid;//收藏用户id
    @Column("objectid")
    private String objectid;//收藏对象id
    @Column("category")
    private int category;//对象类别，1代表用户，2代表博客文章，3代表帖子
    @Column("time")
    private Date time;//收藏时间
}
