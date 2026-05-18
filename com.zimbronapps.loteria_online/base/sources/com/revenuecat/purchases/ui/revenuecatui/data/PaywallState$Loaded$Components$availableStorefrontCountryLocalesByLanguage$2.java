package com.revenuecat.purchases.ui.revenuecatui.data;

import Da.Q;
import Da.S;
import Qa.a;
import Za.B;
import Za.E;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallState$Loaded$Components$availableStorefrontCountryLocalesByLanguage$2 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallState$Loaded$Components$availableStorefrontCountryLocalesByLanguage$2(PaywallState.Loaded.Components components) {
        super(0);
        this.this$0 = components;
    }

    public final Map invoke() {
        String access$getStorefrontCountryCode$p = PaywallState.Loaded.Components.access$getStorefrontCountryCode$p(this.this$0);
        if (access$getStorefrontCountryCode$p == null || E.h0(access$getStorefrontCountryCode$p)) {
            return S.h();
        }
        PaywallState.Loaded.Components components = this.this$0;
        Map c = Q.c();
        Locale[] availableLocales = Locale.getAvailableLocales();
        t.f(availableLocales, "getAvailableLocales()");
        for (Locale availableLocale : availableLocales) {
            if (B.z(availableLocale.getCountry(), PaywallState.Loaded.Components.access$getStorefrontCountryCode$p(components), true)) {
                String language = availableLocale.getLanguage();
                t.f(language, "availableLocale.language");
                String lowerCase = language.toLowerCase(Locale.ROOT);
                t.f(lowerCase, "toLowerCase(...)");
                t.f(availableLocale, "availableLocale");
                c.put(lowerCase, availableLocale);
            }
        }
        return Q.b(c);
    }
}
