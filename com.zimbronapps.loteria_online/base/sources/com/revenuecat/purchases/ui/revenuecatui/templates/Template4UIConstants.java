package com.revenuecat.purchases.ui.revenuecatui.templates;

import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class Template4UIConstants {
    private static final float checkmarkPadding;
    private static final float discountVerticalPadding;
    public static final float maxPackagesToDisplay = 3.0f;
    private static final float packageButtonContentVerticalSpacing;
    private static final float packageHorizontalSpacing;
    public static final Template4UIConstants INSTANCE = new Template4UIConstants();
    private static final float packagesHorizontalPadding = h.g(24);
    private static final float checkmarkSize = h.g(18);

    static {
        float f = 4;
        packageButtonContentVerticalSpacing = h.g(f);
        float f2 = 8;
        packageHorizontalSpacing = h.g(f2);
        checkmarkPadding = h.g(f2);
        discountVerticalPadding = h.g(f);
    }

    private Template4UIConstants() {
    }

    public final float getCheckmarkPadding-D9Ej5fM() {
        return checkmarkPadding;
    }

    public final float getCheckmarkSize-D9Ej5fM() {
        return checkmarkSize;
    }

    public final float getDiscountVerticalPadding-D9Ej5fM() {
        return discountVerticalPadding;
    }

    public final float getPackageButtonContentVerticalSpacing-D9Ej5fM() {
        return packageButtonContentVerticalSpacing;
    }

    public final float getPackageHorizontalSpacing-D9Ej5fM() {
        return packageHorizontalSpacing;
    }

    public final float getPackagesHorizontalPadding-D9Ej5fM() {
        return packagesHorizontalPadding;
    }
}
