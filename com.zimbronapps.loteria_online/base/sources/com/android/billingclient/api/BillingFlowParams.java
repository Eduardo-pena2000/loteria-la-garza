package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.ProductDetails;
import com.google.android.gms.internal.play_billing.zzbg;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class BillingFlowParams {
    public boolean a;
    public String b;
    public String c;
    public SubscriptionUpdateParams d;
    public com.google.android.gms.internal.play_billing.zzbt e;
    public ArrayList f;
    public boolean g;

    public static class Builder {
        public String a;
        public String b;
        public List c;
        public ArrayList d;
        public boolean e;
        public SubscriptionUpdateParams.Builder f;

        public /* synthetic */ Builder(zzcf zzcfVar) {
            SubscriptionUpdateParams.Builder newBuilder = SubscriptionUpdateParams.newBuilder();
            SubscriptionUpdateParams.Builder.a(newBuilder);
            this.f = newBuilder;
        }

        public BillingFlowParams build() {
            ArrayList arrayList = this.d;
            boolean z = true;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.c;
            boolean z3 = (list == null || list.isEmpty()) ? false : true;
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z2 && z3) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            if (!z2) {
                List list2 = this.c;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((ProductDetailsParams) it.next()) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                }
            } else {
                if (this.d.contains((Object) null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.d.get(0);
                    String type = skuDetails.getType();
                    ArrayList arrayList2 = this.d;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList2.get(i);
                        if (!type.equals("play_pass_subs") && !skuDetails2.getType().equals("play_pass_subs") && !type.equals(skuDetails2.getType())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String zzd = skuDetails.zzd();
                    ArrayList arrayList3 = this.d;
                    int size2 = arrayList3.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList3.get(i2);
                        if (!type.equals("play_pass_subs") && !skuDetails3.getType().equals("play_pass_subs") && !zzd.equals(skuDetails3.zzd())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            BillingFlowParams billingFlowParams = new BillingFlowParams(null);
            if ((!z2 || ((SkuDetails) this.d.get(0)).zzd().isEmpty()) && (!z3 || ((ProductDetailsParams) this.c.get(0)).zza().zza().isEmpty())) {
                z = false;
            }
            BillingFlowParams.b(billingFlowParams, z);
            BillingFlowParams.d(billingFlowParams, this.a);
            BillingFlowParams.e(billingFlowParams, this.b);
            BillingFlowParams.h(billingFlowParams, this.f.build());
            ArrayList arrayList4 = this.d;
            BillingFlowParams.g(billingFlowParams, arrayList4 != null ? new ArrayList(arrayList4) : new ArrayList());
            BillingFlowParams.c(billingFlowParams, this.e);
            List list3 = this.c;
            BillingFlowParams.f(billingFlowParams, list3 != null ? com.google.android.gms.internal.play_billing.zzbt.zzj(list3) : com.google.android.gms.internal.play_billing.zzbt.zzk());
            return billingFlowParams;
        }

        public Builder setIsOfferPersonalized(boolean z) {
            this.e = z;
            return this;
        }

        public Builder setObfuscatedAccountId(String str) {
            this.a = str;
            return this;
        }

        public Builder setObfuscatedProfileId(String str) {
            this.b = str;
            return this;
        }

        public Builder setProductDetailsParamsList(List list) {
            this.c = new ArrayList(list);
            return this;
        }

        @Deprecated
        public Builder setSkuDetails(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.d = arrayList;
            return this;
        }

        public Builder setSubscriptionUpdateParams(SubscriptionUpdateParams subscriptionUpdateParams) {
            this.f = SubscriptionUpdateParams.b(subscriptionUpdateParams);
            return this;
        }
    }

    public static final class ProductDetailsParams {
        public final ProductDetails a;
        public final String b;

        public static class Builder {
            public ProductDetails a;
            public String b;

            public /* synthetic */ Builder(zzcf zzcfVar) {
            }

            public static /* bridge */ /* synthetic */ ProductDetails a(Builder builder) {
                return builder.a;
            }

            public static /* bridge */ /* synthetic */ String b(Builder builder) {
                return builder.b;
            }

            public ProductDetailsParams build() {
                zzbg.zzc(this.a, "ProductDetails is required for constructing ProductDetailsParams.");
                return new ProductDetailsParams(this, null);
            }

            public Builder setOfferToken(String str) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("offerToken can not be empty");
                }
                this.b = str;
                return this;
            }

            public Builder setProductDetails(ProductDetails productDetails) {
                this.a = productDetails;
                if (productDetails.getOneTimePurchaseOfferDetails() != null) {
                    productDetails.getOneTimePurchaseOfferDetails().getClass();
                    ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                    if (oneTimePurchaseOfferDetails.getOfferToken() != null) {
                        this.b = oneTimePurchaseOfferDetails.getOfferToken();
                    }
                }
                return this;
            }
        }

        public /* synthetic */ ProductDetailsParams(Builder builder, zzcf zzcfVar) {
            this.a = Builder.a(builder);
            this.b = Builder.b(builder);
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public final ProductDetails zza() {
            return this.a;
        }

        public final String zzb() {
            return this.b;
        }
    }

    public static class SubscriptionUpdateParams {
        public String a;
        public String b;
        public int c = 0;

        public static class Builder {
            public String a;
            public String b;
            public boolean c;
            public int d = 0;

            public /* synthetic */ Builder(zzcf zzcfVar) {
            }

            public static /* synthetic */ Builder a(Builder builder) {
                builder.c = true;
                return builder;
            }

            public SubscriptionUpdateParams build() {
                boolean z = true;
                if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty((CharSequence) null)) {
                    z = false;
                }
                boolean isEmpty = TextUtils.isEmpty(this.b);
                if (z && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.c && !z && isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                SubscriptionUpdateParams subscriptionUpdateParams = new SubscriptionUpdateParams(null);
                SubscriptionUpdateParams.e(subscriptionUpdateParams, this.a);
                SubscriptionUpdateParams.g(subscriptionUpdateParams, this.d);
                SubscriptionUpdateParams.f(subscriptionUpdateParams, this.b);
                return subscriptionUpdateParams;
            }

            public Builder setOldPurchaseToken(String str) {
                this.a = str;
                return this;
            }

            @zze
            public Builder setOriginalExternalTransactionId(String str) {
                this.b = str;
                return this;
            }

            public Builder setSubscriptionReplacementMode(int i) {
                this.d = i;
                return this;
            }

            @Deprecated
            public final Builder zzb(String str) {
                this.a = str;
                return this;
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface ReplacementMode {
            public static final int CHARGE_FULL_PRICE = 5;
            public static final int CHARGE_PRORATED_PRICE = 2;
            public static final int DEFERRED = 6;
            public static final int UNKNOWN_REPLACEMENT_MODE = 0;
            public static final int WITHOUT_PRORATION = 3;
            public static final int WITH_TIME_PRORATION = 1;
        }

        public /* synthetic */ SubscriptionUpdateParams(zzcf zzcfVar) {
        }

        public static /* bridge */ /* synthetic */ Builder b(SubscriptionUpdateParams subscriptionUpdateParams) {
            Builder newBuilder = newBuilder();
            newBuilder.zzb(subscriptionUpdateParams.a);
            newBuilder.setSubscriptionReplacementMode(subscriptionUpdateParams.c);
            newBuilder.setOriginalExternalTransactionId(subscriptionUpdateParams.b);
            return newBuilder;
        }

        public static /* bridge */ /* synthetic */ void e(SubscriptionUpdateParams subscriptionUpdateParams, String str) {
            subscriptionUpdateParams.a = str;
        }

        public static /* bridge */ /* synthetic */ void f(SubscriptionUpdateParams subscriptionUpdateParams, String str) {
            subscriptionUpdateParams.b = str;
        }

        public static /* bridge */ /* synthetic */ void g(SubscriptionUpdateParams subscriptionUpdateParams, int i) {
            subscriptionUpdateParams.c = i;
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public final int a() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }
    }

    public /* synthetic */ BillingFlowParams(zzcf zzcfVar) {
    }

    public static /* bridge */ /* synthetic */ void b(BillingFlowParams billingFlowParams, boolean z) {
        billingFlowParams.a = z;
    }

    public static /* bridge */ /* synthetic */ void c(BillingFlowParams billingFlowParams, boolean z) {
        billingFlowParams.g = z;
    }

    public static /* bridge */ /* synthetic */ void d(BillingFlowParams billingFlowParams, String str) {
        billingFlowParams.b = str;
    }

    public static /* bridge */ /* synthetic */ void e(BillingFlowParams billingFlowParams, String str) {
        billingFlowParams.c = str;
    }

    public static /* bridge */ /* synthetic */ void f(BillingFlowParams billingFlowParams, com.google.android.gms.internal.play_billing.zzbt zzbtVar) {
        billingFlowParams.e = zzbtVar;
    }

    public static /* bridge */ /* synthetic */ void g(BillingFlowParams billingFlowParams, ArrayList arrayList) {
        billingFlowParams.f = arrayList;
    }

    public static /* bridge */ /* synthetic */ void h(BillingFlowParams billingFlowParams, SubscriptionUpdateParams subscriptionUpdateParams) {
        billingFlowParams.d = subscriptionUpdateParams;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final BillingResult a() {
        ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails;
        if (this.e.isEmpty()) {
            return k.i;
        }
        ProductDetailsParams productDetailsParams = (ProductDetailsParams) this.e.get(0);
        for (int i = 1; i < this.e.size(); i++) {
            ProductDetailsParams productDetailsParams2 = (ProductDetailsParams) this.e.get(i);
            if (!productDetailsParams2.zza().getProductType().equals(productDetailsParams.zza().getProductType()) && !productDetailsParams2.zza().getProductType().equals("play_pass_subs")) {
                return k.a(5, "All products should have same ProductType.");
            }
        }
        String zza = productDetailsParams.zza().zza();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        com.google.android.gms.internal.play_billing.zzbt zzbtVar = this.e;
        int size = zzbtVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ProductDetailsParams productDetailsParams3 = (ProductDetailsParams) zzbtVar.get(i2);
            if (productDetailsParams3.zza().getSubscriptionOfferDetails() != null && productDetailsParams3.zzb() == null) {
                return k.a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", new Object[]{productDetailsParams3.zza().getProductId()}));
            }
            if (hashMap.containsKey(productDetailsParams3.zza().getProductId())) {
                return k.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", new Object[]{productDetailsParams3.zza().getProductId()}));
            }
            hashMap.put(productDetailsParams3.zza().getProductId(), productDetailsParams3);
            if (!productDetailsParams.zza().getProductType().equals("play_pass_subs") && !productDetailsParams3.zza().getProductType().equals("play_pass_subs") && !zza.equals(productDetailsParams3.zza().zza())) {
                return k.a(5, "All products must have the same package name.");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashMap.containsKey(str)) {
                return k.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", new Object[]{str}));
            }
        }
        List oneTimePurchaseOfferDetailsList = productDetailsParams.zza().getOneTimePurchaseOfferDetailsList();
        String zzb = productDetailsParams.zzb();
        if (zzb != null && oneTimePurchaseOfferDetailsList != null) {
            Iterator it2 = oneTimePurchaseOfferDetailsList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    oneTimePurchaseOfferDetails = null;
                    break;
                }
                oneTimePurchaseOfferDetails = (ProductDetails.OneTimePurchaseOfferDetails) it2.next();
                if (zzb.equals(oneTimePurchaseOfferDetails.getOfferToken())) {
                    break;
                }
            }
            if (oneTimePurchaseOfferDetails != null && oneTimePurchaseOfferDetails.zza() != null) {
                return k.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return k.i;
    }

    public final boolean i() {
        if (this.b != null || this.c != null || this.d.d() != null || this.d.a() != 0 || this.a || this.g) {
            return true;
        }
        com.google.android.gms.internal.play_billing.zzbt zzbtVar = this.e;
        if (zzbtVar != null) {
            int size = zzbtVar.size();
            for (int i = 0; i < size; i++) {
            }
        }
        return false;
    }

    public int zza() {
        return 0;
    }

    public final int zzb() {
        return this.d.a();
    }

    public long zzc() {
        return 0L;
    }

    public final String zze() {
        return this.b;
    }

    public final String zzf() {
        return this.c;
    }

    public String zzg() {
        return null;
    }

    public final String zzh() {
        return this.d.c();
    }

    public final String zzi() {
        return this.d.d();
    }

    public final ArrayList zzj() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f);
        return arrayList;
    }

    public final List zzk() {
        return this.e;
    }

    public final boolean zzs() {
        return this.g;
    }
}
