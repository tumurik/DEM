package com.datzm029.dem.Services;

import com.datzm029.dem.dao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private final Dao dao;
    @Autowired
    public TransactionService(@Qualifier("postgres_transaction")Dao dao) {
        this.dao = dao;
    }

}
