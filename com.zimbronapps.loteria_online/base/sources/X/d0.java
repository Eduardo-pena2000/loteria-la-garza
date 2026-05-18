package X;

import Ca.s;
import b0.C0;
import b0.U1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d0 {
    public final lb.a a = lb.g.b(false, 1, (Object) null);
    public final C0 b = U1.i(null, null, 2, null);

    public static final class a implements Z {
        public final g0 a;
        public final cb.n b;

        public a(g0 g0Var, cb.n nVar) {
            this.a = g0Var;
            this.b = nVar;
        }

        public g0 a() {
            return this.a;
        }

        public void b() {
            if (this.b.isActive()) {
                cb.n nVar = this.b;
                s.a aVar = Ca.s.b;
                nVar.resumeWith(Ca.s.b(f0.b));
            }
        }

        public void dismiss() {
            if (this.b.isActive()) {
                cb.n nVar = this.b;
                s.a aVar = Ca.s.b;
                nVar.resumeWith(Ca.s.b(f0.a));
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.t.c(a(), aVar.a()) && kotlin.jvm.internal.t.c(this.b, aVar.b);
        }

        public int hashCode() {
            return (a().hashCode() * 31) + this.b.hashCode();
        }
    }

    public static final class b implements g0 {
        public final String a;
        public final String b;
        public final boolean c;
        public final b0 d;

        public b(String str, String str2, boolean z, b0 b0Var) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = b0Var;
        }

        public String a() {
            return this.b;
        }

        public boolean b() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.t.c(getMessage(), bVar.getMessage()) && kotlin.jvm.internal.t.c(a(), bVar.a()) && b() == bVar.b() && getDuration() == bVar.getDuration();
        }

        public b0 getDuration() {
            return this.d;
        }

        public String getMessage() {
            return this.a;
        }

        public int hashCode() {
            int hashCode = getMessage().hashCode() * 31;
            String a = a();
            return ((((hashCode + (a != null ? a.hashCode() : 0)) * 31) + Boolean.hashCode(b())) * 31) + getDuration().hashCode();
        }
    }

    public static final class c extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return d0.this.d(null, this);
        }
    }

    public static final /* synthetic */ void a(d0 d0Var, Z z) {
        d0Var.c(z);
    }

    public static /* synthetic */ Object f(d0 d0Var, String str, String str2, boolean z, b0 b0Var, Ga.e eVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            b0Var = str3 == null ? b0.Short : b0.Indefinite;
        }
        return d0Var.e(str, str3, z2, b0Var, eVar);
    }

    public final Z b() {
        return (Z) this.b.getValue();
    }

    public final void c(Z z) {
        this.b.setValue(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(X.g0 r9, Ga.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.d0.c
            if (r0 == 0) goto L13
            r0 = r10
            X.d0$c r0 = (X.d0.c) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            X.d0$c r0 = new X.d0$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L5b
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r9 = r0.d
            X.d0$c r9 = (X.d0.c) r9
            java.lang.Object r9 = r0.c
            lb.a r9 = (lb.a) r9
            java.lang.Object r1 = r0.b
            X.g0 r1 = (X.g0) r1
            java.lang.Object r0 = r0.a
            X.d0 r0 = (X.d0) r0
            Ca.t.b(r10)     // Catch: java.lang.Throwable -> L3e
            goto La9
        L3e:
            r10 = move-exception
            goto Lb2
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L49:
            java.lang.Object r9 = r0.c
            lb.a r9 = (lb.a) r9
            java.lang.Object r2 = r0.b
            X.g0 r2 = (X.g0) r2
            java.lang.Object r6 = r0.a
            X.d0 r6 = (X.d0) r6
            Ca.t.b(r10)
            r10 = r9
            r9 = r2
            goto L70
        L5b:
            Ca.t.b(r10)
            lb.a r10 = r8.a
            r0.a = r8
            r0.b = r9
            r0.c = r10
            r0.g = r4
            java.lang.Object r2 = r10.d(r5, r0)
            if (r2 != r1) goto L6f
            return r1
        L6f:
            r6 = r8
        L70:
            r0.a = r6     // Catch: java.lang.Throwable -> L9c
            r0.b = r9     // Catch: java.lang.Throwable -> L9c
            r0.c = r10     // Catch: java.lang.Throwable -> L9c
            r0.d = r0     // Catch: java.lang.Throwable -> L9c
            r0.g = r3     // Catch: java.lang.Throwable -> L9c
            cb.p r2 = new cb.p     // Catch: java.lang.Throwable -> L9c
            Ga.e r3 = Ha.b.c(r0)     // Catch: java.lang.Throwable -> L9c
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9c
            r2.E()     // Catch: java.lang.Throwable -> L9c
            X.d0$a r3 = new X.d0$a     // Catch: java.lang.Throwable -> L9c
            r3.<init>(r9, r2)     // Catch: java.lang.Throwable -> L9c
            a(r6, r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r9 = r2.w()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r2 = Ha.c.f()     // Catch: java.lang.Throwable -> L9c
            if (r9 != r2) goto La2
            Ia.h.c(r0)     // Catch: java.lang.Throwable -> L9c
            goto La2
        L9c:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
            goto Lb2
        La2:
            if (r9 != r1) goto La5
            return r1
        La5:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        La9:
            r0.c(r5)     // Catch: java.lang.Throwable -> Lb0
            r9.e(r5)
            return r10
        Lb0:
            r10 = move-exception
            goto Lb6
        Lb2:
            r0.c(r5)     // Catch: java.lang.Throwable -> Lb0
            throw r10     // Catch: java.lang.Throwable -> Lb0
        Lb6:
            r9.e(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.d0.d(X.g0, Ga.e):java.lang.Object");
    }

    public final Object e(String str, String str2, boolean z, b0 b0Var, Ga.e eVar) {
        return d(new b(str, str2, z, b0Var), eVar);
    }
}
