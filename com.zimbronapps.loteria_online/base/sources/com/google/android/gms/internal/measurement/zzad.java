package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzad implements Iterator {
    final /* synthetic */ zzae zza;
    private int zzb;

    public zzad(zzae zzaeVar) {
        Objects.requireNonNull(zzaeVar);
        this.zza = zzaeVar;
        this.zzb = 0;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza.zzh();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        zzae zzaeVar = this.zza;
        if (this.zzb < zzaeVar.zzh()) {
            int i = this.zzb;
            this.zzb = i + 1;
            return zzaeVar.zzl(i);
        }
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 21);
        sb.append("Out of bounds index: ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }
}
