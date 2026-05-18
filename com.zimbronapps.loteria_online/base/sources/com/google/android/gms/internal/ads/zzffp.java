package com.google.android.gms.internal.ads;

import S5.l2;
import S5.w2;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzffp implements zzflt {
    public final zzfgi zza;
    public final zzfgk zzb;
    public final l2 zzc;
    public final String zzd;
    public final Executor zze;
    public final w2 zzf;
    public final zzflj zzg;

    public zzffp(zzfgi zzfgiVar, zzfgk zzfgkVar, l2 l2Var, String str, Executor executor, w2 w2Var, zzflj zzfljVar) {
        this.zza = zzfgiVar;
        this.zzb = zzfgkVar;
        this.zzc = l2Var;
        this.zzd = str;
        this.zze = executor;
        this.zzf = w2Var;
        this.zzg = zzfljVar;
    }

    public final Executor zza() {
        return this.zze;
    }

    public final zzflj zzb() {
        return this.zzg;
    }
}
