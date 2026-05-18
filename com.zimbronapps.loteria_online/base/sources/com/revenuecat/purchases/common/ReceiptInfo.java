package com.revenuecat.purchases.common;

import Da.v;
import Da.w;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.ReplacementModeSerializer;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.PeriodSerializer;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhaseSerializer;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import rb.d;
import sb.M;
import sb.Q;
import sb.e;
import sb.f0;
import sb.t0;
import sb.x0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ReceiptInfo {
    private static final ob.b[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final String currency;
    private final String duration;
    private final String formattedPrice;
    private final String marketplace;
    private final Period period;
    private final List platformProductIds;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Double price;
    private final List pricingPhases;
    private final List productIDs;
    private final Long purchaseTime;
    private final ReplacementMode replacementMode;
    private final boolean sdkOriginated;
    private final String storeUserID;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ ReceiptInfo from$default(Companion companion, StoreTransaction storeTransaction, StoreProduct storeProduct, Map map, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.from(storeTransaction, storeProduct, map, z);
        }

        public final ReceiptInfo from(StoreTransaction storeTransaction, StoreProduct storeProduct, Map map, boolean z) {
            SubscriptionOption subscriptionOption;
            PlatformProductId access$platformProductId;
            Price price;
            Price price2;
            Price price3;
            SubscriptionOption subscriptionOption2;
            PlatformProductId access$platformProductId2;
            Map asMap;
            SubscriptionOptions subscriptionOptions;
            Object obj;
            t.g(storeTransaction, "storeTransaction");
            if (storeProduct == null || (subscriptionOptions = storeProduct.getSubscriptionOptions()) == null) {
                subscriptionOption = null;
            } else {
                Iterator it = subscriptionOptions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (t.c(((SubscriptionOption) obj).getId(), storeTransaction.getSubscriptionOptionId())) {
                        break;
                    }
                }
                subscriptionOption = (SubscriptionOption) obj;
            }
            if (subscriptionOption == null || (access$platformProductId = ReceiptInfoKt.access$platformProductId(subscriptionOption)) == null) {
                access$platformProductId = storeProduct != null ? ReceiptInfoKt.access$platformProductId(storeProduct) : null;
            }
            List<String> productIds = storeTransaction.getProductIds();
            ArrayList arrayList = new ArrayList(w.y(productIds, 10));
            for (String str : productIds) {
                arrayList.add(t.c(str, access$platformProductId != null ? access$platformProductId.getProductId() : null) ? access$platformProductId.getAsMap() : (map == null || (subscriptionOption2 = (SubscriptionOption) map.get(str)) == null || (access$platformProductId2 = ReceiptInfoKt.access$platformProductId(subscriptionOption2)) == null || (asMap = access$platformProductId2.getAsMap()) == null) ? new PlatformProductId(str).getAsMap() : asMap);
            }
            return new ReceiptInfo(storeTransaction.getProductIds(), Long.valueOf(storeTransaction.getPurchaseTime()), storeTransaction.getPresentedOfferingContext(), (storeProduct == null || (price3 = storeProduct.getPrice()) == null) ? null : Double.valueOf(price3.getAmountMicros() / 1000000.0d), (storeProduct == null || (price2 = storeProduct.getPrice()) == null) ? null : price2.getFormatted(), (storeProduct == null || (price = storeProduct.getPrice()) == null) ? null : price.getCurrencyCode(), storeProduct != null ? storeProduct.getPeriod() : null, subscriptionOption != null ? subscriptionOption.getPricingPhases() : null, storeTransaction.getReplacementMode(), arrayList, z, storeTransaction.getStoreUserID(), storeTransaction.getMarketplace());
        }

        public final ob.b serializer() {
            return ReceiptInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        x0 x0Var = x0.a;
        $childSerializers = new ob.b[]{new e(x0Var), null, null, null, null, null, null, new e(PricingPhaseSerializer.INSTANCE), null, new e(new M(x0Var, pb.a.p(x0Var))), null, null, null, null};
    }

    @Ca.e
    public /* synthetic */ ReceiptInfo(int i, List list, Long l, PresentedOfferingContext presentedOfferingContext, Double d, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z, String str3, String str4, String str5, t0 t0Var) {
        String iso8601;
        if (1 != (i & 1)) {
            f0.a(i, 1, ReceiptInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.productIDs = list;
        String str6 = null;
        if ((i & 2) == 0) {
            this.purchaseTime = null;
        } else {
            this.purchaseTime = l;
        }
        if ((i & 4) == 0) {
            this.presentedOfferingContext = null;
        } else {
            this.presentedOfferingContext = presentedOfferingContext;
        }
        if ((i & 8) == 0) {
            this.price = null;
        } else {
            this.price = d;
        }
        if ((i & 16) == 0) {
            this.formattedPrice = null;
        } else {
            this.formattedPrice = str;
        }
        if ((i & 32) == 0) {
            this.currency = null;
        } else {
            this.currency = str2;
        }
        if ((i & 64) == 0) {
            this.period = null;
        } else {
            this.period = period;
        }
        if ((i & 128) == 0) {
            this.pricingPhases = null;
        } else {
            this.pricingPhases = list2;
        }
        if ((i & 256) == 0) {
            this.replacementMode = null;
        } else {
            this.replacementMode = replacementMode;
        }
        this.platformProductIds = (i & 512) == 0 ? v.n() : list3;
        this.sdkOriginated = (i & 1024) == 0 ? false : z;
        if ((i & 2048) == 0) {
            this.storeUserID = null;
        } else {
            this.storeUserID = str3;
        }
        if ((i & 4096) == 0) {
            this.marketplace = null;
        } else {
            this.marketplace = str4;
        }
        if ((i & 8192) != 0) {
            this.duration = str5;
            return;
        }
        Period period2 = this.period;
        if (period2 != null && (iso8601 = period2.getIso8601()) != null && iso8601.length() != 0) {
            str6 = iso8601;
        }
        this.duration = str6;
    }

    public static final /* synthetic */ ob.b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ ReceiptInfo copy$default(ReceiptInfo receiptInfo, List list, Long l, PresentedOfferingContext presentedOfferingContext, Double d, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z, String str3, String str4, int i, Object obj) {
        return receiptInfo.copy((i & 1) != 0 ? receiptInfo.productIDs : list, (i & 2) != 0 ? receiptInfo.purchaseTime : l, (i & 4) != 0 ? receiptInfo.presentedOfferingContext : presentedOfferingContext, (i & 8) != 0 ? receiptInfo.price : d, (i & 16) != 0 ? receiptInfo.formattedPrice : str, (i & 32) != 0 ? receiptInfo.currency : str2, (i & 64) != 0 ? receiptInfo.period : period, (i & 128) != 0 ? receiptInfo.pricingPhases : list2, (i & 256) != 0 ? receiptInfo.replacementMode : replacementMode, (i & 512) != 0 ? receiptInfo.platformProductIds : list3, (i & 1024) != 0 ? receiptInfo.sdkOriginated : z, (i & 2048) != 0 ? receiptInfo.storeUserID : str3, (i & 4096) != 0 ? receiptInfo.marketplace : str4);
    }

    public static /* synthetic */ void getDuration$annotations() {
    }

    public static /* synthetic */ void getPeriod$annotations() {
    }

    public static /* synthetic */ void getPresentedOfferingContext$annotations() {
    }

    public static /* synthetic */ void getReplacementMode$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ReceiptInfo receiptInfo, d dVar, qb.e eVar) {
        String iso8601;
        ob.k[] kVarArr = $childSerializers;
        dVar.k(eVar, 0, kVarArr[0], receiptInfo.productIDs);
        if (dVar.e(eVar, 1) || receiptInfo.purchaseTime != null) {
            dVar.j(eVar, 1, Q.a, receiptInfo.purchaseTime);
        }
        if (dVar.e(eVar, 2) || receiptInfo.presentedOfferingContext != null) {
            dVar.j(eVar, 2, PresentedOfferingContextSerializer.INSTANCE, receiptInfo.presentedOfferingContext);
        }
        if (dVar.e(eVar, 3) || receiptInfo.price != null) {
            dVar.j(eVar, 3, sb.t.a, receiptInfo.price);
        }
        if (dVar.e(eVar, 4) || receiptInfo.formattedPrice != null) {
            dVar.j(eVar, 4, x0.a, receiptInfo.formattedPrice);
        }
        if (dVar.e(eVar, 5) || receiptInfo.currency != null) {
            dVar.j(eVar, 5, x0.a, receiptInfo.currency);
        }
        if (dVar.e(eVar, 6) || receiptInfo.period != null) {
            dVar.j(eVar, 6, PeriodSerializer.INSTANCE, receiptInfo.period);
        }
        if (dVar.e(eVar, 7) || receiptInfo.pricingPhases != null) {
            dVar.j(eVar, 7, kVarArr[7], receiptInfo.pricingPhases);
        }
        if (dVar.e(eVar, 8) || receiptInfo.replacementMode != null) {
            dVar.j(eVar, 8, ReplacementModeSerializer.INSTANCE, receiptInfo.replacementMode);
        }
        if (dVar.e(eVar, 9) || !t.c(receiptInfo.platformProductIds, v.n())) {
            dVar.k(eVar, 9, kVarArr[9], receiptInfo.platformProductIds);
        }
        if (dVar.e(eVar, 10) || receiptInfo.sdkOriginated) {
            dVar.B(eVar, 10, receiptInfo.sdkOriginated);
        }
        if (dVar.e(eVar, 11) || receiptInfo.storeUserID != null) {
            dVar.j(eVar, 11, x0.a, receiptInfo.storeUserID);
        }
        if (dVar.e(eVar, 12) || receiptInfo.marketplace != null) {
            dVar.j(eVar, 12, x0.a, receiptInfo.marketplace);
        }
        if (!dVar.e(eVar, 13)) {
            String str = receiptInfo.duration;
            Period period = receiptInfo.period;
            String str2 = null;
            if (period != null && (iso8601 = period.getIso8601()) != null && iso8601.length() != 0) {
                str2 = iso8601;
            }
            if (t.c(str, str2)) {
                return;
            }
        }
        dVar.j(eVar, 13, x0.a, receiptInfo.duration);
    }

    public final List component1() {
        return this.productIDs;
    }

    public final List component10() {
        return this.platformProductIds;
    }

    public final boolean component11() {
        return this.sdkOriginated;
    }

    public final String component12() {
        return this.storeUserID;
    }

    public final String component13() {
        return this.marketplace;
    }

    public final Long component2() {
        return this.purchaseTime;
    }

    public final PresentedOfferingContext component3() {
        return this.presentedOfferingContext;
    }

    public final Double component4() {
        return this.price;
    }

    public final String component5() {
        return this.formattedPrice;
    }

    public final String component6() {
        return this.currency;
    }

    public final Period component7() {
        return this.period;
    }

    public final List component8() {
        return this.pricingPhases;
    }

    public final ReplacementMode component9() {
        return this.replacementMode;
    }

    public final ReceiptInfo copy(List list, Long l, PresentedOfferingContext presentedOfferingContext, Double d, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z, String str3, String str4) {
        t.g(list, "productIDs");
        t.g(list3, "platformProductIds");
        return new ReceiptInfo(list, l, presentedOfferingContext, d, str, str2, period, list2, replacementMode, list3, z, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReceiptInfo)) {
            return false;
        }
        ReceiptInfo receiptInfo = (ReceiptInfo) obj;
        return t.c(this.productIDs, receiptInfo.productIDs) && t.c(this.purchaseTime, receiptInfo.purchaseTime) && t.c(this.presentedOfferingContext, receiptInfo.presentedOfferingContext) && t.c(this.price, receiptInfo.price) && t.c(this.formattedPrice, receiptInfo.formattedPrice) && t.c(this.currency, receiptInfo.currency) && t.c(this.period, receiptInfo.period) && t.c(this.pricingPhases, receiptInfo.pricingPhases) && t.c(this.replacementMode, receiptInfo.replacementMode) && t.c(this.platformProductIds, receiptInfo.platformProductIds) && this.sdkOriginated == receiptInfo.sdkOriginated && t.c(this.storeUserID, receiptInfo.storeUserID) && t.c(this.marketplace, receiptInfo.marketplace);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getFormattedPrice() {
        return this.formattedPrice;
    }

    public final String getMarketplace() {
        return this.marketplace;
    }

    public final Period getPeriod() {
        return this.period;
    }

    public final List getPlatformProductIds() {
        return this.platformProductIds;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final List getPricingPhases() {
        return this.pricingPhases;
    }

    public final List getProductIDs() {
        return this.productIDs;
    }

    public final Long getPurchaseTime() {
        return this.purchaseTime;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final boolean getSdkOriginated() {
        return this.sdkOriginated;
    }

    public final String getStoreUserID() {
        return this.storeUserID;
    }

    public int hashCode() {
        int hashCode = this.productIDs.hashCode() * 31;
        Long l = this.purchaseTime;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int hashCode3 = (hashCode2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        Double d = this.price;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.formattedPrice;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currency;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Period period = this.period;
        int hashCode7 = (hashCode6 + (period == null ? 0 : period.hashCode())) * 31;
        List list = this.pricingPhases;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        ReplacementMode replacementMode = this.replacementMode;
        int hashCode9 = (((((hashCode8 + (replacementMode == null ? 0 : replacementMode.hashCode())) * 31) + this.platformProductIds.hashCode()) * 31) + Boolean.hashCode(this.sdkOriginated)) * 31;
        String str3 = this.storeUserID;
        int hashCode10 = (hashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.marketplace;
        return hashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "ReceiptInfo(productIDs=" + this.productIDs + ", purchaseTime=" + this.purchaseTime + ", presentedOfferingContext=" + this.presentedOfferingContext + ", price=" + this.price + ", formattedPrice=" + this.formattedPrice + ", currency=" + this.currency + ", period=" + this.period + ", pricingPhases=" + this.pricingPhases + ", replacementMode=" + this.replacementMode + ", platformProductIds=" + this.platformProductIds + ", sdkOriginated=" + this.sdkOriginated + ", storeUserID=" + this.storeUserID + ", marketplace=" + this.marketplace + ')';
    }

    public ReceiptInfo(List list, Long l, PresentedOfferingContext presentedOfferingContext, Double d, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z, String str3, String str4) {
        String iso8601;
        t.g(list, "productIDs");
        t.g(list3, "platformProductIds");
        this.productIDs = list;
        this.purchaseTime = l;
        this.presentedOfferingContext = presentedOfferingContext;
        this.price = d;
        this.formattedPrice = str;
        this.currency = str2;
        this.period = period;
        this.pricingPhases = list2;
        this.replacementMode = replacementMode;
        this.platformProductIds = list3;
        this.sdkOriginated = z;
        this.storeUserID = str3;
        this.marketplace = str4;
        String str5 = null;
        if (period != null && (iso8601 = period.getIso8601()) != null && iso8601.length() != 0) {
            str5 = iso8601;
        }
        this.duration = str5;
    }

    public /* synthetic */ ReceiptInfo(List list, Long l, PresentedOfferingContext presentedOfferingContext, Double d, String str, String str2, Period period, List list2, ReplacementMode replacementMode, List list3, boolean z, String str3, String str4, int i, k kVar) {
        this(list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : presentedOfferingContext, (i & 8) != 0 ? null : d, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : period, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : replacementMode, (i & 512) != 0 ? v.n() : list3, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? null : str3, (i & 4096) == 0 ? str4 : null);
    }
}
