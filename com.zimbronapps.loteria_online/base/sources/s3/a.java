package S3;

import L3.s;
import O2.a;
import P2.K;
import P2.g;
import P2.o;
import P2.z;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.util.List;
import s7.e;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements s {
    public final z a = new z();
    public final boolean b;
    public final int c;
    public final int d;
    public final String e;
    public final float f;
    public final int g;

    public a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.c = 0;
            this.d = -1;
            this.e = "sans-serif";
            this.b = false;
            this.f = 0.85f;
            this.g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.c = bArr[24];
        this.d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.e = "Serif".equals(K.I(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.g = i;
        boolean z = (bArr[0] & 32) != 0;
        this.b = z;
        if (z) {
            this.f = K.o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f = 0.85f;
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    public static void g(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    public static String h(z zVar) {
        P2.a.a(zVar.a() >= 2);
        int M = zVar.M();
        if (M == 0) {
            return "";
        }
        int f = zVar.f();
        Charset O = zVar.O();
        int f2 = M - (zVar.f() - f);
        if (O == null) {
            O = e.c;
        }
        return zVar.E(f2, O);
    }

    public void b(byte[] bArr, int i, int i2, s.b bVar, g gVar) {
        this.a.R(bArr, i + i2);
        this.a.T(i);
        String h = h(this.a);
        if (h.isEmpty()) {
            gVar.accept(new L3.e(r.s(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        CharSequence spannableStringBuilder = new SpannableStringBuilder(h);
        f(spannableStringBuilder, this.c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.e, 0, spannableStringBuilder.length());
        float f = this.f;
        while (this.a.a() >= 8) {
            int f2 = this.a.f();
            int p = this.a.p();
            int p2 = this.a.p();
            if (p2 == 1937013100) {
                P2.a.a(this.a.a() >= 2);
                int M = this.a.M();
                for (int i3 = 0; i3 < M; i3++) {
                    d(this.a, spannableStringBuilder);
                }
            } else if (p2 == 1952608120 && this.b) {
                P2.a.a(this.a.a() >= 2);
                f = K.o(this.a.M() / this.g, 0.0f, 0.95f);
            }
            this.a.T(f2 + p);
        }
        gVar.accept(new L3.e(r.t(new a.b().o(spannableStringBuilder).h(f, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    public int c() {
        return 2;
    }

    public final void d(z zVar, SpannableStringBuilder spannableStringBuilder) {
        P2.a.a(zVar.a() >= 12);
        int M = zVar.M();
        int M2 = zVar.M();
        zVar.U(2);
        int G = zVar.G();
        zVar.U(1);
        int p = zVar.p();
        if (M2 > spannableStringBuilder.length()) {
            o.h("Tx3gParser", "Truncating styl end (" + M2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            M2 = spannableStringBuilder.length();
        }
        if (M < M2) {
            int i = M2;
            f(spannableStringBuilder, G, this.c, M, i, 0);
            e(spannableStringBuilder, p, this.d, M, i, 0);
            return;
        }
        o.h("Tx3gParser", "Ignoring styl with start (" + M + ") >= end (" + M2 + ").");
    }
}
