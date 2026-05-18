package com.google.android.gms.internal.drive;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzna extends AbstractList implements zzkz, RandomAccess {
    private final zzkz zzvt;

    public zzna(zzkz zzkzVar) {
        this.zzvt = zzkzVar;
    }

    public static /* synthetic */ zzkz zza(zzna zznaVar) {
        return zznaVar.zzvt;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.zzvt.get(i);
    }

    public final Iterator iterator() {
        return new zznc(this);
    }

    public final ListIterator listIterator(int i) {
        return new zznb(this, i);
    }

    public final int size() {
        return this.zzvt.size();
    }

    public final Object zzao(int i) {
        return this.zzvt.zzao(i);
    }

    public final List zzdr() {
        return this.zzvt.zzdr();
    }

    public final zzkz zzds() {
        return this;
    }
}
