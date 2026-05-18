package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import B0.d;
import Ca.I;
import Ca.o;
import Ca.x;
import Da.S;
import Da.v;
import F.L;
import F.c;
import F.e0;
import F2.a;
import M0.B;
import O0.g;
import Qa.l;
import Qa.p;
import Qa.q;
import Qa.r;
import X.C;
import X.E;
import X.F;
import X.X;
import X.c0;
import X.d0;
import X.m0;
import X.n0;
import X.o0;
import X.p0;
import X.z;
import Z0.Y0;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import androidx.lifecycle.V;
import b0.B1;
import b0.U1;
import b0.b0;
import b0.g1;
import b0.h;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigDataExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelFactory;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterErrorViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterLoadingViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.FeedbackSurveyViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreenKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.icons.ArrowBackKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.CloseKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import d1.H;
import j0.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import o0.e;
import v0.E1;
import v0.r0;
import y.b;
import z.D;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class InternalCustomerCenterKt {
    private static final CustomerCenterConfigData previewConfigData;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(CustomerCenterAction it) {
            t.g(it, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerCenterAction) obj);
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
            InternalCustomerCenterKt.CustomerCenterErrorPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ l $onAction;
        final /* synthetic */ CustomerCenterState.Success $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(CustomerCenterState.Success success, l lVar, int i) {
            super(2);
            this.$state = success;
            this.$onAction = lVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.access$CustomerCenterLoaded(this.$state, this.$onAction, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements l {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(1);
        }

        public final void invoke(CustomerCenterAction it) {
            t.g(it, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerCenterAction) obj);
            return I.a;
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.CustomerCenterLoadedPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(CustomerCenterAction it) {
            t.g(it, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerCenterAction) obj);
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
            InternalCustomerCenterKt.CustomerCenterLoadingPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 3 extends u implements l {
        public static final 3 INSTANCE = new 3();

        public 3() {
            super(1);
        }

        public final void invoke(CustomerCenterAction it) {
            t.g(it, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerCenterAction) obj);
            return I.a;
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.CustomerCenterMultiplePurchasesPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements r {
        final /* synthetic */ CustomerCenterState.Success $customerCenterState;
        final /* synthetic */ l $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterState.Success success, l lVar) {
            super(4);
            this.$customerCenterState = success;
            this.$onAction = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            invoke((b) obj, (CustomerCenterDestination) obj2, (m) obj3, ((Number) obj4).intValue());
            return I.a;
        }

        public final void invoke(b AnimatedContent, CustomerCenterDestination destination, m mVar, int i) {
            t.g(AnimatedContent, "$this$AnimatedContent");
            t.g(destination, "destination");
            if (w.L()) {
                w.U(1269377464, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterNavHost.<anonymous> (InternalCustomerCenter.kt:483)");
            }
            if (destination instanceof CustomerCenterDestination.Main) {
                mVar.V(1775650687);
                InternalCustomerCenterKt.access$MainScreenContent(this.$customerCenterState, this.$onAction, mVar, 0);
                mVar.P();
            } else if (destination instanceof CustomerCenterDestination.FeedbackSurvey) {
                mVar.V(1775865145);
                FeedbackSurveyViewKt.FeedbackSurveyView(((CustomerCenterDestination.FeedbackSurvey) destination).getData(), mVar, 0);
                mVar.P();
            } else if (destination instanceof CustomerCenterDestination.PromotionalOffer) {
                mVar.V(1776013542);
                PromotionalOfferData data = ((CustomerCenterDestination.PromotionalOffer) destination).getData();
                CustomerCenterConfigData.Appearance appearance = this.$customerCenterState.getCustomerCenterConfigData().getAppearance();
                CustomerCenterConfigData.Localization localization = this.$customerCenterState.getCustomerCenterConfigData().getLocalization();
                mVar.V(750037078);
                boolean U = mVar.U(this.$onAction);
                l lVar = this.$onAction;
                Object C = mVar.C();
                if (U || C == m.a.a()) {
                    C = new InternalCustomerCenterKt$CustomerCenterNavHost$2$1$1(lVar);
                    mVar.t(C);
                }
                l lVar2 = (l) C;
                mVar.P();
                mVar.V(750042794);
                boolean U2 = mVar.U(this.$onAction) | ((((i & 112) ^ 48) > 32 && mVar.U(destination)) || (i & 48) == 32);
                l lVar3 = this.$onAction;
                Object C2 = mVar.C();
                if (U2 || C2 == m.a.a()) {
                    C2 = new InternalCustomerCenterKt$CustomerCenterNavHost$2$2$1(lVar3, destination);
                    mVar.t(C2);
                }
                mVar.P();
                PromotionalOfferScreenKt.PromotionalOfferScreen(data, appearance, localization, lVar2, (Qa.a) C2, null, mVar, 0, 32);
                mVar.P();
            } else if (destination instanceof CustomerCenterDestination.SelectedPurchaseDetail) {
                mVar.V(1776733331);
                SelectedPurchaseDetailViewKt.SelectedPurchaseDetailView(this.$customerCenterState.getCustomerCenterConfigData().getSupport().getEmail(), this.$customerCenterState.getCustomerCenterConfigData().getLocalization(), ((CustomerCenterDestination.SelectedPurchaseDetail) destination).getPurchaseInformation(), this.$customerCenterState.getDetailScreenPaths(), null, this.$onAction, mVar, 0, 16);
                mVar.P();
            } else if (destination instanceof CustomerCenterDestination.VirtualCurrencyBalances) {
                mVar.V(1777251093);
                VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreen(this.$customerCenterState.getCustomerCenterConfigData().getAppearance(), this.$customerCenterState.getCustomerCenterConfigData().getLocalization(), null, null, mVar, 0, 12);
                mVar.P();
            } else if (destination instanceof CustomerCenterDestination.CreateSupportTicket) {
                mVar.V(1777576872);
                CreateSupportTicketViewKt.CreateSupportTicketView(((CustomerCenterDestination.CreateSupportTicket) destination).getData(), this.$customerCenterState.getCustomerCenterConfigData().getLocalization(), null, null, null, mVar, 0, 28);
                mVar.P();
            } else {
                mVar.V(1777791485);
                mVar.P();
            }
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 6 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterDestination $currentDestination;
        final /* synthetic */ CustomerCenterState.Success $customerCenterState;
        final /* synthetic */ e $modifier;
        final /* synthetic */ l $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 6(CustomerCenterDestination customerCenterDestination, CustomerCenterState.Success success, l lVar, e eVar, int i, int i2) {
            super(2);
            this.$currentDestination = customerCenterDestination;
            this.$customerCenterState = success;
            this.$onAction = lVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.access$CustomerCenterNavHost(this.$currentDestination, this.$customerCenterState, this.$onAction, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ CustomerCenterState.NavigationButtonType $navigationButtonType;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CustomerCenterState.NavigationButtonType.values().length];
                try {
                    iArr[CustomerCenterState.NavigationButtonType.BACK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CustomerCenterState.NavigationButtonType.CLOSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterState.NavigationButtonType navigationButtonType) {
            super(2);
            this.$navigationButtonType = navigationButtonType;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            d arrowBack;
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-1324873520, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterNavigationIcon.<anonymous> (InternalCustomerCenter.kt:396)");
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.$navigationButtonType.ordinal()];
            if (i2 == 1) {
                arrowBack = ArrowBackKt.getArrowBack();
            } else {
                if (i2 != 2) {
                    throw new o();
                }
                arrowBack = CloseKt.getClose();
            }
            C.b(arrowBack, (String) null, (e) null, 0L, mVar, 48, 12);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterState.NavigationButtonType $navigationButtonType;
        final /* synthetic */ l $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(CustomerCenterState.NavigationButtonType navigationButtonType, l lVar, int i) {
            super(2);
            this.$navigationButtonType = navigationButtonType;
            this.$onAction = lVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.access$CustomerCenterNavigationIcon(this.$navigationButtonType, this.$onAction, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(CustomerCenterAction it) {
            t.g(it, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerCenterAction) obj);
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
            InternalCustomerCenterKt.CustomerCenterNoActiveScreenPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(2);
        }

        public final e invoke(e applyIfNotNull, p0 it) {
            t.g(applyIfNotNull, "$this$applyIfNotNull");
            t.g(it, "it");
            return androidx.compose.ui.input.nestedscroll.a.b(applyIfNotNull, it.a(), (H0.b) null, 2, (Object) null);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ l $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;
        final /* synthetic */ p0 $scrollBehavior;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, p0 p0Var, l lVar) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$scrollBehavior = p0Var;
            this.$onAction = lVar;
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
                w.U(422219848, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterScaffold.<anonymous> (InternalCustomerCenter.kt:326)");
            }
            InternalCustomerCenterKt.access$CustomerCenterTopBar(this.$scaffoldConfig, this.$scrollBehavior, this.$onAction, mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements q {
        final /* synthetic */ p $mainContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(p pVar) {
            super(3);
            this.$mainContent = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((L) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(L paddingValues, m mVar, int i) {
            t.g(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i |= mVar.U(paddingValues) ? 4 : 2;
            }
            if ((i & 19) == 18 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-50242659, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterScaffold.<anonymous> (InternalCustomerCenter.kt:333)");
            }
            e h = f.h(g.f(e.a, 0.0f, 1, (Object) null), paddingValues);
            e.b g = o0.e.a.g();
            c.m h2 = c.a.h();
            p pVar = this.$mainContent;
            B a = F.l.a(h2, g, mVar, 54);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, h);
            g.a aVar = O0.g.E8;
            Qa.a a3 = aVar.a();
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
            m2.e(b, a, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar.f());
            F.o oVar = F.o.a;
            pVar.invoke(mVar, 0);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $mainContent;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ l $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(l lVar, CustomerCenterScaffoldConfig customerCenterScaffoldConfig, androidx.compose.ui.e eVar, p pVar, int i, int i2) {
            super(2);
            this.$onAction = lVar;
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$modifier = eVar;
            this.$mainContent = pVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.access$CustomerCenterScaffold(this.$onAction, this.$scaffoldConfig, this.$modifier, this.$mainContent, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterScaffoldConfig customerCenterScaffoldConfig) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
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
                w.U(391648475, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar.<anonymous> (InternalCustomerCenter.kt:361)");
            }
            String title = this.$scaffoldConfig.getTitle();
            if (title != null) {
                m0.b(title, (androidx.compose.ui.e) null, 0L, 0L, (H) null, (d1.L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
            }
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ l $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, l lVar) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$onAction = lVar;
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
                w.U(389814109, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar.<anonymous> (InternalCustomerCenter.kt:364)");
            }
            InternalCustomerCenterKt.access$CustomerCenterNavigationIcon(this.$scaffoldConfig.getNavigationButtonType(), this.$onAction, mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(CustomerCenterScaffoldConfig customerCenterScaffoldConfig) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
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
                w.U(1110666087, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar.<anonymous> (InternalCustomerCenter.kt:375)");
            }
            String title = this.$scaffoldConfig.getTitle();
            if (title != null) {
                m0.b(title, (androidx.compose.ui.e) null, 0L, 0L, (H) null, (d1.L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
            }
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ l $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, l lVar) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$onAction = lVar;
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
                w.U(237000485, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar.<anonymous> (InternalCustomerCenter.kt:378)");
            }
            InternalCustomerCenterKt.access$CustomerCenterNavigationIcon(this.$scaffoldConfig.getNavigationButtonType(), this.$onAction, mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 5 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ l $onAction;
        final /* synthetic */ CustomerCenterScaffoldConfig $scaffoldConfig;
        final /* synthetic */ p0 $scrollBehavior;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, p0 p0Var, l lVar, int i) {
            super(2);
            this.$scaffoldConfig = customerCenterScaffoldConfig;
            this.$scrollBehavior = p0Var;
            this.$onAction = lVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.access$CustomerCenterTopBar(this.$scaffoldConfig, this.$scrollBehavior, this.$onAction, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 10 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ l $onAction;
        final /* synthetic */ CustomerCenterState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 10(CustomerCenterState customerCenterState, androidx.compose.ui.e eVar, l lVar, int i, int i2) {
            super(2);
            this.$state = customerCenterState;
            this.$modifier = eVar;
            this.$onAction = lVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.access$InternalCustomerCenter(this.$state, this.$modifier, this.$onAction, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 8 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterListener $listener;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Qa.a $onDismiss;
        final /* synthetic */ CustomerCenterViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 8(androidx.compose.ui.e eVar, CustomerCenterListener customerCenterListener, CustomerCenterViewModel customerCenterViewModel, Qa.a aVar, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$listener = customerCenterListener;
            this.$viewModel = customerCenterViewModel;
            this.$onDismiss = aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.InternalCustomerCenter(this.$modifier, this.$listener, this.$viewModel, this.$onDismiss, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 9 extends u implements p {
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ CustomerCenterState.NavigationButtonType $navigationButtonType;
        final /* synthetic */ l $onAction;
        final /* synthetic */ boolean $shouldUseLargeTopBar;
        final /* synthetic */ CustomerCenterState $state;
        final /* synthetic */ String $title;

        public static final class 1 extends u implements p {
            final /* synthetic */ l $onAction;
            final /* synthetic */ CustomerCenterState $state;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(CustomerCenterState customerCenterState, l lVar) {
                super(2);
                this.$state = customerCenterState;
                this.$onAction = lVar;
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
                    w.U(-98702717, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenter.<anonymous>.<anonymous> (InternalCustomerCenter.kt:227)");
                }
                CustomerCenterState customerCenterState = this.$state;
                if (customerCenterState instanceof CustomerCenterState.NotLoaded) {
                    mVar.V(1633707983);
                    mVar.P();
                } else if (customerCenterState instanceof CustomerCenterState.Loading) {
                    mVar.V(1633779903);
                    CustomerCenterLoadingViewKt.CustomerCenterLoadingView(mVar, 0);
                    mVar.P();
                } else if (customerCenterState instanceof CustomerCenterState.Error) {
                    mVar.V(1633896060);
                    CustomerCenterErrorViewKt.CustomerCenterErrorView((CustomerCenterState.Error) this.$state, mVar, 0);
                    mVar.P();
                } else if (customerCenterState instanceof CustomerCenterState.Success) {
                    mVar.V(1634020091);
                    InternalCustomerCenterKt.access$CustomerCenterLoaded((CustomerCenterState.Success) this.$state, this.$onAction, mVar, 0);
                    mVar.P();
                } else {
                    mVar.V(1634194466);
                    mVar.P();
                }
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 9(androidx.compose.ui.e eVar, String str, boolean z, CustomerCenterState.NavigationButtonType navigationButtonType, l lVar, CustomerCenterState customerCenterState) {
            super(2);
            this.$modifier = eVar;
            this.$title = str;
            this.$shouldUseLargeTopBar = z;
            this.$navigationButtonType = navigationButtonType;
            this.$onAction = lVar;
            this.$state = customerCenterState;
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
                w.U(252597340, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenter.<anonymous> (InternalCustomerCenter.kt:217)");
            }
            androidx.compose.ui.e d = androidx.compose.foundation.a.d(this.$modifier, E.a.a(mVar, E.b).c(), (E1) null, 2, (Object) null);
            CustomerCenterScaffoldConfig customerCenterScaffoldConfig = new CustomerCenterScaffoldConfig(this.$title, this.$shouldUseLargeTopBar, this.$navigationButtonType);
            l lVar = this.$onAction;
            InternalCustomerCenterKt.access$CustomerCenterScaffold(lVar, customerCenterScaffoldConfig, d, i.d(-98702717, true, new 1(this.$state, lVar), mVar, 54), mVar, 3072, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 5 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ l $onAction;
        final /* synthetic */ CustomerCenterState.Success $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(CustomerCenterState.Success success, l lVar, int i) {
            super(2);
            this.$state = success;
            this.$onAction = lVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            InternalCustomerCenterKt.access$MainScreenContent(this.$state, this.$onAction, mVar, g1.a(this.$$changed | 1));
        }
    }

    static {
        CustomerCenterConfigData.Screen.ScreenType screenType = CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT;
        Ca.q a = x.a(screenType, new CustomerCenterConfigData.Screen(screenType, "Manage Subscription", "Manage subscription subtitle", Da.u.e(new CustomerCenterConfigData.HelpPath("path-id-1", "Subscription", CustomerCenterConfigData.HelpPath.PathType.CANCEL, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 160, (kotlin.jvm.internal.k) null)), (CustomerCenterConfigData.ScreenOffering) null, 16, (kotlin.jvm.internal.k) null));
        CustomerCenterConfigData.Screen.ScreenType screenType2 = CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE;
        previewConfigData = new CustomerCenterConfigData(S.l(a, x.a(screenType2, new CustomerCenterConfigData.Screen(screenType2, "No subscriptions found", "We can try checking your account for any previous purchases", Da.u.e(new CustomerCenterConfigData.HelpPath("9q9719171o", "Check for previous purchases", CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (kotlin.jvm.internal.k) null)), (CustomerCenterConfigData.ScreenOffering) null, 16, (kotlin.jvm.internal.k) null))), new CustomerCenterConfigData.Appearance((CustomerCenterConfigData.Appearance.ColorInformation) null, (CustomerCenterConfigData.Appearance.ColorInformation) null, 3, (kotlin.jvm.internal.k) null), new CustomerCenterConfigData.Localization("en_US", S.l(x.a("cancel", "Cancel"), x.a("subscription", "Subscription"))), new CustomerCenterConfigData.Support("test@revenuecat.com", (Boolean) null, (Boolean) null, new CustomerCenterConfigData.Support.SupportTickets(false, (CustomerCenterConfigData.Support.SupportTickets.CustomerDetails) null, (CustomerCenterConfigData.Support.SupportTickets.CustomerType) null, 7, (kotlin.jvm.internal.k) null), 6, (kotlin.jvm.internal.k) null), (String) null, 16, (kotlin.jvm.internal.k) null);
    }

    public static final void CustomerCenterErrorPreview(m mVar, int i) {
        m i2 = mVar.i(-117134989);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-117134989, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterErrorPreview (InternalCustomerCenter.kt:690)");
            }
            InternalCustomerCenter(new CustomerCenterState.Error(new PurchasesError(PurchasesErrorCode.UnknownBackendError, (String) null, 2, (kotlin.jvm.internal.k) null)), f.i(androidx.compose.foundation.layout.g.f(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), n1.h.g(10)), 1.INSTANCE, i2, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void CustomerCenterLoaded(CustomerCenterState.Success success, l lVar, m mVar, int i) {
        int i2;
        m mVar2;
        int i3;
        androidx.compose.ui.e eVar;
        F.h hVar;
        m i4 = mVar.i(-1615276070);
        if ((i & 6) == 0) {
            i2 = (i4.E(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i4.E(lVar) ? 32 : 16;
        }
        int i5 = i2;
        if ((i5 & 19) == 18 && i4.j()) {
            i4.M();
            mVar2 = i4;
        } else {
            if (w.L()) {
                w.U(-1615276070, i5, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoaded (InternalCustomerCenter.kt:410)");
            }
            i4.V(526827882);
            Object C = i4.C();
            m.a aVar = m.a;
            if (C == aVar.a()) {
                C = new d0();
                i4.t(C);
            }
            d0 d0Var = (d0) C;
            i4.P();
            h2 o = U1.o(lVar, i4, (i5 >> 3) & 14);
            h2 o2 = U1.o(success.getCustomerCenterConfigData().getLocalization().commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SENT), i4, 0);
            Boolean valueOf = Boolean.valueOf(success.getShowSupportTicketSuccessSnackbar());
            i4.V(526840544);
            boolean E = i4.E(success) | i4.U(o2) | i4.U(o);
            Object C2 = i4.C();
            if (E || C2 == aVar.a()) {
                InternalCustomerCenterKt$CustomerCenterLoaded$1$1 internalCustomerCenterKt$CustomerCenterLoaded$1$1 = new InternalCustomerCenterKt$CustomerCenterLoaded$1$1(success, d0Var, o2, o, null);
                i4.t(internalCustomerCenterKt$CustomerCenterLoaded$1$1);
                C2 = internalCustomerCenterKt$CustomerCenterLoaded$1$1;
            }
            i4.P();
            b0.d(valueOf, (p) C2, i4, 0);
            h2 d = z.c.d(success.isRefreshing() ? 0.5f : 1.0f, z.j.j(300, 0, (D) null, 6, (Object) null), 0.0f, "refreshAlpha", (l) null, i4, 3120, 20);
            androidx.compose.ui.e eVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e f = androidx.compose.foundation.layout.g.f(eVar2, 0.0f, 1, (Object) null);
            e.a aVar2 = o0.e.a;
            B h = F.f.h(aVar2.o(), false);
            int a = h.a(i4, 0);
            b0.I r = i4.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i4, f);
            g.a aVar3 = O0.g.E8;
            Qa.a a2 = aVar3.a();
            if (i4.k() == null) {
                h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a2);
            } else {
                i4.s();
            }
            m b = m2.b(i4);
            m2.e(b, h, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f2, aVar3.f());
            F.h hVar2 = androidx.compose.foundation.layout.c.a;
            androidx.compose.ui.e f3 = androidx.compose.foundation.layout.g.f(eVar2, 0.0f, 1, (Object) null);
            i4.V(-244583743);
            boolean U = i4.U(d);
            Object C3 = i4.C();
            if (U || C3 == aVar.a()) {
                C3 = new InternalCustomerCenterKt$CustomerCenterLoaded$2$1$1(d);
                i4.t(C3);
            }
            i4.P();
            androidx.compose.ui.e a3 = androidx.compose.ui.graphics.f.a(f3, (l) C3);
            B h2 = F.f.h(aVar2.o(), false);
            int a4 = h.a(i4, 0);
            b0.I r2 = i4.r();
            androidx.compose.ui.e f4 = androidx.compose.ui.c.f(i4, a3);
            Qa.a a5 = aVar3.a();
            if (i4.k() == null) {
                h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a5);
            } else {
                i4.s();
            }
            m b3 = m2.b(i4);
            m2.e(b3, h2, aVar3.e());
            m2.e(b3, r2, aVar3.g());
            p b4 = aVar3.b();
            if (b3.f() || !t.c(b3.C(), Integer.valueOf(a4))) {
                b3.t(Integer.valueOf(a4));
                b3.J(Integer.valueOf(a4), b4);
            }
            m2.e(b3, f4, aVar3.f());
            CustomerCenterNavHost(success.getCurrentDestination(), success, lVar, null, i4, (i5 << 3) & 1008, 8);
            i4.v();
            i4.V(-244573442);
            if (success.isRefreshing()) {
                mVar2 = i4;
                i3 = 16;
                eVar = eVar2;
                hVar = hVar2;
                X.L.a(hVar2.a(eVar2, aVar2.e()), 0L, 0.0f, 0L, 0, mVar2, 0, 30);
            } else {
                mVar2 = i4;
                i3 = 16;
                eVar = eVar2;
                hVar = hVar2;
            }
            mVar2.P();
            c0.b(d0Var, f.i(hVar.a(eVar, aVar2.b()), n1.h.g(i3)), (q) null, mVar2, 6, 4);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 3(success, lVar, i));
        }
    }

    private static final l CustomerCenterLoaded$lambda$13(h2 h2Var) {
        return (l) h2Var.getValue();
    }

    private static final String CustomerCenterLoaded$lambda$14(h2 h2Var) {
        return (String) h2Var.getValue();
    }

    private static final float CustomerCenterLoaded$lambda$16(h2 h2Var) {
        return ((Number) h2Var.getValue()).floatValue();
    }

    public static final void CustomerCenterLoadedPreview(m mVar, int i) {
        List n;
        List n2;
        List paths;
        m i2 = mVar.i(899134290);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(899134290, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoadedPreview (InternalCustomerCenter.kt:702)");
            }
            CustomerCenterConfigData customerCenterConfigData = previewConfigData;
            List e = Da.u.e(CustomerCenterConfigTestData.INSTANCE.getPurchaseInformationMonthlyRenewing());
            CustomerCenterConfigData.Screen managementScreen = customerCenterConfigData.getManagementScreen();
            if (managementScreen == null || (n = managementScreen.getPaths()) == null) {
                n = v.n();
            }
            List list = n;
            CustomerCenterConfigData.Screen managementScreen2 = customerCenterConfigData.getManagementScreen();
            if (managementScreen2 == null || (paths = managementScreen2.getPaths()) == null) {
                n2 = v.n();
            } else {
                List arrayList = new ArrayList();
                for (Object obj : paths) {
                    if (((CustomerCenterConfigData.HelpPath) obj).getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL) {
                        arrayList.add(obj);
                    }
                }
                n2 = arrayList;
            }
            InternalCustomerCenter(new CustomerCenterState.Success(customerCenterConfigData, e, list, n2, null, null, null, null, null, false, false, 2032, null), f.i(androidx.compose.foundation.layout.g.f(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), n1.h.g(10)), 2.INSTANCE, i2, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 3(i));
        }
    }

    public static final void CustomerCenterLoadingPreview(m mVar, int i) {
        m i2 = mVar.i(626880743);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(626880743, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterLoadingPreview (InternalCustomerCenter.kt:678)");
            }
            InternalCustomerCenter(CustomerCenterState.Loading.INSTANCE, f.i(androidx.compose.foundation.layout.g.f(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), n1.h.g(10)), 1.INSTANCE, i2, 438, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final void CustomerCenterMultiplePurchasesPreview(m mVar, int i) {
        List n;
        List n2;
        List paths;
        List paths2;
        m i2 = mVar.i(348505677);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(348505677, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterMultiplePurchasesPreview (InternalCustomerCenter.kt:721)");
            }
            CustomerCenterConfigData customerCenterConfigData = previewConfigData;
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            List q = v.q(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), customerCenterConfigTestData.getPurchaseInformationYearlyExpiring());
            CustomerCenterConfigData.Screen managementScreen = customerCenterConfigData.getManagementScreen();
            if (managementScreen == null || (paths2 = managementScreen.getPaths()) == null) {
                n = v.n();
            } else {
                List arrayList = new ArrayList();
                for (Object obj : paths2) {
                    CustomerCenterConfigData.HelpPath helpPath = (CustomerCenterConfigData.HelpPath) obj;
                    if (helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE || helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.CUSTOM_URL) {
                        arrayList.add(obj);
                    }
                }
                n = arrayList;
            }
            CustomerCenterConfigData.Screen managementScreen2 = previewConfigData.getManagementScreen();
            if (managementScreen2 == null || (paths = managementScreen2.getPaths()) == null) {
                n2 = v.n();
            } else {
                List arrayList2 = new ArrayList();
                for (Object obj2 : paths) {
                    if (((CustomerCenterConfigData.HelpPath) obj2).getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL) {
                        arrayList2.add(obj2);
                    }
                }
                n2 = arrayList2;
            }
            InternalCustomerCenter(new CustomerCenterState.Success(customerCenterConfigData, q, n, n2, null, null, null, null, null, false, false, 2032, null), f.i(androidx.compose.foundation.layout.g.f(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), n1.h.g(10)), 3.INSTANCE, i2, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 4(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void CustomerCenterNavHost(com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination r20, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success r21, Qa.l r22, androidx.compose.ui.e r23, b0.m r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt.CustomerCenterNavHost(com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState$Success, Qa.l, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void CustomerCenterNavigationIcon(CustomerCenterState.NavigationButtonType navigationButtonType, l lVar, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-501948109);
        if ((i & 6) == 0) {
            i2 = (i3.U(navigationButtonType) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(lVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-501948109, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterNavigationIcon (InternalCustomerCenter.kt:392)");
            }
            i3.V(1087660344);
            boolean z = (i2 & 112) == 32;
            Object C = i3.C();
            if (z || C == m.a.a()) {
                C = new InternalCustomerCenterKt$CustomerCenterNavigationIcon$1$1(lVar);
                i3.t(C);
            }
            i3.P();
            X.B.a((Qa.a) C, (androidx.compose.ui.e) null, false, (z) null, (E.m) null, i.d(-1324873520, true, new 2(navigationButtonType), i3, 54), i3, 196608, 30);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 3(navigationButtonType, lVar, i));
        }
    }

    public static final void CustomerCenterNoActiveScreenPreview(m mVar, int i) {
        m i2 = mVar.i(595047360);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(595047360, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterNoActiveScreenPreview (InternalCustomerCenter.kt:661)");
            }
            InternalCustomerCenter(new CustomerCenterState.Success(previewConfigData, v.n(), v.n(), v.n(), null, null, null, null, null, false, false, 2032, null), f.i(androidx.compose.foundation.layout.g.f(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), n1.h.g(10)), 1.INSTANCE, i2, 432, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void CustomerCenterScaffold(Qa.l r22, com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterScaffoldConfig r23, androidx.compose.ui.e r24, Qa.p r25, b0.m r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt.CustomerCenterScaffold(Qa.l, com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterScaffoldConfig, androidx.compose.ui.e, Qa.p, b0.m, int, int):void");
    }

    private static final void CustomerCenterTopBar(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, p0 p0Var, l lVar, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(317175815);
        if ((i & 6) == 0) {
            i2 = (i3.U(customerCenterScaffoldConfig) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(p0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.E(lVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(317175815, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterTopBar (InternalCustomerCenter.kt:351)");
            }
            o0 o0Var = o0.a;
            E e = E.a;
            int i4 = E.b;
            n0 j = o0Var.j(e.a(i3, i4).c(), e.a(i3, i4).c(), e.a(i3, i4).p(), e.a(i3, i4).p(), 0L, i3, o0.g << 15, 16);
            if (customerCenterScaffoldConfig.getShouldUseLargeTopBar()) {
                i3.V(1321464226);
                X.d.a(i.d(391648475, true, new 1(customerCenterScaffoldConfig), i3, 54), (androidx.compose.ui.e) null, i.d(389814109, true, new 2(customerCenterScaffoldConfig, lVar), i3, 54), (q) null, 0.0f, 0.0f, (e0) null, j, p0Var, i3, ((i2 << 21) & 234881024) | 390, 122);
                i3.P();
                mVar2 = i3;
            } else {
                i3.V(1321910068);
                mVar2 = i3;
                X.d.e(i.d(1110666087, true, new 3(customerCenterScaffoldConfig), i3, 54), (androidx.compose.ui.e) null, i.d(237000485, true, new 4(customerCenterScaffoldConfig, lVar), i3, 54), (q) null, 0.0f, (e0) null, j, (p0) null, i3, 390, 186);
                mVar2.P();
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 5(customerCenterScaffoldConfig, p0Var, lVar, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void InternalCustomerCenter(androidx.compose.ui.e r19, com.revenuecat.purchases.customercenter.CustomerCenterListener r20, com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel r21, Qa.a r22, b0.m r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt.InternalCustomerCenter(androidx.compose.ui.e, com.revenuecat.purchases.customercenter.CustomerCenterListener, com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel, Qa.a, b0.m, int, int):void");
    }

    private static final CustomerCenterState InternalCustomerCenter$lambda$1(h2 h2Var) {
        return (CustomerCenterState) h2Var.getValue();
    }

    private static final void MainScreenContent(CustomerCenterState.Success success, l lVar, m mVar, int i) {
        int i2;
        m mVar2;
        m mVar3;
        m i3 = mVar.i(-622947142);
        if ((i & 6) == 0) {
            i2 = (i3.E(success) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(lVar) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(-622947142, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.MainScreenContent (InternalCustomerCenter.kt:555)");
            }
            CustomerCenterConfigData customerCenterConfigData = success.getCustomerCenterConfigData();
            if (success.getPurchases().isEmpty()) {
                mVar2 = i3;
                mVar2.V(388207578);
                CustomerCenterConfigData.Screen noActiveScreen = customerCenterConfigData.getNoActiveScreen();
                if (noActiveScreen != null) {
                    NoActiveUserManagementViewKt.NoActiveUserManagementView(noActiveScreen, customerCenterConfigData.getSupport().getEmail(), customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), success.getNoActiveScreenOffering(), success.getVirtualCurrencies(), lVar, mVar2, (i2 << 18) & 29360128, 0);
                    I i4 = I.a;
                }
                mVar2.P();
            } else {
                i3.V(387234953);
                if (customerCenterConfigData.getManagementScreen() == null) {
                    mVar3 = i3;
                } else {
                    List mainScreenPaths = success.getMainScreenPaths();
                    String email = customerCenterConfigData.getSupport().getEmail();
                    VirtualCurrencies virtualCurrencies = success.getVirtualCurrencies();
                    CustomerCenterConfigData.Appearance appearance = customerCenterConfigData.getAppearance();
                    CustomerCenterConfigData.Localization localization = customerCenterConfigData.getLocalization();
                    CustomerCenterConfigData.Support.SupportTickets supportTickets = customerCenterConfigData.getSupport().getSupportTickets();
                    i3.V(684114534);
                    boolean E = i3.E(success) | ((i2 & 112) == 32);
                    Object C = i3.C();
                    if (E || C == m.a.a()) {
                        C = new InternalCustomerCenterKt$MainScreenContent$1$1$1(success, lVar);
                        i3.t(C);
                    }
                    i3.P();
                    mVar3 = i3;
                    RelevantPurchasesListViewKt.RelevantPurchasesListView(mainScreenPaths, email, virtualCurrencies, appearance, localization, supportTickets, (l) C, lVar, null, success.getPurchases(), i3, (i2 << 18) & 29360128, 256);
                    I i5 = I.a;
                }
                mVar3.P();
                mVar2 = mVar3;
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 5(success, lVar, i));
        }
    }

    public static final /* synthetic */ void access$CustomerCenterLoaded(CustomerCenterState.Success success, l lVar, m mVar, int i) {
        CustomerCenterLoaded(success, lVar, mVar, i);
    }

    public static final /* synthetic */ l access$CustomerCenterLoaded$lambda$13(h2 h2Var) {
        return CustomerCenterLoaded$lambda$13(h2Var);
    }

    public static final /* synthetic */ String access$CustomerCenterLoaded$lambda$14(h2 h2Var) {
        return CustomerCenterLoaded$lambda$14(h2Var);
    }

    public static final /* synthetic */ float access$CustomerCenterLoaded$lambda$16(h2 h2Var) {
        return CustomerCenterLoaded$lambda$16(h2Var);
    }

    public static final /* synthetic */ void access$CustomerCenterNavHost(CustomerCenterDestination customerCenterDestination, CustomerCenterState.Success success, l lVar, androidx.compose.ui.e eVar, m mVar, int i, int i2) {
        CustomerCenterNavHost(customerCenterDestination, success, lVar, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$CustomerCenterNavigationIcon(CustomerCenterState.NavigationButtonType navigationButtonType, l lVar, m mVar, int i) {
        CustomerCenterNavigationIcon(navigationButtonType, lVar, mVar, i);
    }

    public static final /* synthetic */ void access$CustomerCenterScaffold(l lVar, CustomerCenterScaffoldConfig customerCenterScaffoldConfig, androidx.compose.ui.e eVar, p pVar, m mVar, int i, int i2) {
        CustomerCenterScaffold(lVar, customerCenterScaffoldConfig, eVar, pVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$CustomerCenterTopBar(CustomerCenterScaffoldConfig customerCenterScaffoldConfig, p0 p0Var, l lVar, m mVar, int i) {
        CustomerCenterTopBar(customerCenterScaffoldConfig, p0Var, lVar, mVar, i);
    }

    public static final /* synthetic */ void access$InternalCustomerCenter(CustomerCenterState customerCenterState, androidx.compose.ui.e eVar, l lVar, m mVar, int i, int i2) {
        InternalCustomerCenter(customerCenterState, eVar, lVar, mVar, i, i2);
    }

    public static final /* synthetic */ CustomerCenterState access$InternalCustomerCenter$lambda$1(h2 h2Var) {
        return InternalCustomerCenter$lambda$1(h2Var);
    }

    public static final /* synthetic */ void access$MainScreenContent(CustomerCenterState.Success success, l lVar, m mVar, int i) {
        MainScreenContent(success, lVar, mVar, i);
    }

    private static final X.l createColorScheme(CustomerCenterState customerCenterState, m mVar, int i) {
        mVar.V(352157510);
        if (w.L()) {
            w.U(352157510, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.createColorScheme (InternalCustomerCenter.kt:251)");
        }
        boolean a = A.q.a(mVar, 0);
        X.l a2 = E.a.a(mVar, E.b);
        mVar.V(636383891);
        boolean a3 = mVar.a(a) | ((((i & 14) ^ 6) > 4 && mVar.U(customerCenterState)) || (i & 6) == 4) | mVar.U(a2);
        Object C = mVar.C();
        if (a3 || C == m.a.a()) {
            if (customerCenterState instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success = (CustomerCenterState.Success) customerCenterState;
                CustomerCenterConfigData.Appearance appearance = success.getCustomerCenterConfigData().getAppearance();
                r0 colorForTheme = CustomerCenterConfigDataExtensionsKt.getColorForTheme(appearance, a, InternalCustomerCenterKt$createColorScheme$1$accentColor$1.INSTANCE);
                r0 colorForTheme2 = success.getCurrentDestination() instanceof CustomerCenterDestination.PromotionalOffer ? CustomerCenterConfigDataExtensionsKt.getColorForTheme(appearance, a, InternalCustomerCenterKt$createColorScheme$1$backgroundColor$1.INSTANCE) : null;
                a2 = X.l.b(a2, colorForTheme != null ? colorForTheme.A() : a2.C(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, colorForTheme2 != null ? colorForTheme2.A() : a2.c(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -8194, 15, (Object) null);
            }
            mVar.t(a2);
            C = a2;
        }
        X.l lVar = (X.l) C;
        mVar.P();
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return lVar;
    }

    private static final ScaffoldConfigData createScaffoldState(CustomerCenterState customerCenterState, m mVar, int i) {
        mVar.V(953700373);
        if (w.L()) {
            w.U(953700373, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.createScaffoldState (InternalCustomerCenter.kt:284)");
        }
        mVar.V(2044243650);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(customerCenterState)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            if (customerCenterState instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success = (CustomerCenterState.Success) customerCenterState;
                String title = success.getNavigationState().getCurrentDestination().getTitle();
                C = new ScaffoldConfigData(title, customerCenterState.getNavigationButtonType(), (success.getCurrentDestination() instanceof CustomerCenterDestination.Main) && title != null);
            } else {
                C = new ScaffoldConfigData(null, CustomerCenterState.NavigationButtonType.CLOSE, false);
            }
            mVar.t(C);
        }
        ScaffoldConfigData scaffoldConfigData = (ScaffoldConfigData) C;
        mVar.P();
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return scaffoldConfigData;
    }

    private static final CustomerCenterViewModel getCustomerCenterViewModel(boolean z, CustomerCenterListener customerCenterListener, PurchasesType purchasesType, CustomerCenterViewModel customerCenterViewModel, m mVar, int i, int i2) {
        mVar.V(1278114306);
        if ((i2 & 2) != 0) {
            customerCenterListener = null;
        }
        if ((i2 & 4) != 0) {
            purchasesType = new PurchasesImpl(null, 1, null);
        }
        if ((i2 & 8) != 0) {
            CustomerCenterViewModelFactory customerCenterViewModelFactory = new CustomerCenterViewModelFactory(purchasesType, E.a.a(mVar, E.b), z, customerCenterListener);
            mVar.B(1729797275);
            androidx.lifecycle.h c = G2.b.a.c(mVar, 6);
            if (c == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            V b = G2.d.b(P.b(CustomerCenterViewModelImpl.class), c, (String) null, customerCenterViewModelFactory, c instanceof androidx.lifecycle.h ? c.getDefaultViewModelCreationExtras() : a.b.c, mVar, 0, 0);
            mVar.T();
            customerCenterViewModel = (CustomerCenterViewModel) b;
        }
        if (w.L()) {
            w.U(1278114306, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.getCustomerCenterViewModel (InternalCustomerCenter.kt:611)");
        }
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return customerCenterViewModel;
    }

    private static final void InternalCustomerCenter(CustomerCenterState customerCenterState, androidx.compose.ui.e eVar, l lVar, m mVar, int i, int i2) {
        int i3;
        m i4 = mVar.i(-456940664);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.U(customerCenterState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.U(eVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.E(lVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                eVar = androidx.compose.ui.e.a;
            }
            if (w.L()) {
                w.U(-456940664, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenter (InternalCustomerCenter.kt:210)");
            }
            int i6 = i3 & 14;
            X.l createColorScheme = createColorScheme(customerCenterState, i4, i6);
            ScaffoldConfigData createScaffoldState = createScaffoldState(customerCenterState, i4, i6);
            F.a(createColorScheme, (X) null, (X.r0) null, i.d(252597340, true, new 9(eVar, createScaffoldState.component1(), createScaffoldState.component3(), createScaffoldState.component2(), lVar, customerCenterState), i4, 54), i4, 3072, 6);
            if (w.L()) {
                w.T();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        B1 l = i4.l();
        if (l != null) {
            l.a(new 10(customerCenterState, eVar2, lVar, i, i2));
        }
    }
}
