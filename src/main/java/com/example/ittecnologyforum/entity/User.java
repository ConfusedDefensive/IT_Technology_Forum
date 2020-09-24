package com.example.ittecnologyforum.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

/*
用户信息
 */
@Entity
@Table(name = "tb_userinfo")
public class User {
    @Id
    private String account;//用户id或用户账号
    @Column(name = "password")
    private String password;//账户密码
    @Column(name = "nickname")
    private String nickname;//用户昵称
    @Column(name = "avatarurl")
    private String avatarurl;//头像图片路径
    @Column(name = "gender")
    private String gender;//性别
    @Column(name = "power")
    private int power;//用户权限，1为普通用户，2为VIP用户，3为管理员
    @Column(name = "activation")
    private int activation;//激活状态，0为未激活，1为激活
    @JsonIgnore
    @OneToMany(mappedBy = "user",fetch=FetchType.EAGER)
    private Collection<Post> postlist;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatarurl() {
        return avatarurl;
    }

    public void setAvatarurl(String avatarurl) {
        this.avatarurl = avatarurl;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getActivation() {
        return activation;
    }

    public void setActivation(int activation) {
        this.activation = activation;
    }

    public Collection<Post> getPostlist() {
        return postlist;
    }

    public void setPostlist(Collection<Post> postlist) {
        this.postlist = postlist;
    }
}
