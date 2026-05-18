// Dummy Firebase file para poder probar la web sin errores de getReactNativePersistence
export const auth = {};

export const loginGuest = async () => {
    return { uid: 'guest', displayName: 'Invitado' };
};

export const signOut = async () => {
    console.log("Signed out");
};
