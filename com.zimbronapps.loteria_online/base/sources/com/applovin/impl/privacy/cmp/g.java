package com.applovin.impl.privacy.cmp;

import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class g implements UserMessagingPlatform.OnConsentFormLoadFailureListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ a.a b;
    public final /* synthetic */ FormError c;

    public /* synthetic */ g(a aVar, a.a aVar2, FormError formError) {
        this.a = aVar;
        this.b = aVar2;
        this.c = formError;
    }

    public final void onConsentFormLoadFailure(FormError formError) {
        a.c(this.a, this.b, this.c, formError);
    }
}
