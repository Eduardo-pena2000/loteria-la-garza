import React, { useState, useEffect } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, ScrollView, Switch, TextInput, Image } from 'react-native';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';
import { getUserName, setUserName, getConfig, updateConfig, getSelectedMarker, setSelectedMarker } from '../storage';

// Marcadores predeterminados
const MARKERS = [
  { id: 'frijol', image: require('../../assets/images/ifrijol.png'), label: 'Frijol' },
  { id: 'moneda', image: require('../../assets/images/imoneda.png'), label: 'Moneda' },
  { id: 'piedra', image: require('../../assets/images/irock.png'), label: 'Piedra' },
  { id: 'ficha', image: require('../../assets/images/ficha.png'), label: 'Corcholata' },
  { id: 'rollo', image: require('../../assets/images/rollo.png'), label: 'Rollo' },
];

// Voces del gritón disponibles
const VOICES = [
  { id: '1', label: 'Mujer', emoji: '👩' },
  { id: '2', label: 'Hombre', emoji: '👨' },
  { id: '3', label: 'Voz 3', emoji: '🗣️' },
  { id: '5', label: 'Voz 5', emoji: '🗣️' },
  { id: '6', label: 'Voz 6', emoji: '🗣️' },
  { id: '7', label: 'Voz 7', emoji: '🗣️' },
  { id: '8', label: 'Voz 8', emoji: '🗣️' },
  { id: '9', label: 'Voz 9', emoji: '🗣️' },
];

