package com.android.billingclient.api;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class QueryPurchaseHistoryParams {

    public static class Builder {
        public String a;

        public /* synthetic */ Builder(zzcz zzczVar) {
        }

        public QueryPurchaseHistoryParams build() {
            if (this.a != null) {
                return new QueryPurchaseHistoryParams(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public Builder setProductType(String str) {
            this.a = str;
            return this;
        }
    }

    public /* synthetic */ QueryPurchaseHistoryParams(Builder builder, zzcz zzczVar) {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }
}
