package com.cataLog.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cataLog.catalog.model.catsEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface catsRepository extends JpaRepository<catsEntity, Long> {
}
