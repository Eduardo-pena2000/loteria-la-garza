import React from 'react';
import { View, Text, TouchableOpacity, StyleSheet, Modal, FlatList } from 'react-native';
import { BlurView } from 'expo-blur';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';

export default function PlayersModal({ visible, onClose, players, hostId }) {
  const renderItem = ({ item }) => (
    <View style={styles.playerRow}>
      <Text style={styles.playerName}>{item.name}</Text>
      {item.id === hostId && <Text style={styles.hostBadge}>Host</Text>}
    </View>
  );

  return (
    <Modal visible={visible} transparent animationType="slide">
      <BlurView intensity={20} style={styles.overlay}>
        <View style={styles.modalContent}>
          <View style={styles.header}>
            <Text style={styles.title}>Jugadores ({players.length})</Text>
            <TouchableOpacity onPress={onClose} style={styles.closeBtn}>
              <Text style={styles.closeBtnText}>✕</Text>
            </TouchableOpacity>
          </View>
          
          <FlatList
            data={players}
            keyExtractor={(item) => item.id}
            renderItem={renderItem}
            contentContainerStyle={styles.listContent}
          />
        </View>
      </BlurView>
    </Modal>
  );
}

const styles = StyleSheet.create({
  overlay: {
    flex: 1,
    justifyContent: 'flex-end',
    backgroundColor: 'rgba(0,0,0,0.5)',
  },
  modalContent: {
    backgroundColor: COLORS.white,
    borderTopLeftRadius: RADIUS.xl,
    borderTopRightRadius: RADIUS.xl,
    padding: SPACING.xl,
    height: '60%',
    ...SHADOWS.large,
  },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: SPACING.lg,
  },
  title: {
    fontSize: 20,
    fontWeight: '800',
    color: COLORS.text,
  },
  closeBtn: {
    padding: SPACING.xs,
  },
  closeBtnText: {
    fontSize: 24,
    color: COLORS.textMuted,
  },
  listContent: {
    paddingBottom: SPACING.xl,
  },
  playerRow: {
    flexDirection: 'row',
    alignItems: 'center',
    paddingVertical: SPACING.md,
    borderBottomWidth: 1,
    borderBottomColor: COLORS.border,
  },
  playerName: {
    fontSize: 16,
    color: COLORS.text,
    flex: 1,
  },
  hostBadge: {
    backgroundColor: COLORS.primary,
    color: COLORS.white,
    paddingHorizontal: 8,
    paddingVertical: 4,
    borderRadius: RADIUS.sm,
    fontSize: 12,
    fontWeight: '700',
  },
});
