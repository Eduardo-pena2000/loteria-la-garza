package M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final h a = a(50);

    public static final h a(int i) {
        return c(c.b(i));
    }

    public static final h b(int i, int i2, int i3, int i4) {
        return new h(c.b(i), c.b(i2), c.b(i3), c.b(i4));
    }

    public static final h c(b bVar) {
        return new h(bVar, bVar, bVar, bVar);
    }

    public static final h d(float f) {
        return c(c.c(f));
    }

    public static final h e(float f, float f2, float f3, float f4) {
        return new h(c.c(f), c.c(f2), c.c(f3), c.c(f4));
    }

    public static /* synthetic */ h f(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = n1.h.g(0);
        }
        if ((i & 2) != 0) {
            f2 = n1.h.g(0);
        }
        if ((i & 4) != 0) {
            f3 = n1.h.g(0);
        }
        if ((i & 8) != 0) {
            f4 = n1.h.g(0);
        }
        return e(f, f2, f3, f4);
    }

    public static final h g() {
        return a;
    }
}
