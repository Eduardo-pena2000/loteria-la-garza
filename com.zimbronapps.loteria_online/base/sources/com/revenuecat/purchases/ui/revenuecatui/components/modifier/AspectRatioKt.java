package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.e;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class AspectRatioKt {
    public static final /* synthetic */ e aspectRatio(e eVar, AspectRatio aspectRatio) {
        t.g(eVar, "<this>");
        t.g(aspectRatio, "aspectRatio");
        return eVar.then(b.a(e.a, aspectRatio.getRatio(), aspectRatio.getMatchHeightConstraintsFirst()));
    }
}
