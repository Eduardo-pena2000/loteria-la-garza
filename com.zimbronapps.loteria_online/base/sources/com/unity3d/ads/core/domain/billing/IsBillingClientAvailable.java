package com.unity3d.ads.core.domain.billing;

import Ca.s;
import Ca.t;
import com.android.billingclient.api.BillingClient;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IsBillingClientAvailable {
    public final boolean invoke() {
        Object b;
        try {
            b = s.b(BillingClient.class);
        } catch (Throwable th) {
            s.a aVar = s.b;
            b = s.b(t.a(th));
        }
        return s.h(b);
    }
}
