package com.brunamello.siteblog.service;

import com.brunamello.siteblog.model.Post;

import java.util.List;

public interface BlogService {

    List<Post> findall();

    Post findById(long id);

    Post save(Post post);
}
