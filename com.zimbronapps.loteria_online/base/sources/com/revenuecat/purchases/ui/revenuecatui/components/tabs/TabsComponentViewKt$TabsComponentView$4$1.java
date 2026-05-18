package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Qa.p;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabsComponentViewKt$TabsComponentView$4$1 extends u implements p {
    final /* synthetic */ TabsComponentState $tabsState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsComponentViewKt$TabsComponentView$4$1(TabsComponentState tabsComponentState) {
        super(2);
        this.$tabsState = tabsComponentState;
    }

    public final e invoke(e applyIfNotNull, BorderStyle it) {
        t.g(applyIfNotNull, "$this$applyIfNotNull");
        t.g(it, "it");
        return f.i(BorderKt.border(applyIfNotNull, it, this.$tabsState.getShape()), it.getWidth-D9Ej5fM());
    }
}
