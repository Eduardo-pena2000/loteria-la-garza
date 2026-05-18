package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgwb extends zzguf {
    final /* synthetic */ zzgwc zza;

    public zzgwb(zzgwc zzgwcVar) {
        Objects.requireNonNull(zzgwcVar);
        this.zza = zzgwcVar;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzgwc zzgwcVar = this.zza;
        zzgrc.zzm(i, zzgwcVar.zzw(), "index");
        int i2 = i + i;
        Object obj = zzgwcVar.zzv()[i2];
        Objects.requireNonNull(obj);
        Object obj2 = zzgwcVar.zzv()[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.zza.zzw();
    }

    public final boolean zzf() {
        return true;
    }
}
