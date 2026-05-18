package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzaaw implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzaar zzb;

    public zzaaw(zzaar zzaarVar, zzael zzaelVar) {
        this.zza = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zzb = zzaarVar;
    }

    public final void zza(String str) {
        this.zza.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzajh zzajhVar = (zzajh) obj;
        if (zzajhVar.zzf()) {
            this.zza.zza(new zzaas(zzajhVar.zzc(), zzajhVar.zze(), null));
        } else {
            zzaar.zza(this.zzb, new zzahv(zzajhVar.zzd(), zzajhVar.zzb(), Long.valueOf(zzajhVar.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }
}
