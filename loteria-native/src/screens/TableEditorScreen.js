import React, { useState } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, Image, ScrollView, Dimensions, Alert } from 'react-native';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, RADIUS, SPACING, CARD_NAMES } from '../theme';
import { addTable, saveTables, getTables } from '../storage';

const { width } = Dimensions.get('window');

// Mapa estático de imágenes (React Native requiere require estático)
const CARD_IMAGES = {
  0: require('../../assets/img/Back.png'),
  1: require('../../assets/figuras/modern/1.jpg'),
  2: require('../../assets/figuras/modern/2.jpg'),
  3: require('../../assets/figuras/modern/3.jpg'),
  4: require('../../assets/figuras/modern/4.jpg'),
  5: require('../../assets/figuras/modern/5.jpg'),
  6: require('../../assets/figuras/modern/6.jpg'),
  7: require('../../assets/figuras/modern/7.jpg'),
  8: require('../../assets/figuras/modern/8.jpg'),
  9: require('../../assets/figuras/modern/9.jpg'),
  10: require('../../assets/figuras/modern/10.jpg'),
  11: require('../../assets/figuras/modern/11.jpg'),
  12: require('../../assets/figuras/modern/12.jpg'),
  13: require('../../assets/figuras/modern/13.jpg'),
  14: require('../../assets/figuras/modern/14.jpg'),
  15: require('../../assets/figuras/modern/15.jpg'),
  16: require('../../assets/figuras/modern/16.jpg'),
  17: require('../../assets/figuras/modern/17.jpg'),
  18: require('../../assets/figuras/modern/18.jpg'),
  19: require('../../assets/figuras/modern/19.jpg'),
  20: require('../../assets/figuras/modern/20.jpg'),
  21: require('../../assets/figuras/modern/21.jpg'),
  22: require('../../assets/figuras/modern/22.jpg'),
  23: require('../../assets/figuras/modern/23.jpg'),
  24: require('../../assets/figuras/modern/24.jpg'),
  25: require('../../assets/figuras/modern/25.jpg'),
  26: require('../../assets/figuras/modern/26.jpg'),
  27: require('../../assets/figuras/modern/27.jpg'),
  28: require('../../assets/figuras/modern/28.jpg'),
  29: require('../../assets/figuras/modern/29.jpg'),
  30: require('../../assets/figuras/modern/30.jpg'),
  31: require('../../assets/figuras/modern/31.jpg'),
  32: require('../../assets/figuras/modern/32.jpg'),
  33: require('../../assets/figuras/modern/33.jpg'),
  34: require('../../assets/figuras/modern/34.jpg'),
  35: require('../../assets/figuras/modern/35.jpg'),
  36: require('../../assets/figuras/modern/36.jpg'),
  37: require('../../assets/figuras/modern/37.jpg'),
  38: require('../../assets/figuras/modern/38.jpg'),
  39: require('../../assets/figuras/modern/39.jpg'),
  40: require('../../assets/figuras/modern/40.jpg'),
  41: require('../../assets/figuras/modern/41.jpg'),
  42: require('../../assets/figuras/modern/42.jpg'),
  43: require('../../assets/figuras/modern/43.jpg'),
  44: require('../../assets/figuras/modern/44.jpg'),
  45: require('../../assets/figuras/modern/45.jpg'),
  46: require('../../assets/figuras/modern/46.jpg'),
  47: require('../../assets/figuras/modern/47.jpg'),
  48: require('../../assets/figuras/modern/48.jpg'),
  49: require('../../assets/figuras/modern/49.jpg'),
  50: require('../../assets/figuras/modern/50.jpg'),
  51: require('../../assets/figuras/modern/51.jpg'),
  52: require('../../assets/figuras/modern/52.jpg'),
  53: require('../../assets/figuras/modern/53.jpg'),
  54: require('../../assets/figuras/modern/54.jpg'),
};

