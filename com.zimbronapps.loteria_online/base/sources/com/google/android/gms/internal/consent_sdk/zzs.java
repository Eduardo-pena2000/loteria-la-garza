package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzs implements Runnable {
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateFailureListener zza;
    public final /* synthetic */ zzg zzb;

    public /* synthetic */ zzs(ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener, zzg zzgVar) {
        this.zza = onConsentInfoUpdateFailureListener;
        this.zzb = zzgVar;
    }

    public final void run() {
        this.zza.onConsentInfoUpdateFailure(this.zzb.zza());
    }
}
