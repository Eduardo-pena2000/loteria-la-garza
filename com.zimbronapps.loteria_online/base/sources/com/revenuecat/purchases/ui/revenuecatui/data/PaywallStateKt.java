package com.revenuecat.purchases.ui.revenuecatui.data;

import Ca.o;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.ProcessedLocalizedConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallStateKt {
    public static final TemplateConfiguration.Colors getCurrentColors(PaywallState.Loaded.Legacy legacy, m mVar, int i) {
        t.g(legacy, "<this>");
        if (w.L()) {
            w.U(779612430, i, -1, "com.revenuecat.purchases.ui.revenuecatui.data.<get-currentColors> (PaywallState.kt:384)");
        }
        TemplateConfiguration.Colors currentColors = legacy.getTemplateConfiguration().getCurrentColors(mVar, 0);
        if (w.L()) {
            w.T();
        }
        return currentColors;
    }

    public static final ProcessedLocalizedConfiguration getSelectedLocalization(PaywallState.Loaded.Legacy legacy) {
        t.g(legacy, "<this>");
        return ((TemplateConfiguration.PackageInfo) legacy.getSelectedPackage().getValue()).getLocalization();
    }

    public static final boolean isInFullScreenMode(PaywallState.Loaded.Legacy legacy) {
        t.g(legacy, "<this>");
        return PaywallModeKt.isFullScreen(legacy.getTemplateConfiguration().getMode());
    }

    public static final PaywallState.Loaded.Legacy loadedLegacy(PaywallState paywallState) {
        t.g(paywallState, "<this>");
        if (paywallState instanceof PaywallState.Error) {
            return null;
        }
        if (!(paywallState instanceof PaywallState.Loaded)) {
            if (paywallState instanceof PaywallState.Loading) {
                return null;
            }
            throw new o();
        }
        PaywallState.Loaded loaded = (PaywallState.Loaded) paywallState;
        if (loaded instanceof PaywallState.Loaded.Legacy) {
            return (PaywallState.Loaded.Legacy) paywallState;
        }
        if (loaded instanceof PaywallState.Loaded.Components) {
            return null;
        }
        throw new o();
    }
}
