package com.songjang.webservice.posts.repository;

import com.songjang.webservice.posts.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
