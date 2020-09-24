package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface TopicRepository extends JpaRepository<Topic,Integer> {

    @Query(value = "select * from tb_topicinfo where id in(:category)",nativeQuery = true)
    Collection<Topic> queryHotTopicByCategory(@Param("category") List<String> category);

    @Query(value = "select tb_topicinfo.* from tb_topicinfo,(select topicid from tb_postinfo p group by topicid " +
            "order by count(topicid) desc) tb_temptable where tb_temptable.topicid = tb_topicinfo.id limit 3",nativeQuery = true)
    Collection<Topic> queryHotTopic();
}
