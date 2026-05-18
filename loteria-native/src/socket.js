import { io } from 'socket.io-client';

// En desarrollo con Expo (usando el servidor local de Node.js)
// Reemplaza con tu IP local o el dominio en producción
const SOCKET_URL = 'https://loteria-la-garza.onrender.com'; 

export const socket = io(SOCKET_URL, {
  autoConnect: false,
});
