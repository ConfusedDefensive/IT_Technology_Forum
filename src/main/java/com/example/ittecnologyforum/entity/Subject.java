package com.example.ittecnologyforum.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

/*
题目信息
 */
@Table("tb_subjectinfo")
public class Subject {
    @Id
    private String id;//题目id
    @Column("content")
    private String content;//题目内容
    @Column("answer")
    private String answer;//题目答案
    @Column("category")
    private String category;//题目类别
}
