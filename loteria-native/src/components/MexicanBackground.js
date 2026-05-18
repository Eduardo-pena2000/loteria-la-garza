import React from 'react';
import { View, Image, StyleSheet } from 'react-native';

// Usa el fondo mexicano extraído de la app original
const bgImage = require('../../assets/img/fondo.jpg');

export default function MexicanBackground({ children, style }) {
  return (
    <View style={[styles.container, style]}>
      <Image source={bgImage} style={styles.bgImage} resizeMode="repeat" />
      <View style={styles.overlay} />
      {children}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#FFF8F0',
  },
  bgImage: {
    ...StyleSheet.absoluteFillObject,
    width: '100%',
    height: '100%',
    opacity: 0.3,
  },
  overlay: {
    ...StyleSheet.absoluteFillObject,
    backgroundColor: 'rgba(255, 248, 240, 0.1)',
  },
});
