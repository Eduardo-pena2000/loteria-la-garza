package com.revenuecat.purchases.utils;

import Da.r;
import P1.j;
import Za.B;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        t.g(locale, "<this>");
        String locale2 = locale.toString();
        t.f(locale2, "toString()");
        return toLocale(locale2);
    }

    public static final List getDefaultLocales() {
        j d = j.d();
        t.f(d, "getDefault()");
        return toList(d);
    }

    private static final String inferScript(Locale locale) {
        String country;
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            String script2 = locale.getScript();
            t.f(script2, "script");
            return script2;
        }
        if (!t.c(locale.getLanguage(), "zh") || (country = locale.getCountry()) == null) {
            return "";
        }
        int hashCode = country.hashCode();
        if (hashCode != 2155) {
            if (hashCode != 2307) {
                if (hashCode != 2466) {
                    if (hashCode != 2644) {
                        if (hashCode != 2691 || !country.equals("TW")) {
                            return "";
                        }
                    } else if (!country.equals("SG")) {
                        return "";
                    }
                } else if (!country.equals("MO")) {
                    return "";
                }
            } else if (!country.equals("HK")) {
                return "";
            }
            return "Hant";
        }
        if (!country.equals("CN")) {
            return "";
        }
        return "Hans";
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        t.g(locale, "<this>");
        t.g(locale2, "locale");
        try {
            return t.c(locale.getISO3Language(), locale2.getISO3Language()) && t.c(inferScript(locale), inferScript(locale2));
        } catch (MissingResourceException e) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e + "). Falling back to language.", (Throwable) null);
            return t.c(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final List toList(j jVar) {
        int g = jVar.g();
        Locale[] localeArr = new Locale[g];
        for (int i = 0; i < g; i++) {
            localeArr[i] = jVar.c(i);
        }
        return r.R(localeArr);
    }

    public static final Locale toLocale(String str) {
        t.g(str, "<this>");
        Locale forLanguageTag = Locale.forLanguageTag(B.H(str, "_", "-", false, 4, null));
        t.f(forLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return forLanguageTag;
    }
}
