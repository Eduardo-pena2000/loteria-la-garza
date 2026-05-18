package eb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j {
    public static final g a(int i, a aVar, Qa.l lVar) {
        g eVar;
        if (i == -2) {
            eVar = aVar == a.a ? new e(g.R8.a(), lVar) : new s(1, aVar, lVar);
        } else {
            if (i == -1) {
                if (aVar == a.a) {
                    return new s(1, a.b, lVar);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? aVar == a.a ? new e(i, lVar) : new s(i, aVar, lVar) : new e(Integer.MAX_VALUE, lVar);
            }
            eVar = aVar == a.a ? new e(0, lVar) : new s(1, aVar, lVar);
        }
        return eVar;
    }

    public static /* synthetic */ g b(int i, a aVar, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            aVar = a.a;
        }
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        return a(i, aVar, lVar);
    }
}
