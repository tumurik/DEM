import React from "react";
import Navbar from "./components/Navbar";
import Wallet from "./components/Wallet";
import Dashboard from "./pages/Dashboard";

const App = () => (
  <div className="min-h-screen bg-gray-100">
    <Navbar />
    <div className="container mx-auto p-4">
      <Wallet />
      <Dashboard />
    </div>
  </div>
);

export default App;
