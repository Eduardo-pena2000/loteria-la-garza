package cb;

import Ga.f;
import Ga.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class K extends Ga.a implements Ga.f {
    public static final a a = new a(null);

    public static final class a extends Ga.b {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ K c(i.b bVar) {
            return d(bVar);
        }

        public static final K d(i.b bVar) {
            if (bVar instanceof K) {
                return (K) bVar;
            }
            return null;
        }

        public a() {
            super(Ga.f.D8, new J());
        }
    }

    public K() {
        super(Ga.f.D8);
    }

    public static /* synthetic */ K C(K k, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return k.B(i, str);
    }

    public /* synthetic */ K A(int i) {
        return B(i, null);
    }

    public K B(int i, String str) {
        hb.l.a(i);
        return new hb.k(this, i, str);
    }

    public i.b get(i.c cVar) {
        return f.a.a(this, cVar);
    }

    public Ga.i minusKey(i.c cVar) {
        return f.a.b(this, cVar);
    }

    public final Ga.e s(Ga.e eVar) {
        return new hb.h(this, eVar);
    }

    public final void t(Ga.e eVar) {
        kotlin.jvm.internal.t.e(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((hb.h) eVar).s();
    }

    public String toString() {
        return T.a(this) + '@' + T.b(this);
    }

    public abstract void x(Ga.i iVar, Runnable runnable);

    public void y(Ga.i iVar, Runnable runnable) {
        x(iVar, runnable);
    }

    public boolean z(Ga.i iVar) {
        return true;
    }
}
