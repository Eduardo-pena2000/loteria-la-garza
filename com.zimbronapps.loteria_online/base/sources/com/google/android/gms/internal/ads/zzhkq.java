package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhkq implements Iterator {
    private final Iterator zza;
    private final Iterator zzb;

    public /* synthetic */ zzhkq(Iterator it, Iterator it2, byte[] bArr) {
        this.zza = it;
        this.zzb = it2;
    }

    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzb.hasNext();
    }

    public final Object next() {
        Iterator it = this.zza;
        return it.hasNext() ? it.next() : this.zzb.next();
    }
}
