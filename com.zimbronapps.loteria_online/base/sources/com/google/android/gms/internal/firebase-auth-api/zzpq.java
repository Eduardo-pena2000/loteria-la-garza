package com.google.android.gms.internal.firebase-auth-api;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzpq implements Iterator {
    private final Iterator zza;
    private final Iterator zzb;

    public /* synthetic */ zzpq(Iterator it, Iterator it2, zzpp zzppVar) {
        this(it, it2);
    }

    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    public final Object next() {
        return this.zza.hasNext() ? this.zza.next() : this.zzb.next();
    }

    private zzpq(Iterator it, Iterator it2) {
        this.zza = it;
        this.zzb = it2;
    }
}
