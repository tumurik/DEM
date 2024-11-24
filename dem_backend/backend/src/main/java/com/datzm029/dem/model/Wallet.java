package com.datzm029.dem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Wallet {
    UUID publicKey;
    UUID userId;
    String privateKeyHash;
    double balance;
    Date creationDate;
}
