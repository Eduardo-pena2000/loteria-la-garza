package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhkr {
    private static final zzhye zza = zzhye.zza(new byte[0]);
    private final Map zzb;

    public /* synthetic */ zzhkr(Map map, byte[] bArr) {
        this.zzb = map;
    }

    public final Iterable zza(byte[] bArr) {
        Map map = this.zzb;
        List list = (List) map.get(zza);
        List list2 = bArr.length >= 5 ? (List) map.get(zzhye.zzb(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new ArrayList() : list == null ? list2 : list2 == null ? list : new zzhko(this, list2, list);
    }
}
