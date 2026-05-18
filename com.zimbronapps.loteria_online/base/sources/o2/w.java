package o2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class w {

    public static final class a extends w {
        public final Qa.p a;
        public final cb.x b;
        public final I c;
        public final Ga.i d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qa.p pVar, cb.x xVar, I i, Ga.i iVar) {
            super(null);
            kotlin.jvm.internal.t.g(pVar, "transform");
            kotlin.jvm.internal.t.g(xVar, "ack");
            kotlin.jvm.internal.t.g(iVar, "callerContext");
            this.a = pVar;
            this.b = xVar;
            this.c = i;
            this.d = iVar;
        }

        public final cb.x a() {
            return this.b;
        }

        public final Ga.i b() {
            return this.d;
        }

        public I c() {
            return this.c;
        }

        public final Qa.p d() {
            return this.a;
        }
    }

    public /* synthetic */ w(kotlin.jvm.internal.k kVar) {
        this();
    }

    public w() {
    }
}
