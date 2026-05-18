package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.utils.serializers.EmptyObjectToNullSerializer;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ProductChangeConfigSerializer extends EmptyObjectToNullSerializer {
    public static final ProductChangeConfigSerializer INSTANCE = new ProductChangeConfigSerializer();

    private ProductChangeConfigSerializer() {
        super(ProductChangeConfig.Companion.serializer(), false, 2, (k) null);
    }
}
