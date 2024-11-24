import Web3 from "web3";

let web3;
if (window.ethereum) {
  web3 = new Web3(window.ethereum);
} else {
  console.error("No Ethereum provider found. Install MetaMask.");
}

const TOKEN_CONTRACT_ADDRESS = "YOUR_CONTRACT_ADDRESS";
const TOKEN_ABI = [
  // Add your contract's ABI here
];

const getTokenContract = () => {
  return new web3.eth.Contract(TOKEN_ABI, TOKEN_CONTRACT_ADDRESS);
};

export const connectWallet = async () => {
  try {
    await window.ethereum.request({ method: "eth_requestAccounts" });
    const accounts = await web3.eth.getAccounts();
    return accounts[0];
  } catch (error) {
    console.error("Error connecting wallet:", error);
  }
};

export const getTokenBalance = async (address) => {
  try {
    const contract = getTokenContract();
    const balance = await contract.methods.balanceOf(address).call();
    return web3.utils.fromWei(balance, "ether");
  } catch (error) {
    console.error("Error fetching token balance:", error);
  }
};
