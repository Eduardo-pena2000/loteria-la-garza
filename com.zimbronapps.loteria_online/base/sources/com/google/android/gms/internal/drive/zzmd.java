package com.google.android.gms.internal.drive;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzmd {
    private static final zzmd zzuw = new zzmd();
    private final ConcurrentMap zzuy = new ConcurrentHashMap();
    private final zzmg zzux = new zzlf();

    private zzmd() {
    }

    public static zzmd zzej() {
        return zzuw;
    }

    public final zzmf zzf(Class cls) {
        zzkm.zza((Object) cls, "messageType");
        zzmf zzmfVar = (zzmf) this.zzuy.get(cls);
        if (zzmfVar != null) {
            return zzmfVar;
        }
        zzmf zze = this.zzux.zze(cls);
        zzkm.zza((Object) cls, "messageType");
        zzkm.zza((Object) zze, "schema");
        zzmf zzmfVar2 = (zzmf) this.zzuy.putIfAbsent(cls, zze);
        return zzmfVar2 != null ? zzmfVar2 : zze;
    }

    public final zzmf zzq(Object obj) {
        return zzf(obj.getClass());
    }
}
