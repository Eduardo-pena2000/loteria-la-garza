import React, { useState } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, TextInput, KeyboardAvoidingView, Platform, ActivityIndicator } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, RADIUS, SPACING, SHADOWS, GRADIENTS } from '../theme';
import socket from '../socket';

export default function JoinByLinkScreen({ navigation, route }) {
  const { userName } = route.params || {};
  const [roomId, setRoomId] = useState('');
  const [password, setPassword] = useState('');
  const [loading, setLoading] = useState(false);

  const handleJoin = () => {
    if (!roomId.trim()) return;
    setLoading(true);

    socket.emit('join_room', { 
      roomId: roomId.trim().toUpperCase(), 
      playerName: userName || 'Jugador',
      password: password.trim()
    }, (response) => {
      setLoading(false);
      if (response.success) {
        navigation.replace('Game', { roomId: roomId.trim().toUpperCase(), isHost: false, userName });
      } else {
        alert(response.message || 'Error al unirse a la sala');
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
          <Text style={styles.title}>Unirse con Código</Text>
          <View style={{ width: 80 }} />
        </View>

        <View style={styles.content}>
          <View style={styles.card}>
            <Text style={styles.label}>Código de la Sala</Text>
            <TextInput
              style={styles.input}
              value={roomId}
              onChangeText={setRoomId}
              placeholder="Ej. AB123C"
              placeholderTextColor={COLORS.textMuted}
              autoCapitalize="characters"
              maxLength={6}
            />

            <Text style={styles.label}>Contraseña (opcional)</Text>
            <TextInput
              style={styles.input}
              value={password}
              onChangeText={setPassword}
              placeholder="Si es privada"
              placeholderTextColor={COLORS.textMuted}
              secureTextEntry
              maxLength={15}
            />

            <TouchableOpacity 
              style={styles.joinBtnWrapper} 
              onPress={handleJoin}
              disabled={loading || !roomId.trim()}
              activeOpacity={0.8}
            >
              <LinearGradient
                colors={loading || !roomId.trim() ? [COLORS.disabled, COLORS.disabled] : GRADIENTS.primary}
                style={styles.joinBtn}
              >
                {loading ? (
                  <ActivityIndicator color={COLORS.white} />
                ) : (
                  <Text style={styles.joinBtnText}>Unirse a la Mesa</Text>
                )}
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
    fontSize: 22,
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
  input: {
    backgroundColor: COLORS.background,
    borderWidth: 1,
    borderColor: COLORS.border,
    borderRadius: RADIUS.md,
    padding: SPACING.md,
    fontSize: 18,
    color: COLORS.text,
    marginBottom: SPACING.lg,
    textTransform: 'uppercase',
  },
  joinBtnWrapper: {
    borderRadius: RADIUS.lg,
    marginTop: SPACING.md,
    overflow: 'hidden',
    ...SHADOWS.medium,
  },
  joinBtn: {
    paddingVertical: 16,
    alignItems: 'center',
  },
  joinBtnText: {
    color: COLORS.white,
    fontSize: 18,
    fontWeight: '700',
  },
});
