package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.paywalls.components.properties.Size;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabControlButtonComponentStyle implements ComponentStyle {
    public static final int $stable = 0;
    private final Size size;
    private final StackComponentStyle stack;
    private final int tabIndex;
    private final boolean visible;

    public TabControlButtonComponentStyle(int i, StackComponentStyle stack) {
        t.g(stack, "stack");
        this.tabIndex = i;
        this.stack = stack;
        this.visible = stack.getVisible();
        this.size = stack.getSize();
    }

    public static /* synthetic */ TabControlButtonComponentStyle copy$default(TabControlButtonComponentStyle tabControlButtonComponentStyle, int i, StackComponentStyle stackComponentStyle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = tabControlButtonComponentStyle.tabIndex;
        }
        if ((i2 & 2) != 0) {
            stackComponentStyle = tabControlButtonComponentStyle.stack;
        }
        return tabControlButtonComponentStyle.copy(i, stackComponentStyle);
    }

    public final int component1() {
        return this.tabIndex;
    }

    public final StackComponentStyle component2() {
        return this.stack;
    }

    public final TabControlButtonComponentStyle copy(int i, StackComponentStyle stack) {
        t.g(stack, "stack");
        return new TabControlButtonComponentStyle(i, stack);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabControlButtonComponentStyle)) {
            return false;
        }
        TabControlButtonComponentStyle tabControlButtonComponentStyle = (TabControlButtonComponentStyle) obj;
        return this.tabIndex == tabControlButtonComponentStyle.tabIndex && t.c(this.stack, tabControlButtonComponentStyle.stack);
    }

    public Size getSize() {
        return this.size;
    }

    public final /* synthetic */ StackComponentStyle getStack() {
        return this.stack;
    }

    public final /* synthetic */ int getTabIndex() {
        return this.tabIndex;
    }

    public boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return (Integer.hashCode(this.tabIndex) * 31) + this.stack.hashCode();
    }

    public String toString() {
        return "TabControlButtonComponentStyle(tabIndex=" + this.tabIndex + ", stack=" + this.stack + ')';
    }
}
