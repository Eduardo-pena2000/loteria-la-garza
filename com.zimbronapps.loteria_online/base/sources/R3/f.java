package R3;

import P2.K;
import P2.o;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static void a(Spannable spannable, int i, int i2, g gVar, c cVar, Map map, int i3) {
        c e;
        g f;
        int i4;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i, i2, 33);
        }
        if (gVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (gVar.q()) {
            O2.f.b(spannable, new ForegroundColorSpan(gVar.c()), i, i2, 33);
        }
        if (gVar.p()) {
            O2.f.b(spannable, new BackgroundColorSpan(gVar.b()), i, i2, 33);
        }
        if (gVar.d() != null) {
            O2.f.b(spannable, new TypefaceSpan(gVar.d()), i, i2, 33);
        }
        if (gVar.o() != null) {
            b bVar = (b) P2.a.e(gVar.o());
            int i5 = bVar.a;
            if (i5 == -1) {
                i5 = (i3 == 2 || i3 == 1) ? 3 : 1;
                i4 = 1;
            } else {
                i4 = bVar.b;
            }
            int i6 = bVar.c;
            if (i6 == -2) {
                i6 = 1;
            }
            O2.f.b(spannable, new O2.g(i5, i4, i6), i, i2, 33);
        }
        int j = gVar.j();
        if (j == 2) {
            c d = d(cVar, map);
            if (d != null && (e = e(d, map)) != null) {
                if (e.g() != 1 || e.f(0).b == null) {
                    o.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) K.i(e.f(0).b);
                    g f2 = f(e.f, e.l(), map);
                    int i7 = f2 != null ? f2.i() : -1;
                    if (i7 == -1 && (f = f(d.f, d.l(), map)) != null) {
                        i7 = f.i();
                    }
                    spannable.setSpan(new O2.e(str, i7), i, i2, 33);
                }
            }
        } else if (j == 3 || j == 4) {
            spannable.setSpan(new a(), i, i2, 33);
        }
        if (gVar.n()) {
            O2.f.b(spannable, new O2.d(), i, i2, 33);
        }
        int f3 = gVar.f();
        if (f3 == 1) {
            O2.f.b(spannable, new AbsoluteSizeSpan((int) gVar.e(), true), i, i2, 33);
        } else if (f3 == 2) {
            O2.f.b(spannable, new RelativeSizeSpan(gVar.e()), i, i2, 33);
        } else {
            if (f3 != 3) {
                return;
            }
            O2.f.a(spannable, gVar.e() / 100.0f, i, i2, 33);
        }
    }

    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    public static c d(c cVar, Map map) {
        while (cVar != null) {
            g f = f(cVar.f, cVar.l(), map);
            if (f != null && f.j() == 1) {
                return cVar;
            }
            cVar = cVar.j;
        }
        return null;
    }

    public static c e(c cVar, Map map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(cVar);
        while (!arrayDeque.isEmpty()) {
            c cVar2 = (c) arrayDeque.pop();
            g f = f(cVar2.f, cVar2.l(), map);
            if (f != null && f.j() == 3) {
                return cVar2;
            }
            for (int g = cVar2.g() - 1; g >= 0; g--) {
                arrayDeque.push(cVar2.f(g));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.a((g) map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a((g) map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.a((g) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }
}
