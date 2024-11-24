package com.datzm029.dem.Services;

import com.datzm029.dem.dao.Dao;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final Dao dao;

    public WalletService(Dao dao) {
        this.dao = dao;
    }

}
