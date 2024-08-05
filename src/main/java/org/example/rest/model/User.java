package org.example.rest.model;

import jakarta.validation.constraints.Max;

import java.util.List;

public class User {
    @Max(15)
    private String user;
    @Max(25)
    private String password;
    private List<Authorities> authoritiesList;


    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuthoritiesList() {
        return authoritiesList;
    }

    public User(String user, String password, List<Authorities> authoritiesList) {
        this.user = user;
        this.password = password;
        this.authoritiesList = authoritiesList;
    }


}
