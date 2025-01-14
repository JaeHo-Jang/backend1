import React from "react";
import { BrowserRouter, Route, Routes, Link } from "react-router-dom";
import Home from "../pages/Home";
import About from "../pages/About";
import Contact from "../pages/Contact";
import Works from "../pages/Works";

const Router = () => {
  return (
    <BrowserRouter>
	<nav>
        {/* 네비게이션 링크 추가 */}
        <ul>
          <li>
            <Link to="/">Home</Link>
          </li>
          <li>
            <Link to="/about">About</Link>
          </li>
          <li>
            <Link to="/contact">Contact</Link>
          </li>
          <li>
            <Link to="/works">Works</Link>
          </li>
        </ul>
      </nav>
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="about" element={<About />} />
        <Route path="contact" element={<Contact />} />
        <Route path="works" element={<Works />} />
                {/* 아래 코드를 추가해주세요. 👇 */}
        <Route path="works/:id" element={<Works />} />
      </Routes>
    </BrowserRouter>
  );
};

export default Router;