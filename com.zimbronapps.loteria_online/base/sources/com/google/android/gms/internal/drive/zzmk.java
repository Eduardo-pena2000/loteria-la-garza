package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzmk implements Iterator {
    private int pos;
    private Iterator zzvj;
    private final /* synthetic */ zzmi zzvk;

    private zzmk(zzmi zzmiVar) {
        this.zzvk = zzmiVar;
        this.pos = zzmi.zzb(zzmiVar).size();
    }

    private final Iterator zzew() {
        if (this.zzvj == null) {
            this.zzvj = zzmi.zzd(this.zzvk).entrySet().iterator();
        }
        return this.zzvj;
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= zzmi.zzb(this.zzvk).size()) || zzew().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (zzew().hasNext()) {
            return (Map.Entry) zzew().next();
        }
        List zzb = zzmi.zzb(this.zzvk);
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) zzb.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ zzmk(zzmi zzmiVar, zzmj zzmjVar) {
        this(zzmiVar);
    }
}
