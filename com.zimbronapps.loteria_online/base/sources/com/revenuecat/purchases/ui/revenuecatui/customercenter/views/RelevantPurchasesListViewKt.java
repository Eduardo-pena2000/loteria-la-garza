package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Da.v;
import F.Y;
import F.f;
import F.l;
import F.o;
import M0.B;
import O0.g;
import Qa.p;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import j0.i;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RelevantPurchasesListViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Screen $noActiveScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$noActiveScreen = screen;
            this.$testData = customerCenterConfigData;
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
                w.U(1539230767, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveSubscriptionsViewNoDescription_Preview.<anonymous> (RelevantPurchasesListView.kt:255)");
            }
            CustomerCenterConfigData.Screen screen = this.$noActiveScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.a;
            B a = l.a(F.c.a.h(), o0.e.a.k(), mVar, 0);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, aVar);
            g.a aVar2 = g.E8;
            Qa.a a3 = aVar2.a();
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
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            o oVar = o.a;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(screen.getPaths(), "support@revenuecat.com", null, customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), RelevantPurchasesListViewKt$NoActiveSubscriptionsViewNoDescription_Preview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$NoActiveSubscriptionsViewNoDescription_Preview$1$1$2.INSTANCE, null, v.n(), mVar, 819462576, 256);
            mVar.v();
            if (w.L()) {
                w.T();
            }
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
            RelevantPurchasesListViewKt.access$NoActiveSubscriptionsViewNoDescription_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Screen $noActiveScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$noActiveScreen = screen;
            this.$testData = customerCenterConfigData;
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
                w.U(329820115, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveSubscriptionsViewPreview.<anonymous> (RelevantPurchasesListView.kt:182)");
            }
            CustomerCenterConfigData.Screen screen = this.$noActiveScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.a;
            B a = l.a(F.c.a.h(), o0.e.a.k(), mVar, 0);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, aVar);
            g.a aVar2 = g.E8;
            Qa.a a3 = aVar2.a();
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
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            o oVar = o.a;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(screen.getPaths(), "support@revenuecat.com", null, customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), RelevantPurchasesListViewKt$NoActiveSubscriptionsViewPreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$NoActiveSubscriptionsViewPreview$1$1$2.INSTANCE, null, v.n(), mVar, 819462576, 256);
            mVar.v();
            if (w.L()) {
                w.T();
            }
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
            RelevantPurchasesListViewKt.access$NoActiveSubscriptionsViewPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ Qa.l $onPurchaseSelect;
        final /* synthetic */ Set $purchases;
        final /* synthetic */ int $totalPurchaseCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Set set, CustomerCenterConfigData.Localization localization, int i, Qa.l lVar, int i2) {
            super(2);
            this.$purchases = set;
            this.$localization = localization;
            this.$totalPurchaseCount = i;
            this.$onPurchaseSelect = lVar;
            this.$$changed = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RelevantPurchasesListViewKt.access$PurchaseListSection(this.$purchases, this.$localization, this.$totalPurchaseCount, this.$onPurchaseSelect, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ String $contactEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Qa.l $onAction;
        final /* synthetic */ Qa.l $onPurchaseSelect;
        final /* synthetic */ List $purchases;
        final /* synthetic */ CustomerCenterConfigData.Support.SupportTickets $supportTickets;
        final /* synthetic */ List $supportedPaths;
        final /* synthetic */ VirtualCurrencies $virtualCurrencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(List list, String str, VirtualCurrencies virtualCurrencies, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, CustomerCenterConfigData.Support.SupportTickets supportTickets, Qa.l lVar, Qa.l lVar2, e eVar, List list2, int i, int i2) {
            super(2);
            this.$supportedPaths = list;
            this.$contactEmail = str;
            this.$virtualCurrencies = virtualCurrencies;
            this.$appearance = appearance;
            this.$localization = localization;
            this.$supportTickets = supportTickets;
            this.$onPurchaseSelect = lVar;
            this.$onAction = lVar2;
            this.$modifier = eVar;
            this.$purchases = list2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            RelevantPurchasesListViewKt.RelevantPurchasesListView(this.$supportedPaths, this.$contactEmail, this.$virtualCurrencies, this.$appearance, this.$localization, this.$supportTickets, this.$onPurchaseSelect, this.$onAction, this.$modifier, this.$purchases, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
            this.$testData = customerCenterConfigData;
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
                w.U(-2112866129, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewPreview.<anonymous> (RelevantPurchasesListView.kt:160)");
            }
            e f = androidx.compose.foundation.layout.g.f(e.a, 0.0f, 1, (Object) null);
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f2 = androidx.compose.ui.c.f(mVar, f);
            g.a aVar = g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f2, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(screen.getPaths(), "support@revenuecat.com", null, customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), RelevantPurchasesListViewKt$RelevantPurchasesListViewPreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewPreview$1$1$2.INSTANCE, null, Da.u.e(CustomerCenterConfigTestData.INSTANCE.getPurchaseInformationMonthlyRenewing()), mVar, 14156208, 256);
            mVar.v();
            if (w.L()) {
                w.T();
            }
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
            RelevantPurchasesListViewKt.access$RelevantPurchasesListViewPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
            this.$testData = customerCenterConfigData;
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
                w.U(623687999, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithLifetimePurchasePreview.<anonymous> (RelevantPurchasesListView.kt:204)");
            }
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.a;
            B a = l.a(F.c.a.h(), o0.e.a.k(), mVar, 0);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, aVar);
            g.a aVar2 = g.E8;
            Qa.a a3 = aVar2.a();
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
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            o oVar = o.a;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(screen.getPaths(), "support@revenuecat.com", null, customerCenterConfigData.getAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), RelevantPurchasesListViewKt$RelevantPurchasesListViewWithLifetimePurchasePreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithLifetimePurchasePreview$1$1$2.INSTANCE, null, Da.u.e(CustomerCenterConfigTestData.INSTANCE.getPurchaseInformationLifetime()), mVar, 14156208, 256);
            mVar.v();
            if (w.L()) {
                w.T();
            }
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
            RelevantPurchasesListViewKt.access$RelevantPurchasesListViewWithLifetimePurchasePreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
            this.$testData = customerCenterConfigData;
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
                w.U(1494673350, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview.<anonymous> (RelevantPurchasesListView.kt:312)");
            }
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.a;
            B a = l.a(F.c.a.h(), o0.e.a.k(), mVar, 0);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, aVar);
            g.a aVar2 = g.E8;
            Qa.a a3 = aVar2.a();
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
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            o oVar = o.a;
            List paths = screen.getPaths();
            CustomerCenterConfigData.Appearance appearance = customerCenterConfigData.getAppearance();
            CustomerCenterConfigData.Localization localization = customerCenterConfigData.getLocalization();
            CustomerCenterConfigData.Support.SupportTickets supportTickets = customerCenterConfigData.getSupport().getSupportTickets();
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(paths, "support@revenuecat.com", customerCenterConfigTestData.getFiveVirtualCurrencies(), appearance, localization, supportTickets, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview$1$1$2.INSTANCE, null, v.q(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), customerCenterConfigTestData.getPurchaseInformationLifetime()), mVar, 14155824, 256);
            mVar.v();
            if (w.L()) {
                w.T();
            }
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
            RelevantPurchasesListViewKt.access$RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
            this.$testData = customerCenterConfigData;
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
                w.U(-2089866295, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithMultiplePurchasesPreview.<anonymous> (RelevantPurchasesListView.kt:282)");
            }
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.a;
            B a = l.a(F.c.a.h(), o0.e.a.k(), mVar, 0);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, aVar);
            g.a aVar2 = g.E8;
            Qa.a a3 = aVar2.a();
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
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            o oVar = o.a;
            List paths = screen.getPaths();
            CustomerCenterConfigData.Appearance appearance = customerCenterConfigData.getAppearance();
            CustomerCenterConfigData.Localization localization = customerCenterConfigData.getLocalization();
            CustomerCenterConfigData.Support.SupportTickets supportTickets = customerCenterConfigData.getSupport().getSupportTickets();
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(paths, "support@revenuecat.com", null, appearance, localization, supportTickets, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithMultiplePurchasesPreview$1$1$2.INSTANCE, null, v.q(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), customerCenterConfigTestData.getPurchaseInformationYearlyExpiring()), mVar, 14156208, 256);
            mVar.v();
            if (w.L()) {
                w.T();
            }
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
            RelevantPurchasesListViewKt.access$RelevantPurchasesListViewWithMultiplePurchasesPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ CustomerCenterConfigData $testData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Screen screen, CustomerCenterConfigData customerCenterConfigData) {
            super(2);
            this.$managementScreen = screen;
            this.$testData = customerCenterConfigData;
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
                w.U(1430822974, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview.<anonymous> (RelevantPurchasesListView.kt:228)");
            }
            CustomerCenterConfigData.Screen screen = this.$managementScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            e.a aVar = e.a;
            B a = l.a(F.c.a.h(), o0.e.a.k(), mVar, 0);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, aVar);
            g.a aVar2 = g.E8;
            Qa.a a3 = aVar2.a();
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
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar2.f());
            o oVar = o.a;
            List paths = screen.getPaths();
            CustomerCenterConfigData.Appearance appearance = customerCenterConfigData.getAppearance();
            CustomerCenterConfigData.Localization localization = customerCenterConfigData.getLocalization();
            CustomerCenterConfigData.Support.SupportTickets supportTickets = customerCenterConfigData.getSupport().getSupportTickets();
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            RelevantPurchasesListViewKt.RelevantPurchasesListView(paths, "support@revenuecat.com", null, appearance, localization, supportTickets, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview$1$1$1.INSTANCE, RelevantPurchasesListViewKt$RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview$1$1$2.INSTANCE, null, v.q(customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), customerCenterConfigTestData.getPurchaseInformationYearlyExpiring(), customerCenterConfigTestData.getPurchaseInformationLifetime()), mVar, 14156208, 256);
            mVar.v();
            if (w.L()) {
                w.T();
            }
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
            RelevantPurchasesListViewKt.access$RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    private static final void NoActiveSubscriptionsViewNoDescription_Preview(m mVar, int i) {
        m i2 = mVar.i(-611911312);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-611911312, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveSubscriptionsViewNoDescription_Preview (RelevantPurchasesListView.kt:250)");
            }
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1539230767, true, new 1(CustomerCenterConfigData.Screen.copy$default((CustomerCenterConfigData.Screen) obj, (CustomerCenterConfigData.Screen.ScreenType) null, (String) null, (String) null, (List) null, (CustomerCenterConfigData.ScreenOffering) null, 27, (Object) null), customerCenterData$default), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void NoActiveSubscriptionsViewPreview(m mVar, int i) {
        m i2 = mVar.i(-1881756972);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1881756972, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveSubscriptionsViewPreview (RelevantPurchasesListView.kt:178)");
            }
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(329820115, true, new 1((CustomerCenterConfigData.Screen) obj, customerCenterData$default), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void PurchaseListSection(Set set, CustomerCenterConfigData.Localization localization, int i, Qa.l lVar, m mVar, int i2) {
        m i3 = mVar.i(-1017442857);
        int i4 = (i2 & 6) == 0 ? (i3.E(set) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= i3.E(localization) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= i3.d(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= i3.E(lVar) ? 2048 : 1024;
        }
        int i5 = i4;
        if ((i5 & 1171) == 1170 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1017442857, i5, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseListSection (RelevantPurchasesListView.kt:118)");
            }
            if (!((Collection) set).isEmpty()) {
                int i6 = 0;
                for (Object obj : (Iterable) set) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        v.x();
                    }
                    PurchaseInformation purchaseInformation = (PurchaseInformation) obj;
                    i3.V(-980519695);
                    if (i6 > 0) {
                        Y.a(androidx.compose.foundation.layout.g.r(e.a, CustomerCenterConstants.Layout.INSTANCE.getITEMS_SPACING-D9Ej5fM()), i3, 6);
                    }
                    i3.P();
                    ButtonPosition buttonPosition = set.size() == 1 ? ButtonPosition.SINGLE : i6 == 0 ? ButtonPosition.FIRST : i6 == set.size() - 1 ? ButtonPosition.LAST : ButtonPosition.MIDDLE;
                    Qa.a aVar = null;
                    e k = androidx.compose.foundation.layout.f.k(androidx.compose.foundation.layout.g.h(e.a, 0.0f, 1, (Object) null), CustomerCenterConstants.Layout.INSTANCE.getHORIZONTAL_PADDING-D9Ej5fM(), 0.0f, 2, (Object) null);
                    boolean z = i == 1;
                    i3.V(-980493404);
                    if (i > 1) {
                        i3.V(-917850771);
                        boolean E = i3.E(purchaseInformation) | ((i5 & 7168) == 2048);
                        Object C = i3.C();
                        if (E || C == m.a.a()) {
                            C = new RelevantPurchasesListViewKt$PurchaseListSection$1$1$1(lVar, purchaseInformation);
                            i3.t(C);
                        }
                        i3.P();
                        aVar = (Qa.a) C;
                    }
                    i3.P();
                    PurchaseInformationCardViewKt.PurchaseInformationCardView(purchaseInformation, localization, k, buttonPosition, z, aVar, i3, (i5 & 112) | 384, 0);
                    i6 = i7;
                    i5 = i5;
                }
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(set, localization, i, lVar, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0315  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void RelevantPurchasesListView(java.util.List r45, java.lang.String r46, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies r47, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r48, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r49, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets r50, Qa.l r51, Qa.l r52, androidx.compose.ui.e r53, java.util.List r54, b0.m r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewKt.RelevantPurchasesListView(java.util.List, java.lang.String, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets, Qa.l, Qa.l, androidx.compose.ui.e, java.util.List, b0.m, int, int):void");
    }

    private static final void RelevantPurchasesListViewPreview(m mVar, int i) {
        m i2 = mVar.i(-29475920);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-29475920, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewPreview (RelevantPurchasesListView.kt:156)");
            }
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(-2112866129, true, new 1((CustomerCenterConfigData.Screen) obj, customerCenterData$default), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void RelevantPurchasesListViewWithLifetimePurchasePreview(m mVar, int i) {
        m i2 = mVar.i(-1781255744);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1781255744, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithLifetimePurchasePreview (RelevantPurchasesListView.kt:200)");
            }
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(623687999, true, new 1((CustomerCenterConfigData.Screen) obj, customerCenterData$default), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview(m mVar, int i) {
        m i2 = mVar.i(531462629);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(531462629, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview (RelevantPurchasesListView.kt:308)");
            }
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1494673350, true, new 1((CustomerCenterConfigData.Screen) obj, customerCenterData$default), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void RelevantPurchasesListViewWithMultiplePurchasesPreview(m mVar, int i) {
        m i2 = mVar.i(666289000);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(666289000, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithMultiplePurchasesPreview (RelevantPurchasesListView.kt:278)");
            }
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(-2089866295, true, new 1((CustomerCenterConfigData.Screen) obj, customerCenterData$default), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview(m mVar, int i) {
        m i2 = mVar.i(-577177921);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-577177921, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview (RelevantPurchasesListView.kt:224)");
            }
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1430822974, true, new 1((CustomerCenterConfigData.Screen) obj, customerCenterData$default), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$NoActiveSubscriptionsViewNoDescription_Preview(m mVar, int i) {
        NoActiveSubscriptionsViewNoDescription_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$NoActiveSubscriptionsViewPreview(m mVar, int i) {
        NoActiveSubscriptionsViewPreview(mVar, i);
    }

    public static final /* synthetic */ void access$PurchaseListSection(Set set, CustomerCenterConfigData.Localization localization, int i, Qa.l lVar, m mVar, int i2) {
        PurchaseListSection(set, localization, i, lVar, mVar, i2);
    }

    public static final /* synthetic */ void access$RelevantPurchasesListViewPreview(m mVar, int i) {
        RelevantPurchasesListViewPreview(mVar, i);
    }

    public static final /* synthetic */ void access$RelevantPurchasesListViewWithLifetimePurchasePreview(m mVar, int i) {
        RelevantPurchasesListViewWithLifetimePurchasePreview(mVar, i);
    }

    public static final /* synthetic */ void access$RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview(m mVar, int i) {
        RelevantPurchasesListViewWithMultiplePurchasesAndVirtualCurrenciesPreview(mVar, i);
    }

    public static final /* synthetic */ void access$RelevantPurchasesListViewWithMultiplePurchasesPreview(m mVar, int i) {
        RelevantPurchasesListViewWithMultiplePurchasesPreview(mVar, i);
    }

    public static final /* synthetic */ void access$RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview(m mVar, int i) {
        RelevantPurchasesListViewWithSubscriptionsAndLifetimePurchasePreview(mVar, i);
    }
}
