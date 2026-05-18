package H;

import I.e;
import b0.B1;
import b0.g1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements l {
    public final I a;
    public final j b;
    public final androidx.compose.foundation.lazy.layout.b c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.b = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(726189336, i, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item.<anonymous> (LazyGridItemProvider.kt:76)");
            }
            j j = m.j(m.this);
            int i2 = this.b;
            e.a aVar = j.g().get(i2);
            ((i) aVar.c()).a().invoke(p.a, Integer.valueOf(i2 - aVar.b()), mVar, 6);
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
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            m.this.g(this.b, this.c, mVar, g1.a(this.d | 1));
        }
    }

    public m(I i, j jVar, androidx.compose.foundation.lazy.layout.b bVar) {
        this.a = i;
        this.b = jVar;
        this.c = bVar;
    }

    public static final /* synthetic */ j j(m mVar) {
        return mVar.b;
    }

    public androidx.compose.foundation.lazy.layout.b a() {
        return this.c;
    }

    public int b(Object obj) {
        return a().b(obj);
    }

    public int c() {
        return this.b.h();
    }

    public Object d(int i) {
        Object d = a().d(i);
        return d == null ? this.b.i(i) : d;
    }

    public Object e(int i) {
        return this.b.f(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return kotlin.jvm.internal.t.c(this.b, ((m) obj).b);
        }
        return false;
    }

    public void g(int i, Object obj, b0.m mVar, int i2) {
        int i3;
        b0.m i4 = mVar.i(1493551140);
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
                b0.w.U(1493551140, i3, -1, "androidx.compose.foundation.lazy.grid.LazyGridItemProviderImpl.Item (LazyGridItemProvider.kt:74)");
            }
            I.B.a(obj, i, this.a.v(), j0.i.d(726189336, true, new a(i), i4, 54), i4, ((i3 >> 3) & 14) | 3072 | ((i3 << 3) & 112));
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

    public H i() {
        return this.b.l();
    }
}
