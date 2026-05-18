package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzv implements Runnable {
    public final /* synthetic */ zzw zza;
    public final /* synthetic */ Activity zzb;
    public final /* synthetic */ ConsentRequestParameters zzc;
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateSuccessListener zzd;
    public final /* synthetic */ ConsentInformation.OnConsentInfoUpdateFailureListener zze;

    public /* synthetic */ zzv(zzw zzwVar, Activity activity, ConsentRequestParameters consentRequestParameters, ConsentInformation.OnConsentInfoUpdateSuccessListener onConsentInfoUpdateSuccessListener, ConsentInformation.OnConsentInfoUpdateFailureListener onConsentInfoUpdateFailureListener) {
        this.zza = zzwVar;
        this.zzb = activity;
        this.zzc = consentRequestParameters;
        this.zzd = onConsentInfoUpdateSuccessListener;
        this.zze = onConsentInfoUpdateFailureListener;
    }

    public final void run() {
        zzw.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
