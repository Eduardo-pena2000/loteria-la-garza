package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Qa.l;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.PaywallColor;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$createColorScheme$1$backgroundColor$1 extends u implements l {
    public static final InternalCustomerCenterKt$createColorScheme$1$backgroundColor$1 INSTANCE = new InternalCustomerCenterKt$createColorScheme$1$backgroundColor$1();

    public InternalCustomerCenterKt$createColorScheme$1$backgroundColor$1() {
        super(1);
    }

    public final PaywallColor invoke(CustomerCenterConfigData.Appearance.ColorInformation it) {
        t.g(it, "it");
        return it.getBackgroundColor();
    }
}
