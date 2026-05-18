package T;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z {
    public static final u0.h a = new u0.h(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final boolean a(u0.h hVar, long j) {
        float i = hVar.i();
        float j2 = hVar.j();
        float m = u0.f.m(j);
        if (i <= m && m <= j2) {
            float l = hVar.l();
            float e = hVar.e();
            float n = u0.f.n(j);
            if (l <= n && n <= e) {
                return true;
            }
        }
        return false;
    }

    public static final u0.h b(M0.p pVar) {
        u0.h c = M0.q.c(pVar);
        return u0.i.a(pVar.Z(c.m()), pVar.Z(c.f()));
    }
}
