package androidx.compose.ui.layout;

import Da.S;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface l extends M0.m {
    static /* synthetic */ M0.C O0(l lVar, int i, int i2, Map map, Qa.l lVar2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = S.h();
        }
        return lVar.f0(i, i2, map, lVar2);
    }

    static /* synthetic */ M0.C j0(l lVar, int i, int i2, Map map, Qa.l lVar2, Qa.l lVar3, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if ((i3 & 4) != 0) {
            map = S.h();
        }
        Map map2 = map;
        if ((i3 & 8) != 0) {
            lVar2 = null;
        }
        return lVar.h1(i, i2, map2, lVar2, lVar3);
    }

    default M0.C f0(int i, int i2, Map map, Qa.l lVar) {
        return h1(i, i2, map, null, lVar);
    }

    M0.C h1(int i, int i2, Map map, Qa.l lVar, Qa.l lVar2);
}
