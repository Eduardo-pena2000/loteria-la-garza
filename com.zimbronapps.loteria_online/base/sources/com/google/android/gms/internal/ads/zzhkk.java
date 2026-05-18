package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzhkk {
    private final zzhye zza;
    private final Class zzb;

    public /* synthetic */ zzhkk(zzhye zzhyeVar, Class cls, byte[] bArr) {
        this.zza = zzhyeVar;
        this.zzb = cls;
    }

    public static zzhkk zzd(zzhkj zzhkjVar, zzhye zzhyeVar, Class cls) {
        return new zzhki(zzhyeVar, cls, zzhkjVar);
    }

    public abstract zzhbp zza(zzhlg zzhlgVar) throws GeneralSecurityException;

    public final zzhye zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
