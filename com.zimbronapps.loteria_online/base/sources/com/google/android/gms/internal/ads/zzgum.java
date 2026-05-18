package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgum extends zzgub {
    private final transient zzgun zza;

    public zzgum(zzgun zzgunVar) {
        this.zza = zzgunVar;
    }

    public final boolean contains(Object obj) {
        return this.zza.zzr(obj);
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzguk(this.zza);
    }

    public final int size() {
        return this.zza.size;
    }

    public final zzgwt zza() {
        return new zzguk(this.zza);
    }

    public final boolean zzf() {
        throw null;
    }

    public final int zzg(Object[] objArr, int i) {
        zzgwu listIterator = ((zzguf) this.zza.map.values()).listIterator(0);
        while (listIterator.hasNext()) {
            i = ((zzgub) listIterator.next()).zzg(objArr, i);
        }
        return i;
    }
}
