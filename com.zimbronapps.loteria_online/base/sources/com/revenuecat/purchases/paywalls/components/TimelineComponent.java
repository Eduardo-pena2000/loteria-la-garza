package com.revenuecat.purchases.paywalls.components;

import Da.v;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.e;
import sb.f0;
import sb.h;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TimelineComponent implements PaywallComponent {
    private final int columnGutter;
    private final IconAlignment iconAlignment;
    private final int itemSpacing;
    private final List items;
    private final Padding margin;
    private final List overrides;
    private final Padding padding;
    private final Size size;
    private final int textSpacing;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, new e(TimelineComponent$Item$$serializer.INSTANCE), new e(ComponentOverride.Companion.serializer(PartialTimelineComponent$$serializer.INSTANCE))};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return TimelineComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public static final class Connector {
        public static final Companion Companion = new Companion(null);
        private final ColorScheme color;
        private final Padding margin;
        private final int width;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return TimelineComponent$Connector$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Ca.e
        public /* synthetic */ Connector(int i, int i2, Padding padding, ColorScheme colorScheme, t0 t0Var) {
            if (7 != (i & 7)) {
                f0.a(i, 7, TimelineComponent$Connector$$serializer.INSTANCE.getDescriptor());
            }
            this.width = i2;
            this.margin = padding;
            this.color = colorScheme;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Connector connector, d dVar, qb.e eVar) {
            dVar.n(eVar, 0, connector.width);
            dVar.k(eVar, 1, Padding$$serializer.INSTANCE, connector.margin);
            dVar.k(eVar, 2, ColorScheme$$serializer.INSTANCE, connector.color);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Connector)) {
                return false;
            }
            Connector connector = (Connector) obj;
            return this.width == connector.width && t.c(this.margin, connector.margin) && t.c(this.color, connector.color);
        }

        public final /* synthetic */ ColorScheme getColor() {
            return this.color;
        }

        public final /* synthetic */ Padding getMargin() {
            return this.margin;
        }

        public final /* synthetic */ int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((this.width * 31) + this.margin.hashCode()) * 31) + this.color.hashCode();
        }

        public String toString() {
            return "Connector(width=" + this.width + ", margin=" + this.margin + ", color=" + this.color + ')';
        }

        public Connector(int i, Padding padding, ColorScheme colorScheme) {
            t.g(padding, "margin");
            t.g(colorScheme, "color");
            this.width = i;
            this.margin = padding;
            this.color = colorScheme;
        }
    }

    public enum IconAlignment {
        Title,
        TitleAndDescription;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return TimelineIconAlignmentDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @Ca.e
    public /* synthetic */ TimelineComponent(int i, int i2, int i3, int i4, IconAlignment iconAlignment, Boolean bool, Size size, Padding padding, Padding padding2, List list, List list2, t0 t0Var) {
        if (15 != (i & 15)) {
            f0.a(i, 15, TimelineComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.itemSpacing = i2;
        this.textSpacing = i3;
        this.columnGutter = i4;
        this.iconAlignment = iconAlignment;
        if ((i & 16) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 32) == 0) {
            this.size = new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE);
        } else {
            this.size = size;
        }
        if ((i & 64) == 0) {
            this.padding = Padding.Companion.getZero();
        } else {
            this.padding = padding;
        }
        if ((i & 128) == 0) {
            this.margin = Padding.Companion.getZero();
        } else {
            this.margin = padding2;
        }
        if ((i & 256) == 0) {
            this.items = v.n();
        } else {
            this.items = list;
        }
        if ((i & 512) == 0) {
            this.overrides = v.n();
        } else {
            this.overrides = list2;
        }
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getColumnGutter$annotations() {
    }

    public static /* synthetic */ void getIconAlignment$annotations() {
    }

    public static /* synthetic */ void getItemSpacing$annotations() {
    }

    public static /* synthetic */ void getTextSpacing$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(TimelineComponent timelineComponent, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.n(eVar, 0, timelineComponent.itemSpacing);
        dVar.n(eVar, 1, timelineComponent.textSpacing);
        dVar.n(eVar, 2, timelineComponent.columnGutter);
        dVar.k(eVar, 3, TimelineIconAlignmentDeserializer.INSTANCE, timelineComponent.iconAlignment);
        if (dVar.e(eVar, 4) || timelineComponent.visible != null) {
            dVar.j(eVar, 4, h.a, timelineComponent.visible);
        }
        if (dVar.e(eVar, 5) || !t.c(timelineComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.k(eVar, 5, Size$$serializer.INSTANCE, timelineComponent.size);
        }
        if (dVar.e(eVar, 6) || !t.c(timelineComponent.padding, Padding.Companion.getZero())) {
            dVar.k(eVar, 6, Padding$$serializer.INSTANCE, timelineComponent.padding);
        }
        if (dVar.e(eVar, 7) || !t.c(timelineComponent.margin, Padding.Companion.getZero())) {
            dVar.k(eVar, 7, Padding$$serializer.INSTANCE, timelineComponent.margin);
        }
        if (dVar.e(eVar, 8) || !t.c(timelineComponent.items, v.n())) {
            dVar.k(eVar, 8, kVarArr[8], timelineComponent.items);
        }
        if (!dVar.e(eVar, 9) && t.c(timelineComponent.overrides, v.n())) {
            return;
        }
        dVar.k(eVar, 9, kVarArr[9], timelineComponent.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineComponent)) {
            return false;
        }
        TimelineComponent timelineComponent = (TimelineComponent) obj;
        return this.itemSpacing == timelineComponent.itemSpacing && this.textSpacing == timelineComponent.textSpacing && this.columnGutter == timelineComponent.columnGutter && this.iconAlignment == timelineComponent.iconAlignment && t.c(this.visible, timelineComponent.visible) && t.c(this.size, timelineComponent.size) && t.c(this.padding, timelineComponent.padding) && t.c(this.margin, timelineComponent.margin) && t.c(this.items, timelineComponent.items) && t.c(this.overrides, timelineComponent.overrides);
    }

    public final /* synthetic */ int getColumnGutter() {
        return this.columnGutter;
    }

    public final /* synthetic */ IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    public final /* synthetic */ int getItemSpacing() {
        return this.itemSpacing;
    }

    public final /* synthetic */ List getItems() {
        return this.items;
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

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ int getTextSpacing() {
        return this.textSpacing;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((((((this.itemSpacing * 31) + this.textSpacing) * 31) + this.columnGutter) * 31) + this.iconAlignment.hashCode()) * 31;
        Boolean bool = this.visible;
        return ((((((((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.items.hashCode()) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "TimelineComponent(itemSpacing=" + this.itemSpacing + ", textSpacing=" + this.textSpacing + ", columnGutter=" + this.columnGutter + ", iconAlignment=" + this.iconAlignment + ", visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", items=" + this.items + ", overrides=" + this.overrides + ')';
    }

    public static final class Item {
        private final Connector connector;
        private final TextComponent description;
        private final IconComponent icon;
        private final List overrides;
        private final TextComponent title;
        private final Boolean visible;
        public static final Companion Companion = new Companion(null);
        private static final b[] $childSerializers = {null, null, null, null, null, new e(ComponentOverride.Companion.serializer(PartialTimelineComponentItem$$serializer.INSTANCE))};

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return TimelineComponent$Item$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @Ca.e
        public /* synthetic */ Item(int i, TextComponent textComponent, Boolean bool, TextComponent textComponent2, IconComponent iconComponent, Connector connector, List list, t0 t0Var) {
            if (9 != (i & 9)) {
                f0.a(i, 9, TimelineComponent$Item$$serializer.INSTANCE.getDescriptor());
            }
            this.title = textComponent;
            if ((i & 2) == 0) {
                this.visible = null;
            } else {
                this.visible = bool;
            }
            if ((i & 4) == 0) {
                this.description = null;
            } else {
                this.description = textComponent2;
            }
            this.icon = iconComponent;
            if ((i & 16) == 0) {
                this.connector = null;
            } else {
                this.connector = connector;
            }
            if ((i & 32) == 0) {
                this.overrides = v.n();
            } else {
                this.overrides = list;
            }
        }

        public static final /* synthetic */ b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Item item, d dVar, qb.e eVar) {
            ob.k[] kVarArr = $childSerializers;
            TextComponent$$serializer textComponent$$serializer = TextComponent$$serializer.INSTANCE;
            dVar.k(eVar, 0, textComponent$$serializer, item.title);
            if (dVar.e(eVar, 1) || item.visible != null) {
                dVar.j(eVar, 1, h.a, item.visible);
            }
            if (dVar.e(eVar, 2) || item.description != null) {
                dVar.j(eVar, 2, textComponent$$serializer, item.description);
            }
            dVar.k(eVar, 3, IconComponent$$serializer.INSTANCE, item.icon);
            if (dVar.e(eVar, 4) || item.connector != null) {
                dVar.j(eVar, 4, TimelineComponent$Connector$$serializer.INSTANCE, item.connector);
            }
            if (!dVar.e(eVar, 5) && t.c(item.overrides, v.n())) {
                return;
            }
            dVar.k(eVar, 5, kVarArr[5], item.overrides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return t.c(this.title, item.title) && t.c(this.visible, item.visible) && t.c(this.description, item.description) && t.c(this.icon, item.icon) && t.c(this.connector, item.connector) && t.c(this.overrides, item.overrides);
        }

        public final /* synthetic */ Connector getConnector() {
            return this.connector;
        }

        public final /* synthetic */ TextComponent getDescription() {
            return this.description;
        }

        public final /* synthetic */ IconComponent getIcon() {
            return this.icon;
        }

        public final /* synthetic */ List getOverrides() {
            return this.overrides;
        }

        public final /* synthetic */ TextComponent getTitle() {
            return this.title;
        }

        public final /* synthetic */ Boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            Boolean bool = this.visible;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            TextComponent textComponent = this.description;
            int hashCode3 = (((hashCode2 + (textComponent == null ? 0 : textComponent.hashCode())) * 31) + this.icon.hashCode()) * 31;
            Connector connector = this.connector;
            return ((hashCode3 + (connector != null ? connector.hashCode() : 0)) * 31) + this.overrides.hashCode();
        }

        public String toString() {
            return "Item(title=" + this.title + ", visible=" + this.visible + ", description=" + this.description + ", icon=" + this.icon + ", connector=" + this.connector + ", overrides=" + this.overrides + ')';
        }

        public Item(TextComponent textComponent, Boolean bool, TextComponent textComponent2, IconComponent iconComponent, Connector connector, List list) {
            t.g(textComponent, "title");
            t.g(iconComponent, "icon");
            t.g(list, "overrides");
            this.title = textComponent;
            this.visible = bool;
            this.description = textComponent2;
            this.icon = iconComponent;
            this.connector = connector;
            this.overrides = list;
        }

        public /* synthetic */ Item(TextComponent textComponent, Boolean bool, TextComponent textComponent2, IconComponent iconComponent, Connector connector, List list, int i, k kVar) {
            this(textComponent, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : textComponent2, iconComponent, (i & 16) != 0 ? null : connector, (i & 32) != 0 ? v.n() : list);
        }
    }

    public TimelineComponent(int i, int i2, int i3, IconAlignment iconAlignment, Boolean bool, Size size, Padding padding, Padding padding2, List list, List list2) {
        t.g(iconAlignment, "iconAlignment");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(padding2, "margin");
        t.g(list, "items");
        t.g(list2, "overrides");
        this.itemSpacing = i;
        this.textSpacing = i2;
        this.columnGutter = i3;
        this.iconAlignment = iconAlignment;
        this.visible = bool;
        this.size = size;
        this.padding = padding;
        this.margin = padding2;
        this.items = list;
        this.overrides = list2;
    }

    public /* synthetic */ TimelineComponent(int i, int i2, int i3, IconAlignment iconAlignment, Boolean bool, Size size, Padding padding, Padding padding2, List list, List list2, int i4, k kVar) {
        this(i, i2, i3, iconAlignment, (i4 & 16) != 0 ? null : bool, (i4 & 32) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i4 & 64) != 0 ? Padding.Companion.getZero() : padding, (i4 & 128) != 0 ? Padding.Companion.getZero() : padding2, (i4 & 256) != 0 ? v.n() : list, (i4 & 512) != 0 ? v.n() : list2);
    }
}
