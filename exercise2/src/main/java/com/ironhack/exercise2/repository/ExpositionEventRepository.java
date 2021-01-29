package com.ironhack.exercise2.repository;

import com.ironhack.exercise2.model.ExpositionEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpositionEventRepository extends JpaRepository<ExpositionEvent, Integer> {
}
