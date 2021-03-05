package com.brunamello.siteblog.controller;

import com.brunamello.siteblog.model.Post;
import com.brunamello.siteblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Configuration
@RequestMapping("/posts")
public class PostsController {

    @Autowired
    BlogService blogService;

    @GetMapping
    public ModelAndView getPosts() {
        ModelAndView mv = new ModelAndView("posts");
        List<Post> posts = blogService.findall();
        mv.addObject("posts", posts);
        return mv;
    }

}
