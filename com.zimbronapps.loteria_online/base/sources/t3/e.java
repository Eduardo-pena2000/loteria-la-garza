package T3;

import O2.a;
import P2.K;
import P2.o;
import P2.z;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    public static class b {
        public static final Comparator c = new f();
        public final c a;
        public final int b;

        public /* synthetic */ b(c cVar, int i, a aVar) {
            this(cVar, i);
        }

        public static /* synthetic */ int a(b bVar, b bVar2) {
            return e(bVar, bVar2);
        }

        public static /* synthetic */ Comparator b() {
            return c;
        }

        public static /* synthetic */ c c(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ int d(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ int e(b bVar, b bVar2) {
            return Integer.compare(bVar.a.b, bVar2.a.b);
        }

        public b(c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }
    }

    public static final class c {
        public final String a;
        public final int b;
        public final String c;
        public final Set d;

        public c(String str, int i, String str2, Set set) {
            this.b = i;
            this.a = str;
            this.c = str2;
            this.d = set;
        }

        public static c a(String str, int i) {
            String str2;
            String trim = str.trim();
            P2.a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] c1 = K.c1(trim, "\\.");
            String str3 = c1[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < c1.length; i2++) {
                hashSet.add(c1[i2]);
            }
            return new c(str3, i, str2, hashSet);
        }

        public static c b() {
            return new c("", 0, "", Collections.emptySet());
        }
    }

    public static final class d implements Comparable {
        public final int a;
        public final T3.c b;

        public d(int i, T3.c cVar) {
            this.a = i;
            this.b = cVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return Integer.compare(this.a, dVar.a);
        }
    }

    public static final class e {
        public CharSequence c;
        public long a = 0;
        public long b = 0;
        public int d = 2;
        public float e = -3.4028235E38f;
        public int f = 1;
        public int g = 0;
        public float h = -3.4028235E38f;
        public int i = Integer.MIN_VALUE;
        public float j = 1.0f;
        public int k = Integer.MIN_VALUE;

        public static float b(float f, int i) {
            if (f == -3.4028235E38f || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return f != -3.4028235E38f ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        public static Layout.Alignment c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            o.h("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public static float d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        public static float e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        public static int f(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        public T3.d a() {
            return new T3.d(g().a(), this.a, this.b);
        }

        public a.b g() {
            float f = this.h;
            if (f == -3.4028235E38f) {
                f = e(this.d);
            }
            int i = this.i;
            if (i == Integer.MIN_VALUE) {
                i = f(this.d);
            }
            a.b r = new a.b().p(c(this.d)).h(b(this.e, this.f), this.f).i(this.g).k(f).l(i).n(Math.min(this.j, d(i, f))).r(this.k);
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                r.o(charSequence);
            }
            return r;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Set set, int i, int i2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Map map = c;
            if (map.containsKey(str)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str)).intValue()), i, i2, 33);
            } else {
                Map map2 = d;
                if (map2.containsKey(str)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str)).intValue()), i, i2, 33);
                }
            }
        }
    }

    public static void b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        switch (str) {
            case "gt":
                spannableStringBuilder.append('>');
                break;
            case "lt":
                spannableStringBuilder.append('<');
                break;
            case "amp":
                spannableStringBuilder.append('&');
                break;
            case "nbsp":
                spannableStringBuilder.append(' ');
                break;
            default:
                o.h("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                break;
        }
    }

    public static void c(SpannableStringBuilder spannableStringBuilder, String str, c cVar, List list, List list2) {
        int i = i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, b.b());
        int i2 = cVar.b;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if ("rt".equals(b.c((b) arrayList.get(i4)).a)) {
                b bVar = (b) arrayList.get(i4);
                int g = g(i(list2, str, b.c(bVar)), i, 1);
                int i5 = b.c(bVar).b - i3;
                int d2 = b.d(bVar) - i3;
                CharSequence subSequence = spannableStringBuilder.subSequence(i5, d2);
                spannableStringBuilder.delete(i5, d2);
                spannableStringBuilder.setSpan(new O2.e(subSequence.toString(), g), i2, i5, 33);
                i3 += subSequence.length();
                i2 = i5;
            }
        }
    }

    public static void d(String str, c cVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int length;
        i = cVar.b;
        length = spannableStringBuilder.length();
        String str2 = cVar.a;
        str2.hashCode();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                a(spannableStringBuilder, cVar.d, i, length);
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "ruby":
                c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List h = h(list2, str, cVar);
        for (int i2 = 0; i2 < h.size(); i2++) {
            e(spannableStringBuilder, ((d) h.get(i2)).b, i, length);
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, T3.c cVar, int i, int i2) {
        if (cVar == null) {
            return;
        }
        if (cVar.i() != -1) {
            O2.f.b(spannableStringBuilder, new StyleSpan(cVar.i()), i, i2, 33);
        }
        if (cVar.l()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (cVar.m()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (cVar.k()) {
            O2.f.b(spannableStringBuilder, new ForegroundColorSpan(cVar.c()), i, i2, 33);
        }
        if (cVar.j()) {
            O2.f.b(spannableStringBuilder, new BackgroundColorSpan(cVar.a()), i, i2, 33);
        }
        if (cVar.d() != null) {
            O2.f.b(spannableStringBuilder, new TypefaceSpan(cVar.d()), i, i2, 33);
        }
        int f = cVar.f();
        if (f == 1) {
            O2.f.b(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar.e(), true), i, i2, 33);
        } else if (f == 2) {
            O2.f.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e()), i, i2, 33);
        } else if (f == 3) {
            O2.f.b(spannableStringBuilder, new RelativeSizeSpan(cVar.e() / 100.0f), i, i2, 33);
        }
        if (cVar.b()) {
            spannableStringBuilder.setSpan(new O2.d(), i, i2, 33);
        }
    }

    public static int f(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    public static int g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    public static List h(List list, String str, c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            T3.c cVar2 = (T3.c) list.get(i);
            int h = cVar2.h(str, cVar.a, cVar.d, cVar.c);
            if (h > 0) {
                arrayList.add(new d(h, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int i(List list, String str, c cVar) {
        List h = h(list, str, cVar);
        for (int i = 0; i < h.size(); i++) {
            T3.c cVar2 = ((d) h.get(i)).b;
            if (cVar2.g() != -1) {
                return cVar2.g();
            }
        }
        return -1;
    }

    public static String j(String str) {
        String trim = str.trim();
        P2.a.a(!trim.isEmpty());
        return K.d1(trim, "[ \\.]")[0];
    }

    public static boolean k(String str) {
        str.hashCode();
        switch (str) {
            case "b":
            case "c":
            case "i":
            case "u":
            case "v":
            case "rt":
            case "lang":
            case "ruby":
                return true;
            default:
                return false;
        }
    }

    public static O2.a l(CharSequence charSequence) {
        e eVar = new e();
        eVar.c = charSequence;
        return eVar.g().a();
    }

    public static T3.d m(z zVar, List list) {
        String r = zVar.r();
        if (r == null) {
            return null;
        }
        Pattern pattern = a;
        Matcher matcher = pattern.matcher(r);
        if (matcher.matches()) {
            return n(null, matcher, zVar, list);
        }
        String r2 = zVar.r();
        if (r2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(r2);
        if (matcher2.matches()) {
            return n(r.trim(), matcher2, zVar, list);
        }
        return null;
    }

    public static T3.d n(String str, Matcher matcher, z zVar, List list) {
        e eVar = new e();
        try {
            eVar.a = h.d((String) P2.a.e(matcher.group(1)));
            eVar.b = h.d((String) P2.a.e(matcher.group(2)));
            p((String) P2.a.e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String r = zVar.r();
            while (!TextUtils.isEmpty(r)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(r.trim());
                r = zVar.r();
            }
            eVar.c = q(str, sb.toString(), list);
            return eVar.a();
        } catch (NumberFormatException unused) {
            o.h("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static a.b o(String str) {
        e eVar = new e();
        p(str, eVar);
        return eVar.g();
    }

    public static void p(String str, e eVar) {
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) P2.a.e(matcher.group(1));
            String str3 = (String) P2.a.e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.d = v(str3);
                } else if ("position".equals(str2)) {
                    u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.j = h.c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.k = w(str3);
                } else {
                    o.h("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                o.h("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString q(String str, String str2, List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    b(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z = str2.charAt(i2) == '/';
                    i2 = f(str2, i2);
                    int i3 = i2 - 2;
                    boolean z2 = str2.charAt(i3) == '/';
                    int i4 = i + (z ? 2 : 1);
                    if (!z2) {
                        i3 = i2 - 1;
                    }
                    String substring = str2.substring(i4, i3);
                    if (!substring.trim().isEmpty()) {
                        String j = j(substring);
                        if (k(j)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length(), null));
                                    }
                                    if (cVar.a.equals(j)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(c.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            d(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        d(str, c.b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    public static int r(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                o.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void s(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.g = r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.e = h.c(str);
            eVar.f = 0;
        } else {
            eVar.e = Integer.parseInt(str);
            eVar.f = 1;
        }
    }

    public static int t(String str) {
        str.hashCode();
        switch (str) {
            case "line-left":
            case "start":
                return 0;
            case "center":
            case "middle":
                return 1;
            case "line-right":
            case "end":
                return 2;
            default:
                o.h("WebvttCueParser", "Invalid anchor value: " + str);
                return Integer.MIN_VALUE;
        }
    }

    public static void u(String str, e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.i = t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.h = h.c(str);
    }

    public static int v(String str) {
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 2;
            case "end":
                return 3;
            case "left":
                return 4;
            case "right":
                return 5;
            case "start":
                return 1;
            default:
                o.h("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    public static int w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        o.h("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return Integer.MIN_VALUE;
    }
}
