package com.google.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class l {
    public static final j a = new k();
    public static final j b = c();

    public static j a() {
        j jVar = b;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static j b() {
        return a;
    }

    public static j c() {
        try {
            return (j) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
