package com.applovin.shadow.okhttp3.internal.http;

import com.applovin.shadow.okhttp3.internal.Util;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class DatesKt$STANDARD_DATE_FORMAT$1 extends ThreadLocal {
    public DateFormat initialValue() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setLenient(false);
        simpleDateFormat.setTimeZone(Util.UTC);
        return simpleDateFormat;
    }
}
