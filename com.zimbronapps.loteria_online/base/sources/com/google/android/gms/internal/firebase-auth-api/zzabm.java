package com.google.android.gms.internal.firebase-auth-api;

import J7.O;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabm implements zzafv {
    private final /* synthetic */ zzael zza;
    private final /* synthetic */ zzafv zzb;
    private final /* synthetic */ zzabj zzc;

    public zzabm(zzabj zzabjVar, zzael zzaelVar, zzafv zzafvVar) {
        this.zza = zzaelVar;
        this.zzb = zzafvVar;
        Objects.requireNonNull(zzabjVar);
        this.zzc = zzabjVar;
    }

    public final void zza(String str) {
        this.zzb.zza(str);
    }

    public final /* synthetic */ void zza(Object obj) {
        zzajj zzajjVar = (zzajj) obj;
        if (TextUtils.isEmpty(zzajjVar.zze())) {
            zzaar.zza(this.zzc.zza, new zzahv(zzajjVar.zzd(), zzajjVar.zzb(), Long.valueOf(zzajjVar.zza()), "Bearer"), null, "phone", Boolean.valueOf(zzajjVar.zzf()), null, this.zza, this.zzb);
        } else {
            this.zza.zza(new Status(17025), O.S1(zzajjVar.zzc(), zzajjVar.zze()));
        }
    }
}
