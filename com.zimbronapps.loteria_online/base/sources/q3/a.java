package Q3;

import L3.s;
import P2.g;
import P2.o;
import P2.z;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.e;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements s {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final z c = new z();

    private Charset e(z zVar) {
        Charset O = zVar.O();
        return O != null ? O : e.c;
    }

    public static float f(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    public static long g(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0L) + (Long.parseLong((String) P2.a.e(matcher.group(i + 2))) * 60000) + (Long.parseLong((String) P2.a.e(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    public void b(byte[] bArr, int i, int i2, s.b bVar, g gVar) {
        String str;
        g gVar2;
        String s;
        String str2;
        String str3;
        g gVar3;
        g gVar4 = gVar;
        String str4 = "SubripParser";
        this.c.R(bArr, i + i2);
        this.c.T(i);
        Charset e2 = e(this.c);
        ArrayList arrayList = (bVar.a == -9223372036854775807L || !bVar.b) ? null : new ArrayList();
        while (true) {
            String s2 = this.c.s(e2);
            if (s2 == null) {
                break;
            }
            if (s2.length() != 0) {
                try {
                    Integer.parseInt(s2);
                    s = this.c.s(e2);
                } catch (NumberFormatException unused) {
                    str = str4;
                    gVar2 = gVar4;
                    o.h(str, "Skipping invalid index: " + s2);
                }
                if (s == null) {
                    o.h(str4, "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(s);
                if (matcher.matches()) {
                    long g = g(matcher, 1);
                    long g2 = g(matcher, 6);
                    int i3 = 0;
                    this.a.setLength(0);
                    this.b.clear();
                    String s3 = this.c.s(e2);
                    while (!TextUtils.isEmpty(s3)) {
                        if (this.a.length() > 0) {
                            this.a.append("<br>");
                        }
                        this.a.append(h(s3, this.b));
                        s3 = this.c.s(e2);
                    }
                    Spanned fromHtml = Html.fromHtml(this.a.toString());
                    while (true) {
                        if (i3 >= this.b.size()) {
                            str2 = str4;
                            str3 = null;
                            break;
                        } else {
                            str3 = (String) this.b.get(i3);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str4;
                                break;
                            }
                            i3++;
                        }
                    }
                    long j = bVar.a;
                    if (j == -9223372036854775807L || g >= j) {
                        gVar3 = gVar;
                        gVar3.accept(new L3.e(r.t(d(fromHtml, str3)), g, g2 - g));
                    } else {
                        if (arrayList != null) {
                            arrayList.add(new L3.e(r.t(d(fromHtml, str3)), g, g2 - g));
                        }
                        gVar3 = gVar;
                    }
                    gVar4 = gVar3;
                    str4 = str2;
                } else {
                    String str5 = str4;
                    gVar2 = gVar4;
                    str = str5;
                    o.h(str, "Skipping invalid timing: " + s);
                    gVar4 = gVar2;
                    str4 = str;
                }
            }
        }
        g gVar5 = gVar4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gVar5.accept((L3.e) it.next());
            }
        }
    }

    public int c() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O2.a d(android.text.Spanned r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.a.d(android.text.Spanned, java.lang.String):O2.a");
    }

    public final String h(String str, ArrayList arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = e.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }
}
