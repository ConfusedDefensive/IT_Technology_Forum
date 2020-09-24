package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.BlogArticle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogArticleRepository extends CrudRepository<BlogArticle,Integer>{
}
