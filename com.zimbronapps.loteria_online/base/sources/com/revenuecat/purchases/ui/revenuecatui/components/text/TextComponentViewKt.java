package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Ca.A;
import Ca.I;
import Da.v;
import Qa.p;
import X.F;
import X.X;
import X.l;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.U1;
import b0.g1;
import b0.h2;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import v0.E1;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class TextComponentViewKt {

    public static final class 1 extends u implements p {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(2);
        }

        public final e invoke(e applyIfNotNull, ColorStyle it) {
            t.g(applyIfNotNull, "$this$applyIfNotNull");
            t.g(it, "it");
            return BackgroundKt.background$default(applyIfNotNull, it, (E1) null, 2, (Object) null);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TextComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TextComponentStyle textComponentStyle, PaywallState.Loaded.Components components, e eVar, int i, int i2) {
            super(2);
            this.$style = textComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.TextComponentView(this.$style, this.$state, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_Customizations(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_Default(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_FontSize(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_HeadingXlExtraBold(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_HorizontalAlignment(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_LinearGradient(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_Markdown(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_MonospaceFont(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_RadialGradient(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_SansSerifFont(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TextComponentViewKt.access$TextComponentView_Preview_SerifFont(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TextComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle r58, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r59, androidx.compose.ui.e r60, b0.m r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentViewKt.TextComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void TextComponentView_Preview_Customizations(m mVar, int i) {
        m i2 = mVar.i(1310256028);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1310256028, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_Customizations (TextComponentView.kt:266)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.f(255, 0, 0, 0, 8, (Object) null))), null, 2, null);
            FontWeight fontWeight = FontWeight.BLACK;
            HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEADING;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Hello, world", colorStyles, 13, fontWeight, null, horizontalAlignment, horizontalAlignment, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(s0.f(222, 222, 222, 0, 8, (Object) null))), null, 2, null), false, null, new Padding(10.0d, 10.0d, 20.0d, 20.0d), new Padding(20.0d, 20.0d, 10.0d, 10.0d), null, null, null, null, 62224, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_Default(m mVar, int i) {
        m i2 = mVar.i(1838187961);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1838187961, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_Default (TextComponentView.kt:162)");
            }
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Hello, world", new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null), 0, null, null, null, null, null, false, null, null, null, null, null, null, null, 65532, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_FontSize(m mVar, int i) {
        m i2 = mVar.i(793345132);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(793345132, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_FontSize (TextComponentView.kt:236)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Hello, world", colorStyles, 28, null, null, null, null, null, false, new Size(fit, fit), null, null, null, null, null, null, 65016, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_HeadingXlExtraBold(m mVar, int i) {
        m i2 = mVar.i(-1682911299);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1682911299, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_HeadingXlExtraBold (TextComponentView.kt:174)");
            }
            F.a((l) null, (X) null, (X.r0) null, ComposableSingletons$TextComponentViewKt.INSTANCE.getLambda-2$revenuecatui_defaultsBc8Release(), i2, 3072, 7);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_HorizontalAlignment(m mVar, int i) {
        m i2 = mVar.i(-43764709);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-43764709, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_HorizontalAlignment (TextComponentView.kt:250)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null);
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Hello, world", colorStyles, 0, null, null, null, HorizontalAlignment.TRAILING, null, false, new Size(fit, fit), null, null, null, null, null, null, 64956, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), g.x(e.a, h.g(400), 0.0f, 2, (Object) null), i2, 384, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_LinearGradient(m mVar, int i) {
        m i2 = mVar.i(702292295);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(702292295, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_LinearGradient (TextComponentView.kt:298)");
            }
            r0.a aVar = r0.b;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Do not allow people to dim your shine because they are blinded. Tell them to put some sunglasses on.", new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(135.0f, v.q(new ColorInfo.Gradient.Point(s0.k(aVar.c()), 10.0f), new ColorInfo.Gradient.Point(s0.k(s0.f(0, 102, 255, 0, 8, (Object) null)), 30.0f), new ColorInfo.Gradient.Point(s0.k(s0.f(160, 0, 160, 0, 8, (Object) null)), 80.0f)))), null, 2, null), 15, FontWeight.MEDIUM, null, HorizontalAlignment.LEADING, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.a())), null, 2, null), false, new Size(new SizeConstraint.Fixed(A.b(200), (k) null), SizeConstraint.Fit.INSTANCE), new Padding(10.0d, 10.0d, 20.0d, 20.0d), new Padding(20.0d, 20.0d, 10.0d, 10.0d), null, null, null, null, 61776, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_Markdown(m mVar, int i) {
        m i2 = mVar.i(1145662669);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1145662669, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_Markdown (TextComponentView.kt:285)");
            }
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Hello, **bold**, *italic* or _italic2_ with ~strikethrough~, ~~strikethrough2~~ and `monospace`. Click [here](https://revenuecat.com)", new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null), 0, null, null, null, null, null, false, null, null, null, null, null, null, null, 65532, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_MonospaceFont(m mVar, int i) {
        m i2 = mVar.i(-744412312);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-744412312, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_MonospaceFont (TextComponentView.kt:222)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null);
            FontSpec.Generic.Monospace monospace = FontSpec.Generic.Monospace.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Hello, world", colorStyles, 0, null, monospace, null, null, null, false, new Size(fit, fit), null, null, null, null, null, null, 65004, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_RadialGradient(m mVar, int i) {
        m i2 = mVar.i(261376653);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(261376653, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_RadialGradient (TextComponentView.kt:336)");
            }
            r0.a aVar = r0.b;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Do not allow people to dim your shine because they are blinded. Tell them to put some sunglasses on.", new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(v.q(new ColorInfo.Gradient.Point(s0.k(aVar.c()), 10.0f), new ColorInfo.Gradient.Point(s0.k(s0.f(0, 102, 255, 0, 8, (Object) null)), 80.0f), new ColorInfo.Gradient.Point(s0.k(s0.f(160, 0, 160, 0, 8, (Object) null)), 100.0f)))), null, 2, null), 15, FontWeight.MEDIUM, null, HorizontalAlignment.LEADING, null, new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.a())), null, 2, null), false, new Size(new SizeConstraint.Fixed(A.b(200), (k) null), SizeConstraint.Fit.INSTANCE), new Padding(10.0d, 10.0d, 20.0d, 20.0d), new Padding(20.0d, 20.0d, 10.0d, 10.0d), null, null, null, null, 61776, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_SansSerifFont(m mVar, int i) {
        m i2 = mVar.i(570489761);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(570489761, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_SansSerifFont (TextComponentView.kt:208)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null);
            FontSpec.Generic.SansSerif sansSerif = FontSpec.Generic.SansSerif.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Hello, world", colorStyles, 0, null, sansSerif, null, null, null, false, new Size(fit, fit), null, null, null, null, null, null, 65004, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void TextComponentView_Preview_SerifFont(m mVar, int i) {
        m i2 = mVar.i(2065783982);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(2065783982, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.TextComponentView_Preview_SerifFont (TextComponentView.kt:194)");
            }
            ColorStyles colorStyles = new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null);
            FontSpec.Generic.Serif serif = FontSpec.Generic.Serif.INSTANCE;
            SizeConstraint.Fit fit = SizeConstraint.Fit.INSTANCE;
            TextComponentView(PreviewHelpersKt.previewTextComponentStyle$default("Hello, world", colorStyles, 0, null, serif, null, null, null, false, new Size(fit, fit), null, null, null, null, null, null, 65004, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), null, i2, 0, 4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_Customizations(m mVar, int i) {
        TextComponentView_Preview_Customizations(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_Default(m mVar, int i) {
        TextComponentView_Preview_Default(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_FontSize(m mVar, int i) {
        TextComponentView_Preview_FontSize(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_HeadingXlExtraBold(m mVar, int i) {
        TextComponentView_Preview_HeadingXlExtraBold(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_HorizontalAlignment(m mVar, int i) {
        TextComponentView_Preview_HorizontalAlignment(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_LinearGradient(m mVar, int i) {
        TextComponentView_Preview_LinearGradient(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_Markdown(m mVar, int i) {
        TextComponentView_Preview_Markdown(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_MonospaceFont(m mVar, int i) {
        TextComponentView_Preview_MonospaceFont(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_RadialGradient(m mVar, int i) {
        TextComponentView_Preview_RadialGradient(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_SansSerifFont(m mVar, int i) {
        TextComponentView_Preview_SansSerifFont(mVar, i);
    }

    public static final /* synthetic */ void access$TextComponentView_Preview_SerifFont(m mVar, int i) {
        TextComponentView_Preview_SerifFont(mVar, i);
    }

    public static final /* synthetic */ Double access$discountPercentage(Long l, Long l2) {
        return discountPercentage(l, l2);
    }

    private static final Double discountPercentage(Long l, Long l2) {
        if (l == null || l2 == null || l2.longValue() <= l.longValue()) {
            return null;
        }
        return Double.valueOf((l2.longValue() - l.longValue()) / l2.longValue());
    }

    private static final String rememberProcessedText(PaywallState.Loaded.Components components, TextComponentState textComponentState, m mVar, int i) {
        mVar.V(-2070949083);
        if (w.L()) {
            w.U(-2070949083, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.rememberProcessedText (TextComponentView.kt:109)");
        }
        mVar.V(1040262346);
        boolean z = ((((i & 14) ^ 6) > 4 && mVar.U(components)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && mVar.U(textComponentState)) || (i & 48) == 32);
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = U1.c(new TextComponentViewKt$rememberProcessedText$processedText$2$1(components, textComponentState));
            mVar.t(C);
        }
        mVar.P();
        String rememberProcessedText$lambda$1 = rememberProcessedText$lambda$1((h2) C);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberProcessedText$lambda$1;
    }

    private static final String rememberProcessedText$lambda$1(h2 h2Var) {
        return (String) h2Var.getValue();
    }
}
