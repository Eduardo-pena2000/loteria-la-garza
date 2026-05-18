package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import Ca.o;
import androidx.compose.foundation.a;
import androidx.compose.ui.draw.b;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.d;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.jvm.internal.t;
import s0.h;
import v0.E1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class BackgroundKt {
    public static final /* synthetic */ e background(e eVar, ColorStyle color, E1 shape) {
        t.g(eVar, "<this>");
        t.g(color, "color");
        t.g(shape, "shape");
        if (color instanceof ColorStyle.Solid) {
            return a.c(eVar, ((ColorStyle.Solid) color).unbox-impl(), shape);
        }
        if (color instanceof ColorStyle.Gradient) {
            return a.a(eVar, ((ColorStyle.Gradient) color).unbox-impl(), shape, 1.0f);
        }
        throw new o();
    }

    public static /* synthetic */ e background$default(e eVar, ColorStyle colorStyle, E1 e1, int i, Object obj) {
        if ((i & 2) != 0) {
            e1 = t1.a();
        }
        return background(eVar, colorStyle, e1);
    }

    public static final /* synthetic */ e background(e eVar, BackgroundStyle background, E1 shape) {
        t.g(eVar, "<this>");
        t.g(background, "background");
        t.g(shape, "shape");
        if (background instanceof BackgroundStyle.Color) {
            return background(eVar, ((BackgroundStyle.Color) background).unbox-impl(), shape);
        }
        if (background instanceof BackgroundStyle.Image) {
            BackgroundStyle.Image image = (BackgroundStyle.Image) background;
            return b.b(h.a(eVar, shape), image.getPainter(), false, o0.e.a.m(), image.getContentScale(), 0.0f, (d) null, 50, (Object) null);
        }
        if (background instanceof BackgroundStyle.Video) {
            return eVar;
        }
        throw new o();
    }

    public static /* synthetic */ e background$default(e eVar, BackgroundStyle backgroundStyle, E1 e1, int i, Object obj) {
        if ((i & 2) != 0) {
            e1 = t1.a();
        }
        return background(eVar, backgroundStyle, e1);
    }
}
