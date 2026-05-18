package com.google.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class b {
    public static boolean a;
    public static final Class b = a("libcore.io.Memory");
    public static final boolean c;

    static {
        c = (a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return b;
    }

    public static boolean c() {
        return a || !(b == null || c);
    }
}
