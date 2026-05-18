package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzkw implements Iterator {
    private Iterator zztg;

    public zzkw(Iterator it) {
        this.zztg = it;
    }

    public final boolean hasNext() {
        return this.zztg.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zztg.next();
        return entry.getValue() instanceof zzkt ? new zzkv(entry, null) : entry;
    }

    public final void remove() {
        this.zztg.remove();
    }
}
