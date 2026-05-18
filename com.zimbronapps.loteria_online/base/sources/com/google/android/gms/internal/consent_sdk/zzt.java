package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzt implements Runnable {
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener zza;

    public /* synthetic */ zzt(ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener) {
        this.zza = onConsentInfoUpdateSuccessListener;
    }

    public final void run() {
        this.zza.onConsentInfoUpdateSuccess();
    }
}
