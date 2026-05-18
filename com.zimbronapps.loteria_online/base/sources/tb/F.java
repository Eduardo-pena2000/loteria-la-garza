package Tb;

import Sb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f {
    public final CharSequence a;
    public final x b;

    public f(CharSequence charSequence, x xVar) {
        if (charSequence == null) {
            throw new NullPointerException("content must not be null");
        }
        this.a = charSequence;
        this.b = xVar;
    }

    public static f c(CharSequence charSequence, x xVar) {
        return new f(charSequence, xVar);
    }

    public CharSequence a() {
        return this.a;
    }

    public x b() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Tb.f d(int r3, int r4) {
        /*
            r2 = this;
            java.lang.CharSequence r0 = r2.a
            java.lang.CharSequence r0 = r0.subSequence(r3, r4)
            Sb.x r1 = r2.b
            if (r1 == 0) goto L1d
            int r1 = r1.a()
            int r1 = r1 + r3
            int r4 = r4 - r3
            if (r4 == 0) goto L1d
            Sb.x r3 = r2.b
            int r3 = r3.c()
            Sb.x r3 = Sb.x.d(r3, r1, r4)
            goto L1e
        L1d:
            r3 = 0
        L1e:
            Tb.f r3 = c(r0, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.f.d(int, int):Tb.f");
    }
}
