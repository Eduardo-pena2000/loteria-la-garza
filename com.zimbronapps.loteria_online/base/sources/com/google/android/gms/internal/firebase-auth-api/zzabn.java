package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabn implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzabn(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzahv zzahvVar = (zzahv) obj;
        zzail zzailVar = new zzail();
        zzailVar.zzd(zzahvVar.zzc()).zzc(null).zzf(null);
        zzaar.zza(this.zzb, this.zza, zzahvVar, zzailVar, this);
    }
}
