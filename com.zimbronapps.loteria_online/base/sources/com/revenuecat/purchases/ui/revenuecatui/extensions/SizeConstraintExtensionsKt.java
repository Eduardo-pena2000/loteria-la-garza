package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Ca.o;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class SizeConstraintExtensionsKt {
    public static final /* synthetic */ h dpOrNull(SizeConstraint sizeConstraint) {
        t.g(sizeConstraint, "<this>");
        if (sizeConstraint instanceof SizeConstraint.Fixed) {
            return h.d(h.g(((SizeConstraint.Fixed) sizeConstraint).getValue-pVg5ArA()));
        }
        if ((sizeConstraint instanceof SizeConstraint.Fill) || (sizeConstraint instanceof SizeConstraint.Fit)) {
            return null;
        }
        throw new o();
    }
}
