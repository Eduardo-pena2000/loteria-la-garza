package S;

import Wa.n;
import Z0.A;
import Z0.Y0;
import Z0.Z0;
import d1.u;
import kotlin.jvm.internal.k;
import n1.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public static final a h = new a(null);
    public static final int i = 8;
    public static c j;
    public final t a;
    public final Y0 b;
    public final n1.d c;
    public final u.b d;
    public final Y0 e;
    public float f;
    public float g;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final c a(c cVar, t tVar, Y0 y0, n1.d dVar, u.b bVar) {
            if (cVar != null && tVar == cVar.g() && kotlin.jvm.internal.t.c(y0, cVar.f()) && dVar.getDensity() == cVar.d().getDensity() && bVar == cVar.e()) {
                return cVar;
            }
            c a = c.a();
            if (a != null && tVar == a.g() && kotlin.jvm.internal.t.c(y0, a.f()) && dVar.getDensity() == a.d().getDensity() && bVar == a.e()) {
                return a;
            }
            c cVar2 = new c(tVar, Z0.d(y0, tVar), dVar, bVar, null);
            c.b(cVar2);
            return cVar2;
        }

        public a() {
        }
    }

    public /* synthetic */ c(t tVar, Y0 y0, n1.d dVar, u.b bVar, k kVar) {
        this(tVar, y0, dVar, bVar);
    }

    public static final /* synthetic */ c a() {
        return j;
    }

    public static final /* synthetic */ void b(c cVar) {
        j = cVar;
    }

    public final long c(long j2, int i2) {
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            f = A.b(d.a(), this.e, n1.c.b(0, 0, 0, 0, 15, null), this.c, this.d, null, null, 1, false, 96, null).getHeight();
            f2 = A.b(d.b(), this.e, n1.c.b(0, 0, 0, 0, 15, null), this.c, this.d, null, null, 2, false, 96, null).getHeight() - f;
            this.g = f;
            this.f = f2;
        }
        return n1.c.a(n1.b.n(j2), n1.b.l(j2), i2 != 1 ? n.i(n.e(Math.round(f + (f2 * (i2 - 1))), 0), n1.b.k(j2)) : n1.b.m(j2), n1.b.k(j2));
    }

    public final n1.d d() {
        return this.c;
    }

    public final u.b e() {
        return this.d;
    }

    public final Y0 f() {
        return this.b;
    }

    public final t g() {
        return this.a;
    }

    public c(t tVar, Y0 y0, n1.d dVar, u.b bVar) {
        this.a = tVar;
        this.b = y0;
        this.c = dVar;
        this.d = bVar;
        this.e = Z0.d(y0, tVar);
        this.f = Float.NaN;
        this.g = Float.NaN;
    }
}
