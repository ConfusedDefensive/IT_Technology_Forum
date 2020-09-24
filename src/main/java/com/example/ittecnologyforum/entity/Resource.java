package com.example.ittecnologyforum.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

/*
资源信息
 */
@Table("tb_resouceinfo")
public class Resource {
    @Id
    private String id;//资源id
    @Column("title")
    private String title;//资源标题
    @Column("path")
    private String path;//资源路径
    @Column("isvip")
    private int isvip;//是否需要VIP才能下载，0代表否，1代表是
    @Column("userid")
    private String userid;//上传用户id
    @Column("time")
    private Date time;//上传时间
}
