package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zznl {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zznl(Map map, Map map2, zznn zznnVar) {
        this(map, map2);
    }

    public static zznk zza() {
        return new zznk(null);
    }

    private zznl(Map map, Map map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public final Enum zza(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.zzb.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + String.valueOf(obj));
    }

    public final Object zza(Enum r4) throws GeneralSecurityException {
        Object obj = this.zza.get(r4);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + String.valueOf(r4));
    }
}
