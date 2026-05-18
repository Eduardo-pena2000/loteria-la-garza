package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdnt implements zzgzl {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdoc zzb;

    public zzdnt(zzdoc zzdocVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzdocVar);
        this.zzb = zzdocVar;
    }

    public final void zza(Throwable th) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgr)).booleanValue()) {
            R5.t.l().zzh(th, "omid native display exp");
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzY(this.zza, (zzekb) obj);
    }
}
