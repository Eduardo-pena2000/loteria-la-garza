package com.google.android.gms.internal.firebase-auth-api;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzani implements Iterator {
    private int zza;
    private Iterator zzb;
    private final /* synthetic */ zzang zzc;

    public /* synthetic */ zzani(zzang zzangVar, zzanl zzanlVar) {
        this(zzangVar);
    }

    private final Iterator zza() {
        if (this.zzb == null) {
            this.zzb = zzang.zzc(this.zzc).entrySet().iterator();
        }
        return this.zzb;
    }

    public final boolean hasNext() {
        int i = this.zza;
        return (i > 0 && i <= zzang.zza(this.zzc)) || zza().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (zza().hasNext()) {
            return (Map.Entry) zza().next();
        }
        Object[] zze = zzang.zze(this.zzc);
        int i = this.zza - 1;
        this.zza = i;
        return (zzank) zze[i];
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private zzani(zzang zzangVar) {
        Objects.requireNonNull(zzangVar);
        this.zzc = zzangVar;
        this.zza = zzang.zza(zzangVar);
    }
}
