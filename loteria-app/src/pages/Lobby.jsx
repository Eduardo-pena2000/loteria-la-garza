import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { auth, rtdb } from '../firebase';
import { signOut } from 'firebase/auth';
import { ref, push, set } from 'firebase/database';
import { LogOut, Play, Plus, Users, Settings } from 'lucide-react';

export default function Lobby({ user }) {
  const navigate = useNavigate();
  const [loading, setLoading] = useState(false);

  const handleLogout = async () => {
    await signOut(auth);
  };

  const createRoom = async () => {
    try {
      setLoading(true);
      const roomsRef = ref(rtdb, 'rooms');
      const newRoomRef = push(roomsRef);
      
      const roomData = {
        hostId: user.uid,
        status: 'waiting', // waiting, playing, finished
        createdAt: Date.now(),
        players: {
          [user.uid]: {
            name: user.displayName || 'Invitado',
            ready: false,
            board: null,
            token: 'frijol' // default
          }
        }
      };

      await set(newRoomRef, roomData);
      navigate(`/room/${newRoomRef.key}`);
    } catch (error) {
      console.error("Error creating room", error);
      alert("Error al crear la sala.");
      setLoading(false);
    }
  };

  const joinRoomPrompt = () => {
    const code = prompt("Ingresa el código de la sala:");
    if (code) {
      navigate(`/room/${code}`);
    }
  };

  return (
    <div style={{ display: 'flex', flexDirection: 'column', minHeight: '100vh', padding: '1.5rem' }}>
      {/* Header */}
      <header className="glass-panel" style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', padding: '1rem 1.5rem', marginBottom: '2rem' }}>
        <div style={{ display: 'flex', alignItems: 'center', gap: '1rem' }}>
          <div style={{ width: '40px', height: '40px', borderRadius: '50%', background: 'linear-gradient(135deg, var(--primary-color), var(--secondary-color))', display: 'flex', alignItems: 'center', justifyContent: 'center', fontWeight: 'bold' }}>
            {user.displayName ? user.displayName[0].toUpperCase() : 'I'}
          </div>
          <div>
            <h3 style={{ fontSize: '1rem', margin: 0 }}>{user.displayName || 'Jugador Invitado'}</h3>
            <span style={{ fontSize: '0.75rem', color: 'var(--text-muted)' }}>Online</span>
          </div>
        </div>
        <button onClick={handleLogout} className="btn btn-outline" style={{ padding: '0.5rem', borderRadius: '50%' }} title="Cerrar Sesión">
          <LogOut size={18} />
        </button>
      </header>

      {/* Main Content */}
      <main style={{ flex: 1, display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center', gap: '2rem', paddingBottom: '4rem' }}>
        <div className="animate-fade-in" style={{ textAlign: 'center', marginBottom: '2rem' }}>
          <h1 style={{ fontSize: '3rem', marginBottom: '0.5rem' }}>Lotería</h1>
          <p style={{ color: 'var(--text-muted)', fontSize: '1.2rem' }}>La Garza</p>
        </div>

        <div style={{ display: 'flex', flexDirection: 'column', gap: '1rem', width: '100%', maxWidth: '300px' }}>
          <button 
            className="btn btn-primary" 
            onClick={createRoom}
            disabled={loading}
            style={{ padding: '1rem', fontSize: '1.1rem' }}
          >
            <Plus size={24} />
            {loading ? 'Creando...' : 'Crear Sala'}
          </button>

          <button 
            className="btn btn-outline" 
            onClick={joinRoomPrompt}
            style={{ padding: '1rem', fontSize: '1.1rem', background: 'var(--surface-color)' }}
          >
            <Users size={24} />
            Unirse a Sala
          </button>

          <button 
            className="btn btn-outline" 
            style={{ padding: '1rem', fontSize: '1.1rem', background: 'var(--surface-color)' }}
            onClick={() => alert("Próximamente: Partida rápida pública")}
          >
            <Play size={24} />
            Juego Rápido
          </button>
        </div>
      </main>

      {/* Footer / Nav */}
      <nav className="glass-panel" style={{ display: 'flex', justifyContent: 'space-around', padding: '1rem', position: 'sticky', bottom: '1rem', margin: '0 auto', width: '100%', maxWidth: '400px' }}>
        <button className="btn" style={{ background: 'transparent', color: 'var(--primary-color)', flexDirection: 'column', gap: '0.2rem', padding: '0.5rem' }}>
          <Play size={24} />
          <span style={{ fontSize: '0.7rem' }}>Jugar</span>
        </button>
        <button className="btn" style={{ background: 'transparent', color: 'var(--text-muted)', flexDirection: 'column', gap: '0.2rem', padding: '0.5rem' }}>
          <Settings size={24} />
          <span style={{ fontSize: '0.7rem' }}>Ajustes</span>
        </button>
      </nav>
    </div>
  );
}
