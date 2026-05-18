package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzop {
    private static final zzor zza = new zzos();
    private static final zzop zzb = zzb();
    private final Map zzc = new HashMap();

    private final synchronized zzbi zzb(zzcb zzcbVar, Integer num) throws GeneralSecurityException {
        zzor zzorVar;
        zzorVar = (zzor) this.zzc.get(zzcbVar.getClass());
        if (zzorVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(zzcbVar) + ": no key creator for this class was registered.");
        }
        return zzorVar.zza(zzcbVar, num);
    }

    public final zzbi zza(zzcb zzcbVar, Integer num) throws GeneralSecurityException {
        return zzb(zzcbVar, num);
    }

    public static /* synthetic */ zzof zza(zzoi zzoiVar, Integer num) {
        zzxb zza2 = zzoiVar.zzb().zza();
        zzbh zza3 = zznq.zza().zza(zza2.zzf());
        if (!zznq.zza().zzb(zza2.zzf())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzwx zza4 = zza3.zza(zza2.zze());
        return new zzof(zzqb.zza(zza4.zzf(), zza4.zze(), zza4.zzb(), zza2.zzd(), num), zzbf.zza());
    }

    private static zzop zzb() {
        zzop zzopVar = new zzop();
        try {
            zzopVar.zza(zza, zzoi.class);
            return zzopVar;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("unexpected error.", e);
        }
    }

    public static zzop zza() {
        return zzb;
    }

    public final synchronized void zza(zzor zzorVar, Class cls) throws GeneralSecurityException {
        try {
            zzor zzorVar2 = (zzor) this.zzc.get(cls);
            if (zzorVar2 != null && !zzorVar2.equals(zzorVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.zzc.put(cls, zzorVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
