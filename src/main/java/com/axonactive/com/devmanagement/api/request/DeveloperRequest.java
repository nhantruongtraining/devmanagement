package com.axonactive.com.devmanagement.api.request;

import com.axonactive.com.devmanagement.entity.Team;
import com.axonactive.com.devmanagement.entity.Title;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeveloperRequest {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private Title title;
    private Team team;
}
