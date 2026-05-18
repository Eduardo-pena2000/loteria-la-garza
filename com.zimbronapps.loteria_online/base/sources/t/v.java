package T;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v {
    public static final float a;
    public static final float b;
    public static final W0.C c = new W0.C("SelectionHandleInfo", (Qa.p) null, 2, (kotlin.jvm.internal.k) null);

    static {
        float f = 25;
        a = n1.h.g(f);
        b = n1.h.g(f);
    }

    public static final long a(long j) {
        return u0.g.a(u0.f.m(j), u0.f.n(j) - 1.0f);
    }

    public static final float b() {
        return b;
    }

    public static final float c() {
        return a;
    }

    public static final W0.C d() {
        return c;
    }

    public static final boolean e(l1.i iVar, boolean z) {
        return (iVar == l1.i.a && !z) || (iVar == l1.i.b && z);
    }

    public static final boolean f(boolean z, l1.i iVar, boolean z2) {
        return z ? e(iVar, z2) : !e(iVar, z2);
    }
}
