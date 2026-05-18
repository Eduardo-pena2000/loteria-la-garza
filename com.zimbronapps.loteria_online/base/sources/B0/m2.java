package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m2 {
    public static /* synthetic */ Ca.I a(Qa.l lVar, Object obj, Ca.I i) {
        return d(lVar, obj, i);
    }

    public static final void c(m mVar, Qa.l lVar) {
        if (mVar.f()) {
            mVar.J(Ca.I.a, new l2(lVar));
        }
    }

    public static final Ca.I d(Qa.l lVar, Object obj, Ca.I i) {
        lVar.invoke(obj);
        return Ca.I.a;
    }

    public static final void e(m mVar, Object obj, Qa.p pVar) {
        if (mVar.f() || !kotlin.jvm.internal.t.c(mVar.C(), obj)) {
            mVar.t(obj);
            mVar.J(obj, pVar);
        }
    }

    public static m b(m mVar) {
        return mVar;
    }
}
