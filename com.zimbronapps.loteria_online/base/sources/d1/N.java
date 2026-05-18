package d1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public final Object a = a.b(null);
    public final w.z b = new w.z(16);
    public final w.P c = w.d0.b();
    public final i1.u d = new i1.u();

    public static final class b {
        public final t a;
        public final Object b;

        public b(t tVar, Object obj) {
            this.a = tVar;
            this.b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.t.c(this.a, bVar.a) && kotlin.jvm.internal.t.c(this.b, bVar.b);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.a + ", loaderKey=" + this.b + ')';
        }
    }

    public static final class c extends Ia.d {
        public boolean a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return n.this.g(null, null, false, null, this);
        }
    }

    public static final /* synthetic */ i1.u a(n nVar) {
        return nVar.d;
    }

    public static final /* synthetic */ w.P b(n nVar) {
        return nVar.c;
    }

    public static final /* synthetic */ w.z c(n nVar) {
        return nVar.b;
    }

    public static /* synthetic */ void f(n nVar, t tVar, U u, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        nVar.e(tVar, u, obj, z);
    }

    public final a d(t tVar, U u) {
        a aVar;
        b bVar = new b(tVar, u.a());
        synchronized (this.d) {
            aVar = (a) this.b.get(bVar);
            if (aVar == null) {
                aVar = (a) this.c.e(bVar);
            }
        }
        return aVar;
    }

    public final void e(t tVar, U u, Object obj, boolean z) {
        b bVar = new b(tVar, u.a());
        synchronized (this.d) {
            try {
                if (obj == null) {
                    this.c.x(bVar, a.a(this.a));
                    Ca.I i = Ca.I.a;
                } else if (z) {
                    this.c.x(bVar, a.a(a.b(obj)));
                    Ca.I i2 = Ca.I.a;
                } else {
                    this.b.put(bVar, a.a(a.b(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(d1.t r6, d1.U r7, boolean r8, Qa.l r9, Ga.e r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof d1.n.c
            if (r0 == 0) goto L13
            r0 = r10
            d1.n$c r0 = (d1.n.c) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            d1.n$c r0 = new d1.n$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            boolean r8 = r0.a
            java.lang.Object r6 = r0.b
            d1.n$b r6 = (d1.n.b) r6
            Ca.t.b(r10)
            goto L76
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Ca.t.b(r10)
            d1.n$b r10 = new d1.n$b
            java.lang.Object r7 = r7.a()
            r10.<init>(r6, r7)
            i1.u r6 = r5.d
            monitor-enter(r6)
            w.z r7 = r5.b     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L59
            d1.n$a r7 = (d1.n.a) r7     // Catch: java.lang.Throwable -> L59
            if (r7 != 0) goto L5b
            w.P r7 = r5.c     // Catch: java.lang.Throwable -> L59
            java.lang.Object r7 = r7.e(r10)     // Catch: java.lang.Throwable -> L59
            d1.n$a r7 = (d1.n.a) r7     // Catch: java.lang.Throwable -> L59
            goto L5b
        L59:
            r7 = move-exception
            goto Lac
        L5b:
            if (r7 == 0) goto L63
            java.lang.Object r7 = r7.g()     // Catch: java.lang.Throwable -> L59
            monitor-exit(r6)
            return r7
        L63:
            Ca.I r7 = Ca.I.a     // Catch: java.lang.Throwable -> L59
            monitor-exit(r6)
            r0.b = r10
            r0.a = r8
            r0.e = r3
            java.lang.Object r6 = r9.invoke(r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            r4 = r10
            r10 = r6
            r6 = r4
        L76:
            i1.u r7 = r5.d
            monitor-enter(r7)
            if (r10 != 0) goto L89
            w.P r8 = r5.c     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = r5.a     // Catch: java.lang.Throwable -> L87
            d1.n$a r9 = d1.n.a.a(r9)     // Catch: java.lang.Throwable -> L87
            r8.x(r6, r9)     // Catch: java.lang.Throwable -> L87
            goto La6
        L87:
            r6 = move-exception
            goto Laa
        L89:
            if (r8 == 0) goto L99
            w.P r8 = r5.c     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = d1.n.a.b(r10)     // Catch: java.lang.Throwable -> L87
            d1.n$a r9 = d1.n.a.a(r9)     // Catch: java.lang.Throwable -> L87
            r8.x(r6, r9)     // Catch: java.lang.Throwable -> L87
            goto La6
        L99:
            w.z r8 = r5.b     // Catch: java.lang.Throwable -> L87
            java.lang.Object r9 = d1.n.a.b(r10)     // Catch: java.lang.Throwable -> L87
            d1.n$a r9 = d1.n.a.a(r9)     // Catch: java.lang.Throwable -> L87
            r8.put(r6, r9)     // Catch: java.lang.Throwable -> L87
        La6:
            Ca.I r6 = Ca.I.a     // Catch: java.lang.Throwable -> L87
            monitor-exit(r7)
            return r10
        Laa:
            monitor-exit(r7)
            throw r6
        Lac:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.n.g(d1.t, d1.U, boolean, Qa.l, Ga.e):java.lang.Object");
    }

    public static final class a {
        public final Object a;

        public /* synthetic */ a(Object obj) {
            this.a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && kotlin.jvm.internal.t.c(obj, ((a) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.a;
        }

        public int hashCode() {
            return d(this.a);
        }

        public String toString() {
            return f(this.a);
        }

        public static Object b(Object obj) {
            return obj;
        }
    }
}
