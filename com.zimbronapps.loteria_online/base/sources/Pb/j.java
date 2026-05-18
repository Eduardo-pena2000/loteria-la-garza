package Pb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class j extends Ub.a {
    public final Sb.j a;
    public final Tb.g b;

    public static class a extends Ub.b {
        public Ub.f a(Ub.h hVar, Ub.g gVar) {
            j j;
            if (hVar.d() >= Rb.f.a) {
                return Ub.f.c();
            }
            Tb.f c = hVar.c();
            int e = hVar.e();
            if (c.a().charAt(e) == '#' && (j = j.j(c.d(e, c.a().length()))) != null) {
                return Ub.f.d(j).b(c.a().length());
            }
            int k = j.k(c.a(), e);
            if (k > 0) {
                Tb.g b = gVar.b();
                if (!b.f()) {
                    return Ub.f.d(new j(k, b)).b(c.a().length()).e();
                }
            }
            return Ub.f.c();
        }
    }

    public j(int i, Tb.g gVar) {
        Sb.j jVar = new Sb.j();
        this.a = jVar;
        jVar.p(i);
        this.b = gVar;
    }

    public static /* synthetic */ j j(Tb.f fVar) {
        return l(fVar);
    }

    public static /* synthetic */ int k(CharSequence charSequence, int i) {
        return m(charSequence, i);
    }

    public static j l(Tb.f fVar) {
        Qb.m k = Qb.m.k(Tb.g.g(fVar));
        int g = k.g('#');
        if (g == 0 || g > 6) {
            return null;
        }
        if (!k.e()) {
            return new j(g, Tb.g.b());
        }
        char l = k.l();
        if (l != ' ' && l != '\t') {
            return null;
        }
        k.r();
        Qb.l o = k.o();
        Qb.l lVar = o;
        loop0: while (true) {
            boolean z = true;
            while (k.e()) {
                char l2 = k.l();
                if (l2 == '\t' || l2 == ' ') {
                    k.h();
                } else {
                    if (l2 != '#') {
                        k.h();
                        lVar = k.o();
                    } else if (z) {
                        k.g('#');
                        int r = k.r();
                        if (k.e()) {
                            lVar = k.o();
                        }
                        if (r > 0) {
                            break;
                        }
                    } else {
                        k.h();
                        lVar = k.o();
                    }
                    z = false;
                }
            }
            break loop0;
        }
        Tb.g d = k.d(o, lVar);
        return d.c().isEmpty() ? new j(g, Tb.g.b()) : new j(g, d);
    }

    public static int m(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt != '-') {
            if (charAt != '=') {
                return 0;
            }
            if (n(charSequence, i + 1, '=')) {
                return 1;
            }
        }
        return n(charSequence, i + 1, '-') ? 2 : 0;
    }

    public static boolean n(CharSequence charSequence, int i, char c) {
        return Rb.f.o(charSequence, Rb.f.m(c, charSequence, i, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    public Ub.c c(Ub.h hVar) {
        return Ub.c.d();
    }

    public Sb.a f() {
        return this.a;
    }

    public void i(Tb.b bVar) {
        bVar.a(this.b, this.a);
    }
}
