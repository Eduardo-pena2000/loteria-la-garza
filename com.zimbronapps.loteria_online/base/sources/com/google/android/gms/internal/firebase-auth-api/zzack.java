package com.google.android.gms.internal.firebase-auth-api;

import J7.d0;
import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzack implements zzafv {
    private final /* synthetic */ d0 zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaar zzc;

    public zzack(zzaar zzaarVar, d0 d0Var, zzael zzaelVar) {
        this.zza = d0Var;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    public final void zza(String str) {
        this.zzb.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzahv zzahvVar = (zzahv) obj;
        zzail zzailVar = new zzail();
        zzailVar.zzd(zzahvVar.zzc());
        if (this.zza.zzb() || this.zza.getDisplayName() != null) {
            zzailVar.zzb(this.zza.getDisplayName());
        }
        if (this.zza.zzc() || this.zza.M1() != null) {
            zzailVar.zzg(this.zza.zza());
        }
        zzaar.zza(this.zzc, this.zzb, zzahvVar, zzailVar, this);
    }
}
