import React from 'react';
import { View, Text, TouchableOpacity, StyleSheet } from 'react-native';
import MexicanBackground from './MexicanBackground';
import { COLORS, SPACING, RADIUS } from '../theme';

// Pantalla temporal para features que aún no están implementadas
export default function PlaceholderScreen({ route, navigation }) {
  const screenName = route?.params?.title || route?.name || 'Próximamente';

  return (
    <MexicanBackground>
      <View style={styles.container}>
        {/* Header */}
        <View style={styles.header}>
          <TouchableOpacity onPress={() => navigation.goBack()} style={styles.backBtn}>
            <Text style={styles.backText}>←</Text>
          </TouchableOpacity>
          <Text style={styles.headerTitle}>{screenName}</Text>
          <View style={styles.backBtn} />
        </View>

        {/* Content */}
        <View style={styles.content}>
          <Text style={styles.emoji}>🚧</Text>
          <Text style={styles.title}>Próximamente</Text>
          <Text style={styles.subtitle}>Esta sección estará disponible pronto.</Text>
          <TouchableOpacity style={styles.btn} onPress={() => navigation.goBack()}>
            <Text style={styles.btnText}>Volver</Text>
          </TouchableOpacity>
        </View>
      </View>
    </MexicanBackground>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  header: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'space-between',
    backgroundColor: COLORS.primary,
    paddingTop: 50,
    paddingBottom: SPACING.md,
    paddingHorizontal: SPACING.md,
  },
  backBtn: {
    width: 40,
    height: 40,
    justifyContent: 'center',
    alignItems: 'center',
  },
  backText: {
    color: COLORS.white,
    fontSize: 24,
    fontWeight: '700',
  },
  headerTitle: {
    color: COLORS.white,
    fontSize: 18,
    fontWeight: '700',
  },
  content: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: SPACING.xl,
  },
  emoji: {
    fontSize: 64,
    marginBottom: SPACING.lg,
  },
  title: {
    fontSize: 24,
    fontWeight: '700',
    color: COLORS.text,
    marginBottom: SPACING.sm,
  },
  subtitle: {
    fontSize: 16,
    color: COLORS.textSecondary,
    textAlign: 'center',
    marginBottom: SPACING.xl,
  },
  btn: {
    backgroundColor: COLORS.primary,
    paddingHorizontal: SPACING.xl,
    paddingVertical: SPACING.md,
    borderRadius: RADIUS.pill,
  },
  btnText: {
    color: COLORS.white,
    fontSize: 16,
    fontWeight: '700',
  },
});
