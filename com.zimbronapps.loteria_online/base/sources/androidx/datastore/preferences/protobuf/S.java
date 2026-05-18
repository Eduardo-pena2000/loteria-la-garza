package androidx.datastore.preferences.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class s implements J {
    public static final s a = new s();

    public static s c() {
        return a;
    }

    public I a(Class cls) {
        if (!t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (I) t.q(cls.asSubclass(t.class)).f();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    public boolean b(Class cls) {
        return t.class.isAssignableFrom(cls);
    }
}
