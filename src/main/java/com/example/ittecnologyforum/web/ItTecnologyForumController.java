package com.example.ittecnologyforum.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItTecnologyForumController {

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @RequestMapping("/technicalforum")
    public String technicalforum() {
        return "technicalforum/forumhomepage";
    }

    @RequestMapping("/technicalforum/forumhelp")
    public String myforumhelp() {
        return "technicalforum/forumhelp";
    }

    @RequestMapping("/technicalforum/forumselection")
    public String forumselection() {
        return "technicalforum/forumselection";
    }

    @RequestMapping("/technicalforum/mycollection")
    public String mycollection(){
        return "technicalforum/mycollection";
    }

    @RequestMapping("/technicalforum/myfollow")
    public String myfollow(){
        return "technicalforum/myfollow";
    }

    @RequestMapping("/technicalforum/mypost")
    public String mypost(){
        return "technicalforum/mypost";
    }

    @RequestMapping("/technicalforum/myreplypost")
    public String myreplypost(){
        return "technicalforum/myreplypost";
    }

    @RequestMapping("/technicalforum/postlist")
    public String postlist(){
        return "technicalforum/postlist";
    }

    @RequestMapping("/technicalforum/postmanage")
    public String postmanage(){
        return "technicalforum/postmanage";
    }

    @RequestMapping("/technicalforum/topicmanage")
    public String topicmanage(){
        return "technicalforum/topicmanage";
    }

    @RequestMapping("/technicalforum/writepost")
    public String writepost(){
        return "technicalforum/writepost";
    }

    @RequestMapping("/technicalforum/postdetail")
    public String postdetail(){
        return "technicalforum/postdetail";
    }

}
