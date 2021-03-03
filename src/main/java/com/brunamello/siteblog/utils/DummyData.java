package com.brunamello.siteblog.utils;

import com.brunamello.siteblog.model.Post;
import com.brunamello.siteblog.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//@Component
//public class DummyData {
//
//    @Autowired
//    BlogRepository blogRepository;
//
//    @PostConstruct
//    public void savaPosts(){
//
//        List<Post> postList = new ArrayList<>();
//
//        Post post1 = new Post();
//        post1.setAutor("Bruna Mello");
//        post1.setCategoria("Programação");
//        post1.setSub_categoria("Java");
//        post1.setTexto("testtesttesttesttesttesttesttesttesttest");
//        post1.setTitulo("Primeiro Post");
//
//        postList.add(post1);
//
//        for (Post post: postList){
//            Post postSaved = blogRepository.save(post);
//            System.out.println(postSaved.getId());
//        }
//
//
//    }
//}
