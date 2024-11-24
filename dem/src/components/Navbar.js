import React from "react";

const Navbar = () => (
  <nav className="p-4 bg-gray-800 text-white flex justify-between">
    <span className="text-xl font-bold">Energy Blockchain</span>
    <div>
      <a href="/" className="mx-2">Dashboard</a>
      <a href="/trading" className="mx-2">Trading</a>
    </div>
  </nav>
);

export default Navbar; // Make sure this is present!
