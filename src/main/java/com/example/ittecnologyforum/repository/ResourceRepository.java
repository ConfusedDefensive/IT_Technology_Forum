package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Resource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends CrudRepository<Resource,Integer> {
}
