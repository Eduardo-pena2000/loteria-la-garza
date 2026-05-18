package com.applovin.impl.privacy.cmp;

import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class c implements ConsentInformation.OnConsentInfoUpdateFailureListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ a.a b;

    public /* synthetic */ c(a aVar, a.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final void onConsentInfoUpdateFailure(FormError formError) {
        a.h(this.a, this.b, formError);
    }
}
