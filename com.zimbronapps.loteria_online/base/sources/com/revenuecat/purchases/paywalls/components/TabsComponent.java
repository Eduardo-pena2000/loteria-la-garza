package com.revenuecat.purchases.paywalls.components;

import Da.v;
import Xa.c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import ob.h;
import rb.d;
import sb.e;
import sb.f0;
import sb.t0;
import sb.x0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TabsComponent implements PaywallComponent {
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final TabControl control;
    private final String defaultTabId;
    private final Padding margin;
    private final List overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final List tabs;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, new h("com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl", P.b(TabControl.class), new c[]{P.b(TabControl.Buttons.class), P.b(TabControl.Toggle.class)}, new b[]{TabsComponent$TabControl$Buttons$$serializer.INSTANCE, TabsComponent$TabControl$Toggle$$serializer.INSTANCE}, new Annotation[0]), new e(TabsComponent$Tab$$serializer.INSTANCE), null, new e(ComponentOverride.Companion.serializer(PartialTabsComponent$$serializer.INSTANCE))};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return TabsComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @InternalRevenueCatAPI
    public static final class Tab {
        public static final Companion Companion = new Companion(null);
        private final String id;
        private final StackComponent stack;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return TabsComponent$Tab$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Ca.e
        public /* synthetic */ Tab(int i, String str, StackComponent stackComponent, t0 t0Var) {
            if (3 != (i & 3)) {
                f0.a(i, 3, TabsComponent$Tab$$serializer.INSTANCE.getDescriptor());
            }
            this.id = str;
            this.stack = stackComponent;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Tab tab, d dVar, qb.e eVar) {
            dVar.v(eVar, 0, tab.id);
            dVar.k(eVar, 1, StackComponent$$serializer.INSTANCE, tab.stack);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) obj;
            return t.c(this.id, tab.id) && t.c(this.stack, tab.stack);
        }

        public final /* synthetic */ String getId() {
            return this.id;
        }

        public final /* synthetic */ StackComponent getStack() {
            return this.stack;
        }

        public int hashCode() {
            return (this.id.hashCode() * 31) + this.stack.hashCode();
        }

        public String toString() {
            return "Tab(id=" + this.id + ", stack=" + this.stack + ')';
        }

        public Tab(String str, StackComponent stackComponent) {
            t.g(str, "id");
            t.g(stackComponent, "stack");
            this.id = str;
            this.stack = stackComponent;
        }
    }

    @InternalRevenueCatAPI
    public interface TabControl {
        public static final Companion Companion = Companion.$$INSTANCE;

        @InternalRevenueCatAPI
        public static final class Buttons implements TabControl {
            public static final Companion Companion = new Companion(null);
            private final StackComponent stack;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return TabsComponent$TabControl$Buttons$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Ca.e
            public /* synthetic */ Buttons(int i, StackComponent stackComponent, t0 t0Var) {
                if (1 != (i & 1)) {
                    f0.a(i, 1, TabsComponent$TabControl$Buttons$$serializer.INSTANCE.getDescriptor());
                }
                this.stack = stackComponent;
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Buttons buttons, d dVar, qb.e eVar) {
                dVar.k(eVar, 0, StackComponent$$serializer.INSTANCE, buttons.stack);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Buttons) && t.c(this.stack, ((Buttons) obj).stack);
            }

            public final /* synthetic */ StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                return this.stack.hashCode();
            }

            public String toString() {
                return "Buttons(stack=" + this.stack + ')';
            }

            public Buttons(StackComponent stackComponent) {
                t.g(stackComponent, "stack");
                this.stack = stackComponent;
            }
        }

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final b serializer() {
                return new h("com.revenuecat.purchases.paywalls.components.TabsComponent.TabControl", P.b(TabControl.class), new c[]{P.b(Buttons.class), P.b(Toggle.class)}, new b[]{TabsComponent$TabControl$Buttons$$serializer.INSTANCE, TabsComponent$TabControl$Toggle$$serializer.INSTANCE}, new Annotation[0]);
            }
        }

        @InternalRevenueCatAPI
        public static final class Toggle implements TabControl {
            public static final Companion Companion = new Companion(null);
            private final StackComponent stack;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return TabsComponent$TabControl$Toggle$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @Ca.e
            public /* synthetic */ Toggle(int i, StackComponent stackComponent, t0 t0Var) {
                if (1 != (i & 1)) {
                    f0.a(i, 1, TabsComponent$TabControl$Toggle$$serializer.INSTANCE.getDescriptor());
                }
                this.stack = stackComponent;
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Toggle toggle, d dVar, qb.e eVar) {
                dVar.k(eVar, 0, StackComponent$$serializer.INSTANCE, toggle.stack);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Toggle) && t.c(this.stack, ((Toggle) obj).stack);
            }

            public final /* synthetic */ StackComponent getStack() {
                return this.stack;
            }

            public int hashCode() {
                return this.stack.hashCode();
            }

            public String toString() {
                return "Toggle(stack=" + this.stack + ')';
            }

            public Toggle(StackComponent stackComponent) {
                t.g(stackComponent, "stack");
                this.stack = stackComponent;
            }
        }
    }

    @Ca.e
    public /* synthetic */ TabsComponent(int i, Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, TabControl tabControl, List list, String str, List list2, t0 t0Var) {
        if (1536 != (i & 1536)) {
            f0.a(i, 1536, TabsComponent$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        this.size = (i & 2) == 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size;
        this.padding = (i & 4) == 0 ? Padding.Companion.getZero() : padding;
        this.margin = (i & 8) == 0 ? Padding.Companion.getZero() : padding2;
        if ((i & 16) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i & 32) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i & 64) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i & 128) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 256) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        this.control = tabControl;
        this.tabs = list;
        if ((i & 2048) == 0) {
            this.defaultTabId = null;
        } else {
            this.defaultTabId = str;
        }
        this.overrides = (i & 4096) == 0 ? v.n() : list2;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getDefaultTabId$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(TabsComponent tabsComponent, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        if (dVar.e(eVar, 0) || tabsComponent.visible != null) {
            dVar.j(eVar, 0, sb.h.a, tabsComponent.visible);
        }
        if (dVar.e(eVar, 1) || !t.c(tabsComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.k(eVar, 1, Size$$serializer.INSTANCE, tabsComponent.size);
        }
        if (dVar.e(eVar, 2) || !t.c(tabsComponent.padding, Padding.Companion.getZero())) {
            dVar.k(eVar, 2, Padding$$serializer.INSTANCE, tabsComponent.padding);
        }
        if (dVar.e(eVar, 3) || !t.c(tabsComponent.margin, Padding.Companion.getZero())) {
            dVar.k(eVar, 3, Padding$$serializer.INSTANCE, tabsComponent.margin);
        }
        if (dVar.e(eVar, 4) || tabsComponent.backgroundColor != null) {
            dVar.j(eVar, 4, ColorScheme$$serializer.INSTANCE, tabsComponent.backgroundColor);
        }
        if (dVar.e(eVar, 5) || tabsComponent.background != null) {
            dVar.j(eVar, 5, BackgroundDeserializer.INSTANCE, tabsComponent.background);
        }
        if (dVar.e(eVar, 6) || tabsComponent.shape != null) {
            dVar.j(eVar, 6, ShapeDeserializer.INSTANCE, tabsComponent.shape);
        }
        if (dVar.e(eVar, 7) || tabsComponent.border != null) {
            dVar.j(eVar, 7, Border$$serializer.INSTANCE, tabsComponent.border);
        }
        if (dVar.e(eVar, 8) || tabsComponent.shadow != null) {
            dVar.j(eVar, 8, Shadow$$serializer.INSTANCE, tabsComponent.shadow);
        }
        dVar.k(eVar, 9, kVarArr[9], tabsComponent.control);
        dVar.k(eVar, 10, kVarArr[10], tabsComponent.tabs);
        if (dVar.e(eVar, 11) || tabsComponent.defaultTabId != null) {
            dVar.j(eVar, 11, x0.a, tabsComponent.defaultTabId);
        }
        if (!dVar.e(eVar, 12) && t.c(tabsComponent.overrides, v.n())) {
            return;
        }
        dVar.k(eVar, 12, kVarArr[12], tabsComponent.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TabsComponent)) {
            return false;
        }
        TabsComponent tabsComponent = (TabsComponent) obj;
        return t.c(this.visible, tabsComponent.visible) && t.c(this.size, tabsComponent.size) && t.c(this.padding, tabsComponent.padding) && t.c(this.margin, tabsComponent.margin) && t.c(this.backgroundColor, tabsComponent.backgroundColor) && t.c(this.background, tabsComponent.background) && t.c(this.shape, tabsComponent.shape) && t.c(this.border, tabsComponent.border) && t.c(this.shadow, tabsComponent.shadow) && t.c(this.control, tabsComponent.control) && t.c(this.tabs, tabsComponent.tabs) && t.c(this.defaultTabId, tabsComponent.defaultTabId) && t.c(this.overrides, tabsComponent.overrides);
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ TabControl getControl() {
        return this.control;
    }

    public final /* synthetic */ String getDefaultTabId() {
        return this.defaultTabId;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ List getTabs() {
        return this.tabs;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int hashCode = (((((((bool == null ? 0 : bool.hashCode()) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode2 = (hashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int hashCode3 = (hashCode2 + (background == null ? 0 : background.hashCode())) * 31;
        Shape shape = this.shape;
        int hashCode4 = (hashCode3 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int hashCode5 = (hashCode4 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int hashCode6 = (((((hashCode5 + (shadow == null ? 0 : shadow.hashCode())) * 31) + this.control.hashCode()) * 31) + this.tabs.hashCode()) * 31;
        String str = this.defaultTabId;
        return ((hashCode6 + (str != null ? str.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "TabsComponent(visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", control=" + this.control + ", tabs=" + this.tabs + ", defaultTabId=" + this.defaultTabId + ", overrides=" + this.overrides + ')';
    }

    public TabsComponent(Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, TabControl tabControl, List list, String str, List list2) {
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(padding2, "margin");
        t.g(tabControl, "control");
        t.g(list, "tabs");
        t.g(list2, "overrides");
        this.visible = bool;
        this.size = size;
        this.padding = padding;
        this.margin = padding2;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.control = tabControl;
        this.tabs = list;
        this.defaultTabId = str;
        this.overrides = list2;
    }

    public /* synthetic */ TabsComponent(Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, TabControl tabControl, List list, String str, List list2, int i, k kVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i & 4) != 0 ? Padding.Companion.getZero() : padding, (i & 8) != 0 ? Padding.Companion.getZero() : padding2, (i & 16) != 0 ? null : colorScheme, (i & 32) != 0 ? null : background, (i & 64) != 0 ? null : shape, (i & 128) != 0 ? null : border, (i & 256) != 0 ? null : shadow, tabControl, list, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? v.n() : list2);
    }
}
