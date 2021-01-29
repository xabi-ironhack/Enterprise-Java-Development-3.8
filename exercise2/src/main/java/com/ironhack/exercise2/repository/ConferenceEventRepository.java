package com.ironhack.exercise2.repository;

import com.ironhack.exercise2.model.ConferenceEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConferenceEventRepository extends JpaRepository<ConferenceEvent, Integer> {
}
