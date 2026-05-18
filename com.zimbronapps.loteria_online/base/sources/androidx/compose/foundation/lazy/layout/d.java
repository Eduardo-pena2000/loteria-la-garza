package androidx.compose.foundation.lazy.layout;

import C.q;
import I.E;
import androidx.compose.ui.e;
import b0.m;
import b0.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final float a(int i, int i2, boolean z) {
        return z ? b(i, i2) + 100 : b(i, i2);
    }

    public static final float b(int i, int i2) {
        return i2 + (i * 500);
    }

    public static final e c(e eVar, Qa.a aVar, E e, q qVar, boolean z, boolean z2, m mVar, int i) {
        if (w.L()) {
            w.U(1070136913, i, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        e then = eVar.then(new LazyLayoutSemanticsModifier(aVar, e, qVar, z, z2));
        if (w.L()) {
            w.T();
        }
        return then;
    }
}
