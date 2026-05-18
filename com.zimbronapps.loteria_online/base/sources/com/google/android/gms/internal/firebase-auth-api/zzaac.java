package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaac implements zzsq {
    private final zzsq zza;
    private final zzsq zzb;

    public /* synthetic */ zzaac(zzsq zzsqVar, zzsq zzsqVar2, zzaab zzaabVar) {
        this(zzsqVar, zzsqVar2);
    }

    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        return bArr.length <= 64 ? this.zza.zza(bArr, i) : this.zzb.zza(bArr, i);
    }

    private zzaac(zzsq zzsqVar, zzsq zzsqVar2) {
        this.zza = zzsqVar;
        this.zzb = zzsqVar2;
    }
}
