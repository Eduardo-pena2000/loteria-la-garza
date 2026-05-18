package U4;

import Ca.I;
import M0.A;
import M0.C;
import M0.v;
import Qa.l;
import androidx.compose.ui.layout.q;
import f5.i;
import fb.P;
import fb.z;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements i, v {
    public final z b = P.a(n1.b.a(g.c()));

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
            q.a.P(aVar, this.a, 0, 0, 0.0f, 4, null);
        }
    }

    public static final class b implements fb.e {
        public final /* synthetic */ fb.e a;

        public static final class a implements fb.f {
            public final /* synthetic */ fb.f a;

            public static final class a extends Ia.d {
                public /* synthetic */ Object a;
                public int b;

                public a(Ga.e eVar) {
                    super(eVar);
                }

                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(fb.f fVar) {
                this.a = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r7, Ga.e r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof U4.d.b.a.a
                    if (r0 == 0) goto L13
                    r0 = r8
                    U4.d$b$a$a r0 = (U4.d.b.a.a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    U4.d$b$a$a r0 = new U4.d$b$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.a
                    java.lang.Object r1 = Ha.c.f()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    Ca.t.b(r8)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    Ca.t.b(r8)
                    fb.f r8 = r6.a
                    n1.b r7 = (n1.b) r7
                    long r4 = r7.r()
                    f5.h r7 = U4.a.d(r4)
                    if (r7 == 0) goto L4b
                    r0.b = r3
                    java.lang.Object r7 = r8.emit(r7, r0)
                    if (r7 != r1) goto L4b
                    return r1
                L4b:
                    Ca.I r7 = Ca.I.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: U4.d.b.a.emit(java.lang.Object, Ga.e):java.lang.Object");
            }
        }

        public b(fb.e eVar) {
            this.a = eVar;
        }

        public Object collect(fb.f fVar, Ga.e eVar) {
            Object collect = this.a.collect(new a(fVar), eVar);
            return collect == Ha.c.f() ? collect : I.a;
        }
    }

    public Object b(Ga.e eVar) {
        return fb.g.s(new b(this.b), eVar);
    }

    public C measure-3p2s80s(androidx.compose.ui.layout.l lVar, A a2, long j) {
        this.b.setValue(n1.b.a(j));
        q C0 = a2.C0(j);
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), C0.P0(), null, new a(C0), 4, null);
    }
}
