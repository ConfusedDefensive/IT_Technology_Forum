package com.example.ittecnologyforum.repository;

import com.example.ittecnologyforum.entity.Download;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DownloadRepository extends CrudRepository<Download,Integer> {
}
