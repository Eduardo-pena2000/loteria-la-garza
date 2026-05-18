package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzai {
    private Application zza;

    private zzai() {
        throw null;
    }

    public final zza zza() {
        zztj.zzb(this.zza, Application.class);
        return new zzah(this.zza);
    }

    public final zzai zzb(Application application) {
        application.getClass();
        this.zza = application;
        return this;
    }

    public /* synthetic */ zzai(zzal zzalVar) {
    }
}
