package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzidm {
    private static final zzidm zza = new zzidm();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzidv zzb = new zzict();

    private zzidm() {
    }

    public static zzidm zza() {
        return zza;
    }

    public final zzidu zzb(Class cls) {
        zzice.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzc;
        zzidu zziduVar = (zzidu) concurrentMap.get(cls);
        if (zziduVar == null) {
            zziduVar = this.zzb.zza(cls);
            zzidu zziduVar2 = (zzidu) concurrentMap.putIfAbsent(cls, zziduVar);
            if (zziduVar2 != null) {
                return zziduVar2;
            }
        }
        return zziduVar;
    }
}
