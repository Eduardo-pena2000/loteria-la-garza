package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaer implements zzagh {
    private final byte[] zza = new byte[4096];

    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        int zza = zzjVar.zza(this.zza, 0, Math.min(4096, i));
        if (zza != -1) {
            return zza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void zzd(zzer zzerVar, int i, int i2) {
        zzerVar.zzk(i);
    }

    public final void zze(long j, int i, int i2, int i3, zzagg zzaggVar) {
    }

    public final void zzz(zzv zzvVar) {
    }
}
