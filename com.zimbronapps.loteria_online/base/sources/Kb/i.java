package kb;

import Da.D;
import Da.u;
import Qa.p;
import Qa.q;
import cb.g0;
import cb.g1;
import cb.m;
import cb.n;
import hb.A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i implements m, c, j, g1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "state$volatile");
    public final Ga.i a;
    public Object c;
    private volatile /* synthetic */ Object state$volatile = k.g();
    public List b = new ArrayList(2);
    public int d = -1;
    public Object e = k.d();

    public final class a {
        public final Object a;
        public final q b;
        public final q c;
        public final Object d;
        public final Object e;
        public final q f;
        public Object g;
        public int h = -1;

        public a(Object obj, q qVar, q qVar2, Object obj2, Object obj3, q qVar3) {
            this.a = obj;
            this.b = qVar;
            this.c = qVar2;
            this.d = obj2;
            this.e = obj3;
            this.f = qVar3;
        }

        public final q a(j jVar, Object obj) {
            q qVar = this.f;
            if (qVar != null) {
                return (q) qVar.invoke(jVar, this.d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.g;
            i iVar = i.this;
            if (obj instanceof A) {
                ((A) obj).s(this.h, null, iVar.getContext());
                return;
            }
            g0 g0Var = obj instanceof g0 ? (g0) obj : null;
            if (g0Var != null) {
                g0Var.dispose();
            }
        }

        public final Object c(Object obj, Ga.e eVar) {
            Object obj2 = this.e;
            if (this.d == k.i()) {
                t.e(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((Qa.l) obj2).invoke(eVar);
            }
            t.e(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((p) obj2).invoke(obj, eVar);
        }

        public final Object d(Object obj) {
            return this.c.invoke(this.a, this.d, obj);
        }

        public final boolean e(i iVar) {
            this.b.invoke(this.a, iVar, this.d);
            return i.i(iVar) == k.d();
        }
    }

    public static final class b extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return i.h(i.this, this);
        }
    }

    public i(Ga.i iVar) {
        this.a = iVar;
    }

    public static final /* synthetic */ Object h(i iVar, Ga.e eVar) {
        return iVar.q(eVar);
    }

    public static final /* synthetic */ Object i(i iVar) {
        return iVar.e;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater j() {
        return s();
    }

    public static final /* synthetic */ void k(i iVar, Object obj) {
        iVar.w(obj);
    }

    public static /* synthetic */ Object p(i iVar, Ga.e eVar) {
        return iVar.t() ? iVar.n(eVar) : iVar.q(eVar);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater s() {
        return f;
    }

    private final boolean t() {
        return s().get(this) instanceof a;
    }

    public static /* synthetic */ void v(i iVar, a aVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        iVar.u(aVar, z);
    }

    public void a(A a2, int i) {
        this.c = a2;
        this.d = i;
    }

    public void b(d dVar, Qa.l lVar) {
        v(this, new a(dVar.d(), dVar.a(), dVar.c(), k.i(), lVar, dVar.b()), false, 1, null);
    }

    public void c(f fVar, p pVar) {
        v(this, new a(fVar.d(), fVar.a(), fVar.c(), null, pVar, fVar.b()), false, 1, null);
    }

    public void d(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater s = s();
        do {
            obj = s.get(this);
            if (obj == k.f()) {
                return;
            }
        } while (!s1.b.a(s, this, obj, k.e()));
        List list = this.b;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        this.e = k.d();
        this.b = null;
    }

    public void e(Object obj) {
        this.e = obj;
    }

    public void f(g0 g0Var) {
        this.c = g0Var;
    }

    public boolean g(Object obj, Object obj2) {
        return y(obj, obj2) == 0;
    }

    public Ga.i getContext() {
        return this.a;
    }

    public final void l(Object obj) {
        List list = this.b;
        t.d(list);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).a == obj) {
                    throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                }
            }
        }
    }

    public final void m(a aVar) {
        List<a> list = this.b;
        if (list == null) {
            return;
        }
        for (a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        s().set(this, k.f());
        this.e = k.d();
        this.b = null;
    }

    public final Object n(Ga.e eVar) {
        Object obj = s().get(this);
        t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.e;
        m(aVar);
        return aVar.c(aVar.d(obj2), eVar);
    }

    public Object o(Ga.e eVar) {
        return p(this, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(Ga.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kb.i.b
            if (r0 == 0) goto L13
            r0 = r6
            kb.i$b r0 = (kb.i.b) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kb.i$b r0 = new kb.i$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Ca.t.b(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.a
            kb.i r2 = (kb.i) r2
            Ca.t.b(r6)
            goto L4b
        L3c:
            Ca.t.b(r6)
            r0.a = r5
            r0.d = r4
            java.lang.Object r6 = r5.z(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            r2 = r5
        L4b:
            r6 = 0
            r0.a = r6
            r0.d = r3
            java.lang.Object r6 = r2.n(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.i.q(Ga.e):java.lang.Object");
    }

    public final a r(Object obj) {
        List list = this.b;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void u(a aVar, boolean z) {
        if (s().get(this) instanceof a) {
            return;
        }
        if (!z) {
            l(aVar.a);
        }
        if (!aVar.e(this)) {
            s().set(this, aVar);
            return;
        }
        if (!z) {
            List list = this.b;
            t.d(list);
            list.add(aVar);
        }
        aVar.g = this.c;
        aVar.h = this.d;
        this.c = null;
        this.d = -1;
    }

    public final void w(Object obj) {
        a r = r(obj);
        t.d(r);
        r.g = null;
        r.h = -1;
        u(r, true);
    }

    public final l x(Object obj, Object obj2) {
        return k.b(y(obj, obj2));
    }

    public final int y(Object obj, Object obj2) {
        while (true) {
            Object obj3 = s().get(this);
            if (obj3 instanceof n) {
                a r = r(obj);
                if (r == null) {
                    continue;
                } else {
                    q a2 = r.a(this, obj2);
                    if (s1.b.a(s(), this, obj3, r)) {
                        this.e = obj2;
                        if (k.h((n) obj3, a2)) {
                            return 0;
                        }
                        this.e = k.d();
                        return 2;
                    }
                }
            } else {
                if (t.c(obj3, k.f()) || (obj3 instanceof a)) {
                    return 3;
                }
                if (t.c(obj3, k.e())) {
                    return 2;
                }
                if (t.c(obj3, k.g())) {
                    if (s1.b.a(s(), this, obj3, u.e(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (s1.b.a(s(), this, obj3, D.w0((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        r0 = r0.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (r0 != Ha.c.f()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
    
        Ia.h.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r0 != Ha.c.f()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        return Ca.I.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(Ga.e r6) {
        /*
            r5 = this;
            cb.p r0 = new cb.p
            Ga.e r1 = Ha.b.c(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.E()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = j()
        L11:
            java.lang.Object r2 = r1.get(r5)
            hb.D r3 = kb.k.g()
            if (r2 != r3) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = j()
            boolean r2 = s1.b.a(r3, r5, r2, r0)
            if (r2 == 0) goto L11
            cb.r.c(r0, r5)
            goto L62
        L29:
            boolean r3 = r2 instanceof java.util.List
            if (r3 == 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = j()
            hb.D r4 = kb.k.g()
            boolean r3 = s1.b.a(r3, r5, r2, r4)
            if (r3 == 0) goto L11
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L41:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L11
            java.lang.Object r3 = r2.next()
            k(r5, r3)
            goto L41
        L4f:
            boolean r1 = r2 instanceof kb.i.a
            if (r1 == 0) goto L79
            Ca.I r1 = Ca.I.a
            kb.i$a r2 = (kb.i.a) r2
            java.lang.Object r3 = i(r5)
            Qa.q r2 = r2.a(r5, r3)
            r0.q(r1, r2)
        L62:
            java.lang.Object r0 = r0.w()
            java.lang.Object r1 = Ha.c.f()
            if (r0 != r1) goto L6f
            Ia.h.c(r6)
        L6f:
            java.lang.Object r6 = Ha.c.f()
            if (r0 != r6) goto L76
            return r0
        L76:
            Ca.I r6 = Ca.I.a
            return r6
        L79:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unexpected state: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.i.z(Ga.e):java.lang.Object");
    }
}
