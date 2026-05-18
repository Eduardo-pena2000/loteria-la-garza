package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class SkuDetailsParams {
    public String a;
    public List b;

    public static class Builder {
        public String a;
        public List b;

        public /* synthetic */ Builder(zzdb zzdbVar) {
        }

        public SkuDetailsParams build() {
            String str = this.a;
            if (str == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.b == null) {
                throw new IllegalArgumentException("SKU list must be set");
            }
            SkuDetailsParams skuDetailsParams = new SkuDetailsParams();
            SkuDetailsParams.a(skuDetailsParams, str);
            SkuDetailsParams.b(skuDetailsParams, this.b);
            return skuDetailsParams;
        }

        public Builder setSkusList(List list) {
            this.b = new ArrayList(list);
            return this;
        }

        public Builder setType(String str) {
            this.a = str;
            return this;
        }
    }

    public static /* bridge */ /* synthetic */ void a(SkuDetailsParams skuDetailsParams, String str) {
        skuDetailsParams.a = str;
    }

    public static /* bridge */ /* synthetic */ void b(SkuDetailsParams skuDetailsParams, List list) {
        skuDetailsParams.b = list;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getSkuType() {
        return this.a;
    }

    public List getSkusList() {
        return this.b;
    }
}
