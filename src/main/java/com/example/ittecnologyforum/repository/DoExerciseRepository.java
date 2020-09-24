package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.DoExercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoExerciseRepository extends CrudRepository<DoExercise,Integer> {
}
