package androidx.compose.ui.draw;

import A0.c;
import M0.f;
import androidx.compose.ui.e;
import androidx.compose.ui.graphics.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final e a(e eVar, c cVar, boolean z, o0.e eVar2, f fVar, float f, d dVar) {
        return eVar.then(new PainterElement(cVar, z, eVar2, fVar, f, dVar));
    }

    public static /* synthetic */ e b(e eVar, c cVar, boolean z, o0.e eVar2, f fVar, float f, d dVar, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 4) != 0) {
            eVar2 = o0.e.a.e();
        }
        o0.e eVar3 = eVar2;
        if ((i & 8) != 0) {
            fVar = f.a.c();
        }
        f fVar2 = fVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i & 32) != 0) {
            dVar = null;
        }
        return a(eVar, cVar, z2, eVar3, fVar2, f2, dVar);
    }
}
