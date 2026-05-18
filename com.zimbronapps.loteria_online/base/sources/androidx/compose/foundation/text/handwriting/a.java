package androidx.compose.foundation.text.handwriting;

import O.c;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final float a = h.g(40);
    public static final float b = h.g(10);

    public static final float a() {
        return b;
    }

    public static final float b() {
        return a;
    }

    public static final e c(e eVar, boolean z, Qa.a aVar) {
        return (z && c.a()) ? f.j(eVar.then(new StylusHandwritingElementWithNegativePadding(aVar)), b, a) : eVar;
    }
}
