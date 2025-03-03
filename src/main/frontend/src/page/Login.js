import React, { useState } from 'react';
import axios from 'axios';

function Login() {
    const [id, setId] = useState('');
    const [password, setPassword] = useState('');
    const [error, setError] = useState('');

    const handleLogin = async () => {
        try {
            const response = await axios.post('/api/login', {
                id: id,
                password: password
            });

            if (response.data.success) {
                alert('로그인 성공!');
            } else {
                alert(response.data.message);
            }
        } catch (err) {
            setError('서버와 연결이 원활하지 않습니다.');
        }
    };

    return (
        <div>
            <h2>로그인</h2>
            <input
                type="text"
                placeholder="아이디"
                value={id}
                onChange={(e) => setId(e.target.value)}
            />
            <input
                type="password"
                placeholder="비밀번호"
                value={password}
                onChange={(e) => setPassword(e.target.value)}
            />
            <button onClick={handleLogin}>로그인</button>
            {error && <p style={{ color: 'red' }}>{error}</p>}
        </div>
    );
}

export default Login;
