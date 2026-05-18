package I0;

import I0.Q;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w extends f {
    public final String d;

    public w(x xVar, boolean z) {
        super(xVar, z, null, 4, null);
        this.d = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    public void G1(x xVar) {
        z N1 = N1();
        if (N1 != null) {
            N1.a(xVar);
        }
    }

    public boolean O1(int i) {
        Q.a aVar = Q.a;
        return (Q.g(i, aVar.c()) || Q.g(i, aVar.a())) ? false : true;
    }

    /* renamed from: T1, reason: merged with bridge method [inline-methods] */
    public String B() {
        return this.d;
    }
}
