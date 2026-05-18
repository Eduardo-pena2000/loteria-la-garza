package com.google.android.gms.internal.firebase-auth-api;

import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaax implements zzafv {
    private final /* synthetic */ zzafs zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzahv zzc;
    private final /* synthetic */ zzail zzd;
    private final /* synthetic */ zzaar zze;

    public zzaax(zzaar zzaarVar, zzafs zzafsVar, zzael zzaelVar, zzahv zzahvVar, zzail zzailVar) {
        this.zza = zzafsVar;
        this.zzb = zzaelVar;
        this.zzc = zzahvVar;
        this.zzd = zzailVar;
        Objects.requireNonNull(zzaarVar);
        this.zze = zzaarVar;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List zza = ((zzahl) obj).zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzaar.zza(this.zze, this.zzb, this.zzc, (zzahk) zza.get(0), this.zzd, this.zza);
        }
    }
}
