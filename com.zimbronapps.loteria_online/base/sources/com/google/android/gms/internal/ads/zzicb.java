package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzicb extends AbstractList {
    private final zzibz zza;
    private final zzica zzb;

    public zzicb(zzibz zzibzVar, zzica zzicaVar) {
        this.zza = zzibzVar;
        this.zzb = zzicaVar;
    }

    public final Object get(int i) {
        return this.zzb.zzb(this.zza.zzf(i));
    }

    public final int size() {
        return this.zza.size();
    }
}
