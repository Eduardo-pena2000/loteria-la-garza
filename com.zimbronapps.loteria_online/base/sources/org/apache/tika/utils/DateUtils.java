package org.apache.tika.utils;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class DateUtils {
    private final List iso8601InputFormats = loadDateFormats();
    public static final TimeZone UTC = TimeZone.getTimeZone("UTC");
    public static final TimeZone MIDDAY = TimeZone.getTimeZone("GMT-12:00");

    private static DateFormat createDateFormat(String str, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, new DateFormatSymbols(Locale.US));
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
        }
        return simpleDateFormat;
    }

    private static String doFormatDate(Calendar calendar) {
        return d.a(c.a(a.a(calendar), b.a()));
    }

    public static String formatDate(Date date) {
        Calendar calendar = Calendar.getInstance(UTC, Locale.US);
        calendar.setTime(date);
        return doFormatDate(calendar);
    }

    public static String formatDateUnknownTimezone(Date date) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.US);
        calendar.setTime(date);
        return formatDate(calendar).substring(0, r2.length() - 1);
    }

    private List loadDateFormats() {
        ArrayList arrayList = new ArrayList();
        TimeZone timeZone = UTC;
        arrayList.add(createDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", timeZone));
        arrayList.add(createDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", null));
        arrayList.add(createDateFormat("yyyy-MM-dd'T'HH:mm:ss", null));
        arrayList.add(createDateFormat("yyyy-MM-dd' 'HH:mm:ss'Z'", timeZone));
        arrayList.add(createDateFormat("yyyy-MM-dd' 'HH:mm:ssZ", null));
        arrayList.add(createDateFormat("yyyy-MM-dd' 'HH:mm:ss", null));
        TimeZone timeZone2 = MIDDAY;
        arrayList.add(createDateFormat("yyyy-MM-dd", timeZone2));
        arrayList.add(createDateFormat("yyyy:MM:dd", timeZone2));
        return arrayList;
    }

    public Date tryToParse(String str) {
        int length = str.length();
        int i = length - 3;
        if (str.charAt(i) == ':') {
            int i2 = length - 6;
            if (str.charAt(i2) == '+' || str.charAt(i2) == '-') {
                str = str.substring(0, i) + str.substring(length - 2);
            }
        }
        Iterator it = this.iso8601InputFormats.iterator();
        while (it.hasNext()) {
            try {
                return ((DateFormat) it.next()).parse(str);
            } catch (ParseException unused) {
            }
        }
        return null;
    }

    public static String formatDate(Calendar calendar) {
        return doFormatDate(calendar);
    }
}
