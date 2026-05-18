package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabd implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzabd(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzajf zzajfVar = (zzajf) obj;
        zzaar.zza(this.zzb, new zzahv(zzajfVar.zzc(), zzajfVar.zzb(), Long.valueOf(zzajfVar.zza()), "Bearer"), null, null, Boolean.valueOf(zzajfVar.zzd()), null, this.zza, this);
    }
}
