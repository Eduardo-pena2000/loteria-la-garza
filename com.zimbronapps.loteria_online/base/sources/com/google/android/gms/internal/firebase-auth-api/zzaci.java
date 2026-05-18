package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaci implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzaci(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaip zzaipVar = (zzaip) obj;
        zzaar.zza(this.zzb, new zzahv(zzaipVar.zzc(), zzaipVar.zzb(), Long.valueOf(zzaipVar.zza()), "Bearer"), null, null, Boolean.TRUE, null, this.zza, this);
    }
}
