package com.revenuecat.purchases.amazon;

import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonCache$amazonPostedTokensKey$2 extends u implements Qa.a {
    final /* synthetic */ AmazonCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmazonCache$amazonPostedTokensKey$2(AmazonCache amazonCache) {
        super(0);
        this.this$0 = amazonCache;
    }

    public final String invoke() {
        return AmazonCache.access$getDeviceCache$p(this.this$0).newKey$purchases_defaultsBc8Release("amazon.tokens");
    }
}
