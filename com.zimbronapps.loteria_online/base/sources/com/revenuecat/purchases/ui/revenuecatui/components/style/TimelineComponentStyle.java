package com.revenuecat.purchases.ui.revenuecatui.components.style;

import F.L;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final int columnGutter;
    private final TimelineComponent.IconAlignment iconAlignment;
    private final int itemSpacing;
    private final List items;
    private final L margin;
    private final OfferEligibility offerEligibility;
    private final List overrides;
    private final L padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final Size size;
    private final Integer tabIndex;
    private final int textSpacing;
    private final boolean visible;

    public static final class ConnectorStyle {
        public static final int $stable = 0;
        private final ColorStyles color;
        private final L margin;
        private final int width;

        public ConnectorStyle(int i, L margin, ColorStyles color) {
            t.g(margin, "margin");
            t.g(color, "color");
            this.width = i;
            this.margin = margin;
            this.color = color;
        }

        public static /* synthetic */ ConnectorStyle copy$default(ConnectorStyle connectorStyle, int i, L l, ColorStyles colorStyles, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = connectorStyle.width;
            }
            if ((i2 & 2) != 0) {
                l = connectorStyle.margin;
            }
            if ((i2 & 4) != 0) {
                colorStyles = connectorStyle.color;
            }
            return connectorStyle.copy(i, l, colorStyles);
        }

        public final int component1() {
            return this.width;
        }

        public final L component2() {
            return this.margin;
        }

        public final ColorStyles component3() {
            return this.color;
        }

        public final ConnectorStyle copy(int i, L margin, ColorStyles color) {
            t.g(margin, "margin");
            t.g(color, "color");
            return new ConnectorStyle(i, margin, color);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConnectorStyle)) {
                return false;
            }
            ConnectorStyle connectorStyle = (ConnectorStyle) obj;
            return this.width == connectorStyle.width && t.c(this.margin, connectorStyle.margin) && t.c(this.color, connectorStyle.color);
        }

        public final /* synthetic */ ColorStyles getColor() {
            return this.color;
        }

        public final /* synthetic */ L getMargin() {
            return this.margin;
        }

        public final /* synthetic */ int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.width) * 31) + this.margin.hashCode()) * 31) + this.color.hashCode();
        }

        public String toString() {
            return "ConnectorStyle(width=" + this.width + ", margin=" + this.margin + ", color=" + this.color + ')';
        }
    }

    public TimelineComponentStyle(int i, int i2, int i3, TimelineComponent.IconAlignment iconAlignment, boolean z, Size size, L padding, L margin, List items, Package r11, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List overrides) {
        t.g(iconAlignment, "iconAlignment");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(items, "items");
        t.g(overrides, "overrides");
        this.itemSpacing = i;
        this.textSpacing = i2;
        this.columnGutter = i3;
        this.iconAlignment = iconAlignment;
        this.visible = z;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.items = items;
        this.rcPackage = r11;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.overrides = overrides;
    }

    public static /* synthetic */ TimelineComponentStyle copy$default(TimelineComponentStyle timelineComponentStyle, int i, int i2, int i3, TimelineComponent.IconAlignment iconAlignment, boolean z, Size size, L l, L l2, List list, Package r25, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list2, int i4, Object obj) {
        return timelineComponentStyle.copy((i4 & 1) != 0 ? timelineComponentStyle.itemSpacing : i, (i4 & 2) != 0 ? timelineComponentStyle.textSpacing : i2, (i4 & 4) != 0 ? timelineComponentStyle.columnGutter : i3, (i4 & 8) != 0 ? timelineComponentStyle.iconAlignment : iconAlignment, (i4 & 16) != 0 ? timelineComponentStyle.visible : z, (i4 & 32) != 0 ? timelineComponentStyle.size : size, (i4 & 64) != 0 ? timelineComponentStyle.padding : l, (i4 & 128) != 0 ? timelineComponentStyle.margin : l2, (i4 & 256) != 0 ? timelineComponentStyle.items : list, (i4 & 512) != 0 ? timelineComponentStyle.rcPackage : r25, (i4 & 1024) != 0 ? timelineComponentStyle.resolvedOffer : resolvedOffer, (i4 & 2048) != 0 ? timelineComponentStyle.tabIndex : num, (i4 & 4096) != 0 ? timelineComponentStyle.offerEligibility : offerEligibility, (i4 & 8192) != 0 ? timelineComponentStyle.overrides : list2);
    }

    public final int component1() {
        return this.itemSpacing;
    }

    public final Package component10() {
        return this.rcPackage;
    }

    public final ResolvedOffer component11() {
        return this.resolvedOffer;
    }

    public final Integer component12() {
        return this.tabIndex;
    }

    public final OfferEligibility component13() {
        return this.offerEligibility;
    }

    public final List component14() {
        return this.overrides;
    }

    public final int component2() {
        return this.textSpacing;
    }

    public final int component3() {
        return this.columnGutter;
    }

    public final TimelineComponent.IconAlignment component4() {
        return this.iconAlignment;
    }

    public final boolean component5() {
        return this.visible;
    }

    public final Size component6() {
        return this.size;
    }

    public final L component7() {
        return this.padding;
    }

    public final L component8() {
        return this.margin;
    }

    public final List component9() {
        return this.items;
    }

    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i);
    }

    public final TimelineComponentStyle copy(int i, int i2, int i3, TimelineComponent.IconAlignment iconAlignment, boolean z, Size size, L padding, L margin, List items, Package r26, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List overrides) {
        t.g(iconAlignment, "iconAlignment");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(items, "items");
        t.g(overrides, "overrides");
        return new TimelineComponentStyle(i, i2, i3, iconAlignment, z, size, padding, margin, items, r26, resolvedOffer, num, offerEligibility, overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineComponentStyle)) {
            return false;
        }
        TimelineComponentStyle timelineComponentStyle = (TimelineComponentStyle) obj;
        return this.itemSpacing == timelineComponentStyle.itemSpacing && this.textSpacing == timelineComponentStyle.textSpacing && this.columnGutter == timelineComponentStyle.columnGutter && this.iconAlignment == timelineComponentStyle.iconAlignment && this.visible == timelineComponentStyle.visible && t.c(this.size, timelineComponentStyle.size) && t.c(this.padding, timelineComponentStyle.padding) && t.c(this.margin, timelineComponentStyle.margin) && t.c(this.items, timelineComponentStyle.items) && t.c(this.rcPackage, timelineComponentStyle.rcPackage) && t.c(this.resolvedOffer, timelineComponentStyle.resolvedOffer) && t.c(this.tabIndex, timelineComponentStyle.tabIndex) && t.c(this.offerEligibility, timelineComponentStyle.offerEligibility) && t.c(this.overrides, timelineComponentStyle.overrides);
    }

    public final /* synthetic */ int getColumnGutter() {
        return this.columnGutter;
    }

    public final /* synthetic */ TimelineComponent.IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    public final /* synthetic */ int getItemSpacing() {
        return this.itemSpacing;
    }

    public final /* synthetic */ List getItems() {
        return this.items;
    }

    public final /* synthetic */ L getMargin() {
        return this.margin;
    }

    public /* synthetic */ OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public String getPackageUniqueId() {
        return PackageContext.DefaultImpls.getPackageUniqueId(this);
    }

    public final /* synthetic */ L getPadding() {
        return this.padding;
    }

    public /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    public /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    public /* synthetic */ Size getSize() {
        return this.size;
    }

    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    public final /* synthetic */ int getTextSpacing() {
        return this.textSpacing;
    }

    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((Integer.hashCode(this.itemSpacing) * 31) + Integer.hashCode(this.textSpacing)) * 31) + Integer.hashCode(this.columnGutter)) * 31) + this.iconAlignment.hashCode()) * 31) + Boolean.hashCode(this.visible)) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.items.hashCode()) * 31;
        Package r1 = this.rcPackage;
        int hashCode2 = (hashCode + (r1 == null ? 0 : r1.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int hashCode3 = (hashCode2 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        return ((hashCode4 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "TimelineComponentStyle(itemSpacing=" + this.itemSpacing + ", textSpacing=" + this.textSpacing + ", columnGutter=" + this.columnGutter + ", iconAlignment=" + this.iconAlignment + ", visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", items=" + this.items + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", overrides=" + this.overrides + ')';
    }

    public static final class ItemStyle implements PackageContext {
        public static final int $stable = 0;
        private final ConnectorStyle connector;
        private final TextComponentStyle description;
        private final IconComponentStyle icon;
        private final OfferEligibility offerEligibility;
        private final List overrides;
        private final Package rcPackage;
        private final ResolvedOffer resolvedOffer;
        private final Integer tabIndex;
        private final TextComponentStyle title;
        private final boolean visible;

        public ItemStyle(TextComponentStyle title, boolean z, TextComponentStyle textComponentStyle, IconComponentStyle icon, ConnectorStyle connectorStyle, Package r7, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List overrides) {
            t.g(title, "title");
            t.g(icon, "icon");
            t.g(overrides, "overrides");
            this.title = title;
            this.visible = z;
            this.description = textComponentStyle;
            this.icon = icon;
            this.connector = connectorStyle;
            this.rcPackage = r7;
            this.resolvedOffer = resolvedOffer;
            this.tabIndex = num;
            this.offerEligibility = offerEligibility;
            this.overrides = overrides;
        }

        public static /* synthetic */ ItemStyle copy$default(ItemStyle itemStyle, TextComponentStyle textComponentStyle, boolean z, TextComponentStyle textComponentStyle2, IconComponentStyle iconComponentStyle, ConnectorStyle connectorStyle, Package r17, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list, int i, Object obj) {
            return itemStyle.copy((i & 1) != 0 ? itemStyle.title : textComponentStyle, (i & 2) != 0 ? itemStyle.visible : z, (i & 4) != 0 ? itemStyle.description : textComponentStyle2, (i & 8) != 0 ? itemStyle.icon : iconComponentStyle, (i & 16) != 0 ? itemStyle.connector : connectorStyle, (i & 32) != 0 ? itemStyle.rcPackage : r17, (i & 64) != 0 ? itemStyle.resolvedOffer : resolvedOffer, (i & 128) != 0 ? itemStyle.tabIndex : num, (i & 256) != 0 ? itemStyle.offerEligibility : offerEligibility, (i & 512) != 0 ? itemStyle.overrides : list);
        }

        public final TextComponentStyle component1() {
            return this.title;
        }

        public final List component10() {
            return this.overrides;
        }

        public final boolean component2() {
            return this.visible;
        }

        public final TextComponentStyle component3() {
            return this.description;
        }

        public final IconComponentStyle component4() {
            return this.icon;
        }

        public final ConnectorStyle component5() {
            return this.connector;
        }

        public final Package component6() {
            return this.rcPackage;
        }

        public final ResolvedOffer component7() {
            return this.resolvedOffer;
        }

        public final Integer component8() {
            return this.tabIndex;
        }

        public final OfferEligibility component9() {
            return this.offerEligibility;
        }

        public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i) {
            return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i);
        }

        public final ItemStyle copy(TextComponentStyle title, boolean z, TextComponentStyle textComponentStyle, IconComponentStyle icon, ConnectorStyle connectorStyle, Package r18, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List overrides) {
            t.g(title, "title");
            t.g(icon, "icon");
            t.g(overrides, "overrides");
            return new ItemStyle(title, z, textComponentStyle, icon, connectorStyle, r18, resolvedOffer, num, offerEligibility, overrides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ItemStyle)) {
                return false;
            }
            ItemStyle itemStyle = (ItemStyle) obj;
            return t.c(this.title, itemStyle.title) && this.visible == itemStyle.visible && t.c(this.description, itemStyle.description) && t.c(this.icon, itemStyle.icon) && t.c(this.connector, itemStyle.connector) && t.c(this.rcPackage, itemStyle.rcPackage) && t.c(this.resolvedOffer, itemStyle.resolvedOffer) && t.c(this.tabIndex, itemStyle.tabIndex) && t.c(this.offerEligibility, itemStyle.offerEligibility) && t.c(this.overrides, itemStyle.overrides);
        }

        public final /* synthetic */ ConnectorStyle getConnector() {
            return this.connector;
        }

        public final /* synthetic */ TextComponentStyle getDescription() {
            return this.description;
        }

        public final /* synthetic */ IconComponentStyle getIcon() {
            return this.icon;
        }

        public /* synthetic */ OfferEligibility getOfferEligibility() {
            return this.offerEligibility;
        }

        public final /* synthetic */ List getOverrides() {
            return this.overrides;
        }

        public String getPackageUniqueId() {
            return PackageContext.DefaultImpls.getPackageUniqueId(this);
        }

        public /* synthetic */ Package getRcPackage() {
            return this.rcPackage;
        }

        public /* synthetic */ ResolvedOffer getResolvedOffer() {
            return this.resolvedOffer;
        }

        public /* synthetic */ Integer getTabIndex() {
            return this.tabIndex;
        }

        public final /* synthetic */ TextComponentStyle getTitle() {
            return this.title;
        }

        public final /* synthetic */ boolean getVisible() {
            return this.visible;
        }

        public int hashCode() {
            int hashCode = ((this.title.hashCode() * 31) + Boolean.hashCode(this.visible)) * 31;
            TextComponentStyle textComponentStyle = this.description;
            int hashCode2 = (((hashCode + (textComponentStyle == null ? 0 : textComponentStyle.hashCode())) * 31) + this.icon.hashCode()) * 31;
            ConnectorStyle connectorStyle = this.connector;
            int hashCode3 = (hashCode2 + (connectorStyle == null ? 0 : connectorStyle.hashCode())) * 31;
            Package r1 = this.rcPackage;
            int hashCode4 = (hashCode3 + (r1 == null ? 0 : r1.hashCode())) * 31;
            ResolvedOffer resolvedOffer = this.resolvedOffer;
            int hashCode5 = (hashCode4 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
            Integer num = this.tabIndex;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            OfferEligibility offerEligibility = this.offerEligibility;
            return ((hashCode6 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + this.overrides.hashCode();
        }

        public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
            return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
        }

        public String toString() {
            return "ItemStyle(title=" + this.title + ", visible=" + this.visible + ", description=" + this.description + ", icon=" + this.icon + ", connector=" + this.connector + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", overrides=" + this.overrides + ')';
        }

        public /* synthetic */ ItemStyle(TextComponentStyle textComponentStyle, boolean z, TextComponentStyle textComponentStyle2, IconComponentStyle iconComponentStyle, ConnectorStyle connectorStyle, Package r20, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list, int i, k kVar) {
            this(textComponentStyle, z, textComponentStyle2, iconComponentStyle, connectorStyle, r20, (i & 64) != 0 ? null : resolvedOffer, num, (i & 256) != 0 ? null : offerEligibility, list);
        }
    }

    public /* synthetic */ TimelineComponentStyle(int i, int i2, int i3, TimelineComponent.IconAlignment iconAlignment, boolean z, Size size, L l, L l2, List list, Package r28, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list2, int i4, k kVar) {
        this(i, i2, i3, iconAlignment, z, size, l, l2, list, r28, (i4 & 1024) != 0 ? null : resolvedOffer, num, (i4 & 4096) != 0 ? null : offerEligibility, list2);
    }
}
