package N;

import androidx.compose.ui.layout.q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o0 implements M0.v {
    public final V b;
    public final int c;
    public final f1.d0 d;
    public final Qa.a e;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ androidx.compose.ui.layout.l a;
        public final /* synthetic */ o0 b;
        public final /* synthetic */ androidx.compose.ui.layout.q c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.l lVar, o0 o0Var, androidx.compose.ui.layout.q qVar, int i) {
            super(1);
            this.a = lVar;
            this.b = o0Var;
            this.c = qVar;
            this.d = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            androidx.compose.ui.layout.l lVar = this.a;
            int b = this.b.b();
            f1.d0 i = this.b.i();
            Z z = (Z) this.b.h().invoke();
            this.b.f().j(C.q.a, U.a(lVar, b, i, z != null ? z.f() : null, false, this.c.W0()), this.d, this.c.P0());
            q.a.Z(aVar, this.c, 0, Math.round(-this.b.f().d()), 0.0f, 4, null);
        }
    }

    public o0(V v, int i, f1.d0 d0Var, Qa.a aVar) {
        this.b = v;
        this.c = i;
        this.d = d0Var;
        this.e = aVar;
    }

    public final int b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return kotlin.jvm.internal.t.c(this.b, o0Var.b) && this.c == o0Var.c && kotlin.jvm.internal.t.c(this.d, o0Var.d) && kotlin.jvm.internal.t.c(this.e, o0Var.e);
    }

    public final V f() {
        return this.b;
    }

    public final Qa.a h() {
        return this.e;
    }

    public int hashCode() {
        return (((((this.b.hashCode() * 31) + Integer.hashCode(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final f1.d0 i() {
        return this.d;
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, M0.A a2, long j) {
        androidx.compose.ui.layout.q C0 = a2.C0(n1.b.d(j, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(C0.P0(), n1.b.k(j));
        return androidx.compose.ui.layout.l.O0(lVar, C0.W0(), min, null, new a(lVar, this, C0, min), 4, null);
    }

    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.b + ", cursorOffset=" + this.c + ", transformedText=" + this.d + ", textLayoutResultProvider=" + this.e + ')';
    }
}
