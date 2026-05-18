package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zze {
    private final Executor zza;

    public zze(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(String str, String str2, zzd... zzdVarArr) {
        this.zza.execute(new zzc(str, str2, zzdVarArr));
    }
}
