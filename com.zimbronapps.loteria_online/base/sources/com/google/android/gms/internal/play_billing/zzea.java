package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzea extends zzeb {
    final /* synthetic */ zzei zza;
    private int zzb;
    private final int zzc;

    public zzea(zzei zzeiVar) {
        Objects.requireNonNull(zzeiVar);
        this.zza = zzeiVar;
        this.zzb = 0;
        this.zzc = zzeiVar.zzd();
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
