package androidx.datastore.preferences.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p {
    public static final n a = new o();
    public static final n b = c();

    public static n a() {
        n nVar = b;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static n b() {
        return a;
    }

    public static n c() {
        if (W.d) {
            return null;
        }
        try {
            return (n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
