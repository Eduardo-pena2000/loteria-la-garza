package com.revenuecat.purchases.ui.revenuecatui.components.style;

import Qa.l;
import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StyleFactory$createTabsComponentStyle$1$5 extends u implements l {
    final /* synthetic */ StyleFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleFactory$createTabsComponentStyle$1$5(StyleFactory styleFactory) {
        super(1);
        this.this$0 = styleFactory;
    }

    public final Result invoke(PartialTabsComponent partial) {
        t.g(partial, "partial");
        return PresentedTabsPartial.Companion.invoke(partial, StyleFactory.access$getColorAliases$p(this.this$0));
    }
}
