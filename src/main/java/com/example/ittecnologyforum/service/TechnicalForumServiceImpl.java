package com.example.ittecnologyforum.service;

import com.example.ittecnologyforum.entity.Collect;
import com.example.ittecnologyforum.entity.Follow;
import com.example.ittecnologyforum.entity.Post;
import com.example.ittecnologyforum.entity.Topic;
import com.example.ittecnologyforum.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class TechnicalForumServiceImpl implements TechnicalForumService {

    private PostRepository postRepo;
    private TopicRepository topicRepo;
    private FollowRepository followRepo;
    private CollectRepository collectionRepo;
    private BrowseRepository browseRepo;

    @Autowired
    public TechnicalForumServiceImpl(PostRepository postRepo, TopicRepository topicRepo, FollowRepository followRepo,
                                     CollectRepository collectionRepo, BrowseRepository browseRepo) {
       this.postRepo = postRepo;
       this.collectionRepo = collectionRepo;
       this.topicRepo = topicRepo;
       this.followRepo = followRepo;
       this.browseRepo = browseRepo;
    }

    @Override
    public Collection<Post> getAllPosts() {
        //return (Collection<Post>) postRepo.findAll();
        return null;
    }

    @Override
    public Collection<Topic> findPostsByCategory(String category) {
        return null;
    }
    /*
     * 得到热门话题
     */
    @Override
    public Collection<Topic> findHotPosts(String userid) {
        List<String> category = followRepo.findTopicByUserId(userid);
        //if(category.size()>0) System.out.println("不为0");
        Collection<Topic> topics = null;
        if(category.isEmpty()){
            topics = topicRepo.queryHotTopic();
        }else{
            System.out.println("不为0");
            topics = topicRepo.queryHotTopicByCategory(category);
        }
        return topics;
    }

    @Override
    public Collection<Post> findPostsById(String id) {
        return null;
    }

    @Override
    public Collection<Follow> findFollowUserById(String userid) {
        return null;
    }

    @Override
    public Collection<Topic> findFollowTopicById(String userid) {
        return null;
    }

    @Override
    public Collection<Collect> findCollectionById(String userid) {
        return null;
    }

    @Override
    public Collection<Post> findReplyPostsById(String userid) {
        return null;
    }

    @Override
    public Collection<Post> findPostById(String id) {
        return null;
    }

    @Override
    public Collection<Post> findPostsByTitle(String title) {
        return null;
    }

    @Override
    public int addPost(Post post) {
        return 0;
    }

    @Override
    public int deletePost(String id) {
        return 0;
    }

    @Override
    public int likePost(String id) {
        return 0;
    }

    @Override
    public int addbrowsePost(String id) {
        return 0;
    }

    @Override
    public int deleteCollectPost(String id) {
        return 0;
    }

    @Override
    public int deleteFollow(String id, int flag) {
        return 0;
    }
}
