package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer> {
}
