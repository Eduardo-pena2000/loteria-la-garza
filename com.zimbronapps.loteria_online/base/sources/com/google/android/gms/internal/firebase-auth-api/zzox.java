package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzox {
    private static final zzox zza = new zzox();
    private final Map zzb = new HashMap();

    public static zzox zza() {
        return zza;
    }

    private final synchronized void zza(String str, zzcb zzcbVar) throws GeneralSecurityException {
        try {
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, zzcbVar);
                return;
            }
            if (((zzcb) this.zzb.get(str)).equals(zzcbVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzcbVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zza(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zza((String) entry.getKey(), (zzcb) entry.getValue());
        }
    }
}
