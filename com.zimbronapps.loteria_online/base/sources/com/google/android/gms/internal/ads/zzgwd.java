package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgwd extends zzgup {
    private final transient zzgui zza;
    private final transient zzguf zzb;

    public zzgwd(zzgui zzguiVar, zzguf zzgufVar) {
        this.zza = zzguiVar;
        this.zzb = zzgufVar;
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

    public final zzgwt zza() {
        return this.zzb.listIterator(0);
    }

    public final zzguf zze() {
        return this.zzb;
    }

    public final boolean zzf() {
        return true;
    }

    public final int zzg(Object[] objArr, int i) {
        return this.zzb.zzg(objArr, i);
    }
}
