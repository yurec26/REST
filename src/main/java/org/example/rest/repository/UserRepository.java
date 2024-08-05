package org.example.rest.repository;

import org.example.rest.model.Authorities;
import org.example.rest.model.User;
import org.example.rest.model.UserBuilder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public class UserRepository {
    private List<User> userList;

    public UserRepository() {
        fillRepo();
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        for (User u : userList) {
            if (Objects.equals(user, u.getUser()) && Objects.equals(password, u.getPassword())) {
                return u.getAuthoritiesList();
            }
        }
        return null;
    }

    private void fillRepo() {
        User user_Bibi = new UserBuilder()
                .setUser("bi94")
                .setPassword("1")
                .setAuthoritiesList(List.of(Authorities.WRITE)).getUser();

        User user_Sup = new UserBuilder()
                .setUser("sup12")
                .setPassword("2")
                .setAuthoritiesList(List.of(Authorities.WRITE, Authorities.READ)).getUser();

        User user_Cre = new UserBuilder()
                .setUser("c52")
                .setPassword("3")
                .setAuthoritiesList(List.of(Authorities.WRITE, Authorities.READ, Authorities.DELETE)).getUser();


        this.userList = List.of(user_Cre, user_Bibi, user_Sup);
    }
}