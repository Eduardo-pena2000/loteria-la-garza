package Z4;

import Ga.e;
import Ia.d;
import Z4.b;
import e5.h;
import e5.j;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements b.a {
    public final h a;
    public final List b;
    public final int c;
    public final h d;
    public final f5.h e;
    public final T4.b f;
    public final boolean g;

    public static final class a extends d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return c.this.g(null, this);
        }
    }

    public c(h hVar, List list, int i, h hVar2, f5.h hVar3, T4.b bVar, boolean z) {
        this.a = hVar;
        this.b = list;
        this.c = i;
        this.d = hVar2;
        this.e = hVar3;
        this.f = bVar;
        this.g = z;
    }

    public static /* synthetic */ c d(c cVar, int i, h hVar, f5.h hVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cVar.c;
        }
        if ((i2 & 2) != 0) {
            hVar = cVar.a();
        }
        if ((i2 & 4) != 0) {
            hVar2 = cVar.getSize();
        }
        return cVar.c(i, hVar, hVar2);
    }

    public h a() {
        return this.d;
    }

    public final void b(h hVar, b bVar) {
        if (hVar.l() != this.a.l()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's context.").toString());
        }
        if (hVar.m() == j.a) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot set the request's data to null.").toString());
        }
        if (hVar.M() != this.a.M()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's target.").toString());
        }
        if (hVar.z() != this.a.z()) {
            throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (hVar.K() == this.a.K()) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + bVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    public final c c(int i, h hVar, f5.h hVar2) {
        return new c(this.a, this.b, i, hVar, hVar2, this.f, this.g);
    }

    public final T4.b e() {
        return this.f;
    }

    public final boolean f() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(e5.h r12, Ga.e r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof Z4.c.a
            if (r0 == 0) goto L13
            r0 = r13
            Z4.c$a r0 = (Z4.c.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            Z4.c$a r0 = new Z4.c$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r12 = r0.b
            Z4.b r12 = (Z4.b) r12
            java.lang.Object r0 = r0.a
            Z4.c r0 = (Z4.c) r0
            Ca.t.b(r13)
            goto L74
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            Ca.t.b(r13)
            int r13 = r11.c
            if (r13 <= 0) goto L4c
            java.util.List r2 = r11.b
            int r13 = r13 - r3
            java.lang.Object r13 = r2.get(r13)
            Z4.b r13 = (Z4.b) r13
            r11.b(r12, r13)
        L4c:
            java.util.List r13 = r11.b
            int r2 = r11.c
            java.lang.Object r13 = r13.get(r2)
            Z4.b r13 = (Z4.b) r13
            int r2 = r11.c
            int r5 = r2 + 1
            r8 = 4
            r9 = 0
            r7 = 0
            r4 = r11
            r6 = r12
            Z4.c r12 = d(r4, r5, r6, r7, r8, r9)
            r0.a = r11
            r0.b = r13
            r0.e = r3
            java.lang.Object r12 = r13.intercept(r12, r0)
            if (r12 != r1) goto L70
            return r1
        L70:
            r0 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L74:
            e5.i r13 = (e5.i) r13
            e5.h r1 = r13.b()
            r0.b(r1, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Z4.c.g(e5.h, Ga.e):java.lang.Object");
    }

    public f5.h getSize() {
        return this.e;
    }
}
