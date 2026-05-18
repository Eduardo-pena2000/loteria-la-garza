import React, { useState } from 'react';
import { View, Text, TextInput, TouchableOpacity, StyleSheet, KeyboardAvoidingView, Platform, Switch } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, GRADIENTS, RADIUS, SPACING, SHADOWS } from '../theme';
import socket from '../socket'; // Asumiendo que existe un socket.js en src/

export default function CreateRoomScreen({ navigation, route }) {
  const { userName } = route.params || {};
  const [roomName, setRoomName] = useState(`Sala de ${userName || 'Lotería'}`);
  const [isPrivate, setIsPrivate] = useState(false);
  const [password, setPassword] = useState('');
  const [loading, setLoading] = useState(false);

  const handleCreateRoom = () => {
    if (!roomName.trim()) return;
    setLoading(true);
    
    const data = {
      playerName: userName || 'Host',
      roomName: roomName.trim(),
      isPrivate,
      password: isPrivate ? password.trim() : ''
    };

    socket.emit('create_room', data, (response) => {
      setLoading(false);
      if (response.success) {
        // Redirigir a la pantalla de juego (como host)
        navigation.replace('Game', { roomId: response.roomId, isHost: true, userName });
      } else {
        alert(response.message || 'Error al crear la sala');
      }
    });
  };

  return (
    <MexicanBackground>
      <KeyboardAvoidingView 
        style={styles.container} 
        behavior={Platform.OS === 'ios' ? 'padding' : 'height'}
      >
        <View style={styles.header}>
          <TouchableOpacity onPress={() => navigation.goBack()} style={styles.backBtn}>
            <Text style={styles.backBtnText}>‹ Volver</Text>
          </TouchableOpacity>
          <Text style={styles.title}>Abrir Mesa</Text>
          <View style={{ width: 60 }} />
        </View>

        <View style={styles.content}>
          <View style={styles.card}>
            <Text style={styles.label}>Nombre de la Sala</Text>
            <TextInput
              style={styles.input}
              value={roomName}
              onChangeText={setRoomName}
              placeholder="Ej. Familia Garza"
              placeholderTextColor={COLORS.textMuted}
              maxLength={30}
            />

            <View style={styles.switchRow}>
              <View>
                <Text style={styles.label}>Sala Privada</Text>
                <Text style={styles.subtext}>Requiere contraseña para entrar</Text>
              </View>
              <Switch
                value={isPrivate}
                onValueChange={setIsPrivate}
                trackColor={{ false: COLORS.border, true: COLORS.primary }}
                thumbColor={COLORS.white}
              />
            </View>

            {isPrivate && (
              <View style={styles.passwordContainer}>
                <Text style={styles.label}>Contraseña</Text>
                <TextInput
                  style={styles.input}
                  value={password}
                  onChangeText={setPassword}
                  placeholder="Escribe una contraseña corta"
                  placeholderTextColor={COLORS.textMuted}
                  secureTextEntry
                  maxLength={15}
                />
              </View>
            )}

            <TouchableOpacity 
              style={styles.createBtnWrapper} 
              onPress={handleCreateRoom}
              disabled={loading}
              activeOpacity={0.8}
            >
              <LinearGradient
                colors={loading ? [COLORS.disabled, COLORS.disabled] : GRADIENTS.abrirMesa}
                start={{ x: 0, y: 0 }}
                end={{ x: 1, y: 0 }}
                style={styles.createBtn}
              >
                <Text style={styles.createBtnText}>
                  {loading ? 'Creando...' : 'Crear Sala'}
                </Text>
              </LinearGradient>
            </TouchableOpacity>
          </View>
        </View>
      </KeyboardAvoidingView>
    </MexicanBackground>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1 },
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
    fontSize: 24,
    fontWeight: '800',
    textShadowColor: 'rgba(0,0,0,0.3)',
    textShadowOffset: { width: 0, height: 2 },
    textShadowRadius: 4,
  },
  content: {
    flex: 1,
    padding: SPACING.lg,
    justifyContent: 'center',
  },
  card: {
    backgroundColor: COLORS.white,
    borderRadius: RADIUS.xl,
    padding: SPACING.xl,
    ...SHADOWS.large,
  },
  label: {
    fontSize: 16,
    fontWeight: '700',
    color: COLORS.text,
    marginBottom: SPACING.xs,
  },
  subtext: {
    fontSize: 12,
    color: COLORS.textMuted,
  },
  input: {
    backgroundColor: COLORS.background,
    borderWidth: 1,
    borderColor: COLORS.border,
    borderRadius: RADIUS.md,
    padding: SPACING.md,
    fontSize: 16,
    color: COLORS.text,
    marginBottom: SPACING.lg,
  },
  switchRow: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: SPACING.lg,
  },
  passwordContainer: {
    marginBottom: SPACING.md,
  },
  createBtnWrapper: {
    borderRadius: RADIUS.lg,
    marginTop: SPACING.md,
    ...SHADOWS.medium,
  },
  createBtn: {
    paddingVertical: 16,
    borderRadius: RADIUS.lg,
    alignItems: 'center',
  },
  createBtnText: {
    color: COLORS.white,
    fontSize: 18,
    fontWeight: '700',
  },
});
