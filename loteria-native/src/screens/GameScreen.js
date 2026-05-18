import React, { useEffect, useState, useMemo } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, Image, Dimensions, Alert, SafeAreaView } from 'react-native';
import { BlurView } from 'expo-blur';
import { LinearGradient } from 'expo-linear-gradient';
import MexicanBackground from '../components/MexicanBackground';
import GameMenu from '../components/GameMenu';
import PlayersModal from '../components/PlayersModal';
import StickerModal from '../components/StickerModal';
import ChatArea from '../components/ChatArea';
import { COLORS, RADIUS, SPACING, GRADIENTS, SHADOWS } from '../theme';
import socket from '../socket';
import { cardImages, FrijolImage } from '../assetsMap';

const { width } = Dimensions.get('window');
const CARD_SIZE = (width - SPACING.lg * 2 - SPACING.xs * 3) / 4;

export default function GameScreen({ route, navigation }) {
  const { roomId, isHost, userName } = route.params;
  const [players, setPlayers] = useState([]);
  const [gameStarted, setGameStarted] = useState(false);
  const [currentCard, setCurrentCard] = useState(null);
  const [drawnCards, setDrawnCards] = useState([]);
  const [markedCards, setMarkedCards] = useState({});
  const [winner, setWinner] = useState(null);
  const [messages, setMessages] = useState([]);

  // Modals state
  const [showMenu, setShowMenu] = useState(false);
  const [showPlayers, setShowPlayers] = useState(false);
  const [showStickers, setShowStickers] = useState(false);
  const [showChat, setShowChat] = useState(false);

  // Sticker Animation State
  const [activeSticker, setActiveSticker] = useState(null);

  // Generate random board
  const board = useMemo(() => {
    const deck = Array.from({ length: 54 }, (_, i) => i + 1);
    for (let i = deck.length - 1; i > 0; i--) {
      const j = Math.floor(Math.random() * (i + 1));
      [deck[i], deck[j]] = [deck[j], deck[i]];
    }
    return deck.slice(0, 16);
  }, []);

  useEffect(() => {
    socket.on('player_joined', (roomPlayers) => {
      setPlayers(roomPlayers);
    });

    socket.on('game_started', () => {
      setGameStarted(true);
    });

    socket.on('card_drawn', (card) => {
      setCurrentCard(card);
      setDrawnCards(prev => [...prev, card]);
    });

    socket.on('we_have_a_winner', (data) => {
      setWinner(data.winner);
      Alert.alert('¡Lotería!', `¡${data.winner} ha ganado la partida!`, [
        { text: 'Volver al Inicio', onPress: () => navigation.navigate('HomeDrawer') }
      ]);
    });

    socket.on('game_over', (data) => {
      Alert.alert('Fin del Juego', 'La partida ha terminado.', [
        { text: 'Ok', onPress: () => navigation.navigate('HomeDrawer') }
      ]);
    });

    socket.on('chat_message', (msg) => {
      setMessages(prev => [...prev, msg]);
    });

    socket.on('sticker_sent', (data) => {
      setActiveSticker(data.sticker);
      setTimeout(() => setActiveSticker(null), 3000);
    });

    return () => {
      socket.off('player_joined');
      socket.off('game_started');
      socket.off('card_drawn');
      socket.off('we_have_a_winner');
      socket.off('game_over');
      socket.off('chat_message');
      socket.off('sticker_sent');
    };
  }, [navigation]);

  const toggleMarkCard = (cardId) => {
    if (!gameStarted || winner) return;
    setMarkedCards(prev => ({
      ...prev,
      [cardId]: !prev[cardId]
    }));
  };

  const callLoteria = () => {
    const allMarked = board.every(card => markedCards[card]);
    if (!allMarked) {
      Alert.alert("Aviso", "¡Todavía no has llenado tu tabla!");
      return;
    }
    const allValid = board.every(card => drawnCards.includes(card));
    if (!allValid) {
      Alert.alert("¡Trampa!", "Marcaste cartas que no han salido.");
      return;
    }
    socket.emit('call_loteria', roomId);
  };

  const startGame = () => {
    socket.emit('start_game', roomId);
  };

  const leaveRoom = () => {
    socket.emit('leave_room', roomId);
    setShowMenu(false);
    navigation.navigate('HomeDrawer');
  };

  const handleSendMessage = (text) => {
    const msg = { sender: userName, text };
    socket.emit('send_chat', { roomId, msg });
    setMessages(prev => [...prev, msg]);
  };

  const handleSendSticker = (sticker) => {
    socket.emit('send_sticker', { roomId, sticker });
    setActiveSticker(sticker);
    setTimeout(() => setActiveSticker(null), 3000);
  };

  return (
    <MexicanBackground>
      <SafeAreaView style={styles.container}>
        {/* Header Bar */}
        <View style={styles.header}>
          <TouchableOpacity onPress={() => setShowPlayers(true)} style={styles.headerItem}>
            <Text style={styles.headerIcon}>👥</Text>
            <Text style={styles.headerText}>{players.length}</Text>
          </TouchableOpacity>
          <View style={styles.titleContainer}>
            <Text style={styles.roomTitle}>Sala: {roomId}</Text>
          </View>
          <TouchableOpacity onPress={() => setShowMenu(true)} style={styles.headerItem}>
            <Text style={styles.headerIcon}>⚙️</Text>
          </TouchableOpacity>
        </View>

        {/* Content */}
        {!gameStarted && !winner ? (
          <View style={styles.waitingWrapper}>
            <BlurView intensity={50} tint="dark" style={styles.waitingContainer}>
              <Text style={styles.waitingTitle}>Esperando Jugadores...</Text>
              {players.map((p, index) => (
                <Text key={index} style={styles.playerItem}>• {p.name}</Text>
              ))}
              {isHost ? (
                <TouchableOpacity style={styles.startBtnWrapper} onPress={startGame} activeOpacity={0.8}>
                  <LinearGradient colors={GRADIENTS.primary} style={styles.startBtn}>
                    <Text style={styles.startBtnText}>Iniciar Partida</Text>
                  </LinearGradient>
                </TouchableOpacity>
              ) : (
                <Text style={styles.waitingHost}>Esperando a que el host inicie...</Text>
              )}
            </BlurView>
          </View>
        ) : (
          <View style={styles.gameContainer}>
            {/* Gritón Area */}
            <View style={styles.gritonArea}>
              <Text style={styles.gritonTitle}>Carta Actual</Text>
              {currentCard ? (
                <View style={styles.currentCardContainer}>
                  <Image source={cardImages[currentCard]} style={styles.cardImageLarge} resizeMode="contain" />
                </View>
              ) : (
                <View style={styles.placeholderCard}>
                  <Text style={styles.placeholderText}>Barajando...</Text>
                </View>
              )}
            </View>

            {/* Board */}
            <View style={styles.board}>
              {board.map((card, index) => (
                <TouchableOpacity 
                  key={index} 
                  style={styles.boardCard}
                  onPress={() => toggleMarkCard(card)}
                  activeOpacity={0.9}
                >
                  <Image source={cardImages[card]} style={styles.cardImage} resizeMode="cover" />
                  {markedCards[card] && (
                    <Image source={FrijolImage} style={styles.frijolitoImg} />
                  )}
                </TouchableOpacity>
              ))}
            </View>

            {/* Actions */}
            <View style={styles.actionsContainer}>
              <TouchableOpacity style={styles.actionBtn} onPress={() => setShowStickers(true)}>
                <Text style={styles.actionIcon}>😊</Text>
              </TouchableOpacity>
              <TouchableOpacity style={styles.loteriaBtnWrapper} onPress={callLoteria} activeOpacity={0.8}>
                <LinearGradient colors={GRADIENTS.bingoOnline} style={styles.loteriaBtn}>
                  <Text style={styles.loteriaBtnText}>¡LOTERÍA!</Text>
                </LinearGradient>
              </TouchableOpacity>
              <TouchableOpacity style={styles.actionBtn} onPress={() => setShowChat(true)}>
                <Text style={styles.actionIcon}>💬</Text>
              </TouchableOpacity>
            </View>
          </View>
        )}

        {/* Floating Sticker Animation */}
        {activeSticker && (
          <View style={styles.floatingStickerContainer} pointerEvents="none">
            <Text style={styles.floatingSticker}>{activeSticker}</Text>
          </View>
        )}

        {/* Modals */}
        <GameMenu 
          visible={showMenu} 
          onClose={() => setShowMenu(false)} 
          onLeaveRoom={leaveRoom} 
        />
        <PlayersModal 
          visible={showPlayers} 
          onClose={() => setShowPlayers(false)} 
          players={players} 
          hostId={players[0]?.id} // asumiendo que el primero es el host
        />
        <StickerModal 
          visible={showStickers} 
          onClose={() => setShowStickers(false)} 
          onSendSticker={handleSendSticker} 
        />
        <ChatArea 
          visible={showChat} 
          onClose={() => setShowChat(false)} 
          messages={messages} 
          onSendMessage={handleSendMessage} 
        />
      </SafeAreaView>
    </MexicanBackground>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, paddingTop: Platform.OS === 'android' ? 40 : 0 },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    paddingHorizontal: SPACING.lg,
    paddingBottom: SPACING.md,
  },
  headerItem: {
    flexDirection: 'row',
    alignItems: 'center',
    backgroundColor: 'rgba(0,0,0,0.3)',
    paddingHorizontal: SPACING.md,
    paddingVertical: SPACING.sm,
    borderRadius: RADIUS.round,
  },
  headerIcon: { fontSize: 20, marginRight: 5 },
  headerText: { color: COLORS.white, fontWeight: '700', fontSize: 16 },
  titleContainer: { alignItems: 'center' },
  roomTitle: {
    color: COLORS.white,
    fontSize: 20,
    fontWeight: '900',
    textShadowColor: 'rgba(0,0,0,0.5)',
    textShadowOffset: { width: 0, height: 2 },
    textShadowRadius: 4,
  },
  waitingWrapper: { flex: 1, justifyContent: 'center', padding: SPACING.xl },
  waitingContainer: {
    padding: SPACING.xl,
    borderRadius: RADIUS.xl,
    alignItems: 'center',
    overflow: 'hidden',
  },
  waitingTitle: { color: COLORS.white, fontSize: 22, fontWeight: '800', marginBottom: SPACING.lg },
  playerItem: { color: COLORS.white, fontSize: 18, marginBottom: SPACING.sm, fontWeight: '600' },
  waitingHost: { color: COLORS.textMuted, marginTop: SPACING.xl, fontStyle: 'italic' },
  startBtnWrapper: { width: '100%', marginTop: SPACING.xl, borderRadius: RADIUS.lg, overflow: 'hidden' },
  startBtn: { paddingVertical: 15, alignItems: 'center' },
  startBtnText: { color: COLORS.white, fontSize: 18, fontWeight: '800' },
  gameContainer: { flex: 1, alignItems: 'center', paddingHorizontal: SPACING.lg },
  gritonArea: { alignItems: 'center', marginVertical: SPACING.sm },
  gritonTitle: { color: 'rgba(255,255,255,0.8)', fontSize: 14, fontWeight: '700', marginBottom: 5, textTransform: 'uppercase' },
  currentCardContainer: {
    width: 100,
    height: 150,
    backgroundColor: COLORS.white,
    borderRadius: RADIUS.md,
    ...SHADOWS.large,
  },
  placeholderCard: {
    width: 100,
    height: 150,
    backgroundColor: 'rgba(255,255,255,0.2)',
    borderRadius: RADIUS.md,
    justifyContent: 'center',
    alignItems: 'center',
    borderWidth: 2,
    borderColor: 'rgba(255,255,255,0.4)',
    borderStyle: 'dashed',
  },
  placeholderText: { color: COLORS.white, fontWeight: '600' },
  cardImageLarge: { width: '100%', height: '100%', borderRadius: RADIUS.md },
  board: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    justifyContent: 'center',
    gap: SPACING.xs,
    marginVertical: SPACING.sm,
  },
  boardCard: {
    width: CARD_SIZE,
    height: CARD_SIZE * 1.5,
    backgroundColor: COLORS.white,
    borderRadius: RADIUS.sm,
    justifyContent: 'center',
    alignItems: 'center',
    ...SHADOWS.small,
  },
  cardImage: { width: '90%', height: '90%', borderRadius: RADIUS.xs },
  frijolitoImg: {
    position: 'absolute',
    width: 30,
    height: 30,
    ...SHADOWS.medium,
  },
  actionsContainer: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    width: '100%',
    paddingVertical: SPACING.md,
    marginTop: 'auto',
    marginBottom: SPACING.lg,
  },
  actionBtn: {
    backgroundColor: 'rgba(255,255,255,0.2)',
    width: 50,
    height: 50,
    borderRadius: 25,
    justifyContent: 'center',
    alignItems: 'center',
    borderWidth: 1,
    borderColor: 'rgba(255,255,255,0.4)',
  },
  actionIcon: { fontSize: 24 },
  loteriaBtnWrapper: {
    flex: 1,
    marginHorizontal: SPACING.lg,
    borderRadius: RADIUS.round,
    overflow: 'hidden',
    ...SHADOWS.large,
  },
  loteriaBtn: {
    paddingVertical: 15,
    alignItems: 'center',
  },
  loteriaBtnText: {
    color: COLORS.white,
    fontSize: 20,
    fontWeight: '900',
    letterSpacing: 1,
  },
  floatingStickerContainer: {
    position: 'absolute',
    top: '40%',
    left: 0,
    right: 0,
    alignItems: 'center',
    zIndex: 1000,
  },
  floatingSticker: {
    fontSize: 100,
    textShadowColor: 'rgba(0,0,0,0.3)',
    textShadowOffset: { width: 0, height: 4 },
    textShadowRadius: 10,
  },
});
