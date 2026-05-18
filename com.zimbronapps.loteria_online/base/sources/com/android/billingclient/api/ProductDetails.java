package com.android.billingclient.api;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class ProductDetails {
    public final String a;
    public final JSONObject b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final List j;
    public final List k;

    @zzj
    public static final class InstallmentPlanDetails {
        public final int a;
        public final int b;

        public InstallmentPlanDetails(JSONObject jSONObject) {
            this.a = jSONObject.getInt("commitmentPaymentsCount");
            this.b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
        }

        @zzj
        public int getInstallmentPlanCommitmentPaymentsCount() {
            return this.a;
        }

        @zzj
        public int getSubsequentInstallmentPlanCommitmentPaymentsCount() {
            return this.b;
        }
    }

    public static final class OneTimePurchaseOfferDetails {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final List g;
        public final Long h;
        public final DiscountDisplayInfo i;
        public final ValidTimeWindow j;
        public final LimitedQuantityInfo k;
        public final String l;
        public final RentalDetails m;
        public final zzcs n;

        @zzl
        public static final class DiscountDisplayInfo {
            public final Integer a;
            public final DiscountAmount b;

            @zzl
            public static final class DiscountAmount {
                public final String a;
                public final long b;
                public final String c;

                public DiscountAmount(JSONObject jSONObject) {
                    this.a = jSONObject.optString("formattedDiscountAmount");
                    this.b = jSONObject.optLong("discountAmountMicros");
                    this.c = jSONObject.optString("discountAmountCurrencyCode");
                }

                public String getDiscountAmountCurrencyCode() {
                    return this.c;
                }

                public long getDiscountAmountMicros() {
                    return this.b;
                }

                public String getFormattedDiscountAmount() {
                    return this.a;
                }
            }

            public DiscountDisplayInfo(JSONObject jSONObject) {
                this.a = jSONObject.has("percentageDiscount") ? Integer.valueOf(jSONObject.optInt("percentageDiscount")) : null;
                JSONObject optJSONObject = jSONObject.optJSONObject("discountAmount");
                this.b = optJSONObject != null ? new DiscountAmount(optJSONObject) : null;
            }

            @zzl
            public DiscountAmount getDiscountAmount() {
                return this.b;
            }

            @zzl
            public Integer getPercentageDiscount() {
                return this.a;
            }
        }

        @zzl
        public static final class LimitedQuantityInfo {
            public final int a;
            public final int b;

            public LimitedQuantityInfo(JSONObject jSONObject) {
                this.a = jSONObject.getInt("maximumQuantity");
                this.b = jSONObject.getInt("remainingQuantity");
            }

            @zzl
            public int getMaximumQuantity() {
                return this.a;
            }

            @zzl
            public int getRemainingQuantity() {
                return this.b;
            }
        }

        @zzm
        public static final class RentalDetails {
            public final String a;
            public final String b;

            public RentalDetails(JSONObject jSONObject) {
                this.a = jSONObject.getString("rentalPeriod");
                String optString = jSONObject.optString("rentalExpirationPeriod");
                this.b = true == optString.isEmpty() ? null : optString;
            }

            @zzm
            public String getRentalExpirationPeriod() {
                return this.b;
            }

            @zzm
            public String getRentalPeriod() {
                return this.a;
            }
        }

        @zzl
        public static final class ValidTimeWindow {
            public final Long a;
            public final Long b;

            public ValidTimeWindow(JSONObject jSONObject) {
                this.a = jSONObject.has("startTimeMillis") ? Long.valueOf(jSONObject.optLong("startTimeMillis")) : null;
                this.b = jSONObject.has("endTimeMillis") ? Long.valueOf(jSONObject.optLong("endTimeMillis")) : null;
            }

            @zzl
            public Long getEndTimeMillis() {
                return this.b;
            }

            @zzl
            public Long getStartTimeMillis() {
                return this.a;
            }
        }

        public OneTimePurchaseOfferDetails(JSONObject jSONObject) {
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.c = jSONObject.optString("priceCurrencyCode");
            String optString = jSONObject.optString("offerIdToken");
            this.d = true == optString.isEmpty() ? null : optString;
            String optString2 = jSONObject.optString("offerId");
            this.e = true == optString2.isEmpty() ? null : optString2;
            String optString3 = jSONObject.optString("purchaseOptionId");
            this.f = true == optString3.isEmpty() ? null : optString3;
            jSONObject.optInt("offerType");
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            this.g = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.g.add(optJSONArray.getString(i));
                }
            }
            this.h = jSONObject.has("fullPriceMicros") ? Long.valueOf(jSONObject.optLong("fullPriceMicros")) : null;
            JSONObject optJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
            this.i = optJSONObject == null ? null : new DiscountDisplayInfo(optJSONObject);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("validTimeWindow");
            this.j = optJSONObject2 == null ? null : new ValidTimeWindow(optJSONObject2);
            JSONObject optJSONObject3 = jSONObject.optJSONObject("limitedQuantityInfo");
            this.k = optJSONObject3 == null ? null : new LimitedQuantityInfo(optJSONObject3);
            this.l = jSONObject.optString("serializedDocid");
            JSONObject optJSONObject4 = jSONObject.optJSONObject("preorderDetails");
            if (optJSONObject4 != null) {
                optJSONObject4.getLong("preorderReleaseTimeMillis");
                optJSONObject4.getLong("preorderPresaleEndTimeMillis");
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("rentalDetails");
            this.m = optJSONObject5 == null ? null : new RentalDetails(optJSONObject5);
            JSONObject optJSONObject6 = jSONObject.optJSONObject("autoPayDetails");
            this.n = optJSONObject6 != null ? new zzcs(optJSONObject6) : null;
            JSONArray optJSONArray2 = jSONObject.optJSONArray("pricingPhases");
            if (optJSONArray2 == null) {
                return;
            }
            new PricingPhases(optJSONArray2);
        }

        public final String a() {
            return this.l;
        }

        @zzl
        public DiscountDisplayInfo getDiscountDisplayInfo() {
            return this.i;
        }

        public String getFormattedPrice() {
            return this.a;
        }

        @zzl
        public Long getFullPriceMicros() {
            return this.h;
        }

        @zzl
        public LimitedQuantityInfo getLimitedQuantityInfo() {
            return this.k;
        }

        @zzm
        @zzl
        public String getOfferId() {
            return this.e;
        }

        @zzl
        public List getOfferTags() {
            return this.g;
        }

        @zzm
        @zzl
        public String getOfferToken() {
            return this.d;
        }

        public long getPriceAmountMicros() {
            return this.b;
        }

        public String getPriceCurrencyCode() {
            return this.c;
        }

        @zzm
        public String getPurchaseOptionId() {
            return this.f;
        }

        @zzm
        public RentalDetails getRentalDetails() {
            return this.m;
        }

        @zzl
        public ValidTimeWindow getValidTimeWindow() {
            return this.j;
        }

        public final zzcs zza() {
            return this.n;
        }
    }

    public static final class PricingPhase {
        public final String a;
        public final long b;
        public final String c;
        public final String d;
        public final int e;
        public final int f;

        public PricingPhase(JSONObject jSONObject) {
            this.d = jSONObject.optString("billingPeriod");
            this.c = jSONObject.optString("priceCurrencyCode");
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f = jSONObject.optInt("recurrenceMode");
            this.e = jSONObject.optInt("billingCycleCount");
        }

        public int getBillingCycleCount() {
            return this.e;
        }

        public String getBillingPeriod() {
            return this.d;
        }

        public String getFormattedPrice() {
            return this.a;
        }

        public long getPriceAmountMicros() {
            return this.b;
        }

        public String getPriceCurrencyCode() {
            return this.c;
        }

        public int getRecurrenceMode() {
            return this.f;
        }
    }

    public static class PricingPhases {
        public final List a;

        public PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        arrayList.add(new PricingPhase(optJSONObject));
                    }
                }
            }
            this.a = arrayList;
        }

        public List getPricingPhaseList() {
            return this.a;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
        public static final int FINITE_RECURRING = 2;
        public static final int INFINITE_RECURRING = 1;
        public static final int NON_RECURRING = 3;
    }

    public static final class SubscriptionOfferDetails {
        public final String a;
        public final String b;
        public final String c;
        public final PricingPhases d;
        public final List e;
        public final InstallmentPlanDetails f;

        public SubscriptionOfferDetails(JSONObject jSONObject) {
            this.a = jSONObject.optString("basePlanId");
            String optString = jSONObject.optString("offerId");
            this.b = true == optString.isEmpty() ? null : optString;
            this.c = jSONObject.getString("offerIdToken");
            this.d = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.f = optJSONObject != null ? new InstallmentPlanDetails(optJSONObject) : null;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
            if (optJSONObject2 != null) {
                optJSONObject2.getString("productId");
                optJSONObject2.optString("title");
                optJSONObject2.optString("name");
                optJSONObject2.optString("description");
                optJSONObject2.optString("basePlanId");
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject("pricingPhase");
                if (optJSONObject3 != null) {
                    new PricingPhase(optJSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            this.e = arrayList;
        }

        public String getBasePlanId() {
            return this.a;
        }

        @zzj
        public InstallmentPlanDetails getInstallmentPlanDetails() {
            return this.f;
        }

        public String getOfferId() {
            return this.b;
        }

        public List getOfferTags() {
            return this.e;
        }

        public String getOfferToken() {
            return this.c;
        }

        public PricingPhases getPricingPhases() {
            return this.d;
        }
    }

    public ProductDetails(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = jSONObject.optString("title");
        this.f = jSONObject.optString("name");
        this.g = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.h = jSONObject.optString("skuDetailsToken");
        this.i = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new SubscriptionOfferDetails(optJSONArray.getJSONObject(i)));
            }
            this.j = arrayList;
        } else {
            this.j = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                arrayList2.add(new OneTimePurchaseOfferDetails(optJSONArray2.getJSONObject(i2)));
            }
            this.k = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.k = null;
        } else {
            arrayList2.add(new OneTimePurchaseOfferDetails(optJSONObject));
            this.k = arrayList2;
        }
    }

    public final String a() {
        return this.h;
    }

    public final List b() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.a, ((ProductDetails) obj).a);
        }
        return false;
    }

    public String getDescription() {
        return this.g;
    }

    public String getName() {
        return this.f;
    }

    public OneTimePurchaseOfferDetails getOneTimePurchaseOfferDetails() {
        List list = this.k;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (OneTimePurchaseOfferDetails) list.get(0);
    }

    @zzm
    @zzl
    public List getOneTimePurchaseOfferDetailsList() {
        return this.k;
    }

    public String getProductId() {
        return this.c;
    }

    public String getProductType() {
        return this.d;
    }

    public List getSubscriptionOfferDetails() {
        return this.j;
    }

    public String getTitle() {
        return this.e;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        List list = this.j;
        return "ProductDetails{jsonString='" + this.a + "', parsedJson=" + this.b.toString() + ", productId='" + this.c + "', productType='" + this.d + "', title='" + this.e + "', productDetailsToken='" + this.h + "', subscriptionOfferDetails=" + String.valueOf(list) + "}";
    }

    public final String zza() {
        return this.b.optString("packageName");
    }

    public String zzc() {
        return this.i;
    }
}
