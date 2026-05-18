package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zziex implements Iterator, Ra.a {
    private final /* synthetic */ Iterator zza;

    public zziex(Iterator it) {
        kotlin.jvm.internal.t.g(it, "delegate");
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final Object next() {
        return this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
