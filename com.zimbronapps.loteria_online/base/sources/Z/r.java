package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {
    public static final m a(float f) {
        return new m(f);
    }

    public static final n b(float f, float f2) {
        return new n(f, f2);
    }

    public static final o c(float f, float f2, float f3) {
        return new o(f, f2, f3);
    }

    public static final p d(float f, float f2, float f3, float f4) {
        return new p(f, f2, f3, f4);
    }

    public static final q e(q qVar) {
        q g = g(qVar);
        int b = g.b();
        for (int i = 0; i < b; i++) {
            g.e(i, qVar.a(i));
        }
        return g;
    }

    public static final void f(q qVar, q qVar2) {
        int b = qVar.b();
        for (int i = 0; i < b; i++) {
            qVar.e(i, qVar2.a(i));
        }
    }

    public static final q g(q qVar) {
        q c = qVar.c();
        kotlin.jvm.internal.t.e(c, "null cannot be cast to non-null type T of androidx.compose.animation.core.AnimationVectorsKt.newInstance");
        return c;
    }
}
