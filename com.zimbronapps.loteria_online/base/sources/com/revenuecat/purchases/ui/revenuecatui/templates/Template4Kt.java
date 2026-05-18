package com.revenuecat.purchases.ui.revenuecatui.templates;

import C.n;
import Ca.I;
import F.E;
import F.T;
import F.W;
import F.c;
import F.i;
import F.j;
import F.o;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import W0.D;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
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
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.composables.ConsistentPackageContentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.InsetSpacersKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.MarkdownKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PaywallBackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import d1.H;
import d1.L;
import java.util.Iterator;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.k;
import o0.e;
import v0.E1;
import z.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template4Kt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z, TemplateConfiguration.Colors colors, e eVar, int i, int i2) {
            super(2);
            this.$isSelected = z;
            this.$colors = colors;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template4Kt.access$CheckmarkBox(this.$isSelected, this.$colors, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(D clearAndSetSemantics) {
            t.g(clearAndSetSemantics, "$this$clearAndSetSemantics");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((D) obj);
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ boolean $selected;
        final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, TemplateConfiguration.Colors colors, boolean z, int i) {
            super(2);
            this.$text = str;
            this.$colors = colors;
            this.$selected = z;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template4Kt.access$DiscountRelativeToMostExpensivePerMonth(this.$text, this.$colors, this.$selected, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements q {
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel) {
            super(3);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((j) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(j BoxWithConstraints, m mVar, int i) {
            t.g(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i & 6) == 0) {
                i |= mVar.U(BoxWithConstraints) ? 4 : 2;
            }
            if ((i & 19) == 18 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-1700467196, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Packages.<anonymous> (Template4.kt:234)");
            }
            float access$Packages$packageWidth = Template4Kt.access$Packages$packageWidth(BoxWithConstraints, this.$state.getTemplateConfiguration().getPackages().getAll().size());
            e b = androidx.compose.foundation.e.b(g.h(d.a(e.a, E.a), 0.0f, 1, (Object) null), androidx.compose.foundation.e.c(0, mVar, 0, 1), false, (n) null, false, 14, (Object) null);
            Template4UIConstants template4UIConstants = Template4UIConstants.INSTANCE;
            e j = f.j(b, template4UIConstants.getPackagesHorizontalPadding-D9Ej5fM(), UIConstant.INSTANCE.getDefaultVerticalSpacing-D9Ej5fM());
            c.f o = c.a.o(template4UIConstants.getPackageHorizontalSpacing-D9Ej5fM());
            PaywallState.Loaded.Legacy legacy = this.$state;
            PaywallViewModel paywallViewModel = this.$viewModel;
            B b2 = T.b(o, o0.e.a.l(), mVar, 6);
            int a = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, j);
            g.a aVar = O0.g.E8;
            a a2 = aVar.a();
            if (mVar.k() == null) {
                h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b3 = m2.b(mVar);
            m2.e(b3, b2, aVar.e());
            m2.e(b3, r, aVar.g());
            p b4 = aVar.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a))) {
                b3.t(Integer.valueOf(a));
                b3.J(Integer.valueOf(a), b4);
            }
            m2.e(b3, f, aVar.f());
            W w = W.a;
            mVar.V(632318323);
            Iterator it = legacy.getTemplateConfiguration().getPackages().getAll().iterator();
            while (it.hasNext()) {
                Template4Kt.access$SelectPackageButton(legacy, (TemplateConfiguration.PackageInfo) it.next(), paywallViewModel, androidx.compose.foundation.layout.g.v(e.a, access$Packages$packageWidth), mVar, 0, 0);
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
            Template4Kt.access$Packages(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
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
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, e eVar, int i, int i2) {
            super(2);
            this.$state = legacy;
            this.$packageInfo = packageInfo;
            this.$viewModel = paywallViewModel;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template4Kt.access$SelectPackageButton(this.$state, this.$packageInfo, this.$viewModel, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ TemplateConfiguration.PackageInfo $packageInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, int i) {
            super(2);
            this.$packageInfo = packageInfo;
            this.$colors = colors;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            Template4Kt.access$SelectPackageButtonContent(this.$packageInfo, this.$colors, mVar, g1.a(this.$$changed | 1));
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
            Template4Kt.Template4(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
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
            Template4Kt.access$Template4MainContent(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
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
            Template4Kt.access$Template4PaywallFooterCondensedPreview(mVar, g1.a(this.$$changed | 1));
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
            Template4Kt.access$Template4PaywallFooterPreview(mVar, g1.a(this.$$changed | 1));
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
            Template4Kt.access$Template4PaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void CheckmarkBox(boolean r15, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r16, androidx.compose.ui.e r17, b0.m r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.CheckmarkBox(boolean, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, androidx.compose.ui.e, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void DiscountRelativeToMostExpensivePerMonth(java.lang.String r11, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r12, boolean r13, b0.m r14, int r15) {
        /*
            r0 = -1807074170(0xffffffff944a3c86, float:-1.021033E-26)
            b0.m r14 = r14.i(r0)
            r1 = r15 & 6
            if (r1 != 0) goto L16
            boolean r1 = r14.U(r11)
            if (r1 == 0) goto L13
            r1 = 4
            goto L14
        L13:
            r1 = 2
        L14:
            r1 = r1 | r15
            goto L17
        L16:
            r1 = r15
        L17:
            r2 = r15 & 48
            if (r2 != 0) goto L27
            boolean r2 = r14.U(r12)
            if (r2 == 0) goto L24
            r2 = 32
            goto L26
        L24:
            r2 = 16
        L26:
            r1 = r1 | r2
        L27:
            r2 = r15 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L37
            boolean r2 = r14.a(r13)
            if (r2 == 0) goto L34
            r2 = 256(0x100, float:3.59E-43)
            goto L36
        L34:
            r2 = 128(0x80, float:1.8E-43)
        L36:
            r1 = r1 | r2
        L37:
            r2 = r1 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L49
            boolean r2 = r14.j()
            if (r2 != 0) goto L44
            goto L49
        L44:
            r14.M()
            goto Lb7
        L49:
            boolean r2 = b0.w.L()
            if (r2 == 0) goto L55
            r2 = -1
            java.lang.String r3 = "com.revenuecat.purchases.ui.revenuecatui.templates.DiscountRelativeToMostExpensivePerMonth (Template4.kt:370)"
            b0.w.U(r0, r1, r2, r3)
        L55:
            if (r11 == 0) goto L67
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r11.toUpperCase(r0)
            java.lang.String r1 = "toUpperCase(...)"
            kotlin.jvm.internal.t.f(r0, r1)
            if (r0 != 0) goto L65
            goto L67
        L65:
            r1 = r0
            goto L6a
        L67:
            java.lang.String r0 = ""
            goto L65
        L6a:
            if (r13 == 0) goto L72
            long r2 = r12.getText2-0d7_KjU()
        L70:
            r3 = r2
            goto L77
        L72:
            long r2 = r12.getText3-0d7_KjU()
            goto L70
        L77:
            X.E r0 = X.E.a
            int r2 = X.E.b
            X.r0 r0 = r0.c(r14, r2)
            Z0.Y0 r5 = r0.d()
            d1.L$a r0 = d1.L.b
            d1.L r6 = r0.b()
            l1.j$a r0 = l1.j.b
            int r7 = r0.a()
            androidx.compose.ui.e$a r0 = androidx.compose.ui.e.a
            com.revenuecat.purchases.ui.revenuecatui.UIConstant r2 = com.revenuecat.purchases.ui.revenuecatui.UIConstant.INSTANCE
            float r2 = r2.getDefaultHorizontalPadding-D9Ej5fM()
            com.revenuecat.purchases.ui.revenuecatui.templates.Template4UIConstants r8 = com.revenuecat.purchases.ui.revenuecatui.templates.Template4UIConstants.INSTANCE
            float r8 = r8.getDiscountVerticalPadding-D9Ej5fM()
            androidx.compose.ui.e r0 = androidx.compose.foundation.layout.f.j(r0, r2, r8)
            com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$1 r2 = com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.DiscountRelativeToMostExpensivePerMonth.1.INSTANCE
            androidx.compose.ui.e r2 = W0.s.c(r0, r2)
            r9 = 24576(0x6000, float:3.4438E-41)
            r10 = 0
            r8 = r14
            com.revenuecat.purchases.ui.revenuecatui.composables.AutoResizedTextKt.AutoResizedText-W72HBGU(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            boolean r0 = b0.w.L()
            if (r0 == 0) goto Lb7
            b0.w.T()
        Lb7:
            b0.B1 r14 = r14.l()
            if (r14 == 0) goto Lc5
            com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$2 r0 = new com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt$DiscountRelativeToMostExpensivePerMonth$2
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.DiscountRelativeToMostExpensivePerMonth(java.lang.String, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, boolean, b0.m, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void OfferName-3IgeMak(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageInfo r32, long r33, androidx.compose.ui.e r35, b0.m r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.OfferName-3IgeMak(com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$PackageInfo, long, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void Packages(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        int i2;
        m i3 = mVar.i(2132177050);
        if ((i & 6) == 0) {
            i2 = (i3.U(legacy) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(paywallViewModel) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(2132177050, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Packages (Template4.kt:217)");
            }
            i.a((e) null, (o0.e) null, false, j0.i.d(-1700467196, true, new 1(legacy, paywallViewModel), i3, 54), i3, 3072, 7);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(legacy, paywallViewModel, i));
        }
    }

    private static final float Packages$packageWidth(j jVar, float f) {
        float Packages$packagesToDisplay = Packages$packagesToDisplay(f);
        Template4UIConstants template4UIConstants = Template4UIConstants.INSTANCE;
        return n1.h.g(n1.h.g(n1.h.g(jVar.b() - n1.h.g(template4UIConstants.getPackagesHorizontalPadding-D9Ej5fM() * 2)) - n1.h.g(template4UIConstants.getPackageHorizontalSpacing-D9Ej5fM() * (Packages$packagesToDisplay - 1))) / Packages$packagesToDisplay);
    }

    private static final float Packages$packagesToDisplay(float f) {
        return Math.min(Math.min(3.5f, f), 3.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void SelectPackageButton(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r36, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.PackageInfo r37, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r38, androidx.compose.ui.e r39, b0.m r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt.SelectPackageButton(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$PackageInfo, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void SelectPackageButtonContent(TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(2102143927);
        if ((i & 6) == 0) {
            i2 = (i3.U(packageInfo) ? 4 : 2) | i;
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
                w.U(2102143927, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.SelectPackageButtonContent (Template4.kt:343)");
            }
            c.f o = c.a.o(Template4UIConstants.INSTANCE.getPackageButtonContentVerticalSpacing-D9Ej5fM());
            e.b g = o0.e.a.g();
            e.a aVar = androidx.compose.ui.e.a;
            B a = F.l.a(o, g, i3, 54);
            int a2 = h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, aVar);
            g.a aVar2 = O0.g.E8;
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
            OfferName-3IgeMak(packageInfo, colors.getText1-0d7_KjU(), F.n.b(o.a, androidx.compose.foundation.layout.g.B(aVar, (o0.e) null, false, 3, (Object) null), 1.0f, false, 2, (Object) null), i3, i2 & 14, 0);
            mVar2 = i3;
            m0.b(packageInfo.getRcPackage().getProduct().getPrice().getFormatted(), (androidx.compose.ui.e) null, colors.getText1-0d7_KjU(), 0L, (H) null, L.b.h(), (d1.u) null, 0L, (k) null, (l1.j) null, 0L, 0, false, 0, 0, (l) null, X.E.a.c(i3, X.E.b).b(), mVar2, 196608, 0, 65498);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(packageInfo, colors, i));
        }
    }

    public static final void Template4(PaywallState.Loaded.Legacy state, PaywallViewModel viewModel, m mVar, int i) {
        int i2;
        t.g(state, "state");
        t.g(viewModel, "viewModel");
        m i3 = mVar.i(596926027);
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
                w.U(596926027, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4 (Template4.kt:102)");
            }
            if (PaywallStateKt.isInFullScreenMode(state)) {
                i3.V(-1356655279);
                int i4 = i2 & 14;
                boolean shouldUseLandscapeLayout = WindowHelperKt.shouldUseLandscapeLayout(state, i3, i4);
                e.a aVar = androidx.compose.ui.e.a;
                androidx.compose.ui.e f = androidx.compose.foundation.layout.g.f(aVar, 0.0f, 1, (Object) null);
                e.a aVar2 = o0.e.a;
                B h = F.f.h(aVar2.o(), false);
                int a = h.a(i3, 0);
                b0.I r = i3.r();
                androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i3, f);
                g.a aVar3 = O0.g.E8;
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
                m b = m2.b(i3);
                m2.e(b, h, aVar3.e());
                m2.e(b, r, aVar3.g());
                p b2 = aVar3.b();
                if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                    b.t(Integer.valueOf(a));
                    b.J(Integer.valueOf(a), b2);
                }
                m2.e(b, f2, aVar3.f());
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
                i3.V(-1319514881);
                if (!shouldUseLandscapeLayout) {
                    PaywallBackgroundKt.PaywallBackground(cVar, state.getTemplateConfiguration(), i3, 6);
                }
                i3.P();
                i3.V(-1319508245);
                Object C = i3.C();
                m.a aVar4 = m.a;
                if (C == aVar4.a()) {
                    C = new Template4Kt$Template4$1$1$1(cVar);
                    i3.t(C);
                }
                i3.P();
                androidx.compose.ui.e conditional = ModifierExtensionsKt.conditional(aVar, shouldUseLandscapeLayout, (l) C);
                boolean z = true ^ shouldUseLandscapeLayout;
                i3.V(-1319503568);
                Object C2 = i3.C();
                if (C2 == aVar4.a()) {
                    C2 = new Template4Kt$Template4$1$2$1(cVar);
                    i3.t(C2);
                }
                i3.P();
                androidx.compose.ui.e d = androidx.compose.foundation.a.d(ModifierExtensionsKt.conditional(conditional, z, (l) C2), PaywallStateKt.getCurrentColors(state, i3, i4).getBackground-0d7_KjU(), (E1) null, 2, (Object) null);
                B a3 = F.l.a(c.a.h(), aVar2.k(), i3, 0);
                int a4 = h.a(i3, 0);
                b0.I r2 = i3.r();
                androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i3, d);
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
                m b3 = m2.b(i3);
                m2.e(b3, a3, aVar3.e());
                m2.e(b3, r2, aVar3.g());
                p b4 = aVar3.b();
                if (b3.f() || !t.c(b3.C(), Integer.valueOf(a4))) {
                    b3.t(Integer.valueOf(a4));
                    b3.J(Integer.valueOf(a4), b4);
                }
                m2.e(b3, f3, aVar3.f());
                o oVar = o.a;
                i3.V(-1458604088);
                if (shouldUseLandscapeLayout) {
                    InsetSpacersKt.StatusBarSpacer(i3, 0);
                }
                i3.P();
                Template4MainContent(state, viewModel, i3, i2 & 126);
                i3.v();
                i3.v();
                i3.P();
            } else {
                i3.V(-1355397392);
                Template4MainContent(state, viewModel, i3, i2 & 126);
                i3.P();
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(state, viewModel, i));
        }
    }

    private static final void Template4MainContent(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        int i2;
        c cVar;
        T1 t1;
        m mVar2;
        m i3 = mVar.i(-1408056045);
        if ((i & 6) == 0) {
            i2 = (i3.U(legacy) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(paywallViewModel) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-1408056045, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4MainContent (Template4.kt:148)");
            }
            TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(i3, 0);
            e.a aVar = androidx.compose.ui.e.a;
            UIConstant uIConstant = UIConstant.INSTANCE;
            androidx.compose.ui.e m = f.m(aVar, 0.0f, uIConstant.getDefaultVerticalSpacing-D9Ej5fM(), 0.0f, 0.0f, 13, (Object) null);
            c cVar2 = c.a;
            c.f o = cVar2.o(uIConstant.getDefaultVerticalSpacing-D9Ej5fM());
            e.a aVar2 = o0.e.a;
            B a = F.l.a(o, aVar2.g(), i3, 48);
            int a2 = h.a(i3, 0);
            b0.I r = i3.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, m);
            g.a aVar3 = O0.g.E8;
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
            i3.V(-1434964265);
            if (PaywallStateKt.isInFullScreenMode(legacy)) {
                ProcessedLocalizedConfiguration selectedLocalization = PaywallStateKt.getSelectedLocalization(legacy);
                Y0 g = X.E.a.c(i3, X.E.b).g();
                L a4 = L.b.a();
                int a5 = l1.j.b.a();
                String title = selectedLocalization.getTitle();
                long j = currentColors.getText1-0d7_KjU();
                t1 = null;
                androidx.compose.ui.e k = f.k(aVar, uIConstant.getDefaultHorizontalPadding-D9Ej5fM(), 0.0f, 2, (Object) null);
                cVar = cVar2;
                MarkdownKt.Markdown-DkhmgE0(title, k, j, g, 0L, a4, null, null, l1.j.h(a5), false, true, false, i3, 196608, 54, 720);
            } else {
                cVar = cVar2;
                t1 = null;
            }
            i3.P();
            i3.V(-1434945388);
            Object C = i3.C();
            m.a aVar4 = m.a;
            if (C == aVar4.a()) {
                C = U1.i(Boolean.valueOf(legacy.getTemplateConfiguration().getMode() != PaywallMode.FOOTER_CONDENSED), t1, 2, t1);
                i3.t(C);
            }
            C0 c0 = (C0) C;
            i3.P();
            B a6 = F.l.a(cVar.h(), aVar2.g(), i3, 48);
            int a7 = h.a(i3, 0);
            b0.I r2 = i3.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i3, aVar);
            a a8 = aVar3.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a8);
            } else {
                i3.s();
            }
            m b3 = m2.b(i3);
            m2.e(b3, a6, aVar3.e());
            m2.e(b3, r2, aVar3.g());
            p b4 = aVar3.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a7))) {
                b3.t(Integer.valueOf(a7));
                b3.J(Integer.valueOf(a7), b4);
            }
            m2.e(b3, f2, aVar3.f());
            y.e.d(oVar, Template4MainContent$lambda$9$lambda$5(c0), (androidx.compose.ui.e) null, androidx.compose.animation.e.k((G) null, aVar2.a(), false, (l) null, 13, (Object) null), androidx.compose.animation.e.u((G) null, aVar2.a(), false, (l) null, 13, (Object) null), "SelectPackagesVisibility", j0.i.d(492758735, true, new Template4Kt$Template4MainContent$1$1$1(legacy, paywallViewModel), i3, 54), i3, 1797126, 2);
            y.e.d(oVar, Template4MainContent$lambda$9$lambda$5(c0), (androidx.compose.ui.e) null, (androidx.compose.animation.f) null, (androidx.compose.animation.g) null, (String) null, ComposableSingletons$Template4Kt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), i3, 1572870, 30);
            ConsistentPackageContentViewKt.ConsistentPackageContentView(legacy, j0.i.d(-1316875667, true, new Template4Kt$Template4MainContent$1$1$2(currentColors), i3, 54), i3, (i2 & 14) | 48);
            i3.v();
            int i4 = i2 & 112;
            mVar2 = i3;
            PurchaseButtonKt.PurchaseButton-hGBTI10(legacy, paywallViewModel, null, 0.0f, null, i3, i2 & 126, 28);
            TemplateConfiguration templateConfiguration = legacy.getTemplateConfiguration();
            mVar2.V(-1434895273);
            Object C2 = mVar2.C();
            if (C2 == aVar4.a()) {
                C2 = new Template4Kt$Template4MainContent$1$2$1(c0);
                mVar2.t(C2);
            }
            mVar2.P();
            FooterKt.Footer(templateConfiguration, paywallViewModel, null, null, (a) C2, mVar2, i4 | 24576, 12);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 2(legacy, paywallViewModel, i));
        }
    }

    private static final boolean Template4MainContent$lambda$9$lambda$5(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void Template4MainContent$lambda$9$lambda$6(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final void Template4PaywallFooterCondensedPreview(m mVar, int i) {
        m i2 = mVar.i(-1780033640);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1780033640, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4PaywallFooterCondensedPreview (Template4.kt:485)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, TestData.INSTANCE.getTemplate4Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template4PaywallFooterPreview(m mVar, int i) {
        m i2 = mVar.i(-1022674125);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1022674125, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4PaywallFooterPreview (Template4.kt:474)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, TestData.INSTANCE.getTemplate4Offering(), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void Template4PaywallPreview(m mVar, int i) {
        m i2 = mVar.i(-1574269896);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1574269896, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.Template4PaywallPreview (Template4.kt:463)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(null, TestData.INSTANCE.getTemplate4Offering(), null, false, false, 29, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$CheckmarkBox(boolean z, TemplateConfiguration.Colors colors, androidx.compose.ui.e eVar, m mVar, int i, int i2) {
        CheckmarkBox(z, colors, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$DiscountRelativeToMostExpensivePerMonth(String str, TemplateConfiguration.Colors colors, boolean z, m mVar, int i) {
        DiscountRelativeToMostExpensivePerMonth(str, colors, z, mVar, i);
    }

    public static final /* synthetic */ void access$OfferName-3IgeMak(TemplateConfiguration.PackageInfo packageInfo, long j, androidx.compose.ui.e eVar, m mVar, int i, int i2) {
        OfferName-3IgeMak(packageInfo, j, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$Packages(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        Packages(legacy, paywallViewModel, mVar, i);
    }

    public static final /* synthetic */ float access$Packages$packageWidth(j jVar, float f) {
        return Packages$packageWidth(jVar, f);
    }

    public static final /* synthetic */ void access$SelectPackageButton(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.PackageInfo packageInfo, PaywallViewModel paywallViewModel, androidx.compose.ui.e eVar, m mVar, int i, int i2) {
        SelectPackageButton(legacy, packageInfo, paywallViewModel, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$SelectPackageButtonContent(TemplateConfiguration.PackageInfo packageInfo, TemplateConfiguration.Colors colors, m mVar, int i) {
        SelectPackageButtonContent(packageInfo, colors, mVar, i);
    }

    public static final /* synthetic */ void access$Template4MainContent(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        Template4MainContent(legacy, paywallViewModel, mVar, i);
    }

    public static final /* synthetic */ boolean access$Template4MainContent$lambda$9$lambda$5(C0 c0) {
        return Template4MainContent$lambda$9$lambda$5(c0);
    }

    public static final /* synthetic */ void access$Template4MainContent$lambda$9$lambda$6(C0 c0, boolean z) {
        Template4MainContent$lambda$9$lambda$6(c0, z);
    }

    public static final /* synthetic */ void access$Template4PaywallFooterCondensedPreview(m mVar, int i) {
        Template4PaywallFooterCondensedPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template4PaywallFooterPreview(m mVar, int i) {
        Template4PaywallFooterPreview(mVar, i);
    }

    public static final /* synthetic */ void access$Template4PaywallPreview(m mVar, int i) {
        Template4PaywallPreview(mVar, i);
    }
}
