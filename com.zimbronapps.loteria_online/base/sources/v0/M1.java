package v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface m1 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a = new b("CounterClockwise", 0);
        public static final b b = new b("Clockwise", 1);
        public static final /* synthetic */ b[] c;
        public static final /* synthetic */ Ja.a d;

        static {
            b[] a2 = a();
            c = a2;
            d = Ja.b.a(a2);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    static /* synthetic */ void b(m1 m1Var, m1 m1Var2, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
        }
        if ((i & 2) != 0) {
            j = u0.f.b.c();
        }
        m1Var.m(m1Var2, j);
    }

    static /* synthetic */ void d(m1 m1Var, u0.h hVar, b bVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOval");
        }
        if ((i & 2) != 0) {
            bVar = b.a;
        }
        m1Var.g(hVar, bVar);
    }

    static /* synthetic */ void h(m1 m1Var, u0.j jVar, b bVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i & 2) != 0) {
            bVar = b.a;
        }
        m1Var.q(jVar, bVar);
    }

    static /* synthetic */ void u(m1 m1Var, u0.h hVar, b bVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i & 2) != 0) {
            bVar = b.a;
        }
        m1Var.j(hVar, bVar);
    }

    u0.h a();

    boolean c();

    void close();

    void e(float f, float f2);

    void f(float f, float f2, float f3, float f4, float f5, float f6);

    void g(u0.h hVar, b bVar);

    void i(int i);

    boolean isEmpty();

    void j(u0.h hVar, b bVar);

    void k(float f, float f2, float f3, float f4);

    void l();

    void m(m1 m1Var, long j);

    boolean n(m1 m1Var, m1 m1Var2, int i);

    void o(long j);

    void p(float f, float f2, float f3, float f4);

    void q(u0.j jVar, b bVar);

    int r();

    void reset();

    void s(float f, float f2);

    void t(float f, float f2, float f3, float f4, float f5, float f6);

    void v(float f, float f2);

    void w(float f, float f2);
}
