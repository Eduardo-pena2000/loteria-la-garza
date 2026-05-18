package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgsr implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzgss zzc;

    public zzgsr(zzgss zzgssVar) {
        Objects.requireNonNull(zzgssVar);
        this.zzc = zzgssVar;
        List list = zzgssVar.zzb;
        this.zzb = list;
        this.zza = list instanceof List ? list.listIterator() : list.iterator();
    }

    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    public final Object next() {
        zza();
        return this.zza.next();
    }

    public final void remove() {
        this.zza.remove();
        zzgss zzgssVar = this.zzc;
        zzgssVar.zze.zzq(r1.zzp() - 1);
        zzgssVar.zzb();
    }

    public final void zza() {
        zzgss zzgssVar = this.zzc;
        zzgssVar.zza();
        if (zzgssVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzgsr(zzgss zzgssVar, Iterator it) {
        Objects.requireNonNull(zzgssVar);
        this.zzc = zzgssVar;
        this.zzb = zzgssVar.zzb;
        this.zza = it;
    }
}
