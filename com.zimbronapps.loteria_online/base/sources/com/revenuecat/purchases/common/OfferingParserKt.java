package com.revenuecat.purchases.common;

import Za.B;
import com.revenuecat.purchases.PackageType;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingParserKt {
    public static final /* synthetic */ URL access$getWebCheckoutURL(JSONObject jSONObject) {
        return getWebCheckoutURL(jSONObject);
    }

    public static final /* synthetic */ PackageType access$toPackageType(String str) {
        return toPackageType(str);
    }

    private static final URL getWebCheckoutURL(JSONObject jSONObject) {
        String optString = jSONObject.optString("web_checkout_url");
        if (optString == null || optString.length() == 0) {
            optString = null;
        }
        if (optString == null) {
            return null;
        }
        try {
            return new URL(optString);
        } catch (MalformedURLException e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error parsing web checkout URL: " + optString, e);
            return null;
        }
    }

    private static final PackageType toPackageType(String str) {
        PackageType packageType;
        PackageType[] values = PackageType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                packageType = null;
                break;
            }
            packageType = values[i];
            if (t.c(packageType.getIdentifier(), str)) {
                break;
            }
            i++;
        }
        return packageType == null ? B.N(str, "$rc_", false, 2, (Object) null) ? PackageType.UNKNOWN : PackageType.CUSTOM : packageType;
    }
}
