package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzacj implements zzafv {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzaar zzc;

    public zzacj(zzaar zzaarVar, String str, zzael zzaelVar) {
        this.zza = str;
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
        zzailVar.zzd(zzahvVar.zzc()).zzc(this.zza);
        zzaar.zza(this.zzc, this.zzb, zzahvVar, zzailVar, this);
    }
}
