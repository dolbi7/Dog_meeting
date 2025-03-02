import './App.css';
import React, {useEffect, useState} from 'react';
import { BrowserRouter, Routes, Route, Link } from 'react-router-dom';
import Home from './Home';
import Login from './page/Login';

function App() {
    return (
        <BrowserRouter>
            <nav>
                <Link to="/">홈</Link>
                <Link to="/login">로그인</Link>
            </nav>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/login" element={<Login />} />
            </Routes>
        </BrowserRouter>
    );
}

export default App;
