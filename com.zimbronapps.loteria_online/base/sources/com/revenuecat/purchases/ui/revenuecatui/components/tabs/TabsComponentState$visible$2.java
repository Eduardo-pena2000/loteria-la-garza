package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabsComponentState$visible$2 extends u implements a {
    final /* synthetic */ TabsComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsComponentState$visible$2(TabsComponentState tabsComponentState) {
        super(0);
        this.this$0 = tabsComponentState;
    }

    public final Boolean invoke() {
        PartialTabsComponent partial;
        Boolean visible;
        PresentedTabsPartial access$getPresentedPartial = TabsComponentState.access$getPresentedPartial(this.this$0);
        return Boolean.valueOf((access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (visible = partial.getVisible()) == null) ? TabsComponentState.access$getStyle$p(this.this$0).getVisible() : visible.booleanValue());
    }
}
