import React from 'react';
import { View, Text, TouchableOpacity, StyleSheet, FlatList, Image } from 'react-native';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';

const MOCK_LEADERBOARD = [
  { id: '1', name: 'ElPanda', score: 15000, rank: 1 },
  { id: '2', name: 'MariaLinda', score: 14200, rank: 2 },
  { id: '3', name: 'JuanPerez', score: 13800, rank: 3 },
  { id: '4', name: 'TacosAlPastor', score: 12500, rank: 4 },
  { id: '5', name: 'ChavoDelOcho', score: 11000, rank: 5 },
  { id: '6', name: 'LaCatrina', score: 10500, rank: 6 },
  { id: '7', name: 'TequilaLimon', score: 9800, rank: 7 },
  { id: '8', name: 'GalloGiro', score: 9200, rank: 8 },
];

export default function LeaderboardScreen({ navigation }) {
  const renderItem = ({ item }) => {
    const isTop3 = item.rank <= 3;
    return (
      <View style={[styles.playerRow, isTop3 && styles.top3Row]}>
        <View style={styles.rankContainer}>
          <Text style={[styles.rankText, isTop3 && styles.top3RankText]}>
            #{item.rank}
          </Text>
        </View>
        <Text style={[styles.playerName, isTop3 && styles.top3PlayerName]}>
          {item.name}
        </Text>
        <Text style={[styles.scoreText, isTop3 && styles.top3ScoreText]}>
          {item.score} pts
        </Text>
      </View>
    );
  };

  return (
    <MexicanBackground>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => navigation.goBack()} style={styles.backBtn}>
          <Text style={styles.backBtnText}>‹ Volver</Text>
        </TouchableOpacity>
        <Text style={styles.title}>Clasificación</Text>
        <View style={{ width: 80 }} />
      </View>

      <View style={styles.container}>
        <View style={styles.board}>
          <View style={styles.boardHeader}>
            <Text style={styles.colHeader}>Rango</Text>
            <Text style={[styles.colHeader, { flex: 1, textAlign: 'center' }]}>Jugador</Text>
            <Text style={styles.colHeader}>Puntaje</Text>
          </View>
          <FlatList
            data={MOCK_LEADERBOARD}
            keyExtractor={item => item.id}
            renderItem={renderItem}
            contentContainerStyle={styles.listContent}
            showsVerticalScrollIndicator={false}
          />
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
  container: {
    flex: 1,
    paddingHorizontal: SPACING.lg,
    paddingBottom: SPACING.lg,
  },
  board: {
    flex: 1,
    backgroundColor: COLORS.white,
    borderRadius: RADIUS.xl,
    overflow: 'hidden',
    ...SHADOWS.large,
  },
  boardHeader: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    backgroundColor: COLORS.background,
    padding: SPACING.md,
    borderBottomWidth: 1,
    borderBottomColor: COLORS.border,
  },
  colHeader: {
    fontSize: 14,
    fontWeight: '700',
    color: COLORS.textMuted,
    textTransform: 'uppercase',
  },
  listContent: {
    padding: SPACING.md,
  },
  playerRow: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    paddingVertical: SPACING.md,
    borderBottomWidth: 1,
    borderBottomColor: COLORS.background,
  },
  top3Row: {
    backgroundColor: 'rgba(236, 72, 153, 0.05)',
    borderRadius: RADIUS.md,
    borderBottomWidth: 0,
    marginBottom: SPACING.xs,
    paddingHorizontal: SPACING.sm,
  },
  rankContainer: {
    width: 40,
    alignItems: 'center',
  },
  rankText: {
    fontSize: 16,
    fontWeight: '700',
    color: COLORS.textMuted,
  },
  top3RankText: {
    color: COLORS.primary,
    fontSize: 20,
    fontWeight: '900',
  },
  playerName: {
    flex: 1,
    fontSize: 16,
    fontWeight: '600',
    color: COLORS.text,
    textAlign: 'center',
  },
  top3PlayerName: {
    color: COLORS.text,
    fontWeight: '800',
    fontSize: 18,
  },
  scoreText: {
    fontSize: 16,
    fontWeight: '700',
    color: COLORS.text,
  },
  top3ScoreText: {
    color: COLORS.primary,
    fontWeight: '900',
  },
});
