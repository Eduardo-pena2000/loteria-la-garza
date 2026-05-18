package com.google.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class w {
    public static final u a = c();
    public static final u b = new v();

    public static u a() {
        return a;
    }

    public static u b() {
        return b;
    }

    public static u c() {
        try {
            return (u) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
