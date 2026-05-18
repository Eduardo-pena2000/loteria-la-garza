package com.google.android.gms.internal.firebase-auth-api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzpl {
    private static final zzaaj zza = zzaaj.zza(new byte[0]);
    private final Map zzb;

    public /* synthetic */ zzpl(Map map, zzpp zzppVar) {
        this(map);
    }

    public final Iterable zza(byte[] bArr) {
        List list = (List) this.zzb.get(zza);
        List list2 = bArr.length >= 5 ? (List) this.zzb.get(zzaaj.zza(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new zzpo(this, list2, list);
    }

    private zzpl(Map map) {
        this.zzb = map;
    }
}
