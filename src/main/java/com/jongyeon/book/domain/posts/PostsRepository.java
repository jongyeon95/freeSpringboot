package com.jongyeon.book.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PostsRepository extends JpaRepository<Posts,Long> {
}
