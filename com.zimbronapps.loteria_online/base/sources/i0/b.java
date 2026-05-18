package I0;

import P0.r1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface b extends n1.d {
    static /* synthetic */ Object m0(b bVar, s sVar, Ga.e eVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
        if ((i & 1) != 0) {
            sVar = s.b;
        }
        return bVar.n0(sVar, eVar);
    }

    q H0();

    Object O(long j, Qa.p pVar, Ga.e eVar);

    Object Q0(long j, Qa.p pVar, Ga.e eVar);

    long a();

    r1 getViewConfiguration();

    Object n0(s sVar, Ga.e eVar);

    long o0();
}
