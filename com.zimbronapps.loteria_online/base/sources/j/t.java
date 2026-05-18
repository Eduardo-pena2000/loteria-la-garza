package J;

import Ca.I;
import Da.S;
import F.L;
import I.M;
import cb.O;
import l0.l;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class t {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ C a;
        public final /* synthetic */ C.q b;
        public final /* synthetic */ L c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ float e;
        public final /* synthetic */ g f;
        public final /* synthetic */ Qa.a g;
        public final /* synthetic */ Qa.a h;
        public final /* synthetic */ e.c i;
        public final /* synthetic */ e.b j;
        public final /* synthetic */ int k;
        public final /* synthetic */ D.k l;
        public final /* synthetic */ O m;

        public static final class a extends kotlin.jvm.internal.u implements Qa.q {
            public final /* synthetic */ I.v a;
            public final /* synthetic */ long b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(I.v vVar, long j, int i, int i2) {
                super(3);
                this.a = vVar;
                this.b = j;
                this.c = i;
                this.d = i2;
            }

            public final M0.C a(int i, int i2, Qa.l lVar) {
                return this.a.f0(n1.c.g(this.b, i + this.c), n1.c.f(this.b, i2 + this.d), S.h(), lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (Qa.l) obj3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C c, C.q qVar, L l, boolean z, float f, g gVar, Qa.a aVar, Qa.a aVar2, e.c cVar, e.b bVar, int i, D.k kVar, O o) {
            super(2);
            this.a = c;
            this.b = qVar;
            this.c = l;
            this.d = z;
            this.e = f;
            this.f = gVar;
            this.g = aVar;
            this.h = aVar2;
            this.i = cVar;
            this.j = bVar;
            this.k = i;
            this.l = kVar;
            this.m = o;
        }

        public final u a(I.v vVar, long j) {
            long a2;
            M.a(this.a.D());
            C.q qVar = this.b;
            C.q qVar2 = C.q.Vertical;
            boolean z = qVar == qVar2;
            A.l.a(j, z ? qVar2 : C.q.Horizontal);
            int s0 = z ? vVar.s0(this.c.b(vVar.getLayoutDirection())) : vVar.s0(androidx.compose.foundation.layout.f.g(this.c, vVar.getLayoutDirection()));
            int s02 = z ? vVar.s0(this.c.c(vVar.getLayoutDirection())) : vVar.s0(androidx.compose.foundation.layout.f.f(this.c, vVar.getLayoutDirection()));
            int s03 = vVar.s0(this.c.d());
            int s04 = vVar.s0(this.c.a());
            int i = s03 + s04;
            int i2 = s0 + s02;
            int i3 = z ? i : i2;
            int i4 = (!z || this.d) ? (z && this.d) ? s04 : (z || this.d) ? s02 : s0 : s03;
            int i5 = i3 - i4;
            long j2 = n1.c.j(j, -i2, -i);
            this.a.c0(vVar);
            int s05 = vVar.s0(this.e);
            int k = z ? n1.b.k(j) - i : n1.b.l(j) - i2;
            if (!this.d || k > 0) {
                a2 = n1.o.a(s0, s03);
            } else {
                if (!z) {
                    s0 += k;
                }
                if (z) {
                    s03 += k;
                }
                a2 = n1.o.a(s0, s03);
            }
            long j3 = a2;
            int e = Wa.n.e(this.f.a(vVar, k, s05), 0);
            this.a.d0(n1.c.b(0, this.b == qVar2 ? n1.b.l(j2) : e, 0, this.b != qVar2 ? n1.b.k(j2) : e, 5, null));
            r rVar = (r) this.g.invoke();
            l.a aVar = l0.l.e;
            C c = this.a;
            D.k kVar = this.l;
            l0.l d = aVar.d();
            Qa.l g = d != null ? d.g() : null;
            l0.l e2 = aVar.e(d);
            try {
                int U = c.U(rVar, c.v());
                int d2 = m.d(kVar, k, e, s05, i4, i5, c.v(), c.w(), c.F());
                I i6 = I.a;
                aVar.l(d, e2, g);
                u h = s.h(vVar, ((Number) this.h.invoke()).intValue(), rVar, k, i4, i5, s05, U, d2, j2, this.b, this.i, this.j, this.d, j3, e, this.k, I.m.a(rVar, this.a.J(), this.a.u()), this.l, this.a.K(), this.m, new a(vVar, j, i2, i));
                C.p(this.a, h, false, 2, null);
                return h;
            } catch (Throwable th) {
                aVar.l(d, e2, g);
                throw th;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((I.v) obj, ((n1.b) obj2).r());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Qa.p a(Qa.a r21, J.C r22, F.L r23, boolean r24, C.q r25, int r26, float r27, J.g r28, o0.e.b r29, o0.e.c r30, D.k r31, cb.O r32, Qa.a r33, b0.m r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J.t.a(Qa.a, J.C, F.L, boolean, C.q, int, float, J.g, o0.e$b, o0.e$c, D.k, cb.O, Qa.a, b0.m, int, int):Qa.p");
    }
}
