package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaby implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzaby(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaha zzahaVar = (zzaha) obj;
        zzaar.zza(this.zzb, new zzahv(zzahaVar.zzb(), zzahaVar.zza(), Long.valueOf(zzahx.zza(zzahaVar.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
