package hb;

import cb.T;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class o {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public /* synthetic */ class a extends kotlin.jvm.internal.D {
        public a(Object obj) {
            super(obj, T.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return T.a(this.receiver);
        }
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater m() {
        return a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater n() {
        return b;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater o() {
        return c;
    }

    public final boolean c(o oVar, int i) {
        o l;
        do {
            l = l();
            if (l instanceof m) {
                return (((m) l).d & i) == 0 && l.c(oVar, i);
            }
        } while (!l.d(oVar, this));
        return true;
    }

    public final boolean d(o oVar, o oVar2) {
        n().set(oVar, this);
        m().set(oVar, oVar2);
        if (!s1.b.a(m(), this, oVar2, oVar)) {
            return false;
        }
        oVar.i(oVar2);
        return true;
    }

    public final boolean e(o oVar) {
        n().set(oVar, this);
        m().set(oVar, this);
        while (j() == this) {
            if (s1.b.a(m(), this, this, oVar)) {
                oVar.i(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        c(new m(i), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (s1.b.a(m(), r3, r2, ((hb.x) r4).a) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final hb.o g() {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = n()
            java.lang.Object r0 = r0.get(r7)
            hb.o r0 = (hb.o) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            return r2
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = n()
            boolean r0 = s1.b.a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.p()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            boolean r5 = r4 instanceof hb.x
            if (r5 == 0) goto L4f
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m()
            hb.x r4 = (hb.x) r4
            hb.o r4 = r4.a
            boolean r2 = s1.b.a(r5, r3, r2, r4)
            if (r2 != 0) goto L42
            goto L0
        L42:
            r2 = r3
            goto Lc
        L44:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = n()
            java.lang.Object r2 = r4.get(r2)
            hb.o r2 = (hb.o) r2
            goto Ld
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            kotlin.jvm.internal.t.e(r4, r3)
            r3 = r4
            hb.o r3 = (hb.o) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.o.g():hb.o");
    }

    public final o h(o oVar) {
        while (oVar.p()) {
            oVar = (o) n().get(oVar);
        }
        return oVar;
    }

    public final void i(o oVar) {
        o oVar2;
        AtomicReferenceFieldUpdater n = n();
        do {
            oVar2 = (o) n.get(oVar);
            if (j() != oVar) {
                return;
            }
        } while (!s1.b.a(n(), oVar, oVar2, this));
        if (p()) {
            oVar.g();
        }
    }

    public final Object j() {
        return m().get(this);
    }

    public final o k() {
        o oVar;
        Object j = j();
        x xVar = j instanceof x ? (x) j : null;
        if (xVar != null && (oVar = xVar.a) != null) {
            return oVar;
        }
        kotlin.jvm.internal.t.e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (o) j;
    }

    public final o l() {
        o g = g();
        return g == null ? h((o) n().get(this)) : g;
    }

    public boolean p() {
        return j() instanceof x;
    }

    public boolean q() {
        return r() == null;
    }

    public final o r() {
        Object j;
        o oVar;
        do {
            j = j();
            if (j instanceof x) {
                return ((x) j).a;
            }
            if (j == this) {
                return (o) j;
            }
            kotlin.jvm.internal.t.e(j, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            oVar = (o) j;
        } while (!s1.b.a(m(), this, j, oVar.s()));
        oVar.g();
        return null;
    }

    public final x s() {
        x xVar = (x) o().get(this);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this);
        o().set(this, xVar2);
        return xVar2;
    }

    public String toString() {
        return new a(this) + '@' + T.b(this);
    }
}
