package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
abstract class zzhza implements Iterator {
    zzhzb zza;
    zzhzb zzb;
    int zzc;
    final /* synthetic */ zzhzc zzd;

    public zzhza(zzhzc zzhzcVar) {
        Objects.requireNonNull(zzhzcVar);
        this.zzd = zzhzcVar;
        this.zza = zzhzcVar.zzd.zzd;
        this.zzb = null;
        this.zzc = zzhzcVar.zzc;
    }

    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    public final void remove() {
        zzhzb zzhzbVar = this.zzb;
        if (zzhzbVar == null) {
            throw new IllegalStateException();
        }
        zzhzc zzhzcVar = this.zzd;
        zzhzcVar.zzd(zzhzbVar, true);
        this.zzb = null;
        this.zzc = zzhzcVar.zzc;
    }

    public final zzhzb zza() {
        zzhzc zzhzcVar = this.zzd;
        zzhzb zzhzbVar = this.zza;
        if (zzhzbVar == zzhzcVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzhzcVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzhzbVar.zzd;
        this.zzb = zzhzbVar;
        return zzhzbVar;
    }
}
