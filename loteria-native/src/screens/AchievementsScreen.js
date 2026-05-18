import React from 'react';
import { View, Text, TouchableOpacity, StyleSheet, FlatList } from 'react-native';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';

const ACHIEVEMENTS = [
  { id: '1', title: 'Primera Victoria', description: 'Gana tu primera partida de lotería.', icon: '🏆', unlocked: true },
  { id: '2', title: 'El Gritón', description: 'Crea 10 mesas públicas.', icon: '🗣️', unlocked: true },
  { id: '3', title: 'Racha Ganadora', description: 'Gana 3 partidas seguidas.', icon: '🔥', unlocked: false },
  { id: '4', title: 'Coleccionista', description: 'Desbloquea todas las barajas personalizadas.', icon: '🎴', unlocked: false },
  { id: '5', title: 'Social', description: 'Envía 50 mensajes en el chat de sala.', icon: '💬', unlocked: true },
  { id: '6', title: 'Sin Piedad', description: 'Gana en modo rápido.', icon: '⚡', unlocked: false },
];

export default function AchievementsScreen({ navigation }) {
  const renderItem = ({ item }) => (
    <View style={[styles.achievementCard, !item.unlocked && styles.lockedCard]}>
      <View style={styles.iconContainer}>
        <Text style={[styles.iconText, !item.unlocked && styles.lockedIcon]}>{item.icon}</Text>
      </View>
      <View style={styles.infoContainer}>
        <Text style={[styles.titleText, !item.unlocked && styles.lockedText]}>{item.title}</Text>
        <Text style={[styles.descText, !item.unlocked && styles.lockedDesc]}>{item.description}</Text>
      </View>
      <View style={styles.statusContainer}>
        {item.unlocked ? (
          <Text style={styles.unlockedBadge}>✓</Text>
        ) : (
          <Text style={styles.lockedBadge}>🔒</Text>
        )}
      </View>
    </View>
  );

  return (
    <MexicanBackground>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => navigation.goBack()} style={styles.backBtn}>
          <Text style={styles.backBtnText}>‹ Volver</Text>
        </TouchableOpacity>
        <Text style={styles.headerTitle}>Logros</Text>
        <View style={{ width: 80 }} />
      </View>

      <FlatList
        data={ACHIEVEMENTS}
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
  headerTitle: {
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
  achievementCard: {
    flexDirection: 'row',
    backgroundColor: COLORS.white,
    borderRadius: RADIUS.lg,
    padding: SPACING.md,
    marginBottom: SPACING.md,
    alignItems: 'center',
    ...SHADOWS.small,
  },
  lockedCard: {
    backgroundColor: COLORS.background,
    opacity: 0.8,
  },
  iconContainer: {
    width: 60,
    height: 60,
    borderRadius: RADIUS.md,
    backgroundColor: 'rgba(236, 72, 153, 0.1)',
    justifyContent: 'center',
    alignItems: 'center',
    marginRight: SPACING.md,
  },
  iconText: {
    fontSize: 32,
  },
  lockedIcon: {
    opacity: 0.5,
  },
  infoContainer: {
    flex: 1,
  },
  titleText: {
    fontSize: 18,
    fontWeight: '800',
    color: COLORS.text,
    marginBottom: 4,
  },
  lockedText: {
    color: COLORS.textMuted,
  },
  descText: {
    fontSize: 14,
    color: COLORS.textMuted,
    lineHeight: 20,
  },
  lockedDesc: {
    opacity: 0.7,
  },
  statusContainer: {
    width: 40,
    alignItems: 'center',
    justifyContent: 'center',
  },
  unlockedBadge: {
    color: COLORS.primary,
    fontSize: 24,
    fontWeight: 'bold',
  },
  lockedBadge: {
    fontSize: 20,
    opacity: 0.5,
  },
});
