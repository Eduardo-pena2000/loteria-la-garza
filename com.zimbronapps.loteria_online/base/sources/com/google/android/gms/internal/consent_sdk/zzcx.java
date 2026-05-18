package com.google.android.gms.internal.consent_sdk;

import java.util.concurrent.ThreadFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzcx implements ThreadFactory {
    public final /* synthetic */ zzcy zza;
    public final /* synthetic */ String zzb = "Google consent worker";

    public /* synthetic */ zzcx(zzcy zzcyVar, String str) {
        this.zza = zzcyVar;
    }

    public final Thread newThread(Runnable runnable) {
        return zzcy.zza(this.zza, this.zzb, runnable);
    }
}
