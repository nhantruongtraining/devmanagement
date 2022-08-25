package com.axonactive.com.devmanagement.api.request;

import com.axonactive.com.devmanagement.service.dto.DeveloperDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamRequest {
    private String name;
    private List<DeveloperRequest> developerRequestList;
}
