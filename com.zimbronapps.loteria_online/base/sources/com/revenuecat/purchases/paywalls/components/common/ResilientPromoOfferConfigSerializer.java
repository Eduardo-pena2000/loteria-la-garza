package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.utils.serializers.EmptyObjectToNullSerializer;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ResilientPromoOfferConfigSerializer extends EmptyObjectToNullSerializer {
    public static final ResilientPromoOfferConfigSerializer INSTANCE = new ResilientPromoOfferConfigSerializer();

    private ResilientPromoOfferConfigSerializer() {
        super(PromoOfferConfig.Companion.serializer(), false, 2, (k) null);
    }
}
