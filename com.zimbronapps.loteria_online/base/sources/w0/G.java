package W0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g {
    public static final a d = new a(null);
    public static final g e = new g(0.0f, Wa.m.b(0.0f, 0.0f), 0, 4, null);
    public final float a;
    public final Wa.e b;
    public final int c;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final g a() {
            return g.a();
        }

        public a() {
        }
    }

    public g(float f, Wa.e eVar, int i) {
        this.a = f;
        this.b = eVar;
        this.c = i;
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public static final /* synthetic */ g a() {
        return e;
    }

    public final float b() {
        return this.a;
    }

    public final Wa.e c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && kotlin.jvm.internal.t.c(this.b, gVar.b) && this.c == gVar.c;
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=" + this.c + ')';
    }

    public /* synthetic */ g(float f, Wa.e eVar, int i, int i2, kotlin.jvm.internal.k kVar) {
        this(f, eVar, (i2 & 4) != 0 ? 0 : i);
    }
}
