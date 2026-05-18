package androidx.compose.foundation;

import A.E;
import E.m;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class FocusableElement extends Y {
    public final m b;

    public FocusableElement(m mVar) {
        this.b = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusableElement) && t.c(this.b, ((FocusableElement) obj).b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public E create() {
        return new E(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(E e) {
        e.K1(this.b);
    }

    public int hashCode() {
        m mVar = this.b;
        if (mVar != null) {
            return mVar.hashCode();
        }
        return 0;
    }

    public void inspectableProperties(N0 n0) {
        n0.d("focusable");
        n0.b().c("enabled", Boolean.TRUE);
        n0.b().c("interactionSource", this.b);
    }
}
