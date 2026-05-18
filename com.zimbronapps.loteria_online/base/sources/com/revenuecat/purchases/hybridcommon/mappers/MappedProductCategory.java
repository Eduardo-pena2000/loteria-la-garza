package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.o;
import com.revenuecat.purchases.ProductType;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum MappedProductCategory {
    SUBSCRIPTION("SUBSCRIPTION"),
    NON_SUBSCRIPTION("NON_SUBSCRIPTION"),
    UNKNOWN("UNKNOWN");

    private final String value;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MappedProductCategory.values().length];
            try {
                iArr[MappedProductCategory.NON_SUBSCRIPTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MappedProductCategory.SUBSCRIPTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MappedProductCategory.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    MappedProductCategory(String str) {
        this.value = str;
    }

    public final ProductType getToProductType() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return ProductType.INAPP;
        }
        if (i == 2) {
            return ProductType.SUBS;
        }
        if (i == 3) {
            return ProductType.UNKNOWN;
        }
        throw new o();
    }

    public final String getValue() {
        return this.value;
    }
}
