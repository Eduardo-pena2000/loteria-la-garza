package X;

import b0.b1;
import n1.h;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class P {
    public static final b1 a = b0.H.j(b.a);
    public static final b1 b = b0.H.h(null, a.a, 1, null);
    public static final Q c;
    public static final Q d;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N invoke() {
            return new N(0L, null, 3, null);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.a {
        public static final b a = new b();

        public b() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    static {
        h.a aVar = n1.h.b;
        float c2 = aVar.c();
        r0.a aVar2 = v0.r0.b;
        c = new Q(true, c2, aVar2.j(), (kotlin.jvm.internal.k) null);
        d = new Q(false, aVar.c(), aVar2.j(), (kotlin.jvm.internal.k) null);
    }

    public static final b1 a() {
        return b;
    }

    public static final A.Q b(boolean z, float f, long j) {
        return (n1.h.i(f, n1.h.b.c()) && v0.r0.s(j, v0.r0.b.j())) ? z ? c : d : new Q(z, f, j, (kotlin.jvm.internal.k) null);
    }

    public static /* synthetic */ A.Q c(boolean z, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = n1.h.b.c();
        }
        if ((i & 4) != 0) {
            j = v0.r0.b.j();
        }
        return b(z, f, j);
    }

    public static final A.M d(boolean z, float f, long j, b0.m mVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 2) != 0) {
            f = n1.h.b.c();
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            j = v0.r0.b.j();
        }
        long j2 = j;
        if (b0.w.L()) {
            b0.w.U(-1315814667, i, -1, "androidx.compose.material3.rippleOrFallbackImplementation (Ripple.kt:230)");
        }
        mVar.V(-1280632857);
        A.M f3 = ((Boolean) mVar.x(a)).booleanValue() ? W.p.f(z2, f2, j2, mVar, i & 1022, 0) : b(z2, f2, j2);
        mVar.P();
        if (b0.w.L()) {
            b0.w.T();
        }
        return f3;
    }
}
