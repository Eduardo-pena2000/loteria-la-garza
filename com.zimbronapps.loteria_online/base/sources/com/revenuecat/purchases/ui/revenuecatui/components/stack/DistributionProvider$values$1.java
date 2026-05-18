package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.l;
import Ya.h;
import Ya.o;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DistributionProvider$values$1 extends u implements l {
    public static final DistributionProvider$values$1 INSTANCE = new DistributionProvider$values$1();

    public DistributionProvider$values$1() {
        super(1);
    }

    public final h invoke(FlexDistribution distribution) {
        t.g(distribution, "distribution");
        return o.m(new Dimension.Horizontal(VerticalAlignment.CENTER, distribution), new Dimension.Vertical(HorizontalAlignment.CENTER, distribution));
    }
}
