package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Da.v;
import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
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
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PresentedTabsPartial implements PresentedPartial {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final BackgroundStyles backgroundStyles;
    private final BorderStyles borderStyles;
    private final PartialTabsComponent partial;
    private final ShadowStyles shadowStyles;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles] */
        public final /* synthetic */ Result invoke(PartialTabsComponent from, Map aliases) {
            t.g(from, "from");
            t.g(aliases, "aliases");
            Background background = from.getBackground();
            BackgroundStyles.Color color = null;
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(background != null ? BackgroundStyleKt.toBackgroundStyles(background, aliases) : null);
            ColorScheme backgroundColor = from.getBackgroundColor();
            Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(backgroundColor != null ? ColorStyleKt.toColorStyles(backgroundColor, aliases) : null);
            Border border = from.getBorder();
            Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, aliases) : null);
            Shadow shadow = from.getShadow();
            Result orSuccessfullyNull4 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, aliases) : null);
            I i = I.a;
            Result.Success success = new Result.Success(i);
            Result.Success success2 = new Result.Success(i);
            NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(orSuccessfullyNull, orSuccessfullyNull2, orSuccessfullyNull3, orSuccessfullyNull4, success, success2)));
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
            Object value5 = success.getValue();
            ShadowStyles shadowStyles = (ShadowStyles) value4;
            BorderStyles borderStyles = (BorderStyles) value3;
            ColorStyles colorStyles = (ColorStyles) value2;
            ?? r0 = (BackgroundStyles) value;
            if (r0 == 0) {
                ColorStyles colorStyles2 = colorStyles != null ? BackgroundStyles.Color.constructor-impl(colorStyles) : null;
                if (colorStyles2 != null) {
                    color = BackgroundStyles.Color.box-impl(colorStyles2);
                }
            } else {
                color = r0;
            }
            return new Result.Success(new PresentedTabsPartial(color, borderStyles, shadowStyles, from));
        }

        private Companion() {
        }
    }

    public PresentedTabsPartial(BackgroundStyles backgroundStyles, BorderStyles borderStyles, ShadowStyles shadowStyles, PartialTabsComponent partial) {
        t.g(partial, "partial");
        this.backgroundStyles = backgroundStyles;
        this.borderStyles = borderStyles;
        this.shadowStyles = shadowStyles;
        this.partial = partial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedTabsPartial)) {
            return false;
        }
        PresentedTabsPartial presentedTabsPartial = (PresentedTabsPartial) obj;
        return t.c(this.backgroundStyles, presentedTabsPartial.backgroundStyles) && t.c(this.borderStyles, presentedTabsPartial.borderStyles) && t.c(this.shadowStyles, presentedTabsPartial.shadowStyles) && t.c(this.partial, presentedTabsPartial.partial);
    }

    public final /* synthetic */ BackgroundStyles getBackgroundStyles() {
        return this.backgroundStyles;
    }

    public final /* synthetic */ BorderStyles getBorderStyles() {
        return this.borderStyles;
    }

    public final /* synthetic */ PartialTabsComponent getPartial() {
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
        return ((hashCode2 + (shadowStyles != null ? shadowStyles.hashCode() : 0)) * 31) + this.partial.hashCode();
    }

    public String toString() {
        return "PresentedTabsPartial(backgroundStyles=" + this.backgroundStyles + ", borderStyles=" + this.borderStyles + ", shadowStyles=" + this.shadowStyles + ", partial=" + this.partial + ')';
    }

    public PresentedTabsPartial combine(PresentedTabsPartial presentedTabsPartial) {
        BackgroundStyles backgroundStyles;
        BorderStyles borderStyles;
        ShadowStyles shadowStyles;
        Boolean visible;
        Size size;
        Padding padding;
        Padding margin;
        ColorScheme backgroundColor;
        Background background;
        Shape shape;
        Border border;
        Shadow shadow;
        PartialTabsComponent partialTabsComponent = presentedTabsPartial != null ? presentedTabsPartial.partial : null;
        if (presentedTabsPartial == null || (backgroundStyles = presentedTabsPartial.backgroundStyles) == null) {
            backgroundStyles = this.backgroundStyles;
        }
        if (presentedTabsPartial == null || (borderStyles = presentedTabsPartial.borderStyles) == null) {
            borderStyles = this.borderStyles;
        }
        if (presentedTabsPartial == null || (shadowStyles = presentedTabsPartial.shadowStyles) == null) {
            shadowStyles = this.shadowStyles;
        }
        if (partialTabsComponent == null || (visible = partialTabsComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        Boolean bool = visible;
        if (partialTabsComponent == null || (size = partialTabsComponent.getSize()) == null) {
            size = this.partial.getSize();
        }
        Size size2 = size;
        if (partialTabsComponent == null || (padding = partialTabsComponent.getPadding()) == null) {
            padding = this.partial.getPadding();
        }
        Padding padding2 = padding;
        if (partialTabsComponent == null || (margin = partialTabsComponent.getMargin()) == null) {
            margin = this.partial.getMargin();
        }
        Padding padding3 = margin;
        if (partialTabsComponent == null || (backgroundColor = partialTabsComponent.getBackgroundColor()) == null) {
            backgroundColor = this.partial.getBackgroundColor();
        }
        ColorScheme colorScheme = backgroundColor;
        if (partialTabsComponent == null || (background = partialTabsComponent.getBackground()) == null) {
            background = this.partial.getBackground();
        }
        Background background2 = background;
        if (partialTabsComponent == null || (shape = partialTabsComponent.getShape()) == null) {
            shape = this.partial.getShape();
        }
        Shape shape2 = shape;
        if (partialTabsComponent == null || (border = partialTabsComponent.getBorder()) == null) {
            border = this.partial.getBorder();
        }
        Border border2 = border;
        if (partialTabsComponent == null || (shadow = partialTabsComponent.getShadow()) == null) {
            shadow = this.partial.getShadow();
        }
        return new PresentedTabsPartial(backgroundStyles, borderStyles, shadowStyles, new PartialTabsComponent(bool, size2, padding2, padding3, colorScheme, background2, shape2, border2, shadow));
    }
}
