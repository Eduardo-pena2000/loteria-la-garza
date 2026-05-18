package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbi implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
    public final void onConsentFormLoadFailure(FormError formError) {
        Log.e("UserMessagingPlatform", "Failed to load and cache a form, error=".concat(String.valueOf(formError.getMessage())));
    }
}
