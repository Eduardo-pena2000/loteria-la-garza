package com.revenuecat.purchases.ui.revenuecatui.components;

import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConditionContext {
    public static final int $stable = 8;
    private final Map customVariables;
    private final String selectedPackageId;

    public ConditionContext(String str, Map customVariables) {
        t.g(customVariables, "customVariables");
        this.selectedPackageId = str;
        this.customVariables = customVariables;
    }

    public final Map getCustomVariables() {
        return this.customVariables;
    }

    public final String getSelectedPackageId() {
        return this.selectedPackageId;
    }
}
