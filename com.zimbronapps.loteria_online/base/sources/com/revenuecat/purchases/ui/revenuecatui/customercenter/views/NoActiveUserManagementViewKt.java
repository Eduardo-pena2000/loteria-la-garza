package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import F.l;
import F.o;
import M0.B;
import O0.g;
import Qa.p;
import X.C;
import X.E;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterUIConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.InfoKt;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import d1.H;
import d1.L;
import j0.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import o0.e;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class NoActiveUserManagementViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ String $description;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, String str2) {
            super(2);
            this.$title = str;
            this.$description = str2;
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
                w.U(-805166926, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ContentUnavailableView.<anonymous> (NoActiveUserManagementView.kt:118)");
            }
            e.a aVar = e.a;
            e h = g.h(aVar, 0.0f, 1, (Object) null);
            CustomerCenterUIConstants customerCenterUIConstants = CustomerCenterUIConstants.INSTANCE;
            e j = f.j(h, customerCenterUIConstants.getContentUnavailableViewPaddingHorizontal-D9Ej5fM(), customerCenterUIConstants.getContentUnavailableViewPaddingVertical-D9Ej5fM());
            e.b g = o0.e.a.g();
            String str = this.$title;
            String str2 = this.$description;
            B a = l.a(F.c.a.h(), g, mVar, 48);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, j);
            g.a aVar2 = O0.g.E8;
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
            B0.d info = InfoKt.getInfo();
            E e = E.a;
            int i2 = E.b;
            C.b(info, (String) null, androidx.compose.foundation.layout.g.r(aVar, customerCenterUIConstants.getContentUnavailableIconSize-D9Ej5fM()), e.a(mVar, i2).w(), mVar, 432, 0);
            Y0 o = e.c(mVar, i2).o();
            m0.b(str, f.m(aVar, 0.0f, customerCenterUIConstants.getContentUnavailableViewPaddingText-D9Ej5fM(), 0.0f, 0.0f, 13, (Object) null), e.a(mVar, i2).w(), 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (Qa.l) null, o, mVar, 48, 0, 65528);
            mVar.V(-1018767756);
            if (str2 != null) {
                Y0 c = e.c(mVar, i2).c();
                m0.b(str2, f.m(aVar, 0.0f, customerCenterUIConstants.getContentUnavailableViewPaddingText-D9Ej5fM(), 0.0f, 0.0f, 13, (Object) null), e.a(mVar, i2).w(), 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, j.h(j.b.a()), 0L, 0, false, 0, 0, (Qa.l) null, c, mVar, 48, 0, 65016);
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
        final /* synthetic */ int $$default;
        final /* synthetic */ String $description;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, String str2, androidx.compose.ui.e eVar, int i, int i2) {
            super(2);
            this.$title = str;
            this.$description = str2;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            NoActiveUserManagementViewKt.access$ContentUnavailableView(this.$title, this.$description, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ String $contactEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ Offering $offering;
        final /* synthetic */ Qa.l $onAction;
        final /* synthetic */ CustomerCenterConfigData.Screen $screen;
        final /* synthetic */ CustomerCenterConfigData.Support.SupportTickets $supportTickets;
        final /* synthetic */ VirtualCurrencies $virtualCurrencies;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterConfigData.Screen screen, String str, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, CustomerCenterConfigData.Support.SupportTickets supportTickets, Offering offering, VirtualCurrencies virtualCurrencies, Qa.l lVar, int i, int i2) {
            super(2);
            this.$screen = screen;
            this.$contactEmail = str;
            this.$appearance = appearance;
            this.$localization = localization;
            this.$supportTickets = supportTickets;
            this.$offering = offering;
            this.$virtualCurrencies = virtualCurrencies;
            this.$onAction = lVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            NoActiveUserManagementViewKt.NoActiveUserManagementView(this.$screen, this.$contactEmail, this.$appearance, this.$localization, this.$supportTickets, this.$offering, this.$virtualCurrencies, this.$onAction, mVar, g1.a(this.$$changed | 1), this.$$default);
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
                w.U(403847802, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementView_Preview.<anonymous> (NoActiveUserManagementView.kt:162)");
            }
            androidx.compose.ui.e d = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.g.f(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), E.a.a(mVar, E.b).c(), (E1) null, 2, (Object) null);
            CustomerCenterConfigData.Screen screen = this.$noActiveScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            B h = F.f.h(o0.e.a.o(), false);
            int a = h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, d);
            g.a aVar = O0.g.E8;
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
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            NoActiveUserManagementViewKt.NoActiveUserManagementView(screen, "support@example.com", CustomerCenterConfigTestData.INSTANCE.getStandardAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), null, null, NoActiveUserManagementViewKt$NoActiveUserManagementView_Preview$1$1$1.INSTANCE, mVar, 12779568, 64);
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
            NoActiveUserManagementViewKt.access$NoActiveUserManagementView_Preview(mVar, g1.a(this.$$changed | 1));
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
                w.U(-793311143, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementView_WithVCs_Preview.<anonymous> (NoActiveUserManagementView.kt:194)");
            }
            androidx.compose.ui.e d = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.g.f(androidx.compose.ui.e.a, 0.0f, 1, (Object) null), E.a.a(mVar, E.b).c(), (E1) null, 2, (Object) null);
            CustomerCenterConfigData.Screen screen = this.$noActiveScreen;
            CustomerCenterConfigData customerCenterConfigData = this.$testData;
            B h = F.f.h(o0.e.a.o(), false);
            int a = h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, d);
            g.a aVar = O0.g.E8;
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
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            NoActiveUserManagementViewKt.NoActiveUserManagementView(screen, "support@example.com", customerCenterConfigTestData.getStandardAppearance(), customerCenterConfigData.getLocalization(), customerCenterConfigData.getSupport().getSupportTickets(), null, customerCenterConfigTestData.getFiveVirtualCurrencies(), NoActiveUserManagementViewKt$NoActiveUserManagementView_WithVCs_Preview$1$1$1.INSTANCE, mVar, 12779568, 0);
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
            NoActiveUserManagementViewKt.access$NoActiveUserManagementView_WithVCs_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void ContentUnavailableView(java.lang.String r20, java.lang.String r21, androidx.compose.ui.e r22, b0.m r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt.ContentUnavailableView(java.lang.String, java.lang.String, androidx.compose.ui.e, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void NoActiveUserManagementView(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen r34, java.lang.String r35, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r36, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r37, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets r38, com.revenuecat.purchases.Offering r39, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies r40, Qa.l r41, b0.m r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementViewKt.NoActiveUserManagementView(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen, java.lang.String, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Support$SupportTickets, com.revenuecat.purchases.Offering, com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies, Qa.l, b0.m, int, int):void");
    }

    private static final void NoActiveUserManagementView_Preview(m mVar, int i) {
        m i2 = mVar.i(109169625);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(109169625, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementView_Preview (NoActiveUserManagementView.kt:157)");
            }
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(403847802, true, new 1((CustomerCenterConfigData.Screen) obj, customerCenterData$default), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void NoActiveUserManagementView_WithVCs_Preview(m mVar, int i) {
        m i2 = mVar.i(-1469396296);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1469396296, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.NoActiveUserManagementView_WithVCs_Preview (NoActiveUserManagementView.kt:189)");
            }
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(-793311143, true, new 1((CustomerCenterConfigData.Screen) obj, customerCenterData$default), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$ContentUnavailableView(String str, String str2, androidx.compose.ui.e eVar, m mVar, int i, int i2) {
        ContentUnavailableView(str, str2, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$NoActiveUserManagementView_Preview(m mVar, int i) {
        NoActiveUserManagementView_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$NoActiveUserManagementView_WithVCs_Preview(m mVar, int i) {
        NoActiveUserManagementView_WithVCs_Preview(mVar, i);
    }
}
