package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzguk extends zzgwt {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgun zzc;

    public zzguk(zzgun zzgunVar) {
        Objects.requireNonNull(zzgunVar);
        this.zzc = zzgunVar;
        this.zza = ((zzguf) zzgunVar.map.values()).listIterator(0);
        this.zzb = zzguv.zza;
    }

    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgub) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}
