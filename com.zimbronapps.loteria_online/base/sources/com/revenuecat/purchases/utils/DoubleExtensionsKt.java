package com.revenuecat.purchases.utils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DoubleExtensionsKt {
    private static final double DECIMAL_BASE = 10.0d;

    public static final double roundToDecimalPlaces(double d, int i) {
        double pow = Math.pow(10.0d, i);
        return Math.floor(d * pow) / pow;
    }
}
