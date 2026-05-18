package com.google.android.gms.internal.ads;

import S5.c1;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfse extends zzcbf {
    final /* synthetic */ zzhah zza;
    final /* synthetic */ zzcaz zzb;
    final /* synthetic */ zzfsf zzc;

    public zzfse(zzfsf zzfsfVar, zzhah zzhahVar, zzcaz zzcazVar) {
        this.zza = zzhahVar;
        this.zzb = zzcazVar;
        Objects.requireNonNull(zzfsfVar);
        this.zzc = zzfsfVar;
    }

    public final void zze() {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(this.zzb, this.zza);
    }

    public final void zzf(int i) {
    }

    public final void zzg(c1 c1Var) {
        String bVar = c1Var.N1().toString();
        zzfsf zzfsfVar = this.zzc;
        String str = zzfsfVar.zze.a;
        StringBuilder sb = new StringBuilder(String.valueOf(bVar).length() + 51 + String.valueOf(str).length());
        sb.append("Failed to load rewarded ad with error: ");
        sb.append(bVar);
        sb.append(", adUnitId: ");
        sb.append(str);
        W5.p.f(sb.toString());
        zzfsfVar.zzD(c1Var);
    }
}
