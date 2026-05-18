package com.revenuecat.purchases.paywalls.components;

import Ca.A;
import Da.v;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
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
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.H0;
import sb.J;
import sb.e;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CarouselComponent implements PaywallComponent {
    private final AutoAdvancePages autoAdvance;
    private final Background background;
    private final ColorScheme backgroundColor;
    private final Border border;
    private final Integer initialPageIndex;
    private final Boolean loop;
    private final Padding margin;
    private final List overrides;
    private final Padding padding;
    private final VerticalAlignment pageAlignment;
    private final PageControl pageControl;
    private final Integer pagePeek;
    private final Float pageSpacing;
    private final List pages;
    private final Shadow shadow;
    private final Shape shape;
    private final Size size;
    private final Boolean visible;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {new e(StackComponent$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new e(ComponentOverride.Companion.serializer(PartialCarouselComponent$$serializer.INSTANCE))};

    public static final class AutoAdvancePages {
        public static final Companion Companion = new Companion(null);
        private final int msTimePerPage;
        private final int msTransitionTime;
        private final TransitionType transitionType;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CarouselComponent$AutoAdvancePages$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public enum TransitionType {
            FADE,
            SLIDE;

            public static final Companion Companion = new Companion(null);

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return CarouselTransitionTypeDeserializer.INSTANCE;
                }

                private Companion() {
                }
            }
        }

        @Ca.e
        public /* synthetic */ AutoAdvancePages(int i, int i2, int i3, TransitionType transitionType, t0 t0Var) {
            if (7 != (i & 7)) {
                f0.a(i, 7, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE.getDescriptor());
            }
            this.msTimePerPage = i2;
            this.msTransitionTime = i3;
            this.transitionType = transitionType;
        }

        public static /* synthetic */ void getMsTimePerPage$annotations() {
        }

        public static /* synthetic */ void getMsTransitionTime$annotations() {
        }

        public static /* synthetic */ void getTransitionType$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(AutoAdvancePages autoAdvancePages, d dVar, qb.e eVar) {
            dVar.n(eVar, 0, autoAdvancePages.msTimePerPage);
            dVar.n(eVar, 1, autoAdvancePages.msTransitionTime);
            dVar.j(eVar, 2, CarouselTransitionTypeDeserializer.INSTANCE, autoAdvancePages.transitionType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AutoAdvancePages)) {
                return false;
            }
            AutoAdvancePages autoAdvancePages = (AutoAdvancePages) obj;
            return this.msTimePerPage == autoAdvancePages.msTimePerPage && this.msTransitionTime == autoAdvancePages.msTransitionTime && this.transitionType == autoAdvancePages.transitionType;
        }

        public final /* synthetic */ int getMsTimePerPage() {
            return this.msTimePerPage;
        }

        public final /* synthetic */ int getMsTransitionTime() {
            return this.msTransitionTime;
        }

        public final /* synthetic */ TransitionType getTransitionType() {
            return this.transitionType;
        }

        public int hashCode() {
            int i = ((this.msTimePerPage * 31) + this.msTransitionTime) * 31;
            TransitionType transitionType = this.transitionType;
            return i + (transitionType == null ? 0 : transitionType.hashCode());
        }

        public String toString() {
            return "AutoAdvancePages(msTimePerPage=" + this.msTimePerPage + ", msTransitionTime=" + this.msTransitionTime + ", transitionType=" + this.transitionType + ')';
        }

        public AutoAdvancePages(int i, int i2, TransitionType transitionType) {
            this.msTimePerPage = i;
            this.msTransitionTime = i2;
            this.transitionType = transitionType;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return CarouselComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Ca.e
    public /* synthetic */ CarouselComponent(int i, List list, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List list2, t0 t0Var) {
        Size size2;
        if (9 != (i & 9)) {
            f0.a(i, 9, CarouselComponent$$serializer.INSTANCE.getDescriptor());
        }
        this.pages = list;
        if ((i & 2) == 0) {
            this.visible = null;
        } else {
            this.visible = bool;
        }
        if ((i & 4) == 0) {
            this.initialPageIndex = null;
        } else {
            this.initialPageIndex = num;
        }
        this.pageAlignment = verticalAlignment;
        if ((i & 16) == 0) {
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            size2 = new Size(fit, fit);
        } else {
            size2 = size;
        }
        this.size = size2;
        if ((i & 32) == 0) {
            this.pagePeek = null;
        } else {
            this.pagePeek = num2;
        }
        if ((i & 64) == 0) {
            this.pageSpacing = null;
        } else {
            this.pageSpacing = f;
        }
        if ((i & 128) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i & 256) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        this.padding = (i & 512) == 0 ? Padding.Companion.getZero() : padding;
        this.margin = (i & 1024) == 0 ? Padding.Companion.getZero() : padding2;
        if ((i & 2048) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i & 4096) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i & 8192) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i & 16384) == 0) {
            this.pageControl = null;
        } else {
            this.pageControl = pageControl;
        }
        if ((32768 & i) == 0) {
            this.loop = null;
        } else {
            this.loop = bool2;
        }
        if ((65536 & i) == 0) {
            this.autoAdvance = null;
        } else {
            this.autoAdvance = autoAdvancePages;
        }
        this.overrides = (i & 131072) == 0 ? v.n() : list2;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
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

    /* JADX WARN: Removed duplicated region for block: B:81:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(com.revenuecat.purchases.paywalls.components.CarouselComponent r5, rb.d r6, qb.e r7) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.paywalls.components.CarouselComponent.write$Self$purchases_defaultsBc8Release(com.revenuecat.purchases.paywalls.components.CarouselComponent, rb.d, qb.e):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselComponent)) {
            return false;
        }
        CarouselComponent carouselComponent = (CarouselComponent) obj;
        return t.c(this.pages, carouselComponent.pages) && t.c(this.visible, carouselComponent.visible) && t.c(this.initialPageIndex, carouselComponent.initialPageIndex) && this.pageAlignment == carouselComponent.pageAlignment && t.c(this.size, carouselComponent.size) && t.c(this.pagePeek, carouselComponent.pagePeek) && t.c(this.pageSpacing, carouselComponent.pageSpacing) && t.c(this.backgroundColor, carouselComponent.backgroundColor) && t.c(this.background, carouselComponent.background) && t.c(this.padding, carouselComponent.padding) && t.c(this.margin, carouselComponent.margin) && t.c(this.shape, carouselComponent.shape) && t.c(this.border, carouselComponent.border) && t.c(this.shadow, carouselComponent.shadow) && t.c(this.pageControl, carouselComponent.pageControl) && t.c(this.loop, carouselComponent.loop) && t.c(this.autoAdvance, carouselComponent.autoAdvance) && t.c(this.overrides, carouselComponent.overrides);
    }

    public final /* synthetic */ AutoAdvancePages getAutoAdvance() {
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

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public final /* synthetic */ Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ VerticalAlignment getPageAlignment() {
        return this.pageAlignment;
    }

    public final /* synthetic */ PageControl getPageControl() {
        return this.pageControl;
    }

    public final /* synthetic */ Integer getPagePeek() {
        return this.pagePeek;
    }

    public final /* synthetic */ Float getPageSpacing() {
        return this.pageSpacing;
    }

    public final /* synthetic */ List getPages() {
        return this.pages;
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
        int hashCode = this.pages.hashCode() * 31;
        Boolean bool = this.visible;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.initialPageIndex;
        int hashCode3 = (((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.pageAlignment.hashCode()) * 31) + this.size.hashCode()) * 31;
        Integer num2 = this.pagePeek;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.pageSpacing;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        ColorScheme colorScheme = this.backgroundColor;
        int hashCode6 = (hashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        Background background = this.background;
        int hashCode7 = (((((hashCode6 + (background == null ? 0 : background.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        Shape shape = this.shape;
        int hashCode8 = (hashCode7 + (shape == null ? 0 : shape.hashCode())) * 31;
        Border border = this.border;
        int hashCode9 = (hashCode8 + (border == null ? 0 : border.hashCode())) * 31;
        Shadow shadow = this.shadow;
        int hashCode10 = (hashCode9 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        PageControl pageControl = this.pageControl;
        int hashCode11 = (hashCode10 + (pageControl == null ? 0 : pageControl.hashCode())) * 31;
        Boolean bool2 = this.loop;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        AutoAdvancePages autoAdvancePages = this.autoAdvance;
        return ((hashCode12 + (autoAdvancePages != null ? autoAdvancePages.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public String toString() {
        return "CarouselComponent(pages=" + this.pages + ", visible=" + this.visible + ", initialPageIndex=" + this.initialPageIndex + ", pageAlignment=" + this.pageAlignment + ", size=" + this.size + ", pagePeek=" + this.pagePeek + ", pageSpacing=" + this.pageSpacing + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", pageControl=" + this.pageControl + ", loop=" + this.loop + ", autoAdvance=" + this.autoAdvance + ", overrides=" + this.overrides + ')';
    }

    public static final class PageControl {
        public static final Companion Companion = new Companion(null);
        private final Indicator active;
        private final ColorScheme backgroundColor;
        private final Border border;
        private final Indicator default;
        private final Padding margin;
        private final Padding padding;
        private final Position position;
        private final Shadow shadow;
        private final Shape shape;
        private final Integer spacing;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return CarouselComponent$PageControl$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static final class Indicator {
            public static final Companion Companion = new Companion(null);
            private final ColorScheme color;
            private final int height;
            private final ColorScheme strokeColor;
            private final A strokeWidth;
            private final int width;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public /* synthetic */ Indicator(int i, int i2, ColorScheme colorScheme, ColorScheme colorScheme2, A a, k kVar) {
                this(i, i2, colorScheme, colorScheme2, a);
            }

            public static /* synthetic */ void getStrokeColor$annotations() {
            }

            public static /* synthetic */ void getStrokeWidth-0hXNFcg$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Indicator indicator, d dVar, qb.e eVar) {
                H0 h0 = H0.a;
                dVar.k(eVar, 0, h0, A.a(indicator.width));
                dVar.k(eVar, 1, h0, A.a(indicator.height));
                ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
                dVar.k(eVar, 2, colorScheme$$serializer, indicator.color);
                if (dVar.e(eVar, 3) || indicator.strokeColor != null) {
                    dVar.j(eVar, 3, colorScheme$$serializer, indicator.strokeColor);
                }
                if (!dVar.e(eVar, 4) && indicator.strokeWidth == null) {
                    return;
                }
                dVar.j(eVar, 4, h0, indicator.strokeWidth);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Indicator)) {
                    return false;
                }
                Indicator indicator = (Indicator) obj;
                return this.width == indicator.width && this.height == indicator.height && t.c(this.color, indicator.color) && t.c(this.strokeColor, indicator.strokeColor) && t.c(this.strokeWidth, indicator.strokeWidth);
            }

            public final /* synthetic */ ColorScheme getColor() {
                return this.color;
            }

            public final /* synthetic */ int getHeight-pVg5ArA() {
                return this.height;
            }

            public final /* synthetic */ ColorScheme getStrokeColor() {
                return this.strokeColor;
            }

            public final /* synthetic */ A getStrokeWidth-0hXNFcg() {
                return this.strokeWidth;
            }

            public final /* synthetic */ int getWidth-pVg5ArA() {
                return this.width;
            }

            public int hashCode() {
                int hashCode = ((((this.width * 31) + this.height) * 31) + this.color.hashCode()) * 31;
                ColorScheme colorScheme = this.strokeColor;
                int hashCode2 = (hashCode + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
                A a = this.strokeWidth;
                return hashCode2 + (a != null ? A.d(a.f()) : 0);
            }

            public String toString() {
                return "Indicator(width=" + A.e(this.width) + ", height=" + A.e(this.height) + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
            }

            @Ca.e
            public /* synthetic */ Indicator(int i, A a, A a2, ColorScheme colorScheme, ColorScheme colorScheme2, A a3, t0 t0Var, k kVar) {
                this(i, a, a2, colorScheme, colorScheme2, a3, t0Var);
            }

            private Indicator(int i, int i2, ColorScheme colorScheme, ColorScheme colorScheme2, A a) {
                t.g(colorScheme, "color");
                this.width = i;
                this.height = i2;
                this.color = colorScheme;
                this.strokeColor = colorScheme2;
                this.strokeWidth = a;
            }

            private Indicator(int i, A a, A a2, ColorScheme colorScheme, ColorScheme colorScheme2, A a3, t0 t0Var) {
                if (7 != (i & 7)) {
                    f0.a(i, 7, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE.getDescriptor());
                }
                this.width = a.f();
                this.height = a2.f();
                this.color = colorScheme;
                if ((i & 8) == 0) {
                    this.strokeColor = null;
                } else {
                    this.strokeColor = colorScheme2;
                }
                if ((i & 16) == 0) {
                    this.strokeWidth = null;
                } else {
                    this.strokeWidth = a3;
                }
            }

            public /* synthetic */ Indicator(int i, int i2, ColorScheme colorScheme, ColorScheme colorScheme2, A a, int i3, k kVar) {
                this(i, i2, colorScheme, (i3 & 8) != 0 ? null : colorScheme2, (i3 & 16) != 0 ? null : a, null);
            }
        }

        public enum Position {
            TOP,
            BOTTOM;

            public static final Companion Companion = new Companion(null);

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return CarouselPageControlPositionDeserializer.INSTANCE;
                }

                private Companion() {
                }
            }
        }

        @Ca.e
        public /* synthetic */ PageControl(int i, Position position, Integer num, Padding padding, Padding padding2, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator indicator, Indicator indicator2, t0 t0Var) {
            if (769 != (i & 769)) {
                f0.a(i, 769, CarouselComponent$PageControl$$serializer.INSTANCE.getDescriptor());
            }
            this.position = position;
            if ((i & 2) == 0) {
                this.spacing = null;
            } else {
                this.spacing = num;
            }
            if ((i & 4) == 0) {
                this.padding = Padding.Companion.getZero();
            } else {
                this.padding = padding;
            }
            if ((i & 8) == 0) {
                this.margin = Padding.Companion.getZero();
            } else {
                this.margin = padding2;
            }
            if ((i & 16) == 0) {
                this.backgroundColor = null;
            } else {
                this.backgroundColor = colorScheme;
            }
            if ((i & 32) == 0) {
                this.shape = null;
            } else {
                this.shape = shape;
            }
            if ((i & 64) == 0) {
                this.border = null;
            } else {
                this.border = border;
            }
            if ((i & 128) == 0) {
                this.shadow = null;
            } else {
                this.shadow = shadow;
            }
            this.active = indicator;
            this.default = indicator2;
        }

        public static /* synthetic */ void getBackgroundColor$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PageControl pageControl, d dVar, qb.e eVar) {
            dVar.k(eVar, 0, CarouselPageControlPositionDeserializer.INSTANCE, pageControl.position);
            if (dVar.e(eVar, 1) || pageControl.spacing != null) {
                dVar.j(eVar, 1, J.a, pageControl.spacing);
            }
            if (dVar.e(eVar, 2) || !t.c(pageControl.padding, Padding.Companion.getZero())) {
                dVar.k(eVar, 2, Padding$$serializer.INSTANCE, pageControl.padding);
            }
            if (dVar.e(eVar, 3) || !t.c(pageControl.margin, Padding.Companion.getZero())) {
                dVar.k(eVar, 3, Padding$$serializer.INSTANCE, pageControl.margin);
            }
            if (dVar.e(eVar, 4) || pageControl.backgroundColor != null) {
                dVar.j(eVar, 4, ColorScheme$$serializer.INSTANCE, pageControl.backgroundColor);
            }
            if (dVar.e(eVar, 5) || pageControl.shape != null) {
                dVar.j(eVar, 5, ShapeDeserializer.INSTANCE, pageControl.shape);
            }
            if (dVar.e(eVar, 6) || pageControl.border != null) {
                dVar.j(eVar, 6, Border$$serializer.INSTANCE, pageControl.border);
            }
            if (dVar.e(eVar, 7) || pageControl.shadow != null) {
                dVar.j(eVar, 7, Shadow$$serializer.INSTANCE, pageControl.shadow);
            }
            CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
            dVar.k(eVar, 8, carouselComponent$PageControl$Indicator$$serializer, pageControl.active);
            dVar.k(eVar, 9, carouselComponent$PageControl$Indicator$$serializer, pageControl.default);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageControl)) {
                return false;
            }
            PageControl pageControl = (PageControl) obj;
            return this.position == pageControl.position && t.c(this.spacing, pageControl.spacing) && t.c(this.padding, pageControl.padding) && t.c(this.margin, pageControl.margin) && t.c(this.backgroundColor, pageControl.backgroundColor) && t.c(this.shape, pageControl.shape) && t.c(this.border, pageControl.border) && t.c(this.shadow, pageControl.shadow) && t.c(this.active, pageControl.active) && t.c(this.default, pageControl.default);
        }

        public final /* synthetic */ Indicator getActive() {
            return this.active;
        }

        public final /* synthetic */ ColorScheme getBackgroundColor() {
            return this.backgroundColor;
        }

        public final /* synthetic */ Border getBorder() {
            return this.border;
        }

        public final /* synthetic */ Indicator getDefault() {
            return this.default;
        }

        public final /* synthetic */ Padding getMargin() {
            return this.margin;
        }

        public final /* synthetic */ Padding getPadding() {
            return this.padding;
        }

        public final /* synthetic */ Position getPosition() {
            return this.position;
        }

        public final /* synthetic */ Shadow getShadow() {
            return this.shadow;
        }

        public final /* synthetic */ Shape getShape() {
            return this.shape;
        }

        public final /* synthetic */ Integer getSpacing() {
            return this.spacing;
        }

        public int hashCode() {
            int hashCode = this.position.hashCode() * 31;
            Integer num = this.spacing;
            int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
            ColorScheme colorScheme = this.backgroundColor;
            int hashCode3 = (hashCode2 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
            Shape shape = this.shape;
            int hashCode4 = (hashCode3 + (shape == null ? 0 : shape.hashCode())) * 31;
            Border border = this.border;
            int hashCode5 = (hashCode4 + (border == null ? 0 : border.hashCode())) * 31;
            Shadow shadow = this.shadow;
            return ((((hashCode5 + (shadow != null ? shadow.hashCode() : 0)) * 31) + this.active.hashCode()) * 31) + this.default.hashCode();
        }

        public String toString() {
            return "PageControl(position=" + this.position + ", spacing=" + this.spacing + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", active=" + this.active + ", default=" + this.default + ')';
        }

        public PageControl(Position position, Integer num, Padding padding, Padding padding2, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator indicator, Indicator indicator2) {
            t.g(position, "position");
            t.g(padding, "padding");
            t.g(padding2, "margin");
            t.g(indicator, "active");
            t.g(indicator2, "default");
            this.position = position;
            this.spacing = num;
            this.padding = padding;
            this.margin = padding2;
            this.backgroundColor = colorScheme;
            this.shape = shape;
            this.border = border;
            this.shadow = shadow;
            this.active = indicator;
            this.default = indicator2;
        }

        public /* synthetic */ PageControl(Position position, Integer num, Padding padding, Padding padding2, ColorScheme colorScheme, Shape shape, Border border, Shadow shadow, Indicator indicator, Indicator indicator2, int i, k kVar) {
            this(position, (i & 2) != 0 ? null : num, (i & 4) != 0 ? Padding.Companion.getZero() : padding, (i & 8) != 0 ? Padding.Companion.getZero() : padding2, (i & 16) != 0 ? null : colorScheme, (i & 32) != 0 ? null : shape, (i & 64) != 0 ? null : border, (i & 128) != 0 ? null : shadow, indicator, indicator2);
        }
    }

    public CarouselComponent(List list, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List list2) {
        t.g(list, "pages");
        t.g(verticalAlignment, "pageAlignment");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(padding2, "margin");
        t.g(list2, "overrides");
        this.pages = list;
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
        this.overrides = list2;
    }

    public /* synthetic */ CarouselComponent(List list, Boolean bool, Integer num, VerticalAlignment verticalAlignment, Size size, Integer num2, Float f, ColorScheme colorScheme, Background background, Padding padding, Padding padding2, Shape shape, Border border, Shadow shadow, PageControl pageControl, Boolean bool2, AutoAdvancePages autoAdvancePages, List list2, int i, k kVar) {
        Size size2;
        Boolean bool3 = (i & 2) != 0 ? null : bool;
        Integer num3 = (i & 4) != 0 ? null : num;
        if ((i & 16) != 0) {
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            size2 = new Size(fit, fit);
        } else {
            size2 = size;
        }
        this(list, bool3, num3, verticalAlignment, size2, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : colorScheme, (i & 256) != 0 ? null : background, (i & 512) != 0 ? Padding.Companion.getZero() : padding, (i & 1024) != 0 ? Padding.Companion.getZero() : padding2, (i & 2048) != 0 ? null : shape, (i & 4096) != 0 ? null : border, (i & 8192) != 0 ? null : shadow, (i & 16384) != 0 ? null : pageControl, (32768 & i) != 0 ? null : bool2, (65536 & i) != 0 ? null : autoAdvancePages, (i & 131072) != 0 ? v.n() : list2);
    }
}
