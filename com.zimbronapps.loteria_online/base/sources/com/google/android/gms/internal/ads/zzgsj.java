package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgsj implements Iterator {
    final Iterator zza;
    Collection zzb;
    Iterator zzc;
    final /* synthetic */ zzgsv zzd;

    public zzgsj(zzgsv zzgsvVar) {
        Objects.requireNonNull(zzgsvVar);
        this.zzd = zzgsvVar;
        this.zza = zzgsvVar.zzo().entrySet().iterator();
        this.zzb = null;
        this.zzc = zzguw.INSTANCE;
    }

    public final boolean hasNext() {
        return this.zza.hasNext() || this.zzc.hasNext();
    }

    public final Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.zzb = collection;
            this.zzc = collection.iterator();
        }
        return this.zzc.next();
    }

    public final void remove() {
        this.zzc.remove();
        Collection collection = this.zzb;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.zza.remove();
        }
        this.zzd.zzq(r0.zzp() - 1);
    }
}
