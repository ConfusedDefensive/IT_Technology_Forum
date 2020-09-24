package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {
    @Query(value = "select * from tb_postinfo where topicid = :topicid",nativeQuery = true)
    Collection<Post> queryHotPostsById(@Param("topicid") String topicid);
}
