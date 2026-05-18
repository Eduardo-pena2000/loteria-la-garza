package E8;

import B8.Z;
import Ca.I;
import Qa.p;
import cb.O;
import cb.P;
import cb.Q;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.t;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class m implements l {
    public final Ga.i a;
    public final Z b;
    public final o2.i c;
    public final AtomicReference d;

    public static final class a extends Ia.l implements p {
        public int a;

        public /* synthetic */ class a implements fb.f, kotlin.jvm.internal.n {
            public final /* synthetic */ AtomicReference a;

            public a(AtomicReference atomicReference) {
                this.a = atomicReference;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h hVar, Ga.e eVar) {
                Object a = a.a(this.a, hVar, eVar);
                return a == Ha.c.f() ? a : I.a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof fb.f) && (obj instanceof kotlin.jvm.internal.n)) {
                    return t.c(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj).getFunctionDelegate());
                }
                return false;
            }

            public final Ca.h getFunctionDelegate() {
                return new kotlin.jvm.internal.a(2, this.a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        public a(Ga.e eVar) {
            super(2, eVar);
        }

        public static final /* synthetic */ Object a(AtomicReference atomicReference, h hVar, Ga.e eVar) {
            return i(atomicReference, hVar, eVar);
        }

        public static final /* synthetic */ Object i(AtomicReference atomicReference, h hVar, Ga.e eVar) {
            atomicReference.set(hVar);
            return I.a;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return m.this.new a(eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                fb.e data = m.g(m.this).getData();
                a aVar = new a(m.f(m.this));
                this.a = 1;
                if (data.collect(aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return I.a;
        }
    }

    public static final class b extends Ia.l implements p {
        public int a;

        public b(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return m.this.new b(eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                fb.e data = m.g(m.this).getData();
                this.a = 1;
                obj = fb.g.s(data, this);
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
        public /* synthetic */ Object a;
        public int c;

        public c(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return m.this.b(null, this);
        }
    }

    public static final class d extends Ia.l implements p {
        public int a;
        public final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h hVar, Ga.e eVar) {
            super(2, eVar);
            this.b = hVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(h hVar, Ga.e eVar) {
            return create(hVar, eVar).invokeSuspend(I.a);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new d(this.b, eVar);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            return this.b;
        }
    }

    public m(Ga.i iVar, Z z, o2.i iVar2) {
        t.g(iVar, "backgroundDispatcher");
        t.g(z, "timeProvider");
        t.g(iVar2, "sessionConfigsDataStore");
        this.a = iVar;
        this.b = z;
        this.c = iVar2;
        this.d = new AtomicReference();
        cb.i.d(P.a(iVar), (Ga.i) null, (Q) null, new a(null), 3, (Object) null);
    }

    public static final /* synthetic */ AtomicReference f(m mVar) {
        return mVar.d;
    }

    public static final /* synthetic */ o2.i g(m mVar) {
        return mVar.c;
    }

    public Double a() {
        return h().c();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(E8.h r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof E8.m.c
            if (r0 == 0) goto L13
            r0 = r7
            E8.m$c r0 = (E8.m.c) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            E8.m$c r0 = new E8.m$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            Ca.t.b(r7)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            Ca.t.b(r7)
            o2.i r7 = r5.c     // Catch: java.io.IOException -> L29
            E8.m$d r2 = new E8.m$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r6, r4)     // Catch: java.io.IOException -> L29
            r0.c = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = r7.a(r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to update config values: "
            r7.append(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "FirebaseSessions"
            android.util.Log.w(r7, r6)
        L5d:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: E8.m.b(E8.h, Ga.e):java.lang.Object");
    }

    public boolean c() {
        Long b2 = h().b();
        Integer a2 = h().a();
        return b2 == null || a2 == null || this.b.a().a() - b2.longValue() >= ((long) a2.intValue());
    }

    public Boolean d() {
        return h().e();
    }

    public Integer e() {
        return h().d();
    }

    public final h h() {
        if (this.d.get() == null) {
            Y.a(this.d, (Object) null, cb.i.f((Ga.i) null, new b(null), 1, (Object) null));
        }
        Object obj = this.d.get();
        t.f(obj, "get(...)");
        return (h) obj;
    }
}
