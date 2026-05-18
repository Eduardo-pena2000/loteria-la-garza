package com.revenuecat.purchases;

import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StoreSerializer extends EnumDeserializerWithDefault {
    public static final StoreSerializer INSTANCE = new StoreSerializer();

    public static final class 1 extends u implements Qa.l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final String invoke(Store store) {
            t.g(store, "value");
            return store.getStringValue$purchases_defaultsBc8Release();
        }
    }

    private StoreSerializer() {
        super(Store.UNKNOWN_STORE, 1.INSTANCE);
    }
}
