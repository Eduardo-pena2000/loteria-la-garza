package l1;

import Z0.K0;
import v0.h0;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class m {
    public static final /* synthetic */ float a(float f, Qa.a aVar) {
        return d(f, aVar);
    }

    public static final p b(p pVar, p pVar2, float f) {
        boolean z = pVar instanceof c;
        if (!z && !(pVar2 instanceof c)) {
            return p.a.b(s0.i(pVar.e(), pVar2.e(), f));
        }
        if (!z || !(pVar2 instanceof c)) {
            return (p) K0.d(pVar, pVar2, f);
        }
        c cVar = (c) pVar;
        c cVar2 = (c) pVar2;
        return p.a.a((h0) K0.d(cVar.l(), cVar2.l(), f), p1.b.b(cVar.a(), cVar2.a(), f));
    }

    public static final long c(long j, float f) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : r0.q(j, r0.t(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final float d(float f, Qa.a aVar) {
        return Float.isNaN(f) ? ((Number) aVar.invoke()).floatValue() : f;
    }
}
