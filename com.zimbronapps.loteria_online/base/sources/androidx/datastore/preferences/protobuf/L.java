package androidx.datastore.preferences.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l {
    public static final Class a = c();

    public static m a() {
        m b = b("getEmptyRegistry");
        return b != null ? b : m.c;
    }

    public static final m b(String str) {
        Class cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (m) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
