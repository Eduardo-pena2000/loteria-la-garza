package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgrl implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgrr zzb;

    public zzgrl(zzgrr zzgrrVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgrrVar);
        this.zzb = zzgrrVar;
    }

    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        zzgqw.zzb(sb, this, ", ");
        sb.append(']');
        return sb.toString();
    }
}
