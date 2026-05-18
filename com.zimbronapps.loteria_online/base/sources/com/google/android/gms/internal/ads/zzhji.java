package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzhji {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzhji(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhji zzd(zzhjh zzhjhVar, Class cls, Class cls2) {
        return new zzhjg(cls, cls2, zzhjhVar);
    }

    public abstract zzhlg zza(zzhaz zzhazVar, zzhbt zzhbtVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
