package com.revenuecat.purchases.paywalls.components;

import Qa.l;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CarouselPageControlPositionDeserializer extends EnumDeserializerWithDefault {
    public static final CarouselPageControlPositionDeserializer INSTANCE = new CarouselPageControlPositionDeserializer();

    private CarouselPageControlPositionDeserializer() {
        super(CarouselComponent.PageControl.Position.BOTTOM, (l) null, 2, (k) null);
    }
}
