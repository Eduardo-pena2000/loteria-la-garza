package V0;

import Ca.I;
import Qa.p;
import Wa.n;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g {
    public final int a;
    public final p b;
    public float c;

    public static final class a extends Ia.d {
        public /* synthetic */ Object a;
        public int c;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return g.a(g.this, 0.0f, this);
        }
    }

    public g(int i, p pVar) {
        this.a = i;
        this.b = pVar;
    }

    public static final /* synthetic */ Object a(g gVar, float f, Ga.e eVar) {
        return gVar.e(f, eVar);
    }

    public final float b() {
        return this.c;
    }

    public final int c(int i) {
        return n.m(i - Sa.c.d(this.c), 0, this.a);
    }

    public final void d() {
        this.c = 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(float r5, Ga.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof V0.g.a
            if (r0 == 0) goto L13
            r0 = r6
            V0.g$a r0 = (V0.g.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            V0.g$a r0 = new V0.g$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Ca.t.b(r6)
            Qa.p r6 = r4.b
            java.lang.Float r5 = Ia.b.c(r5)
            r0.c = r3
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.c
            float r6 = r6 + r5
            r4.c = r6
            Ca.I r5 = Ca.I.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.g.e(float, Ga.e):java.lang.Object");
    }

    public final Object f(int i, int i2, Ga.e eVar) {
        if (i > i2) {
            throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
        }
        int i3 = i2 - i;
        int i4 = this.a;
        if (i3 > i4) {
            throw new IllegalArgumentException(("Expected range (" + i3 + ") to be ≤ viewportSize=" + this.a).toString());
        }
        float f = i;
        float f2 = this.c;
        if (f >= f2 && i2 <= i4 + f2) {
            return I.a;
        }
        if (f >= f2) {
            i = i2 - i4;
        }
        Object g = g(i, eVar);
        return g == Ha.c.f() ? g : I.a;
    }

    public final Object g(float f, Ga.e eVar) {
        Object e = e(f - this.c, eVar);
        return e == Ha.c.f() ? e : I.a;
    }
}
