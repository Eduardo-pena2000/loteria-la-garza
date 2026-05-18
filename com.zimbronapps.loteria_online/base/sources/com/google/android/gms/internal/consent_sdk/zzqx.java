package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzqx implements Iterator {
    private final Iterator zza;

    public zzqx(Iterator it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        return entry.getValue() instanceof zzqz ? new zzqw(entry, null) : entry;
    }

    public final void remove() {
        this.zza.remove();
    }
}
