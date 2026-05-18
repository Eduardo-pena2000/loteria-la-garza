package com.revenuecat.purchases.hybridcommon.mappers;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
class PurchasesMath {
    public static int addExact(int i, int i2) {
        int i3 = i + i2;
        if (((i ^ i3) & (i2 ^ i3)) >= 0) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int multiplyExact(int i, int i2) {
        long j = i * i2;
        int i3 = (int) j;
        if (i3 == j) {
            return i3;
        }
        throw new ArithmeticException("integer overflow");
    }
}
