package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabs implements zzafv {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzael zzd;

    public zzabs(zzaar zzaarVar, String str, String str2, zzael zzaelVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    public final void zza(String str) {
        this.zzd.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzaar.zza(this.zza).zza(new zzaji(((zzahv) obj).zzc(), this.zzb, this.zzc), new zzabr(this, this.zzd));
    }
}
