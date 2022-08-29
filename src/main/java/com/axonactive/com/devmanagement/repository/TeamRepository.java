package com.axonactive.com.devmanagement.repository;

import com.axonactive.com.devmanagement.entity.Developer;
import com.axonactive.com.devmanagement.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
    @Query("SELECT DISTINCT t FROM Team t LEFT JOIN FETCH t.developers")
    List<Team> getAllJpql();

    @Query("SELECT t FROM Team t LEFT JOIN FETCH t.developers")
    Team findTeamByTeamId(Integer id);
}
