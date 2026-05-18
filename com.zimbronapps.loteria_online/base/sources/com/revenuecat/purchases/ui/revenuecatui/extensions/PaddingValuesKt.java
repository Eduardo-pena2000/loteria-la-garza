package com.revenuecat.purchases.ui.revenuecatui.extensions;

import F.L;
import androidx.compose.foundation.layout.f;
import n1.h;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class PaddingValuesKt {
    public static final /* synthetic */ float calculateHorizontalPadding(L l, t layoutDirection) {
        kotlin.jvm.internal.t.g(l, "<this>");
        kotlin.jvm.internal.t.g(layoutDirection, "layoutDirection");
        return h.g(f.g(l, layoutDirection) + f.f(l, layoutDirection));
    }

    public static final /* synthetic */ float calculateVerticalPadding(L l) {
        kotlin.jvm.internal.t.g(l, "<this>");
        return h.g(l.d() + l.a());
    }
}
