package z5;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class l {
    public static void a(w5.i iVar, w5.f fVar) {
        if (!(iVar instanceof s)) {
            D5.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", iVar);
        } else {
            u.c().e().u(((s) iVar).d().f(fVar), 1);
        }
    }
}
