package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Ca.o;
import Da.v;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpecKt;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LocalizedTextPartial implements PresentedPartial {
    private final ColorStyles backgroundColor;
    private final ColorStyles color;
    private final FontSpec fontSpec;
    private final PartialTextComponent partial;
    private final NonEmptyMap texts;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final /* synthetic */ Result invoke(PartialTextComponent from, NonEmptyMap using, Map aliases, Map fontAliases) {
            Result result;
            t.g(from, "from");
            t.g(using, "using");
            t.g(aliases, "aliases");
            t.g(fontAliases, "fontAliases");
            String str = from.getText-sa7TU9Q();
            Result result2 = null;
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(str != null ? LocalizationKt.stringForAllLocales-7v81vok(using, str) : null);
            ColorScheme color = from.getColor();
            Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(color != null ? ColorStyleKt.toColorStyles(color, aliases) : null);
            ColorScheme backgroundColor = from.getBackgroundColor();
            Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(backgroundColor != null ? ColorStyleKt.toColorStyles(backgroundColor, aliases) : null);
            String str2 = from.getFontName-ARcRonI();
            if (str2 != null && (result = FontSpecKt.getFontSpec-pDyximM(fontAliases, str2)) != null) {
                result2 = FontSpecKt.recoverFromFontAliasError(result);
            }
            Result orSuccessfullyNull4 = ResultKt.orSuccessfullyNull(result2);
            if (!(orSuccessfullyNull4 instanceof Result.Success)) {
                if (!(orSuccessfullyNull4 instanceof Result.Error)) {
                    throw new o();
                }
                orSuccessfullyNull4 = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) orSuccessfullyNull4).getValue(), new PaywallValidationError[0]));
            }
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
            return new Result.Success(new LocalizedTextPartial((NonEmptyMap) value, (ColorStyles) value2, (ColorStyles) value3, (FontSpec) value4, from, null));
        }

        private Companion() {
        }
    }

    public /* synthetic */ LocalizedTextPartial(NonEmptyMap nonEmptyMap, ColorStyles colorStyles, ColorStyles colorStyles2, FontSpec fontSpec, PartialTextComponent partialTextComponent, k kVar) {
        this(nonEmptyMap, colorStyles, colorStyles2, fontSpec, partialTextComponent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalizedTextPartial)) {
            return false;
        }
        LocalizedTextPartial localizedTextPartial = (LocalizedTextPartial) obj;
        return t.c(this.texts, localizedTextPartial.texts) && t.c(this.color, localizedTextPartial.color) && t.c(this.backgroundColor, localizedTextPartial.backgroundColor) && t.c(this.fontSpec, localizedTextPartial.fontSpec) && t.c(this.partial, localizedTextPartial.partial);
    }

    public final /* synthetic */ ColorStyles getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ ColorStyles getColor() {
        return this.color;
    }

    public final /* synthetic */ FontSpec getFontSpec() {
        return this.fontSpec;
    }

    public final /* synthetic */ PartialTextComponent getPartial() {
        return this.partial;
    }

    public final /* synthetic */ NonEmptyMap getTexts() {
        return this.texts;
    }

    public int hashCode() {
        NonEmptyMap nonEmptyMap = this.texts;
        int hashCode = (nonEmptyMap == null ? 0 : nonEmptyMap.hashCode()) * 31;
        ColorStyles colorStyles = this.color;
        int hashCode2 = (hashCode + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31;
        ColorStyles colorStyles2 = this.backgroundColor;
        int hashCode3 = (hashCode2 + (colorStyles2 == null ? 0 : colorStyles2.hashCode())) * 31;
        FontSpec fontSpec = this.fontSpec;
        return ((hashCode3 + (fontSpec != null ? fontSpec.hashCode() : 0)) * 31) + this.partial.hashCode();
    }

    public String toString() {
        return "LocalizedTextPartial(texts=" + this.texts + ", color=" + this.color + ", backgroundColor=" + this.backgroundColor + ", fontSpec=" + this.fontSpec + ", partial=" + this.partial + ')';
    }

    private LocalizedTextPartial(NonEmptyMap nonEmptyMap, ColorStyles colorStyles, ColorStyles colorStyles2, FontSpec fontSpec, PartialTextComponent partialTextComponent) {
        this.texts = nonEmptyMap;
        this.color = colorStyles;
        this.backgroundColor = colorStyles2;
        this.fontSpec = fontSpec;
        this.partial = partialTextComponent;
    }

    public /* synthetic */ LocalizedTextPartial combine(LocalizedTextPartial localizedTextPartial) {
        NonEmptyMap nonEmptyMap;
        ColorStyles colorStyles;
        ColorStyles colorStyles2;
        FontSpec fontSpec;
        Boolean visible;
        String str;
        ColorScheme color;
        ColorScheme backgroundColor;
        String str2;
        FontWeight fontWeight;
        Integer fontWeightInt;
        Integer fontSize;
        HorizontalAlignment horizontalAlignment;
        Size size;
        Padding padding;
        Padding margin;
        PartialTextComponent partialTextComponent = localizedTextPartial != null ? localizedTextPartial.partial : null;
        if (localizedTextPartial == null || (nonEmptyMap = localizedTextPartial.texts) == null) {
            nonEmptyMap = this.texts;
        }
        NonEmptyMap nonEmptyMap2 = nonEmptyMap;
        if (localizedTextPartial == null || (colorStyles = localizedTextPartial.color) == null) {
            colorStyles = this.color;
        }
        ColorStyles colorStyles3 = colorStyles;
        if (localizedTextPartial == null || (colorStyles2 = localizedTextPartial.backgroundColor) == null) {
            colorStyles2 = this.backgroundColor;
        }
        ColorStyles colorStyles4 = colorStyles2;
        if (localizedTextPartial == null || (fontSpec = localizedTextPartial.fontSpec) == null) {
            fontSpec = this.fontSpec;
        }
        FontSpec fontSpec2 = fontSpec;
        if (partialTextComponent == null || (visible = partialTextComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        Boolean bool = visible;
        if (partialTextComponent == null || (str = partialTextComponent.getText-sa7TU9Q()) == null) {
            str = this.partial.getText-sa7TU9Q();
        }
        String str3 = str;
        if (partialTextComponent == null || (color = partialTextComponent.getColor()) == null) {
            color = this.partial.getColor();
        }
        ColorScheme colorScheme = color;
        if (partialTextComponent == null || (backgroundColor = partialTextComponent.getBackgroundColor()) == null) {
            backgroundColor = this.partial.getBackgroundColor();
        }
        ColorScheme colorScheme2 = backgroundColor;
        if (partialTextComponent == null || (str2 = partialTextComponent.getFontName-ARcRonI()) == null) {
            str2 = this.partial.getFontName-ARcRonI();
        }
        String str4 = str2;
        if (partialTextComponent == null || (fontWeight = partialTextComponent.getFontWeight()) == null) {
            fontWeight = this.partial.getFontWeight();
        }
        FontWeight fontWeight2 = fontWeight;
        if (partialTextComponent == null || (fontWeightInt = partialTextComponent.getFontWeightInt()) == null) {
            fontWeightInt = this.partial.getFontWeightInt();
        }
        Integer num = fontWeightInt;
        if (partialTextComponent == null || (fontSize = partialTextComponent.getFontSize()) == null) {
            fontSize = this.partial.getFontSize();
        }
        Integer num2 = fontSize;
        if (partialTextComponent == null || (horizontalAlignment = partialTextComponent.getHorizontalAlignment()) == null) {
            horizontalAlignment = this.partial.getHorizontalAlignment();
        }
        HorizontalAlignment horizontalAlignment2 = horizontalAlignment;
        if (partialTextComponent == null || (size = partialTextComponent.getSize()) == null) {
            size = this.partial.getSize();
        }
        Size size2 = size;
        if (partialTextComponent == null || (padding = partialTextComponent.getPadding()) == null) {
            padding = this.partial.getPadding();
        }
        Padding padding2 = padding;
        if (partialTextComponent == null || (margin = partialTextComponent.getMargin()) == null) {
            margin = this.partial.getMargin();
        }
        return new LocalizedTextPartial(nonEmptyMap2, colorStyles3, colorStyles4, fontSpec2, new PartialTextComponent(bool, str3, colorScheme, colorScheme2, str4, fontWeight2, num, num2, horizontalAlignment2, size2, padding2, margin, (k) null));
    }
}
