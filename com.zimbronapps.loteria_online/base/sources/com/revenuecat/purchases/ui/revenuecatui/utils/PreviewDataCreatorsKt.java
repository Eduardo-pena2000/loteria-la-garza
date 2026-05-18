package com.revenuecat.purchases.ui.revenuecatui.utils;

import Da.u;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.InstallmentsInfo;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class PreviewDataCreatorsKt {

    public static final class 1 implements SubscriptionOption {
        final /* synthetic */ String $id;
        final /* synthetic */ InstallmentsInfo $installmentsInfo;
        final /* synthetic */ PresentedOfferingContext $presentedOfferingContext;
        final /* synthetic */ List $pricingPhases;
        final /* synthetic */ String $productId;

        public 1(String str, List list, PresentedOfferingContext presentedOfferingContext, String str2, InstallmentsInfo installmentsInfo) {
            this.$id = str;
            this.$pricingPhases = list;
            this.$presentedOfferingContext = presentedOfferingContext;
            this.$productId = str2;
            this.$installmentsInfo = installmentsInfo;
        }

        public String getId() {
            return this.$id;
        }

        public InstallmentsInfo getInstallmentsInfo() {
            return this.$installmentsInfo;
        }

        public PresentedOfferingContext getPresentedOfferingContext() {
            return this.$presentedOfferingContext;
        }

        public String getPresentedOfferingIdentifier() {
            PresentedOfferingContext presentedOfferingContext = this.$presentedOfferingContext;
            if (presentedOfferingContext != null) {
                return presentedOfferingContext.getOfferingIdentifier();
            }
            return null;
        }

        public List getPricingPhases() {
            return this.$pricingPhases;
        }

        public PurchasingData getPurchasingData() {
            return new PreviewPurchasingData(this.$productId);
        }

        public List getTags() {
            return u.e("tag");
        }
    }

    public static final /* synthetic */ PricingPhase previewPricingPhase(Period billingPeriod, String priceCurrencyCodeValue, double d, int i, Integer num) {
        String sb;
        t.g(billingPeriod, "billingPeriod");
        t.g(priceCurrencyCodeValue, "priceCurrencyCodeValue");
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(i));
        if (d == 0.0d) {
            sb = "Free";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('$');
            sb2.append(d);
            sb = sb2.toString();
        }
        return new PricingPhase(billingPeriod, recurrenceMode, num, new Price(sb, (long) (d * 1000000), priceCurrencyCodeValue));
    }

    public static /* synthetic */ PricingPhase previewPricingPhase$default(Period period, String str, double d, int i, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            period = new Period(1, Period.Unit.MONTH, "P1M");
        }
        if ((i2 & 2) != 0) {
            str = "USD";
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            d = 4.99d;
        }
        double d2 = d;
        int i3 = (i2 & 8) == 0 ? i : 1;
        if ((i2 & 16) != 0) {
            num = null;
        }
        return previewPricingPhase(period, str2, d2, i3, num);
    }

    public static final /* synthetic */ SubscriptionOption previewSubscriptionOption(String id, String productId, Period duration, List pricingPhases, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo) {
        t.g(id, "id");
        t.g(productId, "productId");
        t.g(duration, "duration");
        t.g(pricingPhases, "pricingPhases");
        return new 1(id, pricingPhases, presentedOfferingContext, productId, installmentsInfo);
    }

    public static /* synthetic */ SubscriptionOption previewSubscriptionOption$default(String str, String str2, Period period, List list, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo, int i, Object obj) {
        Period period2 = (i & 4) != 0 ? new Period(1, Period.Unit.MONTH, "P1M") : period;
        return previewSubscriptionOption(str, str2, period2, (i & 8) != 0 ? u.e(previewPricingPhase$default(period2, null, 0.0d, 0, null, 30, null)) : list, (i & 16) != 0 ? null : presentedOfferingContext, (i & 32) == 0 ? installmentsInfo : null);
    }
}
