package com.revenuecat.purchases.google;

import com.android.billingclient.api.InAppMessageResponseListener;
import com.android.billingclient.api.InAppMessageResult;
import com.revenuecat.purchases.google.BillingWrapper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class j implements InAppMessageResponseListener {
    public final /* synthetic */ Qa.a a;

    public /* synthetic */ j(Qa.a aVar) {
        this.a = aVar;
    }

    public final void onInAppMessageResponse(InAppMessageResult inAppMessageResult) {
        BillingWrapper.2.2.a(this.a, inAppMessageResult);
    }
}
