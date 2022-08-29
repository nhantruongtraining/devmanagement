package com.axonactive.com.devmanagement.service.impl;

import com.axonactive.com.devmanagement.api.request.DeveloperRequest;
import com.axonactive.com.devmanagement.entity.Developer;
import com.axonactive.com.devmanagement.entity.Team;
import com.axonactive.com.devmanagement.exception.ResourceNotFoundException;
import com.axonactive.com.devmanagement.repository.DeveloperRepository;
import com.axonactive.com.devmanagement.service.DeveloperService;
import com.axonactive.com.devmanagement.service.dto.DeveloperDto;
import com.axonactive.com.devmanagement.service.mapper.DeveloperMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperServiceImpl implements DeveloperService {
    @Autowired
    private DeveloperRepository developerRepository;

    @Autowired
    private DeveloperMapper developerMapper;


    @Override
    public List<DeveloperDto> getAll() {
        return developerMapper.toDtos(developerRepository.findAll());
    }

    @Override
    public DeveloperDto findById(Integer id) {
        return developerMapper.toDto(developerRepository.findById(id).orElseThrow(ResourceNotFoundException::DeveloperNotFound));
    }

    @Override
    public DeveloperDto findDeveloperById(Integer id) {
        return developerMapper.toDto(developerRepository.findById(id).orElseThrow(ResourceNotFoundException::DeveloperNotFound));
    }

    @Override
    public DeveloperDto save(DeveloperRequest developerRequest) {
        Developer developer = new Developer();
        developer.setFirstName(developerRequest.getFirstName());
        developer.setLastName(developerRequest.getLastName());
        developer.setGender(developerRequest.getGender());
        developer.setEmail(developerRequest.getEmail());
        developer.setTitle(developerRequest.getTitle());
        developer.setTeam(developerRequest.getTeam());

        return developerMapper.toDto(developerRepository.save(developer));
    }

    @Override
    public void delete(Integer id) {
        developerRepository.deleteById(id);
    }
}
