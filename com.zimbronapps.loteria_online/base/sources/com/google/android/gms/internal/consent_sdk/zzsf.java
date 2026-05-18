package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzsf implements Iterator {
    final /* synthetic */ zzsi zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzsf(zzsi zzsiVar, zzsh zzshVar) {
        Objects.requireNonNull(zzsiVar);
        this.zza = zzsiVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzsi.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzsi zzsiVar = this.zza;
        if (i >= zzsi.zzb(zzsiVar)) {
            return !zzsi.zzh(zzsiVar).isEmpty() && zza().hasNext();
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzsi zzsiVar = this.zza;
        return i < zzsi.zzb(zzsiVar) ? (zzse) zzsi.zzk(zzsiVar)[i] : (Map.Entry) zza().next();
    }

    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzsi zzsiVar = this.zza;
        zzsi.zzi(zzsiVar);
        int i = this.zzb;
        if (i >= zzsi.zzb(zzsiVar)) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzsi.zze(zzsiVar, i);
        }
    }
}
