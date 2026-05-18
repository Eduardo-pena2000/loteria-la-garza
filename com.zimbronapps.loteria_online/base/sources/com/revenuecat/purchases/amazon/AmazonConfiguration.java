package com.revenuecat.purchases.amazon;

import android.content.Context;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.Store;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class AmazonConfiguration extends PurchasesConfiguration {

    public static final class Builder extends PurchasesConfiguration.Builder {
        public Builder(Context context, String str) {
            super(context, str);
            store(Store.AMAZON);
        }
    }

    public AmazonConfiguration(Builder builder) {
        super(builder);
    }
}
