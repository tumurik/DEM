import React, { useState } from "react";
import { connectWallet } from "../services/blockchainService";

const Wallet = () => {
  const [walletAddress, setWalletAddress] = useState("");

  const handleConnect = async () => {
    const address = await connectWallet();
    setWalletAddress(address);
  };

  return (
    <div className="p-4 border border-gray-300 rounded shadow-md">
      <h2 className="text-lg font-bold">Connect Wallet</h2>
      {walletAddress ? (
        <p>Connected: {walletAddress}</p>
      ) : (
        <button
          onClick={handleConnect}
          className="bg-blue-500 text-white px-4 py-2 rounded"
        >
          Connect Wallet
        </button>
      )}
    </div>
  );
};

export default Wallet;
