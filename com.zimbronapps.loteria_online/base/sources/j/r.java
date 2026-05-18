package J;

import Ca.I;
import I.e;
import b0.B1;
import b0.g1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r implements I.r {
    public final C a;
    public final I.n b;
    public final androidx.compose.foundation.lazy.layout.b c;
    public final w d = w.a;

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.b = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(1142237095, i, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:208)");
            }
            I.n j = r.j(r.this);
            int i2 = this.b;
            r rVar = r.this;
            e.a aVar = j.g().get(i2);
            ((l) aVar.c()).a().invoke(r.k(rVar), Integer.valueOf(i2 - aVar.b()), mVar, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ int b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, Object obj, int i2) {
            super(2);
            this.b = i;
            this.c = obj;
            this.d = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            r.this.g(this.b, this.c, mVar, g1.a(this.d | 1));
        }
    }

    public r(C c, I.n nVar, androidx.compose.foundation.lazy.layout.b bVar) {
        this.a = c;
        this.b = nVar;
        this.c = bVar;
    }

    public static final /* synthetic */ I.n j(r rVar) {
        return rVar.b;
    }

    public static final /* synthetic */ w k(r rVar) {
        return rVar.d;
    }

    public int b(Object obj) {
        return this.c.b(obj);
    }

    public int c() {
        return this.b.h();
    }

    public Object d(int i) {
        Object d = this.c.d(i);
        return d == null ? this.b.i(i) : d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return kotlin.jvm.internal.t.c(this.b, ((r) obj).b);
        }
        return false;
    }

    public void g(int i, Object obj, b0.m mVar, int i2) {
        int i3;
        b0.m i4 = mVar.i(-1201380429);
        if ((i2 & 6) == 0) {
            i3 = (i4.d(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i4.E(obj) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= i4.U(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && i4.j()) {
            i4.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-1201380429, i3, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:206)");
            }
            I.B.a(obj, i, this.a.J(), j0.i.d(1142237095, true, new a(i), i4, 54), i4, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new b(i, obj, i2));
        }
    }

    public int hashCode() {
        return this.b.hashCode();
    }
}
