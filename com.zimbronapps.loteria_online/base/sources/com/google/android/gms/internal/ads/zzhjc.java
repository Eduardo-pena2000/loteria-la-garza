package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhjc {
    private static final Logger zza = Logger.getLogger(zzhjc.class.getName());
    private static final zzhjc zzd = new zzhjc();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhjc zza() {
        return zzd;
    }

    private final synchronized zzhba zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98);
            sb.append("No key manager found for key type ");
            sb.append(str);
            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb.toString());
        }
        return (zzhba) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzhba zzhbaVar, boolean z, boolean z2) throws GeneralSecurityException {
        try {
            String zzb = zzhbaVar.zzb();
            if (z2) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(zzb) && !((Boolean) concurrentMap.get(zzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(zzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzhba zzhbaVar2 = (zzhba) concurrentMap2.get(zzb);
            if (zzhbaVar2 != null && !zzhbaVar2.getClass().equals(zzhbaVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(zzb));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zzb, zzhbaVar2.getClass().getName(), zzhbaVar.getClass().getName()}));
            }
            concurrentMap2.putIfAbsent(zzb, zzhbaVar);
            this.zzc.put(zzb, Boolean.valueOf(z2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(zzhba zzhbaVar, boolean z) throws GeneralSecurityException {
        zzf(zzhbaVar, 1, z);
    }

    public final zzhba zzc(String str, Class cls) throws GeneralSecurityException {
        zzhba zzg = zzg(str);
        if (zzg.zzc().equals(cls)) {
            return zzg;
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzg.getClass());
        String obj = zzg.zzc().toString();
        StringBuilder sb = new StringBuilder(name.length() + 53 + valueOf.length() + 23 + obj.length());
        sb.append("Primitive type ");
        sb.append(name);
        sb.append(" not supported by key manager of type ");
        sb.append(valueOf);
        sb.append(", which only supports: ");
        sb.append(obj);
        throw new GeneralSecurityException(sb.toString());
    }

    public final zzhba zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzhba zzhbaVar, int i, boolean z) throws GeneralSecurityException {
        if (!zzhid.zza(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzhbaVar, false, z);
    }
}
