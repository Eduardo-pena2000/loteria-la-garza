package com.applovin.sdk;

import android.content.Context;
import com.applovin.impl.n7;
import com.applovin.impl.p0;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinPrivacySettings {
    public static Boolean getAdditionalConsentStatus(int i) {
        k f = n7.f();
        if (f != null) {
            return f.r0().a(i);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve additional consent status");
        return null;
    }

    public static Boolean getPurposeConsentStatus(int i) {
        k f = n7.f();
        if (f != null) {
            return f.r0().b(i);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve purpose consent status");
        return null;
    }

    public static Boolean getSpecialFeatureOptInStatus(int i) {
        k f = n7.f();
        if (f != null) {
            return f.r0().c(i);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve special feature opt in status");
        return null;
    }

    public static Boolean getTcfVendorConsentStatus(int i) {
        k f = n7.f();
        if (f != null) {
            return f.r0().d(i);
        }
        o.h("AppLovinPrivacySettings", "Unable to retrieve TCF vendor consent status");
        return null;
    }

    public static boolean hasUserConsent() {
        return hasUserConsent(k.o());
    }

    public static boolean isDoNotSell() {
        return isDoNotSell(k.o());
    }

    public static boolean isDoNotSellSet() {
        return isDoNotSellSet(k.o());
    }

    public static boolean isUserConsentSet() {
        return isUserConsentSet(k.o());
    }

    public static void setDoNotSell(boolean z) {
        setDoNotSell(z, k.o());
    }

    public static void setHasUserConsent(boolean z) {
        setHasUserConsent(z, k.o());
    }

    @Deprecated
    public static boolean hasUserConsent(Context context) {
        Boolean b = p0.b().b(context);
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSell(Context context) {
        Boolean b = p0.a().b(context);
        if (b != null) {
            return b.booleanValue();
        }
        return false;
    }

    @Deprecated
    public static boolean isDoNotSellSet(Context context) {
        return p0.a().b(context) != null;
    }

    @Deprecated
    public static boolean isUserConsentSet(Context context) {
        return p0.b().b(context) != null;
    }

    @Deprecated
    public static void setDoNotSell(boolean z, Context context) {
        o.g("AppLovinPrivacySettings", "setDoNotSell()");
        if (p0.a(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(null, Boolean.valueOf(z));
        }
    }

    @Deprecated
    public static void setHasUserConsent(boolean z, Context context) {
        o.g("AppLovinPrivacySettings", "setHasUserConsent()");
        if (p0.b(z, context)) {
            AppLovinSdk.getInstance(context).reinitialize(Boolean.valueOf(z), null);
        }
    }
}
