package com.brunamello.siteblog.repository;

import com.brunamello.siteblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogDepository extends JpaRepository<Post, Long> {
}
