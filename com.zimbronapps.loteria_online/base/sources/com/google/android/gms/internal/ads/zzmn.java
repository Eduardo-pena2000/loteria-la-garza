package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzmn {
    static boolean zzaa(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    String zzS();

    int zza();

    int zzab(zzv zzvVar) throws zziw;

    int zzu() throws zziw;

    default void zzv(zzmm zzmmVar) {
    }

    default void zzw() {
    }
}
