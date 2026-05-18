package com.google.android.gms.internal.ads;

import S5.Y;
import S5.c1;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfrb extends S5.M {
    final /* synthetic */ zzhah zza;
    final /* synthetic */ Y zzb;
    final /* synthetic */ zzfrc zzc;

    public zzfrb(zzfrc zzfrcVar, zzhah zzhahVar, Y y) {
        this.zza = zzhahVar;
        this.zzb = y;
        Objects.requireNonNull(zzfrcVar);
        this.zzc = zzfrcVar;
    }

    public final void zzb() {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(this.zzb, this.zza);
    }

    public final void zzc(c1 c1Var) {
        String bVar = c1Var.N1().toString();
        zzfrc zzfrcVar = this.zzc;
        String str = zzfrcVar.zze.a;
        StringBuilder sb = new StringBuilder(String.valueOf(bVar).length() + 57 + String.valueOf(str).length());
        sb.append("Failed to load interstitial ad with error: ");
        sb.append(bVar);
        sb.append(" for ad unit: ");
        sb.append(str);
        W5.p.f(sb.toString());
        zzfrcVar.zzD(c1Var);
    }
}
