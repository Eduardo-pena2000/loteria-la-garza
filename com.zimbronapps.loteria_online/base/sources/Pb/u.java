package Pb;

import Sb.B;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class u extends Ub.a {
    public final B a = new B();

    public static class a extends Ub.b {
        public Ub.f a(Ub.h hVar, Ub.g gVar) {
            if (hVar.d() >= 4) {
                return Ub.f.c();
            }
            int e = hVar.e();
            CharSequence a = hVar.c().a();
            return u.j(a, e) ? Ub.f.d(new u()).b(a.length()) : Ub.f.c();
        }
    }

    public static /* synthetic */ boolean j(CharSequence charSequence, int i) {
        return k(charSequence, i);
    }

    public static boolean k(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                if (charAt == '*') {
                    i4++;
                } else if (charAt == '-') {
                    i2++;
                } else {
                    if (charAt != '_') {
                        return false;
                    }
                    i3++;
                }
            }
            i++;
        }
        return (i2 >= 3 && i3 == 0 && i4 == 0) || (i3 >= 3 && i2 == 0 && i4 == 0) || (i4 >= 3 && i2 == 0 && i3 == 0);
    }

    public Ub.c c(Ub.h hVar) {
        return Ub.c.d();
    }

    public Sb.a f() {
        return this.a;
    }
}
