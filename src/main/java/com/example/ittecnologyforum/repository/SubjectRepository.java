package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends CrudRepository<Subject,Integer> {
}
