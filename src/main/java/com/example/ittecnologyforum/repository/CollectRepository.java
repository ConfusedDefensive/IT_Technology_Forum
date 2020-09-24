package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Collect;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectRepository extends CrudRepository<Collect,Integer> {
}
