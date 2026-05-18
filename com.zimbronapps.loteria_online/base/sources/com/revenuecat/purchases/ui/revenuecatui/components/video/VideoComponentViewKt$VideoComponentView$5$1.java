package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Qa.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatioKt;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public /* synthetic */ class VideoComponentViewKt$VideoComponentView$5$1 extends q implements p {
    public static final VideoComponentViewKt$VideoComponentView$5$1 INSTANCE = new VideoComponentViewKt$VideoComponentView$5$1();

    public VideoComponentViewKt$VideoComponentView$5$1() {
        super(2, AspectRatioKt.class, "aspectRatio", "aspectRatio(Landroidx/compose/ui/Modifier;Lcom/revenuecat/purchases/ui/revenuecatui/components/modifier/AspectRatio;)Landroidx/compose/ui/Modifier;", 1);
    }

    public final e invoke(e p0, AspectRatio p1) {
        t.g(p0, "p0");
        t.g(p1, "p1");
        return AspectRatioKt.aspectRatio(p0, p1);
    }
}
