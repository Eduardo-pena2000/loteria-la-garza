package com.revenuecat.purchases.ui.revenuecatui.components;

import com.revenuecat.purchases.paywalls.components.PartialTimelineComponent;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PresentedTimelinePartial implements PresentedPartial {
    public static final int $stable = 0;
    private final PartialTimelineComponent partial;

    public PresentedTimelinePartial(PartialTimelineComponent partial) {
        t.g(partial, "partial");
        this.partial = partial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PresentedTimelinePartial) && t.c(this.partial, ((PresentedTimelinePartial) obj).partial);
    }

    public final /* synthetic */ PartialTimelineComponent getPartial() {
        return this.partial;
    }

    public int hashCode() {
        return this.partial.hashCode();
    }

    public String toString() {
        return "PresentedTimelinePartial(partial=" + this.partial + ')';
    }

    public PresentedTimelinePartial combine(PresentedTimelinePartial presentedTimelinePartial) {
        Boolean visible;
        Integer itemSpacing;
        Integer textSpacing;
        Integer columnGutter;
        TimelineComponent.IconAlignment iconAlignment;
        Size size;
        Padding padding;
        Padding margin;
        PartialTimelineComponent partialTimelineComponent = presentedTimelinePartial != null ? presentedTimelinePartial.partial : null;
        if (partialTimelineComponent == null || (visible = partialTimelineComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        Boolean bool = visible;
        if (partialTimelineComponent == null || (itemSpacing = partialTimelineComponent.getItemSpacing()) == null) {
            itemSpacing = this.partial.getItemSpacing();
        }
        Integer num = itemSpacing;
        if (partialTimelineComponent == null || (textSpacing = partialTimelineComponent.getTextSpacing()) == null) {
            textSpacing = this.partial.getTextSpacing();
        }
        Integer num2 = textSpacing;
        if (partialTimelineComponent == null || (columnGutter = partialTimelineComponent.getColumnGutter()) == null) {
            columnGutter = this.partial.getColumnGutter();
        }
        Integer num3 = columnGutter;
        if (partialTimelineComponent == null || (iconAlignment = partialTimelineComponent.getIconAlignment()) == null) {
            iconAlignment = this.partial.getIconAlignment();
        }
        TimelineComponent.IconAlignment iconAlignment2 = iconAlignment;
        if (partialTimelineComponent == null || (size = partialTimelineComponent.getSize()) == null) {
            size = this.partial.getSize();
        }
        Size size2 = size;
        if (partialTimelineComponent == null || (padding = partialTimelineComponent.getPadding()) == null) {
            padding = this.partial.getPadding();
        }
        Padding padding2 = padding;
        if (partialTimelineComponent == null || (margin = partialTimelineComponent.getMargin()) == null) {
            margin = this.partial.getMargin();
        }
        return new PresentedTimelinePartial(new PartialTimelineComponent(bool, num, num2, num3, iconAlignment2, size2, padding2, margin));
    }
}
