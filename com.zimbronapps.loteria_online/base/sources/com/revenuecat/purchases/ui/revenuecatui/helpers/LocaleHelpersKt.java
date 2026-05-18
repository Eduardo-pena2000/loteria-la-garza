package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Za.E;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LocaleHelpersKt {
    public static final Locale createLocaleFromString(String localeString) {
        t.g(localeString, "localeString");
        if (!E.S(localeString, '-', false, 2, null) && !E.S(localeString, '_', false, 2, null)) {
            return new Locale(localeString);
        }
        List L0 = E.S(localeString, '-', false, 2, null) ? E.L0(localeString, new char[]{'-'}, false, 2, 2, null) : E.L0(localeString, new char[]{'_'}, false, 2, 2, null);
        return L0.size() >= 2 ? new Locale((String) L0.get(0), (String) L0.get(1)) : new Locale((String) L0.get(0));
    }
}
