package com.applovin.impl.privacy.cmp;

import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.UserMessagingPlatform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class d implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ a.a b;

    public /* synthetic */ d(a aVar, a.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        a.e(this.a, this.b, consentForm);
    }
}
