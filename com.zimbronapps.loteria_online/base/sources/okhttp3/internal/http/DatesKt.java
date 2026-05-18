package okhttp3.internal.http;

import Ca.I;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DatesKt {
    public static final DatesKt$STANDARD_DATE_FORMAT$1 a = new DatesKt$STANDARD_DATE_FORMAT$1();
    public static final String[] b;
    public static final DateFormat[] c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        b = strArr;
        c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        t.g(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    SimpleDateFormat[] simpleDateFormatArr = c;
                    SimpleDateFormat simpleDateFormat = simpleDateFormatArr[i];
                    if (simpleDateFormat == null) {
                        simpleDateFormat = new SimpleDateFormat(b[i], Locale.US);
                        simpleDateFormat.setTimeZone(Util.f);
                        simpleDateFormatArr[i] = simpleDateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = simpleDateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                    i = i2;
                }
                I i3 = I.a;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final String b(Date date) {
        t.g(date, "<this>");
        String format = ((DateFormat) a.get()).format(date);
        t.f(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
