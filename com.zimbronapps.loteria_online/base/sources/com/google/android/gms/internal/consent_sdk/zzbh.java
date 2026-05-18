package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbh implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {
    public final /* synthetic */ AtomicReference zza;

    public /* synthetic */ zzbh(AtomicReference atomicReference) {
        this.zza = atomicReference;
    }

    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        this.zza.set(consentForm);
    }
}
