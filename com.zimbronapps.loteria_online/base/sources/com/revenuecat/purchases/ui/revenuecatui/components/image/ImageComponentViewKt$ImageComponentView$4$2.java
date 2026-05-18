package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Qa.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentViewKt$ImageComponentView$4$2 extends u implements p {
    public static final ImageComponentViewKt$ImageComponentView$4$2 INSTANCE = new ImageComponentViewKt$ImageComponentView$4$2();

    public ImageComponentViewKt$ImageComponentView$4$2() {
        super(2);
    }

    public final e invoke(e applyIfNotNull, ColorStyle it) {
        t.g(applyIfNotNull, "$this$applyIfNotNull");
        t.g(it, "it");
        return OverlayKt.overlay$default(applyIfNotNull, it, null, 2, null);
    }
}
