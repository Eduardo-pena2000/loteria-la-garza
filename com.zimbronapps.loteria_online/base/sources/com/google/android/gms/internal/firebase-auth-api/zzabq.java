package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabq implements zzafv {
    final /* synthetic */ zzaar zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzael zzc;

    public zzabq(zzaar zzaarVar, String str, zzael zzaelVar) {
        this.zzb = str;
        this.zzc = zzaelVar;
        Objects.requireNonNull(zzaarVar);
        this.zza = zzaarVar;
    }

    public final void zza(String str) {
        this.zzc.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzahv zzahvVar = (zzahv) obj;
        zzaar.zza(this.zza).zza(new zzahi(zzahvVar.zzc()), new zzabp(this, this, zzahvVar, this.zzb, this.zzc));
    }
}
