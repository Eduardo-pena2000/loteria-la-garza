package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import Ca.I;
import Ca.o;
import Da.v;
import F.f;
import Qa.p;
import android.content.Context;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FitModeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ThemeImageUrlsKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import e5.b;
import e5.h;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import v0.E1;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BackgroundStyleKt {

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
            BackgroundStyleKt.access$Background_Preview_ColorGradientLinear(mVar, g1.a(this.$$changed | 1));
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
            BackgroundStyleKt.access$Background_Preview_ColorGradientRadial(mVar, g1.a(this.$$changed | 1));
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
            BackgroundStyleKt.access$Background_Preview_ColorHex(mVar, g1.a(this.$$changed | 1));
        }
    }

    private static final void Background_Preview_ColorGradientLinear(m mVar, int i) {
        m i2 = mVar.i(1587277957);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1587277957, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorGradientLinear (BackgroundStyle.kt:232)");
            }
            e m = g.m(e.a, h.g(100));
            r0.a aVar = r0.b;
            f.a(BackgroundKt.background$default(m, BackgroundStyle.Color.box-impl(BackgroundStyle.Color.constructor-impl(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Linear(90.0f, v.q(new ColorInfo.Gradient.Point(s0.k(aVar.h()), 0.0f), new ColorInfo.Gradient.Point(s0.k(aVar.f()), 50.0f), new ColorInfo.Gradient.Point(s0.k(aVar.b()), 100.0f)))))), (E1) null, 2, (Object) null), i2, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void Background_Preview_ColorGradientRadial(m mVar, int i) {
        m i2 = mVar.i(1823976651);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1823976651, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorGradientRadial (BackgroundStyle.kt:262)");
            }
            e m = g.m(e.a, h.g(100));
            r0.a aVar = r0.b;
            f.a(BackgroundKt.background$default(m, BackgroundStyle.Color.box-impl(BackgroundStyle.Color.constructor-impl(ColorStyleKt.toColorStyle(new ColorInfo.Gradient.Radial(v.q(new ColorInfo.Gradient.Point(s0.k(aVar.h()), 0.0f), new ColorInfo.Gradient.Point(s0.k(aVar.f()), 50.0f), new ColorInfo.Gradient.Point(s0.k(aVar.b()), 100.0f)))))), (E1) null, 2, (Object) null), i2, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void Background_Preview_ColorHex(m mVar, int i) {
        m i2 = mVar.i(529543697);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(529543697, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.Background_Preview_ColorHex (BackgroundStyle.kt:222)");
            }
            f.a(BackgroundKt.background$default(g.m(e.a, h.g(100)), BackgroundStyle.Color.box-impl(BackgroundStyle.Color.constructor-impl(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.h())))), (E1) null, 2, (Object) null), i2, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final /* synthetic */ void access$Background_Preview_ColorGradientLinear(m mVar, int i) {
        Background_Preview_ColorGradientLinear(mVar, i);
    }

    public static final /* synthetic */ void access$Background_Preview_ColorGradientRadial(m mVar, int i) {
        Background_Preview_ColorGradientRadial(mVar, i);
    }

    public static final /* synthetic */ void access$Background_Preview_ColorHex(m mVar, int i) {
        Background_Preview_ColorHex(mVar, i);
    }

    public static final /* synthetic */ void access$rememberAsyncImagePainter$lambda$8(C0 c0, b bVar) {
        rememberAsyncImagePainter$lambda$8(c0, bVar);
    }

    private static final e5.h getImageRequest(Context context, String str, b bVar) {
        return new h.a(context).c(str).e(bVar).f(bVar).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final U4.b rememberAsyncImagePainter(com.revenuecat.purchases.paywalls.components.properties.ImageUrls r21, M0.f r22, b0.m r23, int r24) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt.rememberAsyncImagePainter(com.revenuecat.purchases.paywalls.components.properties.ImageUrls, M0.f, b0.m, int):U4.b");
    }

    private static final b rememberAsyncImagePainter$lambda$7(C0 c0) {
        return (b) c0.getValue();
    }

    private static final void rememberAsyncImagePainter$lambda$8(C0 c0, b bVar) {
        c0.setValue(bVar);
    }

    public static final /* synthetic */ BackgroundStyle rememberBackgroundStyle(BackgroundStyles background, m mVar, int i) {
        BackgroundStyle backgroundStyle;
        t.g(background, "background");
        mVar.V(1019071422);
        if (w.L()) {
            w.U(1019071422, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.rememberBackgroundStyle (BackgroundStyle.kt:143)");
        }
        boolean z = true;
        if (background instanceof BackgroundStyles.Color) {
            mVar.V(-1590418969);
            ColorStyle forCurrentTheme = ColorStyleKt.getForCurrentTheme(((BackgroundStyles.Color) background).unbox-impl(), mVar, 0);
            mVar.V(779982346);
            if ((((i & 14) ^ 6) <= 4 || !mVar.U(background)) && (i & 6) != 4) {
                z = false;
            }
            boolean U = mVar.U(forCurrentTheme) | z;
            Object C = mVar.C();
            if (U || C == m.a.a()) {
                C = BackgroundStyle.Color.box-impl(BackgroundStyle.Color.constructor-impl(forCurrentTheme));
                mVar.t(C);
            }
            ColorStyle colorStyle = ((BackgroundStyle.Color) C).unbox-impl();
            mVar.P();
            mVar.P();
            backgroundStyle = BackgroundStyle.Color.box-impl(colorStyle);
        } else if (background instanceof BackgroundStyles.Image) {
            mVar.V(-1590195521);
            BackgroundStyles.Image image = (BackgroundStyles.Image) background;
            ColorStyles colorOverlay = image.getColorOverlay();
            mVar.V(779988729);
            ColorStyle forCurrentTheme2 = colorOverlay == null ? null : ColorStyleKt.getForCurrentTheme(colorOverlay, mVar, 0);
            mVar.P();
            ImageUrls urlsForCurrentTheme = ThemeImageUrlsKt.getUrlsForCurrentTheme(image.getSources(), mVar, 0);
            U4.b rememberAsyncImagePainter = rememberAsyncImagePainter(urlsForCurrentTheme, image.getContentScale(), mVar, 0);
            mVar.V(779994638);
            boolean U2 = mVar.U(urlsForCurrentTheme) | mVar.U(forCurrentTheme2) | mVar.U(rememberAsyncImagePainter);
            Object C2 = mVar.C();
            if (U2 || C2 == m.a.a()) {
                C2 = new BackgroundStyle.Image(rememberAsyncImagePainter, image.getContentScale(), forCurrentTheme2);
                mVar.t(C2);
            }
            backgroundStyle = (BackgroundStyle.Image) C2;
            mVar.P();
            mVar.P();
        } else {
            if (!(background instanceof BackgroundStyles.Video)) {
                mVar.V(779791050);
                mVar.P();
                throw new o();
            }
            mVar.V(-1589658663);
            mVar.V(780005105);
            if ((((i & 14) ^ 6) <= 4 || !mVar.U(background)) && (i & 6) != 4) {
                z = false;
            }
            Object C3 = mVar.C();
            if (z || C3 == m.a.a()) {
                BackgroundStyles.Video video = (BackgroundStyles.Video) background;
                C3 = new BackgroundStyle.Video(video.getSources(), video.getFallbackImage(), video.getLoop(), video.getMuteAudio(), video.getContentScale(), video.getColorOverlay());
                mVar.t(C3);
            }
            backgroundStyle = (BackgroundStyle.Video) C3;
            mVar.P();
            mVar.P();
        }
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return backgroundStyle;
    }

    public static final /* synthetic */ Result toBackgroundStyles(Background background, Map aliases) {
        Result error;
        t.g(background, "<this>");
        t.g(aliases, "aliases");
        if (background instanceof Background.Color) {
            Result colorStyles = ColorStyleKt.toColorStyles(((Background.Color) background).getValue(), aliases);
            if (!(colorStyles instanceof Result.Success)) {
                if (colorStyles instanceof Result.Error) {
                    return colorStyles;
                }
                throw new o();
            }
            error = new Result.Success(BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl((ColorStyles) ((Result.Success) colorStyles).getValue())));
        } else {
            if (background instanceof Background.Image) {
                Background.Image image = (Background.Image) background;
                ColorScheme colorOverlay = image.getColorOverlay();
                error = ResultKt.orSuccessfullyNull(colorOverlay != null ? ColorStyleKt.toColorStyles(colorOverlay, aliases) : null);
                if (error instanceof Result.Success) {
                    return new Result.Success(new BackgroundStyles.Image(image.getValue(), FitModeKt.toContentScale(image.getFitMode()), (ColorStyles) ((Result.Success) error).getValue()));
                }
                if (!(error instanceof Result.Error)) {
                    throw new o();
                }
            } else if (background instanceof Background.Video) {
                Background.Video video = (Background.Video) background;
                ColorScheme colorOverlay2 = video.getColorOverlay();
                error = ResultKt.orSuccessfullyNull(colorOverlay2 != null ? ColorStyleKt.toColorStyles(colorOverlay2, aliases) : null);
                if (error instanceof Result.Success) {
                    return new Result.Success(new BackgroundStyles.Video(video.getValue(), video.getFallbackImage(), video.getLoop(), video.getMuteAudio(), FitModeKt.toContentScale(video.getFitMode()), (ColorStyles) ((Result.Success) error).getValue()));
                }
                if (!(error instanceof Result.Error)) {
                    throw new o();
                }
            } else {
                if (!(background instanceof Background.Unknown)) {
                    throw new o();
                }
                error = new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.UnsupportedBackgroundType((Background.Unknown) background), new PaywallValidationError.UnsupportedBackgroundType[0]));
            }
        }
        return error;
    }
}