export default function TableEditorScreen({ route, navigation }) {
  const { size = '4x4', editIndex = -1, table } = route.params || {};
  const gridSize = size === '5x5' ? 5 : 4;
  const totalCards = gridSize * gridSize;

  const [cards, setCards] = useState(() => {
    if (table?.cards) return [...table.cards];
    return new Array(totalCards).fill(0);
  });
  const [favorite, setFavorite] = useState(table?.favorite || false);

  const generateRandom = () => {
    const available = Array.from({ length: 54 }, (_, i) => i + 1);
    const shuffled = available.sort(() => Math.random() - 0.5);
    setCards(shuffled.slice(0, totalCards));
  };

  const handleCardPress = (index) => {
    const current = cards[index];
    const usedCards = cards.filter((_, i) => i !== index);
    let candidate = current >= 54 ? 1 : current + 1;
    let attempts = 0;
    while (usedCards.includes(candidate) && attempts < 54) {
      candidate = candidate >= 54 ? 1 : candidate + 1;
      attempts++;
    }
    const newCards = [...cards];
    newCards[index] = candidate;
    setCards(newCards);
  };

  const handleSave = async () => {
    if (cards.includes(0)) {
      Alert.alert('Tabla incompleta', 'Genera la tabla aleatoriamente o presiona cada carta para asignarla.');
      return;
    }

    const tableData = { cards, favorite, createdAt: Date.now() };

    if (editIndex >= 0) {
      const tables = await getTables(size);
      tables[editIndex] = tableData;
      await saveTables(tables, size);
    } else {
      await addTable(tableData, size);
    }

    navigation.goBack();
  };

  const cellPadding = 4;
  const gridPadding = 8;
  const availableWidth = width - SPACING.lg * 2 - gridPadding * 2;
  const cardWidth = (availableWidth - cellPadding * (gridSize - 1)) / gridSize;

  return (
    <View style={styles.container}>
      {/* Header */}
      <View style={styles.header}>
        <TouchableOpacity onPress={() => navigation.goBack()} style={styles.headerBtn}>
          <Text style={styles.headerBtnText}>←</Text>
        </TouchableOpacity>
        <View style={styles.headerActions}>
          <TouchableOpacity onPress={handleSave} style={styles.actionBtn}>
            <Text style={styles.actionIcon}>💾</Text>
          </TouchableOpacity>
          <TouchableOpacity onPress={() => setFavorite(!favorite)} style={styles.actionBtn}>
            <Text style={styles.actionIcon}>{favorite ? '❤️' : '🤍'}</Text>
          </TouchableOpacity>
        </View>
      </View>

      {/* Instrucción */}
      <View style={styles.tipBar}>
        <Text style={styles.tipText}>Presiona para cambiar la figura</Text>
        <Text style={styles.tipIcon}>👆</Text>
      </View>

      {/* Grid de cartas */}
      <MexicanBackground style={styles.gridContainer}>
        <ScrollView contentContainerStyle={styles.gridScroll}>
          <View style={[styles.grid, { padding: gridPadding }]}>
            {cards.map((cardId, index) => (
              <TouchableOpacity
                key={index}
                style={[styles.cardCell, {
                  width: cardWidth,
                  height: cardWidth * 1.4,
                  marginRight: (index + 1) % gridSize === 0 ? 0 : cellPadding,
                  marginBottom: cellPadding,
                }]}
                onPress={() => handleCardPress(index)}
                activeOpacity={0.7}
              >
                <Image
                  source={CARD_IMAGES[cardId]}
                  style={styles.cardImage}
                  resizeMode="cover"
                />
                {cardId > 0 && (
                  <>
                    <View style={styles.cardNumberBadge}>
                      <Text style={styles.cardNumber}>{cardId}</Text>
                    </View>
                    <View style={styles.cardNameBg}>
                      <Text style={styles.cardName} numberOfLines={1}>
                        {CARD_NAMES[cardId] || `#${cardId}`}
                      </Text>
                    </View>
                  </>
                )}
              </TouchableOpacity>
            ))}
          </View>

          {/* Botón generar */}
          <TouchableOpacity style={styles.randomBtn} onPress={generateRandom}>
            <Text style={styles.randomIcon}>🔄</Text>
            <Text style={styles.randomText}>Generar aleatoriamente</Text>
          </TouchableOpacity>
        </ScrollView>
      </MexicanBackground>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: COLORS.white },
  header: {
    flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between',
    backgroundColor: COLORS.primary, paddingTop: 50, paddingBottom: SPACING.md, paddingHorizontal: SPACING.md,
  },
  headerBtn: { width: 44, height: 44, justifyContent: 'center', alignItems: 'center' },
  headerBtnText: { color: COLORS.white, fontSize: 28, fontWeight: '700' },
  headerActions: { flexDirection: 'row', gap: SPACING.sm },
  actionBtn: { width: 40, height: 40, justifyContent: 'center', alignItems: 'center' },
  actionIcon: { fontSize: 22 },
  tipBar: {
    flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between',
    backgroundColor: '#FFF8E1', paddingVertical: SPACING.sm, paddingHorizontal: SPACING.md,
    borderBottomWidth: 1, borderBottomColor: COLORS.border,
  },
  tipText: { fontSize: 14, color: COLORS.text },
  tipIcon: { fontSize: 18 },
  gridContainer: { flex: 1 },
  gridScroll: { padding: SPACING.md, paddingBottom: SPACING.xxl },
  grid: {
    flexDirection: 'row', flexWrap: 'wrap',
    backgroundColor: COLORS.primary, borderRadius: RADIUS.md,
  },
  cardCell: {
    borderRadius: 4, overflow: 'hidden', backgroundColor: COLORS.white,
  },
  cardImage: { width: '100%', height: '100%' },
  cardNumberBadge: { position: 'absolute', top: 2, right: 4 },
  cardNumber: {
    fontSize: 11, fontWeight: '800', color: COLORS.white,
    textShadowColor: 'rgba(0,0,0,0.7)', textShadowOffset: { width: 0, height: 1 }, textShadowRadius: 2,
  },
  cardNameBg: {
    position: 'absolute', bottom: 0, left: 0, right: 0,
    backgroundColor: 'rgba(0,0,0,0.5)', paddingVertical: 2, paddingHorizontal: 4,
  },
  cardName: { color: COLORS.white, fontSize: 9, fontWeight: '700', textAlign: 'center', textTransform: 'uppercase' },
  randomBtn: {
    flexDirection: 'row', alignItems: 'center', justifyContent: 'center',
    marginTop: SPACING.lg, paddingVertical: SPACING.md, gap: SPACING.sm,
  },
  randomIcon: { fontSize: 18 },
  randomText: { fontSize: 16, color: COLORS.primary, fontWeight: '600' },
});
