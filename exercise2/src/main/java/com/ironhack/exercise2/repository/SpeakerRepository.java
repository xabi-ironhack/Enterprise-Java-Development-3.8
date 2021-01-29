package com.ironhack.exercise2.repository;

import com.ironhack.exercise2.model.Speaker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeakerRepository extends JpaRepository<Speaker, Integer> {
}
