import React, { useEffect, useState } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, ActivityIndicator, Alert, TextInput } from 'react-native';
import { BlurView } from 'expo-blur';
import { LogOut, Play, Plus, Users, Settings } from 'lucide-react-native';
import { signOut } from 'firebase/auth';
import { auth } from '../firebase';
import { socket } from '../socket';

export default function LobbyScreen({ route, navigation }) {
  const { user } = route.params;
  const [loading, setLoading] = useState(false);
  const [roomCode, setRoomCode] = useState('');

  useEffect(() => {
    socket.connect();
    return () => {
      socket.disconnect();
    };
  }, []);

  const handleLogout = async () => {
    await signOut(auth);
  };

  const handleCreateRoom = () => {
    setLoading(true);
    socket.emit('create_room', { playerName: user.displayName }, (response) => {
      setLoading(false);
      if (response.success) {
        navigation.navigate('Game', { roomId: response.roomId, isHost: true, user });
      } else {
        Alert.alert('Error', 'No se pudo crear la sala');
      }
    });
  };

  const handleJoinRoom = () => {
    if (!roomCode.trim()) return;
    setLoading(true);
    socket.emit('join_room', { roomId: roomCode.toUpperCase(), playerName: user.displayName }, (response) => {
      setLoading(false);
      if (response.success) {
        navigation.navigate('Game', { roomId: roomCode.toUpperCase(), isHost: false, user });
      } else {
        Alert.alert('Error', response.message || 'No se pudo unir a la sala');
      }
    });
  };

  return (
    <View style={styles.container}>
      {/* Header */}
      <View style={styles.header}>
        <View style={styles.userInfo}>
          <View style={styles.avatar}>
            <Text style={styles.avatarText}>{user.displayName[0].toUpperCase()}</Text>
          </View>
          <View>
            <Text style={styles.userName}>{user.displayName}</Text>
            <Text style={styles.statusText}>Online</Text>
          </View>
        </View>
        <TouchableOpacity onPress={handleLogout} style={styles.logoutBtn}>
          <LogOut size={20} color="white" />
        </TouchableOpacity>
      </View>

      <BlurView intensity={80} tint="dark" style={styles.mainContent}>
        <Text style={styles.title}>Lotería</Text>
        <Text style={styles.subtitle}>La Garza</Text>

        <View style={styles.buttonsContainer}>
          <TouchableOpacity 
            style={[styles.btnPrimary, { opacity: loading ? 0.7 : 1 }]} 
            onPress={handleCreateRoom}
            disabled={loading}
          >
            <Plus size={24} color="white" />
            <Text style={styles.btnText}>Crear Sala</Text>
          </TouchableOpacity>

          <View style={styles.joinContainer}>
            <TextInput 
              style={styles.input} 
              placeholder="Código de sala" 
              placeholderTextColor="#94a3b8"
              value={roomCode}
              onChangeText={setRoomCode}
              autoCapitalize="characters"
            />
            <TouchableOpacity 
              style={[styles.btnOutline, { flex: 1, marginLeft: 10 }]} 
              onPress={handleJoinRoom}
              disabled={loading}
            >
              <Users size={20} color="white" />
              <Text style={styles.btnText}>Unirse</Text>
            </TouchableOpacity>
          </View>
        </View>
      </BlurView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#0f172a',
    padding: 20,
    paddingTop: 50,
  },
  header: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: 40,
    backgroundColor: 'rgba(30, 41, 59, 0.7)',
    padding: 15,
    borderRadius: 20,
  },
  userInfo: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: 15,
  },
  avatar: {
    width: 45,
    height: 45,
    borderRadius: 25,
    backgroundColor: '#ec4899',
    justifyContent: 'center',
    alignItems: 'center',
  },
  avatarText: {
    color: 'white',
    fontSize: 20,
    fontWeight: 'bold',
  },
  userName: {
    color: 'white',
    fontSize: 16,
    fontWeight: 'bold',
  },
  statusText: {
    color: '#10b981',
    fontSize: 12,
  },
  logoutBtn: {
    padding: 10,
    backgroundColor: 'rgba(255,255,255,0.1)',
    borderRadius: 15,
  },
  mainContent: {
    flex: 1,
    borderRadius: 20,
    padding: 30,
    alignItems: 'center',
    borderWidth: 1,
    borderColor: 'rgba(255,255,255,0.1)',
    overflow: 'hidden',
    justifyContent: 'center'
  },
  title: {
    fontSize: 45,
    fontWeight: 'bold',
    color: '#fff',
    marginBottom: 5,
  },
  subtitle: {
    fontSize: 20,
    color: '#94a3b8',
    marginBottom: 40,
  },
  buttonsContainer: {
    width: '100%',
    gap: 15,
  },
  btnPrimary: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    padding: 18,
    borderRadius: 15,
    backgroundColor: '#6366f1',
    gap: 10,
  },
  joinContainer: {
    flexDirection: 'row',
    alignItems: 'center',
    marginTop: 10,
  },
  input: {
    flex: 2,
    backgroundColor: 'rgba(15, 23, 42, 0.6)',
    borderWidth: 1,
    borderColor: 'rgba(255,255,255,0.2)',
    color: 'white',
    padding: 15,
    borderRadius: 15,
    fontSize: 16,
  },
  btnOutline: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    padding: 15,
    borderRadius: 15,
    borderWidth: 2,
    borderColor: '#ec4899',
    backgroundColor: 'rgba(236, 72, 153, 0.2)',
    gap: 10,
  },
  btnText: {
    color: 'white',
    fontSize: 16,
    fontWeight: 'bold',
  }
});
