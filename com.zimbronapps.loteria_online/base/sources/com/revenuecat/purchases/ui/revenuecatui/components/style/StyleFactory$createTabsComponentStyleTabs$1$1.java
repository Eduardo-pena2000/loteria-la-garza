package com.revenuecat.purchases.ui.revenuecatui.components.style;

import Qa.p;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StyleFactory$createTabsComponentStyleTabs$1$1 extends u implements p {
    final /* synthetic */ TabControlStyle $control;
    final /* synthetic */ StyleFactory.StyleFactoryScope $this_createTabsComponentStyleTabs;
    final /* synthetic */ StyleFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleFactory$createTabsComponentStyleTabs$1$1(StyleFactory styleFactory, StyleFactory.StyleFactoryScope styleFactoryScope, TabControlStyle tabControlStyle) {
        super(2);
        this.this$0 = styleFactory;
        this.$this_createTabsComponentStyleTabs = styleFactoryScope;
        this.$control = tabControlStyle;
    }

    public final Result invoke(int i, TabsComponent.Tab tab) {
        t.g(tab, "tab");
        return StyleFactory.access$createTabsComponentStyleTab(this.this$0, this.$this_createTabsComponentStyleTabs, tab, this.$control, i);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (TabsComponent.Tab) obj2);
    }
}
