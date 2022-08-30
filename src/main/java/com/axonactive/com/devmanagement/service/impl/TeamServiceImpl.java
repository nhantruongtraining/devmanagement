package com.axonactive.com.devmanagement.service.impl;

import com.axonactive.com.devmanagement.api.request.TeamRequest;
import com.axonactive.com.devmanagement.exception.ResourceNotFoundException;
import com.axonactive.com.devmanagement.repository.TeamRepository;
import com.axonactive.com.devmanagement.service.TeamService;
import com.axonactive.com.devmanagement.service.dto.TeamDto;
import com.axonactive.com.devmanagement.service.mapper.TeamMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TeamMapper teamMapper;


    @Override
    public List<TeamDto> getAll() {
        return teamMapper.toDtos(teamRepository.findAll());
    }

    @Override
    public TeamDto findById(Integer id) {
        return teamMapper.toDto(teamRepository.findById(id).orElseThrow(ResourceNotFoundException::TeamNotFound));
    }
    @Override
    public TeamDto findTeamByTeamId(Integer id) {
        return teamMapper.toDto(teamRepository.findTeamByTeamId(id));
    }
    @Override
    public TeamDto save(TeamRequest teamRequest) {
        return null;
    }

    @Override
    public void delete(Integer id) {
        teamRepository.deleteById(id);
    }

    @Override
    public List<TeamDto> findAll() {
        return teamMapper.toDtos(teamRepository.getAllJpql());
    }


}
