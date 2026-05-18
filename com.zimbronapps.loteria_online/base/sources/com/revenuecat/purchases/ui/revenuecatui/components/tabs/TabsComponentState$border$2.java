package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabsComponentState$border$2 extends u implements a {
    final /* synthetic */ TabsComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsComponentState$border$2(TabsComponentState tabsComponentState) {
        super(0);
        this.this$0 = tabsComponentState;
    }

    public final BorderStyles invoke() {
        BorderStyles borderStyles;
        PresentedTabsPartial access$getPresentedPartial = TabsComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (borderStyles = access$getPresentedPartial.getBorderStyles()) == null) ? TabsComponentState.access$getStyle$p(this.this$0).getBorder() : borderStyles;
    }
}
