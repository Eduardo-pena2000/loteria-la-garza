package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l0 implements q0 {
    public static final b b = new b(null);
    public static final int c = 8;
    public static final Qa.l d = a.a;
    public final j0 a;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(l0 l0Var) {
            if (l0Var.N0()) {
                l0Var.b().q0();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l0) obj);
            return Ca.I.a;
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final Qa.l a() {
            return l0.a();
        }

        public b() {
        }
    }

    public l0(j0 j0Var) {
        this.a = j0Var;
    }

    public static final /* synthetic */ Qa.l a() {
        return d;
    }

    public boolean N0() {
        return this.a.getNode().isAttached();
    }

    public final j0 b() {
        return this.a;
    }
}
