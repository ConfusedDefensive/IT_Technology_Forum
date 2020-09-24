package com.example.ittecnologyforum.entity;

import javax.persistence.*;
import java.util.Date;

/*
关注信息
 */
@Entity
@Table(name = "tb_followinfo")
public class Follow {
    @Id
    private String id;//关注id
    @Column(name = "userid")
    private String userid;//用户id
    @Column(name = "objectid")
    private String objectid;//关注对象id
    @Column(name = "category")
    private int category;//对象类别，1代表用户，2代表博客类别，3代表论坛话题
    @Column(name = "time")
    private Date time;//关注时间

}
