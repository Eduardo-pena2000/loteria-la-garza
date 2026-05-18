import React from 'react';
import { View, Text, TouchableOpacity, StyleSheet, Modal } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';
import { BlurView } from 'expo-blur';
import { COLORS, RADIUS, SPACING, GRADIENTS, SHADOWS } from '../theme';

export default function GameMenu({ visible, onClose, onLeaveRoom }) {
  return (
    <Modal visible={visible} transparent animationType="fade">
      <BlurView intensity={20} style={styles.overlay}>
        <View style={styles.modalContent}>
          <Text style={styles.title}>Menú del Juego</Text>
          
          <TouchableOpacity style={styles.btnWrapper} onPress={onClose} activeOpacity={0.8}>
            <LinearGradient colors={GRADIENTS.primary} style={styles.btn}>
              <Text style={styles.btnText}>Continuar Juego</Text>
            </LinearGradient>
          </TouchableOpacity>

          <TouchableOpacity style={styles.btnWrapper} onPress={() => {}} activeOpacity={0.8}>
             <LinearGradient colors={GRADIENTS.ayuda} style={styles.btn}>
               <Text style={styles.btnText}>Ajustes de Sonido</Text>
             </LinearGradient>
          </TouchableOpacity>

          <TouchableOpacity style={styles.btnWrapper} onPress={onLeaveRoom} activeOpacity={0.8}>
            <LinearGradient colors={GRADIENTS.quitarPub} style={styles.btn}>
              <Text style={styles.btnText}>Abandonar Sala</Text>
            </LinearGradient>
          </TouchableOpacity>
        </View>
      </BlurView>
    </Modal>
  );
}

const styles = StyleSheet.create({
  overlay: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'rgba(0,0,0,0.5)',
  },
  modalContent: {
    backgroundColor: COLORS.white,
    padding: SPACING.xl,
    borderRadius: RADIUS.xl,
    width: '80%',
    ...SHADOWS.large,
    alignItems: 'center',
  },
  title: {
    fontSize: 22,
    fontWeight: '800',
    color: COLORS.text,
    marginBottom: SPACING.xl,
  },
  btnWrapper: {
    width: '100%',
    marginBottom: SPACING.md,
    borderRadius: RADIUS.lg,
    overflow: 'hidden',
  },
  btn: {
    paddingVertical: 15,
    alignItems: 'center',
  },
  btnText: {
    color: COLORS.white,
    fontSize: 16,
    fontWeight: '700',
  },
});
