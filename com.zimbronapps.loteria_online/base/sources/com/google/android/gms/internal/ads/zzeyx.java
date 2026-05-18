package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.pm.PackageInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeyx implements zzfax {
    private final zzgzy zza;
    private final zzfjk zzb;
    private final PackageInfo zzc;
    private final q0 zzd;

    public zzeyx(zzgzy zzgzyVar, zzfjk zzfjkVar, PackageInfo packageInfo, q0 q0Var) {
        this.zza = zzgzyVar;
        this.zzb = zzfjkVar;
        this.zzc = packageInfo;
        this.zzd = q0Var;
    }

    public final x7.e zza() {
        return this.zza.zzc(new zzeyw(this));
    }

    public final int zzb() {
        return 26;
    }

    public final /* synthetic */ zzeyy zzc() {
        return new zzeyy(this.zzb, this.zzc, this.zzd);
    }
}
