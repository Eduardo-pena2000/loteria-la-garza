package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class M {
    public static final void a(Ga.i iVar, Throwable th) {
        try {
            L l = (L) iVar.get(L.O8);
            if (l != null) {
                l.handleException(iVar, th);
            } else {
                hb.f.a(iVar, th);
            }
        } catch (Throwable th2) {
            hb.f.a(iVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        Ca.g.a(runtimeException, th);
        return runtimeException;
    }
}
