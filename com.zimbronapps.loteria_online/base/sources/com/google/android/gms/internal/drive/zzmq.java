package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzmq implements Iterator {
    private int pos;
    private Iterator zzvj;
    private final /* synthetic */ zzmi zzvk;
    private boolean zzvo;

    private zzmq(zzmi zzmiVar) {
        this.zzvk = zzmiVar;
        this.pos = -1;
    }

    private final Iterator zzew() {
        if (this.zzvj == null) {
            this.zzvj = zzmi.zzc(this.zzvk).entrySet().iterator();
        }
        return this.zzvj;
    }

    public final boolean hasNext() {
        return this.pos + 1 < zzmi.zzb(this.zzvk).size() || (!zzmi.zzc(this.zzvk).isEmpty() && zzew().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.zzvo = true;
        int i = this.pos + 1;
        this.pos = i;
        return i < zzmi.zzb(this.zzvk).size() ? (Map.Entry) zzmi.zzb(this.zzvk).get(this.pos) : (Map.Entry) zzew().next();
    }

    public final void remove() {
        if (!this.zzvo) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzvo = false;
        zzmi.zza(this.zzvk);
        if (this.pos >= zzmi.zzb(this.zzvk).size()) {
            zzew().remove();
            return;
        }
        zzmi zzmiVar = this.zzvk;
        int i = this.pos;
        this.pos = i - 1;
        zzmi.zza(zzmiVar, i);
    }

    public /* synthetic */ zzmq(zzmi zzmiVar, zzmj zzmjVar) {
        this(zzmiVar);
    }
}
