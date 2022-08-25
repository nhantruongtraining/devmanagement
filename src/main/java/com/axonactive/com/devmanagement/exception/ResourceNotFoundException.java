package com.axonactive.com.devmanagement.exception;

public class ResourceNotFoundException extends RuntimeException{
    private static final String TEAM_NOT_FOUND_MSG = "Team not found";
    private static final String DEVELOPER_NOT_FOUND_MSG = "Developer not found";

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public static ResourceNotFoundException TeamNotFound() {
        return new ResourceNotFoundException(TEAM_NOT_FOUND_MSG);
    }

    public static ResourceNotFoundException DeveloperNotFound() {
        return new ResourceNotFoundException(DEVELOPER_NOT_FOUND_MSG);
    }
}
