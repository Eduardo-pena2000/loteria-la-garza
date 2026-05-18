package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgve extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzgqt zzb;

    public zzgve(List list, zzgqt zzgqtVar) {
        list.getClass();
        this.zza = list;
        this.zzb = zzgqtVar;
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public final ListIterator listIterator(int i) {
        return new zzgvd(this, this.zza.listIterator(i));
    }

    public final void removeRange(int i, int i2) {
        this.zza.subList(i, i2).clear();
    }

    public final int size() {
        return this.zza.size();
    }
}
