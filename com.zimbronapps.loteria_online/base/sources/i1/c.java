package i1;

import Z0.E;
import Z0.G;
import Z0.Y0;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final a a = new a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.emoji2.text.c] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static final CharSequence a(String str, float f, Y0 y0, List list, List list2, n1.d dVar, Qa.r rVar, boolean z) {
        String str2;
        E a2;
        if (z && androidx.emoji2.text.c.k()) {
            G y = y0.y();
            Z0.i d = (y == null || (a2 = y.a()) == null) ? null : Z0.i.d(a2.b());
            str2 = androidx.emoji2.text.c.c().u(str, 0, str.length(), Integer.MAX_VALUE, d == null ? 0 : Z0.i.g(d.j(), Z0.i.b.a()));
            kotlin.jvm.internal.t.d(str2);
        } else {
            str2 = str;
        }
        if (list.isEmpty() && list2.isEmpty() && kotlin.jvm.internal.t.c(y0.F(), l1.s.c.a()) && n1.v.f(y0.u()) == 0) {
            return str2;
        }
        Spannable spannableString = str2 instanceof Spannable ? (Spannable) str2 : new SpannableString(str2);
        if (kotlin.jvm.internal.t.c(y0.C(), l1.k.b.d())) {
            j1.d.x(spannableString, a, 0, str.length());
        }
        if (b(y0) && y0.v() == null) {
            j1.d.u(spannableString, y0.u(), f, dVar);
        } else {
            l1.h v = y0.v();
            if (v == null) {
                v = l1.h.d.a();
            }
            j1.d.t(spannableString, y0.u(), f, dVar, v);
        }
        j1.d.B(spannableString, y0.F(), f, dVar);
        j1.d.z(spannableString, y0, list, dVar, rVar);
        j1.d.l(spannableString, list, f, dVar, y0.F());
        j1.b.b(spannableString, list2, dVar);
        return spannableString;
    }

    public static final boolean b(Y0 y0) {
        E a2;
        G y = y0.y();
        if (y == null || (a2 = y.a()) == null) {
            return false;
        }
        return a2.c();
    }

    public static final class a extends CharacterStyle {
        public void updateDrawState(TextPaint textPaint) {
        }
    }
}
