package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import Ca.o;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.Map;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BorderStyleKt {
    public static final /* synthetic */ BorderStyle rememberBorderStyle(BorderStyles border, m mVar, int i) {
        t.g(border, "border");
        mVar.V(1521770814);
        if (w.L()) {
            w.U(1521770814, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberBorderStyle (BorderStyle.kt:49)");
        }
        ColorStyle forCurrentTheme = ColorStyleKt.getForCurrentTheme(border.getColors(), mVar, 0);
        mVar.V(1248885673);
        boolean U = mVar.U(forCurrentTheme);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = new BorderStyle(border.getWidth-D9Ej5fM(), forCurrentTheme, null);
            mVar.t(C);
        }
        BorderStyle borderStyle = (BorderStyle) C;
        mVar.P();
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return borderStyle;
    }

    public static final /* synthetic */ Result toBorderStyles(Border border, Map aliases) {
        t.g(border, "<this>");
        t.g(aliases, "aliases");
        Result colorStyles = ColorStyleKt.toColorStyles(border.getColor(), aliases);
        if (colorStyles instanceof Result.Success) {
            return new Result.Success(new BorderStyles(h.g((float) border.getWidth()), (ColorStyles) ((Result.Success) colorStyles).getValue(), null));
        }
        if (colorStyles instanceof Result.Error) {
            return colorStyles;
        }
        throw new o();
    }
}
