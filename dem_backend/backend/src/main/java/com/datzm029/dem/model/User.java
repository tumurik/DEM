package com.datzm029.dem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class User {
    UUID userId;
    String username;
    String name;
    String region;
    String address;
    String email;
    BigInteger totalEnergyProduced;
    BigInteger totalEnergyConsumed;
    String password;
}
