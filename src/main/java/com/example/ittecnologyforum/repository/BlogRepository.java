package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends CrudRepository<Blog,Integer> {
}
