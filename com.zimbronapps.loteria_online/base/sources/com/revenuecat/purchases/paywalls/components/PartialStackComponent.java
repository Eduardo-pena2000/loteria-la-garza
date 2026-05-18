package com.revenuecat.purchases.paywalls.components;

import Xa.c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Horizontal$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension$ZLayer$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import ob.h;
import qb.e;
import rb.d;
import sb.D;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialStackComponent implements PartialComponent {
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Badge badge;
    private final Border border;
    private final Dimension dimension;
    private final Padding margin;
    private final StackComponent.Overflow overflow;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Float spacing;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, new h("com.revenuecat.purchases.paywalls.components.properties.Dimension", P.b(Dimension.class), new c[]{P.b(Dimension.Horizontal.class), P.b(Dimension.Vertical.class), P.b(Dimension.ZLayer.class)}, new b[]{Dimension$Horizontal$$serializer.INSTANCE, Dimension$Vertical$$serializer.INSTANCE, Dimension$ZLayer$$serializer.INSTANCE}, new Annotation[0]), null, null, null, null, null, null, null, null, null, null, null};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PartialStackComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialStackComponent() {
        this((Boolean) null, (Dimension) null, (Size) null, (Float) null, (ColorScheme) null, (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, 8191, (k) null);
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialStackComponent partialStackComponent, d dVar, e eVar) {
        ob.k[] kVarArr = $childSerializers;
        if (dVar.e(eVar, 0) || !t.c(partialStackComponent.visible, Boolean.TRUE)) {
            dVar.j(eVar, 0, sb.h.a, partialStackComponent.visible);
        }
        if (dVar.e(eVar, 1) || partialStackComponent.dimension != null) {
            dVar.j(eVar, 1, kVarArr[1], partialStackComponent.dimension);
        }
        if (dVar.e(eVar, 2) || partialStackComponent.size != null) {
            dVar.j(eVar, 2, Size$$serializer.INSTANCE, partialStackComponent.size);
        }
        if (dVar.e(eVar, 3) || partialStackComponent.spacing != null) {
            dVar.j(eVar, 3, D.a, partialStackComponent.spacing);
        }
        if (dVar.e(eVar, 4) || partialStackComponent.backgroundColor != null) {
            dVar.j(eVar, 4, ColorScheme$$serializer.INSTANCE, partialStackComponent.backgroundColor);
        }
        if (dVar.e(eVar, 5) || partialStackComponent.background != null) {
            dVar.j(eVar, 5, BackgroundDeserializer.INSTANCE, partialStackComponent.background);
        }
        if (dVar.e(eVar, 6) || partialStackComponent.padding != null) {
            dVar.j(eVar, 6, Padding$$serializer.INSTANCE, partialStackComponent.padding);
        }
        if (dVar.e(eVar, 7) || partialStackComponent.margin != null) {
            dVar.j(eVar, 7, Padding$$serializer.INSTANCE, partialStackComponent.margin);
        }
        if (dVar.e(eVar, 8) || partialStackComponent.shape != null) {
            dVar.j(eVar, 8, ShapeDeserializer.INSTANCE, partialStackComponent.shape);
        }
        if (dVar.e(eVar, 9) || partialStackComponent.border != null) {
            dVar.j(eVar, 9, Border$$serializer.INSTANCE, partialStackComponent.border);
        }
        if (dVar.e(eVar, 10) || partialStackComponent.shadow != null) {
            dVar.j(eVar, 10, Shadow$$serializer.INSTANCE, partialStackComponent.shadow);
        }
        if (dVar.e(eVar, 11) || partialStackComponent.badge != null) {
            dVar.j(eVar, 11, Badge$$serializer.INSTANCE, partialStackComponent.badge);
        }
        if (!dVar.e(eVar, 12) && partialStackComponent.overflow == null) {
            return;
        }
        dVar.j(eVar, 12, StackOverflowDeserializer.INSTANCE, partialStackComponent.overflow);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialStackComponent)) {
            return false;
        }
        PartialStackComponent partialStackComponent = (PartialStackComponent) obj;
        return t.c(this.visible, partialStackComponent.visible) && t.c(this.dimension, partialStackComponent.dimension) && t.c(this.size, partialStackComponent.size) && t.c(this.spacing, partialStackComponent.spacing) && t.c(this.backgroundColor, partialStackComponent.backgroundColor) && t.c(this.background, partialStackComponent.background) && t.c(this.padding, partialStackComponent.padding) && t.c(this.margin, partialStackComponent.margin) && t.c(this.shape, partialStackComponent.shape) && t.c(this.border, partialStackComponent.border) && t.c(this.shadow, partialStackComponent.shadow) && t.c(this.badge, partialStackComponent.badge) && this.overflow == partialStackComponent.overflow;
    }

    public final /* synthetic */ Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ Badge getBadge() {
        return this.badge;
    }

    public final /* synthetic */ Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ StackComponent.Overflow getOverflow() {
        return this.overflow;
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

    public final /* synthetic */ Float getSpacing() {
        return this.spacing;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        Boolean bool = this.visible;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Dimension dimension = this.dimension;
        int hashCode2 = (hashCode + (dimension == null ? 0 : dimension.hashCode())) * 31;
        Size size = this.size;
        int hashCode3 = (hashCode2 + (size == null ? 0 : size.hashCode())) * 31;
        Float f = this.spacing;
        int hashCode4 = (hashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode5 = (hashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int hashCode6 = (hashCode5 + (background == null ? 0 : background.hashCode())) * 31;
        Padding padding = this.padding;
        int hashCode7 = (hashCode6 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int hashCode8 = (hashCode7 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Shape shape = this.shape;
        int hashCode9 = (hashCode8 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int hashCode10 = (hashCode9 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int hashCode11 = (hashCode10 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        Badge badge = this.badge;
        int hashCode12 = (hashCode11 + (badge == null ? 0 : badge.hashCode())) * 31;
        StackComponent.Overflow overflow = this.overflow;
        return hashCode12 + (overflow != null ? overflow.hashCode() : 0);
    }

    public String toString() {
        return "PartialStackComponent(visible=" + this.visible + ", dimension=" + this.dimension + ", size=" + this.size + ", spacing=" + this.spacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", badge=" + this.badge + ", overflow=" + this.overflow + ')';
    }

    @Ca.e
    public /* synthetic */ PartialStackComponent(int i, Boolean bool, Dimension dimension, Size size, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, Badge badge, StackComponent.Overflow overflow, t0 t0Var) {
        this.visible = (i & 1) == 0 ? Boolean.TRUE : bool;
        if ((i & 2) == 0) {
            this.dimension = null;
        } else {
            this.dimension = dimension;
        }
        if ((i & 4) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 8) == 0) {
            this.spacing = null;
        } else {
            this.spacing = f;
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
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 128) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
        if ((i & 256) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i & 512) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 1024) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i & 2048) == 0) {
            this.badge = null;
        } else {
            this.badge = badge;
        }
        if ((i & 4096) == 0) {
            this.overflow = null;
        } else {
            this.overflow = overflow;
        }
    }

    public PartialStackComponent(Boolean bool, Dimension dimension, Size size, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, Badge badge, StackComponent.Overflow overflow) {
        this.visible = bool;
        this.dimension = dimension;
        this.size = size;
        this.spacing = f;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.padding = padding;
        this.margin = padding2;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.badge = badge;
        this.overflow = overflow;
    }

    public /* synthetic */ PartialStackComponent(Boolean bool, Dimension dimension, Size size, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, Badge badge, StackComponent.Overflow overflow, int i, k kVar) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? null : dimension, (i & 4) != 0 ? null : size, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : colorScheme, (i & 32) != 0 ? null : background, (i & 64) != 0 ? null : padding, (i & 128) != 0 ? null : padding2, (i & 256) != 0 ? null : shape, (i & 512) != 0 ? null : border, (i & 1024) != 0 ? null : shadow, (i & 2048) != 0 ? null : badge, (i & 4096) == 0 ? overflow : null);
    }
}
