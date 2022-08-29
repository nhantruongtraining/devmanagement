package com.axonactive.com.devmanagement.service;

import com.axonactive.com.devmanagement.api.request.DeveloperRequest;
import com.axonactive.com.devmanagement.service.dto.DeveloperDto;

import java.util.List;

public interface DeveloperService {
    List<DeveloperDto> getAll();
    DeveloperDto findById(Integer id);
    DeveloperDto findDeveloperById(Integer id);
    DeveloperDto save(DeveloperRequest developerRequest);
    void delete(Integer id);

}
