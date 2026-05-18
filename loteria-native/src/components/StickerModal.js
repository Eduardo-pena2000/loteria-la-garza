import React from 'react';
import { View, Text, TouchableOpacity, StyleSheet, Modal, ScrollView, Dimensions } from 'react-native';
import { BlurView } from 'expo-blur';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';

const STICKERS = ['😂', '😍', '😎', '😭', '😡', '👍', '👎', '🎉', '🔥', '👀', '🇲🇽', '🌮', '🌶️', '🎸'];

const { width } = Dimensions.get('window');
const STICKER_SIZE = (width - SPACING.xl * 2 - SPACING.md * 3) / 4;

export default function StickerModal({ visible, onClose, onSendSticker }) {
  return (
    <Modal visible={visible} transparent animationType="slide">
      <BlurView intensity={20} style={styles.overlay}>
        <View style={styles.modalContent}>
          <View style={styles.header}>
            <Text style={styles.title}>Stickers</Text>
            <TouchableOpacity onPress={onClose} style={styles.closeBtn}>
              <Text style={styles.closeBtnText}>✕</Text>
            </TouchableOpacity>
          </View>
          
          <ScrollView contentContainerStyle={styles.grid}>
            {STICKERS.map((sticker, index) => (
              <TouchableOpacity
                key={index}
                style={styles.stickerBtn}
                onPress={() => {
                  onSendSticker(sticker);
                  onClose();
                }}
              >
                <Text style={styles.stickerText}>{sticker}</Text>
              </TouchableOpacity>
            ))}
          </ScrollView>
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
    height: '40%',
    ...SHADOWS.large,
  },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: SPACING.md,
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
  grid: {
    flexDirection: 'row',
    flexWrap: 'wrap',
    gap: SPACING.md,
    paddingBottom: SPACING.xl,
  },
  stickerBtn: {
    width: STICKER_SIZE,
    height: STICKER_SIZE,
    backgroundColor: COLORS.background,
    borderRadius: RADIUS.md,
    justifyContent: 'center',
    alignItems: 'center',
  },
  stickerText: {
    fontSize: 32,
  },
});
