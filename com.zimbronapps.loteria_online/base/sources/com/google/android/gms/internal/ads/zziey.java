package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziey implements Iterator, Ra.a {
    final /* synthetic */ Iterator zza;
    private final /* synthetic */ Iterator zzb;

    public zziey(Iterator it) {
        this.zza = it;
        this.zzb = it;
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return new zzifa((Map.Entry) this.zza.next());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
