package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import F.L;
import androidx.compose.foundation.layout.f;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class PaddingKt {
    public static final /* synthetic */ L toPaddingValues(Padding padding) {
        t.g(padding, "<this>");
        return f.d(h.g((float) padding.getLeading()), h.g((float) padding.getTop()), h.g((float) padding.getTrailing()), h.g((float) padding.getBottom()));
    }
}
