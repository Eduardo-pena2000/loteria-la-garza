package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznu {
    public static final /* synthetic */ int zza = 0;
    private static final zznu zzb = new zznu();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzny zzc = new zznd();

    private zznu() {
    }

    public static zznu zza() {
        return zzb;
    }

    public final zznx zzb(Class cls) {
        zzmp.zza(cls, "messageType");
        ConcurrentMap concurrentMap = this.zzd;
        zznx zznxVar = (zznx) concurrentMap.get(cls);
        if (zznxVar == null) {
            zznxVar = this.zzc.zza(cls);
            zzmp.zza(cls, "messageType");
            zznx zznxVar2 = (zznx) concurrentMap.putIfAbsent(cls, zznxVar);
            if (zznxVar2 != null) {
                return zznxVar2;
            }
        }
        return zznxVar;
    }
}
