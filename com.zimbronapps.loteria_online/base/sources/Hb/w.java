package hb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class w {
    public static final void a(Qa.l lVar, Object obj, Ga.i iVar) {
        P b = b(lVar, obj, null);
        if (b != null) {
            cb.M.a(iVar, b);
        }
    }

    public static final P b(Qa.l lVar, Object obj, P p) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (p == null || p.getCause() == th) {
                return new P("Exception in undelivered element handler for " + obj, th);
            }
            Ca.g.a(p, th);
        }
        return p;
    }

    public static /* synthetic */ P c(Qa.l lVar, Object obj, P p, int i, Object obj2) {
        if ((i & 2) != 0) {
            p = null;
        }
        return b(lVar, obj, p);
    }
}
