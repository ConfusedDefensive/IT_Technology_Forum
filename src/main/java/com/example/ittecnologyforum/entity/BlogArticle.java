package com.example.ittecnologyforum.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.*;

/*
博客文章信息
 */
@Table("tb_blogarticleinfo")
public class BlogArticle {
    @Id
    private String id;      //文章id
    private String title;   //文章标题
    private String content; //文章内容
    private String category;//文章所属博客类别
    private Date time;       //发布时间
    private String userid;   //发布人id
}
