package com.google.android.gms.internal.firebase-auth-api;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzat extends zzaq {
    private final transient zzal zza;
    private final transient zzah zzb;

    public zzat(zzal zzalVar, zzah zzahVar) {
        this.zza = zzalVar;
        this.zzb = zzahVar;
    }

    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public final int size() {
        return this.zza.size();
    }

    public final int zza(Object[] objArr, int i) {
        return zzc().zza(objArr, i);
    }

    public final zzah zzc() {
        return this.zzb;
    }

    public final zzay zzd() {
        return (zzay) zzc().iterator();
    }
}
