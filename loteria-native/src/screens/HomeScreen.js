import React, { useState, useEffect } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, Image, ScrollView, Dimensions } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';
import MexicanBackground from '../components/MexicanBackground';
import NameModal from '../components/NameModal';
import { COLORS, GRADIENTS, RADIUS, SPACING, SHADOWS } from '../theme';
import { getUserName, setUserName } from '../storage';

const { width } = Dimensions.get('window');

const logoImage = require('../../assets/img/LoteriaOnline.png');
const logoText = require('../../assets/img/LoteriaOnlineText.png');
const newBadge = require('../../assets/img/new.png');

// Botones del menú principal con sus props
const MENU_BUTTONS = [
  {
    key: 'myTables',
    label: 'Mis tablas',
    icon: require('../../assets/img/btn1.png'),
    gradient: GRADIENTS.misTablas,
    screen: 'MyTables',
  },
  {
    key: 'createRoom',
    label: 'Abrir mesa',
    icon: require('../../assets/img/btn2.png'),
    gradient: GRADIENTS.abrirMesa,
    screen: 'CreateRoom',
    badge: 'NEW',
  },
  {
    key: 'publicRooms',
    label: 'Mesas Públicas',
    icon: require('../../assets/img/btn3.png'),
    gradient: GRADIENTS.mesasPublicas,
    screen: 'PublicRooms',
  },
  {
    key: 'offline',
    label: 'Jugar Offline',
    icon: require('../../assets/img/btn4.png'),
    gradient: GRADIENTS.jugarOffline,
    screen: 'OfflineGame',
  },
  {
    key: 'deckStyle',
    label: 'Baraja Lotería',
    icon: require('../../assets/img/barajaloteria.png'),
    gradient: GRADIENTS.barajaLoteria,
    screen: 'DeckStyle',
  },
  {
    key: 'bingo',
    label: 'Bingo Online',
    icon: require('../../assets/img/bingoonline.png'),
    gradient: GRADIENTS.bingoOnline,
    screen: 'Bingo',
  },
  {
    key: 'removeAds',
    label: 'Quitar Publicidad',
    icon: null,
    gradient: GRADIENTS.quitarPub,
    screen: null,
    emoji: '🚫',
  },
  {
    key: 'help',
    label: '¿Necesitas ayuda?',
    icon: require('../../assets/img/support.png'),
    gradient: GRADIENTS.ayuda,
    screen: null,
  },
];

export default function HomeScreen({ navigation }) {
  const [userName, setUserNameState] = useState('');
  const [showNameModal, setShowNameModal] = useState(false);

  useEffect(() => {
    loadUserName();
  }, []);

  const loadUserName = async () => {
    const name = await getUserName();
    setUserNameState(name);
    if (!name) {
      // Primera vez: mostrar modal de nombre
      setTimeout(() => setShowNameModal(true), 500);
    }
  };

  const handleSaveName = async (name) => {
    await setUserName(name);
    setUserNameState(name);
    setShowNameModal(false);
  };

  const handleButtonPress = (button) => {
    if (button.screen) {
      navigation.navigate(button.screen, { userName });
    }
  };

  return (
    <MexicanBackground>
      <ScrollView 
        style={styles.scrollView}
        contentContainerStyle={styles.scrollContent}
        showsVerticalScrollIndicator={false}
      >
        {/* Logo */}
        <View style={styles.logoContainer}>
          <Image source={logoImage} style={styles.logoImage} resizeMode="contain" />
        </View>

        {/* Botones del menú */}
        <View style={styles.buttonsContainer}>
          {MENU_BUTTONS.map((button) => (
            <TouchableOpacity
              key={button.key}
              style={styles.menuBtnWrapper}
              onPress={() => handleButtonPress(button)}
              activeOpacity={0.8}
            >
              <LinearGradient
                colors={button.gradient}
                start={{ x: 0, y: 0 }}
                end={{ x: 1, y: 0 }}
                style={styles.menuBtn}
              >
                {/* Ícono */}
                <View style={styles.menuBtnIconContainer}>
                  {button.icon ? (
                    <Image source={button.icon} style={styles.menuBtnIcon} resizeMode="contain" />
                  ) : (
                    <Text style={styles.menuBtnEmoji}>{button.emoji}</Text>
                  )}
                </View>

                {/* Label */}
                <Text style={styles.menuBtnLabel}>{button.label}</Text>

                {/* Badge */}
                {button.badge && (
                  <View style={styles.badgeContainer}>
                    <Image source={newBadge} style={styles.badgeImage} resizeMode="contain" />
                  </View>
                )}

                {/* Flecha */}
                <Text style={styles.menuBtnArrow}>›</Text>
              </LinearGradient>
            </TouchableOpacity>
          ))}
        </View>
      </ScrollView>

      {/* Modal de nombre */}
      <NameModal
        visible={showNameModal}
        currentName={userName}
        onSave={handleSaveName}
      />
    </MexicanBackground>
  );
}

const styles = StyleSheet.create({
  scrollView: {
    flex: 1,
  },
  scrollContent: {
    paddingTop: 50,
    paddingBottom: 30,
    paddingHorizontal: SPACING.lg,
    alignItems: 'center',
  },
  logoContainer: {
    alignItems: 'center',
    marginBottom: SPACING.lg,
  },
  logoImage: {
    width: width * 0.6,
    height: width * 0.4,
  },
  buttonsContainer: {
    width: '100%',
    gap: SPACING.md,
  },
  menuBtnWrapper: {
    borderRadius: RADIUS.xl,
    ...SHADOWS.medium,
  },
  menuBtn: {
    flexDirection: 'row',
    alignItems: 'center',
    paddingVertical: 16,
    paddingHorizontal: SPACING.lg,
    borderRadius: RADIUS.xl,
    minHeight: 60,
  },
  menuBtnIconContainer: {
    width: 40,
    height: 40,
    justifyContent: 'center',
    alignItems: 'center',
    marginRight: SPACING.md,
  },
  menuBtnIcon: {
    width: 36,
    height: 36,
  },
  menuBtnEmoji: {
    fontSize: 28,
  },
  menuBtnLabel: {
    flex: 1,
    color: COLORS.white,
    fontSize: 18,
    fontWeight: '700',
    textShadowColor: 'rgba(0,0,0,0.2)',
    textShadowOffset: { width: 0, height: 1 },
    textShadowRadius: 2,
  },
  badgeContainer: {
    marginRight: SPACING.sm,
  },
  badgeImage: {
    width: 40,
    height: 20,
  },
  menuBtnArrow: {
    color: COLORS.white,
    fontSize: 28,
    fontWeight: '300',
    opacity: 0.8,
  },
});
