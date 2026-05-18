package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgje {
    private final File zza;
    private final zzfvc zzb;
    private final zzgoe zzc;

    public zzgje(File file, zzfvc zzfvcVar, zzgoe zzgoeVar) {
        this.zza = file;
        this.zzb = zzfvcVar;
        this.zzc = zzgoeVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean z;
        try {
            File file = this.zza;
            zzgxm.zzb(file);
            zzgxm.zza(bArr, file);
            z = this.zzb.zza(file);
        } catch (GeneralSecurityException | IOException e) {
            this.zzc.zzd(2027, e);
            z = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return z;
    }
}
