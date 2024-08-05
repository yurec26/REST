package org.example.rest.model;

import java.util.List;

public class UserBuilder {
    private String user;
    private String password;
    private List<Authorities> authoritiesList;

    public UserBuilder setUser(String user) {
        this.user = user;
        return this;
    }

    public UserBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder setAuthoritiesList(List<Authorities> authoritiesList) {
        this.authoritiesList = authoritiesList;
        return this;
    }

    public User getUser() {
        return new User(this.user, this.password, this.authoritiesList);
    }
}