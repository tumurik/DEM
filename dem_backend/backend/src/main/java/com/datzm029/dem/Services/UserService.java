package com.datzm029.dem.Services;

import com.datzm029.dem.dao.Dao;
import com.datzm029.dem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final Dao dao;
    private final WalletService walletService;
    public UserService(@Qualifier("postgres_user")Dao dao, WalletService walletService) {
        this.dao = dao;
        this.walletService = walletService;
    }

    public UserService addUser(User user){
        walletService.addWallet(user.getUserId());
        return (UserService) dao.insert(user);
    }
}
