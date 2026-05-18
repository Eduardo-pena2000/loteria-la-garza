package H;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j extends I.n implements C {
    public static final b d = new b(null);
    public static final int e = 8;
    public static final Qa.p f = a.a;
    public final H a = new H(this);
    public final I.J b = new I.J();
    public boolean c;

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public static final a a = new a();

        public a() {
            super(2);
        }

        public final long a(q qVar, int i) {
            return G.a(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c.a(a((q) obj, ((Number) obj2).intValue()));
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public b() {
        }
    }

    public j(Qa.l lVar) {
        lVar.invoke(this);
    }

    public void d(int i, Qa.l lVar, Qa.p pVar, Qa.l lVar2, Qa.r rVar) {
        g().b(i, new i(lVar, pVar == null ? f : pVar, lVar2, rVar));
        if (pVar != null) {
            this.c = true;
        }
    }

    public final boolean j() {
        return this.c;
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public I.J g() {
        return this.b;
    }

    public final H l() {
        return this.a;
    }
}
