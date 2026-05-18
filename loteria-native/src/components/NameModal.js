import React, { useState, useEffect } from 'react';
import { View, Text, TextInput, TouchableOpacity, StyleSheet, Modal, Image, KeyboardAvoidingView, Platform } from 'react-native';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';

const bannerImage = require('../../assets/alert/nombre.png');

export default function NameModal({ visible, onSave, currentName = '' }) {
  const [name, setName] = useState(currentName);

  useEffect(() => {
    if (visible) setName(currentName);
  }, [visible, currentName]);

  const handleSave = () => {
    if (name.trim()) {
      onSave(name.trim());
    }
  };

  return (
    <Modal visible={visible} transparent animationType="fade">
      <KeyboardAvoidingView 
        behavior={Platform.OS === 'ios' ? 'padding' : 'height'}
        style={styles.overlay}
      >
        <View style={styles.container}>
          {/* Banner amarillo con ilustración */}
          <View style={styles.banner}>
            <Image source={bannerImage} style={styles.bannerImage} resizeMode="contain" />
          </View>

          {/* Contenido */}
          <View style={styles.content}>
            <TextInput
              style={styles.input}
              value={name}
              onChangeText={(text) => setName(text.slice(0, 30))}
              placeholder="Tu nombre"
              placeholderTextColor={COLORS.textLight}
              autoFocus
              maxLength={30}
            />
            <Text style={styles.counter}>{name.length}/30</Text>
            <Text style={styles.hint}>Puedes cambiarlo más tarde</Text>

            <TouchableOpacity 
              style={[styles.saveBtn, !name.trim() && styles.saveBtnDisabled]}
              onPress={handleSave}
              disabled={!name.trim()}
            >
              <Text style={styles.saveBtnText}>Guardar</Text>
            </TouchableOpacity>
          </View>
        </View>
      </KeyboardAvoidingView>
    </Modal>
  );
}

const styles = StyleSheet.create({
  overlay: {
    flex: 1,
    backgroundColor: COLORS.overlay,
    justifyContent: 'center',
    alignItems: 'center',
    padding: SPACING.lg,
  },
  container: {
    width: '100%',
    maxWidth: 400,
    borderRadius: RADIUS.xl,
    backgroundColor: COLORS.white,
    overflow: 'hidden',
    ...SHADOWS.large,
  },
  banner: {
    width: '100%',
    height: 120,
    backgroundColor: '#FFC107',
    justifyContent: 'center',
    alignItems: 'center',
  },
  bannerImage: {
    width: '80%',
    height: '100%',
  },
  content: {
    padding: SPACING.lg,
    alignItems: 'center',
  },
  input: {
    width: '100%',
    borderWidth: 2,
    borderColor: COLORS.primary,
    borderRadius: RADIUS.pill,
    paddingHorizontal: SPACING.lg,
    paddingVertical: SPACING.md,
    fontSize: 16,
    color: COLORS.text,
    backgroundColor: COLORS.white,
  },
  counter: {
    alignSelf: 'flex-end',
    color: COLORS.textLight,
    fontSize: 12,
    marginTop: SPACING.xs,
    marginRight: SPACING.sm,
  },
  hint: {
    color: COLORS.textSecondary,
    fontSize: 14,
    marginTop: SPACING.sm,
  },
  saveBtn: {
    backgroundColor: COLORS.blue,
    paddingHorizontal: SPACING.xl,
    paddingVertical: SPACING.md,
    borderRadius: RADIUS.pill,
    marginTop: SPACING.lg,
  },
  saveBtnDisabled: {
    opacity: 0.5,
  },
  saveBtnText: {
    color: COLORS.white,
    fontSize: 16,
    fontWeight: '700',
  },
});
