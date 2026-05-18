package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import Qa.p;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import java.util.List;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ManageSubscriptionsButtonsViewKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $addContactButton;
        final /* synthetic */ boolean $addCreateTicketButton;
        final /* synthetic */ PurchaseInformation $associatedPurchaseInformation;
        final /* synthetic */ String $contactEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ l $onAction;
        final /* synthetic */ List $supportedPaths;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PurchaseInformation purchaseInformation, List list, CustomerCenterConfigData.Localization localization, String str, boolean z, boolean z2, l lVar, int i, int i2) {
            super(2);
            this.$associatedPurchaseInformation = purchaseInformation;
            this.$supportedPaths = list;
            this.$localization = localization;
            this.$contactEmail = str;
            this.$addContactButton = z;
            this.$addCreateTicketButton = z2;
            this.$onAction = lVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            ManageSubscriptionsButtonsViewKt.ManageSubscriptionsButtonsView(this.$associatedPurchaseInformation, this.$supportedPaths, this.$localization, this.$contactEmail, this.$addContactButton, this.$addCreateTicketButton, this.$onAction, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ManageSubscriptionsButtonsView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r27, java.util.List r28, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r29, java.lang.String r30, boolean r31, boolean r32, Qa.l r33, b0.m r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ManageSubscriptionsButtonsViewKt.ManageSubscriptionsButtonsView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation, java.util.List, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, java.lang.String, boolean, boolean, Qa.l, b0.m, int, int):void");
    }
}
