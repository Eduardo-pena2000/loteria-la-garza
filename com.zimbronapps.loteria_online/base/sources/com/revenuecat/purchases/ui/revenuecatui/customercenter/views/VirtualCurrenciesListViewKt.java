package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import F.T;
import F.W;
import F.c;
import M0.B;
import O0.g;
import Qa.l;
import Qa.p;
import W0.h;
import X.C;
import X.E;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.KeyboardArrowRightKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import d1.H;
import d1.L;
import j0.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrenciesListViewKt {
    private static final int MAX_NUMBER_OF_ROWS = 4;

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ l $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$onAction = lVar;
            this.$localization = localization;
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
                w.U(-906812433, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ShowAllVirtualCurrenciesRow.<anonymous> (VirtualCurrenciesListView.kt:197)");
            }
            e h = g.h(e.a, 0.0f, 1, (Object) null);
            mVar.V(160480015);
            boolean U = mVar.U(this.$onAction);
            l lVar = this.$onAction;
            Object C = mVar.C();
            if (U || C == m.a.a()) {
                C = new VirtualCurrenciesListViewKt$ShowAllVirtualCurrenciesRow$1$1$1(lVar);
                mVar.t(C);
            }
            mVar.P();
            e j = f.j(androidx.compose.foundation.b.d(h, false, (String) null, (h) null, (Qa.a) C, 7, (Object) null), CustomerCenterConstants.Card.INSTANCE.getCARD_PADDING-D9Ej5fM(), n1.h.g(12));
            c.f e = F.c.a.e();
            e.c i2 = o0.e.a.i();
            CustomerCenterConfigData.Localization localization = this.$localization;
            B b = T.b(e, i2, mVar, 54);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, j);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b2 = m2.b(mVar);
            m2.e(b2, b, aVar.e());
            m2.e(b2, r, aVar.g());
            p b3 = aVar.b();
            if (b2.f() || !t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar.f());
            W w = W.a;
            String commonLocalizedString = localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SEE_ALL_VIRTUAL_CURRENCIES);
            E e2 = E.a;
            int i3 = E.b;
            m0.b(commonLocalizedString, (androidx.compose.ui.e) null, e2.a(mVar, i3).C(), 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, e2.c(mVar, i3).c(), mVar, 0, 0, 65530);
            C.b(KeyboardArrowRightKt.getKeyboardArrowRight(), (String) null, (androidx.compose.ui.e) null, e2.a(mVar, i3).C(), mVar, 48, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ l $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterConfigData.Localization localization, l lVar, androidx.compose.ui.e eVar, int i, int i2) {
            super(2);
            this.$localization = localization;
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
            VirtualCurrenciesListViewKt.access$ShowAllVirtualCurrenciesRow(this.$localization, this.$onAction, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ l $onAction;
        final /* synthetic */ VirtualCurrencies $virtualCurrencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(VirtualCurrencies virtualCurrencies, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, l lVar, androidx.compose.ui.e eVar, int i, int i2) {
            super(2);
            this.$virtualCurrencies = virtualCurrencies;
            this.$appearance = appearance;
            this.$localization = localization;
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
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView(this.$virtualCurrencies, this.$appearance, this.$localization, this.$onAction, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ l $onAction;
        final /* synthetic */ VirtualCurrencies $virtualCurrencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(VirtualCurrencies virtualCurrencies, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, l lVar, androidx.compose.ui.e eVar, int i, int i2) {
            super(2);
            this.$virtualCurrencies = virtualCurrencies;
            this.$appearance = appearance;
            this.$localization = localization;
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
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView(this.$virtualCurrencies, this.$appearance, this.$localization, this.$onAction, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData $testData;

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData customerCenterConfigData) {
            super(2);
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
                w.U(1130083298, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_4_VCs_Preview.<anonymous> (VirtualCurrenciesListView.kt:238)");
            }
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView(customerCenterConfigTestData.getFourVirtualCurrencies(), customerCenterConfigTestData.getStandardAppearance(), this.$testData.getLocalization(), 1.INSTANCE, null, mVar, 3072, 16);
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
            VirtualCurrenciesListViewKt.access$VirtualCurrenciesListView_4_VCs_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData $testData;

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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData customerCenterConfigData) {
            super(2);
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
                w.U(488997155, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_5_VCs_Preview.<anonymous> (VirtualCurrenciesListView.kt:261)");
            }
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            VirtualCurrenciesListViewKt.VirtualCurrenciesListView(customerCenterConfigTestData.getFiveVirtualCurrencies(), customerCenterConfigTestData.getStandardAppearance(), this.$testData.getLocalization(), 1.INSTANCE, null, mVar, 3072, 16);
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
            VirtualCurrenciesListViewKt.access$VirtualCurrenciesListView_5_VCs_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ String $formattedBalance;
        final /* synthetic */ long $textColor;
        final /* synthetic */ VirtualCurrency $virtualCurrency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(VirtualCurrency virtualCurrency, long j, String str) {
            super(2);
            this.$virtualCurrency = virtualCurrency;
            this.$textColor = j;
            this.$formattedBalance = str;
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
                w.U(-1744786209, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyRow.<anonymous> (VirtualCurrenciesListView.kt:157)");
            }
            androidx.compose.ui.e j = f.j(androidx.compose.ui.e.a, CustomerCenterConstants.Card.INSTANCE.getCARD_PADDING-D9Ej5fM(), n1.h.g(12));
            c.f e = F.c.a.e();
            e.c i2 = o0.e.a.i();
            VirtualCurrency virtualCurrency = this.$virtualCurrency;
            long j2 = this.$textColor;
            String str = this.$formattedBalance;
            B b = T.b(e, i2, mVar, 54);
            int a = b0.h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, j);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                b0.h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b2 = m2.b(mVar);
            m2.e(b2, b, aVar.e());
            m2.e(b2, r, aVar.g());
            p b3 = aVar.b();
            if (b2.f() || !t.c(b2.C(), Integer.valueOf(a))) {
                b2.t(Integer.valueOf(a));
                b2.J(Integer.valueOf(a), b3);
            }
            m2.e(b2, f, aVar.f());
            W w = W.a;
            m0.b(virtualCurrency.getName() + " (" + virtualCurrency.getCode() + ')', (androidx.compose.ui.e) null, j2, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, j.h(j.b.f()), 0L, 0, false, 2, 0, (l) null, (Y0) null, mVar, 0, 3072, 122362);
            m0.b(str, (androidx.compose.ui.e) null, j2, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131066);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ ButtonPosition $position;
        final /* synthetic */ VirtualCurrency $virtualCurrency;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, VirtualCurrency virtualCurrency, ButtonPosition buttonPosition, androidx.compose.ui.e eVar, int i, int i2) {
            super(2);
            this.$appearance = appearance;
            this.$localization = localization;
            this.$virtualCurrency = virtualCurrency;
            this.$position = buttonPosition;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VirtualCurrenciesListViewKt.VirtualCurrencyRow(this.$appearance, this.$localization, this.$virtualCurrency, this.$position, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonPosition.values().length];
            try {
                iArr[ButtonPosition.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonPosition.FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonPosition.LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonPosition.MIDDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void ShowAllVirtualCurrenciesRow(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r21, Qa.l r22, androidx.compose.ui.e r23, b0.m r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt.ShowAllVirtualCurrenciesRow(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, Qa.l, androidx.compose.ui.e, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VirtualCurrenciesListView(com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies r42, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r43, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r44, Qa.l r45, androidx.compose.ui.e r46, b0.m r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt.VirtualCurrenciesListView(com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, Qa.l, androidx.compose.ui.e, b0.m, int, int):void");
    }

    private static final void VirtualCurrenciesListView_4_VCs_Preview(m mVar, int i) {
        m i2 = mVar.i(1658158529);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1658158529, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_4_VCs_Preview (VirtualCurrenciesListView.kt:234)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1130083298, true, new 1(CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null)), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void VirtualCurrenciesListView_5_VCs_Preview(m mVar, int i) {
        m i2 = mVar.i(1017072386);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1017072386, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListView_5_VCs_Preview (VirtualCurrenciesListView.kt:257)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(488997155, true, new 1(CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null)), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void VirtualCurrencyRow(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r21, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r22, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency r23, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ButtonPosition r24, androidx.compose.ui.e r25, b0.m r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrenciesListViewKt.VirtualCurrencyRow(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.virtualcurrencies.VirtualCurrency, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ButtonPosition, androidx.compose.ui.e, b0.m, int, int):void");
    }

    public static final /* synthetic */ void access$ShowAllVirtualCurrenciesRow(CustomerCenterConfigData.Localization localization, l lVar, androidx.compose.ui.e eVar, m mVar, int i, int i2) {
        ShowAllVirtualCurrenciesRow(localization, lVar, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$VirtualCurrenciesListView_4_VCs_Preview(m mVar, int i) {
        VirtualCurrenciesListView_4_VCs_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$VirtualCurrenciesListView_5_VCs_Preview(m mVar, int i) {
        VirtualCurrenciesListView_5_VCs_Preview(mVar, i);
    }
}
