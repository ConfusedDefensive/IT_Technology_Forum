package com.example.ittecnologyforum.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/*
博客分类信息
 */
@Table("tb_bloginfo")
public class Blog {
    @Id
    private String id;
    private String category;
}
