package com.example.ittecnologyforum.entity;

import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

/*
VIP用户信息
 */
@Table("tb_vipinfo")
public class VIPUser extends User{
    //@Id
    private String id;//记录id
    //@Column(name = "starttime")
    private Date starttime;//开始时间
    //Column(name = "endtime")
    private Date endtime;//结束时间
}
