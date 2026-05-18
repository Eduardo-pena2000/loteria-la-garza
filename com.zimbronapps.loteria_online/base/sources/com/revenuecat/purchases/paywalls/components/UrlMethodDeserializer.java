package com.revenuecat.purchases.paywalls.components;

import Qa.l;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class UrlMethodDeserializer extends EnumDeserializerWithDefault {
    public static final UrlMethodDeserializer INSTANCE = new UrlMethodDeserializer();

    private UrlMethodDeserializer() {
        super(ButtonComponent.UrlMethod.UNKNOWN, (l) null, 2, (k) null);
    }
}
