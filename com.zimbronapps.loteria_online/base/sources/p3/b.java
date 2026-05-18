package P3;

import L3.s;
import O2.a;
import P2.K;
import P2.g;
import P2.o;
import P2.z;
import P3.c;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import s7.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements s {
    public static final Pattern g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean a;
    public final a b;
    public Map d;
    public float e = -3.4028235E38f;
    public float f = -3.4028235E38f;
    public final z c = new z();

    public b(List list) {
        if (list == null || list.isEmpty()) {
            this.a = false;
            this.b = null;
            return;
        }
        this.a = true;
        String H = K.H((byte[]) list.get(0));
        P2.a.a(H.startsWith("Format:"));
        this.b = (a) P2.a.e(a.a(H));
        j(new z((byte[]) list.get(1)), e.c);
    }

    public static int d(long j, List list, List list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    public static float e(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public static O2.a f(String str, c cVar, c.b bVar, float f, float f2) {
        CharSequence spannableString = new SpannableString(str);
        a.b o = new a.b().o(spannableString);
        if (cVar != null) {
            if (cVar.c != null) {
                spannableString.setSpan(new ForegroundColorSpan(cVar.c.intValue()), 0, spannableString.length(), 33);
            }
            if (cVar.j == 3 && cVar.d != null) {
                spannableString.setSpan(new BackgroundColorSpan(cVar.d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = cVar.e;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                o.q(f3 / f2, 1);
            }
            boolean z = cVar.f;
            if (z && cVar.g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (cVar.g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (cVar.h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (cVar.i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = bVar.a;
        if (i == -1) {
            i = cVar != null ? cVar.b : -1;
        }
        o.p(p(i)).l(o(i)).i(n(i));
        PointF pointF = bVar.b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            o.k(e(o.d()));
            o.h(e(o.c()), 0);
        } else {
            o.k(pointF.x / f);
            o.h(bVar.b.y / f2, 0);
        }
        return o.a();
    }

    public static Map l(z zVar, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String s = zVar.s(charset);
            if (s == null || (zVar.a() != 0 && zVar.h(charset) == '[')) {
                break;
            }
            if (s.startsWith("Format:")) {
                aVar = c.a.a(s);
            } else if (s.startsWith("Style:")) {
                if (aVar == null) {
                    o.h("SsaParser", "Skipping 'Style:' line before 'Format:' line: " + s);
                } else {
                    c b = c.b(s, aVar);
                    if (b != null) {
                        linkedHashMap.put(b.a, b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static long m(String str) {
        Matcher matcher = g.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) K.i(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) K.i(matcher.group(2))) * 60000000) + (Long.parseLong((String) K.i(matcher.group(3))) * 1000000) + (Long.parseLong((String) K.i(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    public static int n(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                o.h("SsaParser", "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static int o(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                o.h("SsaParser", "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    public static Layout.Alignment p(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                o.h("SsaParser", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    public void b(byte[] bArr, int i, int i2, s.b bVar, g gVar) {
        List list;
        List list2;
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        this.c.R(bArr, i + i2);
        this.c.T(i);
        Charset g2 = g(this.c);
        if (!this.a) {
            j(this.c, g2);
        }
        i(this.c, arrayList, arrayList2, g2);
        ArrayList arrayList3 = (bVar.a == -9223372036854775807L || !bVar.b) ? null : new ArrayList();
        int i3 = 0;
        while (i3 < arrayList.size()) {
            List list3 = (List) arrayList.get(i3);
            if (list3.isEmpty() && i3 != 0) {
                list = arrayList;
                list2 = arrayList2;
            } else {
                if (i3 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long longValue = ((Long) arrayList2.get(i3)).longValue();
                long longValue2 = ((Long) arrayList2.get(i3 + 1)).longValue() - ((Long) arrayList2.get(i3)).longValue();
                list = arrayList;
                list2 = arrayList2;
                long j = bVar.a;
                if (j == -9223372036854775807L || longValue >= j) {
                    gVar.accept(new L3.e(list3, longValue, longValue2));
                } else if (arrayList3 != null) {
                    arrayList3.add(new L3.e(list3, longValue, longValue2));
                }
            }
            i3++;
            arrayList = list;
            arrayList2 = list2;
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                gVar.accept((L3.e) it.next());
            }
        }
    }

    public int c() {
        return 1;
    }

    public final Charset g(z zVar) {
        Charset O = zVar.O();
        return O != null ? O : e.c;
    }

    public final void h(String str, a aVar, List list, List list2) {
        int i;
        P2.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", aVar.e);
        if (split.length != aVar.e) {
            o.h("SsaParser", "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long m = m(split[aVar.a]);
        if (m == -9223372036854775807L) {
            o.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        long m2 = m(split[aVar.b]);
        if (m2 == -9223372036854775807L) {
            o.h("SsaParser", "Skipping invalid timing: " + str);
            return;
        }
        Map map = this.d;
        c cVar = (map == null || (i = aVar.c) == -1) ? null : (c) map.get(split[i].trim());
        String str2 = split[aVar.d];
        O2.a f = f(c.b.d(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.b(str2), this.e, this.f);
        int d = d(m2, list2, list);
        for (int d2 = d(m, list2, list); d2 < d; d2++) {
            ((List) list.get(d2)).add(f);
        }
    }

    public final void i(z zVar, List list, List list2, Charset charset) {
        a aVar = this.a ? this.b : null;
        while (true) {
            String s = zVar.s(charset);
            if (s == null) {
                return;
            }
            if (s.startsWith("Format:")) {
                aVar = a.a(s);
            } else if (s.startsWith("Dialogue:")) {
                if (aVar == null) {
                    o.h("SsaParser", "Skipping dialogue line before complete format: " + s);
                } else {
                    h(s, aVar, list, list2);
                }
            }
        }
    }

    public final void j(z zVar, Charset charset) {
        while (true) {
            String s = zVar.s(charset);
            if (s == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(s)) {
                k(zVar, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(s)) {
                this.d = l(zVar, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(s)) {
                o.f("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(s)) {
                return;
            }
        }
    }

    public final void k(z zVar, Charset charset) {
        while (true) {
            String s = zVar.s(charset);
            if (s == null) {
                return;
            }
            if (zVar.a() != 0 && zVar.h(charset) == '[') {
                return;
            }
            String[] split = s.split(":");
            if (split.length == 2) {
                String e = s7.c.e(split[0].trim());
                e.hashCode();
                if (e.equals("playresx")) {
                    this.e = Float.parseFloat(split[1].trim());
                } else if (e.equals("playresy")) {
                    try {
                        this.f = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }
}
