package D;

import C.C;
import C.u;
import Ca.I;
import Ca.t;
import Qa.p;
import cb.O;
import kotlin.jvm.internal.L;
import z.B;
import z.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements C {
    public final j a;
    public final z b;
    public final z.i c;
    public o0.k d = androidx.compose.foundation.gestures.d.e();

    public static final class a extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return h.d(h.this, null, 0.0f, null, this);
        }
    }

    public static final class b extends Ia.l implements p {
        public Object a;
        public int b;
        public final /* synthetic */ float d;
        public final /* synthetic */ Qa.l e;
        public final /* synthetic */ u f;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ L a;
            public final /* synthetic */ Qa.l b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(L l, Qa.l lVar) {
                super(1);
                this.a = l;
                this.b = lVar;
            }

            public final void a(float f) {
                L l = this.a;
                float f2 = l.a - f;
                l.a = f2;
                this.b.invoke(Float.valueOf(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return I.a;
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ L a;
            public final /* synthetic */ Qa.l b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(L l, Qa.l lVar) {
                super(1);
                this.a = l;
                this.b = lVar;
            }

            public final void a(float f) {
                L l = this.a;
                float f2 = l.a - f;
                l.a = f2;
                this.b.invoke(Float.valueOf(f2));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Number) obj).floatValue());
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, Qa.l lVar, u uVar, Ga.e eVar) {
            super(2, eVar);
            this.d = f;
            this.e = lVar;
            this.f = uVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return h.this.new b(this.d, this.e, this.f, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            L l;
            Object f = Ha.c.f();
            int i = this.b;
            if (i == 0) {
                t.b(obj);
                float b2 = h.g(h.this).b(this.d, B.a(h.e(h.this), 0.0f, this.d));
                if (Float.isNaN(b2)) {
                    throw new IllegalStateException("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                l = new L();
                float abs = Math.abs(b2) * Math.signum(this.d);
                l.a = abs;
                this.e.invoke(Ia.b.c(abs));
                h hVar = h.this;
                u uVar = this.f;
                float f2 = l.a;
                float f3 = this.d;
                b bVar = new b(l, this.e);
                this.a = l;
                this.b = 1;
                obj = h.h(hVar, uVar, f2, f3, bVar, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    if (i == 2) {
                        t.b(obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l = (L) this.a;
                t.b(obj);
            }
            z.k kVar = (z.k) obj;
            float a2 = h.g(h.this).a(((Number) kVar.g()).floatValue());
            if (Float.isNaN(a2)) {
                throw new IllegalStateException("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            l.a = a2;
            u uVar2 = this.f;
            z.k g = z.l.g(kVar, 0.0f, 0.0f, 0L, 0L, false, 30, null);
            z.i f4 = h.f(h.this);
            a aVar = new a(l, this.e);
            this.a = null;
            this.b = 2;
            obj = i.c(uVar2, a2, a2, g, f4, aVar, this);
            return obj == f ? f : obj;
        }
    }

    public static final class c extends Ia.d {
        public /* synthetic */ Object a;
        public int c;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return h.this.c(null, 0.0f, null, this);
        }
    }

    public static final class d extends Ia.d {
        public /* synthetic */ Object a;
        public int c;

        public d(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return h.h(h.this, null, 0.0f, 0.0f, null, this);
        }
    }

    public h(j jVar, z zVar, z.i iVar) {
        this.a = jVar;
        this.b = zVar;
        this.c = iVar;
    }

    public static final /* synthetic */ Object d(h hVar, u uVar, float f, Qa.l lVar, Ga.e eVar) {
        return hVar.i(uVar, f, lVar, eVar);
    }

    public static final /* synthetic */ z e(h hVar) {
        return hVar.b;
    }

    public static final /* synthetic */ z.i f(h hVar) {
        return hVar.c;
    }

    public static final /* synthetic */ j g(h hVar) {
        return hVar.a;
    }

    public static final /* synthetic */ Object h(h hVar, u uVar, float f, float f2, Qa.l lVar, Ga.e eVar) {
        return hVar.l(uVar, f, f2, lVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(C.u r5, float r6, Qa.l r7, Ga.e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof D.h.c
            if (r0 == 0) goto L13
            r0 = r8
            D.h$c r0 = (D.h.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            D.h$c r0 = new D.h$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Ca.t.b(r8)
            r0.c = r3
            java.lang.Object r8 = r4.i(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            D.a r8 = (D.a) r8
            java.lang.Object r5 = r8.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            z.k r6 = r8.b()
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L53
            goto L5d
        L53:
            java.lang.Object r5 = r6.g()
            java.lang.Number r5 = (java.lang.Number) r5
            float r7 = r5.floatValue()
        L5d:
            java.lang.Float r5 = Ia.b.c(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: D.h.c(C.u, float, Qa.l, Ga.e):java.lang.Object");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.t.c(hVar.c, this.c) && kotlin.jvm.internal.t.c(hVar.b, this.b) && kotlin.jvm.internal.t.c(hVar.a, this.a);
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(C.u r11, float r12, Qa.l r13, Ga.e r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof D.h.a
            if (r0 == 0) goto L13
            r0 = r14
            D.h$a r0 = (D.h.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            D.h$a r0 = new D.h$a
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r11 = r0.a
            r13 = r11
            Qa.l r13 = (Qa.l) r13
            Ca.t.b(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            Ca.t.b(r14)
            o0.k r14 = r10.d
            D.h$b r2 = new D.h$b
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r6, r7, r8, r9)
            r0.a = r13
            r0.d = r3
            java.lang.Object r14 = cb.i.g(r14, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            D.a r14 = (D.a) r14
            r11 = 0
            java.lang.Float r11 = Ia.b.c(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: D.h.i(C.u, float, Qa.l, Ga.e):java.lang.Object");
    }

    public final boolean j(float f, float f2) {
        return Math.abs(B.a(this.b, 0.0f, f2)) >= Math.abs(f);
    }

    public final Object k(u uVar, float f, float f2, Qa.l lVar, Ga.e eVar) {
        return i.d(uVar, f, f2, j(f, f2) ? new D.c(this.b) : new m(this.c), lVar, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(C.u r19, float r20, float r21, Qa.l r22, Ga.e r23) {
        /*
            r18 = this;
            r0 = r23
            boolean r1 = r0 instanceof D.h.d
            if (r1 == 0) goto L18
            r1 = r0
            D.h$d r1 = (D.h.d) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.c = r2
            r8 = r18
        L16:
            r7 = r1
            goto L20
        L18:
            D.h$d r1 = new D.h$d
            r8 = r18
            r1.<init>(r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.a
            java.lang.Object r1 = Ha.c.f()
            int r2 = r7.c
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            Ca.t.b(r0)
            goto L73
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            Ca.t.b(r0)
            float r0 = java.lang.Math.abs(r20)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L46
            goto L4e
        L46:
            float r0 = java.lang.Math.abs(r21)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L60
        L4e:
            r16 = 28
            r17 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r9 = r20
            r10 = r21
            z.k r0 = z.l.c(r9, r10, r11, r13, r15, r16, r17)
            goto L79
        L60:
            r7.c = r3
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            java.lang.Object r0 = r2.k(r3, r4, r5, r6, r7)
            if (r0 != r1) goto L73
            return r1
        L73:
            D.a r0 = (D.a) r0
            z.k r0 = r0.c()
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: D.h.l(C.u, float, float, Qa.l, Ga.e):java.lang.Object");
    }
}
