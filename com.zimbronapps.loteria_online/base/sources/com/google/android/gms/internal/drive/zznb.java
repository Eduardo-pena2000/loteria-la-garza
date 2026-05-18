package com.google.android.gms.internal.drive;

import java.util.ListIterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznb implements ListIterator {
    private ListIterator zzvu;
    private final /* synthetic */ int zzvv;
    private final /* synthetic */ zzna zzvw;

    public zznb(zzna zznaVar, int i) {
        this.zzvw = zznaVar;
        this.zzvv = i;
        this.zzvu = zzna.zza(zznaVar).listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.zzvu.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzvu.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.zzvu.next();
    }

    public final int nextIndex() {
        return this.zzvu.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.zzvu.previous();
    }

    public final int previousIndex() {
        return this.zzvu.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
