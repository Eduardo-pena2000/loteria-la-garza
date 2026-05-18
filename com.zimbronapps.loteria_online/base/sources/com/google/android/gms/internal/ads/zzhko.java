package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhko implements Iterable {
    final /* synthetic */ List zza;
    final /* synthetic */ List zzb;

    public zzhko(zzhkr zzhkrVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzhkrVar);
    }

    public final Iterator iterator() {
        return new zzhkq(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
