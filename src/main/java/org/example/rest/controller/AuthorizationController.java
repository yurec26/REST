package org.example.rest.controller;

import jakarta.validation.Valid;
import org.example.rest.model.Authorities;
import org.example.rest.model.User;
import org.example.rest.model.UserBuilder;
import org.example.rest.service.AuthorizationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorizationController {
    private AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid UserBuilder userBld) {
        return service.getAuthorities(userBld.getUser());
    }
}
