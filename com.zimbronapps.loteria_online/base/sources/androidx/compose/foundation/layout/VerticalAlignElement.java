package androidx.compose.foundation.layout;

import F.d0;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class VerticalAlignElement extends Y {
    public final e.c b;

    public VerticalAlignElement(e.c cVar) {
        this.b = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return t.c(this.b, verticalAlignElement.b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public d0 create() {
        return new d0(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(d0 d0Var) {
        d0Var.F1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("align");
        n0.e(this.b);
    }
}
