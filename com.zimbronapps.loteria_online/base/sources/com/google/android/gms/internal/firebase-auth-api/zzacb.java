package com.google.android.gms.internal.firebase-auth-api;

import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzacb implements zzafv {
    private final /* synthetic */ zzafv zza;
    private final /* synthetic */ zzael zzb;
    private final /* synthetic */ zzahv zzc;

    public zzacb(zzacc zzaccVar, zzafv zzafvVar, zzael zzaelVar, zzahv zzahvVar) {
        this.zza = zzafvVar;
        this.zzb = zzaelVar;
        this.zzc = zzahvVar;
        Objects.requireNonNull(zzaccVar);
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        List zza = ((zzahl) obj).zza();
        if (zza == null || zza.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzb.zza(this.zzc, (zzahk) zza.get(0));
        }
    }
}
