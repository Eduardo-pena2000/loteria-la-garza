package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzgun extends zzgsz implements Serializable {
    final transient zzgui map;
    final transient int size;

    public zzgun(zzgui zzguiVar, int i) {
        this.map = zzguiVar;
        this.size = i;
    }

    public final int zzd() {
        throw null;
    }

    @Deprecated
    public final boolean zze(Object obj, Object obj2) {
        throw null;
    }

    @Deprecated
    public final void zzf() {
        throw null;
    }

    public final Set zzh() {
        throw new AssertionError("unreachable");
    }

    public final /* synthetic */ Collection zzj() {
        return new zzgum(this);
    }

    public final Map zzl() {
        throw new AssertionError("should never be called");
    }

    public final boolean zzr(Object obj) {
        return obj != null && super.zzr(obj);
    }

    public final /* bridge */ /* synthetic */ Collection zzt() {
        throw null;
    }

    public /* synthetic */ Map zzu() {
        return this.map;
    }
}
