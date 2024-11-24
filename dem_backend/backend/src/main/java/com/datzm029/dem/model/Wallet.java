package com.datzm029.dem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Wallet {
    UUID publicKey ;
    UUID privateKey;
    double balance;
}
