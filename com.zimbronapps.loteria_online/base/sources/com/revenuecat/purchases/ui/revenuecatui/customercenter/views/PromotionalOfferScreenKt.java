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
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData;
import com.revenuecat.purchases.ui.revenuecatui.utils.PreviewDataCreatorsKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class PromotionalOfferScreenKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ l $onAccept;
        final /* synthetic */ Qa.a $onDismiss;
        final /* synthetic */ PromotionalOfferData $promotionalOfferData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PromotionalOfferData promotionalOfferData, CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, l lVar, Qa.a aVar, e eVar, int i, int i2) {
            super(2);
            this.$promotionalOfferData = promotionalOfferData;
            this.$appearance = appearance;
            this.$localization = localization;
            this.$onAccept = lVar;
            this.$onDismiss = aVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PromotionalOfferScreenKt.PromotionalOfferScreen(this.$promotionalOfferData, this.$appearance, this.$localization, this.$onAccept, this.$onDismiss, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(SubscriptionOption it) {
            t.g(it, "it");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SubscriptionOption) obj);
            return I.a;
        }
    }

    public static final class 2 extends u implements Qa.a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
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
            PromotionalOfferScreenKt.PromotionalOfferViewPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void PromotionalOfferScreen(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData r46, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r47, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r48, Qa.l r49, Qa.a r50, androidx.compose.ui.e r51, b0.m r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferScreenKt.PromotionalOfferScreen(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PromotionalOfferData, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, Qa.l, Qa.a, androidx.compose.ui.e, b0.m, int, int):void");
    }

    public static final void PromotionalOfferViewPreview(m mVar, int i) {
        List<CustomerCenterConfigData.HelpPath> paths;
        m i2 = mVar.i(-552832253);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-552832253, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PromotionalOfferViewPreview (PromotionalOfferScreen.kt:109)");
            }
            CustomerCenterConfigData.Screen managementScreen = CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getManagementScreen();
            if (managementScreen != null && (paths = managementScreen.getPaths()) != null) {
                for (CustomerCenterConfigData.HelpPath helpPath : paths) {
                    if (helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.REFUND_REQUEST) {
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            helpPath = null;
            t.d(helpPath);
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer = helpPath.getPromotionalOffer();
            t.d(promotionalOffer);
            PromotionalOfferData promotionalOfferData = new PromotionalOfferData(promotionalOffer, PreviewDataCreatorsKt.previewSubscriptionOption$default("rc-cancel-offer", "monthly", null, null, null, null, 60, null), new CustomerCenterConfigData.HelpPath("1", "Check for previous purchases", CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (k) null), "1 month for $7.99, then $9.99/mth");
            CustomerCenterConfigTestData customerCenterConfigTestData = CustomerCenterConfigTestData.INSTANCE;
            PromotionalOfferScreen(promotionalOfferData, CustomerCenterConfigTestData.customerCenterData$default(customerCenterConfigTestData, false, false, 3, null).getAppearance(), CustomerCenterConfigTestData.customerCenterData$default(customerCenterConfigTestData, false, false, 3, null).getLocalization(), 1.INSTANCE, 2.INSTANCE, null, i2, 27648, 32);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 3(i));
        }
    }
}
