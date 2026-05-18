package b0;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b0 {
    public static final Y a = new Y();

    public static final void a(Object obj, Qa.l lVar, m mVar, int i) {
        if (w.L()) {
            w.U(-1371986847, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:153)");
        }
        boolean U = mVar.U(obj);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = new W(lVar);
            mVar.t(C);
        }
        if (w.L()) {
            w.T();
        }
    }

    public static final void b(Object obj, Object obj2, Qa.l lVar, m mVar, int i) {
        if (w.L()) {
            w.U(1429097729, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:190)");
        }
        boolean U = mVar.U(obj) | mVar.U(obj2);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = new W(lVar);
            mVar.t(C);
        }
        if (w.L()) {
            w.T();
        }
    }

    public static final void c(Object[] objArr, Qa.l lVar, m mVar, int i) {
        if (w.L()) {
            w.U(-1307627122, i, -1, "androidx.compose.runtime.DisposableEffect (Effects.kt:264)");
        }
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= mVar.U(obj);
        }
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            mVar.t(new W(lVar));
        }
        if (w.L()) {
            w.T();
        }
    }

    public static final void d(Object obj, Qa.p pVar, m mVar, int i) {
        if (w.L()) {
            w.U(1179185413, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:341)");
        }
        Ga.i q = mVar.q();
        boolean U = mVar.U(obj);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = new p0(q, pVar);
            mVar.t(C);
        }
        if (w.L()) {
            w.T();
        }
    }

    public static final void e(Object obj, Object obj2, Qa.p pVar, m mVar, int i) {
        if (w.L()) {
            w.U(590241125, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:360)");
        }
        Ga.i q = mVar.q();
        boolean U = mVar.U(obj) | mVar.U(obj2);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = new p0(q, pVar);
            mVar.t(C);
        }
        if (w.L()) {
            w.T();
        }
    }

    public static final void f(Object[] objArr, Qa.p pVar, m mVar, int i) {
        if (w.L()) {
            w.U(-139560008, i, -1, "androidx.compose.runtime.LaunchedEffect (Effects.kt:407)");
        }
        Ga.i q = mVar.q();
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= mVar.U(obj);
        }
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            mVar.t(new p0(q, pVar));
        }
        if (w.L()) {
            w.T();
        }
    }

    public static final void g(Qa.a aVar, m mVar, int i) {
        if (w.L()) {
            w.U(-1288466761, i, -1, "androidx.compose.runtime.SideEffect (Effects.kt:51)");
        }
        mVar.g(aVar);
        if (w.L()) {
            w.T();
        }
    }

    public static final /* synthetic */ Y h() {
        return a;
    }

    public static final cb.O i(Ga.i iVar, m mVar) {
        if (iVar.get(cb.B0.P8) == null) {
            return new x1(mVar.q(), iVar);
        }
        cb.A b = cb.E0.b((cb.B0) null, 1, (Object) null);
        b.b(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return cb.P.a(b);
    }
}
