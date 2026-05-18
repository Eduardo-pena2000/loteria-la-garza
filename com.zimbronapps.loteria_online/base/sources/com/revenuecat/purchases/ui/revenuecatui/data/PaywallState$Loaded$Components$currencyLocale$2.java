package com.revenuecat.purchases.ui.revenuecatui.data;

import Da.D;
import Qa.a;
import Za.E;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import h1.d;
import java.util.Locale;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallState$Loaded$Components$currencyLocale$2 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallState$Loaded$Components$currencyLocale$2(PaywallState.Loaded.Components components) {
        super(0);
        this.this$0 = components;
    }

    public final d invoke() {
        String access$getStorefrontCountryCode$p = PaywallState.Loaded.Components.access$getStorefrontCountryCode$p(this.this$0);
        if (access$getStorefrontCountryCode$p == null || E.h0(access$getStorefrontCountryCode$p)) {
            return this.this$0.getLocale();
        }
        String a = this.this$0.getLocale().a();
        Locale locale = Locale.ROOT;
        String lowerCase = a.toLowerCase(locale);
        t.f(lowerCase, "toLowerCase(...)");
        Locale javaLocale = (Locale) PaywallState.Loaded.Components.access$getAvailableStorefrontCountryLocalesByLanguage(this.this$0).get(lowerCase);
        if (javaLocale == null && (javaLocale = (Locale) D.g0(PaywallState.Loaded.Components.access$getAvailableStorefrontCountryLocalesByLanguage(this.this$0).values())) == null) {
            Locale.Builder locale2 = new Locale.Builder().setLocale(LocalizationKt.toJavaLocale(this.this$0.getLocale()));
            String upperCase = PaywallState.Loaded.Components.access$getStorefrontCountryCode$p(this.this$0).toUpperCase(locale);
            t.f(upperCase, "toUpperCase(...)");
            javaLocale = locale2.setRegion(upperCase).build();
        }
        t.f(javaLocale, "javaLocale");
        return LocalizationKt.toComposeLocale(javaLocale);
    }
}
