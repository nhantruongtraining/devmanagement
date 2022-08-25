package com.axonactive.com.devmanagement.service.mapper;

import com.axonactive.com.devmanagement.entity.Developer;
import com.axonactive.com.devmanagement.service.dto.DeveloperDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DeveloperMapper {
    @Mapping(source = "id", target = "developerId")
    @Mapping(source = "team.name", target = "teamName")
    DeveloperDto toDto(Developer developer);

    List<DeveloperDto> toDtos(List<Developer> developerList);

}
