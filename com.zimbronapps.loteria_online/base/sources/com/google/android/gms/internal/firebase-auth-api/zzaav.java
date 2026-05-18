package com.google.android.gms.internal.firebase-auth-api;

import J7.j;
import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaav implements zzafv {
    private final /* synthetic */ j zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzael zzc;
    private final /* synthetic */ zzaar zzd;

    public zzaav(zzaar zzaarVar, j jVar, String str, zzael zzaelVar) {
        this.zza = jVar;
        this.zzb = str;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzd = zzaarVar;
    }

    public final void zza(String str) {
        this.zzc.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaar.zza(this.zzd, new zzagx(this.zza, ((zzahv) obj).zzc(), this.zzb), this.zzc);
    }
}
