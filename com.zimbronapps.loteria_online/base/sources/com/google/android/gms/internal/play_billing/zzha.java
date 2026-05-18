package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzha implements Iterator {
    final /* synthetic */ zzhd zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzha(zzhd zzhdVar, zzhc zzhcVar) {
        Objects.requireNonNull(zzhdVar);
        this.zza = zzhdVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzhd.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzhd zzhdVar = this.zza;
        if (i >= zzhd.zzb(zzhdVar)) {
            return !zzhd.zzh(zzhdVar).isEmpty() && zza().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzhd zzhdVar = this.zza;
        return i < zzhd.zzb(zzhdVar) ? (zzgz) zzhd.zzk(zzhdVar)[i] : (Map.Entry) zza().next();
    }

    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzhd zzhdVar = this.zza;
        zzhd.zzi(zzhdVar);
        int i = this.zzb;
        if (i >= zzhd.zzb(zzhdVar)) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzhd.zze(zzhdVar, i);
        }
    }
}
