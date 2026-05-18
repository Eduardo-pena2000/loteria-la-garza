package fb;

import cb.B0;
import gb.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class k {
    public static final e a(e eVar, int i, eb.a aVar) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        }
        if (i == -1 && aVar != eb.a.a) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i == -1) {
            aVar = eb.a.b;
            i = 0;
        }
        int i2 = i;
        eb.a aVar2 = aVar;
        return eVar instanceof gb.p ? p.a.a((gb.p) eVar, null, i2, aVar2, 1, null) : new gb.h(eVar, null, i2, aVar2, 2, null);
    }

    public static /* synthetic */ e b(e eVar, int i, eb.a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            aVar = eb.a.a;
        }
        return g.c(eVar, i, aVar);
    }

    public static final void c(Ga.i iVar) {
        if (iVar.get(B0.P8) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar).toString());
    }

    public static final e d(e eVar) {
        return g.d(eVar, -1, null, 2, null);
    }

    public static final e e(e eVar, Ga.i iVar) {
        c(iVar);
        return kotlin.jvm.internal.t.c(iVar, Ga.j.a) ? eVar : eVar instanceof gb.p ? p.a.a((gb.p) eVar, iVar, 0, null, 6, null) : new gb.h(eVar, iVar, 0, null, 12, null);
    }
}
