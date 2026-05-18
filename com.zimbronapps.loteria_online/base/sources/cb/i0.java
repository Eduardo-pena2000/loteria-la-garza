package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class I0 {
    public static final hb.D a = new hb.D("COMPLETING_ALREADY");
    public static final hb.D b = new hb.D("COMPLETING_WAITING_CHILDREN");
    public static final hb.D c = new hb.D("COMPLETING_RETRY");
    public static final hb.D d = new hb.D("TOO_LATE_TO_CANCEL");
    public static final hb.D e = new hb.D("SEALED");
    public static final j0 f = new j0(false);
    public static final j0 g = new j0(true);

    public static final /* synthetic */ hb.D a() {
        return a;
    }

    public static final /* synthetic */ hb.D b() {
        return c;
    }

    public static final /* synthetic */ j0 c() {
        return g;
    }

    public static final /* synthetic */ j0 d() {
        return f;
    }

    public static final /* synthetic */ hb.D e() {
        return e;
    }

    public static final /* synthetic */ hb.D f() {
        return d;
    }

    public static final Object g(Object obj) {
        return obj instanceof w0 ? new x0((w0) obj) : obj;
    }

    public static final Object h(Object obj) {
        w0 w0Var;
        x0 x0Var = obj instanceof x0 ? (x0) obj : null;
        return (x0Var == null || (w0Var = x0Var.a) == null) ? obj : w0Var;
    }
}
