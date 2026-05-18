package com.revenuecat.purchases.ui.revenuecatui.components;

import Ca.I;
import Da.v;
import com.revenuecat.purchases.paywalls.components.PartialVideoComponent;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PresentedVideoPartial implements PresentedPartial {
    private final BorderStyles border;
    private final NonEmptyMap fallbackSources;
    private final ColorStyles overlay;
    private final PartialVideoComponent partial;
    private final ShadowStyles shadow;
    private final NonEmptyMap sources;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final /* synthetic */ Result invoke(PartialVideoComponent from, NonEmptyMap nonEmptyMap, NonEmptyMap nonEmptyMap2, Map aliases) {
            t.g(from, "from");
            t.g(aliases, "aliases");
            ColorScheme colorOverlay = from.getColorOverlay();
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(colorOverlay != null ? ColorStyleKt.toColorStyles(colorOverlay, aliases) : null);
            Border border = from.getBorder();
            Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, aliases) : null);
            Shadow shadow = from.getShadow();
            Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, aliases) : null);
            I i = I.a;
            Result.Success success = new Result.Success(i);
            Result.Success success2 = new Result.Success(i);
            Result.Success success3 = new Result.Success(i);
            NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(orSuccessfullyNull, orSuccessfullyNull2, orSuccessfullyNull3, success, success2, success3)));
            if (nonEmptyListOrNull != null) {
                return new Result.Error(nonEmptyListOrNull);
            }
            t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value = ((Result.Success) orSuccessfullyNull).getValue();
            t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value2 = ((Result.Success) orSuccessfullyNull2).getValue();
            t.e(orSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value3 = ((Result.Success) orSuccessfullyNull3).getValue();
            Object value4 = success.getValue();
            Object value5 = success2.getValue();
            return new Result.Success(new PresentedVideoPartial(nonEmptyMap, nonEmptyMap2, (ColorStyles) value, (BorderStyles) value2, (ShadowStyles) value3, from));
        }

        private Companion() {
        }
    }

    public PresentedVideoPartial(NonEmptyMap nonEmptyMap, NonEmptyMap nonEmptyMap2, ColorStyles colorStyles, BorderStyles borderStyles, ShadowStyles shadowStyles, PartialVideoComponent partial) {
        t.g(partial, "partial");
        this.sources = nonEmptyMap;
        this.fallbackSources = nonEmptyMap2;
        this.overlay = colorStyles;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.partial = partial;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentedVideoPartial)) {
            return false;
        }
        PresentedVideoPartial presentedVideoPartial = (PresentedVideoPartial) obj;
        return t.c(this.sources, presentedVideoPartial.sources) && t.c(this.fallbackSources, presentedVideoPartial.fallbackSources) && t.c(this.overlay, presentedVideoPartial.overlay) && t.c(this.border, presentedVideoPartial.border) && t.c(this.shadow, presentedVideoPartial.shadow) && t.c(this.partial, presentedVideoPartial.partial);
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ NonEmptyMap getFallbackSources() {
        return this.fallbackSources;
    }

    public final /* synthetic */ ColorStyles getOverlay() {
        return this.overlay;
    }

    public final /* synthetic */ PartialVideoComponent getPartial() {
        return this.partial;
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ NonEmptyMap getSources() {
        return this.sources;
    }

    public int hashCode() {
        NonEmptyMap nonEmptyMap = this.sources;
        int hashCode = (nonEmptyMap == null ? 0 : nonEmptyMap.hashCode()) * 31;
        NonEmptyMap nonEmptyMap2 = this.fallbackSources;
        int hashCode2 = (hashCode + (nonEmptyMap2 == null ? 0 : nonEmptyMap2.hashCode())) * 31;
        ColorStyles colorStyles = this.overlay;
        int hashCode3 = (hashCode2 + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31;
        BorderStyles borderStyles = this.border;
        int hashCode4 = (hashCode3 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        return ((hashCode4 + (shadowStyles != null ? shadowStyles.hashCode() : 0)) * 31) + this.partial.hashCode();
    }

    public String toString() {
        return "PresentedVideoPartial(sources=" + this.sources + ", fallbackSources=" + this.fallbackSources + ", overlay=" + this.overlay + ", border=" + this.border + ", shadow=" + this.shadow + ", partial=" + this.partial + ')';
    }

    public PresentedVideoPartial combine(PresentedVideoPartial presentedVideoPartial) {
        ColorStyles colorStyles;
        BorderStyles borderStyles;
        ShadowStyles shadowStyles;
        Boolean visible;
        ThemeVideoUrls source;
        ThemeImageUrls fallbackSource;
        Boolean showControls;
        Boolean autoplay;
        Boolean loop;
        Boolean muteAudio;
        Size size;
        FitMode fitMode;
        MaskShape maskShape;
        ColorScheme colorOverlay;
        Padding padding;
        Padding margin;
        Border border;
        Shadow shadow;
        NonEmptyMap nonEmptyMap = presentedVideoPartial != null ? presentedVideoPartial.sources : null;
        NonEmptyMap nonEmptyMap2 = presentedVideoPartial != null ? presentedVideoPartial.fallbackSources : null;
        PartialVideoComponent partialVideoComponent = presentedVideoPartial != null ? presentedVideoPartial.partial : null;
        if (nonEmptyMap == null) {
            nonEmptyMap = this.sources;
        }
        NonEmptyMap nonEmptyMap3 = nonEmptyMap;
        if (nonEmptyMap2 == null) {
            nonEmptyMap2 = this.fallbackSources;
        }
        NonEmptyMap nonEmptyMap4 = nonEmptyMap2;
        if (presentedVideoPartial == null || (colorStyles = presentedVideoPartial.overlay) == null) {
            colorStyles = this.overlay;
        }
        ColorStyles colorStyles2 = colorStyles;
        if (presentedVideoPartial == null || (borderStyles = presentedVideoPartial.border) == null) {
            borderStyles = this.border;
        }
        BorderStyles borderStyles2 = borderStyles;
        if (presentedVideoPartial == null || (shadowStyles = presentedVideoPartial.shadow) == null) {
            shadowStyles = this.shadow;
        }
        ShadowStyles shadowStyles2 = shadowStyles;
        if (partialVideoComponent == null || (visible = partialVideoComponent.getVisible()) == null) {
            visible = this.partial.getVisible();
        }
        Boolean bool = visible;
        if (partialVideoComponent == null || (source = partialVideoComponent.getSource()) == null) {
            source = this.partial.getSource();
        }
        ThemeVideoUrls themeVideoUrls = source;
        if (partialVideoComponent == null || (fallbackSource = partialVideoComponent.getFallbackSource()) == null) {
            fallbackSource = this.partial.getFallbackSource();
        }
        ThemeImageUrls themeImageUrls = fallbackSource;
        if (partialVideoComponent == null || (showControls = partialVideoComponent.getShowControls()) == null) {
            showControls = this.partial.getShowControls();
        }
        Boolean bool2 = showControls;
        if (partialVideoComponent == null || (autoplay = partialVideoComponent.getAutoplay()) == null) {
            autoplay = this.partial.getAutoplay();
        }
        Boolean bool3 = autoplay;
        if (partialVideoComponent == null || (loop = partialVideoComponent.getLoop()) == null) {
            loop = this.partial.getLoop();
        }
        Boolean bool4 = loop;
        if (partialVideoComponent == null || (muteAudio = partialVideoComponent.getMuteAudio()) == null) {
            muteAudio = this.partial.getMuteAudio();
        }
        Boolean bool5 = muteAudio;
        if (partialVideoComponent == null || (size = partialVideoComponent.getSize()) == null) {
            size = this.partial.getSize();
        }
        Size size2 = size;
        if (partialVideoComponent == null || (fitMode = partialVideoComponent.getFitMode()) == null) {
            fitMode = this.partial.getFitMode();
        }
        FitMode fitMode2 = fitMode;
        if (partialVideoComponent == null || (maskShape = partialVideoComponent.getMaskShape()) == null) {
            maskShape = this.partial.getMaskShape();
        }
        MaskShape maskShape2 = maskShape;
        if (partialVideoComponent == null || (colorOverlay = partialVideoComponent.getColorOverlay()) == null) {
            colorOverlay = this.partial.getColorOverlay();
        }
        ColorScheme colorScheme = colorOverlay;
        if (partialVideoComponent == null || (padding = partialVideoComponent.getPadding()) == null) {
            padding = this.partial.getPadding();
        }
        Padding padding2 = padding;
        if (partialVideoComponent == null || (margin = partialVideoComponent.getMargin()) == null) {
            margin = this.partial.getMargin();
        }
        Padding padding3 = margin;
        if (partialVideoComponent == null || (border = partialVideoComponent.getBorder()) == null) {
            border = this.partial.getBorder();
        }
        Border border2 = border;
        if (partialVideoComponent == null || (shadow = partialVideoComponent.getShadow()) == null) {
            shadow = this.partial.getShadow();
        }
        return new PresentedVideoPartial(nonEmptyMap3, nonEmptyMap4, colorStyles2, borderStyles2, shadowStyles2, new PartialVideoComponent(themeVideoUrls, themeImageUrls, bool, bool2, bool3, bool4, bool5, size2, fitMode2, maskShape2, colorScheme, padding2, padding3, border2, shadow, (String) null, 32768, (k) null));
    }
}
