package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class QueryPurchasesParams {
    public final String a;

    public static class Builder {
        public String a;

        public /* synthetic */ Builder(zzda zzdaVar) {
        }

        public static /* bridge */ /* synthetic */ String a(Builder builder) {
            return builder.a;
        }

        public QueryPurchasesParams build() {
            if (this.a != null) {
                return new QueryPurchasesParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchasesParams(Builder builder, zzda zzdaVar) {
        this.a = Builder.a(builder);
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public final String zza() {
        return this.a;
    }
}
