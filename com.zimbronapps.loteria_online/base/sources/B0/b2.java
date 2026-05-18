package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class b2 {
    public static final l0.E a() {
        return new l0.E();
    }

    public static final l0.E b(Object... objArr) {
        l0.E e = new l0.E();
        e.addAll(Da.r.S0(objArr));
        return e;
    }

    public static final l0.G c() {
        return new l0.G();
    }

    public static final C0 d(Object obj, T1 t1) {
        return c2.a(obj, t1);
    }

    public static /* synthetic */ C0 e(Object obj, T1 t1, int i, Object obj2) {
        if ((i & 2) != 0) {
            t1 = U1.q();
        }
        return U1.h(obj, t1);
    }

    public static final h2 f(Object obj, m mVar, int i) {
        if (w.L()) {
            w.U(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:335)");
        }
        Object C = mVar.C();
        if (C == m.a.a()) {
            C = U1.i(obj, null, 2, null);
            mVar.t(C);
        }
        C0 c0 = (C0) C;
        c0.setValue(obj);
        if (w.L()) {
            w.T();
        }
        return c0;
    }
}
