package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.o;
import com.revenuecat.purchases.paywalls.components.PartialTimelineComponentItem;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PresentedTimelineItemPartial implements PresentedPartial {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final TimelineComponentStyle.ConnectorStyle connectorStyle;
    private final PartialTimelineComponentItem partial;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final /* synthetic */ Result invoke(PartialTimelineComponentItem from, Map aliases) {
            ColorScheme color;
            t.g(from, "from");
            t.g(aliases, "aliases");
            TimelineComponent.Connector connector = from.getConnector();
            TimelineComponentStyle.ConnectorStyle connectorStyle = null;
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull((connector == null || (color = connector.getColor()) == null) ? null : ColorStyleKt.toColorStyles(color, aliases));
            if (!(orSuccessfullyNull instanceof Result.Success)) {
                if (orSuccessfullyNull instanceof Result.Error) {
                    return orSuccessfullyNull;
                }
                throw new o();
            }
            ColorStyles colorStyles = (ColorStyles) ((Result.Success) orSuccessfullyNull).getValue();
            TimelineComponent.Connector connector2 = from.getConnector();
            if (connector2 != null && colorStyles != null) {
                connectorStyle = new TimelineComponentStyle.ConnectorStyle(connector2.getWidth(), PaddingKt.toPaddingValues(connector2.getMargin()), colorStyles);
            }
            return new Result.Success(new PresentedTimelineItemPartial(from, connectorStyle));
        }

        private Companion() {
        }
    }

    public PresentedTimelineItemPartial(PartialTimelineComponentItem partial, TimelineComponentStyle.ConnectorStyle connectorStyle) {
        t.g(partial, "partial");
        this.partial = partial;
        this.connectorStyle = connectorStyle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedTimelineItemPartial)) {
            return false;
        }
        PresentedTimelineItemPartial presentedTimelineItemPartial = (PresentedTimelineItemPartial) obj;
        return t.c(this.partial, presentedTimelineItemPartial.partial) && t.c(this.connectorStyle, presentedTimelineItemPartial.connectorStyle);
    }

    public final /* synthetic */ TimelineComponentStyle.ConnectorStyle getConnectorStyle() {
        return this.connectorStyle;
    }

    public final /* synthetic */ PartialTimelineComponentItem getPartial() {
        return this.partial;
    }

    public int hashCode() {
        int hashCode = this.partial.hashCode() * 31;
        TimelineComponentStyle.ConnectorStyle connectorStyle = this.connectorStyle;
        return hashCode + (connectorStyle == null ? 0 : connectorStyle.hashCode());
    }

    public String toString() {
        return "PresentedTimelineItemPartial(partial=" + this.partial + ", connectorStyle=" + this.connectorStyle + ')';
    }

    public PresentedTimelineItemPartial combine(PresentedTimelineItemPartial presentedTimelineItemPartial) {
        Boolean visible;
        TimelineComponent.Connector connector;
        TimelineComponentStyle.ConnectorStyle connectorStyle;
        PartialTimelineComponentItem partialTimelineComponentItem = presentedTimelineItemPartial != null ? presentedTimelineItemPartial.partial : null;
        if (partialTimelineComponentItem == null || (visible = partialTimelineComponentItem.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        if (partialTimelineComponentItem == null || (connector = partialTimelineComponentItem.getConnector()) == null) {
            connector = this.partial.getConnector();
        }
        PartialTimelineComponentItem partialTimelineComponentItem2 = new PartialTimelineComponentItem(visible, connector);
        if (presentedTimelineItemPartial == null || (connectorStyle = presentedTimelineItemPartial.connectorStyle) == null) {
            connectorStyle = this.connectorStyle;
        }
        return new PresentedTimelineItemPartial(partialTimelineComponentItem2, connectorStyle);
    }
}
