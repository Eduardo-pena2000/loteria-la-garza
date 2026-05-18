package X;

import v0.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j0 {
    public static final j0 a = new j0();
    public static final float b = n1.h.g(56);
    public static final float c = n1.h.g(280);
    public static final float d;
    public static final float e;
    public static final float f;
    public static final float g;

    public static final class a implements t0, kotlin.jvm.internal.n {
        public final /* synthetic */ Qa.a a;

        public a(Qa.a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ long a() {
            return ((v0.r0) this.a.invoke()).A();
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof t0) && (obj instanceof kotlin.jvm.internal.n)) {
                return kotlin.jvm.internal.t.c(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        public final Ca.h getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    static {
        float g2 = n1.h.g(1);
        d = g2;
        float g3 = n1.h.g(2);
        e = g3;
        f = g2;
        g = g3;
    }

    public static /* synthetic */ F.L b(j0 j0Var, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = Z.j.r();
        }
        if ((i & 2) != 0) {
            f3 = Z.j.q();
        }
        if ((i & 4) != 0) {
            f4 = Z.j.r();
        }
        if ((i & 8) != 0) {
            f5 = n1.h.g(0);
        }
        return j0Var.a(f2, f3, f4, f5);
    }

    public final F.L a(float f2, float f3, float f4, float f5) {
        return androidx.compose.foundation.layout.f.d(f2, f3, f4, f5);
    }
}
