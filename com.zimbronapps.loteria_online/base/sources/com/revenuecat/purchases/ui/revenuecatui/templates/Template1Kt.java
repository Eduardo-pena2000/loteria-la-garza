package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import F.Y;
import F.f;
import F.n;
import F.o;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import X.E;
import Z0.Y0;
import android.net.Uri;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import d1.L;
import j0.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import o0.e;
import s0.h;
import u0.l;
import v0.E1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template1Kt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ p $content;
        final /* synthetic */ boolean $landscapeLayout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z, p pVar, int i) {
            super(2);
            this.$landscapeLayout = z;
            this.$content = pVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template1Kt.access$CircleMask(this.$landscapeLayout, this.$content, mVar, g1.a(this.$$changed | 1));
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
            Template1Kt.access$CircleMaskPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $landscapeLayout;
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Uri uri, boolean z, int i) {
            super(2);
            this.$uri = uri;
            this.$landscapeLayout = z;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template1Kt.access$HeaderImage(this.$uri, this.$landscapeLayout, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template1Kt.Template1(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
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
            Template1Kt.access$Template1CondensedFooterPaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
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
            Template1Kt.access$Template1FooterPaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_Template1MainContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(n nVar, PaywallState.Loaded.Legacy legacy, int i) {
            super(2);
            this.$this_Template1MainContent = nVar;
            this.$state = legacy;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template1Kt.access$Template1MainContent(this.$this_Template1MainContent, this.$state, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
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
            Template1Kt.access$Template1NoFooterPaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
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
            Template1Kt.access$Template1PaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    private static final void CircleMask(boolean z, p pVar, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-1244949301);
        if ((i & 6) == 0) {
            i2 = (i3.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(pVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1244949301, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CircleMask (Template1.kt:159)");
            }
            e a = h.a(e.a, new Template1Kt$CircleMask$clipShape$1(z ? 8.0f : 3.0f));
            B h = f.h(o0.e.a.o(), false);
            int a2 = b0.h.a(i3, 0);
            b0.I r = i3.r();
            e f = c.f(i3, a);
            g.a aVar = g.E8;
            a a3 = aVar.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a3);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            pVar.invoke(i3, Integer.valueOf((i2 >> 3) & 14));
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(z, pVar, i));
        }
    }

    private static final float CircleMask$circleOffsetX(float f, long j) {
        return (((l.i(j) * f) - l.i(j)) / 2.0f) * (-1.0f);
    }

    private static final float CircleMask$circleOffsetY(float f, long j) {
        return ((l.g(j) * f) - l.g(j)) * (-1.0f);
    }

    private static final void CircleMaskPreview(m mVar, int i) {
        m i2 = mVar.i(-414705569);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-414705569, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CircleMaskPreview (Template1.kt:250)");
            }
            e.a aVar = e.a;
            B h = f.h(o0.e.a.o(), false);
            int a = b0.h.a(i2, 0);
            b0.I r = i2.r();
            e f = c.f(i2, aVar);
            g.a aVar2 = g.E8;
            a a2 = aVar2.a();
            if (i2.k() == null) {
                b0.h.d();
            }
            i2.I();
            if (i2.f()) {
                i2.p(a2);
            } else {
                i2.s();
            }
            m b = m2.b(i2);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            f.a(androidx.compose.foundation.layout.g.f(androidx.compose.foundation.a.d(aVar, r0.b.h(), (E1) null, 2, (Object) null), 0.0f, 1, (Object) null), i2, 6);
            CircleMask(false, ComposableSingletons$Template1Kt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), i2, 54);
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

    private static final void HeaderImage(Uri uri, boolean z, m mVar, int i) {
        int i2;
        m i3 = mVar.i(2030386997);
        if ((i & 6) == 0) {
            i2 = (i3.E(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.a(z) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(2030386997, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage (Template1.kt:139)");
            }
            if (uri != null) {
                CircleMask(z, i.d(1134746342, true, new Template1Kt$HeaderImage$1$1(uri, z), i3, 54), i3, ((i2 >> 3) & 14) | 48);
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(uri, z, i));
        }
    }

    public static final void Template1(PaywallState.Loaded.Legacy state, PaywallViewModel viewModel, m mVar, int i) {
        int i2;
        t.g(state, "state");
        t.g(viewModel, "viewModel");
        m i3 = mVar.i(1499444075);
        if ((i & 6) == 0) {
            i2 = (i3.U(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(viewModel) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1499444075, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1 (Template1.kt:60)");
            }
            e h = androidx.compose.foundation.layout.g.h(e.a, 0.0f, 1, (Object) null);
            B a = F.l.a(F.c.a.h(), o0.e.a.g(), i3, 48);
            int a2 = b0.h.a(i3, 0);
            b0.I r = i3.r();
            e f = c.f(i3, h);
            g.a aVar = g.E8;
            a a3 = aVar.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a3);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, a, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar.f());
            Template1MainContent(o.a, state, i3, ((i2 << 3) & 112) | 6);
            PurchaseButtonKt.PurchaseButton-hGBTI10(state, viewModel, null, 0.0f, null, i3, i2 & 126, 28);
            FooterKt.Footer(state.getTemplateConfiguration(), viewModel, null, null, null, i3, i2 & 112, 28);
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(state, viewModel, i));
        }
    }

    private static final void Template1CondensedFooterPaywallPreview(m mVar, int i) {
        m i2 = mVar.i(-527429650);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-527429650, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1CondensedFooterPaywallPreview (Template1.kt:241)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate1Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template1FooterPaywallPreview(m mVar, int i) {
        m i2 = mVar.i(1625504547);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1625504547, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1FooterPaywallPreview (Template1.kt:232)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate1Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template1MainContent(n nVar, PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        int i2;
        int i3;
        m mVar2;
        int i4;
        m i5 = mVar.i(-1400671009);
        if ((i & 6) == 0) {
            i2 = (i5.U(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i5.U(legacy) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i5.j()) {
            i5.M();
            mVar2 = i5;
        } else {
            if (w.L()) {
                w.U(-1400671009, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1MainContent (Template1.kt:74)");
            }
            ProcessedLocalizedConfiguration selectedLocalization = PaywallStateKt.getSelectedLocalization(legacy);
            int i6 = (i2 >> 3) & 14;
            TemplateConfiguration.Colors currentColors = PaywallStateKt.getCurrentColors(legacy, i5, i6);
            TemplateConfiguration.Colors colors = null;
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                i5.V(908514334);
                boolean shouldUseLandscapeLayout = WindowHelperKt.shouldUseLandscapeLayout(legacy, i5, i6);
                e.a aVar = e.a;
                e b = n.b(nVar, androidx.compose.foundation.layout.g.d(androidx.compose.foundation.e.f(androidx.compose.foundation.layout.g.h(aVar, 0.0f, 1, (Object) null), androidx.compose.foundation.e.c(0, i5, 0, 1), false, (C.n) null, false, 14, (Object) null), 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                e.a aVar2 = o0.e.a;
                B a = F.l.a(F.c.a.b(), aVar2.g(), i5, 54);
                int a2 = b0.h.a(i5, 0);
                b0.I r = i5.r();
                androidx.compose.ui.e f = c.f(i5, b);
                g.a aVar3 = g.E8;
                a a3 = aVar3.a();
                if (i5.k() == null) {
                    b0.h.d();
                }
                i5.I();
                if (i5.f()) {
                    i5.p(a3);
                } else {
                    i5.s();
                }
                m b2 = m2.b(i5);
                m2.e(b2, a, aVar3.e());
                m2.e(b2, r, aVar3.g());
                p b3 = aVar3.b();
                if (b2.f() || !t.c(b2.C(), Integer.valueOf(a2))) {
                    b2.t(Integer.valueOf(a2));
                    b2.J(Integer.valueOf(a2), b3);
                }
                m2.e(b2, f, aVar3.f());
                o oVar = o.a;
                HeaderImage(legacy.getTemplateConfiguration().getImages().getHeaderUri(), shouldUseLandscapeLayout, i5, 0);
                Y.a(n.b(oVar, aVar, 1.0f, false, 2, (Object) null), i5, 0);
                String title = selectedLocalization.getTitle();
                E e = E.a;
                int i7 = E.b;
                Y0 g = e.c(i5, i7).g();
                L.a aVar4 = L.b;
                L a4 = aVar4.a();
                j.a aVar5 = j.b;
                int a5 = aVar5.a();
                long j = currentColors.getText1-0d7_KjU();
                UIConstant uIConstant = UIConstant.INSTANCE;
                i3 = i6;
                i4 = 2;
                MarkdownKt.Markdown-DkhmgE0(title, androidx.compose.foundation.layout.f.j(aVar, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM()), j, g, 0L, a4, null, null, j.h(a5), false, true, false, i5, 196608, 54, 720);
                androidx.compose.ui.e k = androidx.compose.foundation.layout.f.k(aVar, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), 0.0f, 2, (Object) null);
                B h = f.h(aVar2.o(), false);
                int a6 = b0.h.a(i5, 0);
                b0.I r2 = i5.r();
                androidx.compose.ui.e f2 = c.f(i5, k);
                a a7 = aVar3.a();
                if (i5.k() == null) {
                    b0.h.d();
                }
                i5.I();
                if (i5.f()) {
                    i5.p(a7);
                } else {
                    i5.s();
                }
                m b4 = m2.b(i5);
                m2.e(b4, h, aVar3.e());
                m2.e(b4, r2, aVar3.g());
                p b5 = aVar3.b();
                if (b4.f() || !t.c(b4.C(), Integer.valueOf(a6))) {
                    b4.t(Integer.valueOf(a6));
                    b4.J(Integer.valueOf(a6), b5);
                }
                m2.e(b4, f2, aVar3.f());
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
                String subtitle = selectedLocalization.getSubtitle();
                if (subtitle == null) {
                    subtitle = "";
                }
                MarkdownKt.Markdown-DkhmgE0(subtitle, androidx.compose.foundation.layout.f.j(aVar, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM()), currentColors.getText1-0d7_KjU(), e.c(i5, i7).b(), 0L, aVar4.g(), null, null, j.h(aVar5.a()), false, true, false, i5, 196608, 54, 720);
                i5.v();
                colors = null;
                mVar2 = i5;
                Y.a(n.b(oVar, aVar, 2.0f, false, 2, (Object) null), mVar2, 0);
                mVar2.v();
                mVar2.P();
            } else {
                i3 = i6;
                mVar2 = i5;
                i4 = 2;
                mVar2.V(910488166);
                Y.a(androidx.compose.foundation.layout.g.i(androidx.compose.ui.e.a, UIConstant.INSTANCE.getDefaultVerticalSpacing-D9Ej5fM()), mVar2, 0);
                mVar2.P();
            }
            OfferDetailsKt.OfferDetails(legacy, colors, mVar2, i3, i4);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(nVar, legacy, i));
        }
    }

    private static final void Template1NoFooterPaywallPreview(m mVar, int i) {
        m i2 = mVar.i(363342818);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(363342818, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1NoFooterPaywallPreview (Template1.kt:223)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate1OfferingNoFooter(), null, false, false, 29, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template1PaywallPreview(m mVar, int i) {
        m i2 = mVar.i(854103102);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(854103102, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template1PaywallPreview (Template1.kt:214)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate1Offering(), null, false, false, 29, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$CircleMask(boolean z, p pVar, m mVar, int i) {
        CircleMask(z, pVar, mVar, i);
    }

    public static final /* synthetic */ float access$CircleMask$circleOffsetX(float f, long j) {
        return CircleMask$circleOffsetX(f, j);
    }

    public static final /* synthetic */ float access$CircleMask$circleOffsetY(float f, long j) {
        return CircleMask$circleOffsetY(f, j);
    }

    public static final /* synthetic */ void access$CircleMaskPreview(m mVar, int i) {
        CircleMaskPreview(mVar, i);
    }

    public static final /* synthetic */ void access$HeaderImage(Uri uri, boolean z, m mVar, int i) {
        HeaderImage(uri, z, mVar, i);
    }

    public static final /* synthetic */ void access$Template1CondensedFooterPaywallPreview(m mVar, int i) {
        Template1CondensedFooterPaywallPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template1FooterPaywallPreview(m mVar, int i) {
        Template1FooterPaywallPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template1MainContent(n nVar, PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        Template1MainContent(nVar, legacy, mVar, i);
    }

    public static final /* synthetic */ void access$Template1NoFooterPaywallPreview(m mVar, int i) {
        Template1NoFooterPaywallPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template1PaywallPreview(m mVar, int i) {
        Template1PaywallPreview(mVar, i);
    }
}
