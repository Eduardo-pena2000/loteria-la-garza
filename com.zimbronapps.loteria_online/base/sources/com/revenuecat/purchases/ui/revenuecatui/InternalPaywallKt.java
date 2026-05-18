package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Ca.o;
import F2.a;
import G2.b;
import G2.d;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import X.E;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.V;
import b0.B1;
import b0.H;
import b0.c1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.LoadedPaywallComponentsKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.CloseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.ErrorDialogKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallViewKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ContextExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProviderKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template1Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template2Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template3Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template4Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template5Kt;
import com.revenuecat.purchases.ui.revenuecatui.templates.Template7Kt;
import com.revenuecat.purchases.ui.revenuecatui.utils.URLOpener;
import com.revenuecat.purchases.ui.revenuecatui.utils.URLOpeningMethod;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.r0;
import y.e;
import y.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalPaywallKt {

    public static final class 3 extends u implements p {
        final /* synthetic */ PaywallOptions $options;
        final /* synthetic */ PaywallState $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        public static final class 1 extends u implements q {
            final /* synthetic */ PaywallOptions $options;
            final /* synthetic */ PaywallViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(PaywallOptions paywallOptions, PaywallViewModel paywallViewModel) {
                super(3);
                this.$options = paywallOptions;
                this.$viewModel = paywallViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
                return I.a;
            }

            public final void invoke(f AnimatedVisibility, m mVar, int i) {
                t.g(AnimatedVisibility, "$this$AnimatedVisibility");
                if (w.L()) {
                    w.U(272980506, i, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:84)");
                }
                PaywallMode mode$revenuecatui_defaultsBc8Release = this.$options.getMode$revenuecatui_defaultsBc8Release();
                boolean shouldDisplayDismissButton$revenuecatui_defaultsBc8Release = this.$options.getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release();
                PaywallViewModel paywallViewModel = this.$viewModel;
                mVar.V(1191294305);
                boolean U = mVar.U(paywallViewModel);
                Object C = mVar.C();
                if (U || C == m.a.a()) {
                    C = new InternalPaywallKt$InternalPaywall$3$1$1$1(paywallViewModel);
                    mVar.t(C);
                }
                mVar.P();
                LoadingPaywallKt.LoadingPaywall(mode$revenuecatui_defaultsBc8Release, shouldDisplayDismissButton$revenuecatui_defaultsBc8Release, (a) C, mVar, 0);
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PaywallState paywallState, PaywallOptions paywallOptions, PaywallViewModel paywallViewModel) {
            super(2);
            this.$state = paywallState;
            this.$options = paywallOptions;
            this.$viewModel = paywallViewModel;
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
                w.U(-1925201086, i, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous> (InternalPaywall.kt:79)");
            }
            PaywallState paywallState = this.$state;
            boolean z = (paywallState instanceof PaywallState.Loading) || (paywallState instanceof PaywallState.Error);
            UIConstant uIConstant = UIConstant.INSTANCE;
            e.e(z, (androidx.compose.ui.e) null, androidx.compose.animation.e.m(uIConstant.defaultAnimation(), 0.0f, 2, (Object) null), androidx.compose.animation.e.o(uIConstant.defaultAnimation(), 0.0f, 2, (Object) null), (String) null, i.d(272980506, true, new 1(this.$options, this.$viewModel), mVar, 54), mVar, 196608, 18);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ PaywallState $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        public static final class 1 extends u implements q {
            final /* synthetic */ PaywallState $state;
            final /* synthetic */ PaywallViewModel $viewModel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(PaywallState paywallState, PaywallViewModel paywallViewModel) {
                super(3);
                this.$state = paywallState;
                this.$viewModel = paywallViewModel;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
                return I.a;
            }

            public final void invoke(f AnimatedVisibility, m mVar, int i) {
                t.g(AnimatedVisibility, "$this$AnimatedVisibility");
                if (w.L()) {
                    w.U(-2131421167, i, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:98)");
                }
                PaywallState paywallState = this.$state;
                if (paywallState instanceof PaywallState.Loaded.Legacy) {
                    InternalPaywallKt.access$LoadedPaywall((PaywallState.Loaded.Legacy) paywallState, this.$viewModel, mVar, 0);
                } else {
                    Logger.INSTANCE.e("State is not loaded while transitioning animation. This may happen if state changes from being loaded to a different state. This should not happen.");
                }
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(PaywallState paywallState, PaywallViewModel paywallViewModel) {
            super(2);
            this.$state = paywallState;
            this.$viewModel = paywallViewModel;
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
                w.U(-1460021447, i, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous> (InternalPaywall.kt:93)");
            }
            boolean z = this.$state instanceof PaywallState.Loaded.Legacy;
            UIConstant uIConstant = UIConstant.INSTANCE;
            e.e(z, (androidx.compose.ui.e) null, androidx.compose.animation.e.m(uIConstant.defaultAnimation(), 0.0f, 2, (Object) null), androidx.compose.animation.e.o(uIConstant.defaultAnimation(), 0.0f, 2, (Object) null), (String) null, i.d(-2131421167, true, new 1(this.$state, this.$viewModel), mVar, 54), mVar, 196608, 18);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 5 extends u implements q {
        final /* synthetic */ PaywallState $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(PaywallState paywallState, PaywallViewModel paywallViewModel) {
            super(3);
            this.$state = paywallState;
            this.$viewModel = paywallViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(f AnimatedVisibility, m mVar, int i) {
            t.g(AnimatedVisibility, "$this$AnimatedVisibility");
            if (w.L()) {
                w.U(1024882965, i, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous> (InternalPaywall.kt:115)");
            }
            if (this.$state instanceof PaywallState.Loaded.Components) {
                this.$viewModel.trackPaywallImpressionIfNeeded();
                LoadedPaywallComponentsKt.LoadedPaywallComponents((PaywallState.Loaded.Components) this.$state, InternalPaywallKt.access$rememberPaywallActionHandler(this.$viewModel, mVar, 0), null, mVar, 0, 4);
            } else {
                Logger.INSTANCE.e("State is not Loaded.Components while transitioning animation. This may happen if state changes from being loaded to a different state. This should not happen.");
            }
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 6 extends u implements p {
        final /* synthetic */ PaywallOptions $options;
        final /* synthetic */ PaywallState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 6(PaywallOptions paywallOptions, PaywallState paywallState) {
            super(2);
            this.$options = paywallOptions;
            this.$state = paywallState;
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
                w.U(-1440901149, i, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous> (InternalPaywall.kt:134)");
            }
            ErrorDialogKt.ErrorDialog(this.$options.getDismissRequest(), ((PaywallState.Error) this.$state).getErrorMessage(), mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 8 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ PaywallOptions $options;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 8(PaywallOptions paywallOptions, PaywallViewModel paywallViewModel, int i, int i2) {
            super(2);
            this.$options = paywallOptions;
            this.$viewModel = paywallViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalPaywallKt.InternalPaywall(this.$options, this.$viewModel, mVar, g1.a(this.$$changed | 1), this.$$default);
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
            InternalPaywallKt.access$LoadedPaywall(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i) {
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
            InternalPaywallKt.access$LoadedPaywall(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, int i) {
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
            InternalPaywallKt.access$TemplatePaywall(this.$state, this.$viewModel, mVar, g1.a(this.$$changed | 1));
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaywallTemplate.values().length];
            try {
                iArr[PaywallTemplate.TEMPLATE_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PaywallTemplate.TEMPLATE_7.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonComponent.UrlMethod.values().length];
            try {
                iArr2[ButtonComponent.UrlMethod.IN_APP_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ButtonComponent.UrlMethod.EXTERNAL_BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ButtonComponent.UrlMethod.DEEP_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ButtonComponent.UrlMethod.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void InternalPaywall(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions r17, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel r18, b0.m r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt.InternalPaywall(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel, b0.m, int, int):void");
    }

    private static final void LoadedPaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        int i2;
        PaywallState.Loaded.Legacy legacy2;
        m i3 = mVar.i(-1252678312);
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
            legacy2 = legacy;
        } else {
            if (w.L()) {
                w.U(-1252678312, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadedPaywall (InternalPaywall.kt:160)");
            }
            paywallViewModel.trackPaywallImpressionIfNeeded();
            Activity activity = ContextExtensionsKt.getActivity((Context) i3.x(AndroidCompositionLocals_androidKt.g()));
            i3.V(-492482342);
            if (legacy.getValidationWarning() != null) {
                E e = E.a;
                int i4 = E.b;
                long c = e.a(i3, i4).c();
                long w = e.a(i3, i4).w();
                androidx.compose.ui.e eVar = screenModeBackground-mxwnekA(androidx.compose.ui.e.a, PaywallStateKt.isInFullScreenMode(legacy), c);
                B h = F.f.h(o0.e.a.o(), false);
                int a = h.a(i3, 0);
                b0.I r = i3.r();
                androidx.compose.ui.e f = c.f(i3, eVar);
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
                List all = legacy.getTemplateConfiguration().getPackages().getAll();
                TemplateConfiguration.PackageInfo packageInfo = (TemplateConfiguration.PackageInfo) legacy.getSelectedPackage().getValue();
                PaywallWarning validationWarning = legacy.getValidationWarning();
                i3.V(2084302107);
                int i5 = i2 & 112;
                boolean z = i5 == 32;
                Object C = i3.C();
                if (z || C == m.a.a()) {
                    C = new InternalPaywallKt$LoadedPaywall$1$1$1(paywallViewModel);
                    i3.t(C);
                }
                i3.P();
                l lVar = (l) ((Xa.f) C);
                i3.V(2084303926);
                boolean E = (i5 == 32) | i3.E(activity);
                Object C2 = i3.C();
                if (E || C2 == m.a.a()) {
                    C2 = new InternalPaywallKt$LoadedPaywall$1$2$1(paywallViewModel, activity);
                    i3.t(C2);
                }
                a aVar2 = (a) C2;
                i3.P();
                i3.V(2084307527);
                boolean z2 = i5 == 32;
                Object C3 = i3.C();
                if (z2 || C3 == m.a.a()) {
                    C3 = new InternalPaywallKt$LoadedPaywall$1$3$1(paywallViewModel);
                    i3.t(C3);
                }
                i3.P();
                DefaultPaywallViewKt.DefaultPaywallView(all, packageInfo, validationWarning, lVar, aVar2, (a) C3, null, null, i3, 0, 192);
                boolean shouldDisplayDismissButton = legacy.getShouldDisplayDismissButton();
                r0 m = r0.m(w);
                boolean booleanValue = ((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue();
                i3.V(2084317882);
                boolean z3 = i5 == 32;
                Object C4 = i3.C();
                if (z3 || C4 == m.a.a()) {
                    C4 = new InternalPaywallKt$LoadedPaywall$1$4$1(paywallViewModel);
                    i3.t(C4);
                }
                i3.P();
                CloseButtonKt.CloseButton-drOMvmE(cVar, shouldDisplayDismissButton, m, booleanValue, (a) C4, i3, 6);
                i3.v();
                i3.P();
                if (w.L()) {
                    w.T();
                }
                B1 l = i3.l();
                if (l != null) {
                    l.a(new 2(legacy, paywallViewModel, i));
                    return;
                }
                return;
            }
            legacy2 = legacy;
            i3.P();
            androidx.compose.ui.e eVar2 = screenModeBackground-mxwnekA(androidx.compose.ui.e.a, PaywallStateKt.isInFullScreenMode(legacy), legacy.getTemplateConfiguration().getCurrentColors(i3, 0).getBackground-0d7_KjU());
            B h2 = F.f.h(o0.e.a.o(), false);
            int a3 = h.a(i3, 0);
            b0.I r2 = i3.r();
            androidx.compose.ui.e f2 = c.f(i3, eVar2);
            g.a aVar3 = g.E8;
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
            m b3 = m2.b(i3);
            m2.e(b3, h2, aVar3.e());
            m2.e(b3, r2, aVar3.g());
            p b4 = aVar3.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a3))) {
                b3.t(Integer.valueOf(a3));
                b3.J(Integer.valueOf(a3), b4);
            }
            m2.e(b3, f2, aVar3.f());
            androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.c.a;
            int i6 = i2 & 14;
            Configuration configurationWithOverriddenLocale = configurationWithOverriddenLocale(legacy2, i3, i6);
            H.d(new c1[]{HelperFunctionsKt.getLocalActivity().d(activity), AndroidCompositionLocals_androidKt.g().d(contextWithConfiguration(legacy2, configurationWithOverriddenLocale, i3, i6)), AndroidCompositionLocals_androidKt.f().d(configurationWithOverriddenLocale)}, i.d(1771404190, true, new InternalPaywallKt$LoadedPaywall$3$1(legacy2, paywallViewModel), i3, 54), i3, c1.i | 48);
            boolean shouldDisplayDismissButton2 = legacy.getShouldDisplayDismissButton();
            r0 r0Var = PaywallStateKt.getCurrentColors(legacy2, i3, i6).getCloseButton-QN2ZGVo();
            boolean booleanValue2 = ((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue();
            i3.V(2084345882);
            boolean z4 = (i2 & 112) == 32;
            Object C5 = i3.C();
            if (z4 || C5 == m.a.a()) {
                C5 = new InternalPaywallKt$LoadedPaywall$3$2$1(paywallViewModel);
                i3.t(C5);
            }
            i3.P();
            CloseButtonKt.CloseButton-drOMvmE(cVar2, shouldDisplayDismissButton2, r0Var, booleanValue2, (a) C5, i3, 6);
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = i3.l();
        if (l2 != null) {
            l2.a(new 4(legacy2, paywallViewModel, i));
        }
    }

    private static final void TemplatePaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-1883481085);
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
                w.U(-1883481085, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.TemplatePaywall (InternalPaywall.kt:216)");
            }
            switch (WhenMappings.$EnumSwitchMapping$0[legacy.getTemplateConfiguration().getTemplate().ordinal()]) {
                case 1:
                    i3.V(-820467874);
                    Template1Kt.Template1(legacy, paywallViewModel, i3, i2 & 126);
                    i3.P();
                    break;
                case 2:
                    i3.V(-820465122);
                    Template2Kt.Template2(legacy, paywallViewModel, null, i3, i2 & 126, 4);
                    i3.P();
                    break;
                case 3:
                    i3.V(-820462370);
                    Template3Kt.Template3(legacy, paywallViewModel, i3, i2 & 126);
                    i3.P();
                    break;
                case 4:
                    i3.V(-820459618);
                    Template4Kt.Template4(legacy, paywallViewModel, i3, i2 & 126);
                    i3.P();
                    break;
                case 5:
                    i3.V(-820456866);
                    Template5Kt.Template5(legacy, paywallViewModel, i3, i2 & 126);
                    i3.P();
                    break;
                case 6:
                    i3.V(-820454114);
                    Template7Kt.Template7(legacy, paywallViewModel, i3, i2 & 126);
                    i3.P();
                    break;
                default:
                    i3.V(335777363);
                    i3.P();
                    break;
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(legacy, paywallViewModel, i));
        }
    }

    public static final /* synthetic */ void access$LoadedPaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        LoadedPaywall(legacy, paywallViewModel, mVar, i);
    }

    public static final /* synthetic */ void access$TemplatePaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, m mVar, int i) {
        TemplatePaywall(legacy, paywallViewModel, mVar, i);
    }

    public static final /* synthetic */ void access$handleUrlDestination(Context context, String str, ButtonComponent.UrlMethod urlMethod) {
        handleUrlDestination(context, str, urlMethod);
    }

    public static final /* synthetic */ p access$rememberPaywallActionHandler(PaywallViewModel paywallViewModel, m mVar, int i) {
        return rememberPaywallActionHandler(paywallViewModel, mVar, i);
    }

    private static final Configuration configurationWithOverriddenLocale(PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        if (w.L()) {
            w.U(761546839, i, -1, "com.revenuecat.purchases.ui.revenuecatui.configurationWithOverriddenLocale (InternalPaywall.kt:260)");
        }
        Configuration configuration = new Configuration((Configuration) mVar.x(AndroidCompositionLocals_androidKt.f()));
        configuration.setLocale(legacy.getTemplateConfiguration().getLocale());
        if (w.L()) {
            w.T();
        }
        return configuration;
    }

    private static final Context contextWithConfiguration(PaywallState.Loaded.Legacy legacy, Configuration configuration, m mVar, int i) {
        if (w.L()) {
            w.U(2083869389, i, -1, "com.revenuecat.purchases.ui.revenuecatui.contextWithConfiguration (InternalPaywall.kt:251)");
        }
        Context context = (Context) mVar.x(AndroidCompositionLocals_androidKt.g());
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        if (createConfigurationContext != null) {
            context = createConfigurationContext;
        }
        if (w.L()) {
            w.T();
        }
        return context;
    }

    public static final PaywallViewModel getPaywallViewModel(PaywallOptions options, l lVar, m mVar, int i, int i2) {
        t.g(options, "options");
        mVar.V(-1725540891);
        l lVar2 = (i2 & 2) != 0 ? null : lVar;
        if (w.L()) {
            w.U(-1725540891, i, -1, "com.revenuecat.purchases.ui.revenuecatui.getPaywallViewModel (InternalPaywall.kt:232)");
        }
        Context applicationContext = ((Context) mVar.x(AndroidCompositionLocals_androidKt.g())).getApplicationContext();
        String valueOf = String.valueOf(options.hashCode());
        t.f(applicationContext, "applicationContext");
        PaywallViewModelFactory paywallViewModelFactory = new PaywallViewModelFactory(PaywallResourceProviderKt.toResourceProvider(applicationContext), options, E.a.a(mVar, E.b), A.q.a(mVar, 0), lVar2, HelperFunctionsKt.isInPreviewMode(mVar, 0));
        mVar.B(1729797275);
        androidx.lifecycle.h c = b.a.c(mVar, 6);
        if (c == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        V b = d.b(P.b(PaywallViewModelImpl.class), c, valueOf, paywallViewModelFactory, c instanceof androidx.lifecycle.h ? c.getDefaultViewModelCreationExtras() : a.b.c, mVar, 0, 0);
        mVar.T();
        PaywallViewModelImpl paywallViewModelImpl = (PaywallViewModelImpl) b;
        paywallViewModelImpl.updateOptions(options);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return paywallViewModelImpl;
    }

    private static final void handleUrlDestination(Context context, String str, ButtonComponent.UrlMethod urlMethod) {
        URLOpeningMethod uRLOpeningMethod;
        int i = WhenMappings.$EnumSwitchMapping$1[urlMethod.ordinal()];
        if (i == 1) {
            uRLOpeningMethod = URLOpeningMethod.IN_APP_BROWSER;
        } else if (i == 2) {
            uRLOpeningMethod = URLOpeningMethod.EXTERNAL_BROWSER;
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new o();
                }
                Logger.INSTANCE.e("Ignoring button click with unknown open method for URL: '" + str + "'. This is a bug in the SDK.");
                return;
            }
            uRLOpeningMethod = URLOpeningMethod.DEEP_LINK;
        }
        URLOpener.INSTANCE.openURL$revenuecatui_defaultsBc8Release(context, str, uRLOpeningMethod);
    }

    private static final p rememberPaywallActionHandler(PaywallViewModel paywallViewModel, m mVar, int i) {
        mVar.V(-1933557776);
        if (w.L()) {
            w.U(-1933557776, i, -1, "com.revenuecat.purchases.ui.revenuecatui.rememberPaywallActionHandler (InternalPaywall.kt:268)");
        }
        Context context = (Context) mVar.x(AndroidCompositionLocals_androidKt.g());
        Activity activity = ContextExtensionsKt.getActivity(context);
        mVar.V(-1197188630);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(paywallViewModel)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new InternalPaywallKt$rememberPaywallActionHandler$1$1(paywallViewModel, activity, context, null);
            mVar.t(C);
        }
        p pVar = (p) C;
        mVar.P();
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return pVar;
    }

    private static final androidx.compose.ui.e screenModeBackground-mxwnekA(androidx.compose.ui.e eVar, boolean z, long j) {
        return ModifierExtensionsKt.conditional(ModifierExtensionsKt.conditional(eVar, z, new InternalPaywallKt$screenModeBackground$1(j)), !z, new InternalPaywallKt$screenModeBackground$2(j));
    }
}
