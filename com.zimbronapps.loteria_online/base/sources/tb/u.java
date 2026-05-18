package tb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class u {
    public static final b a(b from, Qa.l builderAction) {
        kotlin.jvm.internal.t.g(from, "from");
        kotlin.jvm.internal.t.g(builderAction, "builderAction");
        e eVar = new e(from);
        builderAction.invoke(eVar);
        return new t(eVar.a(), eVar.b());
    }

    public static /* synthetic */ b b(b bVar, Qa.l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            bVar = b.d;
        }
        return a(bVar, lVar);
    }
}
