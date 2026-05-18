import React, { useState, useCallback } from 'react';
import { View, ActivityIndicator, StyleSheet } from 'react-native';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import { createDrawerNavigator } from '@react-navigation/drawer';
import { GestureHandlerRootView } from 'react-native-gesture-handler';
import { COLORS } from './src/theme';
import { setUserName } from './src/storage';

// Screens
import LoginScreen from './src/screens/LoginScreen';
import HomeScreen from './src/screens/HomeScreen';
import GameScreen from './src/screens/GameScreen';
import MyTablesScreen from './src/screens/MyTablesScreen';
import TableEditorScreen from './src/screens/TableEditorScreen';
import DeckStyleScreen from './src/screens/DeckStyleScreen';
import CreateRoomScreen from './src/screens/CreateRoomScreen';
import PublicRoomsScreen from './src/screens/PublicRoomsScreen';
import HistoryScreen from './src/screens/HistoryScreen';
import LeaderboardScreen from './src/screens/LeaderboardScreen';
import AchievementsScreen from './src/screens/AchievementsScreen';
import OfflineGameScreen from './src/screens/OfflineGameScreen';
import JoinByLinkScreen from './src/screens/JoinByLinkScreen';

// Components
import CustomDrawer from './src/components/CustomDrawer';
import NameModal from './src/components/NameModal';
import PlaceholderScreen from './src/components/PlaceholderScreen';

const Stack = createNativeStackNavigator();
const Drawer = createDrawerNavigator();

// Drawer Navigator (Home + menú lateral)
function DrawerNavigator({ user, onLogout }) {
  const [userName, setUserNameState] = useState(user?.displayName || '');
  const [showNameModal, setShowNameModal] = useState(false);

  const handleSaveName = async (name) => {
    await setUserName(name);
    setUserNameState(name);
    setShowNameModal(false);
  };

  return (
    <>
      <Drawer.Navigator
        drawerContent={(props) => (
          <CustomDrawer
            {...props}
            userName={userName}
            onEditName={() => setShowNameModal(true)}
            onLogout={onLogout}
          />
        )}
        screenOptions={{
          headerShown: false,
          drawerType: 'front',
          drawerStyle: { width: 280 },
        }}
      >
        <Drawer.Screen name="HomeDrawer">
          {(props) => <HomeScreen {...props} userName={userName} />}
        </Drawer.Screen>
      </Drawer.Navigator>

      <NameModal
        visible={showNameModal}
        currentName={userName}
        onSave={handleSaveName}
      />
    </>
  );
}

// Pantallas placeholder para features de fases futuras
const PLACEHOLDER_SCREENS = [
  'Bingo', 'GameModes',
];

export default function App() {
  const [user, setUser] = useState(null);
  const [loading, setLoading] = useState(true);

  useState(() => {
    setTimeout(() => setLoading(false), 500);
  });

  const handleLogout = useCallback(() => {
    setUser(null);
  }, []);

  if (loading) {
    return (
      <View style={styles.loadingContainer}>
        <ActivityIndicator size="large" color={COLORS.primary} />
      </View>
    );
  }

  return (
    <GestureHandlerRootView style={{ flex: 1 }}>
      <NavigationContainer>
        <Stack.Navigator screenOptions={{ headerShown: false }}>
          {user ? (
            <>
              <Stack.Screen name="Main">
                {(props) => (
                  <DrawerNavigator {...props} user={user} onLogout={handleLogout} />
                )}
              </Stack.Screen>

              {/* Pantallas reales - Fase 1 & 2 */}
              <Stack.Screen name="Game" component={GameScreen} options={{ gestureEnabled: false }} />
              <Stack.Screen name="MyTables" component={MyTablesScreen} />
              <Stack.Screen name="TableEditor" component={TableEditorScreen} />
              <Stack.Screen name="Config" component={ConfigScreen} />
              <Stack.Screen name="DeckStyle" component={DeckStyleScreen} />
              <Stack.Screen name="CreateRoom" component={CreateRoomScreen} />
              <Stack.Screen name="PublicRooms" component={PublicRoomsScreen} />
              <Stack.Screen name="History" component={HistoryScreen} />
              <Stack.Screen name="Leaderboard" component={LeaderboardScreen} />
              <Stack.Screen name="Achievements" component={AchievementsScreen} />
              <Stack.Screen name="OfflineGame" component={OfflineGameScreen} />
              <Stack.Screen name="JoinByLink" component={JoinByLinkScreen} />

              {/* Placeholders para fases futuras */}
              {PLACEHOLDER_SCREENS.map((name) => (
                <Stack.Screen
                  key={name}
                  name={name}
                  component={PlaceholderScreen}
                  initialParams={{ title: name }}
                />
              ))}
            </>
          ) : (
            <Stack.Screen name="Login">
              {(props) => <LoginScreen {...props} onLogin={setUser} />}
            </Stack.Screen>
          )}
        </Stack.Navigator>
      </NavigationContainer>
    </GestureHandlerRootView>
  );
}

const styles = StyleSheet.create({
  loadingContainer: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: COLORS.background,
  },
});
