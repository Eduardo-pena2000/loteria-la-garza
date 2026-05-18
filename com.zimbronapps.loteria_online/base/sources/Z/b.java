package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final m a = r.a(Float.POSITIVE_INFINITY);
    public static final n b = r.b(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final o c = r.c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final p d = r.d(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final m e = r.a(Float.NEGATIVE_INFINITY);
    public static final n f = r.b(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final o g = r.c(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final p h = r.d(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final a a(float f2, float f3) {
        return new a(Float.valueOf(f2), u0.b(kotlin.jvm.internal.m.a), Float.valueOf(f3), null, 8, null);
    }

    public static /* synthetic */ a b(float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f3 = 0.01f;
        }
        return a(f2, f3);
    }

    public static final /* synthetic */ m c() {
        return e;
    }

    public static final /* synthetic */ n d() {
        return f;
    }

    public static final /* synthetic */ o e() {
        return g;
    }

    public static final /* synthetic */ p f() {
        return h;
    }

    public static final /* synthetic */ m g() {
        return a;
    }

    public static final /* synthetic */ n h() {
        return b;
    }

    public static final /* synthetic */ o i() {
        return c;
    }

    public static final /* synthetic */ p j() {
        return d;
    }
}
