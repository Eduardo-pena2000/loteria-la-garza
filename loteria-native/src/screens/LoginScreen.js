import React, { useState } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, ActivityIndicator, Image, Dimensions } from 'react-native';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';

const { width } = Dimensions.get('window');

// Assets originales
const logoImage = require('../../assets/img/LoteriaOnline.png');
const googleIcon = require('../../assets/images/google.png');
const appleIcon = require('../../assets/images/apple.png');
const guestIcon = require('../../assets/images/guest.png');

export default function LoginScreen({ onLogin }) {
  const [loading, setLoading] = useState(false);

  const handleGuestLogin = () => {
    setLoading(true);
    setTimeout(() => {
      const randomId = Math.random().toString(36).substring(7);
      onLogin({
        uid: `guest_${randomId}`,
        displayName: `Jugador_${Math.floor(Math.random() * 1000)}`
      });
      setLoading(false);
    }, 600);
  };

  const handleGoogleLogin = () => {
    // TODO: Implementar login con Google
    handleGuestLogin(); // Temporal
  };

  const handleAppleLogin = () => {
    // TODO: Implementar login con Apple
    handleGuestLogin(); // Temporal
  };

  return (
    <MexicanBackground>
      <View style={styles.container}>
        {/* Logo */}
        <View style={styles.logoContainer}>
          <Image source={logoImage} style={styles.logoImage} resizeMode="contain" />
        </View>

        {/* Botones de login */}
        <View style={styles.buttonsContainer}>
          {/* Google */}
          <TouchableOpacity
            style={[styles.btn, styles.googleBtn, loading && styles.btnDisabled]}
            onPress={handleGoogleLogin}
            disabled={loading}
            activeOpacity={0.8}
          >
            <Image source={googleIcon} style={styles.btnIcon} resizeMode="contain" />
            <Text style={[styles.btnText, styles.googleText]}>Iniciar sesión con Google</Text>
          </TouchableOpacity>

          {/* Apple */}
          <TouchableOpacity
            style={[styles.btn, styles.appleBtn, loading && styles.btnDisabled]}
            onPress={handleAppleLogin}
            disabled={loading}
            activeOpacity={0.8}
          >
            <Image source={appleIcon} style={styles.btnIcon} resizeMode="contain" />
            <Text style={[styles.btnText, styles.appleText]}>Iniciar sesión con Apple</Text>
          </TouchableOpacity>

          {/* Invitado */}
          <TouchableOpacity
            style={[styles.btn, styles.guestBtn, loading && styles.btnDisabled]}
            onPress={handleGuestLogin}
            disabled={loading}
            activeOpacity={0.8}
          >
            {loading ? (
              <ActivityIndicator color={COLORS.textSecondary} />
            ) : (
              <>
                <Image source={guestIcon} style={styles.btnIcon} resizeMode="contain" />
                <Text style={[styles.btnText, styles.guestText]}>Entrar como invitado</Text>
              </>
            )}
          </TouchableOpacity>
        </View>

        {/* Footer */}
        <View style={styles.footer}>
          <Text style={styles.footerText}>
            Al usar la aplicación aceptas nuestros{' '}
            <Text style={styles.footerLink}>Términos de uso</Text> y{' '}
            <Text style={styles.footerLink}>Política de privacidad</Text>
          </Text>
          <Text style={styles.versionText}>Versión 1.0.0</Text>
        </View>
      </View>
    </MexicanBackground>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    paddingHorizontal: SPACING.xl,
  },
  logoContainer: {
    alignItems: 'center',
    marginBottom: 50,
  },
  logoImage: {
    width: width * 0.65,
    height: width * 0.5,
  },
  buttonsContainer: {
    width: '100%',
    maxWidth: 380,
    gap: SPACING.md,
  },
  btn: {
    flexDirection: 'row',
    alignItems: 'center',
    justifyContent: 'center',
    paddingVertical: 15,
    paddingHorizontal: SPACING.lg,
    borderRadius: RADIUS.lg,
    gap: SPACING.md,
    ...SHADOWS.small,
  },
  btnDisabled: {
    opacity: 0.6,
  },
  btnIcon: {
    width: 22,
    height: 22,
  },
  btnText: {
    fontSize: 16,
    fontWeight: '600',
  },
  // Google
  googleBtn: {
    backgroundColor: '#4285F4',
  },
  googleText: {
    color: COLORS.white,
  },
  // Apple
  appleBtn: {
    backgroundColor: '#000000',
  },
  appleText: {
    color: COLORS.white,
  },
  // Guest
  guestBtn: {
    backgroundColor: '#F5F5F5',
    borderWidth: 1,
    borderColor: COLORS.border,
  },
  guestText: {
    color: COLORS.text,
  },
  // Footer
  footer: {
    position: 'absolute',
    bottom: 30,
    alignItems: 'center',
    paddingHorizontal: SPACING.xl,
  },
  footerText: {
    fontSize: 12,
    color: COLORS.textSecondary,
    textAlign: 'center',
    lineHeight: 18,
  },
  footerLink: {
    color: COLORS.blue,
    textDecorationLine: 'underline',
  },
  versionText: {
    fontSize: 11,
    color: COLORS.textLight,
    marginTop: SPACING.sm,
  },
});
