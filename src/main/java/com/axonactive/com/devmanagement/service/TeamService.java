package com.axonactive.com.devmanagement.service;

import com.axonactive.com.devmanagement.api.request.TeamRequest;
import com.axonactive.com.devmanagement.service.dto.TeamDto;

import java.util.List;
import java.util.Optional;

public interface TeamService {
    List<TeamDto> getAll();
    TeamDto findById(Integer id);
    TeamDto save(TeamRequest teamRequest);
    void delete(Integer id);
    TeamDto findTeamByTeamId(Integer id);
}
