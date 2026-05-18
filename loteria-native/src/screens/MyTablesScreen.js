import React, { useState, useEffect, useCallback } from 'react';
import { View, Text, TouchableOpacity, StyleSheet, FlatList, Image, Alert } from 'react-native';
import MexicanBackground from '../components/MexicanBackground';
import { COLORS, RADIUS, SPACING, SHADOWS } from '../theme';
import { getTables, deleteTable } from '../storage';

const CARD_IMAGES = {
  modern: (id) => {
    const images = {
      0: require('../../assets/figuras/modern/0.jpg'), 1: require('../../assets/figuras/modern/1.jpg'),
      2: require('../../assets/figuras/modern/2.jpg'), 3: require('../../assets/figuras/modern/3.jpg'),
      4: require('../../assets/figuras/modern/4.jpg'), 5: require('../../assets/figuras/modern/5.jpg'),
      6: require('../../assets/figuras/modern/6.jpg'), 7: require('../../assets/figuras/modern/7.jpg'),
      8: require('../../assets/figuras/modern/8.jpg'), 9: require('../../assets/figuras/modern/9.jpg'),
      10: require('../../assets/figuras/modern/10.jpg'), 11: require('../../assets/figuras/modern/11.jpg'),
      12: require('../../assets/figuras/modern/12.jpg'), 13: require('../../assets/figuras/modern/13.jpg'),
      14: require('../../assets/figuras/modern/14.jpg'), 15: require('../../assets/figuras/modern/15.jpg'),
      16: require('../../assets/figuras/modern/16.jpg'), 17: require('../../assets/figuras/modern/17.jpg'),
      18: require('../../assets/figuras/modern/18.jpg'), 19: require('../../assets/figuras/modern/19.jpg'),
      20: require('../../assets/figuras/modern/20.jpg'), 21: require('../../assets/figuras/modern/21.jpg'),
      22: require('../../assets/figuras/modern/22.jpg'), 23: require('../../assets/figuras/modern/23.jpg'),
      24: require('../../assets/figuras/modern/24.jpg'), 25: require('../../assets/figuras/modern/25.jpg'),
      26: require('../../assets/figuras/modern/26.jpg'), 27: require('../../assets/figuras/modern/27.jpg'),
      28: require('../../assets/figuras/modern/28.jpg'), 29: require('../../assets/figuras/modern/29.jpg'),
      30: require('../../assets/figuras/modern/30.jpg'), 31: require('../../assets/figuras/modern/31.jpg'),
      32: require('../../assets/figuras/modern/32.jpg'), 33: require('../../assets/figuras/modern/33.jpg'),
      34: require('../../assets/figuras/modern/34.jpg'), 35: require('../../assets/figuras/modern/35.jpg'),
      36: require('../../assets/figuras/modern/36.jpg'), 37: require('../../assets/figuras/modern/37.jpg'),
      38: require('../../assets/figuras/modern/38.jpg'), 39: require('../../assets/figuras/modern/39.jpg'),
      40: require('../../assets/figuras/modern/40.jpg'), 41: require('../../assets/figuras/modern/41.jpg'),
      42: require('../../assets/figuras/modern/42.jpg'), 43: require('../../assets/figuras/modern/43.jpg'),
      44: require('../../assets/figuras/modern/44.jpg'), 45: require('../../assets/figuras/modern/45.jpg'),
      46: require('../../assets/figuras/modern/46.jpg'), 47: require('../../assets/figuras/modern/47.jpg'),
      48: require('../../assets/figuras/modern/48.jpg'), 49: require('../../assets/figuras/modern/49.jpg'),
      50: require('../../assets/figuras/modern/50.jpg'), 51: require('../../assets/figuras/modern/51.jpg'),
      52: require('../../assets/figuras/modern/52.jpg'), 53: require('../../assets/figuras/modern/53.jpg'),
      54: require('../../assets/figuras/modern/54.jpg'),
    };
    return images[id];
  },
};

