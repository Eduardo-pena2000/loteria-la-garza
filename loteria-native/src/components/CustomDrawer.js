import React from 'react';
import { View, Text, TouchableOpacity, StyleSheet, Image, ScrollView } from 'react-native';
import { DrawerContentScrollView } from '@react-navigation/drawer';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';

// Íconos del drawer menu
const menuItems = [
  { key: 'Config', icon: require('../../assets/img/config.png'), label: 'Configuración' },
  { key: 'DeckStyle', icon: require('../../assets/img/barajaloteria.png'), label: 'Barajas Personalizadas' },
  { key: 'GameModes', icon: null, label: 'Explorador de Modos', emoji: '🎮' },
  { key: 'History', icon: null, label: 'Historial', emoji: '📊' },
  { key: 'Leaderboard', icon: null, label: 'Clasificación', emoji: '📈' },
  { key: 'Achievements', icon: null, label: 'Logros', emoji: '⭐' },
  { key: 'JoinByLink', icon: require('../../assets/img/link.png'), label: 'Unir por link' },
  { key: 'Facebook', icon: require('../../assets/img/facebook.png'), label: 'Síguenos en Facebook', external: true },
  { key: 'DeleteAccount', icon: null, label: 'Eliminar cuenta', emoji: '🗑️', destructive: true },
  { key: 'Version', icon: require('../../assets/img/info.png'), label: 'Versión Actual', value: '1.0.0' },
];

export default function CustomDrawer(props) {
  const { navigation, userName = 'Sin nombre', onEditName } = props;

  const handleMenuPress = (item) => {
    if (item.external) return;
    if (item.key === 'DeleteAccount') return;
    if (item.key === 'Version') return;
    
    navigation.closeDrawer();
    // Navegar usando el navigator padre (Stack)
    const parentNav = navigation.getParent();
    if (parentNav) {
      parentNav.navigate(item.key, { title: item.label });
    } else {
      navigation.navigate(item.key, { title: item.label });
    }
  };

  return (
    <View style={styles.container}>
      {/* Header con perfil */}
      <View style={styles.header}>
        <View style={styles.avatarRow}>
          <View style={styles.avatar}>
            <Text style={styles.avatarText}>
              {userName ? userName[0].toUpperCase() : '?'}
            </Text>
          </View>
          <TouchableOpacity onPress={onEditName} style={styles.editBtn}>
            <Text style={styles.editIcon}>✏️</Text>
          </TouchableOpacity>
        </View>
        <Text style={styles.userName}>{userName || 'Sin nombre'}</Text>
      </View>

      {/* Menu items */}
      <ScrollView style={styles.menuList} showsVerticalScrollIndicator={false}>
        {menuItems.map((item) => (
          <TouchableOpacity
            key={item.key}
            style={styles.menuItem}
            onPress={() => handleMenuPress(item)}
            activeOpacity={0.6}
          >
            <View style={styles.menuIconContainer}>
              {item.icon ? (
                <Image source={item.icon} style={styles.menuIcon} resizeMode="contain" />
              ) : (
                <Text style={styles.menuEmoji}>{item.emoji}</Text>
              )}
            </View>
            <Text style={[
              styles.menuLabel,
              item.destructive && styles.menuLabelDestructive,
            ]}>
              {item.label}
            </Text>
            {item.value && (
              <Text style={styles.menuValue}>{item.value}</Text>
            )}
          </TouchableOpacity>
        ))}
      </ScrollView>

      {/* Footer */}
      <View style={styles.footer}>
        <TouchableOpacity style={styles.rateBtn}>
          <Text style={styles.rateIcon}>⭐</Text>
          <Text style={styles.rateText}>Calificar App</Text>
          <Text style={styles.rateIcon}>⭐</Text>
        </TouchableOpacity>

        <TouchableOpacity 
          style={styles.logoutBtn}
          onPress={() => {
            navigation.closeDrawer();
            if (props.onLogout) props.onLogout();
          }}
        >
          <Text style={styles.logoutIcon}>🚪</Text>
          <Text style={styles.logoutText}>Cerrar Sesión</Text>
        </TouchableOpacity>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: COLORS.white,
  },
  header: {
    backgroundColor: COLORS.primary,
    paddingTop: 50,
    paddingBottom: SPACING.lg,
    paddingHorizontal: SPACING.lg,
  },
  avatarRow: {
    flexDirection: 'row',
    alignItems: 'center',
    gap: SPACING.sm,
  },
  avatar: {
    width: 55,
    height: 55,
    borderRadius: 30,
    backgroundColor: 'rgba(255,255,255,0.3)',
    justifyContent: 'center',
    alignItems: 'center',
    borderWidth: 2,
    borderColor: 'rgba(255,255,255,0.5)',
  },
  avatarText: {
    color: COLORS.white,
    fontSize: 24,
    fontWeight: '800',
  },
  editBtn: {
    padding: SPACING.xs,
  },
  editIcon: {
    fontSize: 18,
  },
  userName: {
    color: COLORS.white,
    fontSize: 16,
    fontWeight: '600',
    marginTop: SPACING.sm,
  },
  menuList: {
    flex: 1,
    paddingTop: SPACING.sm,
  },
  menuItem: {
    flexDirection: 'row',
    alignItems: 'center',
    paddingVertical: 14,
    paddingHorizontal: SPACING.lg,
    borderBottomWidth: 0.5,
    borderBottomColor: COLORS.divider,
  },
  menuIconContainer: {
    width: 30,
    height: 30,
    justifyContent: 'center',
    alignItems: 'center',
    marginRight: SPACING.md,
  },
  menuIcon: {
    width: 24,
    height: 24,
  },
  menuEmoji: {
    fontSize: 20,
  },
  menuLabel: {
    flex: 1,
    fontSize: 15,
    color: COLORS.text,
    fontWeight: '500',
  },
  menuLabelDestructive: {
    color: COLORS.red,
  },
  menuValue: {
    fontSize: 13,
    color: COLORS.textLight,
  },
  footer: {
    borderTopWidth: 1,
    borderTopColor: COLORS.border,
  },
  rateBtn: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    paddingVertical: 14,
    gap: SPACING.sm,
    backgroundColor: '#FFF8E1',
  },
  rateIcon: {
    fontSize: 18,
  },
  rateText: {
    fontSize: 15,
    color: COLORS.primary,
    fontWeight: '600',
  },
  logoutBtn: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    paddingVertical: 14,
    gap: SPACING.sm,
    backgroundColor: COLORS.primary,
  },
  logoutIcon: {
    fontSize: 18,
  },
  logoutText: {
    fontSize: 15,
    color: COLORS.white,
    fontWeight: '600',
  },
});
