package com.google.android.gms.internal.fido;

import java.util.AbstractMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzch extends zzcc {
    final /* synthetic */ zzci zza;

    public zzch(zzci zzciVar) {
        this.zza = zzciVar;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return new AbstractMap.SimpleImmutableEntry(zzcj.zzk(this.zza.zza).zzd.get(i), zzcj.zze(this.zza.zza).get(i));
    }

    public final int size() {
        return this.zza.zza.size();
    }
}
