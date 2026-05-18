package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Qa.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class VideoComponentViewKt$VideoComponentView$5$2 extends kotlin.jvm.internal.a implements p {
    public static final VideoComponentViewKt$VideoComponentView$5$2 INSTANCE = new VideoComponentViewKt$VideoComponentView$5$2();

    public VideoComponentViewKt$VideoComponentView$5$2() {
        super(2, OverlayKt.class, "overlay", "overlay(Landroidx/compose/ui/Modifier;Lcom/revenuecat/purchases/ui/revenuecatui/components/properties/ColorStyle;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", 1);
    }

    public final e invoke(e p0, ColorStyle p1) {
        t.g(p0, "p0");
        t.g(p1, "p1");
        return OverlayKt.overlay$default(p0, p1, null, 2, null);
    }
}
