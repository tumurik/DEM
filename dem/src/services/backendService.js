import axios from "axios";

const BASE_URL = "http://localhost:8080/api";

export const fetchEnergyData = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/energy-data`);
    return response.data;
  } catch (error) {
    console.error("Error fetching energy data:", error);
  }
};

export const tradeTokens = async (userId, amount) => {
  try {
    const response = await axios.post(`${BASE_URL}/trade`, {
      userId,
      amount,
    });
    return response.data;
  } catch (error) {
    console.error("Error trading tokens:", error);
  }
};
