package s0;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import v0.E1;
import v0.a1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p {
    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, float f, E1 e1, boolean z, long j, long j2) {
        return (n1.h.f(f, n1.h.g((float) 0)) > 0 || z) ? eVar.then(new ShadowGraphicsLayerElement(f, e1, z, j, j2, null)) : eVar;
    }

    public static /* synthetic */ androidx.compose.ui.e b(androidx.compose.ui.e eVar, float f, E1 e1, boolean z, long j, long j2, int i, Object obj) {
        boolean z2;
        E1 a = (i & 2) != 0 ? t1.a() : e1;
        if ((i & 4) != 0) {
            z2 = false;
            if (n1.h.f(f, n1.h.g(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return a(eVar, f, a, z2, (i & 8) != 0 ? a1.a() : j, (i & 16) != 0 ? a1.a() : j2);
    }
}
