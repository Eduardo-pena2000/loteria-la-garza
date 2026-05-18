package androidx.compose.ui.semantics;

import O0.Y;
import P0.N0;
import Qa.l;
import W0.c;
import W0.m;
import W0.r;
import W0.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class ClearAndSetSemanticsElement extends Y implements r {
    public final l b;

    public ClearAndSetSemanticsElement(l lVar) {
        this.b = lVar;
    }

    public m c() {
        m mVar = new m();
        mVar.s(false);
        mVar.r(true);
        this.b.invoke(mVar);
        return mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && this.b == ((ClearAndSetSemanticsElement) obj).b;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c create() {
        return new c(false, true, this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(c cVar) {
        cVar.F1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("clearAndSetSemantics");
        s.a(n0, c());
    }
}
