package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import F.T;
import F.V;
import F.W;
import F.Y;
import F.c;
import F.f;
import F.n;
import F.o;
import M.i;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import W0.D;
import W0.s;
import X.E;
import X.m0;
import Z0.Y0;
import android.net.Uri;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.T1;
import b0.U1;
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
import com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.RemoteImageKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.AnimationsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import d1.H;
import d1.L;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import n1.h;
import o0.e;
import v0.E1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template5Kt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, int i, int i2) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$AnimatedPackages(this.$state, this.$viewModel, this.$packageSelectionVisible, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z, TemplateConfiguration.Colors colors, int i) {
            super(2);
            this.$isSelected = z;
            this.$colors = colors;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$CheckmarkBox(this.$isSelected, this.$colors, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ V $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, int i) {
            super(2);
            this.$this_DiscountBanner = v;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ V $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, int i) {
            super(2);
            this.$this_DiscountBanner = v;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, mVar, g1.a(this.$$changed | 1));
        }
    }

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
            Template5Kt.access$Feature(this.$feature, this.$colors, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Legacy legacy, int i) {
            super(2);
            this.$state = legacy;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$Features(this.$state, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Uri uri, int i) {
            super(2);
            this.$uri = uri;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$HeaderImage(this.$uri, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements q {
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ long $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(TemplateConfiguration.PackageInfo packageInfo, long j, boolean z, TemplateConfiguration.Colors colors, PaywallState.Loaded.Legacy legacy) {
            super(3);
            this.$packageInfo = packageInfo;
            this.$textColor = j;
            this.$isSelected = z;
            this.$colors = colors;
            this.$state = legacy;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(V Button, m mVar, int i) {
            t.g(Button, "$this$Button");
            if ((i & 17) == 16 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(644978660, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous> (Template5.kt:402)");
            }
            e.a aVar = e.a;
            e h = g.h(aVar, 0.0f, 1, (Object) null);
            c cVar = c.a;
            c.f o = cVar.o(h.g(4));
            e.a aVar2 = o0.e.a;
            e.b k = aVar2.k();
            TemplateConfiguration.PackageInfo packageInfo = this.$packageInfo;
            long j = this.$textColor;
            boolean z = this.$isSelected;
            TemplateConfiguration.Colors colors = this.$colors;
            PaywallState.Loaded.Legacy legacy = this.$state;
            B a = F.l.a(o, k, mVar, 54);
            int a2 = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, h);
            g.a aVar3 = O0.g.E8;
            a a3 = aVar3.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a3);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, a, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar3.f());
            o oVar = o.a;
            B b3 = T.b(cVar.o(h.g(6)), aVar2.i(), mVar, 54);
            int a4 = b0.h.a(mVar, 0);
            b0.I r2 = mVar.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(mVar, aVar);
            a a5 = aVar3.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a5);
            } else {
                mVar.s();
            }
            m b4 = m2.b(mVar);
            m2.e(b4, b3, aVar3.e());
            m2.e(b4, r2, aVar3.g());
            p b5 = aVar3.b();
            if (b4.f() || !t.c(b4.C(), Integer.valueOf(a4))) {
                b4.t(Integer.valueOf(a4));
                b4.J(Integer.valueOf(a4), b5);
            }
            m2.e(b4, f2, aVar3.f());
            W w = W.a;
            Template5Kt.access$CheckmarkBox(z, colors, mVar, 0);
            String offerName = packageInfo.getLocalization().getOfferName();
            if (offerName == null) {
                offerName = packageInfo.getRcPackage().getProduct().getTitle();
            }
            E e = E.a;
            int i2 = E.b;
            m0.b(offerName, w.a(aVar, 1.0f, true), j, 0L, (H) null, L.b.h(), (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, e.c(mVar, i2).b(), mVar, 196608, 0, 65496);
            Template5Kt.access$DiscountBanner(w, legacy, packageInfo, mVar, 6);
            mVar.v();
            IntroEligibilityStateViewKt.IntroEligibilityStateView-QETHhvg(packageInfo.getLocalization().getOfferDetails(), packageInfo.getLocalization().getOfferDetailsWithIntroOffer(), packageInfo.getLocalization().getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility(packageInfo), j, e.c(mVar, i2).c(), null, null, false, null, mVar, 100663296, 704);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_SelectPackageButton;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, int i) {
            super(2);
            this.$this_SelectPackageButton = nVar;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$SelectPackageButton(this.$this_SelectPackageButton, this.$state, this.$packageInfo, this.$viewModel, mVar, g1.a(this.$$changed | 1));
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
            Template5Kt.Template5(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_Template5LandscapeContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i) {
            super(2);
            this.$this_Template5LandscapeContent = nVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$Template5LandscapeContent(this.$this_Template5LandscapeContent, this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
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
            Template5Kt.access$Template5PaywallFooterCondensedPreview(mVar, g1.a(this.$$changed | 1));
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
            Template5Kt.access$Template5PaywallFooterPreview(mVar, g1.a(this.$$changed | 1));
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
            Template5Kt.access$Template5PaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_Template5PortraitContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, int i) {
            super(2);
            this.$this_Template5PortraitContent = nVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$Template5PortraitContent(this.$this_Template5PortraitContent, this.$state, this.$viewModel, this.$packageSelectionVisible, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_Title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(n nVar, PaywallState.Loaded.Legacy legacy, int i) {
            super(2);
            this.$this_Title = nVar;
            this.$state = legacy;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template5Kt.access$Title(this.$this_Title, this.$state, mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void AnimatedPackages(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r18, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r19, boolean r20, b0.m r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt.AnimatedPackages(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, boolean, b0.m, int, int):void");
    }

    private static final void CheckmarkBox(boolean z, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        m i3 = mVar.i(1250908873);
        if ((i & 6) == 0) {
            i2 = (i3.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(colors) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1250908873, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox (Template5.kt:435)");
            }
            androidx.compose.ui.e d = androidx.compose.foundation.a.d(s0.h.a(androidx.compose.foundation.layout.g.r(androidx.compose.ui.e.a, Template5UIConstants.INSTANCE.getCheckmarkSize-D9Ej5fM()), i.g()), z ? colors.getBackground-0d7_KjU() : getUnselectedOutline(colors), (E1) null, 2, (Object) null);
            B h = f.h(o0.e.a.o(), false);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, d);
            g.a aVar = O0.g.E8;
            a a2 = aVar.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            i3.V(1030131166);
            if (z) {
                PaywallIconKt.PaywallIcon-FNF3uiM(PaywallIconName.CHECK_CIRCLE, null, getSelectedOutline(colors), i3, 6, 2);
            }
            i3.P();
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(z, colors, i));
        }
    }

    private static final void DiscountBanner(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1630065399);
        if ((i & 6) == 0) {
            i2 = (i3.U(v) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(legacy) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(packageInfo) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !i3.j()) {
            if (w.L()) {
                w.U(1630065399, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.DiscountBanner (Template5.kt:455)");
            }
            String offerBadge = packageInfo.getLocalization().getOfferBadge();
            if (offerBadge != null) {
                String upperCase = offerBadge.toUpperCase(Locale.ROOT);
                t.f(upperCase, "toUpperCase(...)");
                if (upperCase != null) {
                    if (Za.E.h0(upperCase)) {
                        if (w.L()) {
                            w.T();
                        }
                        B1 l = i3.l();
                        if (l != null) {
                            l.a(new 1(v, legacy, packageInfo, i));
                            return;
                        }
                        return;
                    }
                    int i4 = i2 >> 3;
                    TemplateConfiguration.Colors currentColors = PaywallStateKt.getCurrentColors(legacy, i3, i4 & 14);
                    int i5 = i4 & 126;
                    long j = AnimationsKt.packageButtonColorAnimation-9z6LAg8(legacy, packageInfo, getSelectedOutline(currentColors), getUnselectedOutline(currentColors), i3, i5);
                    long j2 = AnimationsKt.packageButtonColorAnimation-9z6LAg8(legacy, packageInfo, getSelectedDiscountText(currentColors), getUnselectedDiscountText(currentColors), i3, i5);
                    e.a aVar = androidx.compose.ui.e.a;
                    e.a aVar2 = o0.e.a;
                    androidx.compose.ui.e b = v.b(aVar, aVar2.l());
                    UIConstant uIConstant = UIConstant.INSTANCE;
                    float f = uIConstant.getDefaultHorizontalPadding-D9Ej5fM();
                    Template5UIConstants template5UIConstants = Template5UIConstants.INSTANCE;
                    androidx.compose.ui.e a = androidx.compose.foundation.layout.e.a(b, h.g(f - template5UIConstants.getDiscountPadding-D9Ej5fM()), h.g(h.g(-uIConstant.getDefaultVerticalSpacing-D9Ej5fM()) + template5UIConstants.getDiscountPadding-D9Ej5fM()));
                    B h = f.h(aVar2.o(), false);
                    int a2 = b0.h.a(i3, 0);
                    b0.I r = i3.r();
                    androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i3, a);
                    g.a aVar3 = O0.g.E8;
                    a a3 = aVar3.a();
                    if (i3.k() == null) {
                        b0.h.d();
                    }
                    i3.I();
                    if (i3.f()) {
                        i3.p(a3);
                    } else {
                        i3.s();
                    }
                    m b2 = m2.b(i3);
                    m2.e(b2, h, aVar3.e());
                    m2.e(b2, r, aVar3.g());
                    p b3 = aVar3.b();
                    if (b2.f() || !t.c(b2.C(), Integer.valueOf(a2))) {
                        b2.t(Integer.valueOf(a2));
                        b2.J(Integer.valueOf(a2), b3);
                    }
                    m2.e(b2, f2, aVar3.f());
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
                    androidx.compose.ui.e k = androidx.compose.foundation.layout.f.k(androidx.compose.foundation.layout.f.k(androidx.compose.foundation.a.c(aVar, j, X.i.a.k(i3, X.i.o)), 0.0f, h.g(4), 1, (Object) null), h.g(8), 0.0f, 2, (Object) null);
                    B h2 = f.h(aVar2.o(), false);
                    int a4 = b0.h.a(i3, 0);
                    b0.I r2 = i3.r();
                    androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i3, k);
                    a a5 = aVar3.a();
                    if (i3.k() == null) {
                        b0.h.d();
                    }
                    i3.I();
                    if (i3.f()) {
                        i3.p(a5);
                    } else {
                        i3.s();
                    }
                    m b4 = m2.b(i3);
                    m2.e(b4, h2, aVar3.e());
                    m2.e(b4, r2, aVar3.g());
                    p b5 = aVar3.b();
                    if (b4.f() || !t.c(b4.C(), Integer.valueOf(a4))) {
                        b4.t(Integer.valueOf(a4));
                        b4.J(Integer.valueOf(a4), b5);
                    }
                    m2.e(b4, f3, aVar3.f());
                    mVar2 = i3;
                    m0.b(upperCase, (androidx.compose.ui.e) null, j2, 0L, (H) null, L.b.g(), (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(i3, E.b).m(), mVar2, 196608, 0, 65498);
                    mVar2.v();
                    mVar2.v();
                    if (w.L()) {
                        w.T();
                    }
                }
            }
            if (w.L()) {
                w.T();
            }
            B1 l2 = i3.l();
            if (l2 != null) {
                l2.a(new Template5Kt$DiscountBanner$text$1(v, legacy, packageInfo, i));
                return;
            }
            return;
        }
        i3.M();
        mVar2 = i3;
        B1 l3 = mVar2.l();
        if (l3 != null) {
            l3.a(new 3(v, legacy, packageInfo, i));
        }
    }

    private static final void Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(-840476137);
        if ((i & 6) == 0) {
            i2 = (i3.E(feature) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(colors) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-840476137, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Feature (Template5.kt:274)");
            }
            e.a aVar = o0.e.a;
            e.c i4 = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e e = s.e(androidx.compose.foundation.layout.g.h(aVar2, 0.0f, 1, (Object) null), true, 1.INSTANCE);
            c cVar = c.a;
            B b = T.b(cVar.g(), i4, i3, 48);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, e);
            g.a aVar3 = O0.g.E8;
            a a2 = aVar3.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b2 = m2.b(i3);
            m2.e(b2, b, aVar3.e());
            m2.e(b2, r, aVar3.g());
            p b3 = aVar3.b();
            if (b2.f() || !t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar3.f());
            W w = W.a;
            androidx.compose.ui.e r2 = androidx.compose.foundation.layout.g.r(aVar2, Template5UIConstants.INSTANCE.getFeatureIconSize-D9Ej5fM());
            B h = f.h(aVar.o(), false);
            int a3 = b0.h.a(i3, 0);
            b0.I r3 = i3.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i3, r2);
            a a4 = aVar3.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a4);
            } else {
                i3.s();
            }
            m b4 = m2.b(i3);
            m2.e(b4, h, aVar3.e());
            m2.e(b4, r3, aVar3.g());
            p b5 = aVar3.b();
            if (b4.f() || !t.c(b4.C(), Integer.valueOf(a3))) {
                b4.t(Integer.valueOf(a3));
                b4.J(Integer.valueOf(a3), b5);
            }
            m2.e(b4, f2, aVar3.f());
            androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.c.a;
            String iconID = feature.getIconID();
            PaywallIconName fromValue = iconID != null ? PaywallIconName.Companion.fromValue(iconID) : null;
            i3.V(-929062679);
            if (fromValue != null) {
                PaywallIconKt.PaywallIcon-FNF3uiM(fromValue, null, getFeatureIcon(colors), i3, 0, 2);
                I i5 = I.a;
            }
            i3.P();
            i3.v();
            androidx.compose.ui.e m = androidx.compose.foundation.layout.f.m(aVar2, UIConstant.INSTANCE.getDefaultHorizontalPadding-D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            B a5 = F.l.a(cVar.h(), aVar.k(), i3, 0);
            int a6 = b0.h.a(i3, 0);
            b0.I r4 = i3.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i3, m);
            a a7 = aVar3.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a7);
            } else {
                i3.s();
            }
            m b6 = m2.b(i3);
            m2.e(b6, a5, aVar3.e());
            m2.e(b6, r4, aVar3.g());
            p b7 = aVar3.b();
            if (b6.f() || !t.c(b6.C(), Integer.valueOf(a6))) {
                b6.t(Integer.valueOf(a6));
                b6.J(Integer.valueOf(a6), b7);
            }
            m2.e(b6, f3, aVar3.f());
            o oVar = o.a;
            E e2 = E.a;
            int i6 = E.b;
            Y0 b8 = e2.c(i3, i6).b();
            L.a aVar4 = L.b;
            L g = aVar4.g();
            j.a aVar5 = j.b;
            MarkdownKt.Markdown-DkhmgE0(feature.getTitle(), null, colors.getText1-0d7_KjU(), b8, 0L, g, null, null, j.h(aVar5.f()), false, true, false, i3, 196608, 54, 722);
            String content = feature.getContent();
            i3.V(-929039817);
            if (content == null) {
                mVar2 = i3;
            } else {
                mVar2 = i3;
                MarkdownKt.Markdown-DkhmgE0(content, null, colors.getText2-0d7_KjU(), e2.c(i3, i6).c(), 0L, aVar4.g(), null, null, j.h(aVar5.f()), false, true, false, mVar2, 196608, 54, 722);
                I i7 = I.a;
            }
            mVar2.P();
            mVar2.v();
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 3(feature, colors, i));
        }
    }

    private static final void Features(PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-330300649);
        if ((i & 6) == 0) {
            i2 = (i3.U(legacy) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-330300649, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features (Template5.kt:259)");
            }
            TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(i3, 0);
            Iterator it = PaywallStateKt.getSelectedLocalization(legacy).getFeatures().iterator();
            while (it.hasNext()) {
                Feature((PaywallData.LocalizedConfiguration.Feature) it.next(), currentColors, i3, 0);
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(legacy, i));
        }
    }

    private static final void HeaderImage(Uri uri, m mVar, int i) {
        int i2;
        m i3 = mVar.i(108940117);
        if ((i & 6) == 0) {
            i2 = (i3.E(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(108940117, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage (Template5.kt:228)");
            }
            if (uri != null) {
                String uri2 = uri.toString();
                t.f(uri2, "uri.toString()");
                RemoteImageKt.RemoteImage(uri2, b.b(androidx.compose.ui.e.a, 2.0f, false, 2, (Object) null), null, M0.f.a.a(), null, null, 0.0f, null, i3, 3120, 244);
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(uri, i));
        }
    }

    private static final void SelectPackageButton(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(423303156);
        if ((i & 6) == 0) {
            i2 = (i3.U(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(legacy) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(packageInfo) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.U(paywallViewModel) ? 2048 : 1024;
        }
        int i4 = i2;
        if ((i4 & 1171) == 1170 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(423303156, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton (Template5.kt:370)");
            }
            int i5 = i4 >> 3;
            TemplateConfiguration.Colors currentColors = PaywallStateKt.getCurrentColors(legacy, i3, i5 & 14);
            boolean c = t.c(packageInfo, legacy.getSelectedPackage().getValue());
            float packageButtonActionInProgressOpacityAnimation = AnimationsKt.packageButtonActionInProgressOpacityAnimation(paywallViewModel, i3, (i4 >> 9) & 14);
            long j = currentColors.getText1-0d7_KjU();
            long j2 = AnimationsKt.packageButtonColorAnimation-9z6LAg8(legacy, packageInfo, getSelectedOutline(currentColors), getUnselectedOutline(currentColors), i3, i5 & 126);
            androidx.compose.ui.e c2 = nVar.c(s0.a.a(androidx.compose.foundation.layout.g.h(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), packageButtonActionInProgressOpacityAnimation), o0.e.a.k());
            i3.V(1055889971);
            boolean a = i3.a(c);
            Object C = i3.C();
            if (a || C == m.a.a()) {
                C = new Template5Kt$SelectPackageButton$1$1(c);
                i3.t(C);
            }
            i3.P();
            androidx.compose.ui.e f = s.f(c2, false, (l) C, 1, (Object) null);
            X.h b = X.i.a.b(r0.b.i(), j, 0L, 0L, i3, (X.i.o << 12) | 6, 12);
            UIConstant uIConstant = UIConstant.INSTANCE;
            M.h d = i.d(uIConstant.getDefaultPackageCornerRadius-D9Ej5fM());
            F.L b2 = androidx.compose.foundation.layout.f.b(uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            A.i a2 = A.j.a(uIConstant.getDefaultPackageBorderWidth-D9Ej5fM(), j2);
            i3.V(1055892294);
            boolean z = ((i4 & 7168) == 2048) | ((i4 & 896) == 256);
            Object C2 = i3.C();
            if (z || C2 == m.a.a()) {
                C2 = new Template5Kt$SelectPackageButton$2$1(paywallViewModel, packageInfo);
                i3.t(C2);
            }
            i3.P();
            mVar2 = i3;
            X.k.a((a) C2, f, false, d, b, (X.j) null, a2, b2, (E.m) null, j0.i.d(644978660, true, new 3(packageInfo, j, c, currentColors, legacy), mVar2, 54), mVar2, 805306368, 292);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 4(nVar, legacy, packageInfo, paywallViewModel, i));
        }
    }

    public static final void Template5(PaywallState.Loaded.Legacy state, PaywallViewModel viewModel, m mVar, int i) {
        int i2;
        t.g(state, "state");
        t.g(viewModel, "viewModel");
        m i3 = mVar.i(1727742443);
        if ((i & 6) == 0) {
            i2 = (i3.U(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(viewModel) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1727742443, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5 (Template5.kt:92)");
            }
            i3.V(-1567803066);
            Object C = i3.C();
            m.a aVar = m.a;
            if (C == aVar.a()) {
                C = U1.i(Boolean.valueOf(state.getTemplateConfiguration().getMode() != PaywallMode.FOOTER_CONDENSED), (T1) null, 2, (Object) null);
                i3.t(C);
            }
            C0 c0 = (C0) C;
            i3.P();
            e.a aVar2 = androidx.compose.ui.e.a;
            B a = F.l.a(c.a.h(), o0.e.a.k(), i3, 0);
            int a2 = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, aVar2);
            g.a aVar3 = O0.g.E8;
            a a3 = aVar3.a();
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
            m2.e(b, a, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar3.f());
            o oVar = o.a;
            if (WindowHelperKt.shouldUseLandscapeLayout(state, i3, i4 & 14)) {
                i3.V(1533583235);
                int i5 = i4 << 3;
                Template5LandscapeContent(oVar, state, viewModel, i3, (i5 & 896) | 6 | (i5 & 112));
                i3.P();
            } else {
                i3.V(1533656364);
                int i6 = i4 << 3;
                Template5PortraitContent(oVar, state, viewModel, Template5$lambda$1(c0), i3, 6 | (i6 & 112) | (i6 & 896));
                i3.P();
            }
            int i7 = i4 & 112;
            PurchaseButtonKt.PurchaseButton-hGBTI10(state, viewModel, null, 0.0f, null, i3, i4 & 126, 28);
            TemplateConfiguration templateConfiguration = state.getTemplateConfiguration();
            i3.V(188029008);
            Object C2 = i3.C();
            if (C2 == aVar.a()) {
                C2 = new Template5Kt$Template5$1$1$1(c0);
                i3.t(C2);
            }
            i3.P();
            FooterKt.Footer(templateConfiguration, viewModel, null, null, (a) C2, i3, i7 | 24576, 12);
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

    private static final boolean Template5$lambda$1(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void Template5$lambda$2(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final void Template5LandscapeContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        int i2;
        m i3 = mVar.i(1534776921);
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
        int i4 = i2;
        if ((i4 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1534776921, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5LandscapeContent (Template5.kt:175)");
            }
            androidx.compose.foundation.f c = androidx.compose.foundation.e.c(0, i3, 0, 1);
            androidx.compose.foundation.f c2 = androidx.compose.foundation.e.c(0, i3, 0, 1);
            c.e c3 = c.a.a.c();
            e.a aVar = o0.e.a;
            e.c i5 = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e b = n.b(nVar, aVar2, 1.0f, false, 2, (Object) null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e k = androidx.compose.foundation.layout.f.k(androidx.compose.foundation.layout.f.m(b, 0.0f, uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), 0.0f, 0.0f, 13, (Object) null), uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), 0.0f, 2, (Object) null);
            B b2 = T.b(c3, i5, i3, 54);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, k);
            g.a aVar3 = O0.g.E8;
            a a2 = aVar3.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b3 = m2.b(i3);
            m2.e(b3, b2, aVar3.e());
            m2.e(b3, r, aVar3.g());
            p b4 = aVar3.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a))) {
                b3.t(Integer.valueOf(a));
                b3.J(Integer.valueOf(a), b4);
            }
            m2.e(b3, f, aVar3.f());
            W w = W.a;
            androidx.compose.ui.e j = androidx.compose.foundation.layout.f.j(V.c(w, androidx.compose.foundation.e.f(aVar2, c, false, (C.n) null, false, 14, (Object) null), 1.0f, false, 2, (Object) null), uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            e.b g = aVar.g();
            c cVar = c.a;
            B a3 = F.l.a(cVar.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar.i()), g, i3, 48);
            int a4 = b0.h.a(i3, 0);
            b0.I r2 = i3.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i3, j);
            a a5 = aVar3.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a5);
            } else {
                i3.s();
            }
            m b5 = m2.b(i3);
            m2.e(b5, a3, aVar3.e());
            m2.e(b5, r2, aVar3.g());
            p b6 = aVar3.b();
            if (b5.f() || !t.c(b5.C(), Integer.valueOf(a4))) {
                b5.t(Integer.valueOf(a4));
                b5.J(Integer.valueOf(a4), b6);
            }
            m2.e(b5, f2, aVar3.f());
            o oVar = o.a;
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i3, 0);
            Title(oVar, legacy, i3, (i4 & 112) | 6);
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i3, 0);
            int i6 = i4 >> 3;
            Features(legacy, i3, i6 & 14);
            i3.v();
            androidx.compose.ui.e j2 = androidx.compose.foundation.layout.f.j(V.c(w, androidx.compose.foundation.e.f(aVar2, c2, false, (C.n) null, false, 14, (Object) null), 1.0f, false, 2, (Object) null), uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            B a6 = F.l.a(cVar.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar.i()), aVar.g(), i3, 48);
            int a7 = b0.h.a(i3, 0);
            b0.I r3 = i3.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i3, j2);
            a a8 = aVar3.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a8);
            } else {
                i3.s();
            }
            m b7 = m2.b(i3);
            m2.e(b7, a6, aVar3.e());
            m2.e(b7, r3, aVar3.g());
            p b8 = aVar3.b();
            if (b7.f() || !t.c(b7.C(), Integer.valueOf(a7))) {
                b7.t(Integer.valueOf(a7));
                b7.J(Integer.valueOf(a7), b8);
            }
            m2.e(b7, f3, aVar3.f());
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i3, 0);
            AnimatedPackages(legacy, paywallViewModel, false, i3, i6 & 126, 4);
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i3, 0);
            i3.v();
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(nVar, legacy, paywallViewModel, i));
        }
    }

    private static final void Template5PaywallFooterCondensedPreview(m mVar, int i) {
        m i2 = mVar.i(1995671160);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1995671160, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5PaywallFooterCondensedPreview (Template5.kt:544)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate5Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template5PaywallFooterPreview(m mVar, int i) {
        m i2 = mVar.i(2073587697);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(2073587697, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5PaywallFooterPreview (Template5.kt:534)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate5Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template5PaywallPreview(m mVar, int i) {
        m i2 = mVar.i(1911239734);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1911239734, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5PaywallPreview (Template5.kt:524)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate5Offering(), null, false, false, 29, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template5PortraitContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, m mVar, int i) {
        int i2;
        int i3;
        m i4 = mVar.i(2076791099);
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
        if ((i & 3072) == 0) {
            i2 |= i4.a(z) ? 2048 : 1024;
        }
        int i5 = i2;
        if ((i5 & 1171) == 1170 && i4.j()) {
            i4.M();
        } else {
            if (w.L()) {
                w.U(2076791099, i5, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template5PortraitContent (Template5.kt:120)");
            }
            Uri headerUri = legacy.getTemplateConfiguration().getImages().getHeaderUri();
            i4.V(812095237);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                HeaderImage(headerUri, i4, 0);
            }
            i4.P();
            androidx.compose.foundation.f c = androidx.compose.foundation.e.c(0, i4, 0, 1);
            e.a aVar = androidx.compose.ui.e.a;
            boolean isInFullScreenMode = PaywallStateKt.isInFullScreenMode(legacy);
            i4.V(812101850);
            int i6 = i5 & 14;
            boolean U = (i6 == 4) | i4.U(c);
            Object C = i4.C();
            if (U || C == m.a.a()) {
                C = new Template5Kt$Template5PortraitContent$1$1(nVar, c);
                i4.t(C);
            }
            i4.P();
            androidx.compose.ui.e conditional = ModifierExtensionsKt.conditional(aVar, isInFullScreenMode, (l) C);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e j = androidx.compose.foundation.layout.f.j(conditional, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            e.a aVar2 = o0.e.a;
            B a = F.l.a(c.a.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar2.i()), aVar2.g(), i4, 48);
            int a2 = b0.h.a(i4, 0);
            b0.I r = i4.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i4, j);
            g.a aVar3 = O0.g.E8;
            a a3 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a3);
            } else {
                i4.s();
            }
            m b = m2.b(i4);
            m2.e(b, a, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar3.f());
            o oVar = o.a;
            i4.V(-1562177448);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                i4.V(-1562176230);
                if (headerUri == null) {
                    i4.V(-1562175040);
                    if (legacy.getShouldDisplayDismissButton()) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        InsetSpacersKt.StatusBarSpacer(i4, 0);
                    }
                    i4.P();
                    Y.a(androidx.compose.foundation.layout.g.i(aVar, uIConstant.getIconButtonSize-D9Ej5fM()), i4, i3);
                }
                i4.P();
                Title(oVar, legacy, i4, (i5 & 112) | 6);
                Y.a(n.b(oVar, aVar, 1.0f, false, 2, (Object) null), i4, 0);
                Features(legacy, i4, (i5 >> 3) & 14);
                Y.a(n.b(oVar, aVar, 1.0f, false, 2, (Object) null), i4, 0);
            }
            i4.P();
            AnimatedPackages(legacy, paywallViewModel, z, i4, (i5 >> 3) & 1022, 0);
            i4.V(-1562162191);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                Y.a(n.b(oVar, aVar, 1.0f, false, 2, (Object) null), i4, 0);
            }
            i4.P();
            i4.v();
            y.e.d(nVar, z, (androidx.compose.ui.e) null, androidx.compose.animation.e.m(uIConstant.defaultAnimation(), 0.0f, 2, (Object) null), androidx.compose.animation.e.o(uIConstant.defaultAnimation(), 0.0f, 2, (Object) null), "Template5.packageSpacing", ComposableSingletons$Template5Kt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), i4, i6 | 1769472 | ((i5 >> 6) & 112), 2);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new 3(nVar, legacy, paywallViewModel, z, i));
        }
    }

    private static final void Title(n nVar, PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1309191016);
        if ((i & 48) == 0) {
            i2 = (i3.U(legacy) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 17) == 16 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1309191016, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Title (Template5.kt:242)");
            }
            mVar2 = i3;
            MarkdownKt.Markdown-DkhmgE0(PaywallStateKt.getSelectedLocalization(legacy).getTitle(), androidx.compose.foundation.layout.g.h(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), legacy.getTemplateConfiguration().getCurrentColors(i3, 0).getText1-0d7_KjU(), E.a.c(i3, E.b).i(), 0L, L.b.b(), null, null, j.h(j.b.f()), false, true, false, mVar2, 196656, 54, 720);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 1(nVar, legacy, i));
        }
    }

    public static final /* synthetic */ void access$AnimatedPackages(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, m mVar, int i, int i2) {
        AnimatedPackages(legacy, paywallViewModel, z, mVar, i, i2);
    }

    public static final /* synthetic */ void access$CheckmarkBox(boolean z, TemplateConfiguration.Colors colors, m mVar, int i) {
        CheckmarkBox(z, colors, mVar, i);
    }

    public static final /* synthetic */ void access$DiscountBanner(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, m mVar, int i) {
        DiscountBanner(v, legacy, packageInfo, mVar, i);
    }

    public static final /* synthetic */ void access$Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, m mVar, int i) {
        Feature(feature, colors, mVar, i);
    }

    public static final /* synthetic */ void access$Features(PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        Features(legacy, mVar, i);
    }

    public static final /* synthetic */ void access$HeaderImage(Uri uri, m mVar, int i) {
        HeaderImage(uri, mVar, i);
    }

    public static final /* synthetic */ void access$SelectPackageButton(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, m mVar, int i) {
        SelectPackageButton(nVar, legacy, packageInfo, paywallViewModel, mVar, i);
    }

    public static final /* synthetic */ boolean access$Template5$lambda$1(C0 c0) {
        return Template5$lambda$1(c0);
    }

    public static final /* synthetic */ void access$Template5$lambda$2(C0 c0, boolean z) {
        Template5$lambda$2(c0, z);
    }

    public static final /* synthetic */ void access$Template5LandscapeContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        Template5LandscapeContent(nVar, legacy, paywallViewModel, mVar, i);
    }

    public static final /* synthetic */ void access$Template5PaywallFooterCondensedPreview(m mVar, int i) {
        Template5PaywallFooterCondensedPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template5PaywallFooterPreview(m mVar, int i) {
        Template5PaywallFooterPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template5PaywallPreview(m mVar, int i) {
        Template5PaywallPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template5PortraitContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, m mVar, int i) {
        Template5PortraitContent(nVar, legacy, paywallViewModel, z, mVar, i);
    }

    public static final /* synthetic */ void access$Title(n nVar, PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        Title(nVar, legacy, mVar, i);
    }

    private static final long getFeatureIcon(TemplateConfiguration.Colors colors) {
        return colors.getAccent1-0d7_KjU();
    }

    private static final long getSelectedDiscountText(TemplateConfiguration.Colors colors) {
        return colors.getText2-0d7_KjU();
    }

    private static final long getSelectedOutline(TemplateConfiguration.Colors colors) {
        return colors.getAccent2-0d7_KjU();
    }

    private static final long getUnselectedDiscountText(TemplateConfiguration.Colors colors) {
        return colors.getText3-0d7_KjU();
    }

    private static final long getUnselectedOutline(TemplateConfiguration.Colors colors) {
        return colors.getAccent3-0d7_KjU();
    }
}
