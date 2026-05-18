package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zzanu {
    private static volatile int zza = 100;

    public abstract int zza(Object obj);

    public abstract Object zza();

    public abstract Object zza(Object obj, Object obj2);

    public abstract void zza(Object obj, int i, int i2);

    public abstract void zza(Object obj, int i, long j);

    public abstract void zza(Object obj, int i, zzajv zzajvVar);

    public abstract void zza(Object obj, int i, Object obj2);

    public abstract void zza(Object obj, zzaol zzaolVar) throws IOException;

    public abstract boolean zza(zzanc zzancVar);

    public final boolean zza(Object obj, zzanc zzancVar, int i) throws IOException {
        int zzd = zzancVar.zzd();
        int i2 = zzd >>> 3;
        int i3 = zzd & 7;
        if (i3 == 0) {
            zzb(obj, i2, zzancVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zza(obj, i2, zzancVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zza(obj, i2, zzancVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw zzall.zzb();
            }
            if (i3 != 5) {
                throw zzall.zza();
            }
            zza(obj, i2, zzancVar.zzf());
            return true;
        }
        Object zza2 = zza();
        int i4 = 4 | (i2 << 3);
        int i5 = i + 1;
        if (i5 >= zza) {
            throw zzall.zzh();
        }
        while (zzancVar.zzc() != Integer.MAX_VALUE && zza(zza2, zzancVar, i5)) {
        }
        if (i4 != zzancVar.zzd()) {
            throw zzall.zzb();
        }
        zza(obj, i2, zze(zza2));
        return true;
    }

    public abstract int zzb(Object obj);

    public abstract void zzb(Object obj, int i, long j);

    public abstract void zzb(Object obj, zzaol zzaolVar) throws IOException;

    public abstract void zzb(Object obj, Object obj2);

    public abstract Object zzc(Object obj);

    public abstract void zzc(Object obj, Object obj2);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj);

    public abstract void zzf(Object obj);
}
