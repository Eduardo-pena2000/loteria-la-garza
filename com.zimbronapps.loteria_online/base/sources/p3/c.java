package P3;

import P2.K;
import P2.o;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w7.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public final String a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;

        public a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
            this.k = i11;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0033  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static P3.c.a a(java.lang.String r18) {
            /*
                Method dump skipped, instructions count: 276
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: P3.c.a.a(java.lang.String):P3.c$a");
        }
    }

    public static final class b {
        public static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
        public static final Pattern d = Pattern.compile(K.G("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern e = Pattern.compile(K.G("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern f = Pattern.compile("\\\\an(\\d+)");
        public final int a;
        public final PointF b;

        public b(int i, PointF pointF) {
            this.a = i;
            this.b = pointF;
        }

        public static int a(String str) {
            Matcher matcher = f.matcher(str);
            if (matcher.find()) {
                return c.a((String) P2.a.e(matcher.group(1)));
            }
            return -1;
        }

        public static b b(String str) {
            Matcher matcher = c.matcher(str);
            PointF pointF = null;
            int i = -1;
            while (matcher.find()) {
                String str2 = (String) P2.a.e(matcher.group(1));
                try {
                    PointF c2 = c(str2);
                    if (c2 != null) {
                        pointF = c2;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int a = a(str2);
                    if (a != -1) {
                        i = a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i, pointF);
        }

        public static PointF c(String str) {
            String group;
            String group2;
            Matcher matcher = d.matcher(str);
            Matcher matcher2 = e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    o.f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) P2.a.e(group)).trim()), Float.parseFloat(((String) P2.a.e(group2)).trim()));
        }

        public static String d(String str) {
            return c.matcher(str).replaceAll("");
        }
    }

    public c(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static /* synthetic */ int a(String str) {
        return e(str);
    }

    public static c b(String str, a aVar) {
        P2.a.a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i = aVar.k;
        if (length != i) {
            o.h("SsaStyle", K.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.a].trim();
            int i2 = aVar.b;
            int e = i2 != -1 ? e(split[i2].trim()) : -1;
            int i3 = aVar.c;
            Integer h = i3 != -1 ? h(split[i3].trim()) : null;
            int i4 = aVar.d;
            Integer h2 = i4 != -1 ? h(split[i4].trim()) : null;
            int i5 = aVar.e;
            float i6 = i5 != -1 ? i(split[i5].trim()) : -3.4028235E38f;
            int i7 = aVar.f;
            boolean z = i7 != -1 && f(split[i7].trim());
            int i8 = aVar.g;
            boolean z2 = i8 != -1 && f(split[i8].trim());
            int i9 = aVar.h;
            boolean z3 = i9 != -1 && f(split[i9].trim());
            int i10 = aVar.i;
            boolean z4 = i10 != -1 && f(split[i10].trim());
            int i11 = aVar.j;
            return new c(trim, e, h, h2, i6, z, z2, z3, z4, i11 != -1 ? g(split[i11].trim()) : -1);
        } catch (RuntimeException e2) {
            o.i("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e2);
            return null;
        }
    }

    public static boolean c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(int i) {
        return i == 1 || i == 3;
    }

    public static int e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        o.h("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    public static boolean f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            o.i("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static int g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        o.h("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    public static Integer h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            P2.a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(f.d(((parseLong >> 24) & 255) ^ 255), f.d(parseLong & 255), f.d((parseLong >> 8) & 255), f.d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            o.i("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    public static float i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            o.i("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
