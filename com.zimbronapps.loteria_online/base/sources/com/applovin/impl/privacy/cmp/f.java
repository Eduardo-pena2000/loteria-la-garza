package com.applovin.impl.privacy.cmp;

import com.applovin.impl.k0;
import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class f implements UserMessagingPlatform.OnConsentFormLoadSuccessListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ a.a b;
    public final /* synthetic */ FormError c;
    public final /* synthetic */ k0 d;

    public /* synthetic */ f(a aVar, a.a aVar2, FormError formError, k0 k0Var) {
        this.a = aVar;
        this.b = aVar2;
        this.c = formError;
        this.d = k0Var;
    }

    public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
        a.g(this.a, this.b, this.c, this.d, consentForm);
    }
}
