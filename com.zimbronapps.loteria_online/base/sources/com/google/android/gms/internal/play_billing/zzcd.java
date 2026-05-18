package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcd extends zzbx {
    private final transient zzbw zza;
    private final transient zzbt zzb;

    public zzcd(zzbw zzbwVar, zzbt zzbtVar) {
        this.zza = zzbwVar;
        this.zzb = zzbtVar;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    public final int size() {
        return this.zza.size();
    }

    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, 0);
    }

    public final zzbt zzd() {
        return this.zzb;
    }

    public final zzch zze() {
        return this.zzb.listIterator(0);
    }

    public final boolean zzf() {
        throw null;
    }
}
