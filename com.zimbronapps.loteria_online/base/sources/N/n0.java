package N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n0 {
    public static final f1.J a = new m0(f1.J.a.a(), 0, 0);

    public static final /* synthetic */ void a(int i, int i2, int i3) {
        g(i, i2, i3);
    }

    public static final /* synthetic */ void b(int i, int i2, int i3) {
        h(i, i2, i3);
    }

    public static final f1.d0 c(f1.f0 f0Var, Z0.e eVar) {
        f1.d0 a2 = f0Var.a(eVar);
        f(a2, eVar.length(), 0, 2, null);
        return new f1.d0(a2.b(), new m0(a2.a(), eVar.length(), a2.b().length()));
    }

    public static final f1.J d() {
        return a;
    }

    public static final void e(f1.d0 d0Var, int i, int i2) {
        int length = d0Var.b().length();
        int min = Math.min(i, i2);
        for (int i3 = 0; i3 < min; i3++) {
            g(d0Var.a().b(i3), length, i3);
        }
        g(d0Var.a().b(i), length, i);
        int min2 = Math.min(length, i2);
        for (int i4 = 0; i4 < min2; i4++) {
            h(d0Var.a().a(i4), i, i4);
        }
        h(d0Var.a().a(length), i, length);
    }

    public static /* synthetic */ void f(f1.d0 d0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 100;
        }
        e(d0Var, i, i2);
    }

    public static final void g(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + ']').toString());
        }
    }

    public static final void h(int i, int i2, int i3) {
        if (i < 0 || i > i2) {
            throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + ']').toString());
        }
    }
}
