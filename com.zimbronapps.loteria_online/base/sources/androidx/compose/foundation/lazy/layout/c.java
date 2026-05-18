package androidx.compose.foundation.lazy.layout;

import I.D;
import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {
    public static final long a = n1.c.b(0, 0, 0, 0, 5, null);

    public static final /* synthetic */ long a() {
        return a;
    }

    public static final e b(e eVar, D d) {
        e then;
        return (d == null || (then = eVar.then(new TraversablePrefetchStateModifierElement(d))) == null) ? eVar : then;
    }
}
