package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
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
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignmentDeserializer;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import rb.d;
import sb.D;
import sb.J;
import sb.h;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialCarouselComponent implements PartialComponent {
    public static final Companion Companion = new Companion(null);
    private final CarouselComponent.AutoAdvancePages autoAdvance;
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Integer initialPageIndex;
    private final Boolean loop;
    private final Padding margin;
    private final Padding padding;
    private final VerticalAlignment pageAlignment;
    private final CarouselComponent.PageControl pageControl;
    private final Integer pagePeek;
    private final Float pageSpacing;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Boolean visible;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PartialCarouselComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialCarouselComponent() {
        this((Boolean) null, (Integer) null, (VerticalAlignment) null, (Size) null, (Integer) null, (Float) null, (ColorScheme) null, (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (CarouselComponent.PageControl) null, (Boolean) null, (CarouselComponent.AutoAdvancePages) null, 65535, (k) null);
    }

    public static /* synthetic */ void getAutoAdvance$annotations() {
    }

    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static /* synthetic */ void getInitialPageIndex$annotations() {
    }

    public static /* synthetic */ void getPageAlignment$annotations() {
    }

    public static /* synthetic */ void getPageControl$annotations() {
    }

    public static /* synthetic */ void getPagePeek$annotations() {
    }

    public static /* synthetic */ void getPageSpacing$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PartialCarouselComponent partialCarouselComponent, d dVar, e eVar) {
        if (dVar.e(eVar, 0) || partialCarouselComponent.visible != null) {
            dVar.j(eVar, 0, h.a, partialCarouselComponent.visible);
        }
        if (dVar.e(eVar, 1) || partialCarouselComponent.initialPageIndex != null) {
            dVar.j(eVar, 1, J.a, partialCarouselComponent.initialPageIndex);
        }
        if (dVar.e(eVar, 2) || partialCarouselComponent.pageAlignment != null) {
            dVar.j(eVar, 2, VerticalAlignmentDeserializer.INSTANCE, partialCarouselComponent.pageAlignment);
        }
        if (dVar.e(eVar, 3) || partialCarouselComponent.size != null) {
            dVar.j(eVar, 3, Size$$serializer.INSTANCE, partialCarouselComponent.size);
        }
        if (dVar.e(eVar, 4) || partialCarouselComponent.pagePeek != null) {
            dVar.j(eVar, 4, J.a, partialCarouselComponent.pagePeek);
        }
        if (dVar.e(eVar, 5) || partialCarouselComponent.pageSpacing != null) {
            dVar.j(eVar, 5, D.a, partialCarouselComponent.pageSpacing);
        }
        if (dVar.e(eVar, 6) || partialCarouselComponent.backgroundColor != null) {
            dVar.j(eVar, 6, ColorScheme$$serializer.INSTANCE, partialCarouselComponent.backgroundColor);
        }
        if (dVar.e(eVar, 7) || partialCarouselComponent.background != null) {
            dVar.j(eVar, 7, BackgroundDeserializer.INSTANCE, partialCarouselComponent.background);
        }
        if (dVar.e(eVar, 8) || partialCarouselComponent.padding != null) {
            dVar.j(eVar, 8, Padding$$serializer.INSTANCE, partialCarouselComponent.padding);
        }
        if (dVar.e(eVar, 9) || partialCarouselComponent.margin != null) {
            dVar.j(eVar, 9, Padding$$serializer.INSTANCE, partialCarouselComponent.margin);
        }
        if (dVar.e(eVar, 10) || partialCarouselComponent.shape != null) {
            dVar.j(eVar, 10, ShapeDeserializer.INSTANCE, partialCarouselComponent.shape);
        }
        if (dVar.e(eVar, 11) || partialCarouselComponent.border != null) {
            dVar.j(eVar, 11, Border$$serializer.INSTANCE, partialCarouselComponent.border);
        }
        if (dVar.e(eVar, 12) || partialCarouselComponent.shadow != null) {
            dVar.j(eVar, 12, Shadow$$serializer.INSTANCE, partialCarouselComponent.shadow);
        }
        if (dVar.e(eVar, 13) || partialCarouselComponent.pageControl != null) {
            dVar.j(eVar, 13, CarouselComponent$PageControl$$serializer.INSTANCE, partialCarouselComponent.pageControl);
        }
        if (dVar.e(eVar, 14) || partialCarouselComponent.loop != null) {
            dVar.j(eVar, 14, h.a, partialCarouselComponent.loop);
        }
        if (!dVar.e(eVar, 15) && partialCarouselComponent.autoAdvance == null) {
            return;
        }
        dVar.j(eVar, 15, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, partialCarouselComponent.autoAdvance);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialCarouselComponent)) {
            return false;
        }
        PartialCarouselComponent partialCarouselComponent = (PartialCarouselComponent) obj;
        return t.c(this.visible, partialCarouselComponent.visible) && t.c(this.initialPageIndex, partialCarouselComponent.initialPageIndex) && this.pageAlignment == partialCarouselComponent.pageAlignment && t.c(this.size, partialCarouselComponent.size) && t.c(this.pagePeek, partialCarouselComponent.pagePeek) && t.c(this.pageSpacing, partialCarouselComponent.pageSpacing) && t.c(this.backgroundColor, partialCarouselComponent.backgroundColor) && t.c(this.background, partialCarouselComponent.background) && t.c(this.padding, partialCarouselComponent.padding) && t.c(this.margin, partialCarouselComponent.margin) && t.c(this.shape, partialCarouselComponent.shape) && t.c(this.border, partialCarouselComponent.border) && t.c(this.shadow, partialCarouselComponent.shadow) && t.c(this.pageControl, partialCarouselComponent.pageControl) && t.c(this.loop, partialCarouselComponent.loop) && t.c(this.autoAdvance, partialCarouselComponent.autoAdvance);
    }

    public final /* synthetic */ CarouselComponent.AutoAdvancePages getAutoAdvance() {
        return this.autoAdvance;
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

    public final /* synthetic */ Integer getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final /* synthetic */ Boolean getLoop() {
        return this.loop;
    }

    public final /* synthetic */ Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ VerticalAlignment getPageAlignment() {
        return this.pageAlignment;
    }

    public final /* synthetic */ CarouselComponent.PageControl getPageControl() {
        return this.pageControl;
    }

    public final /* synthetic */ Integer getPagePeek() {
        return this.pagePeek;
    }

    public final /* synthetic */ Float getPageSpacing() {
        return this.pageSpacing;
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
        Integer num = this.initialPageIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        VerticalAlignment verticalAlignment = this.pageAlignment;
        int hashCode3 = (hashCode2 + (verticalAlignment == null ? 0 : verticalAlignment.hashCode())) * 31;
        Size size = this.size;
        int hashCode4 = (hashCode3 + (size == null ? 0 : size.hashCode())) * 31;
        Integer num2 = this.pagePeek;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.pageSpacing;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode7 = (hashCode6 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int hashCode8 = (hashCode7 + (background == null ? 0 : background.hashCode())) * 31;
        Padding padding = this.padding;
        int hashCode9 = (hashCode8 + (padding == null ? 0 : padding.hashCode())) * 31;
        Padding padding2 = this.margin;
        int hashCode10 = (hashCode9 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        Shape shape = this.shape;
        int hashCode11 = (hashCode10 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int hashCode12 = (hashCode11 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int hashCode13 = (hashCode12 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        CarouselComponent.PageControl pageControl = this.pageControl;
        int hashCode14 = (hashCode13 + (pageControl == null ? 0 : pageControl.hashCode())) * 31;
        Boolean bool2 = this.loop;
        int hashCode15 = (hashCode14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        CarouselComponent.AutoAdvancePages autoAdvancePages = this.autoAdvance;
        return hashCode15 + (autoAdvancePages != null ? autoAdvancePages.hashCode() : 0);
    }

    public String toString() {
        return "PartialCarouselComponent(visible=" + this.visible + ", initialPageIndex=" + this.initialPageIndex + ", pageAlignment=" + this.pageAlignment + ", size=" + this.size + ", pagePeek=" + this.pagePeek + ", pageSpacing=" + this.pageSpacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", pageControl=" + this.pageControl + ", loop=" + this.loop + ", autoAdvance=" + this.autoAdvance + ')';
    }

    @Ca.e
    public /* synthetic */ PartialCarouselComponent(int i, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, CarouselComponent.PageControl pageControl, Boolean bool2, CarouselComponent.AutoAdvancePages autoAdvancePages, t0 t0Var) {
        if ((i & 1) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 2) == 0) {
            this.initialPageIndex = null;
        } else {
            this.initialPageIndex = num;
        }
        if ((i & 4) == 0) {
            this.pageAlignment = null;
        } else {
            this.pageAlignment = verticalAlignment;
        }
        if ((i & 8) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i & 16) == 0) {
            this.pagePeek = null;
        } else {
            this.pagePeek = num2;
        }
        if ((i & 32) == 0) {
            this.pageSpacing = null;
        } else {
            this.pageSpacing = f;
        }
        if ((i & 64) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i & 128) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i & 256) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i & 512) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
        if ((i & 1024) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i & 2048) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 4096) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i & 8192) == 0) {
            this.pageControl = null;
        } else {
            this.pageControl = pageControl;
        }
        if ((i & 16384) == 0) {
            this.loop = null;
        } else {
            this.loop = bool2;
        }
        if ((i & 32768) == 0) {
            this.autoAdvance = null;
        } else {
            this.autoAdvance = autoAdvancePages;
        }
    }

    public PartialCarouselComponent(Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, CarouselComponent.PageControl pageControl, Boolean bool2, CarouselComponent.AutoAdvancePages autoAdvancePages) {
        this.visible = bool;
        this.initialPageIndex = num;
        this.pageAlignment = verticalAlignment;
        this.size = size;
        this.pagePeek = num2;
        this.pageSpacing = f;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.padding = padding;
        this.margin = padding2;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.pageControl = pageControl;
        this.loop = bool2;
        this.autoAdvance = autoAdvancePages;
    }

    public /* synthetic */ PartialCarouselComponent(Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, CarouselComponent.PageControl pageControl, Boolean bool2, CarouselComponent.AutoAdvancePages autoAdvancePages, int i, k kVar) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : verticalAlignment, (i & 8) != 0 ? null : size, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : f, (i & 64) != 0 ? null : colorScheme, (i & 128) != 0 ? null : background, (i & 256) != 0 ? null : padding, (i & 512) != 0 ? null : padding2, (i & 1024) != 0 ? null : shape, (i & 2048) != 0 ? null : border, (i & 4096) != 0 ? null : shadow, (i & 8192) != 0 ? null : pageControl, (i & 16384) != 0 ? null : bool2, (i & 32768) != 0 ? null : autoAdvancePages);
    }
}
