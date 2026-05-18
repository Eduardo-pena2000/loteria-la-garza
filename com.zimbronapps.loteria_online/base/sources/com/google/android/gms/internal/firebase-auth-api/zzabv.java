package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabv implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzabw zzb;

    public zzabv(zzabw zzabwVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzabwVar);
        this.zzb = zzabwVar;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzagy zzagyVar = (zzagy) obj;
        zzaar.zza(this.zzb.zza, new zzahv(zzagyVar.zzb(), zzagyVar.zza(), Long.valueOf(zzahx.zza(zzagyVar.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
