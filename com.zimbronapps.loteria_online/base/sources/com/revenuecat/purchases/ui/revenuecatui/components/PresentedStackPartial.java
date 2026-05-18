package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Da.v;
import Qa.l;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PresentedStackPartial implements PresentedPartial {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final BackgroundStyles backgroundStyles;
    private final BadgeStyle badgeStyle;
    private final BorderStyles borderStyles;
    private final PartialStackComponent partial;
    private final ShadowStyles shadowStyles;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v9, types: [com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles] */
        public final /* synthetic */ Result invoke(PartialStackComponent from, Map aliases, l createBadgeStackComponentStyle) {
            BackgroundStyles.Color color;
            t.g(from, "from");
            t.g(aliases, "aliases");
            t.g(createBadgeStackComponentStyle, "createBadgeStackComponentStyle");
            Background background = from.getBackground();
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(background != null ? BackgroundStyleKt.toBackgroundStyles(background, aliases) : null);
            ColorScheme backgroundColor = from.getBackgroundColor();
            Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(backgroundColor != null ? ColorStyleKt.toColorStyles(backgroundColor, aliases) : null);
            Border border = from.getBorder();
            Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, aliases) : null);
            Shadow shadow = from.getShadow();
            Result orSuccessfullyNull4 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, aliases) : null);
            Badge badge = from.getBadge();
            Result orSuccessfullyNull5 = ResultKt.orSuccessfullyNull(badge != null ? BadgeStyleKt.toBadgeStyle(badge, createBadgeStackComponentStyle) : null);
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
            BadgeStyle badgeStyle = (BadgeStyle) value5;
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
            return new Result.Success(new PresentedStackPartial(color, borderStyles, shadowStyles, badgeStyle, from));
        }

        private Companion() {
        }
    }

    public PresentedStackPartial(BackgroundStyles backgroundStyles, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, PartialStackComponent partial) {
        t.g(partial, "partial");
        this.backgroundStyles = backgroundStyles;
        this.borderStyles = borderStyles;
        this.shadowStyles = shadowStyles;
        this.badgeStyle = badgeStyle;
        this.partial = partial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedStackPartial)) {
            return false;
        }
        PresentedStackPartial presentedStackPartial = (PresentedStackPartial) obj;
        return t.c(this.backgroundStyles, presentedStackPartial.backgroundStyles) && t.c(this.borderStyles, presentedStackPartial.borderStyles) && t.c(this.shadowStyles, presentedStackPartial.shadowStyles) && t.c(this.badgeStyle, presentedStackPartial.badgeStyle) && t.c(this.partial, presentedStackPartial.partial);
    }

    public final /* synthetic */ BackgroundStyles getBackgroundStyles() {
        return this.backgroundStyles;
    }

    public final /* synthetic */ BadgeStyle getBadgeStyle() {
        return this.badgeStyle;
    }

    public final /* synthetic */ BorderStyles getBorderStyles() {
        return this.borderStyles;
    }

    public final /* synthetic */ PartialStackComponent getPartial() {
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
        BadgeStyle badgeStyle = this.badgeStyle;
        return ((hashCode3 + (badgeStyle != null ? badgeStyle.hashCode() : 0)) * 31) + this.partial.hashCode();
    }

    public String toString() {
        return "PresentedStackPartial(backgroundStyles=" + this.backgroundStyles + ", borderStyles=" + this.borderStyles + ", shadowStyles=" + this.shadowStyles + ", badgeStyle=" + this.badgeStyle + ", partial=" + this.partial + ')';
    }

    public PresentedStackPartial combine(PresentedStackPartial presentedStackPartial) {
        BackgroundStyles backgroundStyles;
        BorderStyles borderStyles;
        ShadowStyles shadowStyles;
        BadgeStyle badgeStyle;
        Boolean visible;
        Dimension dimension;
        Size size;
        Float spacing;
        ColorScheme backgroundColor;
        Background background;
        Padding padding;
        Padding margin;
        Shape shape;
        Border border;
        Shadow shadow;
        Badge badge;
        StackComponent.Overflow overflow;
        PartialStackComponent partialStackComponent = presentedStackPartial != null ? presentedStackPartial.partial : null;
        if (presentedStackPartial == null || (backgroundStyles = presentedStackPartial.backgroundStyles) == null) {
            backgroundStyles = this.backgroundStyles;
        }
        BackgroundStyles backgroundStyles2 = backgroundStyles;
        if (presentedStackPartial == null || (borderStyles = presentedStackPartial.borderStyles) == null) {
            borderStyles = this.borderStyles;
        }
        BorderStyles borderStyles2 = borderStyles;
        if (presentedStackPartial == null || (shadowStyles = presentedStackPartial.shadowStyles) == null) {
            shadowStyles = this.shadowStyles;
        }
        ShadowStyles shadowStyles2 = shadowStyles;
        if (presentedStackPartial == null || (badgeStyle = presentedStackPartial.badgeStyle) == null) {
            badgeStyle = this.badgeStyle;
        }
        BadgeStyle badgeStyle2 = badgeStyle;
        if (partialStackComponent == null || (visible = partialStackComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        Boolean bool = visible;
        if (partialStackComponent == null || (dimension = partialStackComponent.getDimension()) == null) {
            dimension = this.partial.getDimension();
        }
        Dimension dimension2 = dimension;
        if (partialStackComponent == null || (size = partialStackComponent.getSize()) == null) {
            size = this.partial.getSize();
        }
        Size size2 = size;
        if (partialStackComponent == null || (spacing = partialStackComponent.getSpacing()) == null) {
            spacing = this.partial.getSpacing();
        }
        Float f = spacing;
        if (partialStackComponent == null || (backgroundColor = partialStackComponent.getBackgroundColor()) == null) {
            backgroundColor = this.partial.getBackgroundColor();
        }
        ColorScheme colorScheme = backgroundColor;
        if (partialStackComponent == null || (background = partialStackComponent.getBackground()) == null) {
            background = this.partial.getBackground();
        }
        Background background2 = background;
        if (partialStackComponent == null || (padding = partialStackComponent.getPadding()) == null) {
            padding = this.partial.getPadding();
        }
        Padding padding2 = padding;
        if (partialStackComponent == null || (margin = partialStackComponent.getMargin()) == null) {
            margin = this.partial.getMargin();
        }
        Padding padding3 = margin;
        if (partialStackComponent == null || (shape = partialStackComponent.getShape()) == null) {
            shape = this.partial.getShape();
        }
        Shape shape2 = shape;
        if (partialStackComponent == null || (border = partialStackComponent.getBorder()) == null) {
            border = this.partial.getBorder();
        }
        Border border2 = border;
        if (partialStackComponent == null || (shadow = partialStackComponent.getShadow()) == null) {
            shadow = this.partial.getShadow();
        }
        Shadow shadow2 = shadow;
        if (partialStackComponent == null || (badge = partialStackComponent.getBadge()) == null) {
            badge = this.partial.getBadge();
        }
        Badge badge2 = badge;
        if (partialStackComponent == null || (overflow = partialStackComponent.getOverflow()) == null) {
            overflow = this.partial.getOverflow();
        }
        return new PresentedStackPartial(backgroundStyles2, borderStyles2, shadowStyles2, badgeStyle2, new PartialStackComponent(bool, dimension2, size2, f, colorScheme, background2, padding2, padding3, shape2, border2, shadow2, badge2, overflow));
    }
}
