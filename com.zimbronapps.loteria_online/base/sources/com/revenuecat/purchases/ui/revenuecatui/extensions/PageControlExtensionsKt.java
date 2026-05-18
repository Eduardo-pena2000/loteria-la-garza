package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Da.v;
import F.L;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class PageControlExtensionsKt {
    public static final /* synthetic */ Result toPageControlStyles(CarouselComponent.PageControl pageControl, Map aliases) {
        t.g(pageControl, "<this>");
        t.g(aliases, "aliases");
        Result colorStyles = ColorStyleKt.toColorStyles(pageControl.getActive().getColor(), aliases);
        Result colorStyles2 = ColorStyleKt.toColorStyles(pageControl.getDefault().getColor(), aliases);
        ColorScheme backgroundColor = pageControl.getBackgroundColor();
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(backgroundColor != null ? ColorStyleKt.toColorStyles(backgroundColor, aliases) : null);
        Border border = pageControl.getBorder();
        Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, aliases) : null);
        Shadow shadow = pageControl.getShadow();
        Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, aliases) : null);
        ColorScheme strokeColor = pageControl.getActive().getStrokeColor();
        Result orSuccessfullyNull4 = ResultKt.orSuccessfullyNull(strokeColor != null ? ColorStyleKt.toColorStyles(strokeColor, aliases) : null);
        ColorScheme strokeColor2 = pageControl.getDefault().getStrokeColor();
        Result orSuccessfullyNull5 = ResultKt.orSuccessfullyNull(strokeColor2 != null ? ColorStyleKt.toColorStyles(strokeColor2, aliases) : null);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(colorStyles, colorStyles2, orSuccessfullyNull, orSuccessfullyNull2, orSuccessfullyNull3, orSuccessfullyNull4)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(colorStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) colorStyles).getValue();
        t.e(colorStyles2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) colorStyles2).getValue();
        t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) orSuccessfullyNull).getValue();
        t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) orSuccessfullyNull2).getValue();
        t.e(orSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) orSuccessfullyNull3).getValue();
        t.e(orSuccessfullyNull4, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<F of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value6 = ((Result.Success) orSuccessfullyNull4).getValue();
        t.e(orSuccessfullyNull5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<G of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        ColorStyles colorStyles3 = (ColorStyles) ((Result.Success) orSuccessfullyNull5).getValue();
        ColorStyles colorStyles4 = (ColorStyles) value6;
        ShadowStyles shadowStyles = (ShadowStyles) value5;
        BorderStyles borderStyles = (BorderStyles) value4;
        ColorStyles colorStyles5 = (ColorStyles) value3;
        ColorStyles colorStyles6 = (ColorStyles) value2;
        ColorStyles colorStyles7 = (ColorStyles) value;
        CarouselComponent.PageControl.Position position = pageControl.getPosition();
        float g = h.g(pageControl.getSpacing() != null ? r3.intValue() : 0);
        L paddingValues = PaddingKt.toPaddingValues(pageControl.getPadding());
        L paddingValues2 = PaddingKt.toPaddingValues(pageControl.getMargin());
        Shape.Rectangle shape = pageControl.getShape();
        if (shape == null) {
            shape = StyleFactory.Companion.getDEFAULT_SHAPE$revenuecatui_defaultsBc8Release();
        }
        return new Result.Success(new CarouselComponentStyle.PageControlStyles(position, g, paddingValues, paddingValues2, colorStyles5, shape, borderStyles, shadowStyles, new CarouselComponentStyle.IndicatorStyles(h.g(pageControl.getActive().getWidth-pVg5ArA()), h.g(pageControl.getActive().getHeight-pVg5ArA()), colorStyles7, colorStyles4, pageControl.getActive().getStrokeWidth-0hXNFcg() != null ? h.d(h.g(r3.f())) : null, null), new CarouselComponentStyle.IndicatorStyles(h.g(pageControl.getDefault().getWidth-pVg5ArA()), h.g(pageControl.getDefault().getHeight-pVg5ArA()), colorStyles6, colorStyles3, pageControl.getDefault().getStrokeWidth-0hXNFcg() != null ? h.d(h.g(r2.f())) : null, null), null));
    }
}
