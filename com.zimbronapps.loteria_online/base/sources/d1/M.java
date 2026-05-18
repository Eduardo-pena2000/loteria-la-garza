package d1;

import b0.C0;
import b0.U1;
import b0.h2;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements h2 {
    public final List a;
    public final q0 b;
    public final n c;
    public final Qa.l d;
    public final U e;
    public final C0 f;
    public boolean g = true;

    public static final class a extends Ia.d {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public /* synthetic */ Object e;
        public int g;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return m.this.f(this);
        }
    }

    public static final class b extends Ia.l implements Qa.l {
        public int a;
        public final /* synthetic */ t c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t tVar, Ga.e eVar) {
            super(1, eVar);
            this.c = tVar;
        }

        public final Ga.e create(Ga.e eVar) {
            return m.this.new b(this.c, eVar);
        }

        public final Object invoke(Ga.e eVar) {
            return create(eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                m mVar = m.this;
                t tVar = this.c;
                this.a = 1;
                obj = mVar.g(tVar, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return obj;
        }
    }

    public static final class c extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return m.this.g(null, this);
        }
    }

    public static final class d extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ t c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(t tVar, Ga.e eVar) {
            super(2, eVar);
            this.c = tVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return m.this.new d(this.c, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                U a = m.a(m.this);
                t tVar = this.c;
                this.a = 1;
                obj = a.c(tVar, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return obj;
        }
    }

    public m(List list, Object obj, q0 q0Var, n nVar, Qa.l lVar, U u) {
        this.a = list;
        this.b = q0Var;
        this.c = nVar;
        this.d = lVar;
        this.e = u;
        this.f = U1.i(obj, null, 2, null);
    }

    public static final /* synthetic */ U a(m mVar) {
        return mVar.e;
    }

    private void setValue(Object obj) {
        this.f.setValue(obj);
    }

    public final boolean e() {
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0067 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:16:0x0067, B:18:0x007e, B:24:0x00a4, B:28:0x00d8, B:36:0x0052, B:39:0x005e), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:16:0x0067, B:18:0x007e, B:24:0x00a4, B:28:0x00d8, B:36:0x0052, B:39:0x005e), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8 A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003b, blocks: (B:12:0x0036, B:16:0x0067, B:18:0x007e, B:24:0x00a4, B:28:0x00d8, B:36:0x0052, B:39:0x005e), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007c -> B:14:0x00eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00e6 -> B:13:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(Ga.e r19) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.m.f(Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(d1.t r7, Ga.e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d1.m.c
            if (r0 == 0) goto L13
            r0 = r8
            d1.m$c r0 = (d1.m.c) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            d1.m$c r0 = new d1.m$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.a
            d1.t r7 = (d1.t) r7
            Ca.t.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            goto L4f
        L2e:
            r8 = move-exception
            goto L51
        L30:
            r7 = move-exception
            goto L7d
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            Ca.t.b(r8)
            d1.m$d r8 = new d1.m$d     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.a = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.d = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r8 = cb.c1.d(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r8 != r1) goto L4f
            return r1
        L4f:
            r4 = r8
            goto L87
        L51:
            Ga.i r1 = r0.getContext()
            cb.L$b r2 = cb.L.O8
            Ga.i$b r1 = r1.get(r2)
            cb.L r1 = (cb.L) r1
            if (r1 == 0) goto L87
            Ga.i r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.handleException(r0, r2)
            goto L87
        L7d:
            Ga.i r8 = r0.getContext()
            boolean r8 = cb.E0.p(r8)
            if (r8 == 0) goto L88
        L87:
            return r4
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.m.g(d1.t, Ga.e):java.lang.Object");
    }

    public Object getValue() {
        return this.f.getValue();
    }
}
