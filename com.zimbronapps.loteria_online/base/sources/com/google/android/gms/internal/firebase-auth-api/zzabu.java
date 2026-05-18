package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabu implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzabu(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzajd zzajdVar = (zzajd) obj;
        if (!zzajdVar.zzl()) {
            zzaar.zza(this.zzb, zzajdVar, this.zza, this);
        } else {
            this.zza.zza(new zzaas(zzajdVar.zzf(), zzajdVar.zzk(), zzajdVar.zzb()));
        }
    }
}
