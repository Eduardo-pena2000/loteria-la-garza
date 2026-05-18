package com.google.android.gms.internal.auth;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzft {
    private static final zzfs zza;
    private static final zzfs zzb;

    static {
        zzfs zzfsVar = null;
        try {
            zzfsVar = (zzfs) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
        }
        zza = zzfsVar;
        zzb = new zzfs();
    }

    public static zzfs zza() {
        return zza;
    }

    public static zzfs zzb() {
        return zzb;
    }
}
