import React, { useState, useEffect } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, Image, Dimensions } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, RADIUS, SPACING, SHADOWS, GRADIENTS } from '../theme';
import { cardImages } from '../assetsMap';

const { width } = Dimensions.get('window');

export default function OfflineGameScreen({ navigation }) {
  const [deck, setDeck] = useState([]);
  const [currentCard, setCurrentCard] = useState(null);
  const [drawnCards, setDrawnCards] = useState([]);
  const [isPlaying, setIsPlaying] = useState(false);

  useEffect(() => {
    initializeDeck();
  }, []);

  const initializeDeck = () => {
    const newDeck = Array.from({ length: 54 }, (_, i) => i + 1);
    for (let i = newDeck.length - 1; i > 0; i--) {
      const j = Math.floor(Math.random() * (i + 1));
      [newDeck[i], newDeck[j]] = [newDeck[j], newDeck[i]];
    }
    setDeck(newDeck);
    setDrawnCards([]);
    setCurrentCard(null);
    setIsPlaying(false);
  };

  const drawCard = () => {
    if (deck.length > 0) {
      const nextCard = deck[0];
      setCurrentCard(nextCard);
      setDrawnCards(prev => [nextCard, ...prev]);
      setDeck(prev => prev.slice(1));
    } else {
      setIsPlaying(false);
    }
  };

  // Autoplay functionality could be added here with setInterval

  return (
    <MexicanBackground>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => navigation.goBack()} style={styles.backBtn}>
          <Text style={styles.backBtnText}>‹ Salir</Text>
        </TouchableOpacity>
        <Text style={styles.title}>Modo Gritón (Offline)</Text>
        <TouchableOpacity onPress={initializeDeck} style={styles.resetBtn}>
           <Text style={styles.resetBtnText}>↻</Text>
        </TouchableOpacity>
      </View>

      <View style={styles.container}>
        <View style={styles.counterContainer}>
          <Text style={styles.counterText}>Cartas restantes: {deck.length}</Text>
        </View>

        <View style={styles.currentCardWrapper}>
          {currentCard ? (
            <Image source={cardImages[currentCard]} style={styles.currentCard} resizeMode="contain" />
          ) : (
            <View style={styles.placeholderCard}>
              <Text style={styles.placeholderText}>Lotería</Text>
            </View>
          )}
        </View>

        <TouchableOpacity 
          style={styles.drawBtnWrapper} 
          onPress={drawCard}
          disabled={deck.length === 0}
          activeOpacity={0.8}
        >
          <LinearGradient
            colors={deck.length === 0 ? [COLORS.disabled, COLORS.disabled] : GRADIENTS.primary}
            style={styles.drawBtn}
          >
            <Text style={styles.drawBtnText}>
              {deck.length === 0 ? 'Se acabó la baraja' : (currentCard ? 'Siguiente Carta' : '¡Comenzar!')}
            </Text>
          </LinearGradient>
        </TouchableOpacity>

        <View style={styles.historyContainer}>
          <Text style={styles.historyTitle}>Últimas Cartas:</Text>
          <View style={styles.historyList}>
            {drawnCards.slice(1, 5).map((card, index) => (
              <Image key={index} source={cardImages[card]} style={styles.historyCard} resizeMode="cover" />
            ))}
          </View>
        </View>
      </View>
    </MexicanBackground>
  );
}

const styles = StyleSheet.create({
  header: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    paddingHorizontal: SPACING.lg,
    paddingTop: 60,
    paddingBottom: 20,
  },
  backBtn: { width: 60 },
  backBtnText: { color: COLORS.white, fontSize: 16, fontWeight: '600' },
  resetBtn: { width: 60, alignItems: 'flex-end' },
  resetBtnText: { color: COLORS.white, fontSize: 24, fontWeight: '800' },
  title: {
    color: COLORS.white,
    fontSize: 20,
    fontWeight: '800',
    textShadowColor: 'rgba(0,0,0,0.3)',
    textShadowOffset: { width: 0, height: 2 },
    textShadowRadius: 4,
  },
  container: {
    flex: 1,
    alignItems: 'center',
    padding: SPACING.lg,
  },
  counterContainer: {
    backgroundColor: 'rgba(0,0,0,0.5)',
    paddingHorizontal: SPACING.lg,
    paddingVertical: SPACING.sm,
    borderRadius: RADIUS.round,
    marginBottom: SPACING.xl,
  },
  counterText: {
    color: COLORS.white,
    fontSize: 16,
    fontWeight: '700',
  },
  currentCardWrapper: {
    width: width * 0.6,
    height: width * 0.9,
    backgroundColor: COLORS.white,
    borderRadius: RADIUS.lg,
    padding: SPACING.sm,
    ...SHADOWS.large,
    marginBottom: SPACING.xl,
  },
  currentCard: {
    width: '100%',
    height: '100%',
    borderRadius: RADIUS.md,
  },
  placeholderCard: {
    flex: 1,
    backgroundColor: COLORS.background,
    borderRadius: RADIUS.md,
    justifyContent: 'center',
    alignItems: 'center',
    borderWidth: 2,
    borderColor: COLORS.border,
    borderStyle: 'dashed',
  },
  placeholderText: {
    fontSize: 32,
    fontWeight: '900',
    color: COLORS.textMuted,
    opacity: 0.5,
  },
  drawBtnWrapper: {
    width: '80%',
    borderRadius: RADIUS.round,
    overflow: 'hidden',
    ...SHADOWS.medium,
    marginBottom: SPACING.xl,
  },
  drawBtn: {
    paddingVertical: 18,
    alignItems: 'center',
  },
  drawBtnText: {
    color: COLORS.white,
    fontSize: 20,
    fontWeight: '800',
  },
  historyContainer: {
    width: '100%',
    alignItems: 'center',
  },
  historyTitle: {
    color: COLORS.white,
    fontSize: 16,
    fontWeight: '700',
    marginBottom: SPACING.md,
  },
  historyList: {
    flexDirection: 'row',
    gap: SPACING.md,
  },
  historyCard: {
    width: 50,
    height: 75,
    borderRadius: RADIUS.sm,
    borderWidth: 2,
    borderColor: COLORS.white,
  },
});
