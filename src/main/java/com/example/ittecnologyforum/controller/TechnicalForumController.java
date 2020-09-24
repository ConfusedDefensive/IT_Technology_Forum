package com.example.ittecnologyforum.controller;

import com.example.ittecnologyforum.entity.Collect;
import com.example.ittecnologyforum.entity.Follow;
import com.example.ittecnologyforum.entity.Post;
import com.example.ittecnologyforum.entity.Topic;
import com.example.ittecnologyforum.service.TechnicalForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/technicalforum/")
public class TechnicalForumController {

    @Autowired
    private TechnicalForumService tfService;

    //    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
//    public ResponseEntity<Post> posts(){
//
//        clinicService.addOwner(owner);
//        return new ResponseEntity<Owner>(HttpStatus.CREATED);
//    }
    /*
     *  热门话题推送
     */
    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Topic>> hottopicpush(String userid) {
        Collection<Topic> topics;
        topics = tfService.findHotPosts(userid);
        if (topics == null || topics.isEmpty()) {
            return new ResponseEntity<Collection<Topic>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Collection<Topic>>(topics, HttpStatus.OK);
    }

    /*
     *  关注用户信息
     */
    @RequestMapping(value = "followuser", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Follow>> followuser(String userid){
        Collection<Follow> follows;
        follows = tfService.findFollowUserById(userid);
        if (follows==null||follows.isEmpty()) {
            return new ResponseEntity<Collection<Follow>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Collection<Follow>>(follows, HttpStatus.OK);
    }

    /*
     *  关注话题信息
     */
    @RequestMapping(value = "followtopic", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Topic>> followtopic(String userid){
        Collection<Topic> topics;
        topics = tfService.findFollowTopicById(userid);
        if (topics==null||topics.isEmpty()) {
            return new ResponseEntity<Collection<Topic>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Collection<Topic>>(topics, HttpStatus.OK);
    }

    /*
     *  收藏帖子信息
     */
    @RequestMapping(value = "collectposts", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Collect>> collectposts(String userid){
        Collection<Collect> collections;
        collections = tfService.findCollectionById(userid);
        if (collections==null||collections.isEmpty()) {
            return new ResponseEntity<Collection<Collect>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Collection<Collect>>(collections, HttpStatus.OK);
    }

    /*
     *  帖子列表信息
     */
    @RequestMapping(value = "postlist", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Topic>> postlists(String category) {
        Collection<Topic> topics;
        topics = tfService.findPostsByCategory(category);
        if (topics == null || topics.isEmpty()) {
            return new ResponseEntity<Collection<Topic>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Collection<Topic>>(topics, HttpStatus.OK);
    }

    /*
     *  我的帖子
     */
    @RequestMapping(value = "myposts", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Post>> myposts(String userid){
        Collection<Post> posts;
        posts = tfService.findPostsById(userid);
        if (posts==null||posts.isEmpty()) {
            return new ResponseEntity<Collection<Post>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Collection<Post>>(posts, HttpStatus.OK);
    }

    /*
     *  我的回帖
     */
    @RequestMapping(value = "myreplyposts", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Post>> myreplyposts(String userid){
        Collection<Post> posts;
        posts = tfService.findReplyPostsById(userid);
        if (posts==null||posts.isEmpty()) {
            return new ResponseEntity<Collection<Post>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Collection<Post>>(posts, HttpStatus.OK);
    }

    /*
     *  帖子详情
     */
    @RequestMapping(value = "post", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Collection<Post>> post(String id) {
        Collection<Post> posts;
        if (id == null) {
            posts = tfService.getAllPosts();
        } else {
            posts = tfService.findPostById(id);
        }
        if (posts == null || posts.isEmpty()) {
            return new ResponseEntity<Collection<Post>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Collection<Post>>(posts, HttpStatus.OK);
    }

}
