package com.axonactive.com.devmanagement.repository;

import com.axonactive.com.devmanagement.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Integer> {
}
