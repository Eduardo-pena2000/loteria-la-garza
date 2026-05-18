package com.revenuecat.purchases.ui.revenuecatui.helpers;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TestTag {
    public static final int $stable = 0;
    public static final TestTag INSTANCE = new TestTag();
    public static final String PURCHASE_BUTTON_TAG = "PurchaseButton";

    private TestTag() {
    }

    public final String selectButtonTestTag(String packageId) {
        t.g(packageId, "packageId");
        return "SelectButton_" + packageId;
    }
}
