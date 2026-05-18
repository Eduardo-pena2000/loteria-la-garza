package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbm implements Runnable {
    public final /* synthetic */ ConsentForm.OnConsentFormDismissedListener zza;

    public /* synthetic */ zzbm(ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        this.zza = onConsentFormDismissedListener;
    }

    public final void run() {
        this.zza.onConsentFormDismissed(new zzg(3, "Privacy options form is being loading. Please try again later.").zza());
    }
}
