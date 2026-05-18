package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Ca.I;
import Qa.p;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import kotlin.jvm.internal.u;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$TextComponentViewKt$lambda-1$1 extends u implements p {
    public static final ComposableSingletons$TextComponentViewKt$lambda-1$1 INSTANCE = new ComposableSingletons$TextComponentViewKt$lambda-1$1();

    public ComposableSingletons$TextComponentViewKt$lambda-1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((m) obj, ((Number) obj2).intValue());
        return I.a;
    }

    public final void invoke(m mVar, int i) {
        if ((i & 3) == 2 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(765510784, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.ComposableSingletons$TextComponentViewKt.lambda-1.<anonymous> (TextComponentView.kt:179)");
        }
        TextComponentViewKt.TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Experience Pro today!", new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null), 34, FontWeight.EXTRA_BOLD, null, null, null, null, false, null, null, null, null, null, null, null, 65520, null), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
        if (w.L()) {
            w.T();
        }
    }
}
