package com.android.billingclient.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class QueryProductDetailsParams {
    public final com.google.android.gms.internal.play_billing.zzbt a;

    public static class Builder {
        public com.google.android.gms.internal.play_billing.zzbt a;

        public /* synthetic */ Builder(zzcy zzcyVar) {
        }

        public static /* bridge */ /* synthetic */ com.google.android.gms.internal.play_billing.zzbt a(Builder builder) {
            return builder.a;
        }

        public QueryProductDetailsParams build() {
            if (this.a != null) {
                return new QueryProductDetailsParams(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public Builder setProductList(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Product product = (Product) it.next();
                if (!"play_pass_subs".equals(product.zzb())) {
                    hashSet.add(product.zzb());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.a = com.google.android.gms.internal.play_billing.zzbt.zzj(list);
            return this;
        }
    }

    public static class Product {
        public final String a;
        public final String b;

        public static class Builder {
            public String a;
            public String b;

            public /* synthetic */ Builder(zzcy zzcyVar) {
            }

            public static /* bridge */ /* synthetic */ String a(Builder builder) {
                return builder.a;
            }

            public static /* bridge */ /* synthetic */ String b(Builder builder) {
                return builder.b;
            }

            public Product build() {
                if ("first_party".equals(this.b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.b != null) {
                    return new Product(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public Builder setProductId(String str) {
                this.a = str;
                return this;
            }

            public Builder setProductType(String str) {
                this.b = str;
                return this;
            }
        }

        public /* synthetic */ Product(Builder builder, zzcy zzcyVar) {
            this.a = Builder.a(builder);
            this.b = Builder.b(builder);
        }

        public static Builder newBuilder() {
            return new Builder(null);
        }

        public final String zza() {
            return this.a;
        }

        public final String zzb() {
            return this.b;
        }
    }

    public /* synthetic */ QueryProductDetailsParams(Builder builder, zzcy zzcyVar) {
        this.a = Builder.a(builder);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final com.google.android.gms.internal.play_billing.zzbt zza() {
        return this.a;
    }

    public final String zzb() {
        return ((Product) this.a.get(0)).zzb();
    }
}
