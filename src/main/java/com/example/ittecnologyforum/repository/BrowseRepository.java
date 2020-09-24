package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Browse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrowseRepository extends CrudRepository<Browse,Integer> {
}
