package com.google.android.gms.internal.drive;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzkv implements Map.Entry {
    private Map.Entry zztf;

    private zzkv(Map.Entry entry) {
        this.zztf = entry;
    }

    public final Object getKey() {
        return this.zztf.getKey();
    }

    public final Object getValue() {
        if (((zzkt) this.zztf.getValue()) == null) {
            return null;
        }
        return zzkt.zzdp();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzlq) {
            return ((zzkt) this.zztf.getValue()).zzi((zzlq) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzkt zzdq() {
        return (zzkt) this.zztf.getValue();
    }

    public /* synthetic */ zzkv(Map.Entry entry, zzku zzkuVar) {
        this(entry);
    }
}
