package com.example.ittecnologyforum.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;

/*
浏览信息
 */
@Table("tb_browseinfo")
public class Browse {
    @Id
    private String id;//浏览信息id
    private String userid;//浏览用户id
    private Date time;//浏览时间
    private String objectid;//浏览对象id
    private int catetory;//对象类别，1代表博客文章，2代表帖子，3代表评论
    private int islike;//是否点赞，0代表未点赞，1代表已点赞
}
