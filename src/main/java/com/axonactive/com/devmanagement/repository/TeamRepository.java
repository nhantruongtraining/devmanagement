package com.axonactive.com.devmanagement.repository;

import com.axonactive.com.devmanagement.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
