package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.v;
import F.L;
import M0.B;
import O0.g;
import Qa.p;
import T4.a;
import T4.d;
import Z4.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.B1;
import b0.g1;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.emergetools.snapshots.annotations.EmergeSnapshotConfig;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FitModeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ThemeImageUrlsKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatioKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ImagePreviewsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import j0.i;
import java.net.URL;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import v0.E1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ImageComponentViewKt {

    public static final class 1 extends u implements p {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(2);
        }

        public final e invoke(e applyIfNotNull, AspectRatio it) {
            t.g(applyIfNotNull, "$this$applyIfNotNull");
            t.g(it, "it");
            return AspectRatioKt.aspectRatio(applyIfNotNull, it);
        }
    }

    public static final class 5 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ ImageComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(ImageComponentStyle imageComponentStyle, PaywallState.Loaded.Components components, e eVar, int i, int i2) {
            super(2);
            this.$style = imageComponentStyle;
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
            ImageComponentViewKt.ImageComponentView(this.$style, this.$state, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-1367814797, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview.<anonymous> (ImageComponentView.kt:231)");
            }
            e i2 = f.i(g.v(g.d(a.d(e.a, r0.b.h(), (E1) null, 2, (Object) null), 0.0f, 1, (Object) null), h.g(200)), h.g(20));
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, i2);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.access$previewImageComponentStyle(themeImageUrls, new Size(SizeConstraint.Fill.INSTANCE, SizeConstraint.Fit.INSTANCE), FitMode.FILL, new MaskShape.Rectangle((CornerRadiuses) null, 1, (k) null), false, null, null, null, null, null, mVar, 3504, 1008), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImageComponentViewKt.access$ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(955317783, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview.<anonymous> (ImageComponentView.kt:257)");
            }
            e i2 = f.i(androidx.compose.foundation.layout.g.i(androidx.compose.foundation.layout.g.h(a.d(e.a, r0.b.h(), (E1) null, 2, (Object) null), 0.0f, 1, (Object) null), h.g(200)), h.g(20));
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, i2);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.access$previewImageComponentStyle(themeImageUrls, new Size(SizeConstraint.Fit.INSTANCE, SizeConstraint.Fill.INSTANCE), FitMode.FILL, new MaskShape.Rectangle((CornerRadiuses) null, 1, (k) null), false, null, null, null, null, null, mVar, 3504, 1008), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImageComponentViewKt.access$ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ PreviewParameters $parameters;
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ThemeImageUrls themeImageUrls, PreviewParameters previewParameters) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
            this.$parameters = previewParameters;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-463386670, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview.<anonymous> (ImageComponentView.kt:204)");
            }
            e d = a.d(e.a, r0.b.h(), (E1) null, 2, (Object) null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            PreviewParameters previewParameters = this.$parameters;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, d);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.access$previewImageComponentStyle(themeImageUrls, previewParameters.getViewSize(), previewParameters.getFitMode(), new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, null, null, null, null, null, mVar, 3072, 1008), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PreviewParameters $parameters;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PreviewParameters previewParameters, int i) {
            super(2);
            this.$parameters = previewParameters;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImageComponentViewKt.access$ImageComponentView_Preview(this.$parameters, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-1199303222, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_FixedFixedFitMargin.<anonymous> (ImageComponentView.kt:484)");
            }
            e d = a.d(e.a, r0.b.h(), (E1) null, 2, (Object) null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, d);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.access$previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(24, (k) null), new SizeConstraint.Fixed(24, (k) null)), FitMode.FIT, new MaskShape.Rectangle((CornerRadiuses) null, 1, (k) null), false, null, null, f.e(0.0f, 0.0f, h.g(8), 0.0f, 11, (Object) null), null, null, mVar, 918556080, 112), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImageComponentViewKt.access$ImageComponentView_Preview_FixedFixedFitMargin(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1985929596, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_LinearGradient.<anonymous> (ImageComponentView.kt:348)");
            }
            e.a aVar = e.a;
            r0.a aVar2 = r0.b;
            e d = a.d(aVar, aVar2.h(), (E1) null, 2, (Object) null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, d);
            g.a aVar3 = O0.g.E8;
            Qa.a a2 = aVar3.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar3.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.access$previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, (k) null), SizeConstraint.Fit.INSTANCE), FitMode.FIT, new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(0.0f, v.q(new ColorInfo.Gradient.Point(Color.parseColor("#88FF0000"), 0.0f), new ColorInfo.Gradient.Point(Color.parseColor("#8800FF00"), 50.0f), new ColorInfo.Gradient.Point(Color.parseColor("#880000FF"), 100.0f)))), null, 2, null), null, null, new BorderStyles(h.g(10), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar2.b())), null, 2, null), null), null, mVar, 3504, 720), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImageComponentViewKt.access$ImageComponentView_Preview_LinearGradient(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1369202481, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_Margin_Padding.<anonymous> (ImageComponentView.kt:313)");
            }
            e d = a.d(androidx.compose.foundation.layout.g.i(e.a, h.g(200)), r0.b.e(), (E1) null, 2, (Object) null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, d);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            float f2 = 20;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.access$previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, (k) null), new SizeConstraint.Fixed(400, (k) null)), FitMode.FIT, new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, null, f.a(h.g(f2)), f.a(h.g(f2)), null, null, mVar, 819465648, 304), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImageComponentViewKt.access$ImageComponentView_Preview_Margin_Padding(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ MaskShape $maskShape;
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ThemeImageUrls themeImageUrls, MaskShape maskShape) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
            this.$maskShape = maskShape;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-569034613, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_MaskShape.<anonymous> (ImageComponentView.kt:464)");
            }
            e d = a.d(e.a, r0.b.b(), (E1) null, 2, (Object) null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            MaskShape maskShape = this.$maskShape;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, d);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.access$previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, (k) null), new SizeConstraint.Fixed(200, (k) null)), FitMode.FIT, maskShape, false, null, null, null, null, null, mVar, 432, 1008), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MaskShape $maskShape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(MaskShape maskShape, int i) {
            super(2);
            this.$maskShape = maskShape;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImageComponentViewKt.access$ImageComponentView_Preview_MaskShape(this.$maskShape, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-827207358, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_RadialGradient.<anonymous> (ImageComponentView.kt:401)");
            }
            e d = a.d(e.a, r0.b.h(), (E1) null, 2, (Object) null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, d);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.access$previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, (k) null), SizeConstraint.Fit.INSTANCE), FitMode.FIT, new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, new ColorStyles(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(v.q(new ColorInfo.Gradient.Point(Color.parseColor("#88FF0000"), 0.0f), new ColorInfo.Gradient.Point(Color.parseColor("#8800FF00"), 50.0f), new ColorInfo.Gradient.Point(Color.parseColor("#880000FF"), 100.0f)))), null, 2, null), null, null, null, null, mVar, 3504, 976), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImageComponentViewKt.access$ImageComponentView_Preview_RadialGradient(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ ThemeImageUrls $themeImageUrls;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(ThemeImageUrls themeImageUrls) {
            super(2);
            this.$themeImageUrls = themeImageUrls;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-161866748, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_SmallerContainer.<anonymous> (ImageComponentView.kt:283)");
            }
            e d = a.d(androidx.compose.foundation.layout.g.i(e.a, h.g(200)), r0.b.b(), (E1) null, 2, (Object) null);
            ThemeImageUrls themeImageUrls = this.$themeImageUrls;
            B h = F.f.h(o0.e.a.o(), false);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = c.f(mVar, d);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            ImageComponentViewKt.ImageComponentView(ImageComponentViewKt.access$previewImageComponentStyle(themeImageUrls, new Size(new SizeConstraint.Fixed(400, (k) null), new SizeConstraint.Fixed(400, (k) null)), FitMode.FIT, new MaskShape.Rectangle(new CornerRadiuses.Dp(20.0d, 20.0d, 20.0d, 20.0d)), false, null, null, null, null, null, mVar, 3504, 1008), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ImageComponentViewKt.access$ImageComponentView_Preview_SmallerContainer(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void ImageComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle r17, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r18, androidx.compose.ui.e r19, b0.m r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentViewKt.ImageComponentView(com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final E1 ImageComponentView$lambda$3(h2 h2Var) {
        return (E1) h2Var.getValue();
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    private static final void ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview(m mVar, int i) {
        m i2 = mVar.i(-1105161640);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1105161640, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview (ImageComponentView.kt:228)");
            }
            ThemeImageUrls themeImageUrls = previewThemeImageUrls-feOb9K0(100, 100);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrls, i2, 0), i.d(-1367814797, true, new 1(themeImageUrls), i2, 54), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    private static final void ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview(m mVar, int i) {
        m i2 = mVar.i(1217970940);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1217970940, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview (ImageComponentView.kt:254)");
            }
            ThemeImageUrls themeImageUrls = previewThemeImageUrls-feOb9K0(100, 100);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrls, i2, 0), i.d(955317783, true, new 1(themeImageUrls), i2, 54), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    @EmergeSnapshotConfig(precision = 0.95f)
    private static final void ImageComponentView_Preview(PreviewParameters previewParameters, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-1427202611);
        if ((i & 6) == 0) {
            i2 = (i3.U(previewParameters) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1427202611, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview (ImageComponentView.kt:201)");
            }
            ThemeImageUrls themeImageUrls = previewThemeImageUrls-feOb9K0(previewParameters.getImageWidth-pVg5ArA(), previewParameters.getImageHeight-pVg5ArA());
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrls, i3, 0), i.d(-463386670, true, new 1(themeImageUrls, previewParameters), i3, 54), i3, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(previewParameters, i));
        }
    }

    @EmergeSnapshotConfig(precision = 0.97f)
    private static final void ImageComponentView_Preview_FixedFixedFitMargin(m mVar, int i) {
        m i2 = mVar.i(1911339503);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1911339503, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_FixedFixedFitMargin (ImageComponentView.kt:481)");
            }
            ThemeImageUrls themeImageUrls = previewThemeImageUrls-feOb9K0(96, 96);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrls, i2, 0), i.d(-1199303222, true, new 1(themeImageUrls), i2, 54), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    private static final void ImageComponentView_Preview_LinearGradient(m mVar, int i) {
        m i2 = mVar.i(246381111);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(246381111, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_LinearGradient (ImageComponentView.kt:345)");
            }
            ThemeImageUrls themeImageUrls = previewThemeImageUrls-feOb9K0(400, 400);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrls, i2, 0), i.d(1985929596, true, new 1(themeImageUrls), i2, 54), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void ImageComponentView_Preview_Margin_Padding(m mVar, int i) {
        m i2 = mVar.i(-370346004);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-370346004, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_Margin_Padding (ImageComponentView.kt:310)");
            }
            ThemeImageUrls themeImageUrls = previewThemeImageUrls-feOb9K0(400, 400);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrls, i2, 0), i.d(1369202481, true, new 1(themeImageUrls), i2, 54), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    private static final void ImageComponentView_Preview_MaskShape(MaskShape maskShape, m mVar, int i) {
        int i2;
        m i3 = mVar.i(916782022);
        if ((i & 6) == 0) {
            i2 = (i3.U(maskShape) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(916782022, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_MaskShape (ImageComponentView.kt:461)");
            }
            ThemeImageUrls themeImageUrls = previewThemeImageUrls-feOb9K0(400, 200);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrls, i3, 0), i.d(-569034613, true, new 1(themeImageUrls, maskShape), i3, 54), i3, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(maskShape, i));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    private static final void ImageComponentView_Preview_RadialGradient(m mVar, int i) {
        m i2 = mVar.i(1728211453);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1728211453, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_RadialGradient (ImageComponentView.kt:398)");
            }
            ThemeImageUrls themeImageUrls = previewThemeImageUrls-feOb9K0(400, 400);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrls, i2, 0), i.d(-827207358, true, new 1(themeImageUrls), i2, 54), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    @EmergeSnapshotConfig(precision = 0.99f)
    private static final void ImageComponentView_Preview_SmallerContainer(m mVar, int i) {
        m i2 = mVar.i(-1125682689);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1125682689, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.ImageComponentView_Preview_SmallerContainer (ImageComponentView.kt:280)");
            }
            ThemeImageUrls themeImageUrls = previewThemeImageUrls-feOb9K0(400, 400);
            ImagePreviewsKt.ProvidePreviewImageLoader(previewImageLoader(themeImageUrls, i2, 0), i.d(-161866748, true, new 1(themeImageUrls), i2, 54), i2, 48);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ E1 access$ImageComponentView$lambda$3(h2 h2Var) {
        return ImageComponentView$lambda$3(h2Var);
    }

    public static final /* synthetic */ void access$ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview(m mVar, int i) {
        ImageComponentView_Bigger_Container_Fill_Fit_FitModeFill_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview(m mVar, int i) {
        ImageComponentView_Bigger_Container_Fit_Fill_FitModeFill_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$ImageComponentView_Preview(PreviewParameters previewParameters, m mVar, int i) {
        ImageComponentView_Preview(previewParameters, mVar, i);
    }

    public static final /* synthetic */ void access$ImageComponentView_Preview_FixedFixedFitMargin(m mVar, int i) {
        ImageComponentView_Preview_FixedFixedFitMargin(mVar, i);
    }

    public static final /* synthetic */ void access$ImageComponentView_Preview_LinearGradient(m mVar, int i) {
        ImageComponentView_Preview_LinearGradient(mVar, i);
    }

    public static final /* synthetic */ void access$ImageComponentView_Preview_Margin_Padding(m mVar, int i) {
        ImageComponentView_Preview_Margin_Padding(mVar, i);
    }

    public static final /* synthetic */ void access$ImageComponentView_Preview_MaskShape(MaskShape maskShape, m mVar, int i) {
        ImageComponentView_Preview_MaskShape(maskShape, mVar, i);
    }

    public static final /* synthetic */ void access$ImageComponentView_Preview_RadialGradient(m mVar, int i) {
        ImageComponentView_Preview_RadialGradient(mVar, i);
    }

    public static final /* synthetic */ void access$ImageComponentView_Preview_SmallerContainer(m mVar, int i) {
        ImageComponentView_Preview_SmallerContainer(mVar, i);
    }

    public static final /* synthetic */ ImageComponentStyle access$previewImageComponentStyle(ThemeImageUrls themeImageUrls, Size size, FitMode fitMode, MaskShape maskShape, boolean z, ColorStyles colorStyles, L l, L l2, BorderStyles borderStyles, ShadowStyles shadowStyles, m mVar, int i, int i2) {
        return previewImageComponentStyle(themeImageUrls, size, fitMode, maskShape, z, colorStyles, l, l2, borderStyles, shadowStyles, mVar, i, i2);
    }

    public static final /* synthetic */ int access$toRgbColor(String str) {
        return toRgbColor(str);
    }

    private static final ImageComponentStyle previewImageComponentStyle(ThemeImageUrls themeImageUrls, Size size, FitMode fitMode, MaskShape maskShape, boolean z, ColorStyles colorStyles, L l, L l2, BorderStyles borderStyles, ShadowStyles shadowStyles, m mVar, int i, int i2) {
        mVar.V(-1478132064);
        boolean z2 = (i2 & 16) != 0 ? true : z;
        ColorStyles colorStyles2 = (i2 & 32) != 0 ? null : colorStyles;
        L a = (i2 & 64) != 0 ? f.a(h.g(0)) : l;
        L a2 = (i2 & 128) != 0 ? f.a(h.g(0)) : l2;
        BorderStyles borderStyles2 = (i2 & 256) != 0 ? new BorderStyles(h.g(2), new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.c())), null, 2, null), null) : borderStyles;
        ShadowStyles shadowStyles2 = (i2 & 512) != 0 ? new ShadowStyles(new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null), h.g(10), h.g(0), h.g(3), null) : shadowStyles;
        if (w.L()) {
            w.U(-1478132064, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.previewImageComponentStyle (ImageComponentView.kt:522)");
        }
        ImageComponentStyle imageComponentStyle = new ImageComponentStyle(NonEmptyMapKt.nonEmptyMapOf(x.a(LocaleId.box-impl(LocaleId.constructor-impl("en_US")), themeImageUrls), new q[0]), z2, size, a, a2, ShapeKt.toShape(maskShape), borderStyles2, shadowStyles2, colorStyles2, FitModeKt.toContentScale(fitMode), null, null, null, null, v.n(), false, 43008, null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return imageComponentStyle;
    }

    private static final d previewImageLoader(ThemeImageUrls themeImageUrls, m mVar, int i) {
        mVar.V(-845849021);
        if (w.L()) {
            w.U(-845849021, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.previewImageLoader (ImageComponentView.kt:540)");
        }
        d previewImageLoader = previewImageLoader(ThemeImageUrlsKt.getUrlsForCurrentTheme(themeImageUrls, mVar, i & 14), 0, mVar, 0, 2);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return previewImageLoader;
    }

    private static final ThemeImageUrls previewThemeImageUrls-feOb9K0(int i, int i2) {
        return new ThemeImageUrls(new ImageUrls(new URL("https://preview"), new URL("https://preview"), new URL("https://preview"), i, i2, (k) null), (ImageUrls) null, 2, (k) null);
    }

    public static final Bitmap toBitmap-gd2BlFg(Drawable toBitmap, int i, int i2, int i3) {
        t.g(toBitmap, "$this$toBitmap");
        Rect bounds = toBitmap.getBounds();
        t.f(bounds, "bounds");
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        t.f(createBitmap, "createBitmap(width.toInt…oInt(), Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(i3);
        toBitmap.setBounds(0, 0, i, i2);
        toBitmap.draw(canvas);
        toBitmap.setBounds(i4, i5, i6, i7);
        return createBitmap;
    }

    private static final int toRgbColor(String str) {
        int hashCode = str.hashCode();
        return (hashCode & 255) | (((hashCode >> 16) & 255) << 16) | (-16777216) | (((hashCode >> 8) & 255) << 8);
    }

    private static final d previewImageLoader(ImageUrls imageUrls, int i, m mVar, int i2, int i3) {
        mVar.V(-536172673);
        if ((i3 & 2) != 0) {
            i = R.drawable.android;
        }
        if (w.L()) {
            w.U(-536172673, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.image.previewImageLoader (ImageComponentView.kt:546)");
        }
        Context context = (Context) mVar.x(AndroidCompositionLocals_androidKt.g());
        d.a aVar = new d.a(context);
        a.a aVar2 = new a.a();
        mVar.V(-2000731791);
        boolean E = mVar.E(context) | ((((i2 & 112) ^ 48) > 32 && mVar.d(i)) || (i2 & 48) == 32) | ((((i2 & 14) ^ 6) > 4 && mVar.U(imageUrls)) || (i2 & 6) == 4);
        Object C = mVar.C();
        if (E || C == m.a.a()) {
            C = new ImageComponentViewKt$previewImageLoader$1$1$1(context, i, imageUrls);
            mVar.t(C);
        }
        mVar.P();
        aVar2.c((b) C);
        d b = aVar.c(aVar2.f()).b();
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return b;
    }
}
