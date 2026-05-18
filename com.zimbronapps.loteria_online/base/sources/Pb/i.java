package Pb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i extends Ub.a {
    public final Sb.h a;
    public String b;
    public StringBuilder c;

    public static class a extends Ub.b {
        public Ub.f a(Ub.h hVar, Ub.g gVar) {
            int d = hVar.d();
            if (d >= Rb.f.a) {
                return Ub.f.c();
            }
            int e = hVar.e();
            i j = i.j(hVar.c().a(), e, d);
            return j != null ? Ub.f.d(j).b(e + i.k(j).q()) : Ub.f.c();
        }
    }

    public i(char c, int i, int i2) {
        Sb.h hVar = new Sb.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.s(c);
        hVar.u(i);
        hVar.t(i2);
    }

    public static /* synthetic */ i j(CharSequence charSequence, int i, int i2) {
        return l(charSequence, i, i2);
    }

    public static /* synthetic */ Sb.h k(i iVar) {
        return iVar.a;
    }

    public static i l(CharSequence charSequence, int i, int i2) {
        int length = charSequence.length();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = i; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            if (charAt == '`') {
                i3++;
            } else {
                if (charAt != '~') {
                    break;
                }
                i4++;
            }
        }
        if (i3 >= 3 && i4 == 0) {
            if (Rb.f.b('`', charSequence, i + i3) != -1) {
                return null;
            }
            return new i('`', i3, i2);
        }
        if (i4 < 3 || i3 != 0) {
            return null;
        }
        return new i('~', i4, i2);
    }

    public Ub.c c(Ub.h hVar) {
        int e = hVar.e();
        int index = hVar.getIndex();
        CharSequence a2 = hVar.c().a();
        if (hVar.d() < Rb.f.a && e < a2.length() && a2.charAt(e) == this.a.o() && m(a2, e)) {
            return Ub.c.c();
        }
        int length = a2.length();
        for (int p = this.a.p(); p > 0 && index < length && a2.charAt(index) == ' '; p--) {
            index++;
        }
        return Ub.c.b(index);
    }

    public Sb.a f() {
        return this.a;
    }

    public void g() {
        this.a.v(Rb.c.d(this.b.trim()));
        this.a.w(this.c.toString());
    }

    public void h(Tb.f fVar) {
        if (this.b == null) {
            this.b = fVar.a().toString();
        } else {
            this.c.append(fVar.a());
            this.c.append('\n');
        }
    }

    public final boolean m(CharSequence charSequence, int i) {
        char o = this.a.o();
        int q = this.a.q();
        int m = Rb.f.m(o, charSequence, i, charSequence.length()) - i;
        return m >= q && Rb.f.o(charSequence, i + m, charSequence.length()) == charSequence.length();
    }
}
