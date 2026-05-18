package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzifa implements Map.Entry, Ra.a {
    private final /* synthetic */ Map.Entry zza;

    public zzifa(Map.Entry entry) {
        kotlin.jvm.internal.t.g(entry, "delegate");
        this.zza = entry;
    }

    public final Object getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        return this.zza.getValue();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
