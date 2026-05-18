package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import F.T;
import F.W;
import F.Y;
import F.c;
import F.l;
import F.o;
import M.i;
import M0.B;
import O0.g;
import Qa.p;
import X.E;
import X.h0;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.composables.Fade;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderDefaults;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o0.e;
import v0.r0;
import z.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterLoadingViewKt {

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
            CustomerCenterLoadingViewKt.CustomerCenterLoadingView(mVar, g1.a(this.$$changed | 1));
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
            CustomerCenterLoadingViewKt.CustomerCenterLoadingViewPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void CustomerCenterLoadingView(m mVar, int i) {
        m i2 = mVar.i(1909589276);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1909589276, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingView (CustomerCenterLoadingView.kt:45)");
            }
            long q = r0.q(E.a.a(i2, E.b).w(), 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
            Fade fade = new Fade(q, PlaceholderDefaults.INSTANCE.getFadeAnimationSpec(), null);
            e.a aVar = e.a;
            e f = g.f(aVar, 0.0f, 1, (Object) null);
            CustomerCenterConstants.Layout layout = CustomerCenterConstants.Layout.INSTANCE;
            e k = f.k(f, layout.getHORIZONTAL_PADDING-D9Ej5fM(), 0.0f, 2, (Object) null);
            B a = l.a(F.c.a.h(), o0.e.a.k(), i2, 48);
            int a2 = h.a(i2, 0);
            b0.I r = i2.r();
            e f2 = androidx.compose.ui.c.f(i2, k);
            g.a aVar2 = O0.g.E8;
            Qa.a a3 = aVar2.a();
            if (i2.k() == null) {
                h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a3);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f2, aVar2.f());
            o oVar = o.a;
            int i3 = M.d;
            LoadingCardPlaceholder-Iv8Zu3U(q, fade, i2, i3 << 3);
            Y.a(androidx.compose.foundation.layout.g.i(aVar, layout.getBUTTONS_TOP_PADDING-D9Ej5fM()), i2, 6);
            LoadingButtonsPlaceholder-Iv8Zu3U(q, fade, i2, i3 << 3);
            i2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final void CustomerCenterLoadingViewPreview(m mVar, int i) {
        m i2 = mVar.i(1144543300);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1144543300, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingViewPreview (CustomerCenterLoadingView.kt:162)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$CustomerCenterLoadingViewKt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void LoadingButtonsPlaceholder-Iv8Zu3U(long j, Fade fade, m mVar, int i) {
        int i2;
        m mVar2;
        int i3 = 1;
        m i4 = mVar.i(-1444525897);
        char c = 6;
        int i5 = 2;
        if ((i & 6) == 0) {
            i2 = (i4.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? i4.U(fade) : i4.E(fade) ? 32 : 16;
        }
        int i6 = i2;
        if ((i6 & 19) == 18 && i4.j()) {
            i4.M();
            mVar2 = i4;
        } else {
            if (w.L()) {
                w.U(-1444525897, i6, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingButtonsPlaceholder (CustomerCenterLoadingView.kt:137)");
            }
            c.f o = F.c.a.o(CustomerCenterConstants.Layout.INSTANCE.getBUTTONS_SPACING-D9Ej5fM());
            e.a aVar = e.a;
            B a = l.a(o, o0.e.a.k(), i4, 6);
            int a2 = h.a(i4, 0);
            b0.I r = i4.r();
            e f = androidx.compose.ui.c.f(i4, aVar);
            g.a aVar2 = O0.g.E8;
            Qa.a a3 = aVar2.a();
            if (i4.k() == null) {
                h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a3);
            } else {
                i4.s();
            }
            m b = m2.b(i4);
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            o oVar = o.a;
            i4.V(-1444471500);
            int i7 = 0;
            while (i7 < i5) {
                e h = androidx.compose.foundation.layout.g.h(e.a, 0.0f, i3, (Object) null);
                LoadingViewConstants loadingViewConstants = LoadingViewConstants.INSTANCE;
                m mVar3 = i4;
                F.f.a(PlaceholderKt.placeholder-TgFrcIs(androidx.compose.foundation.layout.g.b(h, 0.0f, loadingViewConstants.getBUTTON_HEIGHT-D9Ej5fM(), i3, (Object) null), true, j, loadingViewConstants.getBUTTON_SHAPE(), fade, null, null, i4, ((i6 << 6) & 896) | 3126 | (M.d << 12) | ((i6 << 9) & 57344), 48), mVar3, 0);
                i7++;
                i3 = 1;
                i4 = mVar3;
                i6 = i6;
                i5 = i5;
                c = c;
            }
            mVar2 = i4;
            mVar2.P();
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new CustomerCenterLoadingViewKt$LoadingButtonsPlaceholder$2(j, fade, i));
        }
    }

    private static final void LoadingCardPlaceholder-Iv8Zu3U(long j, Fade fade, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1798499628);
        if ((i & 6) == 0) {
            i2 = (i3.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? i3.U(fade) : i3.E(fade) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1798499628, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingCardPlaceholder (CustomerCenterLoadingView.kt:65)");
            }
            mVar2 = i3;
            h0.a(androidx.compose.foundation.layout.g.h(e.a, 0.0f, 1, (Object) null), i.d(CustomerCenterConstants.Card.INSTANCE.getROUNDED_CORNER_SIZE-D9Ej5fM()), X.m.k(E.a.a(i3, E.b), n1.h.g(2)), 0L, 0.0f, 0.0f, (A.i) null, j0.i.d(1204625137, true, new CustomerCenterLoadingViewKt$LoadingCardPlaceholder$1(j, fade), i3, 54), i3, 12582918, 120);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new CustomerCenterLoadingViewKt$LoadingCardPlaceholder$2(j, fade, i));
        }
    }

    private static final void LoadingCardTitleRow-Iv8Zu3U(long j, Fade fade, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-1182560361);
        if ((i & 6) == 0) {
            i2 = (i3.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? i3.U(fade) : i3.E(fade) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1182560361, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingCardTitleRow (CustomerCenterLoadingView.kt:103)");
            }
            c.f e = F.c.a.e();
            e.c l = o0.e.a.l();
            e.a aVar = androidx.compose.ui.e.a;
            androidx.compose.ui.e m = f.m(androidx.compose.foundation.layout.g.h(aVar, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, CustomerCenterConstants.Card.INSTANCE.getTITLE_ROW_BOTTOM_PADDING-D9Ej5fM(), 7, (Object) null);
            B b = T.b(e, l, i3, 54);
            int a = h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, m);
            g.a aVar2 = O0.g.E8;
            Qa.a a2 = aVar2.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b2 = m2.b(i3);
            m2.e(b2, b, aVar2.e());
            m2.e(b2, r, aVar2.g());
            p b3 = aVar2.b();
            if (b2.f() || !t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar2.f());
            W w = W.a;
            LoadingViewConstants loadingViewConstants = LoadingViewConstants.INSTANCE;
            androidx.compose.ui.e i4 = androidx.compose.foundation.layout.g.i(androidx.compose.foundation.layout.g.v(aVar, loadingViewConstants.getTITLE_WIDTH-D9Ej5fM()), loadingViewConstants.getTITLE_HEIGHT-D9Ej5fM());
            M.h placeholder_shape = loadingViewConstants.getPLACEHOLDER_SHAPE();
            int i5 = ((i2 << 6) & 896) | 3126;
            int i6 = M.d;
            int i7 = (i2 << 9) & 57344;
            F.f.a(PlaceholderKt.placeholder-TgFrcIs(i4, true, j, placeholder_shape, fade, null, null, i3, (i6 << 12) | i5 | i7, 48), i3, 0);
            F.f.a(PlaceholderKt.placeholder-TgFrcIs(androidx.compose.foundation.layout.g.i(androidx.compose.foundation.layout.g.v(aVar, loadingViewConstants.getBADGE_WIDTH-D9Ej5fM()), loadingViewConstants.getBADGE_HEIGHT-D9Ej5fM()), true, j, loadingViewConstants.getBADGE_SHAPE(), fade, null, null, i3, i5 | (i6 << 12) | i7, 48), i3, 0);
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = i3.l();
        if (l2 != null) {
            l2.a(new CustomerCenterLoadingViewKt$LoadingCardTitleRow$2(j, fade, i));
        }
    }

    public static final /* synthetic */ void access$LoadingButtonsPlaceholder-Iv8Zu3U(long j, Fade fade, m mVar, int i) {
        LoadingButtonsPlaceholder-Iv8Zu3U(j, fade, mVar, i);
    }

    public static final /* synthetic */ void access$LoadingCardPlaceholder-Iv8Zu3U(long j, Fade fade, m mVar, int i) {
        LoadingCardPlaceholder-Iv8Zu3U(j, fade, mVar, i);
    }

    public static final /* synthetic */ void access$LoadingCardTitleRow-Iv8Zu3U(long j, Fade fade, m mVar, int i) {
        LoadingCardTitleRow-Iv8Zu3U(j, fade, mVar, i);
    }
}
