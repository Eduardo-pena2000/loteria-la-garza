package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzagh {
    default void zzN(long j) {
    }

    default int zza(zzj zzjVar, int i, boolean z) throws IOException {
        return zzb(zzjVar, i, z, 0);
    }

    int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException;

    default void zzc(zzer zzerVar, int i) {
        zzd(zzerVar, i, 0);
    }

    void zzd(zzer zzerVar, int i, int i2);

    void zze(long j, int i, int i2, int i3, zzagg zzaggVar);

    void zzz(zzv zzvVar);
}
