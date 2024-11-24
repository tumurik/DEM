package com.datzm029.dem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class TransactionLedger {
    UUID transaction_id;
    Date datetime;
    UUID iotDeviceID;
    UUID fromWallet;
    UUID toWallet;
    int tokenAmount;
    TransactionType transactionType; //TransactionType transactionType = TransactionType.valueOf("SALE");
    BigInteger blockNumber;
    String transactionHash;
    StatusType status;

}
