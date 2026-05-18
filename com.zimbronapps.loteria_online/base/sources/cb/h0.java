package cb;

import Ga.i;
import cb.B0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class H0 implements B0, w, Q0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(H0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(H0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public static final class a extends p {
        public final H0 i;

        public a(Ga.e eVar, H0 h0) {
            super(eVar, 1);
            this.i = h0;
        }

        public String K() {
            return "AwaitContinuation";
        }

        public Throwable u(B0 b0) {
            Throwable e;
            Object c0 = this.i.c0();
            return (!(c0 instanceof c) || (e = ((c) c0).e()) == null) ? c0 instanceof C ? ((C) c0).a : b0.getCancellationException() : e;
        }
    }

    public static final class b extends G0 {
        public final H0 e;
        public final c f;
        public final v g;
        public final Object h;

        public b(H0 h0, c cVar, v vVar, Object obj) {
            this.e = h0;
            this.f = cVar;
            this.g = vVar;
            this.h = obj;
        }

        public boolean u() {
            return false;
        }

        public void v(Throwable th) {
            H0.A(this.e, this.f, this.g, this.h);
        }
    }

    public static final class c implements w0 {
        public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;
        public final M0 a;

        public c(M0 m0, boolean z, Throwable th) {
            this.a = m0;
            this._isCompleting$volatile = z ? 1 : 0;
            this._rootCause$volatile = th;
        }

        public static final /* synthetic */ AtomicReferenceFieldUpdater f() {
            return d;
        }

        public static final /* synthetic */ AtomicIntegerFieldUpdater g() {
            return b;
        }

        public static final /* synthetic */ AtomicReferenceFieldUpdater h() {
            return c;
        }

        public final void a(Throwable th) {
            Throwable e = e();
            if (e == null) {
                o(th);
                return;
            }
            if (th == e) {
                return;
            }
            Object d2 = d();
            if (d2 == null) {
                n(th);
                return;
            }
            if (d2 instanceof Throwable) {
                if (th == d2) {
                    return;
                }
                ArrayList c2 = c();
                c2.add(d2);
                c2.add(th);
                n(c2);
                return;
            }
            if (d2 instanceof ArrayList) {
                ((ArrayList) d2).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + d2).toString());
        }

        public M0 b() {
            return this.a;
        }

        public final ArrayList c() {
            return new ArrayList(4);
        }

        public final Object d() {
            return f().get(this);
        }

        public final Throwable e() {
            return (Throwable) h().get(this);
        }

        public final boolean i() {
            return e() != null;
        }

        public boolean isActive() {
            return e() == null;
        }

        public final boolean j() {
            return g().get(this) != 0;
        }

        public final boolean k() {
            return d() == I0.e();
        }

        public final List l(Throwable th) {
            ArrayList arrayList;
            Object d2 = d();
            if (d2 == null) {
                arrayList = c();
            } else if (d2 instanceof Throwable) {
                ArrayList c2 = c();
                c2.add(d2);
                arrayList = c2;
            } else {
                if (!(d2 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + d2).toString());
                }
                arrayList = (ArrayList) d2;
            }
            Throwable e = e();
            if (e != null) {
                arrayList.add(0, e);
            }
            if (th != null && !kotlin.jvm.internal.t.c(th, e)) {
                arrayList.add(th);
            }
            n(I0.e());
            return arrayList;
        }

        public final void m(boolean z) {
            g().set(this, z ? 1 : 0);
        }

        public final void n(Object obj) {
            f().set(this, obj);
        }

        public final void o(Throwable th) {
            h().set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }
    }

    public final class d extends G0 {
        public final kb.j e;

        public d(kb.j jVar) {
            this.e = jVar;
        }

        public boolean u() {
            return false;
        }

        public void v(Throwable th) {
            Object c0 = H0.this.c0();
            if (!(c0 instanceof C)) {
                c0 = I0.h(c0);
            }
            this.e.g(H0.this, c0);
        }
    }

    public final class e extends G0 {
        public final kb.j e;

        public e(kb.j jVar) {
            this.e = jVar;
        }

        public boolean u() {
            return false;
        }

        public void v(Throwable th) {
            this.e.g(H0.this, Ca.I.a);
        }
    }

    public static final class f extends Ia.k implements Qa.p {
        public Object a;
        public Object b;
        public int c;
        public /* synthetic */ Object d;

        public f(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            f fVar = H0.this.new f(eVar);
            fVar.d = obj;
            return fVar;
        }

        public final Object invoke(Ya.j jVar, Ga.e eVar) {
            return ((f) create(jVar, eVar)).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006b -> B:6:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:6:0x0081). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r6.c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.b
                hb.o r1 = (hb.o) r1
                java.lang.Object r3 = r6.a
                hb.n r3 = (hb.n) r3
                java.lang.Object r4 = r6.d
                Ya.j r4 = (Ya.j) r4
                Ca.t.b(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                Ca.t.b(r7)
                goto L86
            L2a:
                Ca.t.b(r7)
                java.lang.Object r7 = r6.d
                Ya.j r7 = (Ya.j) r7
                cb.H0 r1 = cb.H0.this
                java.lang.Object r1 = r1.c0()
                boolean r4 = r1 instanceof cb.v
                if (r4 == 0) goto L48
                cb.v r1 = (cb.v) r1
                cb.w r1 = r1.e
                r6.c = r3
                java.lang.Object r7 = r7.a(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof cb.w0
                if (r3 == 0) goto L86
                cb.w0 r1 = (cb.w0) r1
                cb.M0 r1 = r1.b()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.j()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
                kotlin.jvm.internal.t.e(r3, r4)
                hb.o r3 = (hb.o) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.t.c(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof cb.v
                if (r7 == 0) goto L81
                r7 = r1
                cb.v r7 = (cb.v) r7
                cb.w r7 = r7.e
                r6.d = r4
                r6.a = r3
                r6.b = r1
                r6.c = r2
                java.lang.Object r7 = r4.a(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                hb.o r1 = r1.k()
                goto L63
            L86:
                Ca.I r7 = Ca.I.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: cb.H0.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ class g extends kotlin.jvm.internal.q implements Qa.q {
        public static final g a = new g();

        public g() {
            super(3, H0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void b(H0 h0, kb.j jVar, Object obj) {
            H0.D(h0, jVar, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((H0) obj, (kb.j) obj2, obj3);
            return Ca.I.a;
        }
    }

    public /* synthetic */ class h extends kotlin.jvm.internal.q implements Qa.q {
        public static final h a = new h();

        public h() {
            super(3, H0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(H0 h0, Object obj, Object obj2) {
            return H0.C(h0, obj, obj2);
        }
    }

    public /* synthetic */ class i extends kotlin.jvm.internal.q implements Qa.q {
        public static final i a = new i();

        public i() {
            super(3, H0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void b(H0 h0, kb.j jVar, Object obj) {
            H0.E(h0, jVar, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((H0) obj, (kb.j) obj2, obj3);
            return Ca.I.a;
        }
    }

    public H0(boolean z) {
        this._state$volatile = z ? I0.c() : I0.d();
    }

    public static final /* synthetic */ void A(H0 h0, c cVar, v vVar, Object obj) {
        h0.R(cVar, vVar, obj);
    }

    public static final /* synthetic */ Object C(H0 h0, Object obj, Object obj2) {
        return h0.t0(obj, obj2);
    }

    public static final /* synthetic */ void D(H0 h0, kb.j jVar, Object obj) {
        h0.u0(jVar, obj);
    }

    public static final /* synthetic */ void E(H0 h0, kb.j jVar, Object obj) {
        h0.A0(jVar, obj);
    }

    public static /* synthetic */ CancellationException G0(H0 h0, Throwable th, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i2 & 1) != 0) {
            str = null;
        }
        return h0.F0(th, str);
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater d0() {
        return b;
    }

    private static final /* synthetic */ AtomicReferenceFieldUpdater e0() {
        return a;
    }

    public static final /* synthetic */ String y(H0 h0) {
        return h0.O();
    }

    public final void A0(kb.j jVar, Object obj) {
        if (k0()) {
            jVar.f(E0.o(this, false, new e(jVar), 1, null));
        } else {
            jVar.e(Ca.I.a);
        }
    }

    public final void B0(G0 g0) {
        Object c0;
        do {
            c0 = c0();
            if (!(c0 instanceof G0)) {
                if (!(c0 instanceof w0) || ((w0) c0).b() == null) {
                    return;
                }
                g0.q();
                return;
            }
            if (c0 != g0) {
                return;
            }
        } while (!s1.b.a(e0(), this, c0, I0.c()));
    }

    public final void C0(u uVar) {
        d0().set(this, uVar);
    }

    public final int D0(Object obj) {
        if (obj instanceof j0) {
            if (((j0) obj).isActive()) {
                return 0;
            }
            if (!s1.b.a(e0(), this, obj, I0.c())) {
                return -1;
            }
            x0();
            return 1;
        }
        if (!(obj instanceof v0)) {
            return 0;
        }
        if (!s1.b.a(e0(), this, obj, ((v0) obj).b())) {
            return -1;
        }
        x0();
        return 1;
    }

    public final String E0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof w0 ? ((w0) obj).isActive() ? "Active" : "New" : obj instanceof C ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.i() ? "Cancelling" : cVar.j() ? "Completing" : "Active";
    }

    public final void F(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                Ca.g.a(th, th2);
            }
        }
    }

    public final CancellationException F0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = y(this);
            }
            cancellationException = new C0(str, th, this);
        }
        return cancellationException;
    }

    public final Object H(Ga.e eVar) {
        Object c0;
        do {
            c0 = c0();
            if (!(c0 instanceof w0)) {
                if (c0 instanceof C) {
                    throw ((C) c0).a;
                }
                return I0.h(c0);
            }
        } while (D0(c0) < 0);
        return I(eVar);
    }

    public final String H0() {
        return p0() + '{' + E0(c0()) + '}';
    }

    public final Object I(Ga.e eVar) {
        a aVar = new a(Ha.b.c(eVar), this);
        aVar.E();
        r.a(aVar, E0.o(this, false, new R0(aVar), 1, null));
        Object w = aVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w;
    }

    public final boolean I0(w0 w0Var, Object obj) {
        if (!s1.b.a(e0(), this, w0Var, I0.g(obj))) {
            return false;
        }
        v0(null);
        w0(obj);
        Q(w0Var, obj);
        return true;
    }

    public final boolean J(Throwable th) {
        return K(th);
    }

    public final boolean J0(w0 w0Var, Throwable th) {
        M0 a0 = a0(w0Var);
        if (a0 == null) {
            return false;
        }
        if (!s1.b.a(e0(), this, w0Var, new c(a0, false, th))) {
            return false;
        }
        r0(a0, th);
        return true;
    }

    public final boolean K(Object obj) {
        Object a2 = I0.a();
        if (Z() && (a2 = M(obj)) == I0.b) {
            return true;
        }
        if (a2 == I0.a()) {
            a2 = m0(obj);
        }
        if (a2 == I0.a() || a2 == I0.b) {
            return true;
        }
        if (a2 == I0.f()) {
            return false;
        }
        G(a2);
        return true;
    }

    public final Object K0(Object obj, Object obj2) {
        return !(obj instanceof w0) ? I0.a() : ((!(obj instanceof j0) && !(obj instanceof G0)) || (obj instanceof v) || (obj2 instanceof C)) ? L0((w0) obj, obj2) : I0((w0) obj, obj2) ? obj2 : I0.b();
    }

    public void L(Throwable th) {
        K(th);
    }

    public final Object L0(w0 w0Var, Object obj) {
        M0 a0 = a0(w0Var);
        if (a0 == null) {
            return I0.b();
        }
        c cVar = w0Var instanceof c ? (c) w0Var : null;
        if (cVar == null) {
            cVar = new c(a0, false, null);
        }
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        synchronized (cVar) {
            if (cVar.j()) {
                return I0.a();
            }
            cVar.m(true);
            if (cVar != w0Var && !s1.b.a(e0(), this, w0Var, cVar)) {
                return I0.b();
            }
            boolean i2 = cVar.i();
            C c2 = obj instanceof C ? (C) obj : null;
            if (c2 != null) {
                cVar.a(c2.a);
            }
            Throwable e2 = i2 ? null : cVar.e();
            o.a = e2;
            Ca.I i3 = Ca.I.a;
            if (e2 != null) {
                r0(a0, e2);
            }
            v q0 = q0(a0);
            if (q0 != null && M0(cVar, q0, obj)) {
                return I0.b;
            }
            a0.f(2);
            v q02 = q0(a0);
            return (q02 == null || !M0(cVar, q02, obj)) ? T(cVar, obj) : I0.b;
        }
    }

    public final Object M(Object obj) {
        Object K0;
        do {
            Object c0 = c0();
            if (!(c0 instanceof w0) || ((c0 instanceof c) && ((c) c0).j())) {
                return I0.a();
            }
            K0 = K0(c0, new C(S(obj), false, 2, null));
        } while (K0 == I0.b());
        return K0;
    }

    public final boolean M0(c cVar, v vVar, Object obj) {
        while (E0.n(vVar.e, false, new b(this, cVar, vVar, obj)) == O0.a) {
            vVar = q0(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean N(Throwable th) {
        if (j0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        u b0 = b0();
        return (b0 == null || b0 == O0.a) ? z : b0.a(th) || z;
    }

    public String O() {
        return "Job was cancelled";
    }

    public boolean P(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return K(th) && X();
    }

    public final void Q(w0 w0Var, Object obj) {
        u b0 = b0();
        if (b0 != null) {
            b0.dispose();
            C0(O0.a);
        }
        C c2 = obj instanceof C ? (C) obj : null;
        Throwable th = c2 != null ? c2.a : null;
        if (!(w0Var instanceof G0)) {
            M0 b2 = w0Var.b();
            if (b2 != null) {
                s0(b2, th);
                return;
            }
            return;
        }
        try {
            ((G0) w0Var).v(th);
        } catch (Throwable th2) {
            g0(new D("Exception in completion handler " + w0Var + " for " + this, th2));
        }
    }

    public final void R(c cVar, v vVar, Object obj) {
        v q0 = q0(vVar);
        if (q0 == null || !M0(cVar, q0, obj)) {
            cVar.b().f(2);
            v q02 = q0(vVar);
            if (q02 == null || !M0(cVar, q02, obj)) {
                G(T(cVar, obj));
            }
        }
    }

    public final Throwable S(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C0(y(this), null, this) : th;
        }
        kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((Q0) obj).r();
    }

    public final Object T(c cVar, Object obj) {
        boolean i2;
        Throwable W;
        C c2 = obj instanceof C ? (C) obj : null;
        Throwable th = c2 != null ? c2.a : null;
        synchronized (cVar) {
            i2 = cVar.i();
            List l = cVar.l(th);
            W = W(cVar, l);
            if (W != null) {
                F(W, l);
            }
        }
        if (W != null && W != th) {
            obj = new C(W, false, 2, null);
        }
        if (W != null && (N(W) || f0(W))) {
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C) obj).c();
        }
        if (!i2) {
            v0(W);
        }
        w0(obj);
        s1.b.a(e0(), this, cVar, I0.g(obj));
        Q(cVar, obj);
        return obj;
    }

    public final Object U() {
        Object c0 = c0();
        if (c0 instanceof w0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (c0 instanceof C) {
            throw ((C) c0).a;
        }
        return I0.h(c0);
    }

    public final Throwable V(Object obj) {
        C c2 = obj instanceof C ? (C) obj : null;
        if (c2 != null) {
            return c2.a;
        }
        return null;
    }

    public final Throwable W(c cVar, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.i()) {
                return new C0(y(this), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof a1) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof a1)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean X() {
        return true;
    }

    public final kb.f Y() {
        g gVar = g.a;
        kotlin.jvm.internal.t.e(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Qa.q qVar = (Qa.q) kotlin.jvm.internal.V.e(gVar, 3);
        h hVar = h.a;
        kotlin.jvm.internal.t.e(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kb.g(this, qVar, (Qa.q) kotlin.jvm.internal.V.e(hVar, 3), null, 8, null);
    }

    public boolean Z() {
        return false;
    }

    public final M0 a0(w0 w0Var) {
        M0 b2 = w0Var.b();
        if (b2 != null) {
            return b2;
        }
        if (w0Var instanceof j0) {
            return new M0();
        }
        if (w0Var instanceof G0) {
            z0((G0) w0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + w0Var).toString());
    }

    public final u attachChild(w wVar) {
        v vVar = new v(wVar);
        vVar.w(this);
        while (true) {
            Object c0 = c0();
            if (c0 instanceof j0) {
                j0 j0Var = (j0) c0;
                if (!j0Var.isActive()) {
                    y0(j0Var);
                } else if (s1.b.a(e0(), this, c0, vVar)) {
                    break;
                }
            } else {
                if (!(c0 instanceof w0)) {
                    Object c02 = c0();
                    C c2 = c02 instanceof C ? (C) c02 : null;
                    vVar.v(c2 != null ? c2.a : null);
                    return O0.a;
                }
                M0 b2 = ((w0) c0).b();
                if (b2 == null) {
                    kotlin.jvm.internal.t.e(c0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    z0((G0) c0);
                } else if (!b2.c(vVar, 7)) {
                    boolean c3 = b2.c(vVar, 3);
                    Object c03 = c0();
                    if (c03 instanceof c) {
                        r2 = ((c) c03).e();
                    } else {
                        C c4 = c03 instanceof C ? (C) c03 : null;
                        if (c4 != null) {
                            r2 = c4.a;
                        }
                    }
                    vVar.v(r2);
                    if (!c3) {
                        return O0.a;
                    }
                }
            }
        }
        return vVar;
    }

    public final u b0() {
        return (u) d0().get(this);
    }

    public final Object c0() {
        return e0().get(this);
    }

    public /* synthetic */ void cancel() {
        B0.a.a(this);
    }

    public final void d(Q0 q0) {
        K(q0);
    }

    public boolean f0(Throwable th) {
        return false;
    }

    public Object fold(Object obj, Qa.p pVar) {
        return B0.a.c(this, obj, pVar);
    }

    public i.b get(i.c cVar) {
        return B0.a.d(this, cVar);
    }

    public final CancellationException getCancellationException() {
        Object c0 = c0();
        if (!(c0 instanceof c)) {
            if (c0 instanceof w0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (c0 instanceof C) {
                return G0(this, ((C) c0).a, null, 1, null);
            }
            return new C0(T.a(this) + " has completed normally", null, this);
        }
        Throwable e2 = ((c) c0).e();
        if (e2 != null) {
            CancellationException F0 = F0(e2, T.a(this) + " is cancelling");
            if (F0 != null) {
                return F0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final Ya.h getChildren() {
        return Ya.k.b(new f(null));
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object c0 = c0();
        if (c0 instanceof w0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return V(c0);
    }

    public final i.c getKey() {
        return B0.P8;
    }

    public final kb.d getOnJoin() {
        i iVar = i.a;
        kotlin.jvm.internal.t.e(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new kb.e(this, (Qa.q) kotlin.jvm.internal.V.e(iVar, 3), null, 4, null);
    }

    public B0 getParent() {
        u b0 = b0();
        if (b0 != null) {
            return b0.getParent();
        }
        return null;
    }

    public final void h0(B0 b0) {
        if (b0 == null) {
            C0(O0.a);
            return;
        }
        b0.start();
        u attachChild = b0.attachChild(this);
        C0(attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            C0(O0.a);
        }
    }

    public final g0 i0(boolean z, G0 g0) {
        boolean z2;
        boolean c2;
        g0.w(this);
        while (true) {
            Object c0 = c0();
            z2 = true;
            if (!(c0 instanceof j0)) {
                if (!(c0 instanceof w0)) {
                    z2 = false;
                    break;
                }
                w0 w0Var = (w0) c0;
                M0 b2 = w0Var.b();
                if (b2 == null) {
                    kotlin.jvm.internal.t.e(c0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    z0((G0) c0);
                } else {
                    if (g0.u()) {
                        c cVar = w0Var instanceof c ? (c) w0Var : null;
                        Throwable e2 = cVar != null ? cVar.e() : null;
                        if (e2 != null) {
                            if (z) {
                                g0.v(e2);
                            }
                            return O0.a;
                        }
                        c2 = b2.c(g0, 5);
                    } else {
                        c2 = b2.c(g0, 1);
                    }
                    if (c2) {
                        break;
                    }
                }
            } else {
                j0 j0Var = (j0) c0;
                if (!j0Var.isActive()) {
                    y0(j0Var);
                } else if (s1.b.a(e0(), this, c0, g0)) {
                    break;
                }
            }
        }
        if (z2) {
            return g0;
        }
        if (z) {
            Object c02 = c0();
            C c3 = c02 instanceof C ? (C) c02 : null;
            g0.v(c3 != null ? c3.a : null);
        }
        return O0.a;
    }

    public final g0 invokeOnCompletion(Qa.l lVar) {
        return i0(true, new A0(lVar));
    }

    public boolean isActive() {
        Object c0 = c0();
        return (c0 instanceof w0) && ((w0) c0).isActive();
    }

    public final boolean isCancelled() {
        Object c0 = c0();
        return (c0 instanceof C) || ((c0 instanceof c) && ((c) c0).i());
    }

    public final boolean isCompleted() {
        return !(c0() instanceof w0);
    }

    public boolean j0() {
        return false;
    }

    public final Object join(Ga.e eVar) {
        if (k0()) {
            Object l0 = l0(eVar);
            return l0 == Ha.c.f() ? l0 : Ca.I.a;
        }
        E0.k(eVar.getContext());
        return Ca.I.a;
    }

    public final boolean k0() {
        Object c0;
        do {
            c0 = c0();
            if (!(c0 instanceof w0)) {
                return false;
            }
        } while (D0(c0) < 0);
        return true;
    }

    public final Object l0(Ga.e eVar) {
        p pVar = new p(Ha.b.c(eVar), 1);
        pVar.E();
        r.a(pVar, E0.o(this, false, new S0(pVar), 1, null));
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w == Ha.c.f() ? w : Ca.I.a;
    }

    public final Object m0(Object obj) {
        Throwable th = null;
        while (true) {
            Object c0 = c0();
            if (c0 instanceof c) {
                synchronized (c0) {
                    if (((c) c0).k()) {
                        return I0.f();
                    }
                    boolean i2 = ((c) c0).i();
                    if (obj != null || !i2) {
                        if (th == null) {
                            th = S(obj);
                        }
                        ((c) c0).a(th);
                    }
                    Throwable e2 = i2 ? null : ((c) c0).e();
                    if (e2 != null) {
                        r0(((c) c0).b(), e2);
                    }
                    return I0.a();
                }
            }
            if (!(c0 instanceof w0)) {
                return I0.f();
            }
            if (th == null) {
                th = S(obj);
            }
            w0 w0Var = (w0) c0;
            if (!w0Var.isActive()) {
                Object K0 = K0(c0, new C(th, false, 2, null));
                if (K0 == I0.a()) {
                    throw new IllegalStateException(("Cannot happen in " + c0).toString());
                }
                if (K0 != I0.b()) {
                    return K0;
                }
            } else if (J0(w0Var, th)) {
                return I0.a();
            }
        }
    }

    public Ga.i minusKey(i.c cVar) {
        return B0.a.e(this, cVar);
    }

    public final boolean n0(Object obj) {
        Object K0;
        do {
            K0 = K0(c0(), obj);
            if (K0 == I0.a()) {
                return false;
            }
            if (K0 == I0.b) {
                return true;
            }
        } while (K0 == I0.b());
        G(K0);
        return true;
    }

    public final Object o0(Object obj) {
        Object K0;
        do {
            K0 = K0(c0(), obj);
            if (K0 == I0.a()) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, V(obj));
            }
        } while (K0 == I0.b());
        return K0;
    }

    public String p0() {
        return T.a(this);
    }

    public Ga.i plus(Ga.i iVar) {
        return B0.a.f(this, iVar);
    }

    public final v q0(hb.o oVar) {
        while (oVar.p()) {
            oVar = oVar.l();
        }
        while (true) {
            oVar = oVar.k();
            if (!oVar.p()) {
                if (oVar instanceof v) {
                    return (v) oVar;
                }
                if (oVar instanceof M0) {
                    return null;
                }
            }
        }
    }

    public CancellationException r() {
        Throwable th;
        Object c0 = c0();
        if (c0 instanceof c) {
            th = ((c) c0).e();
        } else if (c0 instanceof C) {
            th = ((C) c0).a;
        } else {
            if (c0 instanceof w0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + c0).toString());
            }
            th = null;
        }
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C0("Parent job is " + E0(c0), th, this);
    }

    public final void r0(M0 m0, Throwable th) {
        v0(th);
        m0.f(4);
        Object j = m0.j();
        kotlin.jvm.internal.t.e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D d2 = null;
        for (hb.o oVar = (hb.o) j; !kotlin.jvm.internal.t.c(oVar, m0); oVar = oVar.k()) {
            if ((oVar instanceof G0) && ((G0) oVar).u()) {
                try {
                    ((G0) oVar).v(th);
                } catch (Throwable th2) {
                    if (d2 != null) {
                        Ca.g.a(d2, th2);
                    } else {
                        d2 = new D("Exception in completion handler " + oVar + " for " + this, th2);
                        Ca.I i2 = Ca.I.a;
                    }
                }
            }
        }
        if (d2 != null) {
            g0(d2);
        }
        N(th);
    }

    public final void s0(M0 m0, Throwable th) {
        m0.f(1);
        Object j = m0.j();
        kotlin.jvm.internal.t.e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D d2 = null;
        for (hb.o oVar = (hb.o) j; !kotlin.jvm.internal.t.c(oVar, m0); oVar = oVar.k()) {
            if (oVar instanceof G0) {
                try {
                    ((G0) oVar).v(th);
                } catch (Throwable th2) {
                    if (d2 != null) {
                        Ca.g.a(d2, th2);
                    } else {
                        d2 = new D("Exception in completion handler " + oVar + " for " + this, th2);
                        Ca.I i2 = Ca.I.a;
                    }
                }
            }
        }
        if (d2 != null) {
            g0(d2);
        }
    }

    public final boolean start() {
        int D0;
        do {
            D0 = D0(c0());
            if (D0 == 0) {
                return false;
            }
        } while (D0 != 1);
        return true;
    }

    public final Object t0(Object obj, Object obj2) {
        if (obj2 instanceof C) {
            throw ((C) obj2).a;
        }
        return obj2;
    }

    public String toString() {
        return H0() + '@' + T.b(this);
    }

    public final void u0(kb.j jVar, Object obj) {
        Object c0;
        do {
            c0 = c0();
            if (!(c0 instanceof w0)) {
                if (!(c0 instanceof C)) {
                    c0 = I0.h(c0);
                }
                jVar.e(c0);
                return;
            }
        } while (D0(c0) < 0);
        jVar.f(E0.o(this, false, new d(jVar), 1, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [cb.v0] */
    public final void y0(j0 j0Var) {
        M0 m0 = new M0();
        if (!j0Var.isActive()) {
            m0 = new v0(m0);
        }
        s1.b.a(e0(), this, j0Var, m0);
    }

    public final void z0(G0 g0) {
        g0.e(new M0());
        s1.b.a(e0(), this, g0, g0.k());
    }

    public /* synthetic */ boolean cancel(Throwable th) {
        Throwable c0;
        if (th == null || (c0 = G0(this, th, null, 1, null)) == null) {
            c0 = new C0(y(this), null, this);
        }
        L(c0);
        return true;
    }

    public B0 plus(B0 b0) {
        return B0.a.g(this, b0);
    }

    public final g0 invokeOnCompletion(boolean z, boolean z2, Qa.l lVar) {
        G0 a0;
        if (z) {
            a0 = new z0(lVar);
        } else {
            a0 = new A0(lVar);
        }
        return i0(z2, a0);
    }

    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0(y(this), null, this);
        }
        L(cancellationException);
    }

    public void x0() {
    }

    public void G(Object obj) {
    }

    public void g0(Throwable th) {
        throw th;
    }

    public void v0(Throwable th) {
    }

    public void w0(Object obj) {
    }
}
