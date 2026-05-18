package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
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
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.h;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialTabsComponent implements PartialComponent {
    public static final Companion Companion = new Companion(null);
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Padding margin;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PartialTabsComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialTabsComponent() {
        this((Boolean) null, (Size) null, (Padding) null, (Padding) null, (ColorScheme) null, (Background) null, (Shape) null, (Border) null, (Shadow) null, 511, (k) null);
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialTabsComponent partialTabsComponent, d dVar, e eVar) {
        if (dVar.e(eVar, 0) || !t.c(partialTabsComponent.visible, Boolean.TRUE)) {
            dVar.j(eVar, 0, h.a, partialTabsComponent.visible);
        }
        if (dVar.e(eVar, 1) || partialTabsComponent.size != null) {
            dVar.j(eVar, 1, Size$$serializer.INSTANCE, partialTabsComponent.size);
        }
        if (dVar.e(eVar, 2) || partialTabsComponent.padding != null) {
            dVar.j(eVar, 2, Padding$$serializer.INSTANCE, partialTabsComponent.padding);
        }
        if (dVar.e(eVar, 3) || partialTabsComponent.margin != null) {
            dVar.j(eVar, 3, Padding$$serializer.INSTANCE, partialTabsComponent.margin);
        }
        if (dVar.e(eVar, 4) || partialTabsComponent.backgroundColor != null) {
            dVar.j(eVar, 4, ColorScheme$$serializer.INSTANCE, partialTabsComponent.backgroundColor);
        }
        if (dVar.e(eVar, 5) || partialTabsComponent.background != null) {
            dVar.j(eVar, 5, BackgroundDeserializer.INSTANCE, partialTabsComponent.background);
        }
        if (dVar.e(eVar, 6) || partialTabsComponent.shape != null) {
            dVar.j(eVar, 6, ShapeDeserializer.INSTANCE, partialTabsComponent.shape);
        }
        if (dVar.e(eVar, 7) || partialTabsComponent.border != null) {
            dVar.j(eVar, 7, Border$$serializer.INSTANCE, partialTabsComponent.border);
        }
        if (!dVar.e(eVar, 8) && partialTabsComponent.shadow == null) {
            return;
        }
        dVar.j(eVar, 8, Shadow$$serializer.INSTANCE, partialTabsComponent.shadow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialTabsComponent)) {
            return false;
        }
        PartialTabsComponent partialTabsComponent = (PartialTabsComponent) obj;
        return t.c(this.visible, partialTabsComponent.visible) && t.c(this.size, partialTabsComponent.size) && t.c(this.padding, partialTabsComponent.padding) && t.c(this.margin, partialTabsComponent.margin) && t.c(this.backgroundColor, partialTabsComponent.backgroundColor) && t.c(this.background, partialTabsComponent.background) && t.c(this.shape, partialTabsComponent.shape) && t.c(this.border, partialTabsComponent.border) && t.c(this.shadow, partialTabsComponent.shadow);
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

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
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

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Size size = this.size;
        int hashCode2 = (hashCode + (size == null ? 0 : size.hashCode())) * 31;
        Padding padding = this.padding;
        int hashCode3 = (hashCode2 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int hashCode4 = (hashCode3 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode5 = (hashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int hashCode6 = (hashCode5 + (background == null ? 0 : background.hashCode())) * 31;
        Shape shape = this.shape;
        int hashCode7 = (hashCode6 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int hashCode8 = (hashCode7 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        return hashCode8 + (shadow != null ? shadow.hashCode() : 0);
    }

    public String toString() {
        return "PartialTabsComponent(visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ')';
    }

    @Ca.e
    public /* synthetic */ PartialTabsComponent(int i, Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, t0 t0Var) {
        this.visible = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 4) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 8) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
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
    }

    public PartialTabsComponent(Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow) {
        this.visible = bool;
        this.size = size;
        this.padding = padding;
        this.margin = padding2;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
    }

    public /* synthetic */ PartialTabsComponent(Boolean bool, Size size, Padding padding, Padding padding2, ColorScheme colorScheme, Background background, Shape shape, Border border, Shadow shadow, int i, k kVar) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? null : size, (i & 4) != 0 ? null : padding, (i & 8) != 0 ? null : padding2, (i & 16) != 0 ? null : colorScheme, (i & 32) != 0 ? null : background, (i & 64) != 0 ? null : shape, (i & 128) != 0 ? null : border, (i & 256) == 0 ? shadow : null);
    }
}
