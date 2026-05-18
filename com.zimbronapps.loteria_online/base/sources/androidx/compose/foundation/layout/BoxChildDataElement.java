package androidx.compose.foundation.layout;

import O0.Y;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class BoxChildDataElement extends Y {
    public final o0.e b;
    public final boolean c;
    public final l d;

    public BoxChildDataElement(o0.e eVar, boolean z, l lVar) {
        this.b = eVar;
        this.c = z;
        this.d = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        if (boxChildDataElement == null) {
            return false;
        }
        return t.c(this.b, boxChildDataElement.b) && this.c == boxChildDataElement.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public F.e create() {
        return new F.e(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(F.e eVar) {
        eVar.H1(this.b);
        eVar.I1(this.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + Boolean.hashCode(this.c);
    }

    public void inspectableProperties(N0 n0) {
        this.d.invoke(n0);
    }
}
