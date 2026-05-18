package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import Ca.A;
import Ca.K;
import Ca.o;
import F.L;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaddingValuesKt;
import kotlin.jvm.internal.k;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class SizeKt {
    public static final /* synthetic */ Size addMargin(Size size, L margin, t layoutDirection) {
        kotlin.jvm.internal.t.g(size, "<this>");
        kotlin.jvm.internal.t.g(margin, "margin");
        kotlin.jvm.internal.t.g(layoutDirection, "layoutDirection");
        return new Size(addMargin-Qn1smSk(size.getWidth(), K.a(PaddingValuesKt.calculateHorizontalPadding(margin, layoutDirection))), addMargin-Qn1smSk(size.getHeight(), K.a(PaddingValuesKt.calculateVerticalPadding(margin))));
    }

    private static final SizeConstraint addMargin-Qn1smSk(SizeConstraint sizeConstraint, int i) {
        if (sizeConstraint instanceof SizeConstraint.Fixed) {
            return new SizeConstraint.Fixed(A.b(((SizeConstraint.Fixed) sizeConstraint).getValue-pVg5ArA() + i), (k) null);
        }
        if (sizeConstraint instanceof SizeConstraint.Fill ? true : sizeConstraint instanceof SizeConstraint.Fit) {
            return sizeConstraint;
        }
        throw new o();
    }
}
