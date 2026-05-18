import AsyncStorage from '@react-native-async-storage/async-storage';

const KEYS = {
  USER_NAME: '@loteria_user_name',
  USER_ID: '@loteria_user_id',
  SELECTED_MARKER: '@loteria_marker',
  SELECTED_DECK: '@loteria_deck',
  TABLES_4x4: '@loteria_tables_4x4',
  TABLES_5x5: '@loteria_tables_5x5',
  CONFIG: '@loteria_config',
};

// Configuración por defecto
const DEFAULT_CONFIG = {
  audio: true,
  voiceId: '1',           // Voz del gritón (carpeta 1-9)
  soundEffects: true,
  confetti: false,
  vibration: true,
  classicMode: false,      // Solo 4x4
  tableView: 'grid',       // grid | list
};

// --- User ---
export const getUserName = async () => {
  try {
    return await AsyncStorage.getItem(KEYS.USER_NAME) || '';
  } catch { return ''; }
};

export const setUserName = async (name) => {
  try {
    await AsyncStorage.setItem(KEYS.USER_NAME, name);
  } catch (e) { console.error('Error saving name:', e); }
};

export const getUserId = async () => {
  try {
    let id = await AsyncStorage.getItem(KEYS.USER_ID);
    if (!id) {
      id = 'guest_' + Math.random().toString(36).substring(7);
      await AsyncStorage.setItem(KEYS.USER_ID, id);
    }
    return id;
  } catch { return 'guest_fallback'; }
};

// --- Marker ---
export const getSelectedMarker = async () => {
  try {
    return await AsyncStorage.getItem(KEYS.SELECTED_MARKER) || 'frijol';
  } catch { return 'frijol'; }
};

export const setSelectedMarker = async (marker) => {
  try {
    await AsyncStorage.setItem(KEYS.SELECTED_MARKER, marker);
  } catch (e) { console.error('Error saving marker:', e); }
};

// --- Deck Style ---
export const getSelectedDeck = async () => {
  try {
    return await AsyncStorage.getItem(KEYS.SELECTED_DECK) || 'modern';
  } catch { return 'modern'; }
};

export const setSelectedDeck = async (deck) => {
  try {
    await AsyncStorage.setItem(KEYS.SELECTED_DECK, deck);
  } catch (e) { console.error('Error saving deck:', e); }
};

// --- Tables ---
export const getTables = async (size = '4x4') => {
  try {
    const key = size === '5x5' ? KEYS.TABLES_5x5 : KEYS.TABLES_4x4;
    const data = await AsyncStorage.getItem(key);
    return data ? JSON.parse(data) : [];
  } catch { return []; }
};

export const saveTables = async (tables, size = '4x4') => {
  try {
    const key = size === '5x5' ? KEYS.TABLES_5x5 : KEYS.TABLES_4x4;
    await AsyncStorage.setItem(key, JSON.stringify(tables));
  } catch (e) { console.error('Error saving tables:', e); }
};

export const addTable = async (table, size = '4x4') => {
  const tables = await getTables(size);
  tables.push(table);
  await saveTables(tables, size);
  return tables;
};

export const deleteTable = async (index, size = '4x4') => {
  const tables = await getTables(size);
  tables.splice(index, 1);
  await saveTables(tables, size);
  return tables;
};

// --- Config ---
export const getConfig = async () => {
  try {
    const data = await AsyncStorage.getItem(KEYS.CONFIG);
    return data ? { ...DEFAULT_CONFIG, ...JSON.parse(data) } : DEFAULT_CONFIG;
  } catch { return DEFAULT_CONFIG; }
};

export const saveConfig = async (config) => {
  try {
    await AsyncStorage.setItem(KEYS.CONFIG, JSON.stringify(config));
  } catch (e) { console.error('Error saving config:', e); }
};

export const updateConfig = async (key, value) => {
  const config = await getConfig();
  config[key] = value;
  await saveConfig(config);
  return config;
};
