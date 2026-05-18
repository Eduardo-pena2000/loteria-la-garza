package com.revenuecat.purchases.common.caching;

import Qa.a;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DeviceCache$legacyAppUserIDCacheKey$2 extends u implements a {
    final /* synthetic */ DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceCache$legacyAppUserIDCacheKey$2(DeviceCache deviceCache) {
        super(0);
        this.this$0 = deviceCache;
    }

    public final String invoke() {
        return DeviceCache.access$getApiKeyPrefix(this.this$0);
    }
}
