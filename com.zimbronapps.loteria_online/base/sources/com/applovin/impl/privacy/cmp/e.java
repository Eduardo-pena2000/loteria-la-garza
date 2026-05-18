package com.applovin.impl.privacy.cmp;

import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class e implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ a.a b;

    public /* synthetic */ e(a aVar, a.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final void onConsentFormLoadFailure(FormError formError) {
        a.a(this.a, this.b, formError);
    }
}
