package com.axonactive.com.devmanagement.api;

import com.axonactive.com.devmanagement.service.TeamService;
import com.axonactive.com.devmanagement.service.dto.TeamDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(TeamResource.PATH)
public class TeamResource {
    public static final String PATH = "/api/teams";

    @Autowired
    private TeamService teamService;

    @GetMapping
    public ResponseEntity<List<TeamDto>> findAll() {
        return ResponseEntity.ok(teamService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeamDto> findById(@PathVariable(value="id") Integer id)  {
        return ResponseEntity.ok(teamService.findTeamByTeamId(id));
    }
}
