package gb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface p extends fb.e {

    public static final class a {
        public static /* synthetic */ fb.e a(p pVar, Ga.i iVar, int i, eb.a aVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i2 & 1) != 0) {
                iVar = Ga.j.a;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                aVar = eb.a.a;
            }
            return pVar.a(iVar, i, aVar);
        }
    }

    fb.e a(Ga.i iVar, int i, eb.a aVar);
}
