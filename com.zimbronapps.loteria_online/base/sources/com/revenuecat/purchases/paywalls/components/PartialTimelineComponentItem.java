package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.h;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialTimelineComponentItem implements PartialComponent {
    public static final Companion Companion = new Companion(null);
    private final TimelineComponent.Connector connector;
    private final Boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PartialTimelineComponentItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialTimelineComponentItem() {
        this((Boolean) null, (TimelineComponent.Connector) null, 3, (k) null);
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialTimelineComponentItem partialTimelineComponentItem, d dVar, e eVar) {
        if (dVar.e(eVar, 0) || partialTimelineComponentItem.visible != null) {
            dVar.j(eVar, 0, h.a, partialTimelineComponentItem.visible);
        }
        if (!dVar.e(eVar, 1) && partialTimelineComponentItem.connector == null) {
            return;
        }
        dVar.j(eVar, 1, TimelineComponent$Connector$$serializer.INSTANCE, partialTimelineComponentItem.connector);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialTimelineComponentItem)) {
            return false;
        }
        PartialTimelineComponentItem partialTimelineComponentItem = (PartialTimelineComponentItem) obj;
        return t.c(this.visible, partialTimelineComponentItem.visible) && t.c(this.connector, partialTimelineComponentItem.connector);
    }

    public final /* synthetic */ TimelineComponent.Connector getConnector() {
        return this.connector;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        TimelineComponent.Connector connector = this.connector;
        return hashCode + (connector != null ? connector.hashCode() : 0);
    }

    public String toString() {
        return "PartialTimelineComponentItem(visible=" + this.visible + ", connector=" + this.connector + ')';
    }

    @Ca.e
    public /* synthetic */ PartialTimelineComponentItem(int i, Boolean bool, TimelineComponent.Connector connector, t0 t0Var) {
        if ((i & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 2) == 0) {
            this.connector = null;
        } else {
            this.connector = connector;
        }
    }

    public PartialTimelineComponentItem(Boolean bool, TimelineComponent.Connector connector) {
        this.visible = bool;
        this.connector = connector;
    }

    public /* synthetic */ PartialTimelineComponentItem(Boolean bool, TimelineComponent.Connector connector, int i, k kVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : connector);
    }
}
