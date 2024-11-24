package com.datzm029.dem.dao;

import com.datzm029.dem.model.TransactionLedger;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("postgres_transaction")
public class TransactionController implements Dao<TransactionLedger> {
    @Override
    public TransactionLedger insert(TransactionLedger transactionLedger) {
        return null;
    }

    @Override
    public List<TransactionLedger> selectAll() {
        return null;
    }

    @Override
    public TransactionLedger checkIfExist(TransactionLedger object) {
        return null;
    }
}
