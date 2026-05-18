package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzi implements ConsentInformation.OnConsentInfoUpdateFailureListener {
    public final /* synthetic */ zzj zza;

    public /* synthetic */ zzi(zzj zzjVar) {
        this.zza = zzjVar;
    }

    public final void onConsentInfoUpdateFailure(FormError formError) {
        this.zza.zzb(false);
    }
}
