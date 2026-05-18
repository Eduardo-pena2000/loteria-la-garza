package com.google.android.gms.internal.ads;

import S5.W1;
import S5.c1;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfqy extends zzbez {
    final /* synthetic */ zzhah zza;
    final /* synthetic */ W1 zzb;
    final /* synthetic */ zzfqz zzc;

    public zzfqy(zzfqz zzfqzVar, zzhah zzhahVar, W1 w1) {
        this.zza = zzhahVar;
        this.zzb = w1;
        Objects.requireNonNull(zzfqzVar);
        this.zzc = zzfqzVar;
    }

    public final void zzb(zzbex zzbexVar) {
        Objects.requireNonNull(this.zzc);
        zzfqt.zza(zzbexVar, this.zza);
    }

    public final void zzc(int i) {
    }

    public final void zzd(c1 c1Var) {
        String bVar = c1Var.N1().toString();
        String str = this.zzb.a;
        StringBuilder sb = new StringBuilder(String.valueOf(bVar).length() + 60 + String.valueOf(str).length());
        sb.append("Failed to load app open ad with error parcel: ");
        sb.append(bVar);
        sb.append(" for ad unit: ");
        sb.append(str);
        W5.p.f(sb.toString());
        zzfqz zzfqzVar = this.zzc;
        Objects.requireNonNull(zzfqzVar);
        zzfqzVar.zzD(c1Var);
    }
}
