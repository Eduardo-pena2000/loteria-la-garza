package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzikk extends zzikc {
    static {
        zzikh.zza(Collections.emptyMap());
    }

    public /* synthetic */ zzikk(Map map, zziki zzikiVar) {
        super(map);
    }

    public static zzikj zzc(int i) {
        return new zzikj(i, null);
    }

    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzc = zzikd.zzc(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzc.put(entry.getKey(), ((zzikp) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzc);
    }
}
