package com.revenuecat.purchases.ui.revenuecatui.components.modifier;

import Ca.I;
import Qa.l;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.d;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import s0.k;
import v0.E1;
import v0.i1;
import v0.j1;
import v0.t1;
import x0.c;
import x0.f;
import x0.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class OverlayKt {

    public static final class 1 extends u implements l {
        final /* synthetic */ ColorStyle $color;
        final /* synthetic */ E1 $shape;

        public static final class 1 extends u implements l {
            final /* synthetic */ ColorStyle $color;
            final /* synthetic */ i1 $outline;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(ColorStyle colorStyle, i1 i1Var) {
                super(1);
                this.$color = colorStyle;
                this.$outline = i1Var;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((c) obj);
                return I.a;
            }

            public final void invoke(c onDrawWithContent) {
                t.g(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.B1();
                ColorStyle colorStyle = this.$color;
                if (colorStyle instanceof ColorStyle.Solid) {
                    j1.e(onDrawWithContent, this.$outline, ((ColorStyle.Solid) colorStyle).unbox-impl(), 0.0f, (g) null, (d) null, 0, 60, (Object) null);
                } else if (colorStyle instanceof ColorStyle.Gradient) {
                    j1.c(onDrawWithContent, this.$outline, ((ColorStyle.Gradient) colorStyle).unbox-impl(), 0.0f, (g) null, (d) null, 0, 60, (Object) null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(E1 e1, ColorStyle colorStyle) {
            super(1);
            this.$shape = e1;
            this.$color = colorStyle;
        }

        public final k invoke(s0.g drawWithCache) {
            t.g(drawWithCache, "$this$drawWithCache");
            return drawWithCache.p(new 1(this.$color, this.$shape.createOutline-Pq9zytI(drawWithCache.e(), drawWithCache.getLayoutDirection(), drawWithCache)));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ ColorStyle $color;
        final /* synthetic */ E1 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(E1 e1, ColorStyle colorStyle) {
            super(1);
            this.$shape = e1;
            this.$color = colorStyle;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((f) obj);
            return I.a;
        }

        public final void invoke(f drawBehind) {
            t.g(drawBehind, "$this$drawBehind");
            i1 i1Var = this.$shape.createOutline-Pq9zytI(drawBehind.e(), drawBehind.getLayoutDirection(), drawBehind);
            ColorStyle colorStyle = this.$color;
            if (colorStyle instanceof ColorStyle.Solid) {
                j1.e(drawBehind, i1Var, ((ColorStyle.Solid) colorStyle).unbox-impl(), 0.0f, (g) null, (d) null, 0, 60, (Object) null);
            } else if (colorStyle instanceof ColorStyle.Gradient) {
                j1.c(drawBehind, i1Var, ((ColorStyle.Gradient) colorStyle).unbox-impl(), 0.0f, (g) null, (d) null, 0, 60, (Object) null);
            }
        }
    }

    public static final /* synthetic */ e overlay(e eVar, ColorStyle color, E1 shape) {
        t.g(eVar, "<this>");
        t.g(color, "color");
        t.g(shape, "shape");
        return a.c(eVar, new 1(shape, color));
    }

    public static /* synthetic */ e overlay$default(e eVar, ColorStyle colorStyle, E1 e1, int i, Object obj) {
        if ((i & 2) != 0) {
            e1 = t1.a();
        }
        return overlay(eVar, colorStyle, e1);
    }

    public static final /* synthetic */ e underlay(e eVar, ColorStyle color, E1 shape) {
        t.g(eVar, "<this>");
        t.g(color, "color");
        t.g(shape, "shape");
        return a.b(eVar, new 1(shape, color));
    }

    public static /* synthetic */ e underlay$default(e eVar, ColorStyle colorStyle, E1 e1, int i, Object obj) {
        if ((i & 2) != 0) {
            e1 = t1.a();
        }
        return underlay(eVar, colorStyle, e1);
    }
}
