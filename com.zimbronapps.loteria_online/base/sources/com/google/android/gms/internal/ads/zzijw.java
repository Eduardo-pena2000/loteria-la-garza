package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzijw implements Iterator {
    int zza = 0;
    final /* synthetic */ zzijx zzb;

    public zzijw(zzijx zzijxVar) {
        this.zzb = zzijxVar;
    }

    public final boolean hasNext() {
        int i = this.zza;
        zzijx zzijxVar = this.zzb;
        return i < zzijxVar.zza.size() || zzijxVar.zzb.hasNext();
    }

    public final Object next() {
        int i = this.zza;
        zzijx zzijxVar = this.zzb;
        List list = zzijxVar.zza;
        if (i >= list.size()) {
            list.add(zzijxVar.zzb.next());
            return next();
        }
        int i2 = this.zza;
        this.zza = i2 + 1;
        return list.get(i2);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
