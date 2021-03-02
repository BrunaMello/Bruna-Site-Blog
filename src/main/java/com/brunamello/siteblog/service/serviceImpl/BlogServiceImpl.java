package com.brunamello.siteblog.service.serviceImpl;

import com.brunamello.siteblog.model.Post;
import com.brunamello.siteblog.repository.BlogDepository;
import com.brunamello.siteblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogDepository blogDepository;


    @Override
    public List<Post> findall() {
        return blogDepository.findAll();
    }

    @Override
    public Post findById(long id){
        return blogDepository.findById(id).get();
    }

    @Override
    public Post save(Post post){
        return blogDepository.save(post);
    }

}
