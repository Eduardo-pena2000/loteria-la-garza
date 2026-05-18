package androidx.compose.ui.layout;

import Ca.I;
import O0.J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z {
    public static final int f = 8;
    public final A a;
    public j b;
    public final Qa.p c;
    public final Qa.p d;
    public final Qa.p e;

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public b() {
            super(2);
        }

        public final void a(J j, b0.y yVar) {
            z.b(z.this).N(yVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (b0.y) obj2);
            return I.a;
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.p {
        public c() {
            super(2);
        }

        public final void a(J j, Qa.p pVar) {
            j.e(z.b(z.this).t(pVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (Qa.p) obj2);
            return I.a;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.p {
        public d() {
            super(2);
        }

        public final void a(J j, z zVar) {
            z zVar2 = z.this;
            j B0 = j.B0();
            if (B0 == null) {
                B0 = new j(j, z.a(z.this));
                j.b2(B0);
            }
            z.c(zVar2, B0);
            z.b(z.this).E();
            z.b(z.this).O(z.a(z.this));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((J) obj, (z) obj2);
            return I.a;
        }
    }

    public z(A a2) {
        this.a = a2;
        this.c = new d();
        this.d = new b();
        this.e = new c();
    }

    public static final /* synthetic */ A a(z zVar) {
        return zVar.a;
    }

    public static final /* synthetic */ j b(z zVar) {
        return zVar.h();
    }

    public static final /* synthetic */ void c(z zVar, j jVar) {
        zVar.b = jVar;
    }

    public final void d() {
        h().B();
    }

    public final Qa.p e() {
        return this.d;
    }

    public final Qa.p f() {
        return this.e;
    }

    public final Qa.p g() {
        return this.c;
    }

    public final j h() {
        j jVar = this.b;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final a i(Object obj, Qa.p pVar) {
        return h().J(obj, pVar);
    }

    public z() {
        this(m.a);
    }

    public interface a {
        default void a(int i, long j) {
        }

        default int c() {
            return 0;
        }

        void dispose();

        default void b(Object obj, Qa.l lVar) {
        }
    }
}
