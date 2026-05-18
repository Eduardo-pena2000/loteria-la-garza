package T3;

import P2.K;
import P2.z;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static Matcher a(z zVar) {
        String r;
        while (true) {
            String r2 = zVar.r();
            if (r2 == null) {
                return null;
            }
            if (a.matcher(r2).matches()) {
                do {
                    r = zVar.r();
                    if (r != null) {
                    }
                } while (!r.isEmpty());
            } else {
                Matcher matcher = e.a.matcher(r2);
                if (matcher.matches()) {
                    return matcher;
                }
            }
        }
    }

    public static boolean b(z zVar) {
        String r = zVar.r();
        return r != null && r.startsWith("WEBVTT");
    }

    public static float c(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long d(String str) {
        String[] d1 = K.d1(str, "\\.");
        long j = 0;
        for (String str2 : K.c1(d1[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (d1.length == 2) {
            j2 += Long.parseLong(d1[1]);
        }
        return j2 * 1000;
    }

    public static void e(z zVar) {
        int f = zVar.f();
        if (b(zVar)) {
            return;
        }
        zVar.T(f);
        throw M2.z.a("Expected WEBVTT. Got " + zVar.r(), null);
    }
}
