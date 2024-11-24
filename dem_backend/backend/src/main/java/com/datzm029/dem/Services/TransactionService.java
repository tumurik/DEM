package com.datzm029.dem.Services;

import com.datzm029.dem.dao.Dao;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private final Dao dao;

    public TransactionService(Dao dao) {
        this.dao = dao;
    }

}
