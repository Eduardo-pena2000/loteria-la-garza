// Tema visual de Lotería La Garza - Estilo mexicano colorido
export const COLORS = {
  // Primarios
  primary: '#F4511E',       // Naranja principal (headers, botones)
  primaryDark: '#D84315',   // Naranja oscuro
  primaryLight: '#FF7043',  // Naranja claro

  // Secundarios
  blue: '#2196F3',          // Azul (botones de acción)
  blueDark: '#1976D2',
  blueLight: '#42A5F5',
  
  green: '#4CAF50',         // Verde (online, chat)
  greenLight: '#81C784',
  greenDark: '#388E3C',
  
  yellow: '#FFC107',        // Amarillo (banners)
  yellowLight: '#FFD54F',
  
  teal: '#009688',          // Teal (mesas públicas)
  purple: '#7C4DFF',        // Morado (baraja, bingo)
  pink: '#E91E63',          // Rosa (mis tablas)
  red: '#F44336',           // Rojo (errores, cerrar)

  // Neutros
  white: '#FFFFFF',
  background: '#FFF8F0',    // Fondo crema cálido
  surface: '#FFFFFF',
  text: '#212121',
  textSecondary: '#757575',
  textLight: '#9E9E9E',
  border: '#E0E0E0',
  divider: '#F5F5F5',
  
  // Específicos del juego
  chatBg: '#E8F5E9',        // Verde claro del chat
  cardBack: '#C62828',       // Rojo del reverso de cartas
  overlay: 'rgba(0,0,0,0.5)',
};

// Gradientes para los botones del Home
export const GRADIENTS = {
  misTablas: ['#EC407A', '#F48FB1'],       // Rosa
  abrirMesa: ['#EF5350', '#E53935'],       // Rojo
  mesasPublicas: ['#26A69A', '#00897B'],   // Teal/verde
  jugarOffline: ['#42A5F5', '#EF5350'],    // Azul-rojo
  barajaLoteria: ['#7C4DFF', '#651FFF'],   // Morado
  bingoOnline: ['#7C4DFF', '#448AFF'],     // Morado-azul
  quitarPub: ['#FFA726', '#FF9800'],       // Amarillo
  ayuda: ['#90CAF9', '#64B5F6'],           // Azul claro
};

export const FONTS = {
  regular: { fontWeight: '400' },
  medium: { fontWeight: '500' },
  bold: { fontWeight: '700' },
  extraBold: { fontWeight: '800' },
};

export const SPACING = {
  xs: 4,
  sm: 8,
  md: 16,
  lg: 24,
  xl: 32,
  xxl: 48,
};

export const RADIUS = {
  sm: 8,
  md: 12,
  lg: 16,
  xl: 20,
  pill: 999,
};

export const SHADOWS = {
  small: {
    shadowColor: '#000',
    shadowOffset: { width: 0, height: 1 },
    shadowOpacity: 0.18,
    shadowRadius: 1.0,
    elevation: 1,
  },
  medium: {
    shadowColor: '#000',
    shadowOffset: { width: 0, height: 2 },
    shadowOpacity: 0.23,
    shadowRadius: 2.62,
    elevation: 4,
  },
  large: {
    shadowColor: '#000',
    shadowOffset: { width: 0, height: 4 },
    shadowOpacity: 0.30,
    shadowRadius: 4.65,
    elevation: 8,
  },
};

// Nombres de las 54 cartas de lotería
export const CARD_NAMES = [
  '', // index 0 (no se usa)
  'El Gallo', 'El Diablito', 'La Dama', 'El Catrín', 'El Paraguas',
  'La Sirena', 'La Escalera', 'La Botella', 'El Barril', 'El Árbol',
  'El Melón', 'El Valiente', 'El Gorrito', 'La Muerte', 'La Pera',
  'La Bandera', 'El Bandolón', 'El Violoncello', 'La Garza', 'El Pájaro',
  'La Mano', 'La Bota', 'La Luna', 'El Cotorro', 'El Borracho',
  'El Negrito', 'El Corazón', 'La Sandía', 'El Tambor', 'El Camarón',
  'Las Jaras', 'El Músico', 'La Araña', 'El Soldado', 'La Estrella',
  'El Cazo', 'El Mundo', 'El Apache', 'El Nopal', 'El Alacrán',
  'La Rosa', 'La Calavera', 'La Campana', 'El Cantarito', 'El Venado',
  'El Sol', 'La Corona', 'La Chalupa', 'El Pino', 'El Pescado',
  'La Palma', 'La Maceta', 'El Arpa', 'La Rana',
];
