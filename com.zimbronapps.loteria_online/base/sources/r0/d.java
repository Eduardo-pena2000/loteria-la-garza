package r0;

import O0.D;
import O0.H0;
import O0.I0;
import O0.J0;
import O0.j;
import Qa.l;
import Qa.p;
import androidx.compose.ui.e;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends e.c implements I0, j, f, D {
    public static final a g = new a(null);
    public static final int h = 8;
    public p a;
    public final l b;
    public final Object c;
    public d d;
    public f e;
    public long f;

    public static final class a {

        public static final class a {
            public static final a a = new a();
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends u implements l {
        public final /* synthetic */ r0.b a;
        public final /* synthetic */ d b;
        public final /* synthetic */ J c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0.b bVar, d dVar, J j) {
            super(1);
            this.a = bVar;
            this.b = dVar;
            this.c = j;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 invoke(d dVar) {
            if (!dVar.isAttached()) {
                return H0.b;
            }
            if (!(d.H1(dVar) == null)) {
                L0.a.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
            }
            l G1 = d.G1(dVar);
            d.J1(dVar, G1 != null ? (f) G1.invoke(this.a) : null);
            boolean z = d.H1(dVar) != null;
            if (z) {
                d.F1(this.b).a(dVar);
            }
            J j = this.c;
            j.a = j.a || z;
            return H0.a;
        }
    }

    public static final class c extends u implements l {
        public final /* synthetic */ r0.b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(r0.b bVar) {
            super(1);
            this.a = bVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 invoke(d dVar) {
            if (!dVar.getNode().isAttached()) {
                return H0.b;
            }
            f H1 = d.H1(dVar);
            if (H1 != null) {
                H1.A0(this.a);
            }
            d.J1(dVar, null);
            d.I1(dVar, null);
            return H0.a;
        }
    }

    public static final class d extends u implements l {
        public final /* synthetic */ O a;
        public final /* synthetic */ d b;
        public final /* synthetic */ r0.b c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(O o, d dVar, r0.b bVar) {
            super(1);
            this.a = o;
            this.b = dVar;
            this.c = bVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 invoke(I0 i0) {
            d dVar = (d) i0;
            if (!d.F1(this.b).b(dVar) || !e.a(dVar, h.a(this.c))) {
                return H0.a;
            }
            this.a.a = i0;
            return H0.c;
        }
    }

    public /* synthetic */ d(p pVar, l lVar, int i, k kVar) {
        this((i & 1) != 0 ? null : pVar, (i & 2) != 0 ? null : lVar);
    }

    public static final /* synthetic */ r0.c F1(d dVar) {
        return dVar.K1();
    }

    public static final /* synthetic */ l G1(d dVar) {
        return dVar.b;
    }

    public static final /* synthetic */ f H1(d dVar) {
        return dVar.e;
    }

    public static final /* synthetic */ void I1(d dVar, d dVar2) {
        dVar.d = dVar2;
    }

    public static final /* synthetic */ void J1(d dVar, f fVar) {
        dVar.e = fVar;
    }

    private final r0.c K1() {
        return O0.k.o(this).getDragAndDropManager();
    }

    public void A0(r0.b bVar) {
        e.c(this, new c(bVar));
    }

    public Object B() {
        return this.c;
    }

    public boolean E1(r0.b bVar) {
        J j = new J();
        e.c(this, new b(bVar, this, j));
        return j.a;
    }

    public void J(long j) {
        this.f = j;
    }

    public void K(r0.b bVar) {
        I0 i0;
        d dVar;
        d dVar2 = this.d;
        if (dVar2 == null || !e.a(dVar2, h.a(bVar))) {
            if (getNode().isAttached()) {
                O o = new O();
                J0.f(this, new d(o, this, bVar));
                i0 = (I0) o.a;
            } else {
                i0 = null;
            }
            dVar = (d) i0;
        } else {
            dVar = dVar2;
        }
        if (dVar != null && dVar2 == null) {
            e.b(dVar, bVar);
            f fVar = this.e;
            if (fVar != null) {
                fVar.T(bVar);
            }
        } else if (dVar == null && dVar2 != null) {
            f fVar2 = this.e;
            if (fVar2 != null) {
                e.b(fVar2, bVar);
            }
            dVar2.T(bVar);
        } else if (!t.c(dVar, dVar2)) {
            if (dVar != null) {
                e.b(dVar, bVar);
            }
            if (dVar2 != null) {
                dVar2.T(bVar);
            }
        } else if (dVar != null) {
            dVar.K(bVar);
        } else {
            f fVar3 = this.e;
            if (fVar3 != null) {
                fVar3.K(bVar);
            }
        }
        this.d = dVar;
    }

    public final long L1() {
        return this.f;
    }

    public void P(r0.b bVar) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.P(bVar);
            return;
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.P(bVar);
        }
    }

    public void T(r0.b bVar) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.T(bVar);
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.T(bVar);
        }
        this.d = null;
    }

    public boolean Z0(r0.b bVar) {
        d dVar = this.d;
        if (dVar != null) {
            return dVar.Z0(bVar);
        }
        f fVar = this.e;
        if (fVar != null) {
            return fVar.Z0(bVar);
        }
        return false;
    }

    public void onDetach() {
        this.e = null;
        this.d = null;
    }

    public void q1(r0.b bVar) {
        f fVar = this.e;
        if (fVar != null) {
            fVar.q1(bVar);
            return;
        }
        d dVar = this.d;
        if (dVar != null) {
            dVar.q1(bVar);
        }
    }

    public d(p pVar, l lVar) {
        this.a = pVar;
        this.b = lVar;
        this.c = a.a.a;
        this.f = r.b.a();
    }
}
