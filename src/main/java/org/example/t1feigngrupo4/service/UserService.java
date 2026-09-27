package org.example.t1feigngrupo4.service;

import org.example.t1feigngrupo4.client.UserClient;
import org.example.t1feigngrupo4.dto.UserPlaceHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserClient userClient;
    public UserService(UserClient userClient) {
        this.userClient = userClient;
    }
    public List<UserPlaceHolder> getUsers() {
        return userClient.getUsers()
                .stream()
                .filter(user -> user.getId() != null
                        && user.getId() % 2 != 0)
                .toList();
    }
}