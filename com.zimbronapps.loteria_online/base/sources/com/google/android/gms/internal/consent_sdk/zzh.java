package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzh implements ConsentInformation.OnConsentInfoUpdateSuccessListener {
    public final /* synthetic */ zzj zza;

    public /* synthetic */ zzh(zzj zzjVar) {
        this.zza = zzjVar;
    }

    public final void onConsentInfoUpdateSuccess() {
        this.zza.zzb(false);
    }
}
