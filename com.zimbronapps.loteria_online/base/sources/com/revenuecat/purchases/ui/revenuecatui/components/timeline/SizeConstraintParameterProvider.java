package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ya.h;
import Ya.o;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import kotlin.jvm.internal.k;
import m1.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class SizeConstraintParameterProvider implements a {
    private final h values = o.m(SizeConstraint.Fit.INSTANCE, SizeConstraint.Fill.INSTANCE, new SizeConstraint.Fixed(100, (k) null));

    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public h getValues() {
        return this.values;
    }
}
