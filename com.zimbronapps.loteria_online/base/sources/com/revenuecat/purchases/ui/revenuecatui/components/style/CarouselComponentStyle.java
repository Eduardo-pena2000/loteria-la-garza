package com.revenuecat.purchases.ui.revenuecatui.components.style;

import F.L;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final CarouselComponent.AutoAdvancePages autoAdvance;
    private final BackgroundStyles background;
    private final BorderStyles border;
    private final int initialPageIndex;
    private final boolean loop;
    private final L margin;
    private final OfferEligibility offerEligibility;
    private final List overrides;
    private final L padding;
    private final e.c pageAlignment;
    private final PageControlStyles pageControl;
    private final float pagePeek;
    private final float pageSpacing;
    private final List pages;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final ShadowStyles shadow;
    private final Shape shape;
    private final Size size;
    private final Integer tabIndex;
    private final boolean visible;

    public static final class IndicatorStyles {
        public static final int $stable = 0;
        private final ColorStyles color;
        private final float height;
        private final ColorStyles strokeColor;
        private final h strokeWidth;
        private final float width;

        public /* synthetic */ IndicatorStyles(float f, float f2, ColorStyles colorStyles, ColorStyles colorStyles2, h hVar, k kVar) {
            this(f, f2, colorStyles, colorStyles2, hVar);
        }

        public static /* synthetic */ IndicatorStyles copy-EwDJqH8$default(IndicatorStyles indicatorStyles, float f, float f2, ColorStyles colorStyles, ColorStyles colorStyles2, h hVar, int i, Object obj) {
            if ((i & 1) != 0) {
                f = indicatorStyles.width;
            }
            if ((i & 2) != 0) {
                f2 = indicatorStyles.height;
            }
            float f3 = f2;
            if ((i & 4) != 0) {
                colorStyles = indicatorStyles.color;
            }
            ColorStyles colorStyles3 = colorStyles;
            if ((i & 8) != 0) {
                colorStyles2 = indicatorStyles.strokeColor;
            }
            ColorStyles colorStyles4 = colorStyles2;
            if ((i & 16) != 0) {
                hVar = indicatorStyles.strokeWidth;
            }
            return indicatorStyles.copy-EwDJqH8(f, f3, colorStyles3, colorStyles4, hVar);
        }

        public final float component1-D9Ej5fM() {
            return this.width;
        }

        public final float component2-D9Ej5fM() {
            return this.height;
        }

        public final ColorStyles component3() {
            return this.color;
        }

        public final ColorStyles component4() {
            return this.strokeColor;
        }

        public final h component5-lTKBWiU() {
            return this.strokeWidth;
        }

        public final IndicatorStyles copy-EwDJqH8(float f, float f2, ColorStyles color, ColorStyles colorStyles, h hVar) {
            t.g(color, "color");
            return new IndicatorStyles(f, f2, color, colorStyles, hVar, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IndicatorStyles)) {
                return false;
            }
            IndicatorStyles indicatorStyles = (IndicatorStyles) obj;
            return h.i(this.width, indicatorStyles.width) && h.i(this.height, indicatorStyles.height) && t.c(this.color, indicatorStyles.color) && t.c(this.strokeColor, indicatorStyles.strokeColor) && t.c(this.strokeWidth, indicatorStyles.strokeWidth);
        }

        public final /* synthetic */ ColorStyles getColor() {
            return this.color;
        }

        public final /* synthetic */ float getHeight-D9Ej5fM() {
            return this.height;
        }

        public final /* synthetic */ ColorStyles getStrokeColor() {
            return this.strokeColor;
        }

        public final /* synthetic */ h getStrokeWidth-lTKBWiU() {
            return this.strokeWidth;
        }

        public final /* synthetic */ float getWidth-D9Ej5fM() {
            return this.width;
        }

        public int hashCode() {
            int k = ((((h.k(this.width) * 31) + h.k(this.height)) * 31) + this.color.hashCode()) * 31;
            ColorStyles colorStyles = this.strokeColor;
            int hashCode = (k + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31;
            h hVar = this.strokeWidth;
            return hashCode + (hVar != null ? h.k(hVar.m()) : 0);
        }

        public String toString() {
            return "IndicatorStyles(width=" + h.l(this.width) + ", height=" + h.l(this.height) + ", color=" + this.color + ", strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ')';
        }

        private IndicatorStyles(float f, float f2, ColorStyles color, ColorStyles colorStyles, h hVar) {
            t.g(color, "color");
            this.width = f;
            this.height = f2;
            this.color = color;
            this.strokeColor = colorStyles;
            this.strokeWidth = hVar;
        }
    }

    public static final class PageControlStyles {
        public static final int $stable = 0;
        private final IndicatorStyles active;
        private final ColorStyles backgroundColor;
        private final BorderStyles border;
        private final IndicatorStyles default;
        private final L margin;
        private final L padding;
        private final CarouselComponent.PageControl.Position position;
        private final ShadowStyles shadow;
        private final Shape shape;
        private final float spacing;

        public /* synthetic */ PageControlStyles(CarouselComponent.PageControl.Position position, float f, L l, L l2, ColorStyles colorStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, IndicatorStyles indicatorStyles, IndicatorStyles indicatorStyles2, k kVar) {
            this(position, f, l, l2, colorStyles, shape, borderStyles, shadowStyles, indicatorStyles, indicatorStyles2);
        }

        public static /* synthetic */ PageControlStyles copy-jfnsLPA$default(PageControlStyles pageControlStyles, CarouselComponent.PageControl.Position position, float f, L l, L l2, ColorStyles colorStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, IndicatorStyles indicatorStyles, IndicatorStyles indicatorStyles2, int i, Object obj) {
            return pageControlStyles.copy-jfnsLPA((i & 1) != 0 ? pageControlStyles.position : position, (i & 2) != 0 ? pageControlStyles.spacing : f, (i & 4) != 0 ? pageControlStyles.padding : l, (i & 8) != 0 ? pageControlStyles.margin : l2, (i & 16) != 0 ? pageControlStyles.backgroundColor : colorStyles, (i & 32) != 0 ? pageControlStyles.shape : shape, (i & 64) != 0 ? pageControlStyles.border : borderStyles, (i & 128) != 0 ? pageControlStyles.shadow : shadowStyles, (i & 256) != 0 ? pageControlStyles.active : indicatorStyles, (i & 512) != 0 ? pageControlStyles.default : indicatorStyles2);
        }

        public final CarouselComponent.PageControl.Position component1() {
            return this.position;
        }

        public final IndicatorStyles component10() {
            return this.default;
        }

        public final float component2-D9Ej5fM() {
            return this.spacing;
        }

        public final L component3() {
            return this.padding;
        }

        public final L component4() {
            return this.margin;
        }

        public final ColorStyles component5() {
            return this.backgroundColor;
        }

        public final Shape component6() {
            return this.shape;
        }

        public final BorderStyles component7() {
            return this.border;
        }

        public final ShadowStyles component8() {
            return this.shadow;
        }

        public final IndicatorStyles component9() {
            return this.active;
        }

        public final PageControlStyles copy-jfnsLPA(CarouselComponent.PageControl.Position position, float f, L padding, L margin, ColorStyles colorStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, IndicatorStyles active, IndicatorStyles indicatorStyles) {
            t.g(position, "position");
            t.g(padding, "padding");
            t.g(margin, "margin");
            t.g(shape, "shape");
            t.g(active, "active");
            t.g(indicatorStyles, "default");
            return new PageControlStyles(position, f, padding, margin, colorStyles, shape, borderStyles, shadowStyles, active, indicatorStyles, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageControlStyles)) {
                return false;
            }
            PageControlStyles pageControlStyles = (PageControlStyles) obj;
            return this.position == pageControlStyles.position && h.i(this.spacing, pageControlStyles.spacing) && t.c(this.padding, pageControlStyles.padding) && t.c(this.margin, pageControlStyles.margin) && t.c(this.backgroundColor, pageControlStyles.backgroundColor) && t.c(this.shape, pageControlStyles.shape) && t.c(this.border, pageControlStyles.border) && t.c(this.shadow, pageControlStyles.shadow) && t.c(this.active, pageControlStyles.active) && t.c(this.default, pageControlStyles.default);
        }

        public final /* synthetic */ IndicatorStyles getActive() {
            return this.active;
        }

        public final /* synthetic */ ColorStyles getBackgroundColor() {
            return this.backgroundColor;
        }

        public final /* synthetic */ BorderStyles getBorder() {
            return this.border;
        }

        public final /* synthetic */ IndicatorStyles getDefault() {
            return this.default;
        }

        public final /* synthetic */ L getMargin() {
            return this.margin;
        }

        public final /* synthetic */ L getPadding() {
            return this.padding;
        }

        public final /* synthetic */ CarouselComponent.PageControl.Position getPosition() {
            return this.position;
        }

        public final /* synthetic */ ShadowStyles getShadow() {
            return this.shadow;
        }

        public final /* synthetic */ Shape getShape() {
            return this.shape;
        }

        public final /* synthetic */ float getSpacing-D9Ej5fM() {
            return this.spacing;
        }

        public int hashCode() {
            int hashCode = ((((((this.position.hashCode() * 31) + h.k(this.spacing)) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
            ColorStyles colorStyles = this.backgroundColor;
            int hashCode2 = (((hashCode + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31) + this.shape.hashCode()) * 31;
            BorderStyles borderStyles = this.border;
            int hashCode3 = (hashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
            ShadowStyles shadowStyles = this.shadow;
            return ((((hashCode3 + (shadowStyles != null ? shadowStyles.hashCode() : 0)) * 31) + this.active.hashCode()) * 31) + this.default.hashCode();
        }

        public String toString() {
            return "PageControlStyles(position=" + this.position + ", spacing=" + h.l(this.spacing) + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", active=" + this.active + ", default=" + this.default + ')';
        }

        private PageControlStyles(CarouselComponent.PageControl.Position position, float f, L padding, L margin, ColorStyles colorStyles, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, IndicatorStyles active, IndicatorStyles indicatorStyles) {
            t.g(position, "position");
            t.g(padding, "padding");
            t.g(margin, "margin");
            t.g(shape, "shape");
            t.g(active, "active");
            t.g(indicatorStyles, "default");
            this.position = position;
            this.spacing = f;
            this.padding = padding;
            this.margin = margin;
            this.backgroundColor = colorStyles;
            this.shape = shape;
            this.border = borderStyles;
            this.shadow = shadowStyles;
            this.active = active;
            this.default = indicatorStyles;
        }
    }

    public /* synthetic */ CarouselComponentStyle(List list, int i, e.c cVar, boolean z, Size size, float f, float f2, BackgroundStyles backgroundStyles, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, PageControlStyles pageControlStyles, boolean z2, CarouselComponent.AutoAdvancePages autoAdvancePages, Package r17, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list2, k kVar) {
        this(list, i, cVar, z, size, f, f2, backgroundStyles, l, l2, shape, borderStyles, shadowStyles, pageControlStyles, z2, autoAdvancePages, r17, resolvedOffer, num, offerEligibility, list2);
    }

    public static /* synthetic */ CarouselComponentStyle copy-aesFJdY$default(CarouselComponentStyle carouselComponentStyle, List list, int i, e.c cVar, boolean z, Size size, float f, float f2, BackgroundStyles backgroundStyles, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, PageControlStyles pageControlStyles, boolean z2, CarouselComponent.AutoAdvancePages autoAdvancePages, Package r34, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list2, int i2, Object obj) {
        return carouselComponentStyle.copy-aesFJdY((i2 & 1) != 0 ? carouselComponentStyle.pages : list, (i2 & 2) != 0 ? carouselComponentStyle.initialPageIndex : i, (i2 & 4) != 0 ? carouselComponentStyle.pageAlignment : cVar, (i2 & 8) != 0 ? carouselComponentStyle.visible : z, (i2 & 16) != 0 ? carouselComponentStyle.size : size, (i2 & 32) != 0 ? carouselComponentStyle.pagePeek : f, (i2 & 64) != 0 ? carouselComponentStyle.pageSpacing : f2, (i2 & 128) != 0 ? carouselComponentStyle.background : backgroundStyles, (i2 & 256) != 0 ? carouselComponentStyle.padding : l, (i2 & 512) != 0 ? carouselComponentStyle.margin : l2, (i2 & 1024) != 0 ? carouselComponentStyle.shape : shape, (i2 & 2048) != 0 ? carouselComponentStyle.border : borderStyles, (i2 & 4096) != 0 ? carouselComponentStyle.shadow : shadowStyles, (i2 & 8192) != 0 ? carouselComponentStyle.pageControl : pageControlStyles, (i2 & 16384) != 0 ? carouselComponentStyle.loop : z2, (i2 & 32768) != 0 ? carouselComponentStyle.autoAdvance : autoAdvancePages, (i2 & 65536) != 0 ? carouselComponentStyle.rcPackage : r34, (i2 & 131072) != 0 ? carouselComponentStyle.resolvedOffer : resolvedOffer, (i2 & 262144) != 0 ? carouselComponentStyle.tabIndex : num, (i2 & 524288) != 0 ? carouselComponentStyle.offerEligibility : offerEligibility, (i2 & 1048576) != 0 ? carouselComponentStyle.overrides : list2);
    }

    public final List component1() {
        return this.pages;
    }

    public final L component10() {
        return this.margin;
    }

    public final Shape component11() {
        return this.shape;
    }

    public final BorderStyles component12() {
        return this.border;
    }

    public final ShadowStyles component13() {
        return this.shadow;
    }

    public final PageControlStyles component14() {
        return this.pageControl;
    }

    public final boolean component15() {
        return this.loop;
    }

    public final CarouselComponent.AutoAdvancePages component16() {
        return this.autoAdvance;
    }

    public final Package component17() {
        return this.rcPackage;
    }

    public final ResolvedOffer component18() {
        return this.resolvedOffer;
    }

    public final Integer component19() {
        return this.tabIndex;
    }

    public final int component2() {
        return this.initialPageIndex;
    }

    public final OfferEligibility component20() {
        return this.offerEligibility;
    }

    public final List component21() {
        return this.overrides;
    }

    public final e.c component3() {
        return this.pageAlignment;
    }

    public final boolean component4() {
        return this.visible;
    }

    public final Size component5() {
        return this.size;
    }

    public final float component6-D9Ej5fM() {
        return this.pagePeek;
    }

    public final float component7-D9Ej5fM() {
        return this.pageSpacing;
    }

    public final BackgroundStyles component8() {
        return this.background;
    }

    public final L component9() {
        return this.padding;
    }

    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i);
    }

    public final CarouselComponentStyle copy-aesFJdY(List pages, int i, e.c pageAlignment, boolean z, Size size, float f, float f2, BackgroundStyles backgroundStyles, L padding, L margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, PageControlStyles pageControlStyles, boolean z2, CarouselComponent.AutoAdvancePages autoAdvancePages, Package r42, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List overrides) {
        t.g(pages, "pages");
        t.g(pageAlignment, "pageAlignment");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(shape, "shape");
        t.g(overrides, "overrides");
        return new CarouselComponentStyle(pages, i, pageAlignment, z, size, f, f2, backgroundStyles, padding, margin, shape, borderStyles, shadowStyles, pageControlStyles, z2, autoAdvancePages, r42, resolvedOffer, num, offerEligibility, overrides, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarouselComponentStyle)) {
            return false;
        }
        CarouselComponentStyle carouselComponentStyle = (CarouselComponentStyle) obj;
        return t.c(this.pages, carouselComponentStyle.pages) && this.initialPageIndex == carouselComponentStyle.initialPageIndex && t.c(this.pageAlignment, carouselComponentStyle.pageAlignment) && this.visible == carouselComponentStyle.visible && t.c(this.size, carouselComponentStyle.size) && h.i(this.pagePeek, carouselComponentStyle.pagePeek) && h.i(this.pageSpacing, carouselComponentStyle.pageSpacing) && t.c(this.background, carouselComponentStyle.background) && t.c(this.padding, carouselComponentStyle.padding) && t.c(this.margin, carouselComponentStyle.margin) && t.c(this.shape, carouselComponentStyle.shape) && t.c(this.border, carouselComponentStyle.border) && t.c(this.shadow, carouselComponentStyle.shadow) && t.c(this.pageControl, carouselComponentStyle.pageControl) && this.loop == carouselComponentStyle.loop && t.c(this.autoAdvance, carouselComponentStyle.autoAdvance) && t.c(this.rcPackage, carouselComponentStyle.rcPackage) && t.c(this.resolvedOffer, carouselComponentStyle.resolvedOffer) && t.c(this.tabIndex, carouselComponentStyle.tabIndex) && t.c(this.offerEligibility, carouselComponentStyle.offerEligibility) && t.c(this.overrides, carouselComponentStyle.overrides);
    }

    public final /* synthetic */ CarouselComponent.AutoAdvancePages getAutoAdvance() {
        return this.autoAdvance;
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return this.background;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ int getInitialPageIndex() {
        return this.initialPageIndex;
    }

    public final /* synthetic */ boolean getLoop() {
        return this.loop;
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

    public final /* synthetic */ e.c getPageAlignment() {
        return this.pageAlignment;
    }

    public final /* synthetic */ PageControlStyles getPageControl() {
        return this.pageControl;
    }

    public final /* synthetic */ float getPagePeek-D9Ej5fM() {
        return this.pagePeek;
    }

    public final /* synthetic */ float getPageSpacing-D9Ej5fM() {
        return this.pageSpacing;
    }

    public final /* synthetic */ List getPages() {
        return this.pages;
    }

    public /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    public /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public /* synthetic */ Size getSize() {
        return this.size;
    }

    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.pages.hashCode() * 31) + Integer.hashCode(this.initialPageIndex)) * 31) + this.pageAlignment.hashCode()) * 31) + Boolean.hashCode(this.visible)) * 31) + this.size.hashCode()) * 31) + h.k(this.pagePeek)) * 31) + h.k(this.pageSpacing)) * 31;
        BackgroundStyles backgroundStyles = this.background;
        int hashCode2 = (((((((hashCode + (backgroundStyles == null ? 0 : backgroundStyles.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.shape.hashCode()) * 31;
        BorderStyles borderStyles = this.border;
        int hashCode3 = (hashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        int hashCode4 = (hashCode3 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        PageControlStyles pageControlStyles = this.pageControl;
        int hashCode5 = (((hashCode4 + (pageControlStyles == null ? 0 : pageControlStyles.hashCode())) * 31) + Boolean.hashCode(this.loop)) * 31;
        CarouselComponent.AutoAdvancePages autoAdvancePages = this.autoAdvance;
        int hashCode6 = (hashCode5 + (autoAdvancePages == null ? 0 : autoAdvancePages.hashCode())) * 31;
        Package r1 = this.rcPackage;
        int hashCode7 = (hashCode6 + (r1 == null ? 0 : r1.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int hashCode8 = (hashCode7 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        return ((hashCode9 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + this.overrides.hashCode();
    }

    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "CarouselComponentStyle(pages=" + this.pages + ", initialPageIndex=" + this.initialPageIndex + ", pageAlignment=" + this.pageAlignment + ", visible=" + this.visible + ", size=" + this.size + ", pagePeek=" + h.l(this.pagePeek) + ", pageSpacing=" + h.l(this.pageSpacing) + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", pageControl=" + this.pageControl + ", loop=" + this.loop + ", autoAdvance=" + this.autoAdvance + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", overrides=" + this.overrides + ')';
    }

    private CarouselComponentStyle(List pages, int i, e.c pageAlignment, boolean z, Size size, float f, float f2, BackgroundStyles backgroundStyles, L padding, L margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, PageControlStyles pageControlStyles, boolean z2, CarouselComponent.AutoAdvancePages autoAdvancePages, Package r26, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List overrides) {
        t.g(pages, "pages");
        t.g(pageAlignment, "pageAlignment");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(shape, "shape");
        t.g(overrides, "overrides");
        this.pages = pages;
        this.initialPageIndex = i;
        this.pageAlignment = pageAlignment;
        this.visible = z;
        this.size = size;
        this.pagePeek = f;
        this.pageSpacing = f2;
        this.background = backgroundStyles;
        this.padding = padding;
        this.margin = margin;
        this.shape = shape;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.pageControl = pageControlStyles;
        this.loop = z2;
        this.autoAdvance = autoAdvancePages;
        this.rcPackage = r26;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.overrides = overrides;
    }

    public /* synthetic */ CarouselComponentStyle(List list, int i, e.c cVar, boolean z, Size size, float f, float f2, BackgroundStyles backgroundStyles, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, PageControlStyles pageControlStyles, boolean z2, CarouselComponent.AutoAdvancePages autoAdvancePages, Package r42, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list2, int i2, k kVar) {
        this(list, i, cVar, z, size, f, f2, backgroundStyles, l, l2, shape, borderStyles, shadowStyles, pageControlStyles, z2, autoAdvancePages, r42, (i2 & 131072) != 0 ? null : resolvedOffer, num, (i2 & 524288) != 0 ? null : offerEligibility, list2, null);
    }
}
