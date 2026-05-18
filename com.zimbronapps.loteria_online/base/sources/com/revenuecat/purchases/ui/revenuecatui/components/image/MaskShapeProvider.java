package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Ya.h;
import Ya.o;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import m1.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class MaskShapeProvider implements a {
    private final h values = o.m(new MaskShape.Rectangle(new CornerRadiuses.Dp(30.0d, 50.0d, 20.0d, 40.0d)), MaskShape.Concave.INSTANCE, MaskShape.Convex.INSTANCE, MaskShape.Circle.INSTANCE);

    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public h getValues() {
        return this.values;
    }
}
