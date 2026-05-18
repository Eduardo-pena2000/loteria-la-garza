package androidx.compose.foundation.text.handwriting;

import O.b;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class StylusHandwritingElementWithNegativePadding extends Y {
    public final Qa.a b;

    public StylusHandwritingElementWithNegativePadding(Qa.a aVar) {
        this.b = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StylusHandwritingElementWithNegativePadding) && t.c(this.b, ((StylusHandwritingElementWithNegativePadding) obj).b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public b create() {
        return new b(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(b bVar) {
        bVar.M1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("stylusHandwriting");
        n0.b().c("onHandwritingSlopExceeded", this.b);
    }

    public String toString() {
        return "StylusHandwritingElementWithNegativePadding(onHandwritingSlopExceeded=" + this.b + ')';
    }
}
