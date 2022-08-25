package com.axonactive.com.devmanagement.service.dto;

import com.axonactive.com.devmanagement.entity.Developer;
import com.axonactive.com.devmanagement.entity.Team;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamDto {
    private Integer teamId;
    private String teamName;
    private List<DeveloperDto> developerDtoList;

}
