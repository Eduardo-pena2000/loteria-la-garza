package com.revenuecat.purchases.paywalls.components;

import Da.v;
import Xa.c;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
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
import com.revenuecat.purchases.paywalls.components.properties.FlexDistribution;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
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
import sb.D;
import sb.e;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StackComponent implements PaywallComponent {
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Badge badge;
    private final Border border;
    private final List components;
    private final Dimension dimension;
    private final Padding margin;
    private final Overflow overflow;
    private final List overrides;
    private final Padding padding;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Float spacing;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {new e(new PaywallComponentSerializer()), null, new h("com.revenuecat.purchases.paywalls.components.properties.Dimension", P.b(Dimension.class), new c[]{P.b(Dimension.Horizontal.class), P.b(Dimension.Vertical.class), P.b(Dimension.ZLayer.class)}, new b[]{Dimension$Horizontal$$serializer.INSTANCE, Dimension$Vertical$$serializer.INSTANCE, Dimension$ZLayer$$serializer.INSTANCE}, new Annotation[0]), null, null, null, null, null, null, null, null, null, null, null, new e(ComponentOverride.Companion.serializer(PartialStackComponent$$serializer.INSTANCE))};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return StackComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public enum Overflow {
        NONE,
        SCROLL;

        public static final Companion Companion = new Companion(null);

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return StackOverflowDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @Ca.e
    public /* synthetic */ StackComponent(int i, List list, Boolean bool, Dimension dimension, Size size, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, Badge badge, Overflow overflow, List list2, t0 t0Var) {
        if (1 != (i & 1)) {
            f0.a(i, 1, StackComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.components = list;
        if ((i & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        this.dimension = (i & 4) == 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : dimension;
        this.size = (i & 8) == 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size;
        if ((i & 16) == 0) {
            this.spacing = null;
        } else {
            this.spacing = f;
        }
        if ((i & 32) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i & 64) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        this.padding = (i & 128) == 0 ? Padding.Companion.getZero() : padding;
        this.margin = (i & 256) == 0 ? Padding.Companion.getZero() : padding2;
        if ((i & 512) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i & 1024) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 2048) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i & 4096) == 0) {
            this.badge = null;
        } else {
            this.badge = badge;
        }
        if ((i & 8192) == 0) {
            this.overflow = null;
        } else {
            this.overflow = overflow;
        }
        this.overrides = (i & 16384) == 0 ? v.n() : list2;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(StackComponent stackComponent, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        dVar.k(eVar, 0, kVarArr[0], stackComponent.components);
        if (dVar.e(eVar, 1) || stackComponent.visible != null) {
            dVar.j(eVar, 1, sb.h.a, stackComponent.visible);
        }
        if (dVar.e(eVar, 2) || !t.c(stackComponent.dimension, new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START))) {
            dVar.k(eVar, 2, kVarArr[2], stackComponent.dimension);
        }
        if (dVar.e(eVar, 3) || !t.c(stackComponent.size, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE))) {
            dVar.k(eVar, 3, Size$$serializer.INSTANCE, stackComponent.size);
        }
        if (dVar.e(eVar, 4) || stackComponent.spacing != null) {
            dVar.j(eVar, 4, D.a, stackComponent.spacing);
        }
        if (dVar.e(eVar, 5) || stackComponent.backgroundColor != null) {
            dVar.j(eVar, 5, ColorScheme$$serializer.INSTANCE, stackComponent.backgroundColor);
        }
        if (dVar.e(eVar, 6) || stackComponent.background != null) {
            dVar.j(eVar, 6, BackgroundDeserializer.INSTANCE, stackComponent.background);
        }
        if (dVar.e(eVar, 7) || !t.c(stackComponent.padding, Padding.Companion.getZero())) {
            dVar.k(eVar, 7, Padding$$serializer.INSTANCE, stackComponent.padding);
        }
        if (dVar.e(eVar, 8) || !t.c(stackComponent.margin, Padding.Companion.getZero())) {
            dVar.k(eVar, 8, Padding$$serializer.INSTANCE, stackComponent.margin);
        }
        if (dVar.e(eVar, 9) || stackComponent.shape != null) {
            dVar.j(eVar, 9, ShapeDeserializer.INSTANCE, stackComponent.shape);
        }
        if (dVar.e(eVar, 10) || stackComponent.border != null) {
            dVar.j(eVar, 10, Border$$serializer.INSTANCE, stackComponent.border);
        }
        if (dVar.e(eVar, 11) || stackComponent.shadow != null) {
            dVar.j(eVar, 11, Shadow$$serializer.INSTANCE, stackComponent.shadow);
        }
        if (dVar.e(eVar, 12) || stackComponent.badge != null) {
            dVar.j(eVar, 12, Badge$$serializer.INSTANCE, stackComponent.badge);
        }
        if (dVar.e(eVar, 13) || stackComponent.overflow != null) {
            dVar.j(eVar, 13, StackOverflowDeserializer.INSTANCE, stackComponent.overflow);
        }
        if (!dVar.e(eVar, 14) && t.c(stackComponent.overrides, v.n())) {
            return;
        }
        dVar.k(eVar, 14, kVarArr[14], stackComponent.overrides);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackComponent)) {
            return false;
        }
        StackComponent stackComponent = (StackComponent) obj;
        return t.c(this.components, stackComponent.components) && t.c(this.visible, stackComponent.visible) && t.c(this.dimension, stackComponent.dimension) && t.c(this.size, stackComponent.size) && t.c(this.spacing, stackComponent.spacing) && t.c(this.backgroundColor, stackComponent.backgroundColor) && t.c(this.background, stackComponent.background) && t.c(this.padding, stackComponent.padding) && t.c(this.margin, stackComponent.margin) && t.c(this.shape, stackComponent.shape) && t.c(this.border, stackComponent.border) && t.c(this.shadow, stackComponent.shadow) && t.c(this.badge, stackComponent.badge) && this.overflow == stackComponent.overflow && t.c(this.overrides, stackComponent.overrides);
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

    public final /* synthetic */ List getComponents() {
        return this.components;
    }

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ Overflow getOverflow() {
        return this.overflow;
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

    public final /* synthetic */ Float getSpacing() {
        return this.spacing;
    }

    public final /* synthetic */ Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = this.components.hashCode() * 31;
        Boolean bool = this.visible;
        int hashCode2 = (((((hashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.dimension.hashCode()) * 31) + this.size.hashCode()) * 31;
        Float f = this.spacing;
        int hashCode3 = (hashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode4 = (hashCode3 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int hashCode5 = (((((hashCode4 + (background == null ? 0 : background.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Shape shape = this.shape;
        int hashCode6 = (hashCode5 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int hashCode7 = (hashCode6 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int hashCode8 = (hashCode7 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        Badge badge = this.badge;
        int hashCode9 = (hashCode8 + (badge == null ? 0 : badge.hashCode())) * 31;
        Overflow overflow = this.overflow;
        return ((hashCode9 + (overflow != null ? overflow.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "StackComponent(components=" + this.components + ", visible=" + this.visible + ", dimension=" + this.dimension + ", size=" + this.size + ", spacing=" + this.spacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", badge=" + this.badge + ", overflow=" + this.overflow + ", overrides=" + this.overrides + ')';
    }

    public StackComponent(List list, Boolean bool, Dimension dimension, Size size, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, Badge badge, Overflow overflow, List list2) {
        t.g(list, "components");
        t.g(dimension, "dimension");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(padding2, "margin");
        t.g(list2, "overrides");
        this.components = list;
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
        this.overrides = list2;
    }

    public /* synthetic */ StackComponent(List list, Boolean bool, Dimension dimension, Size size, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, Badge badge, Overflow overflow, List list2, int i, k kVar) {
        this(list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? new Dimension.Vertical(HorizontalAlignment.CENTER, FlexDistribution.START) : dimension, (i & 8) != 0 ? new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE) : size, (i & 16) != 0 ? null : f, (i & 32) != 0 ? null : colorScheme, (i & 64) != 0 ? null : background, (i & 128) != 0 ? Padding.Companion.getZero() : padding, (i & 256) != 0 ? Padding.Companion.getZero() : padding2, (i & 512) != 0 ? null : shape, (i & 1024) != 0 ? null : border, (i & 2048) != 0 ? null : shadow, (i & 4096) != 0 ? null : badge, (i & 8192) == 0 ? overflow : null, (i & 16384) != 0 ? v.n() : list2);
    }
}
