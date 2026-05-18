package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbhu extends zzbhv {
    private final R5.g zza;
    private final String zzb;
    private final String zzc;

    public zzbhu(R5.g gVar, String str, String str2) {
        this.zza = gVar;
        this.zzb = str;
        this.zzc = str2;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzd(N6.a aVar) {
        if (aVar == null) {
            return;
        }
        this.zza.zza((View) N6.b.r1(aVar));
    }

    public final void zze() {
        this.zza.zzb();
    }

    public final void zzf() {
        this.zza.zzc();
    }
}
