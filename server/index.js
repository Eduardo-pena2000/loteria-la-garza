const express = require('express');
const http = require('http');
const { Server } = require('socket.io');
const cors = require('cors');

const app = express();
app.use(cors());

app.get('/', (req, res) => {
  res.send('<h1>Servidor de Lotería La Garza activo y corriendo ✅</h1><p>El servidor de sockets está listo para recibir conexiones.</p>');
});

const server = http.createServer(app);

const io = new Server(server, {
  cors: {
    origin: "*",
    methods: ["GET", "POST"]
  }
});

// Almacenamiento en memoria para las salas
// Estructura: { roomId: { host: socketId, players: [{id, name}], deck: [], currentCard: null, interval: null } }
const rooms = {};

const createDeck = () => {
    const deck = [];
    for(let i=1; i<=54; i++){
        deck.push(i);
    }
    // Shuffle
    for(let i = deck.length - 1; i > 0; i--){
        const j = Math.floor(Math.random() * (i + 1));
        [deck[i], deck[j]] = [deck[j], deck[i]];
    }
    return deck;
};

io.on('connection', (socket) => {
  console.log('Usuario conectado:', socket.id);

  socket.on('create_room', (data, callback) => {
    const roomId = Math.random().toString(36).substring(2, 8).toUpperCase();
    rooms[roomId] = {
        roomId,
        roomName: data.roomName || `Sala de ${data.playerName}`,
        isPrivate: data.isPrivate || false,
        password: data.password || '',
        host: socket.id,
        players: [{ id: socket.id, name: data.playerName }],
        deck: createDeck(),
        currentCard: null,
        drawnCards: [],
        interval: null,
        status: 'waiting'
    };
    socket.join(roomId);
    callback({ success: true, roomId });
    console.log(`Sala ${roomId} creada por ${socket.id}`);
  });

  socket.on('get_public_rooms', (callback) => {
    const publicRooms = Object.values(rooms)
      .filter(r => !r.isPrivate && r.status === 'waiting')
      .map(r => ({
        roomId: r.roomId,
        roomName: r.roomName,
        hostName: r.players[0]?.name || 'Host',
        playerCount: r.players.length
      }));
    if (typeof callback === 'function') callback({ success: true, rooms: publicRooms });
  });

  socket.on('join_room', (data, callback) => {
    const { roomId, playerName, password } = data;
    const room = rooms[roomId];
    if (room && room.status === 'waiting') {
        if (room.isPrivate && room.password && room.password !== password) {
            callback({ success: false, message: 'Contraseña incorrecta' });
            return;
        }
        room.players.push({ id: socket.id, name: playerName });
        socket.join(roomId);
        io.to(roomId).emit('player_joined', room.players);
        callback({ success: true });
        console.log(`${playerName} (${socket.id}) se unió a la sala ${roomId}`);
    } else {
        callback({ success: false, message: 'Sala no existe o ya está en juego' });
    }
  });

  socket.on('start_game', (roomId) => {
      const room = rooms[roomId];
      if (room && room.host === socket.id && room.status === 'waiting') {
          room.status = 'playing';
          io.to(roomId).emit('game_started');
          
          room.interval = setInterval(() => {
              if (room.deck.length > 0) {
                  const card = room.deck.pop();
                  room.currentCard = card;
                  room.drawnCards.push(card);
                  io.to(roomId).emit('card_drawn', card);
              } else {
                  clearInterval(room.interval);
                  io.to(roomId).emit('game_over', { reason: 'deck_empty' });
              }
          }, 3000); // Carta cada 3 segundos
      }
  });

  socket.on('call_loteria', (roomId) => {
      const room = rooms[roomId];
      if (room && room.status === 'playing') {
          clearInterval(room.interval);
          room.status = 'finished';
          const winner = room.players.find(p => p.id === socket.id);
          io.to(roomId).emit('we_have_a_winner', { winner: winner.name, winnerId: socket.id });
          console.log(`¡Lotería en sala ${roomId} por ${winner.name}!`);
      }
  });

  socket.on('send_chat', (data) => {
      const { roomId, msg } = data;
      // Emitir el mensaje a todos los demás en la sala
      socket.to(roomId).emit('chat_message', msg);
  });

  socket.on('send_sticker', (data) => {
      const { roomId, sticker } = data;
      // Emitir el sticker a todos los demás en la sala
      socket.to(roomId).emit('sticker_sent', { sticker, senderId: socket.id });
  });

  socket.on('leave_room', (roomId) => {
      const room = rooms[roomId];
      if (room) {
          room.players = room.players.filter(p => p.id !== socket.id);
          socket.leave(roomId);
          io.to(roomId).emit('player_joined', room.players);
          if (room.players.length === 0) {
              if (room.interval) clearInterval(room.interval);
              delete rooms[roomId];
              console.log(`Sala ${roomId} eliminada por estar vacía.`);
          }
      }
  });

  socket.on('disconnect', () => {
    console.log('Usuario desconectado:', socket.id);
    // Limpiar salas si el host se desconecta o el jugador se va
    for (const roomId in rooms) {
        const room = rooms[roomId];
        room.players = room.players.filter(p => p.id !== socket.id);
        io.to(roomId).emit('player_joined', room.players);
        
        if (room.players.length === 0 || room.host === socket.id) {
            if (room.interval) clearInterval(room.interval);
            delete rooms[roomId];
            io.to(roomId).emit('game_over', { reason: 'host_disconnected' });
            console.log(`Sala ${roomId} eliminada por desconexión.`);
        }
    }
  });
});

const PORT = process.env.PORT || 3000;
server.listen(PORT, () => {
  console.log(`Servidor Socket.io corriendo en el puerto ${PORT}`);
});
