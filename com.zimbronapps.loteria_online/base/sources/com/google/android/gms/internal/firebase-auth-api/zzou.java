package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzou {
    private static final zzou zza = new zzou();
    private final Map zzb = new HashMap();

    public static zzou zza() {
        return zza;
    }

    public final synchronized void zza(zzot zzotVar, Class cls) throws GeneralSecurityException {
        try {
            zzot zzotVar2 = (zzot) this.zzb.get(cls);
            if (zzotVar2 != null && !zzotVar2.equals(zzotVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(cls, zzotVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
