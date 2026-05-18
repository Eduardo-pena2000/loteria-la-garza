package com.revenuecat.purchases.subscriberattributes.caching;

import Qa.a;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriberAttributesCache$subscriberAttributesCacheKey$2 extends u implements a {
    final /* synthetic */ SubscriberAttributesCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscriberAttributesCache$subscriberAttributesCacheKey$2(SubscriberAttributesCache subscriberAttributesCache) {
        super(0);
        this.this$0 = subscriberAttributesCache;
    }

    public final String invoke() {
        return this.this$0.getDeviceCache$purchases_defaultsBc8Release().newKey$purchases_defaultsBc8Release("subscriberAttributes");
    }
}
