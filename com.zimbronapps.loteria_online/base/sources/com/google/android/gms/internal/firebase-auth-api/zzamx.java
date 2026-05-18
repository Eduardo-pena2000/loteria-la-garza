package com.google.android.gms.internal.firebase-auth-api;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzamx {
    private static final zzamx zza = new zzamx();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzane zzb = new zzama();

    private zzamx() {
    }

    public static zzamx zza() {
        return zza;
    }

    public final zzanb zza(Class cls) {
        zzalh.zza(cls, "messageType");
        zzanb zzanbVar = (zzanb) this.zzc.get(cls);
        if (zzanbVar != null) {
            return zzanbVar;
        }
        zzanb zza2 = this.zzb.zza(cls);
        zzalh.zza(cls, "messageType");
        zzalh.zza(zza2, "schema");
        zzanb zzanbVar2 = (zzanb) this.zzc.putIfAbsent(cls, zza2);
        return zzanbVar2 != null ? zzanbVar2 : zza2;
    }

    public final zzanb zza(Object obj) {
        return zza(obj.getClass());
    }
}
