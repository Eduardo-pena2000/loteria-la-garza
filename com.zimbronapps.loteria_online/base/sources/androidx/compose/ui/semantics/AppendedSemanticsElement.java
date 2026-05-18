package androidx.compose.ui.semantics;

import O0.Y;
import P0.N0;
import Qa.l;
import W0.c;
import W0.m;
import W0.r;
import W0.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class AppendedSemanticsElement extends Y implements r {
    public final boolean b;
    public final l c;

    public AppendedSemanticsElement(boolean z, l lVar) {
        this.b = z;
        this.c = lVar;
    }

    public m c() {
        m mVar = new m();
        mVar.s(this.b);
        this.c.invoke(mVar);
        return mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.b == appendedSemanticsElement.b && this.c == appendedSemanticsElement.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c create() {
        return new c(this.b, false, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(c cVar) {
        cVar.E1(this.b);
        cVar.F1(this.c);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.b) * 31) + this.c.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("semantics");
        n0.b().c("mergeDescendants", Boolean.valueOf(this.b));
        s.a(n0, c());
    }
}
