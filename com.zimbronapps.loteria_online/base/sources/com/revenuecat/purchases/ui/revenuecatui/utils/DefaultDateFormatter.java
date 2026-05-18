package com.revenuecat.purchases.ui.revenuecatui.utils;

import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultDateFormatter implements DateFormatter {
    public static final int $stable = 0;

    private final String formatUsingDateTimeFormatter(Date date, Locale locale) {
        String a = e.a(c.a(b.a(com.applovin.shadow.okhttp3.a.a(date), a.a())), d.a("dd MMM yyyy", locale));
        t.f(a, "localDate.format(formatter)");
        return a;
    }

    private final String formatUsingSimpleDateFormat(Date date, Locale locale) {
        String format = new SimpleDateFormat("dd MMM yyyy", locale).format(date);
        t.f(format, "formatter.format(date)");
        return format;
    }

    public String format(Date date, Locale locale) {
        t.g(date, "date");
        t.g(locale, "locale");
        return Build.VERSION.SDK_INT >= 26 ? formatUsingDateTimeFormatter(date, locale) : formatUsingSimpleDateFormat(date, locale);
    }
}
