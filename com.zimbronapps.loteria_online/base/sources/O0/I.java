package O0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final Object a(h hVar, b0.D d) {
        if (!hVar.getNode().isAttached()) {
            L0.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return k.n(hVar).Q().a(d);
    }
}
