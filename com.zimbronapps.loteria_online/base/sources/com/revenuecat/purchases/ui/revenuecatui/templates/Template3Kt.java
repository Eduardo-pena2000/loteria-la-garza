package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import F.T;
import F.V;
import F.W;
import F.Y;
import F.c;
import F.n;
import F.o;
import M.i;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import W0.D;
import W0.s;
import X.E;
import Z0.Y0;
import android.net.Uri;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IconImageKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import d1.L;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import n1.h;
import o0.e;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template3Kt {

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(D semantics) {
            t.g(semantics, "$this$semantics");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((D) obj);
            return I.a;
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallData.LocalizedConfiguration.Feature $feature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, int i) {
            super(2);
            this.$feature = feature;
            this.$colors = colors;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template3Kt.access$Feature(this.$feature, this.$colors, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Legacy legacy, int i) {
            super(2);
            this.$state = legacy;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template3Kt.access$Icon(this.$state, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_LandscapeContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i) {
            super(2);
            this.$this_LandscapeContent = nVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template3Kt.access$LandscapeContent(this.$this_LandscapeContent, this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_PortraitContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i) {
            super(2);
            this.$this_PortraitContent = nVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template3Kt.access$PortraitContent(this.$this_PortraitContent, this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
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
            Template3Kt.Template3(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
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
            Template3Kt.access$Template3CondensedFooterPreview(mVar, g1.a(this.$$changed | 1));
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
            Template3Kt.access$Template3FooterPreview(mVar, g1.a(this.$$changed | 1));
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
            Template3Kt.access$Template3Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Legacy legacy, int i) {
            super(2);
            this.$state = legacy;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template3Kt.access$Title(this.$state, mVar, g1.a(this.$$changed | 1));
        }
    }

    private static final void Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        int i3;
        m mVar2;
        m i4 = mVar.i(-840535719);
        if ((i & 6) == 0) {
            i2 = (i4.E(feature) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i4.U(colors) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i4.j()) {
            i4.M();
            mVar2 = i4;
        } else {
            if (w.L()) {
                w.U(-840535719, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Feature (Template3.kt:198)");
            }
            e.a aVar = e.a;
            e.c l = aVar.l();
            e.a aVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e h = g.h(aVar2, 0.0f, 1, (Object) null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e k = f.k(h, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), 0.0f, 2, (Object) null);
            Template3UIConstants template3UIConstants = Template3UIConstants.INSTANCE;
            androidx.compose.ui.e e = s.e(f.m(k, 0.0f, h.g(template3UIConstants.getIconPadding-D9Ej5fM() * 2), 0.0f, 0.0f, 13, (Object) null), true, 1.INSTANCE);
            c cVar = c.a;
            B b = T.b(cVar.g(), l, i4, 48);
            int a = b0.h.a(i4, 0);
            b0.I r = i4.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i4, e);
            g.a aVar3 = O0.g.E8;
            a a2 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a2);
            } else {
                i4.s();
            }
            m b2 = m2.b(i4);
            m2.e(b2, b, aVar3.e());
            m2.e(b2, r, aVar3.g());
            p b3 = aVar3.b();
            if (b2.f() || !t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar3.f());
            W w = W.a;
            String iconID = feature.getIconID();
            PaywallIconName fromValue = iconID != null ? PaywallIconName.Companion.fromValue(iconID) : null;
            i4.V(-115319316);
            if (fromValue == null) {
                i3 = 0;
            } else {
                androidx.compose.ui.e d = androidx.compose.foundation.a.d(s0.h.a(androidx.compose.foundation.layout.g.r(aVar2, template3UIConstants.getFeatureIconSize-D9Ej5fM()), i.g()), colors.getAccent2-0d7_KjU(), (E1) null, 2, (Object) null);
                B h2 = F.f.h(aVar.o(), false);
                int a3 = b0.h.a(i4, 0);
                b0.I r2 = i4.r();
                androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i4, d);
                a a4 = aVar3.a();
                if (i4.k() == null) {
                    b0.h.d();
                }
                i4.I();
                if (i4.f()) {
                    i4.p(a4);
                } else {
                    i4.s();
                }
                m b4 = m2.b(i4);
                m2.e(b4, h2, aVar3.e());
                m2.e(b4, r2, aVar3.g());
                p b5 = aVar3.b();
                if (b4.f() || !t.c(b4.C(), Integer.valueOf(a3))) {
                    b4.t(Integer.valueOf(a3));
                    b4.J(Integer.valueOf(a3), b5);
                }
                m2.e(b4, f2, aVar3.f());
                androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.c.a;
                i3 = 0;
                PaywallIconKt.PaywallIcon-FNF3uiM(fromValue, f.i(aVar2, template3UIConstants.getIconPadding-D9Ej5fM()), colors.getAccent1-0d7_KjU(), i4, 48, 0);
                i4.v();
                I i5 = I.a;
            }
            i4.P();
            androidx.compose.ui.e m = f.m(aVar2, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            B a5 = F.l.a(cVar.h(), aVar.k(), i4, i3);
            int a6 = b0.h.a(i4, i3);
            b0.I r3 = i4.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i4, m);
            a a7 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a7);
            } else {
                i4.s();
            }
            m b6 = m2.b(i4);
            m2.e(b6, a5, aVar3.e());
            m2.e(b6, r3, aVar3.g());
            p b7 = aVar3.b();
            if (b6.f() || !t.c(b6.C(), Integer.valueOf(a6))) {
                b6.t(Integer.valueOf(a6));
                b6.J(Integer.valueOf(a6), b7);
            }
            m2.e(b6, f3, aVar3.f());
            o oVar = o.a;
            E e2 = E.a;
            int i6 = E.b;
            Y0 b8 = e2.c(i4, i6).b();
            L.a aVar4 = L.b;
            L b9 = aVar4.b();
            j.a aVar5 = j.b;
            MarkdownKt.Markdown-DkhmgE0(feature.getTitle(), null, colors.getText1-0d7_KjU(), b8, 0L, b9, null, null, j.h(aVar5.f()), false, true, false, i4, 196608, 54, 722);
            String content = feature.getContent();
            i4.V(-929124297);
            if (content == null) {
                mVar2 = i4;
            } else {
                mVar2 = i4;
                MarkdownKt.Markdown-DkhmgE0(content, null, colors.getText2-0d7_KjU(), e2.c(i4, i6).c(), 0L, aVar4.g(), null, null, j.h(aVar5.f()), false, true, false, mVar2, 196608, 54, 722);
                I i7 = I.a;
            }
            mVar2.P();
            mVar2.v();
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = mVar2.l();
        if (l2 != null) {
            l2.a(new 3(feature, colors, i));
        }
    }

    private static final void Features-TDGSqEk(n nVar, PaywallState.Loaded.Legacy legacy, float f, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-2122368427);
        if ((i & 6) == 0) {
            i2 = (i3.U(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(legacy) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.c(f) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-2122368427, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features (Template3.kt:172)");
            }
            List features = PaywallStateKt.getSelectedLocalization(legacy).getFeatures();
            TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(i3, 0);
            if (features.isEmpty()) {
                if (w.L()) {
                    w.T();
                }
                B1 l = i3.l();
                if (l != null) {
                    l.a(new Template3Kt$Features$1(nVar, legacy, f, i));
                    return;
                }
                return;
            }
            androidx.compose.ui.e d = androidx.compose.foundation.layout.g.d(n.b(nVar, androidx.compose.foundation.e.f(androidx.compose.ui.e.a, androidx.compose.foundation.e.c(0, i3, 0, 1), false, (C.n) null, false, 14, (Object) null), 1.0f, false, 2, (Object) null), 0.0f, 1, (Object) null);
            c cVar = c.a;
            e.a aVar = o0.e.a;
            B a = F.l.a(cVar.q(f, aVar.i()), aVar.k(), i3, 0);
            int a2 = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i3, d);
            g.a aVar2 = O0.g.E8;
            a a3 = aVar2.a();
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
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f2, aVar2.f());
            o oVar = o.a;
            i3.V(-1766546977);
            Iterator it = features.iterator();
            while (it.hasNext()) {
                Feature((PaywallData.LocalizedConfiguration.Feature) it.next(), currentColors, i3, 0);
            }
            i3.P();
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = i3.l();
        if (l2 != null) {
            l2.a(new Template3Kt$Features$3(nVar, legacy, f, i));
        }
    }

    private static final void Icon(PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-743688035);
        if ((i & 6) == 0) {
            i2 = (i3.U(legacy) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-743688035, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Icon (Template3.kt:144)");
            }
            Uri iconUri = legacy.getTemplateConfiguration().getImages().getIconUri();
            Template3UIConstants template3UIConstants = Template3UIConstants.INSTANCE;
            IconImageKt.IconImage-djqs-MU(iconUri, template3UIConstants.getIconSize-D9Ej5fM(), template3UIConstants.getIconCornerRadius-D9Ej5fM(), f.m(androidx.compose.ui.e.a, 0.0f, UIConstant.INSTANCE.getDefaultVerticalSpacing-D9Ej5fM(), 0.0f, 0.0f, 13, (Object) null), i3, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(legacy, i));
        }
    }

    private static final void LandscapeContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        int i2;
        m mVar2;
        int i3;
        PaywallViewModel paywallViewModel2;
        m i4 = mVar.i(-1763419076);
        if ((i & 6) == 0) {
            i2 = (i4.U(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i4.U(legacy) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i4.U(paywallViewModel) ? 256 : 128;
        }
        int i5 = i2;
        if ((i5 & 147) == 146 && i4.j()) {
            i4.M();
            mVar2 = i4;
            i3 = i;
            paywallViewModel2 = paywallViewModel;
        } else {
            if (w.L()) {
                w.U(-1763419076, i5, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.LandscapeContent (Template3.kt:106)");
            }
            c.e c = c.a.a.c();
            e.a aVar = o0.e.a;
            e.c i6 = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e b = n.b(nVar, aVar2, 1.0f, false, 2, (Object) null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e k = f.k(f.m(b, 0.0f, uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), 0.0f, 0.0f, 13, (Object) null), uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), 0.0f, 2, (Object) null);
            B b2 = T.b(c, i6, i4, 54);
            int a = b0.h.a(i4, 0);
            b0.I r = i4.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i4, k);
            g.a aVar3 = O0.g.E8;
            a a2 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a2);
            } else {
                i4.s();
            }
            m b3 = m2.b(i4);
            m2.e(b3, b2, aVar3.e());
            m2.e(b3, r, aVar3.g());
            p b4 = aVar3.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a))) {
                b3.t(Integer.valueOf(a));
                b3.J(Integer.valueOf(a), b4);
            }
            m2.e(b3, f, aVar3.f());
            W w = W.a;
            androidx.compose.ui.e c2 = V.c(w, aVar2, 0.5f, false, 2, (Object) null);
            e.b g = aVar.g();
            c cVar = c.a;
            B a3 = F.l.a(cVar.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar.i()), g, i4, 48);
            int a4 = b0.h.a(i4, 0);
            b0.I r2 = i4.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i4, c2);
            a a5 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a5);
            } else {
                i4.s();
            }
            m b5 = m2.b(i4);
            m2.e(b5, a3, aVar3.e());
            m2.e(b5, r2, aVar3.g());
            p b6 = aVar3.b();
            if (b5.f() || !t.c(b5.C(), Integer.valueOf(a4))) {
                b5.t(Integer.valueOf(a4));
                b5.J(Integer.valueOf(a4), b6);
            }
            m2.e(b5, f2, aVar3.f());
            o oVar = o.a;
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i4, 0);
            int i7 = i5 >> 3;
            int i8 = i7 & 14;
            Icon(legacy, i4, i8);
            Title(legacy, i4, i8);
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i4, 0);
            i4.v();
            androidx.compose.ui.e c3 = V.c(w, aVar2, 0.5f, false, 2, (Object) null);
            B a6 = F.l.a(cVar.h(), aVar.k(), i4, 0);
            int a7 = b0.h.a(i4, 0);
            b0.I r3 = i4.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i4, c3);
            a a8 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a8);
            } else {
                i4.s();
            }
            m b7 = m2.b(i4);
            m2.e(b7, a6, aVar3.e());
            m2.e(b7, r3, aVar3.g());
            p b8 = aVar3.b();
            if (b7.f() || !t.c(b7.C(), Integer.valueOf(a7))) {
                b7.t(Integer.valueOf(a7));
                b7.J(Integer.valueOf(a7), b8);
            }
            m2.e(b7, f3, aVar3.f());
            Features-TDGSqEk(oVar, legacy, Template3UIConstants.INSTANCE.getFeatureSpacingLandscape-D9Ej5fM(), i4, 390 | (i5 & 112));
            OfferDetailsKt.OfferDetails-RPmYEkk(legacy, legacy.getTemplateConfiguration().getCurrentColors(i4, 0).getText2-0d7_KjU(), i4, i8);
            mVar2 = i4;
            i3 = i;
            paywallViewModel2 = paywallViewModel;
            PurchaseButtonKt.PurchaseButton-hGBTI10(legacy, paywallViewModel, null, h.g(0), null, i4, i8 | 3072 | (i7 & 112), 20);
            mVar2.v();
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(nVar, legacy, paywallViewModel2, i3));
        }
    }

    private static final void PortraitContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        int i2;
        m i3 = mVar.i(949126752);
        if ((i & 6) == 0) {
            i2 = (i3.U(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(legacy) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(paywallViewModel) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(949126752, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.PortraitContent (Template3.kt:77)");
            }
            i3.V(-217227990);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                androidx.compose.ui.e h = androidx.compose.foundation.layout.g.h(n.b(nVar, androidx.compose.ui.e.a, 1.0f, false, 2, (Object) null), 0.0f, 1, (Object) null);
                UIConstant uIConstant = UIConstant.INSTANCE;
                androidx.compose.ui.e j = f.j(h, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
                e.a aVar = o0.e.a;
                B a = F.l.a(c.a.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar.l()), aVar.g(), i3, 48);
                int a2 = b0.h.a(i3, 0);
                b0.I r = i3.r();
                androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, j);
                g.a aVar2 = O0.g.E8;
                a a3 = aVar2.a();
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
                m2.e(b, a, aVar2.e());
                m2.e(b, r, aVar2.g());
                p b2 = aVar2.b();
                if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                    b.t(Integer.valueOf(a2));
                    b.J(Integer.valueOf(a2), b2);
                }
                m2.e(b, f, aVar2.f());
                o oVar = o.a;
                InsetSpacersKt.StatusBarSpacer(i3, 0);
                int i4 = (i2 >> 3) & 14;
                Icon(legacy, i3, i4);
                Title(legacy, i3, i4);
                Features-TDGSqEk(oVar, legacy, Template3UIConstants.INSTANCE.getFeatureSpacingPortrait-D9Ej5fM(), i3, (i2 & 112) | 390);
                i3.v();
            }
            i3.P();
            Y.a(androidx.compose.foundation.layout.g.i(androidx.compose.ui.e.a, UIConstant.INSTANCE.getDefaultVerticalSpacing-D9Ej5fM()), i3, 0);
            int i5 = i2 >> 3;
            OfferDetailsKt.OfferDetails-RPmYEkk(legacy, legacy.getTemplateConfiguration().getCurrentColors(i3, 0).getText2-0d7_KjU(), i3, i5 & 14);
            PurchaseButtonKt.PurchaseButton-hGBTI10(legacy, paywallViewModel, null, 0.0f, null, i3, i5 & 126, 28);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(nVar, legacy, paywallViewModel, i));
        }
    }

    public static final void Template3(PaywallState.Loaded.Legacy state, PaywallViewModel viewModel, m mVar, int i) {
        int i2;
        t.g(state, "state");
        t.g(viewModel, "viewModel");
        m i3 = mVar.i(-533890389);
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
                w.U(-533890389, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3 (Template3.kt:64)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            B a = F.l.a(c.a.h(), o0.e.a.k(), i3, 0);
            int a2 = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, aVar);
            g.a aVar2 = O0.g.E8;
            a a3 = aVar2.a();
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
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            o oVar = o.a;
            if (WindowHelperKt.shouldUseLandscapeLayout(state, i3, i2 & 14)) {
                i3.V(-1741914098);
                int i4 = i2 << 3;
                LandscapeContent(oVar, state, viewModel, i3, (i4 & 896) | 6 | (i4 & 112));
                i3.P();
            } else {
                i3.V(-1741850641);
                int i5 = i2 << 3;
                PortraitContent(oVar, state, viewModel, i3, (i5 & 896) | 6 | (i5 & 112));
                i3.P();
            }
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

    private static final void Template3CondensedFooterPreview(m mVar, int i) {
        m i2 = mVar.i(1430130282);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1430130282, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3CondensedFooterPreview (Template3.kt:280)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate3Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template3FooterPreview(m mVar, int i) {
        m i2 = mVar.i(-377072487);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-377072487, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3FooterPreview (Template3.kt:271)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate3Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template3Preview(m mVar, int i) {
        m i2 = mVar.i(2025889118);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(2025889118, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template3Preview (Template3.kt:262)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate3Offering(), null, false, false, 29, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Title(PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(887524410);
        if ((i & 6) == 0) {
            i2 = (i3.U(legacy) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(887524410, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Title (Template3.kt:156)");
            }
            mVar2 = i3;
            MarkdownKt.Markdown-DkhmgE0(PaywallStateKt.getSelectedLocalization(legacy).getTitle(), null, legacy.getTemplateConfiguration().getCurrentColors(i3, 0).getText1-0d7_KjU(), E.a.c(i3, E.b).i(), 0L, L.b.h(), null, null, j.h(j.b.a()), false, true, false, mVar2, 196608, 54, 722);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 1(legacy, i));
        }
    }

    public static final /* synthetic */ void access$Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, m mVar, int i) {
        Feature(feature, colors, mVar, i);
    }

    public static final /* synthetic */ void access$Features-TDGSqEk(n nVar, PaywallState.Loaded.Legacy legacy, float f, m mVar, int i) {
        Features-TDGSqEk(nVar, legacy, f, mVar, i);
    }

    public static final /* synthetic */ void access$Icon(PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        Icon(legacy, mVar, i);
    }

    public static final /* synthetic */ void access$LandscapeContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        LandscapeContent(nVar, legacy, paywallViewModel, mVar, i);
    }

    public static final /* synthetic */ void access$PortraitContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        PortraitContent(nVar, legacy, paywallViewModel, mVar, i);
    }

    public static final /* synthetic */ void access$Template3CondensedFooterPreview(m mVar, int i) {
        Template3CondensedFooterPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template3FooterPreview(m mVar, int i) {
        Template3FooterPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template3Preview(m mVar, int i) {
        Template3Preview(mVar, i);
    }

    public static final /* synthetic */ void access$Title(PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        Title(legacy, mVar, i);
    }
}
