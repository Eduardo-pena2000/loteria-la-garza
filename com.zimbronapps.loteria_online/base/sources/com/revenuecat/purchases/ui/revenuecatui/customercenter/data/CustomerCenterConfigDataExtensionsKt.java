package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Qa.l;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.PaywallColor;
import kotlin.jvm.internal.t;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class CustomerCenterConfigDataExtensionsKt {
    public static final /* synthetic */ r0 getColorForTheme(CustomerCenterConfigData.Appearance appearance, boolean z, l selector) {
        PaywallColor paywallColor;
        t.g(appearance, "<this>");
        t.g(selector, "selector");
        CustomerCenterConfigData.Appearance.ColorInformation dark = z ? appearance.getDark() : appearance.getLight();
        if (dark == null || (paywallColor = (PaywallColor) selector.invoke(dark)) == null) {
            return null;
        }
        return r0.m(s0.b(paywallColor.getColorInt()));
    }
}
