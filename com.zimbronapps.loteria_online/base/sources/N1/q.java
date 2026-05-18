package n1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q {
    public static final p a(long j, long j2) {
        return new p(n.k(j), n.l(j), n.k(j) + ((int) (j2 >> 32)), n.l(j) + ((int) (j2 & 4294967295L)));
    }

    public static final p b(u0.h hVar) {
        return new p(Math.round(hVar.i()), Math.round(hVar.l()), Math.round(hVar.j()), Math.round(hVar.e()));
    }

    public static final u0.h c(p pVar) {
        return new u0.h(pVar.f(), pVar.h(), pVar.g(), pVar.d());
    }
}
