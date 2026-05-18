package I0;

import I0.u;
import O0.F0;
import O0.H0;
import O0.I0;
import O0.J0;
import O0.v0;
import P0.p0;
import androidx.compose.ui.e;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f extends e.c implements I0, v0, O0.h {
    public x a;
    public boolean b;
    public boolean c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.O a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.jvm.internal.O o) {
            super(1);
            this.a = o;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(f fVar) {
            if (this.a.a == null && f.E1(fVar)) {
                this.a.a = fVar;
            } else if (this.a.a != null && fVar.M1() && f.E1(fVar)) {
                this.a.a = fVar;
            }
            return Boolean.TRUE;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.J a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.J j) {
            super(1);
            this.a = j;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 invoke(f fVar) {
            if (!f.E1(fVar)) {
                return H0.a;
            }
            this.a.a = false;
            return H0.c;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.O a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.jvm.internal.O o) {
            super(1);
            this.a = o;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 invoke(f fVar) {
            H0 h0 = H0.a;
            if (!f.E1(fVar)) {
                return h0;
            }
            this.a.a = fVar;
            return fVar.M1() ? H0.b : h0;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ kotlin.jvm.internal.O a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.jvm.internal.O o) {
            super(1);
            this.a = o;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(f fVar) {
            if (fVar.M1() && f.E1(fVar)) {
                this.a.a = fVar;
            }
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ f(x xVar, boolean z, O0.s sVar, int i, kotlin.jvm.internal.k kVar) {
        this(xVar, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : sVar);
    }

    public static final /* synthetic */ boolean E1(f fVar) {
        return fVar.c;
    }

    public final void F1() {
        x xVar;
        f L1 = L1();
        if (L1 == null || (xVar = L1.a) == null) {
            xVar = this.a;
        }
        G1(xVar);
    }

    public abstract void G1(x xVar);

    public final void H1() {
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        J0.d(this, new a(o));
        f fVar = (f) o.a;
        if (fVar != null) {
            fVar.F1();
        } else {
            G1(null);
        }
    }

    public long I0() {
        return F0.a.b();
    }

    public final void I1() {
        f fVar;
        if (this.c) {
            if (this.b || (fVar = K1()) == null) {
                fVar = this;
            }
            fVar.F1();
        }
    }

    public void J0(q qVar, s sVar, long j) {
        if (sVar == s.b) {
            List c2 = qVar.c();
            int size = c2.size();
            for (int i = 0; i < size; i++) {
                if (O1(((C) c2.get(i)).n())) {
                    int f = qVar.f();
                    u.a aVar = u.a;
                    if (u.i(f, aVar.a())) {
                        P1();
                        return;
                    } else {
                        if (u.i(qVar.f(), aVar.b())) {
                            Q1();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void J1() {
        kotlin.jvm.internal.J j = new kotlin.jvm.internal.J();
        j.a = true;
        if (!this.b) {
            J0.f(this, new b(j));
        }
        if (j.a) {
            F1();
        }
    }

    public final f K1() {
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        J0.f(this, new c(o));
        return (f) o.a;
    }

    public final f L1() {
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        J0.d(this, new d(o));
        return (f) o.a;
    }

    public final boolean M1() {
        return this.b;
    }

    public final z N1() {
        return (z) O0.i.a(this, p0.l());
    }

    public abstract boolean O1(int i);

    public final void P1() {
        this.c = true;
        J1();
    }

    public final void Q1() {
        if (this.c) {
            this.c = false;
            if (isAttached()) {
                H1();
            }
        }
    }

    public final void R1(x xVar) {
        if (kotlin.jvm.internal.t.c(this.a, xVar)) {
            return;
        }
        this.a = xVar;
        if (this.c) {
            J1();
        }
    }

    public final void S1(boolean z) {
        if (this.b != z) {
            this.b = z;
            if (z) {
                if (this.c) {
                    F1();
                }
            } else if (this.c) {
                I1();
            }
        }
    }

    public void U0() {
        Q1();
    }

    public void onDetach() {
        Q1();
        super.onDetach();
    }

    public f(x xVar, boolean z, O0.s sVar) {
        this.a = xVar;
        this.b = z;
    }
}
