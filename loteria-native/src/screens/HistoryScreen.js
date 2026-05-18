import React from 'react';
import { View, Text, TouchableOpacity, StyleSheet, FlatList } from 'react-native';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';

const MOCK_HISTORY = [
  { id: '1', date: '18 May 2026', room: 'Familia Garza', result: 'Ganador', earnings: '+50 monedas' },
  { id: '2', date: '17 May 2026', room: 'Amigos', result: 'Perdedor', earnings: '-10 monedas' },
  { id: '3', date: '16 May 2026', room: 'Mesa Pública #8', result: 'Perdedor', earnings: '-10 monedas' },
  { id: '4', date: '15 May 2026', room: 'Torneo', result: 'Ganador', earnings: '+200 monedas' },
];

export default function HistoryScreen({ navigation }) {
  const renderItem = ({ item }) => (
    <View style={styles.historyCard}>
      <View style={styles.cardHeader}>
        <Text style={styles.roomName}>{item.room}</Text>
        <Text style={styles.date}>{item.date}</Text>
      </View>
      <View style={styles.cardBody}>
        <Text style={[styles.result, item.result === 'Ganador' ? styles.win : styles.loss]}>
          {item.result}
        </Text>
        <Text style={styles.earnings}>{item.earnings}</Text>
      </View>
    </View>
  );

  return (
    <MexicanBackground>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => navigation.goBack()} style={styles.backBtn}>
          <Text style={styles.backBtnText}>‹ Volver</Text>
        </TouchableOpacity>
        <Text style={styles.title}>Historial de Partidas</Text>
        <View style={{ width: 80 }} />
      </View>

      <FlatList
        data={MOCK_HISTORY}
        keyExtractor={item => item.id}
        renderItem={renderItem}
        contentContainerStyle={styles.listContent}
        showsVerticalScrollIndicator={false}
      />
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
  backBtn: { width: 80 },
  backBtnText: { color: COLORS.white, fontSize: 16, fontWeight: '600' },
  title: {
    color: COLORS.white,
    fontSize: 22,
    fontWeight: '800',
    textShadowColor: 'rgba(0,0,0,0.3)',
    textShadowOffset: { width: 0, height: 2 },
    textShadowRadius: 4,
  },
  listContent: {
    padding: SPACING.lg,
  },
  historyCard: {
    backgroundColor: COLORS.white,
    borderRadius: RADIUS.lg,
    padding: SPACING.lg,
    marginBottom: SPACING.md,
    ...SHADOWS.small,
  },
  cardHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginBottom: SPACING.sm,
    borderBottomWidth: 1,
    borderBottomColor: COLORS.border,
    paddingBottom: SPACING.sm,
  },
  roomName: {
    fontSize: 16,
    fontWeight: '700',
    color: COLORS.text,
  },
  date: {
    fontSize: 14,
    color: COLORS.textMuted,
  },
  cardBody: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
  },
  result: {
    fontSize: 18,
    fontWeight: '800',
  },
  win: {
    color: COLORS.primary,
  },
  loss: {
    color: COLORS.error || '#ef4444',
  },
  earnings: {
    fontSize: 16,
    color: COLORS.text,
    fontWeight: '600',
  },
});
