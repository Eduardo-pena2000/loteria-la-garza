package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzso extends zzst {
    private final zzsr zza;
    private final zzaal zzb;

    private zzso(zzsr zzsrVar, zzaal zzaalVar) {
        this.zza = zzsrVar;
        this.zzb = zzaalVar;
    }

    public final /* synthetic */ zzcb zza() {
        return (zzsr) zzc();
    }

    public final Integer zzb() {
        return null;
    }

    public final /* synthetic */ zzss zzc() {
        return this.zza;
    }

    public final zzaal zzd() {
        return this.zzb;
    }

    public static zzso zza(zzsr zzsrVar, zzaal zzaalVar) throws GeneralSecurityException {
        if (zzsrVar.zzb() == zzaalVar.zza()) {
            return new zzso(zzsrVar, zzaalVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }
}
