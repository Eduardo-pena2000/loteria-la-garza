import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import { useState, useEffect } from 'react';
import { onAuthStateChanged } from 'firebase/auth';
import { auth } from './firebase';

import Login from './pages/Login';
import Lobby from './pages/Lobby';
// import Room from './pages/Room';
// import Game from './pages/Game';

function App() {
  const [user, setUser] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const unsubscribe = onAuthStateChanged(auth, (currentUser) => {
      setUser(currentUser);
      setLoading(false);
    });
    return () => unsubscribe();
  }, []);

  if (loading) {
    return <div style={{display: 'flex', height: '100vh', justifyContent: 'center', alignItems: 'center'}}>Cargando...</div>;
  }

  return (
    <Router>
      <Routes>
        <Route path="/" element={user ? <Navigate to="/lobby" /> : <Login />} />
        <Route path="/lobby" element={user ? <Lobby user={user} /> : <Navigate to="/" />} />
        {/* <Route path="/room/:roomId" element={user ? <Room user={user} /> : <Navigate to="/" />} /> */}
        {/* <Route path="/game/:roomId" element={user ? <Game user={user} /> : <Navigate to="/" />} /> */}
      </Routes>
    </Router>
  );
}

export default App;
