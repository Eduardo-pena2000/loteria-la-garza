package androidx.compose.foundation.layout;

import F.x;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class HorizontalAlignElement extends Y {
    public final e.b b;

    public HorizontalAlignElement(e.b bVar) {
        this.b = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return t.c(this.b, horizontalAlignElement.b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public x create() {
        return new x(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(x xVar) {
        xVar.F1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("align");
        n0.e(this.b);
    }
}
