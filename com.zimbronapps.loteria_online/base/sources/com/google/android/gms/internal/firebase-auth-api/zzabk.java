package com.google.android.gms.internal.firebase-auth-api;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabk implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzafs zzb;
    private final /* synthetic */ zzaar zzc;

    public zzabk(zzaar zzaarVar, zzael zzaelVar, zzafs zzafsVar) {
        this.zza = zzaelVar;
        this.zzb = zzafsVar;
        Objects.requireNonNull(zzaarVar);
        this.zzc = zzaarVar;
    }

    public final void zza(String str) {
        this.zzb.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaip zzaipVar = (zzaip) obj;
        zzaar.zza(this.zzc, new zzahv(zzaipVar.zzc(), zzaipVar.zzb(), Long.valueOf(zzaipVar.zza()), "Bearer"), null, "password", Boolean.FALSE, null, this.zza, this);
    }
}
