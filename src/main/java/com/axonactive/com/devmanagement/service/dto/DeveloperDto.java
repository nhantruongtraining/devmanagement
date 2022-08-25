package com.axonactive.com.devmanagement.service.dto;

import com.axonactive.com.devmanagement.entity.Team;
import com.axonactive.com.devmanagement.entity.Title;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeveloperDto {
    private Integer developerId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private Title title;
    private String teamName;
}
