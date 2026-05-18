package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface l {
    default long M(float f) {
        o1.b bVar = o1.b.a;
        if (!bVar.f(e1())) {
            return w.e(f / e1());
        }
        o1.a b = bVar.b(e1());
        return w.e(b != null ? b.a(f) : f / e1());
    }

    default float S(long j) {
        if (!x.g(v.g(j), x.b.b())) {
            m.b("Only Sp can convert to Px");
        }
        o1.b bVar = o1.b.a;
        if (!bVar.f(e1())) {
            return h.g(v.h(j) * e1());
        }
        o1.a b = bVar.b(e1());
        float h = v.h(j);
        return h.g(b == null ? h * e1() : b.b(h));
    }

    float e1();
}
