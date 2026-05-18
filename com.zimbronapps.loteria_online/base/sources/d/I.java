package D;

import C.C;
import Ca.I;
import Wa.n;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.u;
import z.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final float a = n1.h.g(400);

    public static final class a extends Ia.d {
        public float a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int e;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return i.a(null, 0.0f, null, null, null, this);
        }
    }

    public static final class b extends u implements Qa.l {
        public final /* synthetic */ float a;
        public final /* synthetic */ L b;
        public final /* synthetic */ C.u c;
        public final /* synthetic */ Qa.l d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, L l, C.u uVar, Qa.l lVar) {
            super(1);
            this.a = f;
            this.b = l;
            this.c = uVar;
            this.d = lVar;
        }

        public final void a(z.h hVar) {
            if (Math.abs(((Number) hVar.e()).floatValue()) < Math.abs(this.a)) {
                i.b(hVar, this.c, this.d, ((Number) hVar.e()).floatValue() - this.b.a);
                this.b.a = ((Number) hVar.e()).floatValue();
                return;
            }
            float e = i.e(((Number) hVar.e()).floatValue(), this.a);
            i.b(hVar, this.c, this.d, e - this.b.a);
            hVar.a();
            this.b.a = e;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z.h) obj);
            return I.a;
        }
    }

    public static final class c extends Ia.d {
        public float a;
        public float b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int f;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.f |= Integer.MIN_VALUE;
            return i.c(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    public static final class d extends u implements Qa.l {
        public final /* synthetic */ float a;
        public final /* synthetic */ L b;
        public final /* synthetic */ C.u c;
        public final /* synthetic */ Qa.l d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(float f, L l, C.u uVar, Qa.l lVar) {
            super(1);
            this.a = f;
            this.b = l;
            this.c = uVar;
            this.d = lVar;
        }

        public final void a(z.h hVar) {
            float e = i.e(((Number) hVar.e()).floatValue(), this.a);
            float f = e - this.b.a;
            float a = this.c.a(f);
            this.d.invoke(Float.valueOf(a));
            if (Math.abs(f - a) > 0.5f || e != ((Number) hVar.e()).floatValue()) {
                hVar.a();
            }
            this.b.a += a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((z.h) obj);
            return I.a;
        }
    }

    public static final /* synthetic */ Object a(C.u uVar, float f, z.k kVar, z zVar, Qa.l lVar, Ga.e eVar) {
        return f(uVar, f, kVar, zVar, lVar, eVar);
    }

    public static final /* synthetic */ void b(z.h hVar, C.u uVar, Qa.l lVar, float f) {
        g(hVar, uVar, lVar, f);
    }

    public static final /* synthetic */ Object c(C.u uVar, float f, float f2, z.k kVar, z.i iVar, Qa.l lVar, Ga.e eVar) {
        return h(uVar, f, f2, kVar, iVar, lVar, eVar);
    }

    public static final /* synthetic */ Object d(C.u uVar, float f, float f2, D.b bVar, Qa.l lVar, Ga.e eVar) {
        return i(uVar, f, f2, bVar, lVar, eVar);
    }

    public static final /* synthetic */ float e(float f, float f2) {
        return j(f, f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(C.u r5, float r6, z.k r7, z.z r8, Qa.l r9, Ga.e r10) {
        /*
            boolean r0 = r10 instanceof D.i.a
            if (r0 == 0) goto L13
            r0 = r10
            D.i$a r0 = (D.i.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            D.i$a r0 = new D.i$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.a
            java.lang.Object r5 = r0.c
            kotlin.jvm.internal.L r5 = (kotlin.jvm.internal.L) r5
            java.lang.Object r7 = r0.b
            z.k r7 = (z.k) r7
            Ca.t.b(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            Ca.t.b(r10)
            kotlin.jvm.internal.L r10 = new kotlin.jvm.internal.L
            r10.<init>()
            java.lang.Object r2 = r7.g()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            D.i$b r4 = new D.i$b
            r4.<init>(r6, r10, r5, r9)
            r0.b = r7
            r0.c = r10
            r0.a = r6
            r0.e = r3
            java.lang.Object r5 = z.m0.g(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            D.a r8 = new D.a
            float r5 = r5.a
            float r6 = r6 - r5
            java.lang.Float r5 = Ia.b.c(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: D.i.f(C.u, float, z.k, z.z, Qa.l, Ga.e):java.lang.Object");
    }

    public static final void g(z.h hVar, C.u uVar, Qa.l lVar, float f) {
        float a2 = uVar.a(f);
        lVar.invoke(Float.valueOf(a2));
        if (Math.abs(f - a2) > 0.5f) {
            hVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(C.u r12, float r13, float r14, z.k r15, z.i r16, Qa.l r17, Ga.e r18) {
        /*
            r0 = r18
            boolean r1 = r0 instanceof D.i.c
            if (r1 == 0) goto L16
            r1 = r0
            D.i$c r1 = (D.i.c) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            D.i$c r1 = new D.i$c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.e
            java.lang.Object r1 = Ha.c.f()
            int r2 = r7.f
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.b
            float r2 = r7.a
            java.lang.Object r3 = r7.d
            kotlin.jvm.internal.L r3 = (kotlin.jvm.internal.L) r3
            java.lang.Object r4 = r7.c
            z.k r4 = (z.k) r4
            Ca.t.b(r0)
            r10 = r2
            r0 = r4
            goto L90
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            Ca.t.b(r0)
            kotlin.jvm.internal.L r0 = new kotlin.jvm.internal.L
            r0.<init>()
            java.lang.Object r2 = r15.g()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r4 = Ia.b.c(r13)
            java.lang.Object r2 = r15.g()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L6a
            r2 = r3
            goto L6b
        L6a:
            r2 = 0
        L6b:
            r5 = r2 ^ 1
            D.i$d r6 = new D.i$d
            r2 = r12
            r9 = r14
            r10 = r17
            r6.<init>(r14, r0, r12, r10)
            r9 = r15
            r7.c = r9
            r7.d = r0
            r10 = r13
            r7.a = r10
            r7.b = r8
            r7.f = r3
            r2 = r15
            r3 = r4
            r4 = r16
            java.lang.Object r2 = z.m0.i(r2, r3, r4, r5, r6, r7)
            if (r2 != r1) goto L8d
            return r1
        L8d:
            r3 = r0
            r1 = r8
            r0 = r9
        L90:
            java.lang.Object r2 = r0.g()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = j(r2, r1)
            D.a r11 = new D.a
            float r1 = r3.a
            float r10 = r10 - r1
            java.lang.Float r10 = Ia.b.c(r10)
            r8 = 29
            r9 = 0
            r1 = 0
            r3 = 0
            r5 = 0
            r7 = 0
            z.k r0 = z.l.g(r0, r1, r2, r3, r5, r7, r8, r9)
            r11.<init>(r10, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: D.i.h(C.u, float, float, z.k, z.i, Qa.l, Ga.e):java.lang.Object");
    }

    public static final Object i(C.u uVar, float f, float f2, D.b bVar, Qa.l lVar, Ga.e eVar) {
        return bVar.a(uVar, Ia.b.c(f), Ia.b.c(f2), lVar, eVar);
    }

    public static final float j(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return f2 > 0.0f ? n.h(f, f2) : n.d(f, f2);
    }

    public static final float k() {
        return a;
    }

    public static final C l(j jVar, z zVar, z.i iVar) {
        return new h(jVar, zVar, iVar);
    }
}
