package com.google.android.gms.internal.firebase-auth-api;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzanj implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzang zzd;

    public /* synthetic */ zzanj(zzang zzangVar, zzanl zzanlVar) {
        this(zzangVar);
    }

    private final Iterator zza() {
        if (this.zzc == null) {
            this.zzc = zzang.zzb(this.zzd).entrySet().iterator();
        }
        return this.zzc;
    }

    public final boolean hasNext() {
        return this.zza + 1 < zzang.zza(this.zzd) || (!zzang.zzb(this.zzd).isEmpty() && zza().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.zzb = true;
        int i = this.zza + 1;
        this.zza = i;
        return i < zzang.zza(this.zzd) ? (zzank) zzang.zze(this.zzd)[this.zza] : (Map.Entry) zza().next();
    }

    public final void remove() {
        if (!this.zzb) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzb = false;
        zzang.zzd(this.zzd);
        if (this.zza >= zzang.zza(this.zzd)) {
            zza().remove();
            return;
        }
        zzang zzangVar = this.zzd;
        int i = this.zza;
        this.zza = i - 1;
        zzang.zza(zzangVar, i);
    }

    private zzanj(zzang zzangVar) {
        Objects.requireNonNull(zzangVar);
        this.zzd = zzangVar;
        this.zza = -1;
    }
}
