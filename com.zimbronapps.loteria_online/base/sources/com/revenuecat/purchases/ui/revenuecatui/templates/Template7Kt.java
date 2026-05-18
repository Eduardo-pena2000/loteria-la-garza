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
import Qa.r;
import W0.D;
import W0.s;
import X.E;
import X.m0;
import Z0.Y0;
import android.net.Uri;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.g1;
import b0.h;
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
import com.revenuecat.purchases.ui.revenuecatui.composables.TierSwitcherKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
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
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import o0.e;
import v0.E1;
import v0.r0;
import y.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template7Kt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ List $packages;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, List list, TemplateConfiguration.Colors colors, int i, int i2) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z;
            this.$packages = list;
            this.$colors = colors;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template7Kt.access$AnimatedPackages(this.$state, this.$viewModel, this.$packageSelectionVisible, this.$packages, this.$colors, mVar, g1.a(this.$$changed | 1), this.$$default);
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
            Template7Kt.access$CheckmarkBox(this.$isSelected, this.$colors, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ V $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i) {
            super(2);
            this.$this_DiscountBanner = v;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$colors = colors;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template7Kt.access$DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, this.$colors, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ V $this_DiscountBanner;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i) {
            super(2);
            this.$this_DiscountBanner = v;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$colors = colors;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template7Kt.access$DiscountBanner(this.$this_DiscountBanner, this.$state, this.$packageInfo, this.$colors, mVar, g1.a(this.$$changed | 1));
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
            Template7Kt.access$Feature(this.$feature, this.$colors, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements r {
        final /* synthetic */ TemplateConfiguration.Colors $colorForTier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(TemplateConfiguration.Colors colors) {
            super(4);
            this.$colorForTier = colors;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((b) obj, (ProcessedLocalizedConfiguration) obj2, (m) obj3, ((Number) obj4).intValue());
            return I.a;
        }

        public final void invoke(b AnimatedContent, ProcessedLocalizedConfiguration it, m mVar, int i) {
            t.g(AnimatedContent, "$this$AnimatedContent");
            t.g(it, "it");
            if (w.L()) {
                w.U(-1011395967, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features.<anonymous> (Template7.kt:373)");
            }
            e.a aVar = e.a;
            e.b g = aVar.g();
            c.m q = c.a.q(UIConstant.INSTANCE.getDefaultVerticalSpacing-D9Ej5fM(), aVar.i());
            TemplateConfiguration.Colors colors = this.$colorForTier;
            e.a aVar2 = androidx.compose.ui.e.a;
            B a = F.l.a(q, g, mVar, 48);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, aVar2);
            g.a aVar3 = g.E8;
            a a3 = aVar3.a();
            if (mVar.k() == null) {
                h.d();
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
            mVar.V(965626904);
            Iterator it2 = it.getFeatures().iterator();
            while (it2.hasNext()) {
                Template7Kt.access$Feature((PaywallData.LocalizedConfiguration.Feature) it2.next(), colors, mVar, 0);
            }
            mVar.P();
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, int i) {
            super(2);
            this.$state = legacy;
            this.$selectedTier = tierInfo;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template7Kt.access$Features(this.$state, this.$selectedTier, mVar, g1.a(this.$$changed | 1));
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
            Template7Kt.access$HeaderImage(this.$uri, mVar, g1.a(this.$$changed | 1));
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
                w.U(-731847976, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous> (Template7.kt:527)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            androidx.compose.ui.e h = androidx.compose.foundation.layout.g.h(aVar, 0.0f, 1, (Object) null);
            c cVar = c.a;
            c.f o = cVar.o(n1.h.g(4));
            e.a aVar2 = o0.e.a;
            e.b k = aVar2.k();
            TemplateConfiguration.PackageInfo packageInfo = this.$packageInfo;
            long j = this.$textColor;
            boolean z = this.$isSelected;
            TemplateConfiguration.Colors colors = this.$colors;
            PaywallState.Loaded.Legacy legacy = this.$state;
            B a = F.l.a(o, k, mVar, 54);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, h);
            g.a aVar3 = g.E8;
            a a3 = aVar3.a();
            if (mVar.k() == null) {
                h.d();
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
            B b3 = T.b(cVar.o(n1.h.g(6)), aVar2.i(), mVar, 54);
            int a4 = h.a(mVar, 0);
            b0.I r2 = mVar.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(mVar, aVar);
            a a5 = aVar3.a();
            if (mVar.k() == null) {
                h.d();
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
            Template7Kt.access$CheckmarkBox(z, colors, mVar, 0);
            String offerName = packageInfo.getLocalization().getOfferName();
            if (offerName == null) {
                offerName = packageInfo.getRcPackage().getProduct().getTitle();
            }
            E e = E.a;
            int i2 = E.b;
            m0.b(offerName, w.a(aVar, 1.0f, true), j, 0L, (H) null, L.b.h(), (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, e.c(mVar, i2).b(), mVar, 196608, 0, 65496);
            Template7Kt.access$DiscountBanner(w, legacy, packageInfo, colors, mVar, 6);
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
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_SelectPackageButton;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, TemplateConfiguration.Colors colors, int i) {
            super(2);
            this.$this_SelectPackageButton = nVar;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$colors = colors;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template7Kt.access$SelectPackageButton(this.$this_SelectPackageButton, this.$state, this.$packageInfo, this.$viewModel, this.$colors, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i) {
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
            Template7Kt.Template7(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ l $onSelectTierChange;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_Template7LandscapeContent;
        final /* synthetic */ List $tiers;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, List list, TemplateConfiguration.TierInfo tierInfo, l lVar, int i) {
            super(2);
            this.$this_Template7LandscapeContent = nVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$tiers = list;
            this.$selectedTier = tierInfo;
            this.$onSelectTierChange = lVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template7Kt.access$Template7LandscapeContent(this.$this_Template7LandscapeContent, this.$state, this.$viewModel, this.$tiers, this.$selectedTier, this.$onSelectTierChange, mVar, g1.a(this.$$changed | 1));
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
            Template7Kt.access$Template7PaywallFooterCondensedPreview(mVar, g1.a(this.$$changed | 1));
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
            Template7Kt.access$Template7PaywallFooterPreview(mVar, g1.a(this.$$changed | 1));
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
            Template7Kt.access$Template7PaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ l $onSelectTierChange;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_Template7PortraitContent;
        final /* synthetic */ List $tiers;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, List list, TemplateConfiguration.TierInfo tierInfo, l lVar, int i) {
            super(2);
            this.$this_Template7PortraitContent = nVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z;
            this.$tiers = list;
            this.$selectedTier = tierInfo;
            this.$onSelectTierChange = lVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template7Kt.access$Template7PortraitContent(this.$this_Template7PortraitContent, this.$state, this.$viewModel, this.$packageSelectionVisible, this.$tiers, this.$selectedTier, this.$onSelectTierChange, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.TierInfo $selectedTier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_Title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, int i) {
            super(2);
            this.$this_Title = nVar;
            this.$state = legacy;
            this.$selectedTier = tierInfo;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template7Kt.access$Title(this.$this_Title, this.$state, this.$selectedTier, mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void AnimatedPackages(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r20, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r21, boolean r22, java.util.List r23, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r24, b0.m r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt.AnimatedPackages(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, boolean, java.util.List, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, b0.m, int, int):void");
    }

    private static final void CheckmarkBox(boolean z, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        m i3 = mVar.i(1250968455);
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
                w.U(1250968455, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox (Template7.kt:564)");
            }
            androidx.compose.ui.e d = androidx.compose.foundation.a.d(s0.h.a(androidx.compose.foundation.layout.g.r(androidx.compose.ui.e.a, Template7UIConstants.INSTANCE.getCheckmarkSize-D9Ej5fM()), i.g()), z ? colors.getBackground-0d7_KjU() : getUnselectedOutline(colors), (E1) null, 2, (Object) null);
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, d);
            g.a aVar = g.E8;
            a a2 = aVar.a();
            if (i3.k() == null) {
                h.d();
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
            i3.V(1030293438);
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

    private static final void DiscountBanner(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        m i3 = mVar.i(148348005);
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
        if ((i & 3072) == 0) {
            i2 |= i3.U(colors) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !i3.j()) {
            if (w.L()) {
                w.U(148348005, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.DiscountBanner (Template7.kt:585)");
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
                            l.a(new 1(v, legacy, packageInfo, colors, i));
                            return;
                        }
                        return;
                    }
                    int i4 = (i2 >> 3) & 126;
                    long j = AnimationsKt.packageButtonColorAnimation-9z6LAg8(legacy, packageInfo, getSelectedOutline(colors), getUnselectedOutline(colors), i3, i4);
                    long j2 = AnimationsKt.packageButtonColorAnimation-9z6LAg8(legacy, packageInfo, getSelectedDiscountText(colors), getUnselectedDiscountText(colors), i3, i4);
                    e.a aVar = androidx.compose.ui.e.a;
                    e.a aVar2 = o0.e.a;
                    androidx.compose.ui.e b = v.b(aVar, aVar2.l());
                    UIConstant uIConstant = UIConstant.INSTANCE;
                    float f = uIConstant.getDefaultHorizontalPadding-D9Ej5fM();
                    Template7UIConstants template7UIConstants = Template7UIConstants.INSTANCE;
                    androidx.compose.ui.e a = androidx.compose.foundation.layout.e.a(b, n1.h.g(f - template7UIConstants.getDiscountPadding-D9Ej5fM()), n1.h.g(n1.h.g(-uIConstant.getDefaultVerticalSpacing-D9Ej5fM()) + template7UIConstants.getDiscountPadding-D9Ej5fM()));
                    B h = f.h(aVar2.o(), false);
                    int a2 = h.a(i3, 0);
                    b0.I r = i3.r();
                    androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i3, a);
                    g.a aVar3 = g.E8;
                    a a3 = aVar3.a();
                    if (i3.k() == null) {
                        h.d();
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
                    androidx.compose.ui.e k = androidx.compose.foundation.layout.f.k(androidx.compose.foundation.layout.f.k(androidx.compose.foundation.a.c(aVar, j, X.i.a.k(i3, X.i.o)), 0.0f, n1.h.g(4), 1, (Object) null), n1.h.g(8), 0.0f, 2, (Object) null);
                    B h2 = f.h(aVar2.o(), false);
                    int a4 = h.a(i3, 0);
                    b0.I r2 = i3.r();
                    androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i3, k);
                    a a5 = aVar3.a();
                    if (i3.k() == null) {
                        h.d();
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
                    m0.b(upperCase, (androidx.compose.ui.e) null, j2, 0L, (H) null, L.b.g(), (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(i3, E.b).m(), i3, 196608, 0, 65498);
                    i3.v();
                    i3.v();
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
                l2.a(new Template7Kt$DiscountBanner$text$1(v, legacy, packageInfo, colors, i));
                return;
            }
            return;
        }
        i3.M();
        B1 l3 = i3.l();
        if (l3 != null) {
            l3.a(new 3(v, legacy, packageInfo, colors, i));
        }
    }

    private static final void Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(-840416555);
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
                w.U(-840416555, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Feature (Template7.kt:394)");
            }
            e.a aVar = o0.e.a;
            e.c i4 = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e e = s.e(androidx.compose.foundation.layout.g.h(aVar2, 0.0f, 1, (Object) null), true, 1.INSTANCE);
            c cVar = c.a;
            B b = T.b(cVar.g(), i4, i3, 48);
            int a = h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, e);
            g.a aVar3 = g.E8;
            a a2 = aVar3.a();
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
            m2.e(b2, b, aVar3.e());
            m2.e(b2, r, aVar3.g());
            p b3 = aVar3.b();
            if (b2.f() || !t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar3.f());
            W w = W.a;
            androidx.compose.ui.e r2 = androidx.compose.foundation.layout.g.r(aVar2, Template7UIConstants.INSTANCE.getFeatureIconSize-D9Ej5fM());
            B h = f.h(aVar.o(), false);
            int a3 = h.a(i3, 0);
            b0.I r3 = i3.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i3, r2);
            a a4 = aVar3.a();
            if (i3.k() == null) {
                h.d();
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
            i3.V(-928908279);
            if (fromValue != null) {
                PaywallIconKt.PaywallIcon-FNF3uiM(fromValue, null, getFeatureIcon(colors), i3, 0, 2);
                I i5 = I.a;
            }
            i3.P();
            i3.v();
            androidx.compose.ui.e m = androidx.compose.foundation.layout.f.m(aVar2, UIConstant.INSTANCE.getDefaultHorizontalPadding-D9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            B a5 = F.l.a(cVar.h(), aVar.k(), i3, 0);
            int a6 = h.a(i3, 0);
            b0.I r4 = i3.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i3, m);
            a a7 = aVar3.a();
            if (i3.k() == null) {
                h.d();
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
            i3.V(-928885417);
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

    private static final void Features(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, m mVar, int i) {
        int i2;
        m i3 = mVar.i(571837189);
        if ((i & 6) == 0) {
            i2 = (i3.U(legacy) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(tierInfo) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(571837189, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Features (Template7.kt:364)");
            }
            androidx.compose.animation.a.a(selectedLocalizationForTier(tierInfo), (androidx.compose.ui.e) null, (l) null, (o0.e) null, "features portrait", (l) null, j0.i.d(-1011395967, true, new 1(legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, i3, (i2 >> 3) & 14)), i3, 54), i3, 1597440, 46);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(legacy, tierInfo, i));
        }
    }

    private static final void HeaderImage(Uri uri, m mVar, int i) {
        int i2;
        m i3 = mVar.i(108999699);
        if ((i & 6) == 0) {
            i2 = (i3.E(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(108999699, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.HeaderImage (Template7.kt:324)");
            }
            if (uri != null) {
                String uri2 = uri.toString();
                t.f(uri2, "uri.toString()");
                RemoteImageKt.RemoteImage(uri2, androidx.compose.foundation.layout.b.b(androidx.compose.ui.e.a, 2.0f, false, 2, (Object) null), null, M0.f.a.a(), null, null, 0.0f, null, i3, 3120, 244);
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

    private static final void SelectPackageButton(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(-235261752);
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
        if ((i & 24576) == 0) {
            i2 |= i3.U(colors) ? 16384 : 8192;
        }
        int i4 = i2;
        if ((i4 & 9363) == 9362 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-235261752, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton (Template7.kt:496)");
            }
            boolean c = t.c(packageInfo, legacy.getSelectedPackage().getValue());
            float packageButtonActionInProgressOpacityAnimation = AnimationsKt.packageButtonActionInProgressOpacityAnimation(paywallViewModel, i3, (i4 >> 9) & 14);
            long j = colors.getText1-0d7_KjU();
            long j2 = AnimationsKt.packageButtonColorAnimation-9z6LAg8(legacy, packageInfo, getSelectedOutline(colors), getUnselectedOutline(colors), i3, (i4 >> 3) & 126);
            androidx.compose.ui.e c2 = nVar.c(s0.a.a(androidx.compose.foundation.layout.g.h(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), packageButtonActionInProgressOpacityAnimation), o0.e.a.k());
            i3.V(1056049171);
            boolean a = i3.a(c);
            Object C = i3.C();
            if (a || C == m.a.a()) {
                C = new Template7Kt$SelectPackageButton$1$1(c);
                i3.t(C);
            }
            i3.P();
            androidx.compose.ui.e f = s.f(c2, false, (l) C, 1, (Object) null);
            X.h b = X.i.a.b(r0.b.i(), j, 0L, 0L, i3, (X.i.o << 12) | 6, 12);
            UIConstant uIConstant = UIConstant.INSTANCE;
            M.h d = i.d(uIConstant.getDefaultPackageCornerRadius-D9Ej5fM());
            F.L b2 = androidx.compose.foundation.layout.f.b(uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            A.i a2 = A.j.a(uIConstant.getDefaultPackageBorderWidth-D9Ej5fM(), j2);
            i3.V(1056051494);
            boolean z = ((i4 & 7168) == 2048) | ((i4 & 896) == 256);
            Object C2 = i3.C();
            if (z || C2 == m.a.a()) {
                C2 = new Template7Kt$SelectPackageButton$2$1(paywallViewModel, packageInfo);
                i3.t(C2);
            }
            i3.P();
            mVar2 = i3;
            X.k.a((a) C2, f, false, d, b, (X.j) null, a2, b2, (E.m) null, j0.i.d(-731847976, true, new 3(packageInfo, j, c, colors, legacy), mVar2, 54), mVar2, 805306368, 292);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 4(nVar, legacy, packageInfo, paywallViewModel, colors, i));
        }
    }

    public static final void Template7(PaywallState.Loaded.Legacy state, PaywallViewModel viewModel, m mVar, int i) {
        int i2;
        t.g(state, "state");
        t.g(viewModel, "viewModel");
        m i3 = mVar.i(-305592021);
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
                w.U(-305592021, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7 (Template7.kt:95)");
            }
            TemplateConfiguration.PackageConfiguration packages = state.getTemplateConfiguration().getPackages();
            if (!(packages instanceof TemplateConfiguration.PackageConfiguration.MultiTier)) {
                throw new IllegalArgumentException("The configuration is not MultiTier");
            }
            TemplateConfiguration.PackageConfiguration.MultiTier multiTier = (TemplateConfiguration.PackageConfiguration.MultiTier) packages;
            TemplateConfiguration.TierInfo defaultTier = multiTier.getDefaultTier();
            List allTiers = multiTier.getAllTiers();
            i3.V(-1567782808);
            Object C = i3.C();
            m.a aVar = m.a;
            if (C == aVar.a()) {
                C = U1.i(Boolean.valueOf(state.getTemplateConfiguration().getMode() != PaywallMode.FOOTER_CONDENSED), (T1) null, 2, (Object) null);
                i3.t(C);
            }
            C0 c0 = (C0) C;
            i3.P();
            i3.V(-1567778671);
            Object C2 = i3.C();
            if (C2 == aVar.a()) {
                C2 = U1.i(defaultTier, (T1) null, 2, (Object) null);
                i3.t(C2);
            }
            C0 c02 = (C0) C2;
            i3.P();
            TemplateConfiguration.Colors currentColorsForTier = state.getTemplateConfiguration().getCurrentColorsForTier(Template7$lambda$5(c02), i3, 0);
            androidx.compose.ui.e d = androidx.compose.foundation.a.d(androidx.compose.ui.e.a, currentColorsForTier.getBackground-0d7_KjU(), (E1) null, 2, (Object) null);
            B a = F.l.a(c.a.h(), o0.e.a.k(), i3, 0);
            int a2 = h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, d);
            g.a aVar2 = g.E8;
            a a3 = aVar2.a();
            if (i3.k() == null) {
                h.d();
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
            int i5 = i4 & 14;
            if (WindowHelperKt.shouldUseLandscapeLayout(state, i3, i5)) {
                i3.V(513322183);
                TemplateConfiguration.TierInfo Template7$lambda$5 = Template7$lambda$5(c02);
                i3.V(-1091814896);
                boolean z = i5 == 4;
                Object C3 = i3.C();
                if (z || C3 == aVar.a()) {
                    C3 = new Template7Kt$Template7$2$1$1(state, c02);
                    i3.t(C3);
                }
                i3.P();
                int i6 = i4 << 3;
                Template7LandscapeContent(oVar, state, viewModel, allTiers, Template7$lambda$5, (l) C3, i3, (i6 & 112) | 6 | (i6 & 896));
                i3.P();
            } else {
                i3.V(513612064);
                boolean Template7$lambda$2 = Template7$lambda$2(c0);
                TemplateConfiguration.TierInfo Template7$lambda$52 = Template7$lambda$5(c02);
                i3.V(-1091804336);
                boolean z2 = i5 == 4;
                Object C4 = i3.C();
                if (z2 || C4 == aVar.a()) {
                    C4 = new Template7Kt$Template7$2$2$1(state, c02);
                    i3.t(C4);
                }
                i3.P();
                int i7 = i4 << 3;
                Template7PortraitContent(oVar, state, viewModel, Template7$lambda$2, allTiers, Template7$lambda$52, (l) C4, i3, (i7 & 112) | 6 | (i7 & 896));
                i3.P();
            }
            int i8 = i4 & 112;
            PurchaseButtonKt.PurchaseButton-hGBTI10(state, viewModel, null, 0.0f, currentColorsForTier, i3, i4 & 126, 12);
            TemplateConfiguration templateConfiguration = state.getTemplateConfiguration();
            i3.V(-1091792526);
            Object C5 = i3.C();
            if (C5 == aVar.a()) {
                C5 = new Template7Kt$Template7$2$3$1(c0);
                i3.t(C5);
            }
            i3.P();
            FooterKt.Footer(templateConfiguration, viewModel, null, currentColorsForTier, (a) C5, i3, i8 | 24576, 4);
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 3(state, viewModel, i));
        }
    }

    private static final boolean Template7$lambda$2(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void Template7$lambda$3(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final TemplateConfiguration.TierInfo Template7$lambda$5(C0 c0) {
        return (TemplateConfiguration.TierInfo) c0.getValue();
    }

    private static final void Template7$lambda$6(C0 c0, TemplateConfiguration.TierInfo tierInfo) {
        c0.setValue(tierInfo);
    }

    private static final void Template7LandscapeContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, List list, TemplateConfiguration.TierInfo tierInfo, l lVar, m mVar, int i) {
        int i2;
        int i3;
        m mVar2;
        m i4 = mVar.i(2027062712);
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
            i2 |= i4.E(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i4.U(tierInfo) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= i4.E(lVar) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && i4.j()) {
            i4.M();
            mVar2 = i4;
        } else {
            if (w.L()) {
                w.U(2027062712, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7LandscapeContent (Template7.kt:248)");
            }
            androidx.compose.foundation.f c = androidx.compose.foundation.e.c(0, i4, 0, 1);
            androidx.compose.foundation.f c2 = androidx.compose.foundation.e.c(0, i4, 0, 1);
            TemplateConfiguration.Colors currentColorsForTier = legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, i4, (i2 >> 12) & 14);
            c.e c3 = c.a.a.c();
            e.a aVar = o0.e.a;
            e.c i5 = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e b = n.b(nVar, aVar2, 1.0f, false, 2, (Object) null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e k = androidx.compose.foundation.layout.f.k(androidx.compose.foundation.layout.f.m(b, 0.0f, uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), 0.0f, 0.0f, 13, (Object) null), uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), 0.0f, 2, (Object) null);
            B b2 = T.b(c3, i5, i4, 54);
            int a = h.a(i4, 0);
            b0.I r = i4.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i4, k);
            g.a aVar3 = g.E8;
            a a2 = aVar3.a();
            if (i4.k() == null) {
                h.d();
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
            androidx.compose.ui.e j = androidx.compose.foundation.layout.f.j(V.c(w, androidx.compose.foundation.e.f(aVar2, c, false, (C.n) null, false, 14, (Object) null), 1.0f, false, 2, (Object) null), uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            e.b g = aVar.g();
            c cVar = c.a;
            B a3 = F.l.a(cVar.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar.i()), g, i4, 48);
            int a4 = h.a(i4, 0);
            b0.I r2 = i4.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i4, j);
            a a5 = aVar3.a();
            if (i4.k() == null) {
                h.d();
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
            Title(oVar, legacy, tierInfo, i4, (i2 & 112) | 6 | ((i2 >> 6) & 896));
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i4, 0);
            int i6 = i2 >> 3;
            int i7 = i2 >> 9;
            Features(legacy, tierInfo, i4, (i6 & 14) | (i7 & 112));
            i4.v();
            androidx.compose.ui.e j2 = androidx.compose.foundation.layout.f.j(V.c(w, androidx.compose.foundation.e.f(aVar2, c2, false, (C.n) null, false, 14, (Object) null), 1.0f, false, 2, (Object) null), uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            B a6 = F.l.a(cVar.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar.i()), aVar.g(), i4, 48);
            int a7 = h.a(i4, 0);
            b0.I r3 = i4.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i4, j2);
            a a8 = aVar3.a();
            if (i4.k() == null) {
                h.d();
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
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i4, 0);
            i4.V(392910811);
            if (list.size() > 1) {
                i4.V(392915745);
                boolean z = (458752 & i2) == 131072;
                Object C = i4.C();
                if (z || C == m.a.a()) {
                    C = new Template7Kt$Template7LandscapeContent$1$2$1$1(lVar);
                    i4.t(C);
                }
                i4.P();
                TierSwitcherKt.TierSwitcher-UFBoNtE(list, tierInfo, (l) C, getTierSwitcherBackground(currentColorsForTier), getTierSwitcherBackgroundSelected(currentColorsForTier), getTierSwitcherForeground(currentColorsForTier), getTierSwitcherForegroundSelected(currentColorsForTier), i4, i7 & 126);
                i3 = 0;
                Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i4, 0);
            } else {
                i3 = 0;
            }
            i4.P();
            mVar2 = i4;
            AnimatedPackages(legacy, paywallViewModel, false, tierInfo.getPackages(), currentColorsForTier, mVar2, i6 & 126, 4);
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), mVar2, i3);
            mVar2.v();
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(nVar, legacy, paywallViewModel, list, tierInfo, lVar, i));
        }
    }

    private static final void Template7PaywallFooterCondensedPreview(m mVar, int i) {
        m i2 = mVar.i(957146168);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(957146168, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PaywallFooterCondensedPreview (Template7.kt:687)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate7Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template7PaywallFooterPreview(m mVar, int i) {
        m i2 = mVar.i(-323823251);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-323823251, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PaywallFooterPreview (Template7.kt:676)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate7Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template7PaywallPreview(m mVar, int i) {
        m i2 = mVar.i(292324402);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(292324402, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PaywallPreview (Template7.kt:665)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate7Offering(), null, false, false, 29, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template7PortraitContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, List list, TemplateConfiguration.TierInfo tierInfo, l lVar, m mVar, int i) {
        int i2;
        int i3;
        int i4;
        m mVar2;
        androidx.compose.ui.e eVar;
        Object obj;
        m mVar3;
        m i5 = mVar.i(1979964246);
        if ((i & 6) == 0) {
            i2 = (i5.U(nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i5.U(legacy) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i5.U(paywallViewModel) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i5.a(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i5.E(list) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= i5.U(tierInfo) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= i5.E(lVar) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && i5.j()) {
            i5.M();
            mVar3 = i5;
        } else {
            if (w.L()) {
                w.U(1979964246, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template7PortraitContent (Template7.kt:161)");
            }
            TemplateConfiguration.Images images = (TemplateConfiguration.Images) legacy.getTemplateConfiguration().getImagesByTier().get(tierInfo.getId());
            Uri headerUri = images != null ? images.getHeaderUri() : null;
            i5.V(-1182000584);
            if (PaywallStateKt.isInFullScreenMode(legacy) && headerUri != null) {
                HeaderImage(headerUri, i5, 0);
            }
            i5.P();
            int i6 = (i2 >> 15) & 14;
            TemplateConfiguration.Colors currentColorsForTier = legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, i5, i6);
            androidx.compose.foundation.f c = androidx.compose.foundation.e.c(0, i5, 0, 1);
            androidx.compose.ui.e eVar2 = androidx.compose.ui.e.a;
            boolean isInFullScreenMode = PaywallStateKt.isInFullScreenMode(legacy);
            i5.V(-1181990216);
            int i7 = i2 & 14;
            boolean U = (i7 == 4) | i5.U(c);
            Object C = i5.C();
            if (U || C == m.a.a()) {
                C = new Template7Kt$Template7PortraitContent$1$1(nVar, c);
                i5.t(C);
            }
            i5.P();
            androidx.compose.ui.e conditional = ModifierExtensionsKt.conditional(eVar2, isInFullScreenMode, (l) C);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e j = androidx.compose.foundation.layout.f.j(conditional, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            e.a aVar = o0.e.a;
            B a = F.l.a(c.a.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar.i()), aVar.g(), i5, 48);
            int a2 = h.a(i5, 0);
            b0.I r = i5.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i5, j);
            g.a aVar2 = g.E8;
            a a3 = aVar2.a();
            if (i5.k() == null) {
                h.d();
            }
            i5.I();
            if (i5.f()) {
                i5.p(a3);
            } else {
                i5.s();
            }
            m b = m2.b(i5);
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            o oVar = o.a;
            i5.V(-1539492651);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                i5.V(-1539491336);
                if (headerUri == null) {
                    i5.V(-1539490146);
                    i3 = 0;
                    if (!legacy.getShouldDisplayDismissButton()) {
                        InsetSpacersKt.StatusBarSpacer(i5, 0);
                    }
                    i5.P();
                    Y.a(androidx.compose.foundation.layout.g.i(eVar2, uIConstant.getIconButtonSize-D9Ej5fM()), i5, 0);
                } else {
                    i3 = 0;
                }
                i5.P();
                Title(oVar, legacy, tierInfo, i5, 6 | (i2 & 112) | ((i2 >> 9) & 896));
            } else {
                i3 = 0;
            }
            i5.P();
            i5.V(-1539481725);
            if (list.size() <= 1) {
                i4 = i2;
                mVar2 = i5;
                eVar = eVar2;
                obj = null;
            } else if (z) {
                i5.V(-479242408);
                i5.V(-1539475708);
                int i8 = (3670016 & i2) == 1048576 ? 1 : i3;
                Object C2 = i5.C();
                if (i8 != 0 || C2 == m.a.a()) {
                    C2 = new Template7Kt$Template7PortraitContent$2$1$1(lVar);
                    i5.t(C2);
                }
                i5.P();
                eVar = eVar2;
                TierSwitcherKt.TierSwitcher-UFBoNtE(list, tierInfo, (l) C2, getTierSwitcherBackground(currentColorsForTier), getTierSwitcherBackgroundSelected(currentColorsForTier), getTierSwitcherForeground(currentColorsForTier), getTierSwitcherForegroundSelected(currentColorsForTier), i5, (i2 >> 12) & 126);
                i5.P();
                i4 = i2;
                obj = null;
                mVar2 = i5;
            } else {
                eVar = eVar2;
                i5.V(-478662150);
                i4 = i2;
                obj = null;
                mVar2 = i5;
                TierSwitcherKt.SelectedTierView-1wkBAMs(tierInfo, getTierSwitcherBackgroundSelected(currentColorsForTier), getTierSwitcherForegroundSelected(currentColorsForTier), i5, i6);
                mVar2.P();
            }
            mVar2.P();
            mVar3 = mVar2;
            mVar3.V(-1539451407);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                Features(legacy, tierInfo, mVar3, ((i4 >> 3) & 14) | ((i4 >> 12) & 112));
            }
            mVar3.P();
            int i9 = i3;
            AnimatedPackages(legacy, paywallViewModel, z, tierInfo.getPackages(), currentColorsForTier, mVar3, (i4 >> 3) & 1022, 0);
            mVar3.V(-1539440657);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                Y.a(n.b(oVar, eVar, 1.0f, false, 2, (Object) null), mVar3, i9);
            }
            mVar3.P();
            mVar3.v();
            y.e.d(nVar, z, (androidx.compose.ui.e) null, androidx.compose.animation.e.m(uIConstant.defaultAnimation(), 0.0f, 2, obj), androidx.compose.animation.e.o(uIConstant.defaultAnimation(), 0.0f, 2, obj), "Template7.packageSpacing", ComposableSingletons$Template7Kt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), mVar3, i7 | 1769472 | ((i4 >> 6) & 112), 2);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar3.l();
        if (l != null) {
            l.a(new 3(nVar, legacy, paywallViewModel, z, list, tierInfo, lVar, i));
        }
    }

    private static final void Title(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(-1395216940);
        if ((i & 48) == 0) {
            i2 = (i3.U(legacy) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= i3.U(tierInfo) ? 256 : 128;
        }
        if ((i2 & 145) == 144 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-1395216940, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Title (Template7.kt:339)");
            }
            TemplateConfiguration.Colors currentColorsForTier = legacy.getTemplateConfiguration().getCurrentColorsForTier(tierInfo, i3, (i2 >> 6) & 14);
            ProcessedLocalizedConfiguration selectedLocalizationForTier = selectedLocalizationForTier(tierInfo);
            mVar2 = i3;
            MarkdownKt.Markdown-DkhmgE0(selectedLocalizationForTier.getTitle(), androidx.compose.foundation.layout.g.h(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), currentColorsForTier.getText1-0d7_KjU(), E.a.c(i3, E.b).i(), 0L, L.b.b(), null, null, j.h(j.b.a()), false, true, false, mVar2, 196656, 54, 720);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 1(nVar, legacy, tierInfo, i));
        }
    }

    public static final /* synthetic */ void access$AnimatedPackages(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, List list, TemplateConfiguration.Colors colors, m mVar, int i, int i2) {
        AnimatedPackages(legacy, paywallViewModel, z, list, colors, mVar, i, i2);
    }

    public static final /* synthetic */ void access$CheckmarkBox(boolean z, TemplateConfiguration.Colors colors, m mVar, int i) {
        CheckmarkBox(z, colors, mVar, i);
    }

    public static final /* synthetic */ void access$DiscountBanner(V v, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, m mVar, int i) {
        DiscountBanner(v, legacy, packageInfo, colors, mVar, i);
    }

    public static final /* synthetic */ void access$Feature(PaywallData.LocalizedConfiguration.Feature feature, TemplateConfiguration.Colors colors, m mVar, int i) {
        Feature(feature, colors, mVar, i);
    }

    public static final /* synthetic */ void access$Features(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, m mVar, int i) {
        Features(legacy, tierInfo, mVar, i);
    }

    public static final /* synthetic */ void access$HeaderImage(Uri uri, m mVar, int i) {
        HeaderImage(uri, mVar, i);
    }

    public static final /* synthetic */ void access$SelectPackageButton(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, TemplateConfiguration.Colors colors, m mVar, int i) {
        SelectPackageButton(nVar, legacy, packageInfo, paywallViewModel, colors, mVar, i);
    }

    public static final /* synthetic */ boolean access$Template7$lambda$2(C0 c0) {
        return Template7$lambda$2(c0);
    }

    public static final /* synthetic */ void access$Template7$lambda$3(C0 c0, boolean z) {
        Template7$lambda$3(c0, z);
    }

    public static final /* synthetic */ TemplateConfiguration.TierInfo access$Template7$lambda$5(C0 c0) {
        return Template7$lambda$5(c0);
    }

    public static final /* synthetic */ void access$Template7$lambda$6(C0 c0, TemplateConfiguration.TierInfo tierInfo) {
        Template7$lambda$6(c0, tierInfo);
    }

    public static final /* synthetic */ void access$Template7LandscapeContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, List list, TemplateConfiguration.TierInfo tierInfo, l lVar, m mVar, int i) {
        Template7LandscapeContent(nVar, legacy, paywallViewModel, list, tierInfo, lVar, mVar, i);
    }

    public static final /* synthetic */ void access$Template7PaywallFooterCondensedPreview(m mVar, int i) {
        Template7PaywallFooterCondensedPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template7PaywallFooterPreview(m mVar, int i) {
        Template7PaywallFooterPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template7PaywallPreview(m mVar, int i) {
        Template7PaywallPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template7PortraitContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, List list, TemplateConfiguration.TierInfo tierInfo, l lVar, m mVar, int i) {
        Template7PortraitContent(nVar, legacy, paywallViewModel, z, list, tierInfo, lVar, mVar, i);
    }

    public static final /* synthetic */ void access$Title(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.TierInfo tierInfo, m mVar, int i) {
        Title(nVar, legacy, tierInfo, mVar, i);
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

    private static final long getTierSwitcherBackground(TemplateConfiguration.Colors colors) {
        r0 r0Var = colors.getTierControlBackground-QN2ZGVo();
        return r0Var != null ? r0Var.A() : colors.getAccent1-0d7_KjU();
    }

    private static final long getTierSwitcherBackgroundSelected(TemplateConfiguration.Colors colors) {
        r0 r0Var = colors.getTierControlSelectedBackground-QN2ZGVo();
        return r0Var != null ? r0Var.A() : getUnselectedDiscountText(colors);
    }

    private static final long getTierSwitcherForeground(TemplateConfiguration.Colors colors) {
        r0 r0Var = colors.getTierControlForeground-QN2ZGVo();
        return r0Var != null ? r0Var.A() : colors.getText1-0d7_KjU();
    }

    private static final long getTierSwitcherForegroundSelected(TemplateConfiguration.Colors colors) {
        r0 r0Var = colors.getTierControlSelectedForeground-QN2ZGVo();
        return r0Var != null ? r0Var.A() : colors.getText1-0d7_KjU();
    }

    private static final long getUnselectedDiscountText(TemplateConfiguration.Colors colors) {
        return colors.getText3-0d7_KjU();
    }

    private static final long getUnselectedOutline(TemplateConfiguration.Colors colors) {
        return colors.getAccent3-0d7_KjU();
    }

    private static final ProcessedLocalizedConfiguration selectedLocalizationForTier(TemplateConfiguration.TierInfo tierInfo) {
        return tierInfo.getDefaultPackage().getLocalization();
    }
}
