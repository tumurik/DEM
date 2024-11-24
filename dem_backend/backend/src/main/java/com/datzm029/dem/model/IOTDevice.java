package com.datzm029.dem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class IOTDevice {
    UUID deviceID;
    UUID userID;
    BigInteger serialNumber;
}
