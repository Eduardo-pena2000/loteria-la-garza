package com.revenuecat.purchases.ui.revenuecatui.components.style;

import Ca.I;
import Da.v;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class IconComponentStyleKt {
    public static final /* synthetic */ Result toBackground(IconComponent.IconBackground iconBackground, Map aliases) {
        t.g(iconBackground, "<this>");
        t.g(aliases, "aliases");
        Result colorStyles = ColorStyleKt.toColorStyles(iconBackground.getColor(), aliases);
        Border border = iconBackground.getBorder();
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, aliases) : null);
        Shadow shadow = iconBackground.getShadow();
        Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, aliases) : null);
        I i = I.a;
        Result.Success success = new Result.Success(i);
        Result.Success success2 = new Result.Success(i);
        Result.Success success3 = new Result.Success(i);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(colorStyles, orSuccessfullyNull, orSuccessfullyNull2, success, success2, success3)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(colorStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) colorStyles).getValue();
        t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) orSuccessfullyNull).getValue();
        t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) orSuccessfullyNull2).getValue();
        Object value4 = success.getValue();
        Object value5 = success2.getValue();
        return new Result.Success(new IconComponentStyle.Background((ColorStyles) value, iconBackground.getShape(), (BorderStyles) value2, (ShadowStyles) value3));
    }
}
