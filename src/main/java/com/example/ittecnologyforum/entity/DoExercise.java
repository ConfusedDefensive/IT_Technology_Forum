package com.example.ittecnologyforum.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

/*
做题记录
 */
@Table("tb_doexercise")
public class DoExercise {
    @Id
    private String id;//做题记录id
    @Column("userid")
    private String userid;//做题用户
    @Column("subjectid")
    private String subjectid;//题目id
    @Column("reply")
    private String reply;//用户答案
    @Column("time")
    private Date time;//做题时间
}
