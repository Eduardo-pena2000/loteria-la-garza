package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzpb implements Iterator {
    final /* synthetic */ zzpe zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzpb(zzpe zzpeVar, zzpd zzpdVar) {
        this.zza = zzpeVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzpe.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzpe zzpeVar = this.zza;
        if (i >= zzpe.zzb(zzpeVar)) {
            return !zzpe.zzh(zzpeVar).isEmpty() && zza().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzpe zzpeVar = this.zza;
        return i < zzpe.zzb(zzpeVar) ? (zzpa) zzpe.zzk(zzpeVar)[i] : (Map.Entry) zza().next();
    }

    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzpe.zzi(this.zza);
        int i = this.zzb;
        zzpe zzpeVar = this.zza;
        if (i >= zzpe.zzb(zzpeVar)) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzpe.zze(zzpeVar, i);
        }
    }
}
