package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgux extends zzgwt {
    private final Object zza;
    private boolean zzb;

    public zzgux(Object obj) {
        this.zza = obj;
    }

    public final boolean hasNext() {
        return !this.zzb;
    }

    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
