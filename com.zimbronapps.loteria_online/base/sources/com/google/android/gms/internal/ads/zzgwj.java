package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgwj extends zzgsd {
    final Iterator zza;
    final /* synthetic */ Set zzb;
    final /* synthetic */ Set zzc;

    public zzgwj(zzgwk zzgwkVar, Set set, Set set2) {
        this.zzb = set;
        this.zzc = set2;
        Objects.requireNonNull(zzgwkVar);
        this.zza = set.iterator();
    }

    public final Object zza() {
        Set set;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            set = this.zzc;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
