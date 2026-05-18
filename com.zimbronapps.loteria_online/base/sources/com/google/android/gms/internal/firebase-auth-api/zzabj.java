package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabj implements zzafv {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ zzajg zzb;
    private final /* synthetic */ zzael zzc;

    public zzabj(zzaar zzaarVar, zzajg zzajgVar, zzael zzaelVar) {
        this.zzb = zzajgVar;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    public final void zza(String str) {
        this.zzc.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        this.zzb.zza(((zzahv) obj).zzc());
        zzaar.zza(this.zza).zza(this.zzb, new zzabm(this, this.zzc, this));
    }
}
