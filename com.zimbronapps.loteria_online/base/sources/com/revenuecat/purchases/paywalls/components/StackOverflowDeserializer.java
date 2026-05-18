package com.revenuecat.purchases.paywalls.components;

import Qa.l;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StackOverflowDeserializer extends EnumDeserializerWithDefault {
    public static final StackOverflowDeserializer INSTANCE = new StackOverflowDeserializer();

    private StackOverflowDeserializer() {
        super(StackComponent.Overflow.NONE, (l) null, 2, (k) null);
    }
}
