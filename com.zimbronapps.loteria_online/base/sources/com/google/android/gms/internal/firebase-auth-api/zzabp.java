package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabp implements zzafv {
    private final /* synthetic */ zzafv zza;
    private final /* synthetic */ zzahv zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzael zzd;
    private final /* synthetic */ zzabq zze;

    public zzabp(zzabq zzabqVar, zzafv zzafvVar, zzahv zzahvVar, String str, zzael zzaelVar) {
        this.zza = zzafvVar;
        this.zzb = zzahvVar;
        this.zzc = str;
        this.zzd = zzaelVar;
        Objects.requireNonNull(zzabqVar);
        this.zze = zzabqVar;
    }

    public final void zza(String str) {
        this.zzd.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        List zza = ((zzahl) obj).zza();
        if (zza != null && !zza.isEmpty()) {
            zzahk zzahkVar = (zzahk) zza.get(0);
            zzail zzailVar = new zzail();
            zzailVar.zzd(this.zzb.zzc()).zza(this.zzc);
            zzaar.zza(this.zze.zza, this.zzd, this.zzb, zzahkVar, zzailVar, this.zza);
            return;
        }
        this.zza.zza("No users.");
    }
}
