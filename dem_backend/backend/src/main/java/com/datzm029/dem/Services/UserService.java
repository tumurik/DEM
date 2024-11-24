package com.datzm029.dem.Services;

import com.datzm029.dem.dao.Dao;
import com.datzm029.dem.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final Dao dao;

    public UserService(Dao dao) {
        this.dao = dao;
    }

    public UserService addUser(User user){
        return (UserService) dao.insert(user);
    }
}
