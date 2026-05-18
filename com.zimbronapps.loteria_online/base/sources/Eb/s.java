package eb;

import Ca.I;
import eb.k;
import kotlin.jvm.internal.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class s extends e {
    public final int m;
    public final a n;

    public s(int i, a aVar, Qa.l lVar) {
        super(i, lVar);
        this.m = i;
        this.n = aVar;
        if (aVar == a.a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + P.b(e.class).e() + " instead").toString());
        }
        if (i >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
    }

    public static /* synthetic */ Object s1(s sVar, Object obj, Ga.e eVar) {
        hb.P c;
        Object u1 = sVar.u1(obj, true);
        if (!(u1 instanceof k.a)) {
            return I.a;
        }
        k.e(u1);
        Qa.l lVar = sVar.b;
        if (lVar == null || (c = hb.w.c(lVar, obj, null, 2, null)) == null) {
            throw sVar.k0();
        }
        Ca.g.a(c, sVar.k0());
        throw c;
    }

    public Object e(Object obj, Ga.e eVar) {
        return s1(this, obj, eVar);
    }

    public Object i(Object obj) {
        return u1(obj, false);
    }

    public final Object t1(Object obj, boolean z) {
        Qa.l lVar;
        hb.P c;
        Object i = super.i(obj);
        if (k.i(i) || k.h(i)) {
            return i;
        }
        if (!z || (lVar = this.b) == null || (c = hb.w.c(lVar, obj, null, 2, null)) == null) {
            return k.b.c(I.a);
        }
        throw c;
    }

    public final Object u1(Object obj, boolean z) {
        return this.n == a.c ? t1(obj, z) : i1(obj);
    }

    public boolean y0() {
        return this.n == a.b;
    }
}
