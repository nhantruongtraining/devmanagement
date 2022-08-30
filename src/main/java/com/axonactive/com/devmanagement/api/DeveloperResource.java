package com.axonactive.com.devmanagement.api;

import com.axonactive.com.devmanagement.service.DeveloperService;
import com.axonactive.com.devmanagement.service.dto.DeveloperDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@RequestMapping(DeveloperResource.PATH)
public class DeveloperResource {
    public static final String PATH = "/api/developers";

    @Autowired
    private DeveloperService developerService;

    @GetMapping
    public ResponseEntity<List<DeveloperDto>> getAll () {
        return ResponseEntity.ok(developerService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeveloperDto> getDeveloperById(@PathVariable(value="id") Integer id) {
        return ResponseEntity.ok(developerService.findById(id));
    }
}
