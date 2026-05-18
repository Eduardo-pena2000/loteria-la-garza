package com.google.android.gms.internal.drive;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zznc implements Iterator {
    private final /* synthetic */ zzna zzvw;
    private Iterator zzvx;

    public zznc(zzna zznaVar) {
        this.zzvw = zznaVar;
        this.zzvx = zzna.zza(zznaVar).iterator();
    }

    public final boolean hasNext() {
        return this.zzvx.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.zzvx.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
