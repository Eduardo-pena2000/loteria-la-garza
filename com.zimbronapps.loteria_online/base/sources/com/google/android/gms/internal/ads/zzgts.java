package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzgts {
    private static final zzgts zza = new zzgtq();
    private static final zzgts zzb = new zzgtr(-1);
    private static final zzgts zzc = new zzgtr(1);

    public /* synthetic */ zzgts(byte[] bArr) {
    }

    public static zzgts zzg() {
        return zza;
    }

    public static /* synthetic */ zzgts zzh() {
        return zza;
    }

    public static /* synthetic */ zzgts zzi() {
        return zzb;
    }

    public static /* synthetic */ zzgts zzj() {
        return zzc;
    }

    public abstract zzgts zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgts zzb(int i, int i2);

    public abstract zzgts zzc(boolean z, boolean z2);

    public abstract zzgts zzd(boolean z, boolean z2);

    public abstract int zze();
}
