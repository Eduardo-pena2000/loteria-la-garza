package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import F.T;
import F.V;
import F.W;
import F.Y;
import F.c;
import F.f;
import F.l;
import F.n;
import F.o;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import Qa.q;
import W0.s;
import X.E;
import X.m0;
import android.net.Uri;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.g1;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.IconImageKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallIconName;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.AnimationsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.TestTag;
import d1.H;
import d1.L;
import j0.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import n1.h;
import o0.e;
import v0.E1;
import v0.r0;
import z.D;
import z.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template2Kt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ boolean $landscapeLayout;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Legacy legacy, boolean z, boolean z2, PaywallViewModel paywallViewModel, e eVar, int i) {
            super(2);
            this.$state = legacy;
            this.$packageSelectionVisible = z;
            this.$landscapeLayout = z2;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template2Kt.access$AnimatedPackages(this.$state, this.$packageSelectionVisible, this.$landscapeLayout, this.$viewModel, this.$childModifier, mVar, g1.a(this.$$changed | 1));
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
            Template2Kt.access$CheckmarkBox(this.$isSelected, this.$colors, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ e $childModifier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Legacy legacy, e eVar, int i) {
            super(2);
            this.$state = legacy;
            this.$childModifier = eVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template2Kt.access$IconImage(this.$state, this.$childModifier, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements q {
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ long $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(TemplateConfiguration.PackageInfo packageInfo, long j, boolean z, PaywallState.Loaded.Legacy legacy) {
            super(3);
            this.$packageInfo = packageInfo;
            this.$textColor = j;
            this.$isSelected = z;
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
                w.U(760289252, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton.<anonymous> (Template2.kt:390)");
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
            PaywallState.Loaded.Legacy legacy = this.$state;
            B a = l.a(o, k, mVar, 54);
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
            Template2Kt.access$CheckmarkBox(z, PaywallStateKt.getCurrentColors(legacy, mVar, 0), mVar, 0);
            String offerName = packageInfo.getLocalization().getOfferName();
            if (offerName == null) {
                offerName = packageInfo.getRcPackage().getProduct().getTitle();
            }
            E e = E.a;
            int i2 = E.b;
            m0.b(offerName, (androidx.compose.ui.e) null, j, 0L, (H) null, L.b.h(), (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (Qa.l) null, e.c(mVar, i2).b(), mVar, 196608, 0, 65498);
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
        final /* synthetic */ androidx.compose.ui.e $childModifier;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_SelectPackageButton;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, int i) {
            super(2);
            this.$this_SelectPackageButton = nVar;
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template2Kt.access$SelectPackageButton(this.$this_SelectPackageButton, this.$state, this.$packageInfo, this.$viewModel, this.$childModifier, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ androidx.compose.ui.e $childModifier;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, int i, int i2) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$childModifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template2Kt.Template2(this.$state, this.$viewModel, this.$childModifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ androidx.compose.ui.e $childModifier;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_Template2LandscapeContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, androidx.compose.ui.e eVar, int i) {
            super(2);
            this.$this_Template2LandscapeContent = nVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z;
            this.$childModifier = eVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template2Kt.access$Template2LandscapeContent(this.$this_Template2LandscapeContent, this.$state, this.$viewModel, this.$packageSelectionVisible, this.$childModifier, mVar, g1.a(this.$$changed | 1));
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
            Template2Kt.access$Template2PaywallFooterCondensedPreview(mVar, g1.a(this.$$changed | 1));
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
            Template2Kt.access$Template2PaywallFooterPreview(mVar, g1.a(this.$$changed | 1));
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
            Template2Kt.access$Template2PaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ androidx.compose.ui.e $childModifier;
        final /* synthetic */ boolean $packageSelectionVisible;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ n $this_Template2PortraitContent;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, androidx.compose.ui.e eVar, int i) {
            super(2);
            this.$this_Template2PortraitContent = nVar;
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$packageSelectionVisible = z;
            this.$childModifier = eVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template2Kt.access$Template2PortraitContent(this.$this_Template2PortraitContent, this.$state, this.$viewModel, this.$packageSelectionVisible, this.$childModifier, mVar, g1.a(this.$$changed | 1));
        }
    }

    private static final void AnimatedPackages(PaywallState.Loaded.Legacy legacy, boolean z, boolean z2, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1799464452);
        if ((i & 6) == 0) {
            i2 = (i3.U(legacy) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.a(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.U(paywallViewModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.U(eVar) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1799464452, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages (Template2.kt:301)");
            }
            o0.e o = PaywallStateKt.isInFullScreenMode(legacy) ? o0.e.a.o() : o0.e.a.b();
            e.a aVar = androidx.compose.ui.e.a;
            B h = f.h(o, false);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, aVar);
            g.a aVar2 = O0.g.E8;
            a a2 = aVar2.a();
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
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            y.e.e(!z, (androidx.compose.ui.e) null, androidx.compose.animation.e.m(z.j.j(0, 200, (D) null, 5, (Object) null), 0.0f, 2, (Object) null), androidx.compose.animation.e.o(z.j.j(0, 200, (D) null, 5, (Object) null), 0.0f, 2, (Object) null), "OfferDetailsVisibility", i.d(4658274, true, new Template2Kt$AnimatedPackages$1$1(legacy), i3, 54), i3, 224640, 2);
            e.a aVar3 = o0.e.a;
            mVar2 = i3;
            y.e.e(z, (androidx.compose.ui.e) null, androidx.compose.animation.e.k((G) null, aVar3.a(), false, (Qa.l) null, 13, (Object) null), androidx.compose.animation.e.u((G) null, aVar3.a(), false, (Qa.l) null, 13, (Object) null), "SelectPackagesVisibility", i.d(1995133977, true, new Template2Kt$AnimatedPackages$1$2(z2, legacy, paywallViewModel, eVar), i3, 54), i3, ((i2 >> 3) & 14) | 224640, 2);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(legacy, z, z2, paywallViewModel, eVar, i));
        }
    }

    private static final void CheckmarkBox(boolean z, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        m i3 = mVar.i(1250819500);
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
                w.U(1250819500, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.CheckmarkBox (Template2.kt:419)");
            }
            androidx.compose.ui.e d = androidx.compose.foundation.a.d(s0.h.a(androidx.compose.foundation.layout.g.r(androidx.compose.ui.e.a, Template2UIConstants.INSTANCE.getCheckmarkSize-D9Ej5fM()), M.i.g()), r0.q(colors.getAccent2-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (E1) null, 2, (Object) null);
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
            i3.V(1030125607);
            if (z) {
                PaywallIconKt.PaywallIcon-FNF3uiM(PaywallIconName.CHECK_CIRCLE, null, colors.getAccent1-0d7_KjU(), i3, 6, 2);
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

    private static final void IconImage(PaywallState.Loaded.Legacy legacy, androidx.compose.ui.e eVar, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-951232294);
        if ((i & 6) == 0) {
            i2 = (i3.U(legacy) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(eVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-951232294, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.IconImage (Template2.kt:249)");
            }
            Uri iconUri = legacy.getTemplateConfiguration().getImages().getIconUri();
            Template2UIConstants template2UIConstants = Template2UIConstants.INSTANCE;
            IconImageKt.IconImage-djqs-MU(iconUri, template2UIConstants.getMaxIconWidth-D9Ej5fM(), template2UIConstants.getIconCornerRadius-D9Ej5fM(), eVar, i3, ((i2 << 6) & 7168) | 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(legacy, eVar, i));
        }
    }

    private static final void SelectPackageButton(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(1238280660);
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
            i2 |= i3.U(eVar) ? 16384 : 8192;
        }
        int i4 = i2;
        if ((i4 & 9363) == 9362 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(1238280660, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButton (Template2.kt:348)");
            }
            TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(i3, 0);
            boolean c = t.c(packageInfo, legacy.getSelectedPackage().getValue());
            float packageButtonActionInProgressOpacityAnimation = AnimationsKt.packageButtonActionInProgressOpacityAnimation(paywallViewModel, i3, (i4 >> 9) & 14);
            int i5 = (i4 >> 3) & 126;
            boolean z = false;
            long j = AnimationsKt.packageButtonColorAnimation-9z6LAg8(legacy, packageInfo, currentColors.getAccent2-0d7_KjU(), currentColors.getBackground-0d7_KjU(), i3, i5);
            long j2 = AnimationsKt.packageButtonColorAnimation-9z6LAg8(legacy, packageInfo, currentColors.getAccent1-0d7_KjU(), currentColors.getText1-0d7_KjU(), i3, i5);
            A.i a = c ? null : A.j.a(UIConstant.INSTANCE.getDefaultPackageBorderWidth-D9Ej5fM(), r0.q(currentColors.getText1-0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
            androidx.compose.ui.e c2 = nVar.c(s0.a.a(androidx.compose.foundation.layout.g.h(eVar, 0.0f, 1, (Object) null), packageButtonActionInProgressOpacityAnimation), o0.e.a.k());
            i3.V(1055888883);
            boolean a2 = i3.a(c);
            Object C = i3.C();
            if (a2 || C == m.a.a()) {
                C = new Template2Kt$SelectPackageButton$1$1(c);
                i3.t(C);
            }
            i3.P();
            androidx.compose.ui.e a3 = androidx.compose.ui.platform.i.a(s.f(c2, false, (Qa.l) C, 1, (Object) null), TestTag.INSTANCE.selectButtonTestTag(packageInfo.getRcPackage().getIdentifier()));
            X.h b = X.i.a.b(j, j2, 0L, 0L, i3, X.i.o << 12, 12);
            UIConstant uIConstant = UIConstant.INSTANCE;
            M.h d = M.i.d(uIConstant.getDefaultPackageCornerRadius-D9Ej5fM());
            F.L b2 = androidx.compose.foundation.layout.f.b(uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            i3.V(1055893894);
            boolean z2 = (i4 & 7168) == 2048;
            if ((i4 & 896) == 256) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object C2 = i3.C();
            if (z3 || C2 == m.a.a()) {
                C2 = new Template2Kt$SelectPackageButton$2$1(paywallViewModel, packageInfo);
                i3.t(C2);
            }
            i3.P();
            mVar2 = i3;
            X.k.a((a) C2, a3, false, d, b, (X.j) null, a, b2, (E.m) null, i.d(760289252, true, new 3(packageInfo, j2, c, legacy), mVar2, 54), mVar2, 805306368, 292);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 4(nVar, legacy, packageInfo, paywallViewModel, eVar, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void Subtitle-8iNrtrE(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r24, androidx.compose.ui.e r25, int r26, b0.m r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt.Subtitle-8iNrtrE(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, androidx.compose.ui.e, int, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Template2(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r23, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r24, androidx.compose.ui.e r25, b0.m r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt.Template2(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final boolean Template2$lambda$5$lambda$4$lambda$1(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void Template2$lambda$5$lambda$4$lambda$2(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final void Template2LandscapeContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, androidx.compose.ui.e eVar, m mVar, int i) {
        int i2;
        m i3 = mVar.i(1667751062);
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
        if ((i & 3072) == 0) {
            i2 |= i3.a(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.U(eVar) ? 16384 : 8192;
        }
        int i4 = i2;
        if ((i4 & 9363) == 9362 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1667751062, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2LandscapeContent (Template2.kt:188)");
            }
            androidx.compose.foundation.f c = androidx.compose.foundation.e.c(0, i3, 0, 1);
            androidx.compose.foundation.f c2 = androidx.compose.foundation.e.c(0, i3, 0, 1);
            c.e c3 = c.a.a.c();
            e.a aVar = o0.e.a;
            e.c i5 = aVar.i();
            e.a aVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e b = n.b(nVar, aVar2, 1.0f, false, 2, (Object) null);
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e j = androidx.compose.foundation.layout.f.j(b, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            B b2 = T.b(c3, i5, i3, 54);
            int a = b0.h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, j);
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
            androidx.compose.ui.e c4 = V.c(w, androidx.compose.foundation.e.f(aVar2, c, false, (C.n) null, false, 14, (Object) null), 0.5f, false, 2, (Object) null);
            e.b g = aVar.g();
            c cVar = c.a;
            B a3 = l.a(cVar.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar.i()), g, i3, 48);
            int a4 = b0.h.a(i3, 0);
            b0.I r2 = i3.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i3, c4);
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
            int i6 = i4 >> 3;
            int i7 = i6 & 14;
            int i8 = i7 | ((i4 >> 9) & 112);
            IconImage(legacy, eVar, i3, i8);
            j.a aVar4 = j.b;
            Title-8iNrtrE(legacy, eVar, aVar4.f(), i3, i8, 0);
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i3, 0);
            Subtitle-8iNrtrE(legacy, eVar, aVar4.f(), i3, i8, 0);
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i3, 0);
            i3.v();
            androidx.compose.ui.e c5 = V.c(w, androidx.compose.foundation.e.f(aVar2, c2, false, (C.n) null, false, 14, (Object) null), 0.5f, false, 2, (Object) null);
            B a6 = l.a(cVar.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar.i()), aVar.g(), i3, 48);
            int a7 = b0.h.a(i3, 0);
            b0.I r3 = i3.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i3, c5);
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
            int i9 = i4 >> 6;
            AnimatedPackages(legacy, z, true, paywallViewModel, eVar, i3, i7 | 384 | (i9 & 112) | ((i4 << 3) & 7168) | (57344 & i4));
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i3, 0);
            PurchaseButtonKt.PurchaseButton-hGBTI10(legacy, paywallViewModel, eVar, h.g(0), null, i3, i7 | 3072 | (i6 & 112) | (i9 & 896), 16);
            Y.a(n.b(oVar, aVar2, 0.5f, false, 2, (Object) null), i3, 0);
            i3.v();
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(nVar, legacy, paywallViewModel, z, eVar, i));
        }
    }

    private static final void Template2PaywallFooterCondensedPreview(m mVar, int i) {
        m i2 = mVar.i(-741508648);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-741508648, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PaywallFooterCondensedPreview (Template2.kt:465)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate2Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template2PaywallFooterPreview(m mVar, int i) {
        m i2 = mVar.i(1374736823);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1374736823, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PaywallFooterPreview (Template2.kt:455)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate2Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template2PaywallPreview(m mVar, int i) {
        m i2 = mVar.i(44645436);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(44645436, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PaywallPreview (Template2.kt:445)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate2Offering(), null, false, false, 29, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template2PortraitContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, androidx.compose.ui.e eVar, m mVar, int i) {
        int i2;
        int i3;
        m i4 = mVar.i(75198122);
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
        if ((i & 24576) == 0) {
            i2 |= i4.U(eVar) ? 16384 : 8192;
        }
        int i5 = i2;
        if ((i5 & 9363) == 9362 && i4.j()) {
            i4.M();
        } else {
            if (w.L()) {
                w.U(75198122, i5, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template2PortraitContent (Template2.kt:138)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            UIConstant uIConstant = UIConstant.INSTANCE;
            Y.a(androidx.compose.foundation.layout.g.i(aVar, uIConstant.getDefaultVerticalSpacing-D9Ej5fM()), i4, 0);
            androidx.compose.foundation.f c = androidx.compose.foundation.e.c(0, i4, 0, 1);
            boolean isInFullScreenMode = PaywallStateKt.isInFullScreenMode(legacy);
            i4.V(-491622595);
            boolean U = i4.U(c) | ((i5 & 14) == 4);
            Object C = i4.C();
            if (U || C == m.a.a()) {
                C = new Template2Kt$Template2PortraitContent$1$1(nVar, c);
                i4.t(C);
            }
            i4.P();
            androidx.compose.ui.e j = androidx.compose.foundation.layout.f.j(ModifierExtensionsKt.conditional(aVar, isInFullScreenMode, (Qa.l) C), uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            e.a aVar2 = o0.e.a;
            B a = l.a(c.a.q(uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), aVar2.i()), aVar2.g(), i4, 48);
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
            i4.V(-1596100152);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                Y.a(n.b(oVar, aVar, 1.0f, false, 2, (Object) null), i4, 0);
                int i6 = ((i5 >> 3) & 14) | ((i5 >> 9) & 112);
                IconImage(legacy, eVar, i4, i6);
                i3 = 0;
                Title-8iNrtrE(legacy, eVar, 0, i4, i6, 4);
                Y.a(n.b(oVar, aVar, 1.0f, false, 2, (Object) null), i4, 0);
                Subtitle-8iNrtrE(legacy, eVar, 0, i4, i6, 4);
                Y.a(n.b(oVar, aVar, 1.0f, false, 2, (Object) null), i4, 0);
            } else {
                i3 = 0;
            }
            i4.P();
            AnimatedPackages(legacy, z, false, paywallViewModel, eVar, i4, ((i5 >> 3) & 14) | 384 | ((i5 >> 6) & 112) | ((i5 << 3) & 7168) | (57344 & i5));
            i4.V(-1596084908);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                Y.a(n.b(oVar, aVar, 1.0f, false, 2, (Object) null), i4, i3);
            }
            i4.P();
            i4.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new 3(nVar, legacy, paywallViewModel, z, eVar, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void Title-8iNrtrE(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r23, androidx.compose.ui.e r24, int r25, b0.m r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt.Title-8iNrtrE(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, androidx.compose.ui.e, int, b0.m, int, int):void");
    }

    public static final /* synthetic */ void access$AnimatedPackages(PaywallState.Loaded.Legacy legacy, boolean z, boolean z2, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, m mVar, int i) {
        AnimatedPackages(legacy, z, z2, paywallViewModel, eVar, mVar, i);
    }

    public static final /* synthetic */ void access$CheckmarkBox(boolean z, TemplateConfiguration.Colors colors, m mVar, int i) {
        CheckmarkBox(z, colors, mVar, i);
    }

    public static final /* synthetic */ void access$IconImage(PaywallState.Loaded.Legacy legacy, androidx.compose.ui.e eVar, m mVar, int i) {
        IconImage(legacy, eVar, mVar, i);
    }

    public static final /* synthetic */ void access$SelectPackageButton(n nVar, PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, m mVar, int i) {
        SelectPackageButton(nVar, legacy, packageInfo, paywallViewModel, eVar, mVar, i);
    }

    public static final /* synthetic */ void access$Subtitle-8iNrtrE(PaywallState.Loaded.Legacy legacy, androidx.compose.ui.e eVar, int i, m mVar, int i2, int i3) {
        Subtitle-8iNrtrE(legacy, eVar, i, mVar, i2, i3);
    }

    public static final /* synthetic */ boolean access$Template2$lambda$5$lambda$4$lambda$1(C0 c0) {
        return Template2$lambda$5$lambda$4$lambda$1(c0);
    }

    public static final /* synthetic */ void access$Template2$lambda$5$lambda$4$lambda$2(C0 c0, boolean z) {
        Template2$lambda$5$lambda$4$lambda$2(c0, z);
    }

    public static final /* synthetic */ void access$Template2LandscapeContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, androidx.compose.ui.e eVar, m mVar, int i) {
        Template2LandscapeContent(nVar, legacy, paywallViewModel, z, eVar, mVar, i);
    }

    public static final /* synthetic */ void access$Template2PaywallFooterCondensedPreview(m mVar, int i) {
        Template2PaywallFooterCondensedPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template2PaywallFooterPreview(m mVar, int i) {
        Template2PaywallFooterPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template2PaywallPreview(m mVar, int i) {
        Template2PaywallPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template2PortraitContent(n nVar, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, boolean z, androidx.compose.ui.e eVar, m mVar, int i) {
        Template2PortraitContent(nVar, legacy, paywallViewModel, z, eVar, mVar, i);
    }

    public static final /* synthetic */ void access$Title-8iNrtrE(PaywallState.Loaded.Legacy legacy, androidx.compose.ui.e eVar, int i, m mVar, int i2, int i3) {
        Title-8iNrtrE(legacy, eVar, i, mVar, i2, i3);
    }
}
