package U4;

import Ca.I;
import M0.A;
import M0.C;
import M0.Q;
import M0.v;
import P0.L0;
import P0.N0;
import P0.O0;
import Qa.l;
import androidx.compose.ui.layout.q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.n;
import s0.j;
import u0.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e extends O0 implements v, j {
    public final A0.c c;
    public final o0.e d;
    public final M0.f e;
    public final float f;
    public final androidx.compose.ui.graphics.d g;

    public static final class a extends u implements l {
        public final /* synthetic */ q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar) {
            super(1);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.Z(aVar, this.a, 0, 0, 0.0f, 4, null);
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ A0.c a;
        public final /* synthetic */ o0.e b;
        public final /* synthetic */ M0.f c;
        public final /* synthetic */ float d;
        public final /* synthetic */ androidx.compose.ui.graphics.d e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(A0.c cVar, o0.e eVar, M0.f fVar, float f, androidx.compose.ui.graphics.d dVar) {
            super(1);
            this.a = cVar;
            this.b = eVar;
            this.c = fVar;
            this.d = f;
            this.e = dVar;
        }

        public final void a(N0 n0) {
            t.g(n0, "$this$null");
            n0.d("content");
            n0.b().c("painter", this.a);
            n0.b().c("alignment", this.b);
            n0.b().c("contentScale", this.c);
            n0.b().c("alpha", Float.valueOf(this.d));
            n0.b().c("colorFilter", this.e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return I.a;
        }
    }

    public e(A0.c cVar, o0.e eVar, M0.f fVar, float f, androidx.compose.ui.graphics.d dVar) {
        super(L0.b() ? new b(cVar, eVar, fVar, f, dVar) : L0.a());
        this.c = cVar;
        this.d = eVar;
        this.e = fVar;
        this.f = f;
        this.g = dVar;
    }

    public final long b(long j) {
        if (u0.l.k(j)) {
            return u0.l.b.b();
        }
        long k = this.c.k();
        if (k == u0.l.b.a()) {
            return j;
        }
        float i = u0.l.i(k);
        if (Float.isInfinite(i) || Float.isNaN(i)) {
            i = u0.l.i(j);
        }
        float g = u0.l.g(k);
        if (Float.isInfinite(g) || Float.isNaN(g)) {
            g = u0.l.g(j);
        }
        long a2 = m.a(i, g);
        return Q.a(a2, this.e.a(a2, j));
    }

    public void draw(x0.c cVar) {
        long b2 = b(cVar.e());
        long a2 = this.d.a(g.f(b2), g.f(cVar.e()), cVar.getLayoutDirection());
        float d = n.d(a2);
        float e = n.e(a2);
        cVar.m1().d().d(d, e);
        this.c.j(cVar, b2, this.f, this.g);
        cVar.m1().d().d(-d, -e);
        cVar.B1();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return t.c(this.c, eVar.c) && t.c(this.d, eVar.d) && t.c(this.e, eVar.e) && Float.compare(this.f, eVar.f) == 0 && t.c(this.g, eVar.g);
    }

    public final long f(long j) {
        float n;
        int m;
        float a2;
        boolean j2 = n1.b.j(j);
        boolean i = n1.b.i(j);
        if (j2 && i) {
            return j;
        }
        boolean z = n1.b.h(j) && n1.b.g(j);
        long k = this.c.k();
        if (k == u0.l.b.a()) {
            return z ? n1.b.d(j, n1.b.l(j), 0, n1.b.k(j), 0, 10, null) : j;
        }
        if (z && (j2 || i)) {
            n = n1.b.l(j);
            m = n1.b.k(j);
        } else {
            float i2 = u0.l.i(k);
            float g = u0.l.g(k);
            n = (Float.isInfinite(i2) || Float.isNaN(i2)) ? n1.b.n(j) : g.b(j, i2);
            if (!Float.isInfinite(g) && !Float.isNaN(g)) {
                a2 = g.a(j, g);
                long b2 = b(m.a(n, a2));
                return n1.b.d(j, n1.c.g(j, Sa.c.d(u0.l.i(b2))), 0, n1.c.f(j, Sa.c.d(u0.l.g(b2))), 0, 10, null);
            }
            m = n1.b.m(j);
        }
        a2 = m;
        long b22 = b(m.a(n, a2));
        return n1.b.d(j, n1.c.g(j, Sa.c.d(u0.l.i(b22))), 0, n1.c.f(j, Sa.c.d(u0.l.g(b22))), 0, 10, null);
    }

    public int hashCode() {
        int hashCode = ((((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Float.hashCode(this.f)) * 31;
        androidx.compose.ui.graphics.d dVar = this.g;
        return hashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public int maxIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        if (this.c.k() == u0.l.b.a()) {
            return lVar.J(i);
        }
        int J = lVar.J(n1.b.l(f(n1.c.b(0, i, 0, 0, 13, null))));
        return Math.max(Sa.c.d(u0.l.g(b(m.a(i, J)))), J);
    }

    public int maxIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        if (this.c.k() == u0.l.b.a()) {
            return lVar.B0(i);
        }
        int B0 = lVar.B0(n1.b.k(f(n1.c.b(0, 0, 0, i, 7, null))));
        return Math.max(Sa.c.d(u0.l.i(b(m.a(B0, i)))), B0);
    }

    public C measure-3p2s80s(androidx.compose.ui.layout.l lVar, A a2, long j) {
        q C0 = a2.C0(f(j));
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0), 4, null);
    }

    public int minIntrinsicHeight(M0.m mVar, M0.l lVar, int i) {
        if (this.c.k() == u0.l.b.a()) {
            return lVar.q0(i);
        }
        int q0 = lVar.q0(n1.b.l(f(n1.c.b(0, i, 0, 0, 13, null))));
        return Math.max(Sa.c.d(u0.l.g(b(m.a(i, q0)))), q0);
    }

    public int minIntrinsicWidth(M0.m mVar, M0.l lVar, int i) {
        if (this.c.k() == u0.l.b.a()) {
            return lVar.A0(i);
        }
        int A0 = lVar.A0(n1.b.k(f(n1.c.b(0, 0, 0, i, 7, null))));
        return Math.max(Sa.c.d(u0.l.i(b(m.a(A0, i)))), A0);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.c + ", alignment=" + this.d + ", contentScale=" + this.e + ", alpha=" + this.f + ", colorFilter=" + this.g + ')';
    }
}
