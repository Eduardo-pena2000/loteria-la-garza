package com.revenuecat.purchases.paywalls.components;

import Qa.l;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ActionDeserializer extends EnumDeserializerWithDefault {
    public static final ActionDeserializer INSTANCE = new ActionDeserializer();

    private ActionDeserializer() {
        super(PurchaseButtonComponent.Action.IN_APP_CHECKOUT, (l) null, 2, (k) null);
    }
}
