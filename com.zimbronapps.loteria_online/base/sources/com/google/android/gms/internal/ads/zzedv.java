package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.regex.Matcher;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzedv implements zzgzl {
    final /* synthetic */ zzedy zza;

    public zzedv(zzedy zzedyVar) {
        Objects.requireNonNull(zzedyVar);
        this.zza = zzedyVar;
    }

    public final void zza(Throwable th) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhf)).booleanValue()) {
            Matcher matcher = zzedy.zzd().matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzedy zzedyVar = this.zza;
                zzedyVar.zzc().zzc(Integer.parseInt(group));
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfjc zzfjcVar = (zzfjc) obj;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhf)).booleanValue()) {
            zzedy zzedyVar = this.zza;
            zzfiu zzfiuVar = zzfjcVar.zzb.zzb;
            zzedyVar.zzc().zzc(zzfiuVar.zzf);
            zzedyVar.zzc().zze(zzfiuVar.zzg);
        }
    }
}
