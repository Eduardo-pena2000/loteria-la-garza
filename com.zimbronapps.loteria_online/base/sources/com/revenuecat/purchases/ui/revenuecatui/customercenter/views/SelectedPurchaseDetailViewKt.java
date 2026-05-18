package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import Qa.p;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SelectedPurchaseDetailViewKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ String $contactEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ l $onAction;
        final /* synthetic */ PurchaseInformation $purchaseInformation;
        final /* synthetic */ List $supportedPaths;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str, CustomerCenterConfigData.Localization localization, PurchaseInformation purchaseInformation, List list, e eVar, l lVar, int i, int i2) {
            super(2);
            this.$contactEmail = str;
            this.$localization = localization;
            this.$purchaseInformation = purchaseInformation;
            this.$supportedPaths = list;
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
            SelectedPurchaseDetailViewKt.SelectedPurchaseDetailView(this.$contactEmail, this.$localization, this.$purchaseInformation, this.$supportedPaths, this.$modifier, this.$onAction, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Screen $managementScreen;
        final /* synthetic */ PurchaseInformation $purchaseInfo;
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
        public 1(CustomerCenterConfigData customerCenterConfigData, PurchaseInformation purchaseInformation, CustomerCenterConfigData.Screen screen) {
            super(2);
            this.$testData = customerCenterConfigData;
            this.$purchaseInfo = purchaseInformation;
            this.$managementScreen = screen;
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
                w.U(1713352777, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewPreview.<anonymous> (SelectedPurchaseDetailView.kt:72)");
            }
            SelectedPurchaseDetailViewKt.SelectedPurchaseDetailView(this.$testData.getSupport().getEmail(), this.$testData.getLocalization(), this.$purchaseInfo, this.$managementScreen.getPaths(), null, 1.INSTANCE, mVar, 196608, 16);
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
            SelectedPurchaseDetailViewKt.access$SelectedPurchaseDetailViewPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SelectedPurchaseDetailView(java.lang.String r30, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r31, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r32, java.util.List r33, androidx.compose.ui.e r34, Qa.l r35, b0.m r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewKt.SelectedPurchaseDetailView(java.lang.String, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation, java.util.List, androidx.compose.ui.e, Qa.l, b0.m, int, int):void");
    }

    private static final void SelectedPurchaseDetailViewPreview(m mVar, int i) {
        m i2 = mVar.i(-1898383606);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1898383606, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SelectedPurchaseDetailViewPreview (SelectedPurchaseDetailView.kt:67)");
            }
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            CustomerCenterConfigData customerCenterData$default = CustomerCenterConfigTestData.customerCenterData$default(customerCenterConfigTestData, false, false, 3, null);
            Object obj = customerCenterData$default.getScreens().get(CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT);
            t.d(obj);
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(1713352777, true, new 1(customerCenterData$default, customerCenterConfigTestData.getPurchaseInformationMonthlyRenewing(), (CustomerCenterConfigData.Screen) obj), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$SelectedPurchaseDetailViewPreview(m mVar, int i) {
        SelectedPurchaseDetailViewPreview(mVar, i);
    }
}
