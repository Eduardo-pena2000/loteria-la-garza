package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.J;
import sb.h;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialTimelineComponent implements PartialComponent {
    public static final Companion Companion = new Companion(null);
    private final Integer columnGutter;
    private final TimelineComponent.IconAlignment iconAlignment;
    private final Integer itemSpacing;
    private final Padding margin;
    private final Padding padding;
    private final Size size;
    private final Integer textSpacing;
    private final Boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PartialTimelineComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialTimelineComponent() {
        this((Boolean) null, (Integer) null, (Integer) null, (Integer) null, (TimelineComponent.IconAlignment) null, (Size) null, (Padding) null, (Padding) null, 255, (k) null);
    }

    public static /* synthetic */ void getColumnGutter$annotations() {
    }

    public static /* synthetic */ void getIconAlignment$annotations() {
    }

    public static /* synthetic */ void getItemSpacing$annotations() {
    }

    public static /* synthetic */ void getTextSpacing$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialTimelineComponent partialTimelineComponent, d dVar, e eVar) {
        if (dVar.e(eVar, 0) || partialTimelineComponent.visible != null) {
            dVar.j(eVar, 0, h.a, partialTimelineComponent.visible);
        }
        if (dVar.e(eVar, 1) || partialTimelineComponent.itemSpacing != null) {
            dVar.j(eVar, 1, J.a, partialTimelineComponent.itemSpacing);
        }
        if (dVar.e(eVar, 2) || partialTimelineComponent.textSpacing != null) {
            dVar.j(eVar, 2, J.a, partialTimelineComponent.textSpacing);
        }
        if (dVar.e(eVar, 3) || partialTimelineComponent.columnGutter != null) {
            dVar.j(eVar, 3, J.a, partialTimelineComponent.columnGutter);
        }
        if (dVar.e(eVar, 4) || partialTimelineComponent.iconAlignment != null) {
            dVar.j(eVar, 4, TimelineIconAlignmentDeserializer.INSTANCE, partialTimelineComponent.iconAlignment);
        }
        if (dVar.e(eVar, 5) || partialTimelineComponent.size != null) {
            dVar.j(eVar, 5, Size$$serializer.INSTANCE, partialTimelineComponent.size);
        }
        if (dVar.e(eVar, 6) || partialTimelineComponent.padding != null) {
            dVar.j(eVar, 6, Padding$$serializer.INSTANCE, partialTimelineComponent.padding);
        }
        if (!dVar.e(eVar, 7) && partialTimelineComponent.margin == null) {
            return;
        }
        dVar.j(eVar, 7, Padding$$serializer.INSTANCE, partialTimelineComponent.margin);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialTimelineComponent)) {
            return false;
        }
        PartialTimelineComponent partialTimelineComponent = (PartialTimelineComponent) obj;
        return t.c(this.visible, partialTimelineComponent.visible) && t.c(this.itemSpacing, partialTimelineComponent.itemSpacing) && t.c(this.textSpacing, partialTimelineComponent.textSpacing) && t.c(this.columnGutter, partialTimelineComponent.columnGutter) && this.iconAlignment == partialTimelineComponent.iconAlignment && t.c(this.size, partialTimelineComponent.size) && t.c(this.padding, partialTimelineComponent.padding) && t.c(this.margin, partialTimelineComponent.margin);
    }

    public final /* synthetic */ Integer getColumnGutter() {
        return this.columnGutter;
    }

    public final /* synthetic */ TimelineComponent.IconAlignment getIconAlignment() {
        return this.iconAlignment;
    }

    public final /* synthetic */ Integer getItemSpacing() {
        return this.itemSpacing;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ Integer getTextSpacing() {
        return this.textSpacing;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.itemSpacing;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textSpacing;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.columnGutter;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        TimelineComponent.IconAlignment iconAlignment = this.iconAlignment;
        int hashCode5 = (hashCode4 + (iconAlignment == null ? 0 : iconAlignment.hashCode())) * 31;
        Size size = this.size;
        int hashCode6 = (hashCode5 + (size == null ? 0 : size.hashCode())) * 31;
        Padding padding = this.padding;
        int hashCode7 = (hashCode6 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        return hashCode7 + (padding2 != null ? padding2.hashCode() : 0);
    }

    public String toString() {
        return "PartialTimelineComponent(visible=" + this.visible + ", itemSpacing=" + this.itemSpacing + ", textSpacing=" + this.textSpacing + ", columnGutter=" + this.columnGutter + ", iconAlignment=" + this.iconAlignment + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ')';
    }

    @Ca.e
    public /* synthetic */ PartialTimelineComponent(int i, Boolean bool, Integer num, Integer num2, Integer num3, TimelineComponent.IconAlignment iconAlignment, Size size, Padding padding, Padding padding2, t0 t0Var) {
        if ((i & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 2) == 0) {
            this.itemSpacing = null;
        } else {
            this.itemSpacing = num;
        }
        if ((i & 4) == 0) {
            this.textSpacing = null;
        } else {
            this.textSpacing = num2;
        }
        if ((i & 8) == 0) {
            this.columnGutter = null;
        } else {
            this.columnGutter = num3;
        }
        if ((i & 16) == 0) {
            this.iconAlignment = null;
        } else {
            this.iconAlignment = iconAlignment;
        }
        if ((i & 32) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 64) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 128) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
    }

    public PartialTimelineComponent(Boolean bool, Integer num, Integer num2, Integer num3, TimelineComponent.IconAlignment iconAlignment, Size size, Padding padding, Padding padding2) {
        this.visible = bool;
        this.itemSpacing = num;
        this.textSpacing = num2;
        this.columnGutter = num3;
        this.iconAlignment = iconAlignment;
        this.size = size;
        this.padding = padding;
        this.margin = padding2;
    }

    public /* synthetic */ PartialTimelineComponent(Boolean bool, Integer num, Integer num2, Integer num3, TimelineComponent.IconAlignment iconAlignment, Size size, Padding padding, Padding padding2, int i, k kVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : iconAlignment, (i & 32) != 0 ? null : size, (i & 64) != 0 ? null : padding, (i & 128) == 0 ? padding2 : null);
    }
}
