package a1;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q0 {
    public static final n0 a = new n0();
    public static final long b = a(0, 0);

    public static final long a(int i, int i2) {
        return r0.a((i2 & 4294967295L) | (i << 32));
    }

    public static final /* synthetic */ Paint.FontMetricsInt b(o0 o0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, c1.h[] hVarArr) {
        return h(o0Var, textPaint, textDirectionHeuristic, hVarArr);
    }

    public static final /* synthetic */ long c(c1.h[] hVarArr) {
        return i(hVarArr);
    }

    public static final /* synthetic */ c1.h[] d(o0 o0Var) {
        return j(o0Var);
    }

    public static final /* synthetic */ n0 e() {
        return a;
    }

    public static final /* synthetic */ long f(o0 o0Var) {
        return l(o0Var);
    }

    public static final /* synthetic */ long g() {
        return b;
    }

    public static final Paint.FontMetricsInt h(o0 o0Var, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, c1.h[] hVarArr) {
        int m = o0Var.m() - 1;
        if (o0Var.i().getLineStart(m) != o0Var.i().getLineEnd(m) || hVarArr == null || hVarArr.length == 0) {
            return null;
        }
        SpannableString spannableString = new SpannableString("\u200b");
        c1.h hVar = (c1.h) Da.r.U(hVarArr);
        spannableString.setSpan(hVar.b(0, spannableString.length(), (m == 0 || !hVar.e()) ? hVar.e() : false), 0, spannableString.length(), 33);
        StaticLayout b2 = j0.b(j0.a, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, o0Var.h(), o0Var.e(), 0, 0, 0, 0, null, null, 2072512, null);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        fontMetricsInt.ascent = b2.getLineAscent(0);
        fontMetricsInt.descent = b2.getLineDescent(0);
        fontMetricsInt.top = b2.getLineTop(0);
        fontMetricsInt.bottom = b2.getLineBottom(0);
        return fontMetricsInt;
    }

    public static final long i(c1.h[] hVarArr) {
        int i = 0;
        int i2 = 0;
        for (c1.h hVar : hVarArr) {
            if (hVar.c() < 0) {
                i = Math.max(i, Math.abs(hVar.c()));
            }
            if (hVar.d() < 0) {
                i2 = Math.max(i, Math.abs(hVar.d()));
            }
        }
        return (i == 0 && i2 == 0) ? b : a(i, i2);
    }

    public static final c1.h[] j(o0 o0Var) {
        if (!(o0Var.G() instanceof Spanned)) {
            return null;
        }
        Spanned G = o0Var.G();
        kotlin.jvm.internal.t.e(G, "null cannot be cast to non-null type android.text.Spanned");
        if (!U.a(G, c1.h.class) && o0Var.G().length() > 0) {
            return null;
        }
        Spanned G2 = o0Var.G();
        kotlin.jvm.internal.t.e(G2, "null cannot be cast to non-null type android.text.Spanned");
        return (c1.h[]) G2.getSpans(0, o0Var.G().length(), c1.h.class);
    }

    public static final TextDirectionHeuristic k(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }

    public static final long l(o0 o0Var) {
        if (o0Var.h() || o0Var.J()) {
            return b;
        }
        TextPaint paint = o0Var.i().getPaint();
        CharSequence text = o0Var.i().getText();
        Rect c = T.c(paint, text, o0Var.i().getLineStart(0), o0Var.i().getLineEnd(0));
        int lineAscent = o0Var.i().getLineAscent(0);
        int i = c.top;
        int topPadding = i < lineAscent ? lineAscent - i : o0Var.i().getTopPadding();
        if (o0Var.m() != 1) {
            int m = o0Var.m() - 1;
            c = T.c(paint, text, o0Var.i().getLineStart(m), o0Var.i().getLineEnd(m));
        }
        int lineDescent = o0Var.i().getLineDescent(o0Var.m() - 1);
        int i2 = c.bottom;
        int bottomPadding = i2 > lineDescent ? i2 - lineDescent : o0Var.i().getBottomPadding();
        return (topPadding == 0 && bottomPadding == 0) ? b : a(topPadding, bottomPadding);
    }

    public static final boolean m(Layout layout, int i) {
        return layout.getEllipsisCount(i) > 0;
    }
}
