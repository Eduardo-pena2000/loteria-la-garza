package com.google.android.gms.internal.firebase-auth-api;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzpo implements Iterable {
    private final /* synthetic */ List zza;
    private final /* synthetic */ List zzb;

    public zzpo(zzpl zzplVar, List list, List list2) {
        this.zza = list;
        this.zzb = list2;
        Objects.requireNonNull(zzplVar);
    }

    public final Iterator iterator() {
        return new zzpq(this.zza.iterator(), this.zzb.iterator(), null);
    }
}
