package cb;

import Ga.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class I {
    public static /* synthetic */ Ga.i a(kotlin.jvm.internal.O o, boolean z, Ga.i iVar, i.b bVar) {
        return e(o, z, iVar, bVar);
    }

    public static /* synthetic */ Ga.i b(Ga.i iVar, i.b bVar) {
        return f(iVar, bVar);
    }

    public static /* synthetic */ boolean c(boolean z, i.b bVar) {
        return i(z, bVar);
    }

    public static final Ga.i d(Ga.i iVar, Ga.i iVar2, boolean z) {
        boolean h = h(iVar);
        boolean h2 = h(iVar2);
        if (!h && !h2) {
            return iVar.plus(iVar2);
        }
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        o.a = iVar2;
        Ga.j jVar = Ga.j.a;
        Ga.i iVar3 = (Ga.i) iVar.fold(jVar, new G(o, z));
        if (h2) {
            o.a = ((Ga.i) o.a).fold(jVar, new H());
        }
        return iVar3.plus((Ga.i) o.a);
    }

    public static final Ga.i e(kotlin.jvm.internal.O o, boolean z, Ga.i iVar, i.b bVar) {
        return iVar.plus(bVar);
    }

    public static final Ga.i f(Ga.i iVar, i.b bVar) {
        return iVar.plus(bVar);
    }

    public static final String g(Ga.i iVar) {
        return null;
    }

    public static final boolean h(Ga.i iVar) {
        return ((Boolean) iVar.fold(Boolean.FALSE, new F())).booleanValue();
    }

    public static final Ga.i j(Ga.i iVar, Ga.i iVar2) {
        return !h(iVar2) ? iVar.plus(iVar2) : d(iVar, iVar2, false);
    }

    public static final Ga.i k(O o, Ga.i iVar) {
        Ga.i d = d(o.getCoroutineContext(), iVar, true);
        return (d == e0.a() || d.get(Ga.f.D8) != null) ? d : d.plus(e0.a());
    }

    public static final e1 l(Ia.e eVar) {
        while (!(eVar instanceof a0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof e1) {
                return (e1) eVar;
            }
        }
        return null;
    }

    public static final e1 m(Ga.e eVar, Ga.i iVar, Object obj) {
        if (!(eVar instanceof Ia.e) || iVar.get(f1.a) == null) {
            return null;
        }
        e1 l = l((Ia.e) eVar);
        if (l != null) {
            l.S0(iVar, obj);
        }
        return l;
    }

    public static final boolean i(boolean z, i.b bVar) {
        return z;
    }
}
