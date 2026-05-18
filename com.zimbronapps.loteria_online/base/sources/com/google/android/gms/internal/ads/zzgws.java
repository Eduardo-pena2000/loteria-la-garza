package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzgws extends zzgwr implements ListIterator {
    public zzgws(ListIterator listIterator) {
        super(listIterator);
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return this.zzb.hasPrevious();
    }

    public final int nextIndex() {
        return this.zzb.nextIndex();
    }

    public final Object previous() {
        return zza(this.zzb.previous());
    }

    public final int previousIndex() {
        return this.zzb.previousIndex();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
