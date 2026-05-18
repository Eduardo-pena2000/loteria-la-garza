package com.revenuecat.purchases.ui.revenuecatui.components.style;

import F.L;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabsComponentStyle implements ComponentStyle {
    public static final int $stable = 0;
    private final BackgroundStyles background;
    private final BorderStyles border;
    private final TabControlStyle control;
    private final L margin;
    private final List overrides;
    private final L padding;
    private final ShadowStyles shadow;
    private final Shape shape;
    private final Size size;
    private final NonEmptyList tabs;
    private final boolean visible;

    public static final class Tab {
        public static final int $stable = 0;
        private final StackComponentStyle stack;

        public Tab(StackComponentStyle stack) {
            t.g(stack, "stack");
            this.stack = stack;
        }

        public static /* synthetic */ Tab copy$default(Tab tab, StackComponentStyle stackComponentStyle, int i, Object obj) {
            if ((i & 1) != 0) {
                stackComponentStyle = tab.stack;
            }
            return tab.copy(stackComponentStyle);
        }

        public final StackComponentStyle component1() {
            return this.stack;
        }

        public final Tab copy(StackComponentStyle stack) {
            t.g(stack, "stack");
            return new Tab(stack);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Tab) && t.c(this.stack, ((Tab) obj).stack);
        }

        public final /* synthetic */ StackComponentStyle getStack() {
            return this.stack;
        }

        public int hashCode() {
            return this.stack.hashCode();
        }

        public String toString() {
            return "Tab(stack=" + this.stack + ')';
        }
    }

    public TabsComponentStyle(boolean z, Size size, L padding, L margin, BackgroundStyles backgroundStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, TabControlStyle control, NonEmptyList tabs, List overrides) {
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(shape, "shape");
        t.g(control, "control");
        t.g(tabs, "tabs");
        t.g(overrides, "overrides");
        this.visible = z;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.background = backgroundStyles;
        this.shape = shape;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.control = control;
        this.tabs = tabs;
        this.overrides = overrides;
    }

    public static /* synthetic */ TabsComponentStyle copy$default(TabsComponentStyle tabsComponentStyle, boolean z, Size size, L l, L l2, BackgroundStyles backgroundStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, TabControlStyle tabControlStyle, NonEmptyList nonEmptyList, List list, int i, Object obj) {
        return tabsComponentStyle.copy((i & 1) != 0 ? tabsComponentStyle.visible : z, (i & 2) != 0 ? tabsComponentStyle.size : size, (i & 4) != 0 ? tabsComponentStyle.padding : l, (i & 8) != 0 ? tabsComponentStyle.margin : l2, (i & 16) != 0 ? tabsComponentStyle.background : backgroundStyles, (i & 32) != 0 ? tabsComponentStyle.shape : shape, (i & 64) != 0 ? tabsComponentStyle.border : borderStyles, (i & 128) != 0 ? tabsComponentStyle.shadow : shadowStyles, (i & 256) != 0 ? tabsComponentStyle.control : tabControlStyle, (i & 512) != 0 ? tabsComponentStyle.tabs : nonEmptyList, (i & 1024) != 0 ? tabsComponentStyle.overrides : list);
    }

    public final boolean component1() {
        return this.visible;
    }

    public final NonEmptyList component10() {
        return this.tabs;
    }

    public final List component11() {
        return this.overrides;
    }

    public final Size component2() {
        return this.size;
    }

    public final L component3() {
        return this.padding;
    }

    public final L component4() {
        return this.margin;
    }

    public final BackgroundStyles component5() {
        return this.background;
    }

    public final Shape component6() {
        return this.shape;
    }

    public final BorderStyles component7() {
        return this.border;
    }

    public final ShadowStyles component8() {
        return this.shadow;
    }

    public final TabControlStyle component9() {
        return this.control;
    }

    public final TabsComponentStyle copy(boolean z, Size size, L padding, L margin, BackgroundStyles backgroundStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, TabControlStyle control, NonEmptyList tabs, List overrides) {
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(shape, "shape");
        t.g(control, "control");
        t.g(tabs, "tabs");
        t.g(overrides, "overrides");
        return new TabsComponentStyle(z, size, padding, margin, backgroundStyles, shape, borderStyles, shadowStyles, control, tabs, overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabsComponentStyle)) {
            return false;
        }
        TabsComponentStyle tabsComponentStyle = (TabsComponentStyle) obj;
        return this.visible == tabsComponentStyle.visible && t.c(this.size, tabsComponentStyle.size) && t.c(this.padding, tabsComponentStyle.padding) && t.c(this.margin, tabsComponentStyle.margin) && t.c(this.background, tabsComponentStyle.background) && t.c(this.shape, tabsComponentStyle.shape) && t.c(this.border, tabsComponentStyle.border) && t.c(this.shadow, tabsComponentStyle.shadow) && t.c(this.control, tabsComponentStyle.control) && t.c(this.tabs, tabsComponentStyle.tabs) && t.c(this.overrides, tabsComponentStyle.overrides);
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return this.background;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ TabControlStyle getControl() {
        return this.control;
    }

    public final /* synthetic */ L getMargin() {
        return this.margin;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ L getPadding() {
        return this.padding;
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ NonEmptyList getTabs() {
        return this.tabs;
    }

    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((((((Boolean.hashCode(this.visible) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        BackgroundStyles backgroundStyles = this.background;
        int hashCode2 = (((hashCode + (backgroundStyles == null ? 0 : backgroundStyles.hashCode())) * 31) + this.shape.hashCode()) * 31;
        BorderStyles borderStyles = this.border;
        int hashCode3 = (hashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        return ((((((hashCode3 + (shadowStyles != null ? shadowStyles.hashCode() : 0)) * 31) + this.control.hashCode()) * 31) + this.tabs.hashCode()) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "TabsComponentStyle(visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", background=" + this.background + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", control=" + this.control + ", tabs=" + this.tabs + ", overrides=" + this.overrides + ')';
    }
}
