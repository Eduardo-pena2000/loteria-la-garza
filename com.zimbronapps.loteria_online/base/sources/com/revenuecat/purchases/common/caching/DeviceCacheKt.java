package com.revenuecat.purchases.common.caching;

import ab.b;
import ab.d;
import ab.e;
import kotlin.jvm.internal.U;
import ob.b;
import pb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DeviceCacheKt {
    public static final int CUSTOMER_INFO_SCHEMA_VERSION = 3;
    private static final long PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD;
    private static final String SHARED_PREFERENCES_PREFIX = "com.revenuecat.purchases.";
    private static final b tokenMapSerializer;

    static {
        b.a aVar = ab.b.b;
        PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD = d.s(25, e.g);
        tokenMapSerializer = a.i(a.F(U.a), TokenCacheEntry.Companion.serializer());
    }

    public static final /* synthetic */ long access$getPRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD$p() {
        return PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD;
    }

    public static final /* synthetic */ ob.b access$getTokenMapSerializer$p() {
        return tokenMapSerializer;
    }
}
