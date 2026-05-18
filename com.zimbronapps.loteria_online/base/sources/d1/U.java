package d1;

import b0.h2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u {
    public static final a b = new a(null);
    public static final g0 c = new o();
    public static final P d = new P("sans-serif", "FontFamily.SansSerif");
    public static final P e = new P("serif", "FontFamily.Serif");
    public static final P f = new P("monospace", "FontFamily.Monospace");
    public static final P g = new P("cursive", "FontFamily.Cursive");
    public final boolean a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final P a() {
            return u.a();
        }

        public final g0 b() {
            return u.b();
        }

        public final P c() {
            return u.e();
        }

        public final P d() {
            return u.f();
        }

        public final P e() {
            return u.g();
        }

        public a() {
        }
    }

    public interface b {
        static /* synthetic */ h2 a(b bVar, u uVar, L l, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i3 & 1) != 0) {
                uVar = null;
            }
            if ((i3 & 2) != 0) {
                l = L.b.g();
            }
            if ((i3 & 4) != 0) {
                i = H.b.b();
            }
            if ((i3 & 8) != 0) {
                i2 = I.b.a();
            }
            return bVar.b(uVar, l, i, i2);
        }

        h2 b(u uVar, L l, int i, int i2);
    }

    public /* synthetic */ u(boolean z, kotlin.jvm.internal.k kVar) {
        this(z);
    }

    public static final /* synthetic */ P a() {
        return g;
    }

    public static final /* synthetic */ g0 b() {
        return c;
    }

    public static final /* synthetic */ P e() {
        return f;
    }

    public static final /* synthetic */ P f() {
        return d;
    }

    public static final /* synthetic */ P g() {
        return e;
    }

    public u(boolean z) {
        this.a = z;
    }
}
