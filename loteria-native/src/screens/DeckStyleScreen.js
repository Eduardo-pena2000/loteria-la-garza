import React, { useState } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, Image, ScrollView } from 'react-native';
import { COLORS, RADIUS, SPACING } from '../theme';
import { setSelectedDeck } from '../storage';

// Estilos de baraja disponibles (mapean a las carpetas en assets/figuras/)
const DECK_STYLES = [
  { id: 'modern', name: 'Lotería Moderna', author: 'Baraja de Lotería', preview: require('../../assets/figuras/modern/1.jpg') },
  { id: 'kawaii', name: 'Kawaii', author: 'Baraja de Lotería', preview: require('../../assets/figuras/kawaii/1.jpg') },
  { id: 'gorditos', name: 'Gorditos', author: 'Baraja de Lotería', preview: require('../../assets/figuras/gorditos/1.jpg') },
  { id: 'perritos', name: 'Perritos', author: 'Baraja de Lotería', preview: require('../../assets/figuras/perritos/1.jpg') },
  { id: 'cartoon', name: 'Gatitos', author: 'Baraja de Lotería', preview: require('../../assets/figuras/cartoon/1.jpg') },
  { id: 'handdraw', name: 'Garabatos', author: 'Baraja de Lotería', preview: require('../../assets/figuras/handdraw/1.jpg') },
  { id: 'modern-coloridas', name: 'Moderna Colorida', author: 'Day Arrieta', preview: require('../../assets/figuras/modern-coloridas/1.jpg') },
  { id: 'anime-pokemon', name: 'Anime', author: 'Gustavo Zimbrón - Gemini', preview: require('../../assets/figuras/anime-pokemon/1.jpg') },
];

export default function DeckStyleScreen({ navigation }) {
  const [selected, setSelected] = useState('modern');

  const handleSelect = async (deckId) => {
    setSelected(deckId);
    await setSelectedDeck(deckId);
  };

  return (
    <View style={styles.container}>
      {/* Header */}
      <View style={styles.header}>
        <Text style={styles.headerTitle}>Estilo de Baraja</Text>
      </View>

      <ScrollView style={styles.list} showsVerticalScrollIndicator={false}>
        {DECK_STYLES.map((deck) => (
          <TouchableOpacity
            key={deck.id}
            style={[styles.deckItem, selected === deck.id && styles.deckItemSelected]}
            onPress={() => handleSelect(deck.id)}
            activeOpacity={0.7}
          >
            <Image source={deck.preview} style={styles.deckPreview} resizeMode="cover" />
            <View style={styles.deckInfo}>
              <Text style={styles.deckName}>{deck.name}</Text>
              <Text style={styles.deckAuthor}>{deck.author}</Text>
            </View>
            {selected === deck.id && (
              <Text style={styles.checkmark}>✓</Text>
            )}
          </TouchableOpacity>
        ))}

        {/* Cancelar */}
        <TouchableOpacity style={styles.cancelBtn} onPress={() => navigation.goBack()}>
          <Text style={styles.cancelText}>Cancelar</Text>
        </TouchableOpacity>

        <View style={{ height: 30 }} />
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: COLORS.white },
  header: {
    backgroundColor: COLORS.primary, paddingTop: 50, paddingBottom: SPACING.md,
    alignItems: 'center',
  },
  headerTitle: { color: COLORS.white, fontSize: 18, fontWeight: '700' },
  list: { flex: 1 },
  deckItem: {
    flexDirection: 'row', alignItems: 'center', paddingVertical: SPACING.md,
    paddingHorizontal: SPACING.lg, borderBottomWidth: 1, borderBottomColor: COLORS.divider,
  },
  deckItemSelected: { backgroundColor: '#FFF3E0' },
  deckPreview: { width: 50, height: 68, borderRadius: 6, marginRight: SPACING.md },
  deckInfo: { flex: 1 },
  deckName: { fontSize: 16, fontWeight: '600', color: COLORS.text },
  deckAuthor: { fontSize: 13, color: COLORS.textSecondary, marginTop: 2 },
  checkmark: { fontSize: 22, color: COLORS.text, fontWeight: '400' },
  cancelBtn: { alignSelf: 'center', paddingVertical: SPACING.lg },
  cancelText: { fontSize: 16, color: COLORS.textLight },
});
