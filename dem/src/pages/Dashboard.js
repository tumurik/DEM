import React, { useState, useEffect } from "react";
import { getTokenBalance } from "../services/blockchainService";

const Dashboard = ({ walletAddress }) => {
  const [balance, setBalance] = useState(0);

  useEffect(() => {
    if (walletAddress) {
      (async () => {
        const fetchedBalance = await getTokenBalance(walletAddress);
        setBalance(fetchedBalance);
      })();
    }
  }, [walletAddress]);

  return (
    <div className="p-4">
      <h1 className="text-2xl font-bold">Dashboard</h1>
      {walletAddress ? (
        <p>Your Token Balance: {balance}</p>
      ) : (
        <p>Please connect your wallet.</p>
      )}
    </div>
  );
};

export default Dashboard;
