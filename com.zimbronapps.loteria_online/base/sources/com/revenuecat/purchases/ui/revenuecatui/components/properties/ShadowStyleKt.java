package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import Ca.o;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import java.util.Map;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ShadowStyleKt {
    public static final /* synthetic */ ShadowStyle rememberShadowStyle(ShadowStyles shadow, m mVar, int i) {
        t.g(shadow, "shadow");
        mVar.V(1695935038);
        if (w.L()) {
            w.U(1695935038, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberShadowStyle (ShadowStyle.kt:55)");
        }
        ColorStyle forCurrentTheme = ColorStyleKt.getForCurrentTheme(shadow.getColors(), mVar, 0);
        mVar.V(-634727445);
        boolean U = mVar.U(forCurrentTheme);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = new ShadowStyle(forCurrentTheme, shadow.getRadius-D9Ej5fM(), shadow.getX-D9Ej5fM(), shadow.getY-D9Ej5fM(), null);
            mVar.t(C);
        }
        ShadowStyle shadowStyle = (ShadowStyle) C;
        mVar.P();
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return shadowStyle;
    }

    public static final /* synthetic */ Result toShadowStyles(Shadow shadow, Map aliases) {
        t.g(shadow, "<this>");
        t.g(aliases, "aliases");
        Result colorStyles = ColorStyleKt.toColorStyles(shadow.getColor(), aliases);
        if (colorStyles instanceof Result.Success) {
            return new Result.Success(new ShadowStyles((ColorStyles) ((Result.Success) colorStyles).getValue(), h.g((float) shadow.getRadius()), h.g((float) shadow.getX()), h.g((float) shadow.getY()), null));
        }
        if (colorStyles instanceof Result.Error) {
            return colorStyles;
        }
        throw new o();
    }
}