export default function MyTablesScreen({ navigation }) {
  const [activeTab, setActiveTab] = useState('4x4');
  const [tables, setTables] = useState([]);

  const loadTables = useCallback(async () => {
    const data = await getTables(activeTab);
    setTables(data);
  }, [activeTab]);

  useEffect(() => {
    loadTables();
  }, [loadTables]);

  useEffect(() => {
    const unsub = navigation.addListener('focus', loadTables);
    return unsub;
  }, [navigation, loadTables]);

  const handleDelete = (index) => {
    Alert.alert('Eliminar tabla', '¿Estás seguro?', [
      { text: 'Cancelar', style: 'cancel' },
      {
        text: 'Eliminar',
        style: 'destructive',
        onPress: async () => {
          await deleteTable(index, activeTab);
          loadTables();
        },
      },
    ]);
  };

  const handleCreate = () => {
    navigation.navigate('TableEditor', { size: activeTab, editIndex: -1 });
  };

  const handleEdit = (index) => {
    navigation.navigate('TableEditor', { size: activeTab, editIndex: index, table: tables[index] });
  };

  const gridSize = activeTab === '4x4' ? 4 : 5;

  const renderTablePreview = (table, index) => {
    return (
      <TouchableOpacity
        key={index}
        style={styles.tableCard}
        onPress={() => handleEdit(index)}
        onLongPress={() => handleDelete(index)}
        activeOpacity={0.7}
      >
        <View style={[styles.tableGrid, { aspectRatio: 1 }]}>
          {table.cards.slice(0, gridSize * gridSize).map((cardId, i) => (
            <View key={i} style={[styles.gridCell, { width: `${100 / gridSize}%` }]}>
              <Image
                source={CARD_IMAGES.modern(cardId)}
                style={styles.gridImage}
                resizeMode="cover"
              />
            </View>
          ))}
        </View>
        {table.favorite && <Text style={styles.favIcon}>❤️</Text>}
      </TouchableOpacity>
    );
  };

  return (
    <View style={styles.container}>
      {/* Header */}
      <View style={styles.header}>
        <TouchableOpacity onPress={() => navigation.goBack()} style={styles.headerBtn}>
          <Text style={styles.headerBtnText}>←</Text>
        </TouchableOpacity>
        <Text style={styles.headerTitle}>Mis tablas ({tables.length})</Text>
        <TouchableOpacity onPress={handleCreate} style={styles.headerBtn}>
          <Text style={styles.headerBtnText}>+</Text>
        </TouchableOpacity>
      </View>

      {/* Tabs 4x4 / 5x5 */}
      <View style={styles.tabsContainer}>
        <TouchableOpacity
          style={[styles.tab, activeTab === '4x4' && styles.tabActive]}
          onPress={() => setActiveTab('4x4')}
        >
          <Text style={[styles.tabText, activeTab === '4x4' && styles.tabTextActive]}>4x4</Text>
        </TouchableOpacity>
        <TouchableOpacity
          style={[styles.tab, activeTab === '5x5' && styles.tabActive]}
          onPress={() => setActiveTab('5x5')}
        >
          <Text style={[styles.tabText, activeTab === '5x5' && styles.tabTextActive]}>5x5</Text>
        </TouchableOpacity>
      </View>

      {/* Content */}
      <MexicanBackground style={styles.content}>
        {tables.length === 0 ? (
          <View style={styles.emptyContainer}>
            <View style={styles.tipBox}>
              <Text style={styles.tipIcon}>ℹ️</Text>
              <Text style={styles.tipText}>Presiona el "+" para crear una tabla ({activeTab})</Text>
            </View>
          </View>
        ) : (
          <FlatList
            data={tables}
            keyExtractor={(_, i) => i.toString()}
            numColumns={2}
            contentContainerStyle={styles.gridList}
            renderItem={({ item, index }) => renderTablePreview(item, index)}
          />
        )}
      </MexicanBackground>
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
  tabsContainer: {
    flexDirection: 'row', backgroundColor: COLORS.white, borderBottomWidth: 1, borderBottomColor: COLORS.border,
  },
  tab: { flex: 1, paddingVertical: 14, alignItems: 'center' },
  tabActive: { backgroundColor: COLORS.primary, borderRadius: RADIUS.sm, margin: 4 },
  tabText: { fontSize: 16, fontWeight: '700', color: COLORS.textSecondary },
  tabTextActive: { color: COLORS.white },
  content: { flex: 1 },
  emptyContainer: { flex: 1, paddingTop: SPACING.lg, paddingHorizontal: SPACING.lg },
  tipBox: {
    flexDirection: 'row', alignItems: 'center', backgroundColor: '#FFF8E1',
    padding: SPACING.md, borderRadius: RADIUS.md, gap: SPACING.sm,
  },
  tipIcon: { fontSize: 18 },
  tipText: { flex: 1, fontSize: 14, color: COLORS.text },
  gridList: { padding: SPACING.md },
  tableCard: {
    flex: 1, margin: SPACING.sm, borderRadius: RADIUS.md,
    overflow: 'hidden', backgroundColor: COLORS.white, ...SHADOWS.medium, maxWidth: '48%',
  },
  tableGrid: { flexDirection: 'row', flexWrap: 'wrap' },
  gridCell: { aspectRatio: 1, padding: 1 },
  gridImage: { width: '100%', height: '100%', borderRadius: 2 },
  favIcon: { position: 'absolute', top: 4, right: 4, fontSize: 14 },
});
