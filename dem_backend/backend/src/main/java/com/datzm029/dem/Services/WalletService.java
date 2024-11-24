package com.datzm029.dem.Services;

import com.datzm029.dem.dao.Dao;
import com.datzm029.dem.model.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Keys;

import java.util.Date;
import java.util.UUID;

@Service
public class WalletService {

    private final Dao dao;

    public WalletService(@Qualifier("postgres_wallet") Dao dao) {
        this.dao = dao;
    }

    public Wallet addWallet(UUID userId){
        Wallet wallet = generateWallet();
        wallet.setUserId(userId);
        wallet.setBalance(0);
        return (Wallet) dao.insert(wallet);
    }

    private Wallet generateWallet() {
        try {
            ECKeyPair ecKeyPair = Keys.createEcKeyPair();
            String walletAddress = Keys.getAddress(ecKeyPair.getPublicKey());
            System.out.println("Wallet generated successfully!");
            System.out.println("Wallet Address: 0x" + walletAddress);
            System.out.println("Private Key: " + ecKeyPair.getPrivateKey().toString(16));
            System.out.println("Public Key: " + ecKeyPair.getPublicKey().toString(16));
            return new Wallet(ecKeyPair.getPublicKey().toString(16),
                    walletAddress,
                    ecKeyPair.getPrivateKey().toString(16),
                    new Date());
        } catch (Exception e) {
            System.err.println("Error generating wallet: " + e.getMessage());
        }
        return null;
    }
}
