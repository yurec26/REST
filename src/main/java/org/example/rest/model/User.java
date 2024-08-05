package org.example.rest.model;

import java.util.List;

public class User {
    private String user;
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
