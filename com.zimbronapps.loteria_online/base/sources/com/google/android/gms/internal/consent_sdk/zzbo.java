package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbo implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {
    public final /* synthetic */ Activity zza;
    public final /* synthetic */ ConsentForm.OnConsentFormDismissedListener zzb;

    public /* synthetic */ zzbo(Activity activity, ConsentForm.OnConsentFormDismissedListener onConsentFormDismissedListener) {
        this.zza = activity;
        this.zzb = onConsentFormDismissedListener;
    }

    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        consentForm.show(this.zza, this.zzb);
    }
}
