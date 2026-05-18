package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgsh implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzgsi zzc;

    public zzgsh(zzgsi zzgsiVar) {
        Objects.requireNonNull(zzgsiVar);
        this.zzc = zzgsiVar;
        this.zza = zzgsiVar.zza.entrySet().iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zzb(entry);
    }

    public final void remove() {
        zzgrc.zzj(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        int size = this.zzb.size();
        zzgsv zzgsvVar = this.zzc.zzb;
        zzgsvVar.zzq(zzgsvVar.zzp() - size);
        this.zzb.clear();
        this.zzb = null;
    }
}
