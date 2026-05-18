package com.revenuecat.purchases.paywalls.components;

import Qa.l;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CarouselTransitionTypeDeserializer extends EnumDeserializerWithDefault {
    public static final CarouselTransitionTypeDeserializer INSTANCE = new CarouselTransitionTypeDeserializer();

    private CarouselTransitionTypeDeserializer() {
        super(CarouselComponent.AutoAdvancePages.TransitionType.SLIDE, (l) null, 2, (k) null);
    }
}
