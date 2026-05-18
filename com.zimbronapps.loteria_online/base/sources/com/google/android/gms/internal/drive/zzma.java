package com.google.android.gms.internal.drive;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzma {
    private static final zzly zzuu = zzei();
    private static final zzly zzuv = new zzlz();

    public static zzly zzeg() {
        return zzuu;
    }

    public static zzly zzeh() {
        return zzuv;
    }

    private static zzly zzei() {
        try {
            return (zzly) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
