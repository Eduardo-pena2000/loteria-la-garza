package T3;

import P2.K;
import P2.o;
import P2.z;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final z a = new z();
    public final StringBuilder b = new StringBuilder();

    public static boolean b(z zVar) {
        int f = zVar.f();
        int g = zVar.g();
        byte[] e = zVar.e();
        if (f + 2 > g) {
            return false;
        }
        int i = f + 1;
        if (e[f] != 47) {
            return false;
        }
        int i2 = f + 2;
        if (e[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= g) {
                zVar.U(g - zVar.f());
                return true;
            }
            if (((char) e[i2]) == '*' && ((char) e[i3]) == '/') {
                i2 += 2;
                g = i2;
            } else {
                i2 = i3;
            }
        }
    }

    public static boolean c(z zVar) {
        char k = k(zVar, zVar.f());
        if (k != '\t' && k != '\n' && k != '\f' && k != '\r' && k != ' ') {
            return false;
        }
        zVar.U(1);
        return true;
    }

    public static void e(String str, c cVar) {
        Matcher matcher = d.matcher(s7.c.e(str));
        if (!matcher.matches()) {
            o.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) P2.a.e(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                cVar.t(3);
                break;
            case "em":
                cVar.t(2);
                break;
            case "px":
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) P2.a.e(matcher.group(1))));
    }

    public static String f(z zVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int f = zVar.f();
        int g = zVar.g();
        while (f < g && !z) {
            char c2 = (char) zVar.e()[f];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                f++;
                sb.append(c2);
            }
        }
        zVar.U(f - zVar.f());
        return sb.toString();
    }

    public static String g(z zVar, StringBuilder sb) {
        n(zVar);
        if (zVar.a() == 0) {
            return null;
        }
        String f = f(zVar, sb);
        if (!"".equals(f)) {
            return f;
        }
        return "" + ((char) zVar.G());
    }

    public static String h(z zVar, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder();
        boolean z = false;
        while (!z) {
            int f = zVar.f();
            String g = g(zVar, sb);
            if (g == null) {
                return null;
            }
            if ("}".equals(g) || ";".equals(g)) {
                zVar.T(f);
                z = true;
            } else {
                sb2.append(g);
            }
        }
        return sb2.toString();
    }

    public static String i(z zVar, StringBuilder sb) {
        n(zVar);
        if (zVar.a() < 5 || !"::cue".equals(zVar.D(5))) {
            return null;
        }
        int f = zVar.f();
        String g = g(zVar, sb);
        if (g == null) {
            return null;
        }
        if ("{".equals(g)) {
            zVar.T(f);
            return "";
        }
        String l = "(".equals(g) ? l(zVar) : null;
        if (")".equals(g(zVar, sb))) {
            return l;
        }
        return null;
    }

    public static void j(z zVar, c cVar, StringBuilder sb) {
        n(zVar);
        String f = f(zVar, sb);
        if (!"".equals(f) && ":".equals(g(zVar, sb))) {
            n(zVar);
            String h = h(zVar, sb);
            if (h == null || "".equals(h)) {
                return;
            }
            int f2 = zVar.f();
            String g = g(zVar, sb);
            if (!";".equals(g)) {
                if (!"}".equals(g)) {
                    return;
                } else {
                    zVar.T(f2);
                }
            }
            if ("color".equals(f)) {
                cVar.q(P2.e.b(h));
                return;
            }
            if ("background-color".equals(f)) {
                cVar.n(P2.e.b(h));
                return;
            }
            boolean z = true;
            if ("ruby-position".equals(f)) {
                if ("over".equals(h)) {
                    cVar.v(1);
                    return;
                } else {
                    if ("under".equals(h)) {
                        cVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(f)) {
                if (!"all".equals(h) && !h.startsWith("digits")) {
                    z = false;
                }
                cVar.p(z);
                return;
            }
            if ("text-decoration".equals(f)) {
                if ("underline".equals(h)) {
                    cVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(f)) {
                cVar.r(h);
                return;
            }
            if ("font-weight".equals(f)) {
                if ("bold".equals(h)) {
                    cVar.o(true);
                }
            } else if ("font-style".equals(f)) {
                if ("italic".equals(h)) {
                    cVar.u(true);
                }
            } else if ("font-size".equals(f)) {
                e(h, cVar);
            }
        }
    }

    public static char k(z zVar, int i) {
        return (char) zVar.e()[i];
    }

    public static String l(z zVar) {
        int f = zVar.f();
        int g = zVar.g();
        boolean z = false;
        while (f < g && !z) {
            int i = f + 1;
            z = ((char) zVar.e()[f]) == ')';
            f = i;
        }
        return zVar.D((f - 1) - zVar.f()).trim();
    }

    public static void m(z zVar) {
        while (!TextUtils.isEmpty(zVar.r())) {
        }
    }

    public static void n(z zVar) {
        while (true) {
            for (boolean z = true; zVar.a() > 0 && z; z = false) {
                if (!c(zVar) && !b(zVar)) {
                }
            }
            return;
        }
    }

    public final void a(c cVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                cVar.z((String) P2.a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] c1 = K.c1(str, "\\.");
        String str2 = c1[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            cVar.y(str2.substring(0, indexOf2));
            cVar.x(str2.substring(indexOf2 + 1));
        } else {
            cVar.y(str2);
        }
        if (c1.length > 1) {
            cVar.w((String[]) K.Q0(c1, 1, c1.length));
        }
    }

    public List d(z zVar) {
        this.b.setLength(0);
        int f = zVar.f();
        m(zVar);
        this.a.R(zVar.e(), zVar.f());
        this.a.T(f);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i = i(this.a, this.b);
            if (i == null) {
                return arrayList;
            }
            if (!"{".equals(g(this.a, this.b))) {
                return arrayList;
            }
            c cVar = new c();
            a(cVar, i);
            String str = null;
            boolean z = false;
            while (!z) {
                int f2 = this.a.f();
                String g = g(this.a, this.b);
                boolean z2 = g == null || "}".equals(g);
                if (!z2) {
                    this.a.T(f2);
                    j(this.a, cVar, this.b);
                }
                str = g;
                z = z2;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
    }
}
