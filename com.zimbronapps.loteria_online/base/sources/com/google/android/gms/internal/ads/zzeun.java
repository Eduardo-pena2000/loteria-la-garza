package com.google.android.gms.internal.ads;

import V5.F0;
import V5.q0;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeun implements zzfax {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcxv zze;
    private final zzfks zzf;
    private final zzfjk zzg;
    private final q0 zzh = R5.t.l().zzo();
    private final zzdxt zzi;
    private final zzcyj zzj;

    public zzeun(Context context, String str, String str2, zzcxv zzcxvVar, zzfks zzfksVar, zzfjk zzfjkVar, zzdxt zzdxtVar, zzcyj zzcyjVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcxvVar;
        this.zzf = zzfksVar;
        this.zzg = zzfjkVar;
        this.zzi = zzdxtVar;
        this.zzj = zzcyjVar;
        this.zzd = j;
    }

    public final x7.e zza() {
        Bundle bundle = new Bundle();
        zzdxt zzdxtVar = this.zzi;
        Map zzc = zzdxtVar.zzc();
        String str = this.zzb;
        zzc.put("seq_num", str);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue()) {
            zzdxtVar.zzd("tsacc", String.valueOf(R5.t.o().a() - this.zzd));
            R5.t.g();
            zzdxtVar.zzd("foreground", true != F0.l(this.zza) ? "1" : "0");
        }
        zzcxv zzcxvVar = this.zze;
        zzfjk zzfjkVar = this.zzg;
        zzcxvVar.zzi(zzfjkVar.zzd);
        bundle.putAll(this.zzf.zzc());
        return zzgzo.zza(new zzeuo(this.zza, bundle, str, this.zzc, this.zzh, zzfjkVar.zzg, this.zzj));
    }

    public final int zzb() {
        return 12;
    }
}
