package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zznq {
    private static final Logger zza = Logger.getLogger(zznq.class.getName());
    private static final zznq zzb = new zznq();
    private ConcurrentMap zzc = new ConcurrentHashMap();
    private ConcurrentMap zzd = new ConcurrentHashMap();

    private final synchronized zzbh zzc(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (zzbh) this.zzc.get(str);
    }

    public final zzbh zza(String str, Class cls) throws GeneralSecurityException {
        zzbh zzc = zzc(str);
        if (zzc.zza().equals(cls)) {
            return zzc;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(zzc.getClass()) + ", which only supports: " + String.valueOf(zzc.zza()));
    }

    public final boolean zzb(String str) {
        return ((Boolean) this.zzd.get(str)).booleanValue();
    }

    public final zzbh zza(String str) throws GeneralSecurityException {
        return zzc(str);
    }

    public static zznq zza() {
        return zzb;
    }

    private final synchronized void zza(zzbh zzbhVar, boolean z, boolean z2) throws GeneralSecurityException {
        try {
            String zzb2 = zzbhVar.zzb();
            if (z2 && this.zzd.containsKey(zzb2) && !((Boolean) this.zzd.get(zzb2)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + zzb2);
            }
            zzbh zzbhVar2 = (zzbh) this.zzc.get(zzb2);
            if (zzbhVar2 != null && !zzbhVar2.getClass().equals(zzbhVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + zzb2);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zzb2, zzbhVar2.getClass().getName(), zzbhVar.getClass().getName()}));
            }
            this.zzc.putIfAbsent(zzb2, zzbhVar);
            this.zzd.put(zzb2, Boolean.valueOf(z2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza(zzbh zzbhVar, boolean z) throws GeneralSecurityException {
        zza(zzbhVar, zziv.zza.zza, z);
    }

    public final synchronized void zza(zzbh zzbhVar, zziv.zza zzaVar, boolean z) throws GeneralSecurityException {
        if (zzaVar.zza()) {
            zza(zzbhVar, false, z);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
