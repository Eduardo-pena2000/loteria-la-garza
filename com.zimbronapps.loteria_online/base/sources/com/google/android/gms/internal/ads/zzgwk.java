package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgwk extends zzgwo {
    final /* synthetic */ Set zza;
    final /* synthetic */ Set zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgwk(Set set, Set set2) {
        super(null);
        this.zza = set;
        this.zzb = set2;
    }

    public final boolean contains(Object obj) {
        return this.zza.contains(obj) && this.zzb.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        return this.zza.containsAll(collection) && this.zzb.containsAll(collection);
    }

    public final boolean isEmpty() {
        return Collections.disjoint(this.zzb, this.zza);
    }

    public final int size() {
        Iterator it = this.zza.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.zzb.contains(it.next())) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgwt iterator() {
        return new zzgwj(this, this.zza, this.zzb);
    }

    public final int zzb() {
        return 0;
    }

    public final int zzc() {
        return Math.min(zzgwo.zzd(this.zza), zzgwo.zzd(this.zzb));
    }
}
