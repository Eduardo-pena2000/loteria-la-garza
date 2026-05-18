package y2;

import Da.D;
import Da.S;
import Da.Y;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.J;
import androidx.fragment.app.p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public static final c a = new c();
    public static c b = c.d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface b {
    }

    public static final class c {
        public static final a c = new a(null);
        public static final c d = new c(Y.b(), null, S.h());
        public final Set a;
        public final Map b;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public a() {
            }
        }

        public c(Set set, b bVar, Map map) {
            t.g(set, "flags");
            t.g(map, "allowedViolations");
            this.a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.b = linkedHashMap;
        }

        public final Set a() {
            return this.a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.b;
        }
    }

    public static /* synthetic */ void a(String str, m mVar) {
        d(str, mVar);
    }

    public static final void d(String str, m mVar) {
        t.g(mVar, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, mVar);
        throw mVar;
    }

    public static final void f(p pVar, String str) {
        t.g(pVar, "fragment");
        t.g(str, "previousFragmentId");
        y2.a aVar = new y2.a(pVar, str);
        c cVar = a;
        cVar.e(aVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_FRAGMENT_REUSE) && cVar.q(b2, pVar.getClass(), aVar.getClass())) {
            cVar.c(b2, aVar);
        }
    }

    public static final void g(p pVar, ViewGroup viewGroup) {
        t.g(pVar, "fragment");
        d dVar = new d(pVar, viewGroup);
        c cVar = a;
        cVar.e(dVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && cVar.q(b2, pVar.getClass(), dVar.getClass())) {
            cVar.c(b2, dVar);
        }
    }

    public static final void h(p pVar) {
        t.g(pVar, "fragment");
        e eVar = new e(pVar);
        c cVar = a;
        cVar.e(eVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(b2, pVar.getClass(), eVar.getClass())) {
            cVar.c(b2, eVar);
        }
    }

    public static final void i(p pVar) {
        t.g(pVar, "fragment");
        f fVar = new f(pVar);
        c cVar = a;
        cVar.e(fVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b2, pVar.getClass(), fVar.getClass())) {
            cVar.c(b2, fVar);
        }
    }

    public static final void j(p pVar) {
        t.g(pVar, "fragment");
        g gVar = new g(pVar);
        c cVar = a;
        cVar.e(gVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b2, pVar.getClass(), gVar.getClass())) {
            cVar.c(b2, gVar);
        }
    }

    public static final void k(p pVar) {
        t.g(pVar, "fragment");
        i iVar = new i(pVar);
        c cVar = a;
        cVar.e(iVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && cVar.q(b2, pVar.getClass(), iVar.getClass())) {
            cVar.c(b2, iVar);
        }
    }

    public static final void l(p pVar, p pVar2, int i) {
        t.g(pVar, "violatingFragment");
        t.g(pVar2, "targetFragment");
        j jVar = new j(pVar, pVar2, i);
        c cVar = a;
        cVar.e(jVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && cVar.q(b2, pVar.getClass(), jVar.getClass())) {
            cVar.c(b2, jVar);
        }
    }

    public static final void m(p pVar, boolean z) {
        t.g(pVar, "fragment");
        k kVar = new k(pVar, z);
        c cVar = a;
        cVar.e(kVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && cVar.q(b2, pVar.getClass(), kVar.getClass())) {
            cVar.c(b2, kVar);
        }
    }

    public static final void n(p pVar, ViewGroup viewGroup) {
        t.g(pVar, "fragment");
        t.g(viewGroup, "container");
        n nVar = new n(pVar, viewGroup);
        c cVar = a;
        cVar.e(nVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && cVar.q(b2, pVar.getClass(), nVar.getClass())) {
            cVar.c(b2, nVar);
        }
    }

    public static final void o(p pVar, p pVar2, int i) {
        t.g(pVar, "fragment");
        t.g(pVar2, "expectedParentFragment");
        o oVar = new o(pVar, pVar2, i);
        c cVar = a;
        cVar.e(oVar);
        c b2 = cVar.b(pVar);
        if (b2.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && cVar.q(b2, pVar.getClass(), oVar.getClass())) {
            cVar.c(b2, oVar);
        }
    }

    public final c b(p pVar) {
        while (pVar != null) {
            if (pVar.isAdded()) {
                J parentFragmentManager = pVar.getParentFragmentManager();
                t.f(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.G0() != null) {
                    c G0 = parentFragmentManager.G0();
                    t.d(G0);
                    return G0;
                }
            }
            pVar = pVar.getParentFragment();
        }
        return b;
    }

    public final void c(c cVar, m mVar) {
        p a2 = mVar.a();
        String name = a2.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, mVar);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            p(a2, new y2.b(name, mVar));
        }
    }

    public final void e(m mVar) {
        if (J.N0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + mVar.a().getClass().getName(), mVar);
        }
    }

    public final void p(p pVar, Runnable runnable) {
        if (!pVar.isAdded()) {
            runnable.run();
            return;
        }
        Handler h = pVar.getParentFragmentManager().A0().h();
        if (t.c(h.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            h.post(runnable);
        }
    }

    public final boolean q(c cVar, Class cls, Class cls2) {
        Iterable iterable = (Set) cVar.c().get(cls.getName());
        if (iterable == null) {
            return true;
        }
        if (t.c(cls2.getSuperclass(), m.class) || !D.Y(iterable, cls2.getSuperclass())) {
            return !iterable.contains(cls2);
        }
        return false;
    }
}
