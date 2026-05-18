package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Da.v;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.PartialIconComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PresentedIconPartial implements PresentedPartial {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final IconComponentStyle.Background background;
    private final ColorStyles colorStyles;
    private final PartialIconComponent partial;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final /* synthetic */ Result invoke(PartialIconComponent from, Map aliases) {
            t.g(from, "from");
            t.g(aliases, "aliases");
            ColorScheme color = from.getColor();
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(color != null ? ColorStyleKt.toColorStyles(color, aliases) : null);
            IconComponent.IconBackground iconBackground = from.getIconBackground();
            Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(iconBackground != null ? IconComponentStyleKt.toBackground(iconBackground, aliases) : null);
            I i = I.a;
            Result.Success success = new Result.Success(i);
            Result.Success success2 = new Result.Success(i);
            Result.Success success3 = new Result.Success(i);
            Result.Success success4 = new Result.Success(i);
            NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(orSuccessfullyNull, orSuccessfullyNull2, success, success2, success3, success4)));
            if (nonEmptyListOrNull != null) {
                return new Result.Error(nonEmptyListOrNull);
            }
            t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value = ((Result.Success) orSuccessfullyNull).getValue();
            t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value2 = ((Result.Success) orSuccessfullyNull2).getValue();
            Object value3 = success.getValue();
            Object value4 = success2.getValue();
            Object value5 = success3.getValue();
            return new Result.Success(new PresentedIconPartial((ColorStyles) value, (IconComponentStyle.Background) value2, from));
        }

        private Companion() {
        }
    }

    public PresentedIconPartial(ColorStyles colorStyles, IconComponentStyle.Background background, PartialIconComponent partial) {
        t.g(partial, "partial");
        this.colorStyles = colorStyles;
        this.background = background;
        this.partial = partial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedIconPartial)) {
            return false;
        }
        PresentedIconPartial presentedIconPartial = (PresentedIconPartial) obj;
        return t.c(this.colorStyles, presentedIconPartial.colorStyles) && t.c(this.background, presentedIconPartial.background) && t.c(this.partial, presentedIconPartial.partial);
    }

    public final /* synthetic */ IconComponentStyle.Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ ColorStyles getColorStyles() {
        return this.colorStyles;
    }

    public final /* synthetic */ PartialIconComponent getPartial() {
        return this.partial;
    }

    public int hashCode() {
        ColorStyles colorStyles = this.colorStyles;
        int hashCode = (colorStyles == null ? 0 : colorStyles.hashCode()) * 31;
        IconComponentStyle.Background background = this.background;
        return ((hashCode + (background != null ? background.hashCode() : 0)) * 31) + this.partial.hashCode();
    }

    public String toString() {
        return "PresentedIconPartial(colorStyles=" + this.colorStyles + ", background=" + this.background + ", partial=" + this.partial + ')';
    }

    public PresentedIconPartial combine(PresentedIconPartial presentedIconPartial) {
        ColorStyles colorStyles;
        IconComponentStyle.Background background;
        Boolean visible;
        String baseUrl;
        String iconName;
        IconComponent.Formats formats;
        Size size;
        ColorScheme color;
        Padding padding;
        Padding margin;
        IconComponent.IconBackground iconBackground;
        PartialIconComponent partialIconComponent = presentedIconPartial != null ? presentedIconPartial.partial : null;
        if (presentedIconPartial == null || (colorStyles = presentedIconPartial.colorStyles) == null) {
            colorStyles = this.colorStyles;
        }
        if (presentedIconPartial == null || (background = presentedIconPartial.background) == null) {
            background = this.background;
        }
        if (partialIconComponent == null || (visible = partialIconComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        Boolean bool = visible;
        if (partialIconComponent == null || (baseUrl = partialIconComponent.getBaseUrl()) == null) {
            baseUrl = this.partial.getBaseUrl();
        }
        String str = baseUrl;
        if (partialIconComponent == null || (iconName = partialIconComponent.getIconName()) == null) {
            iconName = this.partial.getIconName();
        }
        String str2 = iconName;
        if (partialIconComponent == null || (formats = partialIconComponent.getFormats()) == null) {
            formats = this.partial.getFormats();
        }
        IconComponent.Formats formats2 = formats;
        if (partialIconComponent == null || (size = partialIconComponent.getSize()) == null) {
            size = this.partial.getSize();
        }
        Size size2 = size;
        if (partialIconComponent == null || (color = partialIconComponent.getColor()) == null) {
            color = this.partial.getColor();
        }
        ColorScheme colorScheme = color;
        if (partialIconComponent == null || (padding = partialIconComponent.getPadding()) == null) {
            padding = this.partial.getPadding();
        }
        Padding padding2 = padding;
        if (partialIconComponent == null || (margin = partialIconComponent.getMargin()) == null) {
            margin = this.partial.getMargin();
        }
        Padding padding3 = margin;
        if (partialIconComponent == null || (iconBackground = partialIconComponent.getIconBackground()) == null) {
            iconBackground = this.partial.getIconBackground();
        }
        return new PresentedIconPartial(colorStyles, background, new PartialIconComponent(bool, str, str2, formats2, size2, colorScheme, padding2, padding3, iconBackground));
    }
}
