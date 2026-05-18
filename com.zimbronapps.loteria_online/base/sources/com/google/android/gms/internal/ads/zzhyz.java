package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhyz extends AbstractSet {
    final /* synthetic */ zzhzc zza;

    public zzhyz(zzhzc zzhzcVar) {
        Objects.requireNonNull(zzhzcVar);
        this.zza = zzhzcVar;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    public final Iterator iterator() {
        return new zzhyy(this);
    }

    public final boolean remove(Object obj) {
        return this.zza.zze(obj) != null;
    }

    public final int size() {
        return this.zza.zzb;
    }
}
