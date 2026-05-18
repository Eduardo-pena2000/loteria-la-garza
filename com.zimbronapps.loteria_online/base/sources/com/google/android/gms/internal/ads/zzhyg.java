package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhyg {
    private final zzhye zza;

    private zzhyg(zzhye zzhyeVar) {
        this.zza = zzhyeVar;
    }

    public static zzhyg zza(byte[] bArr, zzhbt zzhbtVar) {
        return new zzhyg(zzhye.zza(bArr));
    }

    public static zzhyg zzb(int i) {
        return new zzhyg(zzhye.zza(zzhle.zza(i)));
    }

    public final byte[] zzc(zzhbt zzhbtVar) {
        return this.zza.zzc();
    }

    public final int zzd() {
        return this.zza.zzd();
    }
}
