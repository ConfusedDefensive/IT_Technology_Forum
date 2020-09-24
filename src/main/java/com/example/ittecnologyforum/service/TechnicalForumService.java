package com.example.ittecnologyforum.service;

import com.example.ittecnologyforum.entity.Follow;
import com.example.ittecnologyforum.entity.Post;
import com.example.ittecnologyforum.entity.Topic;
import com.example.ittecnologyforum.entity.Collect;

import java.util.Collection;

public interface TechnicalForumService {
    Collection<Post> getAllPosts();//得到所有帖子
    Collection<Topic> findPostsByCategory(String category);//根据话题类别得到帖子
    Collection<Topic> findHotPosts(String userid);//当前话题的热门帖子
    Collection<Post> findPostsById(String userid);//根据用户id得到帖子信息
    Collection<Follow> findFollowUserById(String userid);//根据用户id得到关注用户信息
    Collection<Topic> findFollowTopicById(String userid);//根据用户id得到关注话题信息
    Collection<Collect> findCollectionById(String userid);//根据用户id得到收藏帖子信息
    Collection<Post> findReplyPostsById(String userid);//根据用户id得到用户回帖
    Collection<Post> findPostById(String id);//根据帖子id得到帖子详情信息
    Collection<Post> findPostsByTitle(String title);//根据帖子标题得到帖子信息
    int addPost(Post post);//添加帖子
    int deletePost(String id);//删除帖子
    int likePost(String id);//点赞
    int addbrowsePost(String id);//浏览
    int deleteCollectPost(String id);//删除收藏
    int deleteFollow(String id,int flag);//取消关注
}
