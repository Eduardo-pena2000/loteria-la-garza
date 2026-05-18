package R2;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u {
    public static final Pattern a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    public static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static String a(long j, long j2) {
        if (j == 0 && j2 == -1) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(j);
        sb.append("-");
        if (j2 != -1) {
            sb.append((j + j2) - 1);
        }
        return sb.toString();
    }

    public static long b(String str, String str2) {
        long parseLong;
        if (TextUtils.isEmpty(str)) {
            parseLong = -1;
        } else {
            try {
                parseLong = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                P2.o.c("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return parseLong;
        }
        Matcher matcher = a.matcher(str2);
        if (!matcher.matches()) {
            return parseLong;
        }
        try {
            long parseLong2 = (Long.parseLong((String) P2.a.e(matcher.group(2))) - Long.parseLong((String) P2.a.e(matcher.group(1)))) + 1;
            if (parseLong < 0) {
                return parseLong2;
            }
            if (parseLong == parseLong2) {
                return parseLong;
            }
            P2.o.h("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
            return Math.max(parseLong, parseLong2);
        } catch (NumberFormatException unused2) {
            P2.o.c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
            return parseLong;
        }
    }

    public static long c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = b.matcher(str);
        if (matcher.matches()) {
            return Long.parseLong((String) P2.a.e(matcher.group(1)));
        }
        return -1L;
    }
}