export default function ConfigScreen({ navigation }) {
  const [name, setName] = useState('');
  const [config, setConfig] = useState({
    audio: true, voiceId: '1', soundEffects: true,
    confetti: false, vibration: true, classicMode: false, tableView: 'grid',
  });
  const [selectedMarker, setSelectedMarkerState] = useState('frijol');
  const [showVoicePicker, setShowVoicePicker] = useState(false);

  useEffect(() => {
    loadData();
  }, []);

  const loadData = async () => {
    const n = await getUserName();
    const c = await getConfig();
    const m = await getSelectedMarker();
    setName(n);
    setConfig(c);
    setSelectedMarkerState(m);
  };

  const handleSaveName = async () => {
    await setUserName(name);
  };

  const handleToggle = async (key) => {
    const newConfig = await updateConfig(key, !config[key]);
    setConfig(newConfig);
  };

  const handleVoiceChange = async (voiceId) => {
    const newConfig = await updateConfig('voiceId', voiceId);
    setConfig(newConfig);
    setShowVoicePicker(false);
  };

  const handleMarkerSelect = async (markerId) => {
    await setSelectedMarker(markerId);
    setSelectedMarkerState(markerId);
  };

  const currentVoice = VOICES.find(v => v.id === config.voiceId) || VOICES[0];

  return (
    <View style={styles.container}>
      {/* Header */}
      <View style={styles.header}>
        <TouchableOpacity onPress={() => navigation.goBack()} style={styles.headerBtn}>
          <Text style={styles.headerBtnText}>←</Text>
        </TouchableOpacity>
        <Text style={styles.headerTitle}>Configuración</Text>
        <View style={styles.headerBtn} />
      </View>

      <ScrollView style={styles.scroll} showsVerticalScrollIndicator={false}>
        {/* Nombre */}
        <View style={styles.section}>
          <Text style={styles.sectionLabel}>Nombre</Text>
          <View style={styles.nameRow}>
            <TextInput
              style={styles.nameInput}
              value={name}
              onChangeText={(t) => setName(t.slice(0, 30))}
              placeholder="Tu nombre"
              maxLength={30}
            />
            <TouchableOpacity style={styles.saveNameBtn} onPress={handleSaveName}>
              <Text style={styles.saveNameIcon}>💾</Text>
            </TouchableOpacity>
          </View>
          <Text style={styles.charCount}>{name.length}/30</Text>
        </View>

        <View style={styles.divider} />

        {/* Audio */}
        <View style={styles.row}>
          <View style={styles.rowInfo}>
            <Text style={styles.rowLabel}>Audio</Text>
            <Text style={styles.rowHint}>Grita el nombre de las cartas</Text>
          </View>
          <Switch
            value={config.audio}
            onValueChange={() => handleToggle('audio')}
            trackColor={{ false: '#E0E0E0', true: '#81C784' }}
            thumbColor={config.audio ? '#4CAF50' : '#BDBDBD'}
          />
        </View>

        <View style={styles.divider} />

        {/* Voz del gritón */}
        <TouchableOpacity style={styles.row} onPress={() => setShowVoicePicker(!showVoicePicker)}>
          <View style={styles.rowInfo}>
            <Text style={styles.rowLabel}>Voz del gritón</Text>
          </View>
          <View style={styles.pickerValue}>
            <Text style={styles.pickerEmoji}>{currentVoice.emoji}</Text>
            <Text style={styles.pickerText}>{currentVoice.label}</Text>
            <Text style={styles.pickerArrow}>▼</Text>
          </View>
        </TouchableOpacity>

        {showVoicePicker && (
          <View style={styles.pickerList}>
            {VOICES.map((voice) => (
              <TouchableOpacity
                key={voice.id}
                style={[styles.pickerItem, voice.id === config.voiceId && styles.pickerItemActive]}
                onPress={() => handleVoiceChange(voice.id)}
              >
                <Text style={styles.pickerItemEmoji}>{voice.emoji}</Text>
                <Text style={styles.pickerItemText}>{voice.label}</Text>
                {voice.id === config.voiceId && <Text style={styles.checkmark}>✓</Text>}
              </TouchableOpacity>
            ))}
          </View>
        )}

        <View style={styles.divider} />

        {/* Estilo de Baraja */}
        <TouchableOpacity style={styles.row} onPress={() => navigation.navigate('DeckStyle')}>
          <View style={styles.rowInfo}>
            <Text style={styles.rowLabel}>Estilo de Baraja</Text>
            <Text style={styles.rowHint}>Selecciona el estilo de baraja que usarás.</Text>
          </View>
          <Image source={require('../../assets/figuras/modern/1.jpg')} style={styles.deckThumb} />
        </TouchableOpacity>

        <View style={styles.divider} />

        {/* Efectos de sonido */}
        <View style={styles.row}>
          <View style={styles.rowInfo}>
            <Text style={styles.rowLabel}>Efectos de sonido</Text>
          </View>
          <Switch
            value={config.soundEffects}
            onValueChange={() => handleToggle('soundEffects')}
            trackColor={{ false: '#E0E0E0', true: '#81C784' }}
            thumbColor={config.soundEffects ? '#4CAF50' : '#BDBDBD'}
          />
        </View>

        <View style={styles.divider} />

        {/* Confetti */}
        <View style={styles.row}>
          <View style={styles.rowInfo}>
            <Text style={styles.rowLabel}>Confetti</Text>
            <Text style={styles.rowHint}>Activa o desactiva el efecto de confetti al ganar una partida.</Text>
          </View>
          <Switch
            value={config.confetti}
            onValueChange={() => handleToggle('confetti')}
            trackColor={{ false: '#E0E0E0', true: '#81C784' }}
            thumbColor={config.confetti ? '#4CAF50' : '#BDBDBD'}
          />
        </View>

        <View style={styles.divider} />

        {/* Vibración */}
        <View style={styles.row}>
          <View style={styles.rowInfo}>
            <Text style={styles.rowLabel}>Vibración</Text>
          </View>
          <Switch
            value={config.vibration}
            onValueChange={() => handleToggle('vibration')}
            trackColor={{ false: '#E0E0E0', true: '#81C784' }}
            thumbColor={config.vibration ? '#4CAF50' : '#BDBDBD'}
          />
        </View>

        <View style={styles.divider} />

        {/* Modo clásico */}
        <View style={styles.row}>
          <View style={styles.rowInfo}>
            <Text style={styles.rowLabel}>Modo clásico</Text>
            <Text style={styles.rowHint}>Permite únicamente mesas, tablas y modos 4x4</Text>
          </View>
          <Switch
            value={config.classicMode}
            onValueChange={() => handleToggle('classicMode')}
            trackColor={{ false: '#E0E0E0', true: '#81C784' }}
            thumbColor={config.classicMode ? '#4CAF50' : '#BDBDBD'}
          />
        </View>

        <View style={styles.divider} />

        {/* Marcador */}
        <Text style={[styles.sectionLabel, { paddingHorizontal: SPACING.lg, paddingTop: SPACING.lg }]}>Marcador</Text>
        <View style={styles.markersGrid}>
          {MARKERS.map((marker) => (
            <TouchableOpacity
              key={marker.id}
              style={[styles.markerItem, selectedMarker === marker.id && styles.markerItemSelected]}
              onPress={() => handleMarkerSelect(marker.id)}
            >
              <Image source={marker.image} style={styles.markerImage} resizeMode="contain" />
            </TouchableOpacity>
          ))}
        </View>

        {/* Cerrar */}
        <TouchableOpacity style={styles.closeBtn} onPress={() => navigation.goBack()}>
          <Text style={styles.closeBtnText}>Cerrar</Text>
        </TouchableOpacity>

        <View style={{ height: 40 }} />
      </ScrollView>
    </View>
  );
}

