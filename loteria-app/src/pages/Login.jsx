import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { signInWithPopup, signInAnonymously } from 'firebase/auth';
import { auth, googleProvider } from '../firebase';
import { LogIn, User } from 'lucide-react';

export default function Login() {
  const [loading, setLoading] = useState(false);
  const navigate = useNavigate();

  const handleGoogleLogin = async () => {
    try {
      setLoading(true);
      await signInWithPopup(auth, googleProvider);
      navigate('/lobby');
    } catch (error) {
      console.error("Error signing in with Google", error);
      alert("Hubo un error al iniciar sesión.");
    } finally {
      setLoading(false);
    }
  };

  const handleGuestLogin = async () => {
    try {
      setLoading(true);
      await signInAnonymously(auth);
      navigate('/lobby');
    } catch (error) {
      console.error("Error signing in anonymously", error);
      alert("Hubo un error al iniciar como invitado.");
    } finally {
      setLoading(false);
    }
  };

  return (
    <div className="login-container" style={{ display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center', minHeight: '100vh', padding: '2rem' }}>
      <div className="glass-panel animate-fade-in" style={{ padding: '3rem 2rem', maxWidth: '400px', width: '100%', textAlign: 'center' }}>
        <h1 style={{ marginBottom: '0.5rem', fontSize: '2rem' }}>Lotería</h1>
        <p style={{ color: 'var(--text-muted)', marginBottom: '2.5rem' }}>La Garza</p>

        <div style={{ display: 'flex', flexDirection: 'column', gap: '1rem' }}>
          <button 
            className="btn btn-primary" 
            onClick={handleGoogleLogin}
            disabled={loading}
          >
            <LogIn size={20} />
            {loading ? 'Cargando...' : 'Iniciar con Google'}
          </button>
          
          <div style={{ display: 'flex', alignItems: 'center', margin: '1rem 0' }}>
            <div style={{ flex: 1, height: '1px', background: 'var(--glass-border)' }}></div>
            <span style={{ padding: '0 1rem', color: 'var(--text-muted)', fontSize: '0.875rem' }}>o</span>
            <div style={{ flex: 1, height: '1px', background: 'var(--glass-border)' }}></div>
          </div>

          <button 
            className="btn btn-outline" 
            onClick={handleGuestLogin}
            disabled={loading}
          >
            <User size={20} />
            Jugar como Invitado
          </button>
        </div>
      </div>
    </div>
  );
}
