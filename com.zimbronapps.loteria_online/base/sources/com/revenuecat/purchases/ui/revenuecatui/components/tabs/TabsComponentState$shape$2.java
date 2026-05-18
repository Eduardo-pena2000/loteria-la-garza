package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import kotlin.jvm.internal.u;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabsComponentState$shape$2 extends u implements a {
    final /* synthetic */ TabsComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsComponentState$shape$2(TabsComponentState tabsComponentState) {
        super(0);
        this.this$0 = tabsComponentState;
    }

    public final E1 invoke() {
        Shape shape;
        PartialTabsComponent partial;
        PresentedTabsPartial access$getPresentedPartial = TabsComponentState.access$getPresentedPartial(this.this$0);
        if (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (shape = partial.getShape()) == null) {
            shape = TabsComponentState.access$getStyle$p(this.this$0).getShape();
        }
        return ShapeKt.toShape(shape);
    }
}
