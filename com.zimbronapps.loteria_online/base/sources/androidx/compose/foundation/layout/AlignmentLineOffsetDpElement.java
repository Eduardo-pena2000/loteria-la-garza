package androidx.compose.foundation.layout;

import O0.Y;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class AlignmentLineOffsetDpElement extends Y {
    public final M0.a b;
    public final float c;
    public final float d;
    public final l e;

    public /* synthetic */ AlignmentLineOffsetDpElement(M0.a aVar, float f, float f2, l lVar, k kVar) {
        this(aVar, f, f2, lVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = obj instanceof AlignmentLineOffsetDpElement ? (AlignmentLineOffsetDpElement) obj : null;
        if (alignmentLineOffsetDpElement == null) {
            return false;
        }
        return t.c(this.b, alignmentLineOffsetDpElement.b) && h.i(this.c, alignmentLineOffsetDpElement.c) && h.i(this.d, alignmentLineOffsetDpElement.d);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public F.a create() {
        return new F.a(this.b, this.c, this.d, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(F.a aVar) {
        aVar.F1(this.b);
        aVar.G1(this.c);
        aVar.E1(this.d);
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + h.k(this.c)) * 31) + h.k(this.d);
    }

    public void inspectableProperties(N0 n0) {
        this.e.invoke(n0);
    }

    public AlignmentLineOffsetDpElement(M0.a aVar, float f, float f2, l lVar) {
        this.b = aVar;
        this.c = f;
        this.d = f2;
        this.e = lVar;
        if ((f < 0.0f && !h.i(f, h.b.c())) || (f2 < 0.0f && !h.i(f2, h.b.c()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }
}
