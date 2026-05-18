package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zziaf extends zziag {
    final /* synthetic */ zzian zza;
    private int zzb;
    private final int zzc;

    public zziaf(zzian zzianVar) {
        Objects.requireNonNull(zzianVar);
        this.zza = zzianVar;
        this.zzb = 0;
        this.zzc = zzianVar.zzc();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
