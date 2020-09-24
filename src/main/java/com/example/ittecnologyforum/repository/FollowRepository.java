package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Follow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowRepository extends JpaRepository<Follow,Integer> {

    @Query(value="select objectid from tb_followinfo where userid = :userid and category = 3",nativeQuery = true)
    List<String> findTopicByUserId(@Param("userid") String userid);

}
