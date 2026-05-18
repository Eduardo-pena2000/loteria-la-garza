package com.revenuecat.purchases.amazon;

import Ca.o;
import com.amazon.device.iap.model.ProductType;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ProductTypeConversionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.ENTITLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.revenuecat.purchases.ProductType toRevenueCatProductType(ProductType productType) {
        t.g(productType, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i == 1) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (i == 2) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (i == 3) {
            return com.revenuecat.purchases.ProductType.SUBS;
        }
        throw new o();
    }
}
