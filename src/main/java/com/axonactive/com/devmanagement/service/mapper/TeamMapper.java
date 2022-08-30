package com.axonactive.com.devmanagement.service.mapper;

import com.axonactive.com.devmanagement.entity.Developer;
import com.axonactive.com.devmanagement.entity.Team;
import com.axonactive.com.devmanagement.service.dto.DeveloperDto;
import com.axonactive.com.devmanagement.service.dto.TeamDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamMapper {
    @Mapping(source = "id", target = "teamId")
    @Mapping(source = "name", target = "teamName")
    @Mapping(source = "developers", target = "developerDtoList")
    TeamDto toDto(Team team);


    List<TeamDto> toDtos(List<Team> teamList);


    DeveloperDto toDeveloperDto(Developer developer);

    List<DeveloperDto> toDeveloperDtos(List<Developer> developerList);


}
