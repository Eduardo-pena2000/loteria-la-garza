package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgsx extends AbstractCollection {
    final /* synthetic */ zzgsy zza;

    public zzgsx(zzgsy zzgsyVar) {
        Objects.requireNonNull(zzgsyVar);
        this.zza = zzgsyVar;
    }

    public final void clear() {
        this.zza.zzf();
    }

    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    public final Iterator iterator() {
        return this.zza.zzk();
    }

    public final int size() {
        return this.zza.zzd();
    }
}
