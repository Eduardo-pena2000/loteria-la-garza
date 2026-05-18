package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzu implements Runnable {
    public final /* synthetic */ zzw zza;
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener zzb;
    public final /* synthetic */ zzab zzc;

    public /* synthetic */ zzu(zzw zzwVar, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, zzab zzabVar) {
        this.zza = zzwVar;
        this.zzb = onConsentInfoUpdateSuccessListener;
        this.zzc = zzabVar;
    }

    public final void run() {
        zzw.zzb(this.zza, this.zzb, this.zzc);
    }
}
