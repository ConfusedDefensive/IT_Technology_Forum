package com.example.ittecnologyforum.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

/*
下载记录
 */
@Table("tb_downloadinfo")
public class Download {
    @Id
    private String id;//下载记录id
    @Column("rescourseid")
    private String rescourseid;//资源id
    @Column("userid")
    private String userid;//用户id
    @Column("time")
    private Date time;//下载时间
}
