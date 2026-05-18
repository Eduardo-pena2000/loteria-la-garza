package androidx.compose.foundation.gestures;

import A.b0;
import C.A;
import C.n;
import C.q;
import C.u;
import C.y;
import Ca.I;
import Ca.t;
import E.m;
import Ga.i;
import I0.C;
import I0.Q;
import Qa.l;
import Qa.p;
import kotlin.jvm.internal.L;
import o0.k;
import z.m0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final l a = a.a;
    public static final u b = new c();
    public static final k c = new b();
    public static final d d = new d();

    public static final class a extends kotlin.jvm.internal.u implements l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C c) {
            return Boolean.valueOf(!Q.g(c.n(), Q.a.b()));
        }
    }

    public static final class b implements k {
        public Object fold(Object obj, p pVar) {
            return k.a.a(this, obj, pVar);
        }

        public i.b get(i.c cVar) {
            return k.a.b(this, cVar);
        }

        public float h() {
            return 1.0f;
        }

        public i minusKey(i.c cVar) {
            return k.a.c(this, cVar);
        }

        public i plus(i iVar) {
            return k.a.d(this, iVar);
        }
    }

    public static final class c implements u {
        public float a(float f) {
            return f;
        }
    }

    public static final class d implements n1.d {
        public float e1() {
            return 1.0f;
        }

        public float getDensity() {
            return 1.0f;
        }
    }

    public static final class e extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public e(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return d.d(null, 0L, this);
        }
    }

    public static final class f extends Ia.l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ A c;
        public final /* synthetic */ long d;
        public final /* synthetic */ L e;

        public static final class a extends kotlin.jvm.internal.u implements p {
            public final /* synthetic */ L a;
            public final /* synthetic */ A b;
            public final /* synthetic */ C.p c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(L l, A a, C.p pVar) {
                super(2);
                this.a = l;
                this.b = a;
                this.c = pVar;
            }

            public final void a(float f, float f2) {
                float f3 = f - this.a.a;
                A a = this.b;
                this.a.a += a.t(a.A(this.c.b(a.B(a.t(f3)), H0.e.a.b())));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(A a2, long j, L l, Ga.e eVar) {
            super(2, eVar);
            this.c = a2;
            this.d = j;
            this.e = l;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C.p pVar, Ga.e eVar) {
            return create(pVar, eVar).invokeSuspend(I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            f fVar = new f(this.c, this.d, this.e, eVar);
            fVar.b = obj;
            return fVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                C.p pVar = (C.p) this.b;
                float A = this.c.A(this.d);
                a aVar = new a(this.e, this.c, pVar);
                this.a = 1;
                if (m0.e(0.0f, A, 0.0f, null, aVar, this, 12, null) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public static final /* synthetic */ l a() {
        return a;
    }

    public static final /* synthetic */ u b() {
        return b;
    }

    public static final /* synthetic */ d c() {
        return d;
    }

    public static final /* synthetic */ Object d(A a2, long j, Ga.e eVar) {
        return j(a2, j, eVar);
    }

    public static final k e() {
        return c;
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, y yVar, q qVar, b0 b0Var, boolean z, boolean z2, n nVar, m mVar, C.d dVar) {
        return eVar.then(new ScrollableElement(yVar, qVar, b0Var, z, z2, nVar, mVar, dVar));
    }

    public static final androidx.compose.ui.e g(androidx.compose.ui.e eVar, y yVar, q qVar, boolean z, boolean z2, n nVar, m mVar) {
        return h(eVar, yVar, qVar, null, z, z2, nVar, mVar, null, 128, null);
    }

    public static /* synthetic */ androidx.compose.ui.e h(androidx.compose.ui.e eVar, y yVar, q qVar, b0 b0Var, boolean z, boolean z2, n nVar, m mVar, C.d dVar, int i, Object obj) {
        return f(eVar, yVar, qVar, b0Var, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : nVar, (i & 64) != 0 ? null : mVar, (i & 128) != 0 ? null : dVar);
    }

    public static /* synthetic */ androidx.compose.ui.e i(androidx.compose.ui.e eVar, y yVar, q qVar, boolean z, boolean z2, n nVar, m mVar, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return g(eVar, yVar, qVar, z3, z2, (i & 16) != 0 ? null : nVar, (i & 32) != 0 ? null : mVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(C.A r11, long r12, Ga.e r14) {
        /*
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.d.e
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.d$e r0 = (androidx.compose.foundation.gestures.d.e) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.d$e r0 = new androidx.compose.foundation.gestures.d$e
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r11 = r0.b
            kotlin.jvm.internal.L r11 = (kotlin.jvm.internal.L) r11
            java.lang.Object r12 = r0.a
            C.A r12 = (C.A) r12
            Ca.t.b(r14)
            r14 = r11
            r11 = r12
            goto L5c
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            Ca.t.b(r14)
            kotlin.jvm.internal.L r14 = new kotlin.jvm.internal.L
            r14.<init>()
            A.U r2 = A.U.Default
            androidx.compose.foundation.gestures.d$f r10 = new androidx.compose.foundation.gestures.d$f
            r9 = 0
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r14
            r4.<init>(r5, r6, r8, r9)
            r0.a = r11
            r0.b = r14
            r0.d = r3
            java.lang.Object r12 = r11.v(r2, r10, r0)
            if (r12 != r1) goto L5c
            return r1
        L5c:
            float r12 = r14.a
            long r11 = r11.B(r12)
            u0.f r11 = u0.f.d(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.d.j(C.A, long, Ga.e):java.lang.Object");
    }
}
