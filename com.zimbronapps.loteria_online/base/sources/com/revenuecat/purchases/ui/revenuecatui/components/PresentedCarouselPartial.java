package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Da.v;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.PartialCarouselComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PageControlExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PresentedCarouselPartial implements PresentedPartial {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final BackgroundStyles backgroundStyles;
    private final BorderStyles borderStyles;
    private final CarouselComponentStyle.PageControlStyles pageControlStyles;
    private final PartialCarouselComponent partial;
    private final ShadowStyles shadowStyles;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles] */
        public final /* synthetic */ Result invoke(PartialCarouselComponent from, Map aliases) {
            BackgroundStyles.Color color;
            t.g(from, "from");
            t.g(aliases, "aliases");
            Background background = from.getBackground();
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(background != null ? BackgroundStyleKt.toBackgroundStyles(background, aliases) : null);
            ColorScheme backgroundColor = from.getBackgroundColor();
            Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(backgroundColor != null ? ColorStyleKt.toColorStyles(backgroundColor, aliases) : null);
            Border border = from.getBorder();
            Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, aliases) : null);
            Shadow shadow = from.getShadow();
            Result orSuccessfullyNull4 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, aliases) : null);
            CarouselComponent.PageControl pageControl = from.getPageControl();
            Result orSuccessfullyNull5 = ResultKt.orSuccessfullyNull(pageControl != null ? PageControlExtensionsKt.toPageControlStyles(pageControl, aliases) : null);
            Result.Success success = new Result.Success(I.a);
            NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(orSuccessfullyNull, orSuccessfullyNull2, orSuccessfullyNull3, orSuccessfullyNull4, orSuccessfullyNull5, success)));
            if (nonEmptyListOrNull != null) {
                return new Result.Error(nonEmptyListOrNull);
            }
            t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value = ((Result.Success) orSuccessfullyNull).getValue();
            t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value2 = ((Result.Success) orSuccessfullyNull2).getValue();
            t.e(orSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value3 = ((Result.Success) orSuccessfullyNull3).getValue();
            t.e(orSuccessfullyNull4, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value4 = ((Result.Success) orSuccessfullyNull4).getValue();
            t.e(orSuccessfullyNull5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value5 = ((Result.Success) orSuccessfullyNull5).getValue();
            CarouselComponentStyle.PageControlStyles pageControlStyles = (CarouselComponentStyle.PageControlStyles) value5;
            ShadowStyles shadowStyles = (ShadowStyles) value4;
            BorderStyles borderStyles = (BorderStyles) value3;
            ColorStyles colorStyles = (ColorStyles) value2;
            ?? r0 = (BackgroundStyles) value;
            if (r0 == 0) {
                ColorStyles colorStyles2 = colorStyles != null ? BackgroundStyles.Color.constructor-impl(colorStyles) : null;
                color = colorStyles2 != null ? BackgroundStyles.Color.box-impl(colorStyles2) : null;
            } else {
                color = r0;
            }
            return new Result.Success(new PresentedCarouselPartial(color, borderStyles, shadowStyles, pageControlStyles, from));
        }

        private Companion() {
        }
    }

    public PresentedCarouselPartial(BackgroundStyles backgroundStyles, BorderStyles borderStyles, ShadowStyles shadowStyles, CarouselComponentStyle.PageControlStyles pageControlStyles, PartialCarouselComponent partial) {
        t.g(partial, "partial");
        this.backgroundStyles = backgroundStyles;
        this.borderStyles = borderStyles;
        this.shadowStyles = shadowStyles;
        this.pageControlStyles = pageControlStyles;
        this.partial = partial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedCarouselPartial)) {
            return false;
        }
        PresentedCarouselPartial presentedCarouselPartial = (PresentedCarouselPartial) obj;
        return t.c(this.backgroundStyles, presentedCarouselPartial.backgroundStyles) && t.c(this.borderStyles, presentedCarouselPartial.borderStyles) && t.c(this.shadowStyles, presentedCarouselPartial.shadowStyles) && t.c(this.pageControlStyles, presentedCarouselPartial.pageControlStyles) && t.c(this.partial, presentedCarouselPartial.partial);
    }

    public final /* synthetic */ BackgroundStyles getBackgroundStyles() {
        return this.backgroundStyles;
    }

    public final /* synthetic */ BorderStyles getBorderStyles() {
        return this.borderStyles;
    }

    public final /* synthetic */ CarouselComponentStyle.PageControlStyles getPageControlStyles() {
        return this.pageControlStyles;
    }

    public final /* synthetic */ PartialCarouselComponent getPartial() {
        return this.partial;
    }

    public final /* synthetic */ ShadowStyles getShadowStyles() {
        return this.shadowStyles;
    }

    public int hashCode() {
        BackgroundStyles backgroundStyles = this.backgroundStyles;
        int hashCode = (backgroundStyles == null ? 0 : backgroundStyles.hashCode()) * 31;
        BorderStyles borderStyles = this.borderStyles;
        int hashCode2 = (hashCode + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadowStyles;
        int hashCode3 = (hashCode2 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        CarouselComponentStyle.PageControlStyles pageControlStyles = this.pageControlStyles;
        return ((hashCode3 + (pageControlStyles != null ? pageControlStyles.hashCode() : 0)) * 31) + this.partial.hashCode();
    }

    public String toString() {
        return "PresentedCarouselPartial(backgroundStyles=" + this.backgroundStyles + ", borderStyles=" + this.borderStyles + ", shadowStyles=" + this.shadowStyles + ", pageControlStyles=" + this.pageControlStyles + ", partial=" + this.partial + ')';
    }

    public PresentedCarouselPartial combine(PresentedCarouselPartial presentedCarouselPartial) {
        BackgroundStyles backgroundStyles;
        BorderStyles borderStyles;
        ShadowStyles shadowStyles;
        CarouselComponentStyle.PageControlStyles pageControlStyles;
        Boolean visible;
        Integer initialPageIndex;
        VerticalAlignment pageAlignment;
        Size size;
        Integer pagePeek;
        Float pageSpacing;
        ColorScheme backgroundColor;
        Background background;
        Padding padding;
        Padding margin;
        Shape shape;
        Border border;
        Shadow shadow;
        CarouselComponent.PageControl pageControl;
        Boolean loop;
        CarouselComponent.AutoAdvancePages autoAdvance;
        PartialCarouselComponent partialCarouselComponent = presentedCarouselPartial != null ? presentedCarouselPartial.partial : null;
        BackgroundStyles backgroundStyles2 = this.backgroundStyles;
        if (backgroundStyles2 != null) {
            backgroundStyles = backgroundStyles2;
        } else if (presentedCarouselPartial != null) {
            backgroundStyles2 = presentedCarouselPartial.backgroundStyles;
            backgroundStyles = backgroundStyles2;
        } else {
            backgroundStyles = null;
        }
        BorderStyles borderStyles2 = this.borderStyles;
        if (borderStyles2 != null) {
            borderStyles = borderStyles2;
        } else if (presentedCarouselPartial != null) {
            borderStyles2 = presentedCarouselPartial.borderStyles;
            borderStyles = borderStyles2;
        } else {
            borderStyles = null;
        }
        ShadowStyles shadowStyles2 = this.shadowStyles;
        if (shadowStyles2 != null) {
            shadowStyles = shadowStyles2;
        } else if (presentedCarouselPartial != null) {
            shadowStyles2 = presentedCarouselPartial.shadowStyles;
            shadowStyles = shadowStyles2;
        } else {
            shadowStyles = null;
        }
        CarouselComponentStyle.PageControlStyles pageControlStyles2 = this.pageControlStyles;
        if (pageControlStyles2 == null) {
            pageControlStyles = presentedCarouselPartial != null ? presentedCarouselPartial.pageControlStyles : null;
        } else {
            pageControlStyles = pageControlStyles2;
        }
        if (partialCarouselComponent == null || (visible = partialCarouselComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        Boolean bool = visible;
        if (partialCarouselComponent == null || (initialPageIndex = partialCarouselComponent.getInitialPageIndex()) == null) {
            initialPageIndex = this.partial.getInitialPageIndex();
        }
        Integer num = initialPageIndex;
        if (partialCarouselComponent == null || (pageAlignment = partialCarouselComponent.getPageAlignment()) == null) {
            pageAlignment = this.partial.getPageAlignment();
        }
        VerticalAlignment verticalAlignment = pageAlignment;
        if (partialCarouselComponent == null || (size = partialCarouselComponent.getSize()) == null) {
            size = this.partial.getSize();
        }
        Size size2 = size;
        if (partialCarouselComponent == null || (pagePeek = partialCarouselComponent.getPagePeek()) == null) {
            pagePeek = this.partial.getPagePeek();
        }
        Integer num2 = pagePeek;
        if (partialCarouselComponent == null || (pageSpacing = partialCarouselComponent.getPageSpacing()) == null) {
            pageSpacing = this.partial.getPageSpacing();
        }
        Float f = pageSpacing;
        if (partialCarouselComponent == null || (backgroundColor = partialCarouselComponent.getBackgroundColor()) == null) {
            backgroundColor = this.partial.getBackgroundColor();
        }
        ColorScheme colorScheme = backgroundColor;
        if (partialCarouselComponent == null || (background = partialCarouselComponent.getBackground()) == null) {
            background = this.partial.getBackground();
        }
        Background background2 = background;
        if (partialCarouselComponent == null || (padding = partialCarouselComponent.getPadding()) == null) {
            padding = this.partial.getPadding();
        }
        Padding padding2 = padding;
        if (partialCarouselComponent == null || (margin = partialCarouselComponent.getMargin()) == null) {
            margin = this.partial.getMargin();
        }
        Padding padding3 = margin;
        if (partialCarouselComponent == null || (shape = partialCarouselComponent.getShape()) == null) {
            shape = this.partial.getShape();
        }
        Shape shape2 = shape;
        if (partialCarouselComponent == null || (border = partialCarouselComponent.getBorder()) == null) {
            border = this.partial.getBorder();
        }
        Border border2 = border;
        if (partialCarouselComponent == null || (shadow = partialCarouselComponent.getShadow()) == null) {
            shadow = this.partial.getShadow();
        }
        Shadow shadow2 = shadow;
        if (partialCarouselComponent == null || (pageControl = partialCarouselComponent.getPageControl()) == null) {
            pageControl = this.partial.getPageControl();
        }
        CarouselComponent.PageControl pageControl2 = pageControl;
        if (partialCarouselComponent == null || (loop = partialCarouselComponent.getLoop()) == null) {
            loop = this.partial.getLoop();
        }
        Boolean bool2 = loop;
        if (partialCarouselComponent == null || (autoAdvance = partialCarouselComponent.getAutoAdvance()) == null) {
            autoAdvance = this.partial.getAutoAdvance();
        }
        return new PresentedCarouselPartial(backgroundStyles, borderStyles, shadowStyles, pageControlStyles, new PartialCarouselComponent(bool, num, verticalAlignment, size2, num2, f, colorScheme, background2, padding2, padding3, shape2, border2, shadow2, pageControl2, bool2, autoAdvance));
    }
}
