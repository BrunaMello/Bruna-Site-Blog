package com.brunamello.siteblog.service.serviceImpl;

import com.brunamello.siteblog.model.Post;
import com.brunamello.siteblog.repository.BlogRepository;
import com.brunamello.siteblog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;


    @Override
    public List<Post> findall() {
        return blogRepository.findAll();
    }

    @Override
    public Post findById(long id){
        return blogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post){
        return blogRepository.save(post);
    }

}