const styles = StyleSheet.create({
  container: { flex: 1, backgroundColor: COLORS.white },
  header: {
    flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between',
    backgroundColor: COLORS.primary, paddingTop: 50, paddingBottom: SPACING.md, paddingHorizontal: SPACING.md,
  },
  headerBtn: { width: 44, height: 44, justifyContent: 'center', alignItems: 'center' },
  headerBtnText: { color: COLORS.white, fontSize: 28, fontWeight: '700' },
  headerTitle: { color: COLORS.white, fontSize: 18, fontWeight: '700' },
  scroll: { flex: 1 },
  section: { padding: SPACING.lg },
  sectionLabel: { fontSize: 14, fontWeight: '600', color: COLORS.primary, marginBottom: SPACING.sm },
  nameRow: { flexDirection: 'row', gap: SPACING.sm },
  nameInput: {
    flex: 1, borderWidth: 1.5, borderColor: COLORS.border, borderRadius: RADIUS.md,
    paddingHorizontal: SPACING.md, paddingVertical: 10, fontSize: 16, color: COLORS.text,
  },
  saveNameBtn: {
    width: 44, height: 44, justifyContent: 'center', alignItems: 'center',
    backgroundColor: COLORS.blue, borderRadius: RADIUS.md,
  },
  saveNameIcon: { fontSize: 20 },
  charCount: { fontSize: 12, color: COLORS.textLight, textAlign: 'right', marginTop: 4 },
  divider: { height: 1, backgroundColor: COLORS.divider, marginHorizontal: SPACING.lg },
  row: {
    flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between',
    paddingVertical: SPACING.md, paddingHorizontal: SPACING.lg, minHeight: 60,
  },
  rowInfo: { flex: 1, marginRight: SPACING.md },
  rowLabel: { fontSize: 16, fontWeight: '500', color: COLORS.text },
  rowHint: { fontSize: 13, color: COLORS.textSecondary, marginTop: 2 },
  pickerValue: { flexDirection: 'row', alignItems: 'center', gap: SPACING.xs },
  pickerEmoji: { fontSize: 18 },
  pickerText: { fontSize: 14, color: COLORS.text },
  pickerArrow: { fontSize: 10, color: COLORS.textLight },
  pickerList: { backgroundColor: '#F5F5F5', marginHorizontal: SPACING.lg, borderRadius: RADIUS.md },
  pickerItem: { flexDirection: 'row', alignItems: 'center', paddingVertical: 12, paddingHorizontal: SPACING.md, gap: SPACING.sm },
  pickerItemActive: { backgroundColor: '#E3F2FD' },
  pickerItemEmoji: { fontSize: 16 },
  pickerItemText: { flex: 1, fontSize: 14, color: COLORS.text },
  checkmark: { fontSize: 18, color: COLORS.blue, fontWeight: '700' },
  deckThumb: { width: 44, height: 60, borderRadius: 6 },
  markersGrid: { flexDirection: 'row', flexWrap: 'wrap', padding: SPACING.md, gap: SPACING.md },
  markerItem: {
    width: 70, height: 70, borderRadius: RADIUS.md, backgroundColor: '#F5F5F5',
    justifyContent: 'center', alignItems: 'center', borderWidth: 2, borderColor: 'transparent',
  },
  markerItemSelected: { borderColor: COLORS.primary, backgroundColor: '#FFF3E0' },
  markerImage: { width: 50, height: 50 },
  closeBtn: {
    alignSelf: 'center', backgroundColor: COLORS.blue, paddingHorizontal: SPACING.xl,
    paddingVertical: SPACING.md, borderRadius: RADIUS.pill, marginTop: SPACING.lg,
  },
  closeBtnText: { color: COLORS.white, fontSize: 16, fontWeight: '700' },
});
