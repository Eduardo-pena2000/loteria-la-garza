package com.google.android.gms.internal.auth;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgr implements Iterator {
    final /* synthetic */ zzgv zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzgr(zzgv zzgvVar, zzgq zzgqVar) {
        this.zza = zzgvVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzgv.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        if (this.zzb + 1 >= zzgv.zzf(this.zza).size()) {
            return !zzgv.zzh(this.zza).isEmpty() && zza().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        return i < zzgv.zzf(this.zza).size() ? (Map.Entry) zzgv.zzf(this.zza).get(this.zzb) : (Map.Entry) zza().next();
    }

    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzgv.zzi(this.zza);
        if (this.zzb >= zzgv.zzf(this.zza).size()) {
            zza().remove();
            return;
        }
        zzgv zzgvVar = this.zza;
        int i = this.zzb;
        this.zzb = i - 1;
        zzgv.zzd(zzgvVar, i);
    }
}
