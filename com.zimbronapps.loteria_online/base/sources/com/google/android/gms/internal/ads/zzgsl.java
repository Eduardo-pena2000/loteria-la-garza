package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class zzgsl extends zzgvj {
    final /* synthetic */ zzgsv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgsl(zzgsv zzgsvVar, Map map) {
        super(map);
        Objects.requireNonNull(zzgsvVar);
        this.zza = zzgsvVar;
    }

    public final void clear() {
        zzguy.zzb(iterator());
    }

    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    public final Iterator iterator() {
        return new zzgsk(this, this.zzd.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection == null) {
            return false;
        }
        int size = collection.size();
        collection.clear();
        zzgsv zzgsvVar = this.zza;
        zzgsvVar.zzq(zzgsvVar.zzp() - size);
        return size > 0;
    }
}
