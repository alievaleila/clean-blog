package com.example.cleanblog.repository;

import com.example.cleanblog.model.PageHeader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PageHeaderRepository extends JpaRepository<PageHeader,Long> {
    Optional<PageHeader> findByPage(String page);

}
