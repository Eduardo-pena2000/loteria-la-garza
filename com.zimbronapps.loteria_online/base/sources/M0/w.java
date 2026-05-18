package M0;

import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w extends e.c implements O0.E {
    public Qa.q a;

    public w(Qa.q qVar) {
        this.a = qVar;
    }

    public final void E1(Qa.q qVar) {
        this.a = qVar;
    }

    public C measure-3p2s80s(androidx.compose.ui.layout.l lVar, A a, long j) {
        return (C) this.a.invoke(lVar, a, n1.b.a(j));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.a + ')';
    }
}
