import React, { useState, useEffect, useCallback } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, FlatList, ActivityIndicator, RefreshControl } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, GRADIENTS, RADIUS, SPACING, SHADOWS } from '../theme';
import socket from '../socket'; // Asumiendo que existe

export default function PublicRoomsScreen({ navigation, route }) {
  const { userName } = route.params || {};
  const [rooms, setRooms] = useState([]);
  const [loading, setLoading] = useState(true);
  const [refreshing, setRefreshing] = useState(false);
  const [joiningRoomId, setJoiningRoomId] = useState(null);

  const fetchRooms = useCallback(() => {
    socket.emit('get_public_rooms', (response) => {
      if (response.success) {
        setRooms(response.rooms || []);
      }
      setLoading(false);
      setRefreshing(false);
    });
  }, []);

  useEffect(() => {
    fetchRooms();
    
    // Escuchar actualizaciones (opcional, si implementamos broadcast)
    socket.on('public_rooms_updated', fetchRooms);

    return () => {
      socket.off('public_rooms_updated', fetchRooms);
    };
  }, [fetchRooms]);

  const onRefresh = () => {
    setRefreshing(true);
    fetchRooms();
  };

  const handleJoinRoom = (roomId) => {
    setJoiningRoomId(roomId);
    socket.emit('join_room', { roomId, playerName: userName || 'Jugador' }, (response) => {
      setJoiningRoomId(null);
      if (response.success) {
        navigation.replace('Game', { roomId, isHost: false, userName });
      } else {
        alert(response.message || 'No se pudo unir a la sala');
        fetchRooms(); // Actualizar lista si falló porque ya no existe
      }
    });
  };

  const renderRoom = ({ item }) => (
    <View style={styles.roomCard}>
      <View style={styles.roomInfo}>
        <Text style={styles.roomName}>{item.roomName}</Text>
        <Text style={styles.hostName}>Anfitrión: {item.hostName}</Text>
        <Text style={styles.playersText}>Jugadores: {item.playerCount}</Text>
      </View>
      <TouchableOpacity 
        style={styles.joinBtnWrapper}
        onPress={() => handleJoinRoom(item.roomId)}
        disabled={joiningRoomId === item.roomId}
        activeOpacity={0.8}
      >
        <LinearGradient
          colors={joiningRoomId === item.roomId ? [COLORS.disabled, COLORS.disabled] : GRADIENTS.mesasPublicas}
          start={{ x: 0, y: 0 }}
          end={{ x: 1, y: 0 }}
          style={styles.joinBtn}
        >
          {joiningRoomId === item.roomId ? (
            <ActivityIndicator color={COLORS.white} size="small" />
          ) : (
            <Text style={styles.joinBtnText}>Unirse</Text>
          )}
        </LinearGradient>
      </TouchableOpacity>
    </View>
  );

  return (
    <MexicanBackground>
      <View style={styles.header}>
        <TouchableOpacity onPress={() => navigation.goBack()} style={styles.backBtn}>
          <Text style={styles.backBtnText}>‹ Volver</Text>
        </TouchableOpacity>
        <Text style={styles.title}>Mesas Públicas</Text>
        <View style={{ width: 80 }}>
          <TouchableOpacity onPress={onRefresh}>
             <Text style={styles.refreshText}>↻ Act.</Text>
          </TouchableOpacity>
        </View>
      </View>

      <View style={styles.content}>
        {loading ? (
          <View style={styles.centerContainer}>
            <ActivityIndicator size="large" color={COLORS.white} />
            <Text style={styles.loadingText}>Buscando mesas...</Text>
          </View>
        ) : rooms.length === 0 ? (
          <View style={styles.centerContainer}>
            <Text style={styles.emptyText}>No hay mesas públicas disponibles</Text>
            <TouchableOpacity onPress={() => navigation.navigate('CreateRoom', { userName })} style={styles.emptyBtn}>
              <Text style={styles.emptyBtnText}>Crear una mesa nueva</Text>
            </TouchableOpacity>
          </View>
        ) : (
          <FlatList
            data={rooms}
            keyExtractor={item => item.roomId}
            renderItem={renderRoom}
            contentContainerStyle={styles.listContent}
            refreshControl={
              <RefreshControl refreshing={refreshing} onRefresh={onRefresh} tintColor={COLORS.white} />
            }
          />
        )}
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
    fontSize: 24,
    fontWeight: '800',
    textShadowColor: 'rgba(0,0,0,0.3)',
    textShadowOffset: { width: 0, height: 2 },
    textShadowRadius: 4,
  },
  refreshText: { color: COLORS.white, fontSize: 16, fontWeight: '600', textAlign: 'right' },
  content: { flex: 1 },
  listContent: { padding: SPACING.lg, gap: SPACING.md },
  roomCard: {
    flexDirection: 'row',
    backgroundColor: COLORS.white,
    borderRadius: RADIUS.lg,
    padding: SPACING.md,
    alignItems: 'center',
    justifyContent: 'space-between',
    ...SHADOWS.small,
    marginBottom: SPACING.md,
  },
  roomInfo: { flex: 1 },
  roomName: { fontSize: 18, fontWeight: '700', color: COLORS.text, marginBottom: 2 },
  hostName: { fontSize: 14, color: COLORS.textMuted },
  playersText: { fontSize: 14, color: COLORS.primary, fontWeight: '600', marginTop: 4 },
  joinBtnWrapper: { borderRadius: RADIUS.md, overflow: 'hidden' },
  joinBtn: { paddingVertical: 10, paddingHorizontal: 20, alignItems: 'center', justifyContent: 'center', minWidth: 90 },
  joinBtnText: { color: COLORS.white, fontSize: 16, fontWeight: '700' },
  centerContainer: { flex: 1, justifyContent: 'center', alignItems: 'center', padding: SPACING.xl },
  loadingText: { color: COLORS.white, marginTop: SPACING.md, fontSize: 16 },
  emptyText: { color: COLORS.white, fontSize: 18, textAlign: 'center', fontWeight: '600', marginBottom: SPACING.lg, textShadowColor: 'rgba(0,0,0,0.5)', textShadowOffset: { width: 0, height: 1 }, textShadowRadius: 2 },
  emptyBtn: { backgroundColor: 'rgba(255,255,255,0.2)', paddingHorizontal: SPACING.lg, paddingVertical: SPACING.md, borderRadius: RADIUS.md, borderWidth: 1, borderColor: COLORS.white },
  emptyBtnText: { color: COLORS.white, fontSize: 16, fontWeight: '700' },
});
