package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzhjf {
    private final zzhye zza;
    private final Class zzb;

    public /* synthetic */ zzhjf(zzhye zzhyeVar, Class cls, byte[] bArr) {
        this.zza = zzhyeVar;
        this.zzb = cls;
    }

    public static zzhjf zzd(zzhje zzhjeVar, zzhye zzhyeVar, Class cls) {
        return new zzhjd(zzhyeVar, cls, zzhjeVar);
    }

    public abstract zzhaz zza(zzhlg zzhlgVar, zzhbt zzhbtVar) throws GeneralSecurityException;

    public final zzhye zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
